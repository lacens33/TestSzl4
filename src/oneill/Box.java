/**
 * 
 */
package oneill;

/**
 * @author Adam
 *
 */



public class Box extends Component{
	Location location;
	boolean isCarried;
	int box_ID;
	
	Box(Location location){}
	
	void setState(boolean b){
		isCarried = b;
	}
	
	boolean getState(){
		return isCarried;
	}
	
	Location getLocation(){
		return location;
	}
	
	/*Be�ll�thatjuk egy adott objektum hely�t a k�perny�n*/
	void setLocation(Location loc){
		location = loc;
	}
	
	

}
