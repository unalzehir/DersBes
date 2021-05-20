package gamePlay;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer(1, "123456", "Ünal", "Zehir", LocalDate.of(1995,2,8));
		Game game = new Game(1, "fifa 21", 400);
		Sales sales = new Sales(1, 1, 400);
		Campaign campaign = new Campaign(1, "Büyük indirim", 400, 45 );
		
		GamerManager gamerManager = new GamerManager(new GamerValidationManager());
		gamerManager.add(gamer);
		
		SalesManager salesManager = new SalesManager(new GamerValidationManager());
		salesManager.sale(game, gamer);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);

	}



}
