
public class HumanPlayer extends Player {
		
	public HumanPlayer(String userName, int iChoice) {
		setName(userName);
		setRoshembo(iChoice);
	}

	@Override
	public int generateRoshambo() {
		
		return getRoshembo();
	}

}
