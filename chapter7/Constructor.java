public class Constructor {
	public static void main(String[] args){
		Person p1 = new Person("liuyongqi", 21);
		System.out.println(p1.name);
		System.out.println(p1.age);





	}
}


class Dog {
	// �������Աû�ж���һ����������ϵͳ�Զ���������һ��Ĭ�ϵ��޲ι�����������Ĭ�Ϲ�����

	// ʹ��javap ���� �����뿴��

	// һ���������Լ��Ĺ�������Ĭ�Ϲ������ͱ������ˣ��Ͳ�����ʹ��Ĭ�ϵ��޲ι�������
	// ������ʾ�Ķ���һ��,����Dog(){} д����һ�����Ҫ��

	public Dog(String dName){
		//...
	}
	Dog(){
		// ��ʽ�Ķ���һ��
	}
}


// �ڴ�������Ķ���ʱ����ֱ��ָ�������������������

class Person {
	String name;
	int age;
	// ������
	// 1.������û�з���ֵ,Ҳ����дvoid
	// 2.�����������ƺ���Personһ��
	// 3.(String pName , int pAge) �ǹ������β��б�,����ͳ�Ա����һ��
	public Person(String pName , int pAge){
		name = pName;
		age = pAge;
	}

	// ��2����������ָֻ������������Ҫָ������---������������
	public Person(String pName){
		name = pName;
	}

}