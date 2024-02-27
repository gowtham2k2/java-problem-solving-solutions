public abstract class Animal {
    
    String type;
    int age;
    Animal(String type, int age){
        this.type = type;
        this.age = age;
    }

    abstract String sound();
}
