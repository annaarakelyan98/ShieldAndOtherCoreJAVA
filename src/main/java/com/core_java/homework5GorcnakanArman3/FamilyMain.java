package com.core_java.homework5GorcnakanArman3;

import java.time.LocalDate;

public class FamilyMain {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today);

        System.out.println("\nMy family\n");

        //Granpa
        Family grandpa = new Family();
        grandpa.name = "Gagik";
        grandpa.surename = "Arakelyan";
        System.out.println(grandpa.name + " " + grandpa.surename);

        LocalDate date1 = LocalDate.of(1949, 9, 11);
        System.out.println("Date of Birth: " + date1);

        grandpa.TelNum("094-97-07-50");

        grandpa.HomeSpace("Kotayq");

        System.out.println();

        //Grandma
        Family grandma = new Family();
        grandma.name = "Rita";
        grandma.surename = "Arakelyan";
        System.out.println(grandma.name + " " + grandma.surename);

        LocalDate date2 = LocalDate.of(1951, 5, 4);
        System.out.println("Date of Birth: " + date2);

        grandma.TelNum("093-19-51-69");

        grandma.HomeSpace("Kotayq");

        System.out.println();

        //Father
        Family father = new Family();
        father.name = "Mher";
        father.surename = "Arakelyan";
        System.out.println(father.name + " " + father.surename);

        LocalDate date3 = LocalDate.of(1974, 8, 18);
        System.out.println("Date of Birth: " + date3);

        father.TelNum("094-98-08-59");

        father.HomeSpace("Kotayq");

        System.out.println();

        //Mather
        Family mother = new Family();
        mother.name = "Ruzan";
        mother.surename = "Jumayan";
        System.out.println(mother.name + " " + mother.surename);

        LocalDate date4 = LocalDate.of(1975, 3, 28);
        System.out.println("Date of Birth: " + date4);

        mother.TelNum("093-11-08-04");

        mother.HomeSpace("Kotayq");

        System.out.println();

        //Eldest bro
        Family eldBro = new Family();
        eldBro.name = "Arman";
        eldBro.surename = "Arakelyan";
        System.out.println(eldBro.name + " " + eldBro.surename);

        LocalDate date5 = LocalDate.of(1993, 10, 31);
        System.out.println("Date of Birth: " + date5);

        eldBro.TelNum("094-80-20-28");

        eldBro.HomeSpace("Zeytun");

        System.out.println();

        //Bro's wife
        Family wife = new Family();
        wife.name = "Varduhi";
        wife.surename = "Khudatyan";
        System.out.println(wife.name + " " + wife.surename);

        LocalDate date6 = LocalDate.of(1993,8,16);
        System.out.println("Date of Birth: " + date6);

        wife.TelNum("077-24-68-00");

        wife.HomeSpace("Zeytun");

        System.out.println();

        //Bro's son
        Family son = new Family();
        son.name = "Mher";
        son.surename = "Arakelyan";
        System.out.println(son.name + " " + son.surename);

        LocalDate date7 = LocalDate.parse("2019-02-24");
        System.out.println("Date of Birth: " + date7);

        son.HomeSpace("Zeytun");

        System.out.println();

        //Bro
        Family bro = new Family();
        bro.name = "Arthur";
        bro.surename = "Arakelyan";
        System.out.println(bro.name + " " + bro.surename);

        LocalDate date8 = LocalDate.of(1995,4,20);
        System.out.println("Date of Birth: " + date8);

        bro.TelNum("093-90-00-32");

        bro.HomeSpace("Kotayq");

        System.out.println();

        //me
        Family me = new Family();
        me.name = "Anna";
        me.surename = "Arakelyan";
        System.out.println(me.name + " " + me.surename);

        LocalDate date9 = LocalDate.of(1998,7,24);
        System.out.println("Date of Birth: " + date9);

        me.TelNum("077-30-79-53");

        me.HomeSpace("Kotayq");

        System.out.println();

        //sista
        Family sista = new Family();
        sista.name = "Manuela";
        sista.surename = "Arakelyan";
        System.out.println(sista.name + " " + sista.surename);

        LocalDate date10 = LocalDate.of(2000,11,4);
        System.out.println("Date of Birth: " + date10);

        sista.TelNum("093-35-04-04");

        sista.HomeSpace("Kotayq");

        System.out.println();
    }
}
