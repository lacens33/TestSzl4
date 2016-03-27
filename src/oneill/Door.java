package oneill;


/*Olyan objektum amely z�rt �llapotban �thatolhatatlan viszont nyitott �llapotban a j�t�kos �t tud haladni rajta. 
Minden egyes ilyen Door objektumhoz tartozik egy Scale objektum amely az adott objektumhoz tartoz� scale_ID azonos�t.
Ha az ehhez tartoz� Scale objektumra Box vagy Player objektum ker�l akkor ez a Door objektum nyitva lesz.*/
public class Door  extends Component{
	Location location;
	boolean isOpen;
	int scale_ID;
	int ID;
	
	//A Door oszt�ly konstruktora, ami  l�trehoz egy Door objektumot a megadott f�ggv�nyparam�terekkel
	Door(Location loc, int ID, int scale_ID){
		
	}
	
	//Be�ll�tja egy Door objektum isOpen �rt�k�t a param�terben megadott �rt�kre
	void setState(boolean b){
		isOpen = b;
	}
	
	//Vissza adja az adott objektum isOpen attrib�tum�nak �rt�k�t
	boolean getState(){
		return isOpen;
	}
	
	//Vissza adja az adott Door objektumhoz tartoz� Scale objektum azonos�t� sz�m�t (scale_ID)
	int getScale_ID(){
		return scale_ID;
	}
}
