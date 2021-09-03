package src.org;

public class BabyDog extends Dog{
	public void Habit() {
		System.out.println("Baby dog drinks milk");
	}
	
	
	public static void main(String[] args) {
		
		BabyDog bd=new BabyDog();
		bd.Dog();
		bd.Habit();
		bd.Nature();
		
	}

}

