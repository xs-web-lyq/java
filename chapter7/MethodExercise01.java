public class MethodExercise01 {
	// 编写一个main方法
	public static void main(String[] args) {
		AA a = new AA();
		if(a.isOdd(7)){
			System.out.println("奇数");
		}else{
			System.out.println("偶数");
		}
		a.print(4,4,'#');
	}
}

class AA {
	public boolean isOdd(int n) {
		if(n%2==0){
			return false;
		}else{
			return true;
		}
	}

	public void print(int row, int col, char c){
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}