
public class ProfitLoss implements constants {
	
	
	
	
	
	public void gain(float sp , float cp) {
		float ans = sp-cp;
		System.out.println(ans);
		
	}
	
	public void loss(float sp,float cp) {
		float ans = cp-sp;
		System.out.println(ans);
	}
	
	public void percentagegain(float sp, float cp) {
			float ans = (sp-cp)*100/cp;
			
			System.out.println(ans);
	}
	
	public void percentageGainWithDifferentPara() {
		System.out.println("Choose from the given values");
		System.out.println("1.	\r\n" + 
				"The cost price of n articles is the same as the selling price of x articles. If the profit is p%, then the value of x is");
		System.out.println("2. 	\r\n" + 
				"In a certain store, the profit is n% of the cost. If the cost increases by p% but the selling price remains constant, approximately what percentage of the selling price is the profit?");
		int val =input.nextInt();
		
		if(val ==1) {
			System.out.println("Please Enter the values given to you");
			System.out.println("Value of n is ");
			int n = input.nextInt();
			System.out.println("Values of p is");
			int p = input.nextInt();
			differentAnswer(n, p);
		}
		
		if (val ==2) {
			
			System.out.println("Please Enter the values given to you");
			System.out.println("Value of n");
			int n = input.nextInt();
			System.out.println("Value of p");
			int p = input.nextInt();
			differentAnswerforTwo(n,p);
			
		}
		
		
		
		
		
	}
	
	
	public void percentageloss(float sp, float cp) {
		float ans = (sp-cp)*100/cp;
		
		System.out.println(ans);
}
	
	
	public void sellingprice(float sp , float cp) {
		float ans = (100 + (sp-cp)*100/cp)/100 * cp;
		System.out.println(ans);
	}
	
	public void differentAnswer(float n , float p) {
		float ans = (100*n)/(p+100);
		
		System.out.println("Answer is "+ans);
	}
	public void differentAnswerforTwo(float n , float p) {
		float sp = num + 100 * (p/100);
		float cp = num + 100 * (n/100);
		float ans = (sp-cp)/sp * 100;
		
		System.out.println("Ans."+ans+"%");
		
	}
	
	
	
	
	

}
