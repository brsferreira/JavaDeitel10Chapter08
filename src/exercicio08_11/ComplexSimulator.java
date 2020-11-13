package exercicio08_11;

public final class ComplexSimulator {

	public static void main(String[] args) {
		
		Complex cNum1 = new Complex(15 , 20);
		Complex cNum2 = new Complex(5, 8);
		
		Complex addComplex = Complex.sumComplex(cNum1, cNum2);
		Complex subComplex = Complex.difComplex(cNum1, cNum2);
		
		//Valores iniciais
		System.out.printf("cNum1: %s\n", cNum1.toString());
		System.out.printf("cNum2: %s\n", cNum2.toString());
		
		//Valores finais
		System.out.printf("addComplex: %s\n", addComplex.toString());
		System.out.printf("subComplex: %s\n", subComplex.toString());
		

	}//main

}//class
