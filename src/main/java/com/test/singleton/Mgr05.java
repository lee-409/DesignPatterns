package com.test.singleton;

/**
 * ����ʽ �Ż�
 * �����ʼ���������̰߳�ȫ����
 * synchronized�����Ч�������½�
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;
    private Mgr05(){

    }
    public static Mgr05 getInstance(){
        if (INSTANCE == null){
            //��ͼͨ����Сͬ�������ķ�ʽ����Ч�ʣ�Ȼ��������
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
