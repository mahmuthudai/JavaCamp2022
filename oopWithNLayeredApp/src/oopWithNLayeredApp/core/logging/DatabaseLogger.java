package oopWithNLayeredApp.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String Data) {
		System.out.println("Veritabanına loglandı : " + Data);

	}

}
