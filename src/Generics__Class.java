import java.util.*;


class Fruit implements Eatable{
	public String toString() {return "Fruit";}
}

class Apple extends Fruit{public String toString() {return "Apple";}}
class Grape extends Fruit{public String toString() {return "Grape";}}
class Toy				 {public String toString() {return "Toy";}}

interface Eatable{}



public class Generics__Class {

	public static void main(String[] args) {
		
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grpaeBox2 = new FruitBox<Apple>(); 지네릭 타입 불일치 
//		FruitBox<Toy> tyoBox = new FruitBox<Toy>(); 
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); appleBox의 add(Apple item) Apple의 자손만 가능 
		grapeBox.add(new Grape());
		
		
		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grpaeBox-"+grapeBox);
		 

	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{} //제한된 지네릭 클래스 
//타입 문자로 사용할 타입을 명시하면 한 종류의 타입만 저장할 수 있도록 제한할 수 있지만
// 그래도 여전히 모든 종류의 타입을 지정할 수 있다는 것에는 변함이 없다.
// 타입 매개변수 T에 지정할 수 있는 타입의 종류를 제한할 수 있는 방법은 class 만들때 class에 지네릭 클래스 붙이기 
// 타입 매개변수에 올 수 있는 타입을 제한하는 클래스 지네릭 

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}
