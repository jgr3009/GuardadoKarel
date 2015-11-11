

import stanford.karel.*;

public class MidpointFindingKarel2 extends KarelMejorada2 {
	
	public void run(){
		
		while (frontIsClear()){
			move();
			if (beepersPresent()){
				daLaVuelta();
				move();
				putBeeper();
				
			}
			if (frontIsBlocked()){
				daLaVuelta();
				putBeeper();
			//Esto es para ver si funciona GitHub
			
				
			}
		}
		
		
	}

	

}
