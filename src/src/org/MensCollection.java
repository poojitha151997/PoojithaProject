package src.org;

public class MensCollection extends FashionBoutique {
	public void collectionMens () {
		System.out.println("New Men collections available");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MensCollection c=new MensCollection ();
      c.collectionMens();
      c.offersDetails();
		
	}

}
