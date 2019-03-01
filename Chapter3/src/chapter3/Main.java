package chapter3;

import chapter3.caseproblems.Event;
import chapter3.caseproblems.EventDemo;
import chapter3.caseproblems.Rental;
import chapter3.caseproblems.RentalDemo;
import chapter3.gamezone.PickTwoCards;
import chapter3.gamezone.TwoCharacters;
import java.util.Scanner;

/**
 *
 * @author Gerardo A A
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //a.
        int a = 10;
          int b = 32;
        ArithmeticMethods.displayNumberPlus10(a);
        ArithmeticMethods.displayNumberPlus100(a);
        ArithmeticMethods.displayNumberPlus1000(a);
        ArithmeticMethods.displayNumberPlus10(b);
        ArithmeticMethods.displayNumberPlus100(b);
        ArithmeticMethods.displayNumberPlus1000(b);
        
        ArithmeticMethods2 arithmeticMethods2 = new ArithmeticMethods2();
        ArithmeticMethods2.displayNumberPlus10(arithmeticMethods2.getA());
        ArithmeticMethods2.displayNumberPlus10(arithmeticMethods2.getB());
        //b.
        Percentages.computePercent(2.0,5.0);
        Percentages2.computePercent();
        //c.
        GasPrices.pricesPerGallon(120);
        //d.
        System.out.print("Ingresar un valor:");
        Integer x = scanner.nextInt();
        MetricConversion.inchesToCentimeters(x);
        MetricConversion.gallonsToLiters(x);
        //e.
        PaintCalculator.paintWall(10,15,20);
        //f.
        Insecure.premium(2000,2034);
        //g.
        Salary.weeklySalary(200,5,0);
        //h.
        Interest.investment(1000.0);
        //i.
        Sandwich sandwich = new Sandwich("onion","corn",4.99);
        TestSandwich test = new TestSandwich(sandwich);
        //j.
        Student student = new Student(123,45,100);
        ShowStudent.showStudent(student);
        Student student1 = new Student();
        ShowStudent.showStudent(student1);
        //k.
        BankAccount [] cuentas = new BankAccount[3];
        cuentas[0] = TestBankAccount.getData();
        cuentas[1] = TestBankAccount.getData();
        cuentas[2] = TestBankAccount.getData();
        for(BankAccount ct:cuentas)
            ct.showInfo();
        //l.
        Painting[] pinturas = new Painting[3];
        for(Painting p: pinturas)
            p = TestPainting.inicializePaint();
        
        
        //m. GAME ZONE
        PickTwoCards.pickTwoCards();
        //n.
        TwoCharacters.createCharacters();
        //o.
        Event boda = new Event();
        boda.setEventNumber("M123");
        boda.setGuests(200);
        EventDemo demo_boda = new EventDemo();
        demo_boda.setEvento(boda);
        demo_boda.showInfo();
        //p.
        Rental renta = new Rental();
        renta.setContact_number("ER34");
        renta.setHoursAndMinutes(181);
        RentalDemo renta_demo = new RentalDemo(renta);
        renta_demo.showInfo();
    }   
}
