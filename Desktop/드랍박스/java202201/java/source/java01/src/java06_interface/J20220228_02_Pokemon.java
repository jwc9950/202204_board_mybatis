package java06_interface;
interface Pokemon{
	//컴파일시점에서는 Pokemon의 getName을 체크
	String getName(); 
}
class Pikachu implements Pokemon{
	public String getName() {
		return "피카츄";
	}
}
class Squirtle implements Pokemon{
	//런타임시에는 자식메소드 실행
	public String getName() {
		return "꼬부기";
	}
}
//게임실행
class GamePlay{
	void attack(Pokemon poke) {
		System.out.println(poke.getName() + " 공격");
	}
}
public class J20220228_02_Pokemon {
	public static void main(String[] args) {
		Pikachu pika = new Pikachu();
		Squirtle squi = new Squirtle();
		GamePlay gplay = new GamePlay();
		gplay.attack(squi);
		gplay.attack(pika);
		
	}

}
