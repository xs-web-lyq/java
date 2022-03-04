

public class InDetail {
	public static void main(String[] args) {
		int n1 = 10;//占用四个字节
		// int n2 = 10L;//long 型占用八个字节所以会报错
		//  不兼容的类型: 从long转换到int可能会有损失
		long n3 = 10L;
	}
}