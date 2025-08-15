public class FinalMethodInheritsTest {
    public static void main(String[] args) {
        Child_00 obj = new Child_00();
        obj.display();
    }

}
class Person_00{
    final void display(){
        System.out.println("Final method in Person_00");

    }
}
class Child_00 extends Person_00{
    // this would cause a compile-time error :
    //final void display(){
    //        System.out.println("trying to override ");
   // }
}