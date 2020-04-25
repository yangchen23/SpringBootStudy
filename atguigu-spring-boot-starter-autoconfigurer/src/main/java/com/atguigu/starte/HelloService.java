package com.atguigu.starte;

public class HelloService {

    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHelloAtguigu(String name){
        return helloProperties.getPrefix()+"-" +name +
                helloProperties.getSuffix();
    }
}
