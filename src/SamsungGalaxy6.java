public class SamsungGalaxy6 extends Samsung {

    private static final String model= "Galaxy6";

    @Override
    public String listContacts() {
        return "SamsungGalaxy6{" +
                "contacts='" + contacts + '\'' +
                '}';
    }

    @Override
    public String viewHistory() {
        return "SamsungGalaxy6{" +
                "calls='" + history + '\'' +
                '}';
    }
}
