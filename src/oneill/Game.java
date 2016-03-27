package oneill;

import java.util.Date;

/*
 Attrib�tumok
time: Date: a j�t�k kezdet�nek idej�t t�rolja.
game_time: Date: az aktu�lis �t�kid�t t�rolja.
highScore: int:  az eddig el�rt legmagasabb pontsz�mot t�rolja.
player: Player: a j�t�kos
map: Map: az aktu�lisan j�tszott p�lya
Met�dusok
Game(Date currentTime): az objektum konstruktora, l�trehozza azt, a megadott param�terek alapj�n.
void update():  friss�ti a j�t�k�ll�st a Player cselekedetei alapj�n.
void quit(): bez�rja a j�t�kot.
void help(): megnyitja a Seg�ts�g men�t.
void showHighScore(): ki�rja az aktu�lis highscore-t.
int getPlayerScore(): lek�rdezi a j�t�kos aktu�lis pontsz�m�t */


//Date(int year, int month, int date, int hrs, int min, int sec)

public class Game {
	Date time;
	Date game_time;
	Map map;
	int highScore;
	Player player;
	
Game(Date date){}

void update(){}
void quit(){}
void help(){}
void showHighScore(){}
int getPlayerScore(){
	
	return player.getScore();
}

}
