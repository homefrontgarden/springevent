package com.djs.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 监听器类
 */
public class BlackListNotifier implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event);
        if (event instanceof BlackListEvent) {
            System.out.println(((BlackListEvent) event).getAddress());
            //TODO 处理这个邮件地址
        }
    }
}
