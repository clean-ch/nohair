package game;



public class herotext {

	public static void main(String[] args) {
		//两个战士之间的对战
		Hero hero1 = new warrio(1,"大炮",1,1);
		Hero hero2 = new warrio(2, "飞机", 10, 10);
		hero1.Pk(hero2);
		

	}

}
