//package com.young.photoshare.config;
//
//import net.bull.javamelody.MonitoringFilter;
//import net.bull.javamelody.SessionListener;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Java Melody 应用监控配置类
// */
//@Configuration
//public class JavaMelodyConfiguration {
//
//    @Bean
//    public FilterRegistrationBean monitorFilter() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MonitoringFilter());
//        filterRegistrationBean.addUrlPatterns("/*");
//        return filterRegistrationBean;
//    }
//
//    @Bean
//    public ServletListenerRegistrationBean sessionListener() {
//        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
//        servletListenerRegistrationBean.setListener(new SessionListener());
//        return servletListenerRegistrationBean;
//    }
//
//}
