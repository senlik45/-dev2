package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün Hava Çok Güzel.";
		String yeniMesaj = mesaj.substring(0, 2);
		System.out.println(yeniMesaj);
		String yeniMesaj2 = sehirVer();
		System.out.println(yeniMesaj2);
		int sayı = topla(15, 10);
		System.out.println(sayı);
		int toplam = topla2(15, 15, 20);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void güncelle() {
		System.out.println("Güncelle");
	}

	public static int topla(int a, int b) {
		return a + b;
	}

	public static String sehirVer() {
		return "Ankara";
	}

	public static int topla2(int... sayılar) {
		int toplam = 0;
		for (int sayı2 : sayılar) {
			toplam = toplam + sayı2;

		}
		return toplam;

	}
}
