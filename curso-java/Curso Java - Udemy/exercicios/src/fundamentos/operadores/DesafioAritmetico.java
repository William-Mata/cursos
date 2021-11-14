package fundamentos.operadores;

public class DesafioAritmetico {

	public static void main(String[] args) {
		
		double form1 = Math.pow((6 * ( 3 + 2 )) , 2) / (3 * 2);
		
		double form2 = Math.pow((1-5)*(2-7)/2 , 2);
		
		double form3 = Math.pow(10 , 3);	
		
		double form4 = Math.pow(( form1 - form2 ) , 3) / form3;		
				
		System.out.println("[ 6 * ( 3 + 2 )] ²  / ( 3 * 2 ) =  " + form1);
		System.out.println("((1 - 5) * (2 - 7)) ² / 2 =  " + form2);
		System.out.println("10³ = " +form3);
		System.out.println(" (150  - 100)³ / 1000 = "  +form4);
	}

}
