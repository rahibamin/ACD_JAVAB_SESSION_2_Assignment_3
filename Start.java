package Session2.Assignment3;

public class Start {

	public static void drawX(int starHeight){
	
		for(int i = 0; i <= starHeight / 2 - 1; i++){

			for(int j = 0; j <= i; j++){
				System.out.print("_");
			}
			System.out.print("*");
	
			for(int j = 0; j < starHeight - (2 * (i + 1)); j++){
				System.out.print("_");
			}
			System.out.println("*");
		}

		for(int i = 0; i < starHeight / 2 + 1; i++){
			System.out.print("_");
		}
		System.out.println("*");

		for(int i = 0; i <= starHeight/2 - 1; i++){
			
			for(int j = starHeight/ 2 - (1 * (i)); j > 0; j--){
				System.out.print("_");
			}
			System.out.print("*");
			
			//Print the 2nd spaces
			for(int j = 0; j < 1 + (2*i); j++){
				System.out.print("_");
			}
			System.out.println("*");
			
		}
	}
	
	public static void main(String[] args){
		drawX(5);
	}

}
