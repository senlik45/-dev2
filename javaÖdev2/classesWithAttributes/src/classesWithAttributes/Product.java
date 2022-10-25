package classesWithAttributes;

public class Product {

	public Product(int ıd, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı Blok Çalıştı");
		this.ıd=ıd;
		this.description=description;
		this.kod=kod;
		this.name=name;
		this.price=price;
		this.renk=renk;
		this.stockAmount=stockAmount;
	}

	public Product() {

	}

	private String name;
	private int ıd;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return ıd;
	}

	public void setId(int id) {
		ıd = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + ıd;
	}

}
