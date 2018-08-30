import java.util.Scanner;

public class ChangeCompution {


    private Scanner input= new Scanner(System.in);
    private int numOf20s;
    private int numOf10s;
    private int numOf5s;
    private int numOf1s;
    private int numOfQuarter;
    private int numOfDimes;
    private int numOfNickles;
    private int numOfPennies;

    public ChangeCompution(){

        numOf20s=(int)(Math.random()*(16 - 1))+1;
        numOf10s=(int)(Math.random()*(16 - 1))+1;
        numOf5s=(int)(Math.random()*(16 - 1))+1;
        numOf1s=(int)(Math.random()*(16 - 1))+1;
        numOfQuarter=(int)(Math.random()*(16 - 1))+1;
        numOfDimes=(int)(Math.random()*(16 - 1))+1;
        numOfNickles=(int)(Math.random()*(16 - 1))+1;
        numOfPennies=(int)(Math.random()*(16 - 1))+1;


    }


    public void transaction(){

        //printMoneyIn();
        boolean running=true;
        while (running) {
            System.out.print("Please type in the price:");
            String priceOfItemStr = input.nextLine();


            System.out.print("Please type your payment amount:");
            String amountPaidStr = input.nextLine();

            if (checkForValiadInput1(priceOfItemStr) && checkForValiadInput1(amountPaidStr) && running) {
                double priceOfItem = roundMoneyToTwoDecimals(Double.valueOf(priceOfItemStr));
                double amountPaid = roundMoneyToTwoDecimals(Double.valueOf(amountPaidStr));

               // System.out.println(priceOfItem);
                //System.out.println(amountPaid);

                if (priceOfItem > amountPaid) {
                    System.out.println("Im sorry your payment needs to be larger than the price");
                    running=askToEnd();

                }


                else{

                    changeCalculation(amountPaid,priceOfItem);
                    running=askToEnd();

                }


            }
            else {
                running =askToEnd();

            }

        }
    }


    private void changeCalculation(double payment, double price){
        double precision=10000;

        int changeInt = (int)(payment*precision)-(int)(price*precision);

        String change="Your change is $"+roundMoneyToTwoDecimals(changeInt/precision);











    }

    // makes sure input can be a double
    private boolean checkForValiadInput1(String userinput){

        boolean valid=true;

        for(int i=0;i<userinput.length();i++){

            switch (userinput.charAt(i)){
                case '0': valid=true;
                          break;
                case '1': valid=true;
                          break;
                case '2': valid=true;
                          break;
                case '3': valid=true;
                          break;
                case '4': valid=true;
                          break;
                case '5': valid=true;
                          break;
                case '6': valid=true;
                          break;
                case '7': valid=true;
                          break;
                case '8': valid=true;
                          break;
                case '9': valid=true;
                          break;
                case '.': valid=true;
                          break;
                default: valid=false;
                        i=userinput.length();
                         break;
            }
        }

        if(!valid){
           System.out.println("Sorry "+userinput+" is not a valid number for transactions \nOnly XX.XX or XX format accepted and no negative numbers please");
        }


        return valid;
    }



    private boolean askToEnd(){
        System.out.println("If you wish to end transaction type end");

        return !("end".equals(input.nextLine()));



    }

    private double moneyInChangeCompution(){
        double total=0;

        total+=numOf20s*20;
        total+=numOf10s*10;
        total+=numOf5s*5;
        total+=numOf1s*1;
        total+=numOfQuarter*.25;
        total+=numOfDimes*.1;
        total+=numOfNickles*.05;
        total+=numOfPennies*.01;

        return roundMoneyToTwoDecimals(total);

    }

    // exist to debugging
    public void printMoneyIn(){


        System.out.println("Number of 20s:"+numOf20s+" equals $"+numOf20s*20);
        System.out.println("Number of 10s:"+numOf10s+" equals $"+numOf10s*10);
        System.out.println("Number of 5s:"+numOf5s+" equals $"+numOf5s*5);
        System.out.println("Number of 1s:"+numOf1s+" equals $"+numOf1s);
        System.out.println("Number of Quarters:"+numOfQuarter+" equals $"+roundMoneyToTwoDecimals(numOfQuarter*.25));
        System.out.println("Number of Dimes:"+numOfDimes+" equals $"+roundMoneyToTwoDecimals(numOfDimes*.10));
        System.out.println("Number of Nickles:"+numOfNickles+" equals $"+roundMoneyToTwoDecimals(numOfNickles*.05));
        System.out.println("Number of Penniess:"+numOfPennies+" equals $"+roundMoneyToTwoDecimals(numOfPennies*.01));
        System.out.println("Total amount in machine is $"+moneyInChangeCompution());



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
