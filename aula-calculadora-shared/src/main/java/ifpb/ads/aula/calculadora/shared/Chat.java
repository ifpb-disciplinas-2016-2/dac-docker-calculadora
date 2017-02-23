package ifpb.ads.aula.calculadora.shared;

import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 19/02/2017, 10:53:58
 */
public interface Chat {

    public void novaMensagem(String mensagem);
    public List<String> historico();
}
