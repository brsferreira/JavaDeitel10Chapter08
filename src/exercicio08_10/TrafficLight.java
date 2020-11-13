 package exercicio08_10;

/*8.10 Escreva um tipo enum TrafficLight, cuja constante (RED, GREEN, YELLOW) aceite um parâmetro — a duração da luz. Escreva um programa para testar o enumTrafficLight de modo que ele exiba a constante enum e suas durações.*/

public enum TrafficLight {
	
	RED(15),GREEN(25),YELLOW(5);
	
	private final int timer;
	
	TrafficLight(int duration) {
		this.timer = duration;
	}
	
	public int getTimer() {
		return timer;
	}
	

}//enum
