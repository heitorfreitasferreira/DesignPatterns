package Template;

public class TemplateConcrete2 extends TemplateInterface {
    protected void step1() {
        System.out.println("Operação concreta 1 do TemplateConcrete2 2");
    }
    protected void step3() {
        System.out.println("Operação concreta 3 do TemplateConcrete2 2");
    }
    protected void step4() {
        System.out.println("Operação concreta 4 do TemplateConcrete2 2, sobrescrevendo do TemplateInterface");
    }
}
