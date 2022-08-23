package OnlineClass.Exp3;


public class RDAccount extends Account {
    static double interestRate;
    static double amount;
    static int noOfMonths;
    static double monthlyAmount;
    static int ageOfACHolder1;

        public static double calculateInterest () {
            try {
                if(!(noOfMonths==6 || noOfMonths==9 || noOfMonths==12 || noOfMonths==15 || noOfMonths==18 || noOfMonths==21)){throw new myException("Maturity period months are: 6, 9, 12, 15, 18, 21.\nPlease enter months from the M.P list provided.");}
                if (ageOfACHolder1 > 60) { //>60 are senior citizens.
                    if (noOfMonths == 6) {
                        interestRate = 8.00;
                    } else if (noOfMonths == 9) {
                        interestRate = 8.25;
                    } else if (noOfMonths == 12) {
                        interestRate = 8.50;
                    } else if (noOfMonths == 15) {
                        interestRate = 8.75;
                    } else if (noOfMonths == 18) {
                        interestRate = 9.00;
                    } else if (noOfMonths == 21) {
                        interestRate = 9.25;
                    }
                } else {  //general
                    if (noOfMonths == 6) {
                        interestRate = 7.50;
                    } else if (noOfMonths == 9) {
                        interestRate = 7.75;
                    } else if (noOfMonths == 12) {
                        interestRate = 8.00;
                    } else if (noOfMonths == 15) {
                        interestRate = 8.25;
                    } else if (noOfMonths == 18) {
                        interestRate = 8.50;
                    } else if (noOfMonths == 21) {
                        interestRate = 8.75;
                    }
                }
                return monthlyAmount * noOfMonths * (noOfMonths + 1) * interestRate / 2400;
            }catch (Exception e){System.err.println(e.getMessage());}
            return 0;
        }
}
