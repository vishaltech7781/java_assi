import java.util.Scanner;

public class BankAccountApp {

    static class LowBalanceException extends Exception{
        public LowBalanceException(String message){
            super(message);
        }
    }

    static class NegativeNumberException extends Exception{
        public NegativeNumberException(String message){
            super(message);
        }
    }

    static class BankAccount{
        private String accHolder;
        private double balance;

        public BankAccount(String accHolder, double balance){
            this.balance = balance;
            this.accHolder = accHolder;
        }

        public void balanceEnquiry(){
            System.out.println("Account holder : "+accHolder);
            System.out.println("Current Balance : "+balance);
        }

        public void deposite(double amount) throws NegativeNumberException{
            if(amount < 0){
                throw new NegativeNumberException("Cannot add negative amount");
            }

            balance = balance+amount;
            System.out.println(amount+" Amount added !");
            System.out.println("Current balance : "+balance);
        }

        public void withdraw(double amount) throws NegativeNumberException, LowBalanceException{
            if(balance < 0){
                throw new LowBalanceException("Balance not sufficient");
            }
            if(amount < 0){
                throw new NegativeNumberException("Cannot add negative amount");
            }

            balance = balance - amount;
            System.out.println(amount + " is withdrawn");
            System.out.println("Current balance : "+balance);
        }

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter account holder name : ");
            String accHolder = scan.nextLine();

            System.out.println("Enter Initial balance : ");
            double balance = scan.nextDouble();

            BankAccount bank = new BankAccount(accHolder, balance);

            while (true){

                System.out.println("1. Balance Enquiry");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                System.out.print("Enter your choice : ");
                int choice = scan.nextInt();
            try {
                switch (choice) {

                    case 1:
                        bank.balanceEnquiry();
                        break;

                    case 2:
                        System.out.print("Enter amount to deposite : ");
                        Double amount = scan.nextDouble();
                        bank.deposite(amount);
                        break;

                    case 3:
                        System.out.println("Enter amount to withdraw : ");
                        Double amount2 = scan.nextDouble();
                        bank.withdraw(amount2);
                        break;

                    case 4:
                        System.out.println("Exiting....");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            }
            catch (LowBalanceException | NegativeNumberException e){
                System.out.println("Exception : " + e.getMessage());
            }
            }
        }
    }
}
