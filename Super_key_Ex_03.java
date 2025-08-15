
//Default constructor (implicit super keyword)

public class Super_key_Ex_03 {
    public static void main(String[] args) {
        Dog_03 d=new Dog_03();


    }
}
class Animal_03  {
    Animal_03(){
        System.out.println("<Animal constructor >");

    }
}
class Dog_03 extends Animal_03  {
    Dog_03(){
        super();      // call parent class constructor use super keyword
        System.out.println("<dog class constructor >");
    }
}