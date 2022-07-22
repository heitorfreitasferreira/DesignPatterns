package Template;

public abstract class TemplateInterface {
    public void templateMethod(){
        this.step1();
        this.step2();
        this.step3();
        this.step4();
    }
    protected abstract void step1();
    protected final void step2(){
        System.out.println("Operação concreta 1, implementado na TemplateInterface");
    }
    // A parte de ser protected é opcional, para o caso do passo ser imutavel
    // Se o usuário do template puder alterar o passo, deve ser protected sem final
    protected abstract void step3();
    protected void step4(){
        System.out.println("Operação concreta 2, implementado na TemplateInterface");
    }
}
