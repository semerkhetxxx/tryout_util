package idv.tryout.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TryoutServiceFactory {
    
    //private static final String CONTEXT_NAME = "spring-tryout-ctx.xml";
    private static final String CONTEXT_NAME = "spring-hikari-ctx.xml";
    private static ApplicationContext beans = null;

    static {
        if (beans == null) {
            beans = new ClassPathXmlApplicationContext(CONTEXT_NAME);
        }
    }
    
    public TryoutServiceFactory() {
    }

    public static TryoutService getService() {
        return (TryoutService) beans.getBean("tryoutService");
    }

}
