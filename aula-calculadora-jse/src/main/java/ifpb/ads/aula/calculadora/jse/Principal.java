package ifpb.ads.aula.calculadora.jse;

import ifpb.ads.aula.calculadora.shared.Calculator;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/02/2017, 07:34:27
 */
public class Principal {
//docker inspect -f '{{range .NetworkSettings.Networks}}{{.IPAddress}}{{end}}' ejb
    //docker exec ejb cat /etc/hosts

    public static void main(String[] args) {
        //docker run -p 8080:8080 -p 1099:1099 -p 1098:1098 -p 3873:3873 -p 3700:3700 -p 4848:4848 -p 8181:8181 -p 8009:8009 -d  --name ejb ricardojob/ejb
//        String recurso = "java:global/aula-calculadora-core/CalculatorSimple";

        ServiceLocator locator = new ServiceLocator();
        String recurso = "java:global/aula-calculadora-core/CalculatorSimple!ifpb.ads.aula.calculadora.shared.Calculator";
//        for (int i = 0; i < 100; i++) {

//            new Thread(() -> {
        Calculator calc = locator.lookup(recurso, Calculator.class);
        System.out.println(calc.nome() + " - ");
//            System.out.println(calc.somar(3, i));
//            }).start();
//        }

    }
}
