import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Phone phone = new SamsungGalaxy6();
        phone.addContact("1", "0755656533", "Patlagica", "Viorica");
        phone.addContact("2", "0789898989", "Costache", "Marioara");

        System.out.println("Battery life: " + phone.getBatteryLife() + " hours");

        phone.call("0789898989");

        System.out.println("Battery remaining: " + phone.getBatteryLife() + " hours");

        System.out.println(phone.listMessages("0755656533"));

        phone.sendSms("0755656533", "Salut, Sefu'!");
        phone.sendSms("0755656533", "Ca vas ?");

        System.out.println(phone.listMessages("0755656533"));

        System.out.println("Battery remaining: " + phone.getBatteryLife() + " hours");

//        phone.listContacts();
//        phone.viewHistory();

        System.out.println(phone.listContacts());
        System.out.println(phone.viewHistory());
    }
}
