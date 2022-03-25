public class VarScope {
	public static void main(String[] args){

	}
}
class Cat {
	// 全局变量：也就是属性，作用域为整个类体Cat类：cry eat 等方法使用
	// 属性在定义时可以被直接赋值

	//全局属性有默认值

	// 全局变量可以加修饰符---局部变量不能加修饰符
	public int age = 10; //指定的值为10
	public void cry(){
		//1.局部变量一般是指在成员方法中的变量
		// 2.n 和 name 就是局部变量 其作用域就是cry方法中
		// public int n = 10; //局部变量加修饰发会报错
		String name = "jack";
		System.out.println("在cry中使用属性 age =" + age);

	}
	public void eat(){
		// 局部变量必须初始化之后，才可以使用，因为没用默认值
		int num;

		System.out.println("在eat中使用属性 eat" + num);//错误
		// System.out.println("在eat中使用属性 eat" + n);//错误
	}
}