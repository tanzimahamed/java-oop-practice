
public class Inner_ClassTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();
        // output Outer variable : 10
    }
}
//Outer class
class Outer{
    int outerVer = 10;      // static int outerVer=10;-- use korle inner class r object lage na
    //inner class
    class Inner{       // static class---static class Inner {} use korte hobe
        void display(){
            System.out.println("Outer variable : "+outerVer);
        }
    }

    //  Inner class---require an object of the outer class
    void callInner(){     // static use korle obj lagbe na
        Inner inr= new Inner();
        inr.display();
    }
}