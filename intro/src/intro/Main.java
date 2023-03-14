package intro;

public class Main {

	public static void main(final String[] args) {
		System.out.println("Hello world!");

		String ortaMatin = "İlginizi çekebilir";
		// String altMetin = "Vade süresi";

		System.out.println(ortaMatin);

		// int vade = 12;

		double dolarDün = 18.20;
		double dolarBugün = 18.20;

		// boolean dolarDüştümü = false;

		String okYonu = "";

		if (dolarBugün < dolarDün) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugün > dolarDün) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		String[] krediler = { "Hızlı Kredi", "Maaşını Halkbanktan Alanlar İçin", "Mutlu Emekli" };

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
