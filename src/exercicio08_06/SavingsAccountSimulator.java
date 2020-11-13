package exercicio08_06;

public final class SavingsAccountSimulator {

	public static void main(String[] args) {
		
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.setAnnualInterestRate(0.04);
		double TotalBalanceSaver1 = saver1.calculateMonthlyInterest(12);
		System.out.printf("TotalBalanceSaver1: %.2f\n", TotalBalanceSaver1);
		saver1.setSavingsBalance(TotalBalanceSaver1);
		
		double TotalBalanceSaver2 = saver2.calculateMonthlyInterest(12);
		System.out.printf("TotalBalanceSaver2: %.2f\n", TotalBalanceSaver2);
		saver2.setSavingsBalance(TotalBalanceSaver2);
		
		//Novo acréscimo
		SavingsAccount.setAnnualInterestRate(0.05);
		double TotalBalanceSaver3 = saver1.calculateMonthlyInterest(1);
		System.out.printf("TotalBalanceSaver1: %.2f\n", TotalBalanceSaver3);
		saver1.setSavingsBalance(TotalBalanceSaver1);
		
		double TotalBalanceSaver4 = saver2.calculateMonthlyInterest(1);
		System.out.printf("TotalBalanceSaver2: %.2f\n", TotalBalanceSaver4);
		saver2.setSavingsBalance(TotalBalanceSaver2);

	}//main
}//class

