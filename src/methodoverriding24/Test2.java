package methodoverriding24;

import javafx.scene.chart.Axis;

public class Test2 {

    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();

        System.out.println("SBI Rate of Interst : " +s.getRateOfInterest());
        System.out.println("ICICI Rate of Interst : " +i.getRateOfInterest());
        System.out.println("AXIS Rate of Interst : " +a.getRateOfInterest());

    }
}
