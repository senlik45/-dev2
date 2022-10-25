package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product(654, "Laptop", "Asus laptop", 4500, 3, "siyah" );
		Product product=new Product();
		product.setName("Laptop"); 
		product.setId(654);
		product.setDescription("Asus Laptopll");
		product.setPrice(4500); 
		product.setStockAmount(10);
		
		
		/*System.out.println(product.name);
		System.out.println(product.description);
		System.out.println(product.id);
		System.out.println(product.price);
		System.out.println(product.stockAmount);*/

	
	ProductManager productManager= new ProductManager();
	productManager.Add(product);
	System.out.println(product.getKod());
		
	
	}

}
