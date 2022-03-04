
public class FloatDetail{
	public static void main(String[] args) {
		// Java 的浮点型常数（具体值）默认为double型，声明float型常数，需要在后面加"f"或"F";
		// float num1 = 1.1;//出错误
		float num2 = 1.1f;
		double num3 = 1.1f;


		// 浮点数使用陷阱 2.7 和 8.1 / 3 比较
		double num11 = 2.7;
		double num12 = 8.1 / 3;
		System.out.println(num11);//2.7
		System.out.println(num12);//2.6999999999999997
		// 得到一个重要的使用点，当我们对运算结果为小数的进行相等判断时，要小心
		// 应该是以两个数的差值的绝对值，在某个范围内判断

		// 使用JAVA API 
		if(Math.abs(num11-num12) < 0.000001){
			System.out.println("差值非常小，到我的规定精度，认为相等。");
		}
		System.out.println(Math.abs(num11-num12));
	}
}