package ifpb.ads.aula.calculadora.jse;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;

/**
 *
 * @author Ricardo Job
 */
public class ServiceLocator {

    protected <T> T lookup(String recurso, Class<T> tipo) {
        try {
            Properties props = new Properties();
            props.setProperty("org.omg.CORBA.ORBInitialHost", "0.0.0.0");
            props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            props.put(Context.INITIAL_CONTEXT_FACTORY,
                    "com.sun.enterprise.naming.SerialInitContextFactory");
//            props.setProperty(Context.URL_PKG_PREFIXES, 
//                    "com.sun.enterprise.naming");
//            props.setProperty(Context.STATE_FACTORIES,
//                    "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
//            props.put(Context.SECURITY_PROTOCOL, "ssl");

//            props.put(Context.SECURITY_AUTHENTICATION, "simple");
//            props.put(Context.SECURITY_PRINCIPAL, "admin");
//            props.put(Context.SECURITY_CREDENTIALS, "admin");

            InitialContext context = new InitialContext(props);
//            NamingEnumeration<NameClassPair> list2 = context.list(context.getNameInNamespace());
//            while (list2.hasMore()) {
//                System.out.println(list2.next());
//            }



            return (T) context.lookup(recurso);
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            ne.printStackTrace();
            throw new RuntimeException(ne);
        }
    }

}
