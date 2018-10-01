/**
 * Inheritance Driver class.
 * @author jddevaughnbrown
 *
 */
public class InheritanceDriver {

    /**
     * The main driver method.
     * @param args - arguments to the main method
     */
    public static void main(String[] args) {

        OurArea area = new OurArea(2);

        // Use our area, and show the window.
        Window window = new Window("Inheritance Lecture");

        window.add(area);
        window.setVisible(true);
    }

}
