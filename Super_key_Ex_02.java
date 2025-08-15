// Calling parent class method

public class Super_key_Ex_02 {
    public static void main(String[] args) {
        Dog_02 d = new Dog_02();
        d.eat();

    }
}
class Animal_02 {
    void  eat(){

        System.out.println("<UNK>");
    }
}
class Dog_02 extends Animal_02 {
    void eat(){
        super.eat();            // call parent class method use super keyword
        System.out.println("<Dog eat bones>");
    }
}
