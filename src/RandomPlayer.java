/**
 * @author Serhiy Bardysh
 *
 */
public class RandomPlayer extends Player {
	
		
	public RandomPlayer(String name) {
		this.name = name;
	}

	@Override
	public int generateRoshambo() {
		int i = (int) (Math.random() * 3);
		i++;
		return i;
		
	}

}
