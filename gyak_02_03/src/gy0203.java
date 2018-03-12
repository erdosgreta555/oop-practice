
public class gy0203 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	double eredmeny = faktorialis(10);
		System.out.println(eredmeny);
		*/
		
		calculatefactorial(10);
		System.out.println();
		
	}
	
	/*public static double faktorialis(int eredmeny=1){
		int i;
		for(i=1; i<=10; i++){
			eredmény=eredmeny*i;
			
			
		}
		
		return eredmeny;
		
	} */

	public static void calculatefactorial(int limit){
		int product=1;
		for (int i=1; i<limit; i++) {
			product*=i;
			System.out.println(product);
			
		}	
		
	}
		
}
