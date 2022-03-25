public class Constructor {
	public static void main(String[] args){
		Person p1 = new Person("liuyongqi", 21);
		System.out.println(p1.name);
		System.out.println(p1.age);





	}
}


class Dog {
	// 如果程序员没有定义一个构造器，系统自动给类生成一个默认的无参构造器（叫做默认构造器

	// 使用javap 命令 反编译看看

	// 一旦定义了自己的构造器，默认构造器就被覆盖了，就不能在使用默认的无参构造器了
	// 除非显示的定义一下,即：Dog(){} 写（这一点很重要）

	public Dog(String dName){
		//...
	}
	Dog(){
		// 显式的定义一下
	}
}


// 在创建人类的对象时，就直接指定这个对象的年龄和姓名

class Person {
	String name;
	int age;
	// 构造器
	// 1.构造器没有返回值,也不能写void
	// 2.构造器的名称和类Person一样
	// 3.(String pName , int pAge) 是构造器形参列表,规则和成员方法一样
	public Person(String pName , int pAge){
		name = pName;
		age = pAge;
	}

	// 第2个构造器，只指定人名，不需要指定年龄---构造器的重载
	public Person(String pName){
		name = pName;
	}

}