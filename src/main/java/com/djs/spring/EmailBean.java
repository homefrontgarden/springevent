package com.djs.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class EmailBean implements ApplicationContextAware {
    private List<String> blackList;
    private ApplicationContext ctx;
    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
    public void sendEmail(String address) {
        if (blackList.contains(address)) {
            BlackListEvent event = new BlackListEvent(address);
            ctx.publishEvent(event);
            return;
        }
    }
}
