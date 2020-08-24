package com.djs.spring;

import org.springframework.context.ApplicationEvent;

/**
 * 事件类
 */
public class BlackListEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1000L;
    private String address;
    public String getAddress() {
        return address;
    }
    public BlackListEvent(String address) {
        super(address);
        this.address = address;
    }
}
