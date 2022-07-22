package Strategy;

public class Context {
    private StrategyInterface strategy;
    public Context(StrategyInterface strategy) {
        setStrategy(strategy);
    }
    public void setStrategy(StrategyInterface strategy) {
        this.strategy = strategy;
    }
    public void run(){
        //Se o algoritmo N tiver um retorno, run retornar a execução deste algoritmo N
        /*return*/ strategy.execute();
    }
}
