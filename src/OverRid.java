public class OverRid {
    void m1(){
        for (int i=0;i<5;i++){
            System.out.println("first");
        }
    }
}
class MyTest extends OverRid{
       void m1(){
       for(int i=0;i<5;i++){
           System.out.println("second");
       }
   }

    public static void main(String[] args) {
        OverRid r=new MyTest();
        r.m1();

    }
}
