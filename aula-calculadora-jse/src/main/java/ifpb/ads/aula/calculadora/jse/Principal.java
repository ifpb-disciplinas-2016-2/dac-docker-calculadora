package ifpb.ads.aula.calculadora.jse;

import ifpb.ads.aula.calculadora.shared.Carrinho;
import ifpb.ads.aula.calculadora.shared.Chat;

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
//        String recurso = "java:global/aula-calculadora-core/CalculatorSimple!ifpb.ads.aula.calculadora.shared.Calculator";
//        String recurso = "java:global/aula-calculadora-core/CarrinhoDeCompra";
        String recurso = "ifpb.ads.aula.calculadora.shared.Chat#ifpb.ads.aula.calculadora.shared.Chat";

//        Carrinho carrinho = locator.lookup(recurso, Carrinho.class);
//        carrinho.adicionar("tv");
//        carrinho.adicionar("lapis");
//        carrinho.adicionar("caneta");
//        carrinho.remover("tv");
//        carrinho.finalizarCarrinho();
//        carrinho.listarTodos().forEach(System.out::println);
        
//        System.out.println(calc.nome() + " - ");
//            System.out.println(calc.somar(3, i));
//            }).start();
//        }


        Chat chat = locator.lookup(recurso, Chat.class);
        chat.historico().forEach(System.out::println);
        chat.novaMensagem("nova mensagem");
        chat.historico().forEach(System.out::println);
    }
}
