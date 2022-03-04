public class CharDetail{
	// 编写一个main方法
	public static void main(String[] args) {
		// 在java中，char的本质是一个整数，在输出时，是unicode码对应的字符
		char c1 = 97;
		System.out.println(c1);

		char c2 = 'a'; //输出'a'对应的数字
		System.out.println((int)c2);
		char c3 = '刘';
		System.out.println((int)c3);

		// char类型是可以进行运算的，相当于一个整数，因为他们都对应有Unicode码;
		System.out.println('a' + 10);
	}
}