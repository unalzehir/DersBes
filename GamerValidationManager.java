package gamePlay;

public class GamerValidationManager implements IGamerValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		if (gamer.getNationalyId() == "123456") {
			return true;
		}else {
			return false;
		}
		
		
	}

}
