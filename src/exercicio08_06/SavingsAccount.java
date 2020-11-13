/*8.6 (Classe Savings Account) Crie uma classe SavingsAccount. Utilize uma vari�vel static annualInterestRate para armaze
nar a taxa de juros anual para todos os correntistas. Cada objeto da classe cont�m uma vari�vel de inst�ncia private savingsBalance para indicar a quantidade que o poupador atualmente tem em dep�sito. Forne�a o m�todo calculateMonthlyInterest para calcular os juros mensais multiplicando o savingsBalance por annualInterestRate dividido por 12 � esses juros devem ser adicionados ao savingsBalance. Forne�a um m�todo static modifyInterestRate que configure o annualInterestRate com um novo valor. Escreva um programa para testar a classe SavingsAccount. Instancie dois objetos savingsAccount, saver1 e saver2, com saldos de R$ 2.000,00 e R$ 3.000,00, respectivamente. Configure annualInterestRate como 4% e ent�o calcule o juro mensal de cada um dos 12 meses e imprima os novos saldos para os dois poupadores. Em seguida, configure annualInterestRate para 5%, calcule a taxa do pr�ximo m�s e imprima os novos saldos para os dois poupadores.*/

package exercicio08_06;

public final class SavingsAccount {

	private static double annualInterestRate;
	private double savingsBalance;


	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public double calculateMonthlyInterest(int months) {
		for(int i = 1; i <= months; i++) {
			double MonthlyInterest = savingsBalance * (annualInterestRate /12);
			savingsBalance += MonthlyInterest;
		}
		return savingsBalance;
	}

	public static void modifyInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
}//class
