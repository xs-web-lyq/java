
public class FloatDetail{
	public static void main(String[] args) {
		// Java �ĸ����ͳ���������ֵ��Ĭ��Ϊdouble�ͣ�����float�ͳ�������Ҫ�ں����"f"��"F";
		// float num1 = 1.1;//������
		float num2 = 1.1f;
		double num3 = 1.1f;


		// ������ʹ������ 2.7 �� 8.1 / 3 �Ƚ�
		double num11 = 2.7;
		double num12 = 8.1 / 3;
		System.out.println(num11);//2.7
		System.out.println(num12);//2.6999999999999997
		// �õ�һ����Ҫ��ʹ�õ㣬�����Ƕ�������ΪС���Ľ�������ж�ʱ��ҪС��
		// Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ����Χ���ж�

		// ʹ��JAVA API 
		if(Math.abs(num11-num12) < 0.000001){
			System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ��ȡ�");
		}
		System.out.println(Math.abs(num11-num12));
	}
}