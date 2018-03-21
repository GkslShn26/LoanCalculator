import java.util.Scanner;

public class LoanCalculator {

    private Loan loan;

    public static void main(String[] arg){

        LoanCalculator calculator = new LoanCalculator();
        calculator.start();



    }



    private void start(){

        describeProgram();
        getInput();
        displayOutput();



    }


    private void getInput(){

        double loanAmount, annualInterestRate;

        int loanPeriod;


        Scanner reader = new Scanner(System.in);
        System.out.println("loanAmount: ");

        loanAmount = reader.nextDouble();

        System.out.println("annualInterestRate: ");

        annualInterestRate = reader.nextDouble();

        System.out.println("loanPeriod: ");


        loanPeriod= reader.nextInt();

        reader.close();

        loan = new Loan(loanAmount,annualInterestRate,loanPeriod);



    }


    private void displayOutput(){

        System.out.println("Loan Amount: "+loan.getAmount());

        System.out.println("Annual Interest Rate: "+loan.getRate() );

        System.out.println("Loan Period : "+loan.getPeriod());

        System.out.println("Monty payment is : "+loan.getMontlyPayment());

        System.out.println("Total Amount: "+loan.getTotalPayment());






    }


    private  void describeProgram(){
        System.out.println("This is a loan calculator programs ");


    }











}
