/**
 * @author Jamith Nimantha
 */
public class Subcriber2 implements Observer {

    public Subcriber2() {

    }

    @Override
    public void update(String s) {
        System.out.println("Subscriber2 :: " + s);
    }
}
