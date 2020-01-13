package com.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

    private Object object;

    public MyInvocationHandler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("MyInvocationHandler invoke begin");
        System.out.println("proxy:"+proxy.getClass().getName());
        System.out.println("method:" + method.getName());
        for(Object o: args){
            System.out.println("arg:"+o);
        }
        method.invoke(object,args);
        System.out.println("MyInvocationHandler invoke end");
        return null;
    }

    public static void main(String[] args) {

        Student s = new Student();

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaces = s.getClass().getInterfaces();
        MyInvocationHandler h = new MyInvocationHandler(s);
        Person proxy = (Person) Proxy.newProxyInstance(loader,interfaces,h);

        proxy.sayHello("yujie.wang",20);
        proxy.sayGoodBye(true,100);
        System.out.println("end");


    }
}


