/**
 * @author Serhiy Bardysh
 *
 */
public abstract class Player {

	String name;
	private int roshembo;
	
	public abstract int generateRoshambo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoshembo() {
		return roshembo;
	}

	public void setRoshembo(int roshembo) {
		this.roshembo = roshembo;
	}
	
	
	
}
