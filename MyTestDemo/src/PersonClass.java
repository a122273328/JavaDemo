import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonClass extends MyTestClass {

    public PersonClass() {
        this.sleeping();
    }

    /*存钱问题*/
    void money() {
        float count = 0;
        for (int i = 1; i < 200; i++) {
            count += 2.5f;

            if (count >= 100) {
                System.out.println("存了" + i + "天");
                break;
            }
            if (i % 5 == 0) {
                count -= 6;
            }
        }
    }

    /*输入问题*/
    void inputTest() {

        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个字符");
        s1 = sc.nextLine();
        System.out.println("第二个字符");
        s2 = sc.nextLine();
        System.out.println("字符串：" + s1 + s2);
    }

    /*兔子问题*/
    void rabbit() {
        int num1 = 1;//第一个月的兔子对数
        int temp = 1;//临时保存上个月兔子数
        int num = 0;//
        String m;//输入的月份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        m = sc.nextLine();
        int mm = Integer.valueOf(m);//转化整形的月份

        if (mm == 1 || mm == 2) {
            System.out.println("有一对兔子");
        } else if (mm > 2) {
            for (int i = 3; i <= mm; i++) {
                num = num1 + temp;
                num1 = temp;
                temp = num;
            }
            System.out.println("有" + num + "对兔子");
        }

    }

    /*水仙花*/
    void flowers() {

        String m;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        m = sc.nextLine();
        int mm = Integer.valueOf(m);//转化整形

        int j, k, l;
        for (int i = 100; i < mm; i++) {

            j = i % 10;
            k = i / 10 % 10;
            l = i / 100;

            if ((j * j * j + k * k * k + l * l * l) == i) {//满足水仙花数

                System.out.println("水仙花：" + i);
            }
        }
    }


    /*排序问题*/
    void forSortAction() {//冒泡排序
        int[] arr = {4, 2, 18, 300, 9, 100, 50};//自定义需要排序数组
        for (int i = 0; i < arr.length - 1; i++) {//外圈循环

            for (int j = 0; j < arr.length - 1 - i; j++) {//内圈取值比较

                if (arr[j] > arr[j + 1]) {//前一个数字大于后一个，需要互相交换

                    int t = arr[j];//临时保存前一个数字
                    arr[j] = arr[j + 1];//将后一个数字交换给前一个
                    arr[j + 1] = t;//将前一个数字交换给后一个

                }
            }
        }
        for (int num : arr) {//输出排序
            System.out.println(num);
        }


    }

    /*排序问题*/
    void selectSortAction() {//选择排序
        int[] arr = {4, 2, 18, 300, 9, 100, 50};//自定义需要排序数组

        for (int i = 0; i < arr.length; i++) {
            int tem = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[tem]) {
                    tem = j;
                }
            }
            int temp1 = arr[i];
            arr[i] = arr[tem];
            arr[tem] = temp1;
        }

        System.out.println("********");
        for (int num : arr) {//输出排序
            System.out.println(num);
        }
    }


    void testActions() {
        Scanner sc = new Scanner(System.in);
        int a;
        boolean isRight = false;
        System.out.println("欢迎使用Myshopping管理系统\n\n");
        System.out.println("********************************************************");
        System.out.println("\t\t1.客户信息管理");
        System.out.println("\t\t2.购物结算");
        System.out.println("\t\t3.真情回顾");
        System.out.println("\t\t4.注销");
        System.out.println("********************************************************\n");


        do {
            System.out.print("请选择，输入数字：");

            if (sc.hasNextInt()) {
                a = sc.nextInt();
            } else {
                System.out.println("输入错");
                 break;
            }
            switch (a) {
                case 1:
                    System.out.println("执行客户信息管理");
                    break;
                case 2:
                    System.out.println("执行购物结算");
                    break;
                case 3:
                    System.out.println("执行真情回顾");
                    break;
                case 4:
                    System.out.println("执行注销");
                    break;
                default:
                    System.out.println("输出错误，请重新输入数字：");
                    break;

            }

        } while (isRight = ((a > 4) || (a <= 0)));
        System.out.println("程序结束");

    }

    void  ttt(){

//        //从键盘上接收一批整数，比较并输出其中最大值和最小值
//        //输入数字0时结束循环
//        //声明两个变量 max和min ,分别记录最大值和最小值
//        //将用户输入的数字num和上面的两个变量作比较，使得max保存当前最大值
//        // min 始终保持当前最小值
//        int max = 0,min = 0,num;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一个整数（输入0结束）:");
//        num = sc.nextInt();
//        max = num;
//        do {
//            if(max < num) {
//                max = num;
//            }else{
//                min = num;
//            }
//            System.out.print("请输入一个整数（输入0结束）:");
//            num = sc.nextInt();
//        }while(num != 0);
//        System.out.println("最大值是："+max+"最小值是："+min);

        //从键盘上输入一位整数，当输入 1~7时，显示下面对应得英文星期名称缩写
        //1:MON 2:TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN
        //输入其他数字时提示用户重新输入，输入数字0时结束
        Scanner sc = new Scanner(System.in);
        int num ;
        do {
            System.out.println("请输入数字1-7(输入0结束)");
            num = sc.nextInt();
            switch(num) {
                case 1:
                    System.out.println("今天是 MON");
                    break;
                case 2:
                    System.out.println("今天是 TUE");
                    break;
                case 3:
                    System.out.println("今天是 WED");
                    break;
                case 4:
                    System.out.println("今天是 THU");
                    break;
                case 5:
                    System.out.println("今天是 FRI");
                    break;
                case 6:
                    System.out.println("今天是 SAT");
                    break;
                case 7:
                    System.out.println("今天是 SUN");
                    break;
                default:
                    System.out.println("请输入1 -7");
                    break;
            }
        }while(num != 0);
        System.out.println("程序结束");
    }






}
