public class Odev1 {


    public   int factorial(int n)
    {
        int fac=1;
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        return fac;
    }


    public  double apprE(int termCount)
    {
        double f=1.0;
        double e=1.0;
        for(int i=1;i<termCount;i++){
            f=f*i;
            e=e+1/f;
        }
        return e;
    }


    public String digitByDigit(int number)
    {
        String sayi =String.valueOf(number);
        StringBuilder sayi1 = new StringBuilder();
        for (int i = 0; i < sayi.length(); i++) {
            if (i > 0) {
                sayi1.append(" ");
            }

            sayi1.append(sayi.charAt(i));
        }

        return sayi1.toString();
    }
}