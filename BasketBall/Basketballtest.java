package lab2;

/**
*@Author Andrei Baechle
*/

public class Basketballtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Basketball b;
	b = new Basketball(4.0);
	
	System.out.println(b.getDiameter());
	System.out.println(b.isDribbleable());
	
	Basketball b2 = new Basketball(6.0);
	
	b.inflate();
	System.out.println(b.isDribbleable());  // should be true now
	System.out.println(b2.isDribbleable()); // should still be false

	}

}
