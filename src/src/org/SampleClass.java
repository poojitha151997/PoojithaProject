package src.org;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      @SuppressWarnings("unused")
	String s ="Welcome to FashionBoutique";
    System.out.println("original string" + s);
      
    boolean b =s.startsWith("Welcome");
    boolean b1=s.startsWith("to");
    boolean b2=s.startsWith("FashionBoutique");
    System.out.println(b);
    System.out.println(b1);
    System.out.println(b2);
    }
	

}
