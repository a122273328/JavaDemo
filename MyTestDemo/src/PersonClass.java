import java.util.Scanner;

public class PersonClass extends MyTestClass{

    public PersonClass(){
        this.sleeping();
    }
/*存钱问题*/
    void money(){
        float count = 0;
        for (int i = 1; i < 200; i ++){
            count += 2.5f;

            if (count >= 100){
                System.out.println("存了"+i+"天");
                break;
            }
            if (i%5 == 0){
                count -= 6;
            }
        }
    }
/*输入问题*/
    void inputTest(){

        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个字符");
        s1 = sc.nextLine();
        System.out.println("第二个字符");
        s2 = sc.nextLine();
        System.out.println("字符串："+s1+s2);
    }
    /*兔子问题*/
    void rabbit(){
        int num1 = 1;//第一个月的兔子对数
        int temp = 1;//临时保存上个月兔子数
        int num = 0;//
        String m;//输入的月份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        m = sc.nextLine();
        int mm = Integer.valueOf(m);//转化整形的月份

        if (mm == 1 || mm == 2){
            System.out.println("有一对兔子");
        }else if (mm > 2){
            for (int i = 3; i <= mm; i++){
                num = num1+ temp;
                num1 = temp;
                temp = num;
            }
            System.out.println("有"+num+"对兔子");
        }

    }

    /*水仙花*/
    void flowers(){

        String m;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        m = sc.nextLine();
        int mm = Integer.valueOf(m);//转化整形

        int j,k,l;
        for (int i = 100; i < mm;i++){

            j = i%10;
            k = i/10%10;
            l = i/100;

            if ((j*j*j + k*k*k + l*l*l)== i){//满足水仙花数

                System.out.println("水仙花："+i);
            }
        }
    }

}
