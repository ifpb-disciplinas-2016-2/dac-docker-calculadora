package ifpb.ads.aula.calculadora.jse;

import ifpb.ads.aula.calculadora.shared.Calculator;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/02/2017, 07:34:27
 */
public class Principal {

    public static void main(String[] args) {
        //java:global/aula-calculadora-core/CalculatorSimple
//        String recurso = "java:global/aula-calculadora-core/CalculatorSimple";
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
