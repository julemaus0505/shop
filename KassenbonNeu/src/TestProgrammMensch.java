
public class TestProgrammMensch {

	public static void main(String[] args) {
		System.out.println("start");
		
		Mensch jule = new Mensch("Jule");
		Mensch sascha = new Mensch("Sascha");
		
		
		jule.wachsen(7);
		
		sascha.wachsen(12);
		
		jule.zunehmen(10);
	}

}
