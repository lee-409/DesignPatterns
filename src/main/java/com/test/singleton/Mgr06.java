package com.test.singleton;

/**
 * 懒汉式 优化
 * 按需初始化，但有线程安全问题
 * synchronized解决，效率有所下降
 * 双重检查，解决线程安全问题
 */
public class Mgr06 {
    private static Mgr06 INSTANCE;
    private Mgr06(){

    }
    public static Mgr06 getInstance(){
        //双重检查，解决线程安全问题
        if (INSTANCE == null){
            synchronized(Mgr06.class){
                if (INSTANCE == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr06();
                }

            }

        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }
}
