package classesWithAttributes;

public class ProductManager {
	public void Add(Product product ) {    // Add = ekle    bir s�n�f�n i�inde ba�ka bir s�n�f� kullanmak
		//JDBC kodlar� yazarak veri taban�na kaydetmek         
		System.out.println("�r�n eklendi " + product.name);
	}

}
