public class MethodParameter02 {
	// ��дһ��main����
	public static void main(String[] args) {
		B b = new B();
		int[] arr = {1,2,3};
		b.test100(arr);
		System.out.println(arr[1]);
	}
}

class B {
	public void test100(int[] arr){
		arr[1] = 100;
	}
}