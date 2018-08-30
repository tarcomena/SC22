public class ChangeCompution {



    private int numOf20s;
    private int numOf10s;
    private int numOf5s;
    private int numOf1s;
    private int numOfQuarter;
    private int numOfDimes;
    private int numOfNickles;
    private int numOfPennies;


    public static void main(String[] args) {



    }

    public static double roundMoneyToTwoDecimals(double moneyInput){
        double precision=10000;
        int holdingVar=(int)(moneyInput*precision);

        //System.out.print(holdingVar);

        //fixes 1.009 turning to 1.008999... bug
        if(holdingVar%10>4){
            holdingVar=holdingVar+10-(holdingVar%10);

        }
        else{
            holdingVar=holdingVar-holdingVar%10;
        }
        //System.out.println(" "+holdingVar);



        if(holdingVar%100>40){
            holdingVar=holdingVar+100-(holdingVar%100);

        }
        else{
            holdingVar=holdingVar-holdingVar%100;
        }


        return holdingVar/precision;
    }


}
