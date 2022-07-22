import Strategy.Context;
import Strategy.Concretes.*;

public class App {
    public static void main(String[] args) throws Exception {
        Context context = new Context(new Algorithm1());
        context.run();
        context.setStrategy(new Algorithm2());
        context.run();
    }
}
