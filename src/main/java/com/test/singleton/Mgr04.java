package com.test.singleton;

/**
 * 懒汉式 lazy loading
 * 按需初始化，但有线程安全问题
 * synchronized解决，但效率有所下降
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;
    private Mgr04(){

    }
    public static synchronized Mgr04 getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
