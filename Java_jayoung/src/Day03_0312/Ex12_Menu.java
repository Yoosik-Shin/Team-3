package Day03_0312;

public class Ex12_Menu {
	public Ex12_Menu() {}

	public Ex12_Menu(int muneNo, String menuName, String shopName, int price) {
		this.muneNo   = muneNo;
		this.menuName = menuName;
		this.shopName = shopName;
		this.price    = price;
	}

	int    muneNo;
	String menuName;
	String shopName;
	int    price;

	public int getMuneNo() {
		return muneNo;
	}

	public String getMenuName() {
		return menuName;
	}

	public String getShopName() {
		return shopName;
	}

	public int getPrice() {
		return price;
	}
}
