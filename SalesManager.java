package gamePlay;


public class SalesManager implements ISalesService {

	IGamerValidationService gamerValidationService;
	public SalesManager(IGamerValidationService gamerValidationService) {

		this.gamerValidationService = gamerValidationService;
	}
	@Override
	public void sale(Game game, Gamer gamer) {
		if (gamerValidationService.validate(gamer)) {
			System.out.println(gamer.getFirsName() + ": " + game.getName() + " oyununu " + game.getPrice() + " TL'ye ald�.");

		}else {
			System.out.println("Kimlik do�rulanamad��� i�in sat�� i�lemi ger�ekle�tirilemedi.");
		}
		
	}

}
