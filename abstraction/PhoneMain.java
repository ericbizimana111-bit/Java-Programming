package abstraction;

public class PhoneMain {

    public static void main(String[] args) {
        // Samsung s = new Samsung();
        // Iphone p = new Iphone();

        PhoneService service = new PhoneService();

        Phone s = new Samsung();
        Phone p = new Iphone();

        service.makeCall(p);
        service.makeCall(s);

        // s.call();
        // p.call();

    }

}
