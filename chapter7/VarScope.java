public class VarScope {
	public static void main(String[] args){

	}
}
class Cat {
	// ȫ�ֱ�����Ҳ�������ԣ�������Ϊ��������Cat�ࣺcry eat �ȷ���ʹ��
	// �����ڶ���ʱ���Ա�ֱ�Ӹ�ֵ

	//ȫ��������Ĭ��ֵ

	// ȫ�ֱ������Լ����η�---�ֲ��������ܼ����η�
	public int age = 10; //ָ����ֵΪ10
	public void cry(){
		//1.�ֲ�����һ����ָ�ڳ�Ա�����еı���
		// 2.n �� name ���Ǿֲ����� �����������cry������
		// public int n = 10; //�ֲ����������η��ᱨ��
		String name = "jack";
		System.out.println("��cry��ʹ������ age =" + age);

	}
	public void eat(){
		// �ֲ����������ʼ��֮�󣬲ſ���ʹ�ã���Ϊû��Ĭ��ֵ
		int num;

		System.out.println("��eat��ʹ������ eat" + num);//����
		// System.out.println("��eat��ʹ������ eat" + n);//����
	}
}