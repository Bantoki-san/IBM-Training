@FunctionalInterface
interface Maths {
//	int square(int n);
	int sum(int a, int b);
//	boolean isOdd(int n);
}

public class MathDemo {

	public static void main(String[] args) {
		//SQUARE
//		Maths m1 = (n) -> n*n; //Lambda expression
//		
//		Maths m2 = (int n) -> { //Lambda with body
//			int sqr = n*n;
//			return sqr;
//		};
//		
//		class MathsImpl implements Maths{ //Old school method
//			public int square(int n) {
//				int sqr = n*n;
//				return sqr;
//			};
//		}
//		MathsImpl m3 = new MathsImpl();
//		
//		System.out.println(m1.square(10));
//		System.out.println(m2.square(5));
		
		//ODDorNOT
//		Maths o1 = (n) -> n%2 !=0 ? true : false;
//		System.out.println(o1.isOdd(2));
//		System.out.println(o1.isOdd(3));
		
		//SUM
		Maths m1 = (int a, int b) -> a+b;
		System.out.println(m1.sum(3, 5));
	}

}
