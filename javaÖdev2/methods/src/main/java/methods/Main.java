package methods;

public class Main {

	public static void main(String[] args) {
		sayıBulmaca();
		sayıBulmaca();

	}

	public static void sayıBulmaca() {
		int[] sayılar = new int[] { 1, 5, 6, 7, 9 };
		int aranacak = 3;
		boolean varMi = false;

		for (int sayı : sayılar) {
			if (sayı == aranacak) {
				varMi = true;
				break;

			}
		}
		String mesaj = "";
		if (varMi) {
			mesaj = "sayı mevcuttur:" + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("sayı mevcutt değildir:" + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
