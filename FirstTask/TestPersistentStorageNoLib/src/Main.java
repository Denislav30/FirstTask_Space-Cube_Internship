public class Main {
    public static void main(String[] args) {
        PersistentStorageNoLib storage = new PersistentStorageNoLib();

        storage.put("Varna", 9000);
        storage.put("Burgas", 8000);

        System.out.println("Varna zip code: " + storage.get("Varna"));
        System.out.println("Is there Burgas zip code in the map? " + storage.containsKey("Burgas"));



    }
}