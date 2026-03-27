package practice;

class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void printNames() {
        System.out.println(name);        // Child
        System.out.println(super.name);  // Parent
    }
    
    public static void main(String[] args) {
		Child ch = new Child();
		ch.printNames();
	}
}
