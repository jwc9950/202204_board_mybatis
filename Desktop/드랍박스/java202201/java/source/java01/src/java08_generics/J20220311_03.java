package java08_generics;
//사과, 1000 
//홍길동, 165.5
//1 , 현빈
class Generic<K,V>{
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Generic [key=" + key + ", value=" + value + "]";
	}
	
}

public class J20220311_03 {
	public static void main(String[] args) {
		Generic<String, Integer> item = new Generic<>();
		item.setKey("사과"); item.setValue(1000);
		System.out.println(item);
		Generic<String, Double> std = new Generic<>();
		std.setKey("홍길동"); std.setValue(165.5);
		System.out.println(std);
		Generic<Integer, String> info = new Generic<>();
		info.setKey(1); info.setValue("현빈");
		System.out.println(info);
		
		
		
	}

}
