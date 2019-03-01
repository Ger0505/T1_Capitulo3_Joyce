package chapter3;

import java.text.DecimalFormat;

/**
 *
 * @author Gerardo A A
 */
public class ShowStudent {
    
    public static void showStudent(Student student){
        System.out.println("ID: "+student.getID());
        System.out.println("No. de puntos: "+student.getNumber_point());
        System.out.println("Credito de horas: "+student.getCredit_hours());
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Promedio: "+df.format(student.getAverage()));
    }
    
}
