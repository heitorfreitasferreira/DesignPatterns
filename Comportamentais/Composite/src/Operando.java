public class Operando implements ExpressaoAritmetica {
    private Number conteudo;
    public Operando(Number conteudo) {
        this.conteudo = conteudo;
    }
    public Number operacao() {
        return conteudo;
    }
}
