public class Soma extends Operador{
    public Soma(ExpressaoAritmetica esquerda, ExpressaoAritmetica direita) {
        super(esquerda, direita);
    }
    public Number operacao(){
        return esquerda.operacao() + direita.operacao();
    }
}