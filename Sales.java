package gamePlay;

public class Sales implements IEntity {

	private int id;
	private int gameName;
	private double price;
	
	public Sales(int id, int gameName, double price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameName() {
		return gameName;
	}

	public void setGameName(int gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
