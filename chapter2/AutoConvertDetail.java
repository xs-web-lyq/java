public class AutoConvertDetail {

	// ��дһ��main����
	public static void main(String[] args) {

		// ϸ��һ���ж������͵����ݻ������ʱ
		// ϵͳ�����Զ�����������ת�����������������������ͣ�Ȼ���ڽ��м���
		int n1 = 10; //ok
		// float d1 = n1 + 1.1; //���� n1 + 1.1 ���������double
		// double d1 = n1 + 1.1; //�� n1 + 1.1 ���������double
		double d1 = n1 + 1.1f; //�� n1 + 1.1 ���������float


		// ϸ��2�������ǰѾ��ȣ������󣩵��������͸�ֵ�����ȣ�������С����������ʱ��
		// �ͻᱨ����֮�ͻ�����Զ�ת��

		// int n2 = 1.1;//���� double -> int

		// ϸ��3��(byte,short) �� char ֮�䲻�ụ�� �Զ�ת��
		// ϸ��4�����Ѿ��������byteʱ����1�����жϸ����Ƿ���byte��Χ�ڣ�����ǾͿ���
		byte b1 = 10; // -128-127
		int n2 = 1; // n2 �� int
		// byte b2 = n2; //����ԭ������Ǳ�����ֵ���ж������ٸ�ֵ����Ϊn2 Ϊint�� ռ�ĸ��ֽڣ�b2��byte��һ���ֽ�

		// char c1 = b1;//���� ��ԭ��byte�����Զ�ת�� char


		// ϸ��5��byte,short,char �������߿��Լ��㣬�ڼ���ʱ����ת��Ϊint��

		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		// short s2 = b2 + s1; //�� �� b2 + s1 => int
		int s2 = b2 + s1; //�ԣ� b2 + s1 => int

		// byte b4 = b2 + b3; //����b2 + b3 => int

		// boolean ������ת��
		boolean pass = true;
		// int num100 = pass;// boolean ���������͵��Զ�ת��

		// �Զ�����ԭ�򣺱��ʽ����������Զ�����Ϊ����������������
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		float num300 = 1.1f;

		int num400 = b4 + s3 + num200 + num300 ; //����  float ����-> int
	}
}