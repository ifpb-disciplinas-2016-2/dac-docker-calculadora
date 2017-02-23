package ifpb.ads.aula.calculadora.core;

import ifpb.ads.aula.calculadora.shared.Chat;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 19/02/2017, 10:55:19
 */

@Singleton
@Startup
@Remote(Chat.class)
public class ChatDefault implements Chat {

    private final List<String> mensagens = new CopyOnWriteArrayList<>();

    @Override
    public void novaMensagem(String mensagem) {
        this.mensagens.add(mensagem);
    }

    @Override
    public List<String> historico() {
        return Collections.unmodifiableList(mensagens);
    }

}
