package javaassignmet;

class product {

	public String productName;

	public int quantity;

	public double unitPrice;



	product(String productName, int quantity, double unitPrice) {

		this.productName = productName;

		this.quantity = quantity;

		this.unitPrice = unitPrice;

	}



	public String toString() {

		String s = this.productName + ":";

		s = s + this.quantity + "\n";

		return s;

	}



	public String getProductName() {

		return this.productName;

	}



	public int getQuantity() {

		return this.quantity;

	}



	public double getUnitPrice() {

		return this.unitPrice;

	}

}



class ShoppingCart {



	double totalAmount;



	product p1 = new product("Olive Oil 1l", 3, 100.0);

	product p2 = new product("Cheese Slices", 2, 50.0);

	product p3 = new product("Cheese Slices", 2, 50.0);

	product p4 = new product("Bread", 1, 75.0);

	product p5 = new product("Eggs", 50, 10.0);

	product p6 = new product("Chicken Salami", 2, 100.0);

	public product p[]={p1,p2,p3,p4,p5,p6};



	public void calAmount() {

		for (int i = 0; i < 6; i++) {

			totalAmount = totalAmount + p1.quantity * p1.unitPrice;

		}

	}



	public void display() {

		for (int i = 0; i < 6; i++) {

			System.out.println(p[i]);

			System.out.println("Total Amount=" + totalAmount);

		}

	}



}



public class TestShoping {



	public static void main(String[] args) {



		ShoppingCart cart = new ShoppingCart();

		cart.calAmount();

		cart.display();

}
}