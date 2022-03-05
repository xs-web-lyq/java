public class ForceConvertDetail {

	// 编写一个main方法
	public static void main(String[] args) {

		// 强制类型转换符号只针对于最近的操作数有效，往往会使用小括号提高优先级
		// int x = (int)10 * 3.5 + 6 * 1.5; //报错，只是将10强转为int型。结果还是double型
		int y = (int)(10 * 3.5 + 6 * 1.5);
		System.out.println(y);

		// char 类型可以存储 int 的常数值，但不能保存int的变量值，需要强转
		char c1 = 100;
		int m = 100;
		// char c2 = m;//报错
		char c3 = (char)m; 
		System.out.println(c3);
	}
}