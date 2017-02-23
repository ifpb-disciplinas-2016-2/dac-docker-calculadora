package ifpb.ads.aula.calculadora.core;

import ifpb.ads.aula.calculadora.shared.Calculator;
import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 08/02/2017, 08:35:07
 */
@Stateless 
//no interface
//Local 
// EJB 3.1 Local View 
public class CalculadoraSimples {

    public int   somar(int a, int b) {
        return a + b;
    }
}
