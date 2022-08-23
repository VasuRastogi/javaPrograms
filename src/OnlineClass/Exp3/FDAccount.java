package OnlineClass.Exp3;

public class FDAccount extends Account {
    static double interestRate;
    static double amount;
    static int noOfDays;
    static int ageOfACHolder;


    public static double calculateInterest () {
        try {
            if(noOfDays<0){throw new myException("Invalid Number of days. Please enter correct values.");}
            if (amount < 10000000) { // below 1 cr
                if (ageOfACHolder > 60) { //>60 are senior citizens.
                    if (noOfDays >= 7 && noOfDays <= 14) {
                        interestRate = 5.00;
                    } else if (noOfDays >= 15 && noOfDays <= 29) {
                        interestRate = 5.25;
                    } else if (noOfDays >= 30 && noOfDays <= 45) {
                        interestRate = 6.00;
                    } else if (noOfDays >= 46 && noOfDays <= 60) {
                        interestRate = 7.50;
                    } else if (noOfDays >= 61 && noOfDays <= 184) {
                        interestRate = 8.00;
                    } else if (noOfDays >= 185) {
                        interestRate = 8.50;
                    }
                } else if (ageOfACHolder < 60) {  //general
                    if (noOfDays >= 7 && noOfDays <= 14) {
                        interestRate = 4.50;
                    } else if (noOfDays >= 15 && noOfDays <= 29) {
                        interestRate = 4.75;
                    } else if (noOfDays >= 30 && noOfDays <= 45) {
                        interestRate = 5.50;
                    } else if (noOfDays >= 46 && noOfDays <= 60) {
                        interestRate = 7.00;
                    } else if (noOfDays >= 61 && noOfDays <= 184) {
                        interestRate = 7.50;
                    } else if (noOfDays >= 185) {
                        interestRate = 8.00;
                    }
                }
            } else if (amount > 10000000) {  // amount <1 cr
                if (noOfDays >= 7 && noOfDays <= 14) {
                    interestRate = 6.50;
                } else if (noOfDays >= 15 && noOfDays <= 29) {
                    interestRate = 6.75;
                } else if (noOfDays >= 30 && noOfDays <= 45) {
                    interestRate = 6.75;
                } else if (noOfDays >= 46 && noOfDays <= 60) {
                    interestRate = 8.00;
                } else if (noOfDays >= 61 && noOfDays <= 184) {
                    interestRate = 8.50;
                } else if (noOfDays >= 185) {
                    interestRate = 10.00;
                }
            }
            return (interestRate * noOfDays * amount) / (365 * 100);
        }catch (Exception e){System.err.println(e.getMessage());}
        return 0;
    }
}
