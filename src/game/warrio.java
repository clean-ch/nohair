package game;


public class warrio extends Hero{
	public warrio() {
		super();
		setName("moren");
	}
	public warrio(long id,String name,int x,int y) {
		super(id ,name);
		setX(x);
		setY(y);
		System.out.println(getX() + "\t" + x);
	}

	@Override
	public boolean canFightByDistance(Hero hero3) {
		double distance = getDistance(getX(), getY(), hero3.getX(), hero3.getY());
		//假设战士的攻击距离为100
		System.out.println(distance+"\t"+getX()+"\t"+hero3.getX());
		return distance <= 100;
	}

	@Override
	public void fight(Hero hero3) {
		//1。生成随机的攻击力
		//2剪掉传入英雄对象的hp
		int attack = ((int)(Math.random()*1000)) % 51 + 20;
		setAttack(attack);
		hero3.setHp(hero3.getHp()-attack);
		
	}
	
	
}
