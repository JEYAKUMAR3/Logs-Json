import jdk.jfr.internal.JVM;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.util.Scanner;

public class Logging
{
    public static void main(String args[])
    {
        // log4j file address:
        try {
            String path = "/home/jeya-zstk225/eclipse-workspace/Assignment-log/src/log4j.properties";
            PropertyConfigurator.configure(path);

            Scanner scan = new Scanner(System.in);

            //getting loan process:
            System.out.print("Enter Your Name: ");
            String Name = scan.nextLine();

            System.out.print("Enter Phone number: ");
            String Phone = scan.nextLine();

            System.out.print("Your Age: ");
            int Age = scan.nextInt();

            System.out.print("Type of Loan(Car,Home,Personal) :  ");
            scan.nextLine();
            String TypeOfLoan = scan.nextLine();

            System.out.print("Loan Amount : ");
            int LoanAmount = scan.nextInt();

            System.out.print("Your Salary: ");
            int Salary = scan.nextInt();

            System.out.print("your Occupation: ");
            scan.nextLine();
            String occupation = scan.nextLine();

            System.out.print("Place of work: ");
            String PlaceOfWork = scan.nextLine();

            System.out.print("Id proof of docx (Yes/No) : ");
            String IdProof = scan.nextLine();

            System.out.print("Address Proof of docx(Yes/No) : ");
            String AddressProof = scan.nextLine();

            System.out.print("Loan docx(Yes/No) : ");
            String LoanDocx = scan.nextLine();

            // These terms and conditions check whether you are eligible for a loan:
            if (Age < 18) {
                throw new LoggerException("Sorry, You don’t qualify for our age criteria for loans");
            } else if (LoanAmount > 100000 && Salary < 5000) {
                throw new LoggerException("Sorry, you may not be eligible for this loan amount.");
            } else if (LoanAmount < 25000) {
                throw new LoggerException("Sorry, loan amount is very less.");
            } else if (LoanAmount > 1000000) {
                throw new LoggerException("Loan for this amount is not possible if we don’t have surety or Guarantee.");
            } else if (!IdProof.equals("yes") || !IdProof.equals("Yes") || !LoanDocx.equals("yes") || !LoanDocx.equals("Yes")) {
                throw new LoggerException("Insufficient Documents.");
            } else {
                System.out.println("Your Loan Amount is Sanctioned.");
                System.out.println("Thank you.");
            }
        }
        catch(LoggerException ie) {
        }
    }
}
class LoggerException extends Exception{
    static Logger logger = Logger.getLogger(String.valueOf(LoggerException.class));

    LoggerException(String str)
    {
        logger.log(Level.ERROR,str);
    }
}












































