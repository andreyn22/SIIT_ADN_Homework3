public class IPhoneX extends IPhone {

    private static final String model = "IPhoneX";

    public String listContacts() {
        return "IPhoneX{" +
                "contacts='" + contacts + '\'' +
                '}';
    }

    public String viewHistory() {
        return "IPhoneX{" +
                "calls='" + history + '\'' +
                '}';
    }
}
