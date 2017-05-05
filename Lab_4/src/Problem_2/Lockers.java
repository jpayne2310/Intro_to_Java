package Problem_2;

public class Lockers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using problem hint
		boolean[] lockers = new boolean[101];
		
        //open all lockers
        for (int i = 0; i < lockers.length; i++) {
            lockers[i] = true;
        }

        //sort through locker until all kids 
        //are done messing with them
        for (int i = 2; i < lockers.length; i++) {
            for (int j = 1; i * j <= lockers.length; j++) {
            	lockers[i * j] = !lockers[i * j];
            }
        }

        //output the open lockers
        for (int i = 1; i < lockers.length; i++) {
        	if (lockers[i]) {
        	    System.out.println("Locker " + i + " is open");
        	}
        }
    }
	
}
