public class HumanTest {

	public static void main(String[] args) {
			Human ninja1 = new Human("John");
			Human samurai1 = new Human("Terrance");
			Human wizard1 = new Human("Guy");
			
			wizard1.attack(ninja1);
			samurai1.attack(ninja1);
			ninja1.attack(samurai1);
	}
}