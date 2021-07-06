public class PrimeThread extends Thread {

    int initial;
    int des;

    PrimeThread(int initial,int des) {

        this.initial=initial;
        this.des=des;

    }


    public void run() {
        for (int i = initial; i <des ; i++) {
            if(isPrime(i))
            {
                System.out.println(i);
            }

        }

    }


    public boolean isPrime(int n)
    {
       if(n<=1)
           return false;
        for (int i = 2; i <n ; i++) {

            if(n%i==0)
                return false;
        }

        return true;

    }
}

