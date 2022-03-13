import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IPhone extends Phone {

    String iTunesVersion;

    public String getiTunesVersion() {
        return iTunesVersion;
    }

    public void setiTunesVersion(String iTunesVersion) {
        this.iTunesVersion = iTunesVersion;
    }

    @Override
    public void call(String phoneNumber) {
        if (batteryLife <= 0) {
            throw new RuntimeException("No battery, please recharge!");
        } else {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            this.history += "\n" + phoneNumber + " " + dtf.format(now);
            this.batteryLife -= 2;
        }
    }

    @Override
    public void sendSms(String phoneNumber, String message) {
        if (message.length() > 500) {
            throw new RuntimeException("Message length can have maximum 500 characters!");
        } else {
            if (batteryLife <= 0) {
                throw new RuntimeException("No battery, please recharge!");
            } else {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                this.history += "\n" + phoneNumber + " " + dtf.format(now);
                this.batteryLife -= 1;
                this.addMessageForPhoneNumber(phoneNumber, message);
            }
        }
    }

    @Override
    public void addContact(String index, String phone_number, String first_name, String last_name) {
        this.contacts += "\n" + index + ", " + phone_number + ", " + first_name + " " + last_name;
    }


    public String listContacts() {
        return "IPhone{" +
                "contacts='" + contacts + '\'' +
                '}';
    }

    public String viewHistory() {
        return "IPhone{" +
                "calls='" + history + '\'' +
                '}';
    }
}

