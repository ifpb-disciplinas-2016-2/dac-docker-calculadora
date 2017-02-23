package ifpb.ads.aula.calculadora.core;

import ifpb.ads.aula.calculadora.shared.Calculator;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/02/2017, 07:30:28
 */
@Stateless
//@Local(OutraCalculadora.class)
@Remote({Calculator.class, OutraCalculadora.class})
public class CalculatorSimple implements Calculator,
        OutraCalculadora {

    @EJB
    private CalculadoraSimples calc;

    @Override
    public int somar(int a, int b) {
        return calc.somar(a, b);
    }

    @Override
    public String nome() {
        return toString();
    }

    @Override
    public int mult(int a, int b) {
        return a * b;
    }

}
