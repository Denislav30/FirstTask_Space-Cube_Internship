import java.io.*;
import java.util.Properties;

public class PersistentStorage {
    private static final String FILE = "persistent_storage.properties";
    private Properties properties;

    public PersistentStorage() {
        properties = new Properties();
        load();
    }

    public void put(String key, Object value) {
        properties.put(key, value.toString());
        save();
    }

    public Object get(String key) {
        return properties.get(key);
    }

    public boolean contains(String key) {
        return properties.containsKey(key);
    }

    public boolean remove(String key) {
        if (contains(key)) {
            properties.remove(key);
            save();
            return true;
        }
        return false;
    }

    private void load() {
        try (InputStream input = new FileInputStream(FILE)) {
            properties.load(input);
        } catch (IOException e) {

        }
    }

    private void save() {
        try (OutputStream output = new FileOutputStream(FILE)) {
            properties.store(output, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
