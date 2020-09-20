
public class Application implements constants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("Select the type of problems");
				System.out.println("1. Profit Loss Problems");
				System.out.println("2. Problems on Trains");
				int inputSelected = input.nextInt();
				
				if(inputSelected == 1) {
					ProfitLoss object = new ProfitLoss() ;
					System.out.println("Please Select the type of problem");
					System.out.println("1. Calcualte Gain");
					System.out.println("2. Calculate Loss");
					System.out.println("3. Gain %");
					System.out.println("4. Loss %");
					System.out.println("5. Selling Price");
					System.out.println("6. New Type of Problem");
					int cal = input.nextInt();
					
					if(cal==1) {
						System.out.println("Enter Selling Price");
						int sp = input.nextInt();
						System.out.println("Enter Cost Price");
						int cp = input.nextInt();
						
						object.gain(sp, cp);
						
					}
					if(cal==2) {
						System.out.println("Enter Selling Price");
						int sp = input.nextInt();
						System.out.println("Enter Cost Price");
						int cp = input.nextInt();
						
						object.loss(sp, cp);
						
					}
					if(cal==3) {
						System.out.println("Enter Selling Price");
						int sp = input.nextInt();
						System.out.println("Enter Cost Price");
						int cp = input.nextInt();
						
						object.percentagegain(sp, cp);
						
					}
					if(cal==4) {
						System.out.println("Enter Selling Price");
						int sp = input.nextInt();
						System.out.println("Enter Cost Price");
						int cp = input.nextInt();
						
						object.percentageloss(sp, cp);
						
					}
					if(cal==5) {
						System.out.println("Enter Selling Price");
						int sp = input.nextInt();
						System.out.println("Enter Cost Price");
						int cp = input.nextInt();
						
						object.sellingprice(sp, cp);
						
					}
					
					if(cal ==6) {
						object.percentageGainWithDifferentPara();
					}
					
					
				}
				
				
	}

}
