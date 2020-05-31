package lifegame;

import java.util.Random;
import java.util.Scanner;

    /*
        ��1������С��Ϸ���ھ�Ϊ�������Һ�б�Խ�һ���˸�λ��
        ��2��Ĭ��ѡ��4*4�ĸ���
        ��3����Ĭ�ϵĸ��ӳ�ʼ��������ӡ���
        ��4��ʹ��Methods�еķ���������һ�ֵ�״̬������ӡ
     */

public class LifeGame {
	public static void main(String[] args) {

	        //����һ����ά����洢���еĸ���
	        String[][] lifeMap = new String[4][4];

	        Methods me = new Methods();

	        //�����и��ӽ��г�ʼ�����룬��Ϊ0����Ϊ1
	        //������ɸ���λ�õ��ھ����
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {

	                int num = new Random().nextInt(2);
	                if (num == 1)
	                    lifeMap[i][j] = "��";
	                else if (num == 0)
	                    lifeMap[i][j] = "��";
	            }
	        }

	        //��ӡ���ӳ�ʼ״̬
	        System.out.println("��ʼ״̬Ϊ��");
	        me.printLifeMap(lifeMap);
	        System.out.println("===========");
	        
	        Scanner scan = new Scanner(System.in);
	        int n = 0;
	        int num = 0;//��¼�仯�Ĵ���
	        while (n == 0) {

	            //��point���飬��¼��Ӧλ����һ�ֵ�״̬��1��һ������2��һ�������3��һ������
	            int[] point = me.check(lifeMap);

	            //�������һ�α仯���ͼ��
	            lifeMap = me.getNext(lifeMap, point).clone();

	            System.out.println("��" + (++num) + "�α仯��");

	            //��ӡ����
	            me.printLifeMap(lifeMap);
	            System.out.println("===========");

	            System.out.println("����0����������һ�����������������˳���");
	            if(scan.hasNextInt()) {
	            	n = scan.nextInt();
	            }
	            else n = 1;
	        }
	        scan.close();
	    }
}



