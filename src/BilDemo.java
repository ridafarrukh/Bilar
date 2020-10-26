public class BilDemo {
    public static void main(String[] args) {
        Bil bil1;
        bil1 = new Bil();

        Bil bil2;
        bil2 = new Bil();

        Bil bil3;
        bil3 = new Bil();

        Bil bil4;
        bil4 = new Bil();

        Bil bil5;
        bil5 = new Bil();


        bil1.model = "Volvo";
        bil1.price = 200_000;
        bil1.year = 2011;

        bil2.model = "Saab";
        bil2.price = 150_000;
        bil2.year = 2018;

        bil3.model = "Audi";
        bil3.price = 300_000;
        bil3.year = 2019;

        bil4.model = "Prius";
        bil4.price = 80_000;
        bil4.year = 2015;

        bil5.model = "BMW";
        bil5.price = 350_000;
        bil5.year = 2020;

        System.out.printf("%s från år %d kostar : %,d kr \n", bil1.model,bil1.year,bil1.price);
        System.out.printf("%s från år %d kostar : %,d kr \n", bil2.model,bil2.year,bil2.price);
        System.out.printf("%s från år %d kostar : %,d kr \n", bil3.model,bil3.year,bil3.price);
        System.out.printf("%s från år %d kostar : %,d kr \n", bil4.model,bil4.year,bil4.price);
        System.out.printf("%s från år %d kostar : %,d kr \n", bil5.model,bil5.year,bil5.price);






    }
}
