//(c)VasuRastogi (github) 20BCS5135
package OnlineClass.Exp3;

public class SBAccount extends Account{
    static double interestRate;
    static double amount;
    static String type;


    public static double calculateInterest(){
        try {
            if (type.equals("Normal")) {
                interestRate = 4;
            } else if (type.equals("NRI")) {
                interestRate = 6;
            }else{throw new myException("Invalid response. please check for a typo or case related issues.");}
            return amount * interestRate / 100;
        }catch (Exception e){System.err.println(e.getMessage());}
        return 0;
    }
}
