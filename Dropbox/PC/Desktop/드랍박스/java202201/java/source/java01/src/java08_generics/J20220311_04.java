package java08_generics;
class Pen{
	private String name;
	public Pen(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Pen [name=" + name + "]";
	}
}
class Note{
	private String name;
	public Note(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Note [name=" + name + "]";
	}
}
class Box<T> {
	private T thing;
	public Box(T thing) {
		this.thing = thing;
	}
	@Override
	public String toString() {
		return "Box [thing=" + thing + "]";
	}
}

public class J20220311_04 {
	public static void main(String[] args) {
		Box<Pen> box = new Box<>(new Pen("모나미펜"));
		System.out.println(box);
		Box<Note> noteBox = new Box<>(new Note("스프링"));
		System.out.println(noteBox);
		
		
	}

}
