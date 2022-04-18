package java03_constructor;

class Pikachu{
	private String name; //피카츄
	private String sound; //피카피카
	private String attack; //전기
	public Pikachu(String name, String sound, String attack) {
		this.name = name;
		this.sound = sound;
		this.attack = attack;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getAttack() {
		return attack;
	}
	public void setAttack(String attack) {
		this.attack = attack;
	}
	@Override
	public String toString() {
		return "Pikachu [name=" + name + ", sound=" + sound + ", attack=" + attack + "]";
	}
	
}

class Squirtle { 
	private String name; //꼬부기
	private String sound; //꼬북꼬북
	private String attack; //물공격
	public Squirtle(String name, String sound, String attack) {
		super();
		this.name = name;
		this.sound = sound;
		this.attack = attack;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getAttack() {
		return attack;
	}
	public void setAttack(String attack) {
		this.attack = attack;
	}
	@Override
	public String toString() {
		return "Squirtle [name=" + name + ", sound=" + sound + ", attack=" + attack + "]";
	}
	
}

//게임을 플레이 하는 클래스
class GamePlay{
	void sound(Pikachu pika) {
		//예)피카츄가 피카피카 
		System.out.println(pika.getName() +"가 " + pika.getSound());
	}
	void attack(Pikachu pika) {
		//예)피카츄가 전기공격
		System.out.println(pika.getName() + "가 " + pika.getAttack());
	}
	
	void sound(Squirtle squi) {
		System.out.println(squi.getName() +"가 " + squi.getSound());
	}
	void attack(Squirtle squi) {
		System.out.println(squi.getName() + "가 " + squi.getAttack());
	}
}

public class J20220225_01_Pokemon {
	public static void main(String[] args) {
		Pikachu pika = new Pikachu("피카츄", "피카피카", "전기공격");
		System.out.println(pika);
		Squirtle squi = new Squirtle("꼬부기", "꼬북꼬북", "물공격");
		
		GamePlay play = new GamePlay();
		play.sound(pika);
		play.attack(pika);
		play.sound(squi);
		play.attack(squi);
	}

}
