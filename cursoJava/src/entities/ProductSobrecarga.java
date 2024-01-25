package entities;

public class ProductSobrecarga {
	public String name;
	public double price;
	public int quantity;//parametro
	
	public ProductSobrecarga() {  // construtor padrão
	}
	
	public ProductSobrecarga(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity; //atributo
	}
	
	public ProductSobrecarga(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;    //usamos o this para acessar o atributo da classe
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { //toString - converte o objeto para string
		return name
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}

	
	//Por convensão os get e set são colocados depois dos constructores.
}
