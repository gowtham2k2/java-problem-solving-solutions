public class Cat extends Animal implements Runnable, AnimalStuff {

    String name;
    String ownerName;
    int threadNo;
    static String type = "Cat";

    @Override
    public void poop() {
        System.out.println(poop);

    }

    public String sound() {
        return "Meow";
    }

    Cat(int age, String name, int tno, String ownerName) {
        super(type, age);
        this.name = name;
        this.ownerName = ownerName;
        this.threadNo = tno;
    }

    @Override // it will override run()
    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println(name + " " + age + " from thread " + threadNo + " its owner is " + ownerName
                    + " petStore is " + Store.name + " pincode: " + pin);
        poop();
        System.out.println(sound());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }

}