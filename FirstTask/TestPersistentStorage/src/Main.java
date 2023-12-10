public class Main {
    public static void main(String[] args) {

        PersistentStorage storage = new PersistentStorage();

        storage.put("Plovdiv", 4000);
        storage.put("Pleven", 5800);

        System.out.println("Plovdiv city zip code: " + storage.get("Plovdiv"));
        System.out.println("Is there a zip code in the map for Pleven city: " + storage.contains("Pleven"));

        System.out.println("Pleven city zip code: " + storage.get("Pleven"));

        storage.put("Sofia", 1000);
        System.out.println("Sofia city zip code: " + storage.get("Sofia"));

        storage.remove("Sofia");
        System.out.println("Is Sofia in the map? " + storage.contains("Sofia"));

    }
}