import Template.*;

public class App {
    public static void main(String[] args) throws Exception {
        TemplateInterface template1 = new TemplateConcrete1();
        TemplateInterface template2 = new TemplateConcrete2();
        TemplateInterface template3 = new TemplateConcrete3();

        template1.templateMethod();
        template2.templateMethod();
        template3.templateMethod();
    }
}