package exercicio08_10;

public final class enumTrafficLight {

	public static void main(String[] args) {

		for(TrafficLight tl : TrafficLight.values()) {
			System.out.printf("Duration(%s): %d sec\n", tl, tl.getTimer());
		}

	}

}
