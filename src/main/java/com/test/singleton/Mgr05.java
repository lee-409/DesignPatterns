package com.test.singleton;

/**
 * 懒汉式 优化
 * 按需初始化，但有线程安全问题
 * synchronized解决，效率有所下降
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;
    private Mgr05(){

    }
    public static Mgr05 getInstance(){
        if (INSTANCE == null){
            //妄图通过缩小同步代码块的方式提升效率，然而不可行
            synchronized(Mgr05.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }

        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
