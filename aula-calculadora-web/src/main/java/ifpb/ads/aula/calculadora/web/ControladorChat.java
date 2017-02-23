package ifpb.ads.aula.calculadora.web;

import ifpb.ads.aula.calculadora.shared.Chat;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 19/02/2017, 10:58:23
 */
@Named
@RequestScoped
public class ControladorChat {

    @EJB
    private Chat chat;
    private String mensagem;

    public String nova() {
        this.chat.novaMensagem(mensagem);
        this.mensagem = "";
        return null;
    }

    public List<String> getHistorico() {
        return this.chat.historico();
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
