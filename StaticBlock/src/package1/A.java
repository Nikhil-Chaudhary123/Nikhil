package package1;

public class A implements I{

	@Override
	public void show() {
		System.out.println("show of A");
		
	}

	public static void main(String[] args) {
		I1 i1=new A();
		i1.show();
	   
	   I i=new A();
	}
	
}
