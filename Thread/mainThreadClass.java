import java.util.Collections;

public class mainThreadClass {

    public static void main( String[] args ) throws InterruptedException  {

    //================4===============================================
//        PrimeThread p1=new PrimeThread(1,200000);
//        PrimeThread p2=new PrimeThread(200001,400000);
//        PrimeThread p3=new PrimeThread(400001,600000);
//        PrimeThread p4=new PrimeThread(600001,800000);
//        PrimeThread p5=new PrimeThread(800001,1000000);
//
//
//       // p1.start();
//        PrimeThread [] p={p1,p2,p3,p4,p5};
//
//        for(PrimeThread pr:p)
//        {
//            pr.start();
//
//        }


        //==================5 and 6==================

        PrimeThread p1=new PrimeThread(1,100000);
        PrimeThread p2=new PrimeThread(100001,200000);
        PrimeThread p3=new PrimeThread(200001,300000);
        PrimeThread p4=new PrimeThread(300001,400000);
        PrimeThread p5=new PrimeThread(400001,500000);
        PrimeThread p6=new PrimeThread(500001,600000);
        PrimeThread p7=new PrimeThread(600001,700000);
        PrimeThread p8=new PrimeThread(700001,800000);
        PrimeThread p9=new PrimeThread(800001,900000);
        PrimeThread p10=new PrimeThread(900001,1000000);

        PrimeThread p[]={p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        for(PrimeThread pr:p)
        {
            pr.start();

        }




    }
}
