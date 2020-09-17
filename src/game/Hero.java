package game;
/**Ӣ���ุ��*/
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
	 * ����ʹ��ģ��ģʽ��ս�ķ���
	 * �涨Ĭ������¶�ս����
		*/
	public void Pk(Hero hero) {
		//1��������ж��Ƿ��ܹ����Է�
		if (canFightByDistance(hero)&&hp > 0&&hero.getHp()>0) {
			//2����ܹ����͵��ù�������
			fight(hero);
		}else {
			System.out.println("worrong");
		}
		//3�ڿ���̨��ӡ���
		System.out.println("��λӢ�۵ĵ�ǰ״̬");
		System.out.println("�ǳ�\thp\tX����\tY����");
		System.out.println(name+"\t"+hp+"\t"+x+"\t"+y);
		System.out.printf("%s\t%d\t%d\t%d",
				hero.getName(),hero.getHp(),hero.getX(),hero.getY()
				);
	}
	/**
	 * �жϵ�ǰӢ���Ƿ��ܹ��������Ӣ�۶���*/
	public abstract boolean canFightByDistance(Hero hero);
	/**
	 * ���������Ӣ�۶���Ĭ�ϸ���������ɵĹ���������hpֵ*/
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
