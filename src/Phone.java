import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Phone {

    abstract void call(String phoneNumber);

    abstract void sendSms(String phoneNumber, String message);

    abstract void addContact(String s, String phone_number, String fist_name, String last_name);

    abstract String listContacts();

    abstract String viewHistory();

    Map<String, List<String>> messages = new HashMap<>();

    static String OS;
    static String countryOfIssue;
    private String color;
    private String material;
    String contacts = "";
    String history = "";
    int batteryLife = 30;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    String IMEI = null;
    public String MANUFACTURER;

    public static String getOS() {
        return OS;
    }

    public static void setOS(String OS) {
        Phone.OS = OS;
    }

    public static String getCountryOfIssue() {
        return countryOfIssue;
    }

    public static void setCountryOfIssue(String countryOfIssue) {
        Phone.countryOfIssue = countryOfIssue;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getMANUFACTURER() {
        return MANUFACTURER;
    }

    public void setMANUFACTURER(String MANUFACTURER) {
        this.MANUFACTURER = MANUFACTURER;

    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void addMessageForPhoneNumber(String phoneNumber, String message) {
        List<String> list = new ArrayList<>();
        if (!messages.containsKey(phoneNumber)) {
            messages.put(phoneNumber, list);
        }
        messages.get(phoneNumber).add(message);
    }

    public List<String> listMessages(String phoneNumber) {
        if (!messages.containsKey(phoneNumber)) {
            return new ArrayList<>();
        } else {
           return messages.get(phoneNumber);
        }
    }
}
