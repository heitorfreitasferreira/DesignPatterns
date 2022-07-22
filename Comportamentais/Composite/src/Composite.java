public class Composite implements Component{
    private Component element;
    //---------------------------------
    public void doThis() {
        System.out.println("Composite.doThis()");
    }
    public void add(Component c) {
        System.out.println("Composite.add()");
    }
}
