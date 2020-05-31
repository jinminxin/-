package lifegame;

public class Methods {
	 public Methods() {
	    }

	    //�÷����������λ�ã������ض�Ӧλ�õ�point����
	    //��point���飬��¼��Ӧλ����һ�ֵ�״̬��1��һ������2��һ�������3��һ������
	    public int[] check(String[][] lifeMap) {

	        int n = 0;
	        int point[] = new int[16];
	        //ͳ����Χ�ھӵ����
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {

	                /*
	                �������£������ж�
	                   	           �� 1��һ���˿�����8���ھӣ�
	                   	           �� 2��һ������ֻ��һ���ھӣ�����һ����¶�����ȥ��
	                    	��3������2��3���ھӣ�����һ����Ȼ���ţ�
	          				��4���������������һ������ȥ��
	                    	��5����ȥ��������3���ھӣ�����һ���Ḵ�
	                    	��6�����е���ȥ�򸴻����һ���仯ʱͬʱ������
	                */

	                //��life������¼��Χ���ŵ��ھӸ���
	                int life = 0;

	                //1.�ж����·���λ��
	                if (i + 1 < 4 && lifeMap[i + 1][j].equals("��")) {
	                    life++;
	                }

	                //2.�ж�����λ��
	                if (i + 1 < 4 && j + 1 < 4 && lifeMap[i + 1][j + 1].equals("��")) {
	                    life++;
	                }

	                //3.�ж�����λ��
	                if (i + 1 < 4 && j - 1 >= 0 && lifeMap[i + 1][j - 1].equals("��")) {
	                    life++;
	                }

	                //4.�ж��Ҳ�λ��
	                if (j + 1 < 4 && lifeMap[i][j + 1].equals("��")) {
	                    life++;
	                }

	                //5.�ж����λ��
	                if (j - 1 >= 0 && lifeMap[i][j - 1].equals("��")) {
	                    life++;
	                }

	                //6.�ж����Ϸ�λ��
	                if (i - 1 >= 0 && lifeMap[i - 1][j].equals("��")) {
	                    life++;
	                }

	                //7.�ж�����λ��
	                if (i - 1 >= 0 && j + 1 < 4 && lifeMap[i - 1][j + 1].equals("��")) {
	                    life++;
	                }

	                //8.�ж�����λ��
	                if (i - 1 >= 0 && j - 1 >= 0 && lifeMap[i - 1][j - 1].equals("��")) {
	                    life++;
	                }

	                //��һ�����飬��¼��Ӧλ����һ�ֵ�״̬��1��һ������2��һ�������3��һ������
	                if (lifeMap[i][j].equals("��")) {
	                    if (life == 2 || life == 3)
	                        point[n] = 2;
	                    else
	                        point[n] = 1;
	                } else {
	                    if (life == 3)
	                        point[n] = 3;
	                }
	                n++;
	            }
	        }
	        return point;
	    }

	    public String[][] getNext(String[][] lifeMap, int[] point) {

	        int n = 0;
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {

	                //���״̬
	                if (point[n] == 1)
	                    lifeMap[i][j] = "��";
	                if (point[n] == 3)
	                    lifeMap[i][j] = "��";

	                n++;
	            }
	        }
	        return lifeMap;
	    }

	    public void printLifeMap(String[][] lifeMap){
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                if (j == 3)
	                    System.out.println(lifeMap[i][j] + " ");
	                else
	                    System.out.print(lifeMap[i][j] + " ");
	            }
	        }
	    }
}
