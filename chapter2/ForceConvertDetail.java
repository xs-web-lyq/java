public class ForceConvertDetail {

	// ��дһ��main����
	public static void main(String[] args) {

		// ǿ������ת������ֻ���������Ĳ�������Ч��������ʹ��С����������ȼ�
		// int x = (int)10 * 3.5 + 6 * 1.5; //����ֻ�ǽ�10ǿתΪint�͡��������double��
		int y = (int)(10 * 3.5 + 6 * 1.5);
		System.out.println(y);

		// char ���Ϳ��Դ洢 int �ĳ���ֵ�������ܱ���int�ı���ֵ����Ҫǿת
		char c1 = 100;
		int m = 100;
		// char c2 = m;//����
		char c3 = (char)m; 
		System.out.println(c3);
	}
}