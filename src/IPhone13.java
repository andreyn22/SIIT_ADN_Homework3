public class IPhone13 extends IPhone {

    private static final String model = "IPhone13";

    @Override
    public String listContacts() {
        return "IPhone13{" +
                "contacts='" + contacts + '\'' +
                '}';
    }

    @Override
    public String viewHistory() {
        return "IPhone13{" +
                "calls='" + history + '\'' +
                '}';
    }
}

// because implements interface called "phone" we must define/write the code for the methods from the interface
//     int batteryLife;