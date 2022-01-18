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
//		FruitBox<Grape> grpaeBox2 = new FruitBox<Apple>(); ���׸� Ÿ�� ����ġ 
//		FruitBox<Toy> tyoBox = new FruitBox<Toy>(); 
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); appleBox�� add(Apple item) Apple�� �ڼո� ���� 
		grapeBox.add(new Grape());
		
		
		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grpaeBox-"+grapeBox);
		 

	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{} //���ѵ� ���׸� Ŭ���� 
//Ÿ�� ���ڷ� ����� Ÿ���� ����ϸ� �� ������ Ÿ�Ը� ������ �� �ֵ��� ������ �� ������
// �׷��� ������ ��� ������ Ÿ���� ������ �� �ִٴ� �Ϳ��� ������ ����.
// Ÿ�� �Ű����� T�� ������ �� �ִ� Ÿ���� ������ ������ �� �ִ� ����� class ���鶧 class�� ���׸� Ŭ���� ���̱� 
// Ÿ�� �Ű������� �� �� �ִ� Ÿ���� �����ϴ� Ŭ���� ���׸� 

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}
