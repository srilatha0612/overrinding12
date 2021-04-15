public class MyOver {

    public void m1(){
            System.out.println("this is true");
        }
    }

class MyOver2 extends MyOver {

        public void m1 () {

                System.out.println("this is false");
            }

    public static void main(String[] args) {
        MyOver2 o=new MyOver2();
        o.m1();
    }
        }



