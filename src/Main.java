public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        // task9();
        // task10();

    }


    public static void task1() {
        System.out.println("Задача №1");
    int solary=15000;
    int i=0;
    int total=0;
    while (total<2459000){
        total=total+solary;
        i=total/solary;

        System.out.println("месяц  "+i+"  сумма накоплений равна "+total+" руб");
    }}


    public static void task2() {
        System.out.println("Задача №2");
    int number=1;
    while (number<=10)
        {
            System.out.print( number+" ");number=number+1;}
        System.out.println();
    {
        for (int i = 10; i >= 1; i = i -1) {
                System.out.print(" "+i);
        }}
        System.out.println();}



    public static void task3() {
        System.out.println("Задача №3");
int born=17;
int motality=8;
int population=12000000;
for (int i=1; i <= 10; i++ ){
    int selekt=(population/1000);
    population=(population+selekt*(born-motality));
System.out.println("Год "+i+", численность населения составляет "+population+" человек");

    }}
        public static void task4() {
            System.out.println("Задача №4");
    int deposit=15000;
    int interestRate=7;
    for (int i=1; deposit<=12000000; i++) {
        deposit=deposit+deposit/100*7;
        System.out.println("на "+i+" месяц сумма равняется "+deposit);
    }
}
    public static void task5() {
        System.out.println("Задача №5");
        int deposit=15000;
        int interestRate=7;
        for (int i=1; deposit<=12000000; i++) {
            deposit=deposit+deposit/100*7;
            if (i%6==0){
            System.out.println("на "+i+" месяц сумма равняется "+deposit);
        }
    }}
    public static void task6() {
        System.out.println("Задача №6");
        int deposit=15000;
        int interestRate=7;
        for (int i=1; i<=12*9; i++) {
            deposit=deposit+deposit/100*7;
            if (i%6==0){
                System.out.println("на "+i+" месяц сумма равняется "+deposit);
        }
    }}
    public static void task7() {
        System.out.println("Задача №7");
        int i=2;
        do {
            System.out.println("Сегодня пятница " + i+"-е число. Необходимо подготовить отчет");
            i = i + 7;

        }while (i < 31) ;

    }
    public static void task8() {
        System.out.println("Задача №8");
        int ourDays = 2023;
        int past = 200;
        int future = 100;
        for (int i = 1; i <=ourDays+future; i++) {
            if (i % 79 == 0)
                if (i > ourDays - past)
                    if (i < ourDays + future)
                        System.out.println("комета в "+i+" году");

        }
    }}




