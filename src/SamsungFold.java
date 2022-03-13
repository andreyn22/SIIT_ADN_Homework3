public class SamsungFold extends Samsung {

    private static final String model= "Fold";

    @Override
    public String listContacts() {
        return "SamsungFold{" +
                "contacts='" + contacts + '\'' +
                '}';
    }
    @Override
    public String viewHistory() {
        return "SamsungFold{" +
                "calls='" + history + '\'' +
                '}';
    }
}
