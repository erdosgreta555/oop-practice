
public class gyak0201 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int i=1;
		double eredmeny=0;
		for(i=1;i<1000;i++){
			int n;
			for(n=1;n<1000;i++){
		 eredmeny=(2n/2n-1)*(2n/2n+1);
			}
		} 
		System.out.println("Az eredmeny: " + eredmeny);
		*/
		
		double pi=2;
		for (double i=1; i<=10000; i++){
			double WallisLeft=(2*i)/(2*i-1);
			double WallisRight(2*i)/(2*i+1);
			
			pi=pi*WallisLeft*WallisŰRight;
			System.out.println("current pi: " +pi);
		}
		
		System.out.println("The value of estimated pi is: " +pi 
							"/n the value of real pi is:" +Math.PI);
		
	}

}
