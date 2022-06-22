package com.test.singleton;

/**
 * ����ʽ �Ż�
 * �����ʼ���������̰߳�ȫ����
 * synchronized�����Ч�������½�
 * ˫�ؼ�飬����̰߳�ȫ����
 */
public class Mgr06 {
    private static Mgr06 INSTANCE;
    private Mgr06(){

    }
    public static Mgr06 getInstance(){
        //˫�ؼ�飬����̰߳�ȫ����
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
