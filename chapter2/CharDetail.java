public class CharDetail{
	// ��дһ��main����
	public static void main(String[] args) {
		// ��java�У�char�ı�����һ�������������ʱ����unicode���Ӧ���ַ�
		char c1 = 97;
		System.out.println(c1);

		char c2 = 'a'; //���'a'��Ӧ������
		System.out.println((int)c2);
		char c3 = '��';
		System.out.println((int)c3);

		// char�����ǿ��Խ�������ģ��൱��һ����������Ϊ���Ƕ���Ӧ��Unicode��;
		System.out.println('a' + 10);
	}
}