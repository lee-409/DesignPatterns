package com.test.singleton;

/**
 * ��̬�ڲ��෽ʽ
 * jvm��֤����
 * �����ⲿ��ʱ��������ڲ��࣬ʵ��������
 */
public class Mgr07 {
    private Mgr07(){

    }
    private static class Mgr01Handler{
        private static final Mgr07 INSTANCE = new Mgr07();
    }
    public static Mgr07 getInstance(){
        return Mgr01Handler.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }
    }
}
