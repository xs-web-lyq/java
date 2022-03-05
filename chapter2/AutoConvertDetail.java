public class AutoConvertDetail {

	// 编写一个main方法
	public static void main(String[] args) {

		// 细节一：有多种类型的数据混合运算时
		// 系统首先自动将所有数据转换成容量最大的那种数据类型，然后在进行计算
		int n1 = 10; //ok
		// float d1 = n1 + 1.1; //报错 n1 + 1.1 结果类型是double
		// double d1 = n1 + 1.1; //对 n1 + 1.1 结果类型是double
		double d1 = n1 + 1.1f; //对 n1 + 1.1 结果类型是float


		// 细节2：当我们把精度（容量大）的数据类型赋值给精度（容量）小的数据类型时，
		// 就会报错，反之就会进行自动转换

		// int n2 = 1.1;//报错 double -> int

		// 细节3：(byte,short) 和 char 之间不会互相 自动转换
		// 细节4：当把具体的数给byte时，（1）先判断该数是否在byte范围内，如果是就可以
		byte b1 = 10; // -128-127
		int n2 = 1; // n2 是 int
		// byte b2 = n2; //错误，原因：如果是变量赋值，判断类型再赋值，因为n2 为int型 占四个字节，b2是byte型一个字节

		// char c1 = b1;//报错 ，原因byte不能自动转成 char


		// 细节5：byte,short,char 他们三者可以计算，在计算时首先转换为int型

		byte b2 = 1;
		byte b3 = 2;
		short s1 = 1;
		// short s2 = b2 + s1; //错 ， b2 + s1 => int
		int s2 = b2 + s1; //对， b2 + s1 => int

		// byte b4 = b2 + b3; //错误，b2 + b3 => int

		// boolean 不参与转换
		boolean pass = true;
		// int num100 = pass;// boolean 不参与类型的自动转换

		// 自动提升原则：表达式结果的类型自动提升为操作数中最大的类型
		byte b4 = 1;
		short s3 = 100;
		int num200 = 1;
		float num300 = 1.1f;

		int num400 = b4 + s3 + num200 + num300 ; //报错  float 不能-> int
	}
}