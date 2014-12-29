package com.berkgokden;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Map;

public class AppServletContextListener implements ServletContextListener{
    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        System.out.println("ServletContextListener destroyed");
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        System.out.println("ServletContextListener started");
        //new HazelcastServer().run();
        ApplicationContext ctx = new GenericXmlApplicationContext("beans.xml");
        Map map= (Map)ctx.getBean("usermap");
        User usr = new User("Enes", 29);
        map.put("id-134", usr);
        User usr2 = (User) map.get("id-134");
        System.out.println(usr2.getName());
    }
}