public class Main {

    public static void main(String[] args) {

        MyTestClass dog = new MyTestClass();

        dog.size = MyTestClass.DogType.LARGE;

        /*打印小狗的属性*/
        System.out.println("小狗的名字是："+ dog.name + "小狗的年龄是："+dog.age+"小狗的颜色是："+dog.Color);
        /*小狗跑*/
        dog.run();
        /*小狗睡*/
        dog.sleeping();
        dog.hanger("💩");
        /*获取狗的名字*/
        System.out.println(dog.testName());
        dog.testFor();
        dog.switchTest();

        PersonClass person = new PersonClass();
//        person.money();
//        person.inputTest();
//        /*兔子问题*/
//        person.rabbit();
//        /*水仙花*/
//        person.flowers();
        /*排序*/
        person.forSortAction();
//        /*排序*/
        person.selectSortAction();
        /*测试*/
//        person.testActions();
        /*测试*/
        person.ttt();
    }
}
