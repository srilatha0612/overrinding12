public class Exm {
    public void m1(){
        System.out.println("this is first");
    }
}
class Exam{
    public void m1(){
        System.out.println("this is second");
    }

    public static void main(String[] args) {
        Exam e=new Exam();
        e.m1();
    }
}
