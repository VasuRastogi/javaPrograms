package OnlineClass.Exp1;

// my program needs to take emp ID and display information.

import java.util.Scanner;

class exp1{
    static String [] yellowArr = new String[]{"Emp no.", "Emp Name", "Join Date", "Desig Code", "Dept", "Basic", "HRA", "IT"};
    static String [][] blueArr = new String[][]{
            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
            {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
            {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
            {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
            {"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
            {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
    };
    public static int CalculateSalary(String empId, int index){
        int basic = Integer.parseInt(blueArr[index][5]);
        int HRA = Integer.parseInt(blueArr[index][6]);
        int DA = Integer.parseInt(findDAsalary(blueArr[index][3]));
        int IT = Integer.parseInt(blueArr[index][7]);
        return basic+HRA+DA-IT;
    }
    static String [] DesigYellow = new String[]{"Designation Code", "Designation", "DA"};
    static String [][] DesigBlue = new String [][]{
            {"e", "Engineer", "20000"},
            {"c", "Consultant", "32000"},
            {"k", "Clerk", "12000"},
            {"r", "Receptionist", "15000"},
            {"m", "Manager", "40000"}
    };
    static String [] result_table_head = new String []{"Emp No.", "Emp Name", "Department", "Designation", "Salary"};
    static String [] result_table_body = new String [5];

    static String findDesignation(String str){
        switch(str){
            case "e":
                return DesigBlue[0][1];
            case "c":
                return DesigBlue[1][1];
            case "k":
                return DesigBlue[2][1];
            case "r":
                return DesigBlue[3][1];
            case "m":
                return DesigBlue[4][1];
        }
        return "";
    }
    static String findDAsalary(String str){
        switch(str){
            case "e":
                return DesigBlue[0][2];
            case "c":
                return DesigBlue[1][2];
            case "k":
                return DesigBlue[2][2];
            case "r":
                return DesigBlue[3][2];
            case "m":
                return DesigBlue[4][2];
        }
        return "";
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String exp = sc.next();

        try{
            for(int i=0; i<=blueArr.length; i++) {
                if (Integer.parseInt(blueArr[i][0]) == Integer.parseInt(exp)){
                    result_table_body[0] = exp;
                    result_table_body[1] = blueArr[i][1];
                    result_table_body[2] = blueArr[i][4];
                    result_table_body[3] = findDesignation(blueArr[i][3]);
                    result_table_body[4] = String.valueOf(CalculateSalary(exp,i));
                    break;
                }
            }
            for (int j =0; j<result_table_head.length; j++){
                System.out.print(result_table_head[j]+"    ");
            }
            System.out.print("\n\n");
            for (int k=0; k<result_table_body.length; k++){
                System.out.print(result_table_body[k]+"        ");
            }
            System.out.print("\n\n");
        }catch(Exception e){System.err.println("There is no employee with empid : "+ exp);}
        sc.close();
    }
}
