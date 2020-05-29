package BinaryTrees;

public class headAndTailRecursion {
	private static void TopDownfun(int n)
	{
	if (n > 0) {
	
		System.out.printf("%d ",n);//we do this as we go down so our input is first which is 321
		TopDownfun(n - 1);
		}
	}



	
	private static void BottomUpFun(int n) {
		if (n > 0) {
			BottomUpFun(n - 1);
			System.out.printf("%d ",n);//we do this only when we bubble up, now we bubble up from 1
		}
	}
	
	private static void TreeRecursion(int n) {
		if (n > 0) {
			TreeRecursion(n - 1);//3,2,1,1 () - - two nodes --tree1
			TreeRecursion(n - 1);//2,1,1<-starts here, then goes up --tree2, starts here
			System.out.print(n);//PRINTS WILL START HERE from 1, reserse starting from the leaves prints 1121123

		}
	}

	public static void main(String[] args) {
		int x = 3;
		//TopDownfun(x);//321
		//BottomUpFun(x);//123
		TreeRecursion(x);//123 //from this
	}

}
