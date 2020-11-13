package exercicio08_07;

public final class SimulatorTime2 {
	
	public static void main(String[] args) {
		
		Time2 t1 = new Time2(12, 59, 59);
		
		t1.tick();
		
		System.out.println(t1.toString());
		
	}//main
}//class
