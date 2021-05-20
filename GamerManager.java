package gamePlay;

public class GamerManager implements IGamerService{

	IGamerValidationService gamerValidationService;
	
	public GamerManager(IGamerValidationService gamerValidationService) {
		this.gamerValidationService = gamerValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerValidationService.validate(gamer)) {
			System.out.println("Oyuncu eklendi: " + gamer.getFirsName());

		}else {
			System.out.println("Kay�t ba�ar�yla ger�ekle�tirilemedi.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu g�ncellendi: " + gamer.getFirsName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi: " + gamer.getFirsName());
		
	}

	
}
