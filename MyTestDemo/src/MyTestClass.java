import java.lang.reflect.Array;

public class MyTestClass {

    public MyTestClass(){
        System.out.println("这里是构造方法");
        this.run();
        this.sleeping();
    }

    /*属性*/
   String name = "小🐶";
   int age = 5;
   String Color = "黑色";
   enum DogType{SMALL_DOG,MEDIUM_DOG,LARGE}
   DogType size;

   /*行为*/
   void run(){

       if (size == DogType.SMALL_DOG){
           System.out.print("小狗会跑\n");
       }else if (size == DogType.MEDIUM_DOG){
           System.out.print("中型狗会跑\n");
       }else {
           System.out.println("大型狗会跑");
       }


   }
   void sleeping(){

       if (size == DogType.SMALL_DOG){
           System.out.print("小狗跑一会睡着了\n");
       }else if (size == DogType.MEDIUM_DOG){
           System.out.print("中型狗跑一会睡着了\n");
       }else {
           System.out.println("大型狗狗跑一会睡着了");
       }
    }

    void hanger(String foot){
        System.out.println("狗想吃"+foot);
    }

    String testName(){

       return "就是我，带有返回值的";
    }



}
