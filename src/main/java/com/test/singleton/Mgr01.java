package com.test.singleton;

/**
 * ����ʽ
 * ����ص��ڴ�󣬾�ʵ����һ��������jvm��֤�̰߳�ȫ
 * ��ʵ��
 * ȱ�㣺�����õ������װ��ʱ�����ʵ����
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();
    private Mgr01(){

    }
    public static Mgr01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getInstance();
        Mgr01 mgr02 = Mgr01.getInstance();
        System.out.println(mgr01.equals(mgr02));
    }
}
