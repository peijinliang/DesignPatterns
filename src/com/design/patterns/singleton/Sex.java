package com.design.patterns.singleton;

/**
 * �������ģʽ
 * �Ѿ���ö�� �� ȡ��
 *
 */
public class Sex {

    public static final int MALE_CMD = 1;
    public static final int FEMALE_CMD = 2;

    private static final Sex MALE = new Sex("��");
    private static final Sex FEMALE = new Sex("Ů");

    private String title;

    private Sex(String title) {  //���췽������˽�л�
        this.title = title;
    }

    public static Sex getInstance(int ch) {
        switch (ch) {
            case MALE_CMD:
                return MALE;
            case FEMALE_CMD:
                return FEMALE;
            default:
                return null;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }

}
