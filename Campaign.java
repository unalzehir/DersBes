package gamePlay;

public class Campaign implements IEntity{

	private int id;
	private String campaignName;
	private double gamePrice;
	private int discountRate;
	
	
	public Campaign(int id, String campaignName, double gamePrice, int discountRate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.gamePrice = gamePrice;
		this.discountRate = discountRate;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getCampaignPrice() {
		return getGamePrice() - (getGamePrice() * getDiscountRate()/100);
	}
}
