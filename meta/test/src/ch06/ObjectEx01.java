package ch06;

class Dog {
	String name = "����";	
}

class Cat {
	String name = "�߿���";
}


public class ObjectEx01 {

	public static void main(String[] args) {
		Object o1 = new Dog();
		Object o2 = new Cat();
		
		Dog d1 = (Dog)o1;
		Cat c1 = (Cat)o2;
		
		System.out.println(d1.name);
		System.out.println(c1.name);
	}

}
