package gamejieko;


public class warrio extends Hero{
	public warrio() {
		super();
		setName("moren");
	}
	public warrio(long id,String name,int x,int y) {
		super(id ,name);
		setX(x);
		setY(y);
	}

	@Override
	public boolean canFightByDistance(Assailable hero) {
		double distance = getDistance(getX(), getY(), hero.getX(), hero.getY());
		//����սʿ�Ĺ�������Ϊ100
		return distance <= 100;
	}

	@Override
	public void fight(Assailable hero) {
		//1����������Ĺ�����
		//2��������Ӣ�۶����hp
		int attack = ((int)(Math.random()*1000)) %51 + 20;
		setAttack(attack);
		hero.setHp(hero.getHp()-attack);
		
	}
	
}
