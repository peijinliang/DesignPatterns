package com.design.patterns.proxy;

public class ProxySubject implements ISubject {

    private ISubject subject;

    public ProxySubject(ISubject subject) {
        this.subject = subject;
    }

    public void broke() {
        System.out.println("֩���������Ŷ��룡");
    }

    @Override
    public void save() {   //���˲���
        broke();
        this.subject.save();
        getPraise();
    }

    public void getPraise() {  //�������
        System.out.println("֩��������ѡ2018��ţ�����");
    }

}
