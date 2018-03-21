public class Loan {

    private double loanAmount;
    private double montlyInterestRate;
    private int numberOfPayments;


    public Loan(double amount, double rate, int period){






    }


    public double getAmount(){


        return loanAmount;

    }

    public int getPeriod(){

        return numberOfPayments / 12;

    }

    public double getRate() {
        return montlyInterestRate * 100.0 * 12;


    }

    public void setAmount(double amount){
        loanAmount = amount;
    }

    public void setRate(double annualRate){

        montlyInterestRate = annualRate /100.0 /12;


    }

    public void setPeriod(int periodYears){

        numberOfPayments = periodYears*12;

    }

    public double getMontlyPayment(){


        double montlyPayments = 0;

        montlyPayments = (loanAmount * montlyPayments) / (1 - Math.pow(1/(1 + montlyPayments),numberOfPayments));
        return montlyPayments;




    }

    public double getTotalPayment(){

        double totalPayment;

        totalPayment = getMontlyPayment() * numberOfPayments;

        return totalPayment;


    }





}
