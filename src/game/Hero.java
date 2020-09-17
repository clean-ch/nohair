package game;
/**英雄类父类*/
public abstract class Hero{
	private long id;
	private String name;
	private int level;
	private int hp;
	private int attack;
	private int maxHp;
	private int x;
	private int y;
	public Hero(){
		setMaxHp(100);
		setHp(100);
	}
	public Hero(long id,String name) {
		setId(id);
		setName(name);
		setMaxHp(100);
		setHp(100);
	}
	/**
	 * 父类使用模板模式对战的方法
	 * 规定默认情况下对战流程
		*/
	public void Pk(Hero hero) {
		//1计算距离判断是否能攻击对方
		if (canFightByDistance(hero)&&hp > 0&&hero.getHp()>0) {
			//2如果能攻击就调用攻击方法
			fight(hero);
		}else {
			System.out.println("worrong");
		}
		//3在控制台打印结果
		System.out.println("两位英雄的当前状态");
		System.out.println("昵称\thp\tX坐标\tY坐标");
		System.out.println(name+"\t"+hp+"\t"+x+"\t"+y);
		System.out.printf("%s\t%d\t%d\t%d",
				hero.getName(),hero.getHp(),hero.getX(),hero.getY()
				);
	}
	/**
	 * 判断当前英雄是否能攻击传入的英雄对象*/
	public abstract boolean canFightByDistance(Hero hero);
	/**
	 * 攻击传入的英雄对象，默认更具随机生成的攻击力减少hp值*/
	public abstract void fight(Hero hero);
	
	protected double getDistance(int x1,int y1,int x2,int y2) {
		return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y1-y2, 2));
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level<0||level>100) {
			this.level = 1;
		}else {
			this.level = level;
		}
		
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
