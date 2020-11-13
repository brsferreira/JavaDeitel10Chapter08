package exercicio08_05;

import java.util.concurrent.TimeUnit;

public final class Time3 {

	private int seconds;

	public static void main(String[] args) {
		Time3 t = new Time3();
		t.setSeconds(50000);
		System.out.println(t.toUniversalString());
		System.out.println(t.toString());

	}


	private long getHora() {
		long hora = TimeUnit.SECONDS.toHours(seconds);
		//int hour = (seconds / 3600);
		return hora;
	}

	private int getMinutos() {
		int minute = (seconds % 3600) / 60;
		return minute;
	}

	private int getSeconds() {
		return seconds % 60;
	}


	public void setSeconds(int seconds) {
		if(seconds < 0 || seconds > 86400)
			throw new IllegalArgumentException("second must be 0-86400");
		this.seconds = seconds;
	}

	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString()
	{
		return String.format(
				"%02d:%02d:%02d", getHora(), getMinutos(), getSeconds());
	} 

	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString()
	{
		return String.format("%d:%02d:%02d %s", 
				((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
				getMinutos(), getSeconds(), (getHora() == 24 || getHora() < 12 ? "AM" : "PM"));
	} 

}//class
