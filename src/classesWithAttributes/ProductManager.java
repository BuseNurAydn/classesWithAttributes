package classesWithAttributes;

public class ProductManager {
	public void Add(Product product ) {    // Add = ekle    bir sýnýfýn içinde baþka bir sýnýfý kullanmak
		//JDBC kodlarý yazarak veri tabanýna kaydetmek         
		System.out.println("Ürün eklendi " + product.name);
	}

}
