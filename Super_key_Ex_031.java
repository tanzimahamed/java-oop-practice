// parameterized Constructor

public class Super_key_Ex_031 {
    public static void main(String[] args) {
        Dog_004 d =new Dog_004("Bread","dog");
    }
}
class Animal_04{
    String type;
    Animal_04(String type){
        this.type=type;
        System.out.println("Animal type:"+type);
    }
}
class Dog_004 extends Animal_04{
    String breed;
    Dog_004(String breed,String type){
        super(type);// must call parents parametrize constructor
        this.breed=breed;
        System.out.println(" Dog has been created ;" +breed);
    }
}