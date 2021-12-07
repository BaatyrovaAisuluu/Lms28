package com.company;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        sqrt деген метод тузунуз.
//        UnaryOperator деген интерфейстин реализациясын кайтаруусу керек
//        Бир санды кабыл алып анын тамырдан чыккан жообун кайтарат(корень)
//
//        public static UnaryOperator<Double> sqrt()


        Scanner sc = new Scanner(System.in);
        UnaryOperator<Double> unary =sqrt() ;
        System.out.println(unary.sqrt1(sc.nextDouble()));

    }

    public static UnaryOperator<Double> sqrt (){
        return (x) ->Math.sqrt( x);
    }
}
