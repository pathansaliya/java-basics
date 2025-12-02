import java.util.Scanner;
public class BankSystem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int balance=0;
        int choice;
        do{
            System.out.println("==== Simple Banking Menu ====");
            System.out.println("1.Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter amount to deposit: ");
                int amount=sc.nextInt();
                if(amount > 0){
                    balance+=amount;
                    System.out.println("your money is deposited");
                }else{
                    System.out.println("Invalid amount");
                }
                break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;  // Using operator -
                        System.out.println("Withdrawn: " + withdraw);
                    } else {
                        System.out.println("Insufficient balance or invalid amount!");
                    }
                    break;
                    case 3:
                        System.out.println("your current balance is : "+balance);
                        break;
                    case 4:
                        System.out.println("Exiting");
                        break;
                    default:
                        System.out.println("Invalid choice, Try again");
            }
            sc.close();
        }while(choice!=4);
    }
}
