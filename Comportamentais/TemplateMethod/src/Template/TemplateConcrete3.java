package Template;

public class TemplateConcrete3 extends TemplateInterface {
    protected void step1() {
        System.out.println("Operação concreta 1 do TemplateConcrete3");
    }
    protected void step3() {
        System.out.println("Operação concreta 3 do TemplateConcrete3, nessa classe a implementação do step 4 será sobrescrita a apagando");
    }
    protected void step4() {
        
    }
}