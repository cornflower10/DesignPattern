package com.design.pattern.singleinstance;

public class SingleInstance {

    private  volatile   static SingleInstance singleInstance = null;
    private SingleInstance(){

    }

    public SingleInstance getInstance(){
        if(null==singleInstance){
            synchronized (SingleInstance.class){
                if(null==singleInstance){
                    singleInstance = new SingleInstance();
                }
            }
        }
        return singleInstance;
    }
}
