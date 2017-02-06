package ifpb.ads.aula.calculadora.core;

import ifpb.ads.aula.calculadora.shared.Calculator;
import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/02/2017, 07:30:28
 */
@Stateless
@Remote(Calculator.class)
public class CalculatorSimple implements Calculator {

    @Override
    public int somar(int a, int b) {
        return a + b;
    }

    @Override
    public String nome() {
        return toString();
    }

}
