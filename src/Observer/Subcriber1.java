/**
 * @author Jamith Nimantha
 */
public class Subcriber1 implements Observer {

    public Subcriber1() {
    }

    @Override
    public void update(String s) {
        System.out.println("Subscriber1 :: " + s);
    }
}
