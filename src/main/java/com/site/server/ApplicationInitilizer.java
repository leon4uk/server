package com.site.server;


import com.site.server.config.SiteConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ApplicationInitilizer implements WebApplicationInitializer{

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SiteConfig.class);

        servletContext.addListener(new ContextLoaderListener(ctx));
    }
}
