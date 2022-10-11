package oopWithNLayeredApp.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String Data) {
		System.out.println("Mail gönderildi : " + Data);

	}

}
