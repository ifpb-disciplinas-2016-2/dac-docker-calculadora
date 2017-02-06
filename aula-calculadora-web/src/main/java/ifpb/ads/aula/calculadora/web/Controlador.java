package ifpb.ads.aula.calculadora.web;


import ifpb.ads.aula.calculadora.shared.Calculator;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/02/2017, 09:34:26
 */
@Named
@RequestScoped
public class Controlador {

    public String getSomar() {
        ServiceLocator locator = new ServiceLocator();
        String recurso = "java:global/aula-calculadora-core/CalculatorSimple";

        Calculator calc = locator.lookup(recurso, Calculator.class);
        return calc.nome();
    }
}
