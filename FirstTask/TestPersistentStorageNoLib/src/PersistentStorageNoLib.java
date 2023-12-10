import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersistentStorageNoLib {
    private static final String FILE = "Persistent_StorageNoLib.txt";
    private Map<String, String> storage;

    public PersistentStorageNoLib() {
        storage = new HashMap<>();
        load();
    }

    public void put(String key, Object value) {
        storage.put(key, value.toString());
        save();
    }

    public Object get(String key) {
        return storage.get(key);
    }

    public boolean contains(String key) {
        return storage.containsKey(key);
    }

    public boolean remove(String key) {
        if (contains(key)) {
            storage.remove(key);
            save();
            return true;
        }
        return false;
    }

    private void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = splitKeyValue(line);
                if (parts.length == 2) {
                    storage.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {

        }
    }

    private void save() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE))) {
            for (Map.Entry<String, String> entry : storage.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String[] splitKeyValue(String line) {
        int separatorIndex = line.indexOf('=');
        if (separatorIndex != -1) {
            String key = line.substring(0, separatorIndex);
            String value = line.substring(separatorIndex + 1);
            return new String[]{key, value};
        }
        return new String[]{};
    }

    public boolean containsKey(String key) {
        return storage.keySet().contains(key);
    }

    public Set<String> keySet() {
        return storage.keySet();
    }

}
