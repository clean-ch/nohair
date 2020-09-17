package gamejieko;

public interface Assailable {
	String getName();
	int getX();
	void setX(int x);
	int getHp();
	void setHp(int hp);
	int getY();
	void setY(int y);
	
	boolean canFightByDistance(Assailable assa);
	
	void fight (Assailable assa);
}
