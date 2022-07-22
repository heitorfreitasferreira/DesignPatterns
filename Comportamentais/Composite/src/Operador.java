public abstract class Operador implements ExpressaoAritmetica {
    protected ExpressaoAritmetica esquerda;
    protected ExpressaoAritmetica direita;
    public Operador(ExpressaoAritmetica esquerda, ExpressaoAritmetica direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }
    public ExpressaoAritmetica getEsquerda() {
        return esquerda;
    }
    public ExpressaoAritmetica getDireita() {
        return direita;
    }
}
