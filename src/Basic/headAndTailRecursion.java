package Basic;

public class headAndTailRecursion {
	private static void TopDownfun(int n)
	{
	if (n > 0) {
	
		System.out.printf("%d ",n);//we do this as we go down
		TopDownfun(n - 1);
		}
	}



	
	private static void BottomUpFun(int n) {
		if (n > 0) {
			BottomUpFun(n - 1);
			System.out.printf("%d ",n);//we do this only when we bubble up
		}
	}

	private static int Main()
	{
		int x = 3;
		TopDownfun(x);
		BottomUpFun(x);
		return 0;
	}

}
