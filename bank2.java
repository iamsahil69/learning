import java.util.*;
class bank_account{
  //area for data members....
  String Name;
  String Acc_no;
  String Acc_type;
  double balance;
  //area for method functions....
  Scanner input = new Scanner(System.in);
  bank_account(String a,String b,String c, double d){
    this.Name= a;
    this.Acc_no=b;
    this.Acc_type=c;
    this.balance=d;
  }
  void deposit(){
    System.out.print("How much money you want to deposit: ");
    double dep = input.nextDouble();
    this.balance = this.balance+dep;
      System.out.println("your account updated successfully!!!");
  }
  void withDraw(){
    System.out.println("Hi "+this.Name);
    System.out.println("Your current balance: "+this.balance);
    System.out.print("How much money you want to withdraw: ");
    Double withdraw=input.nextDouble();
    if (this.balance<withdraw) {
      System.out.println("you don't have that much money!!!");
    }
    else{
      this.balance=this.balance-withdraw;
      System.out.println("Transaction successful!!!");
      System.out.println("Your current balance: "+this.balance);
    }
  }
  void display(){
    System.out.println("Hi "+this.Name);
    System.out.println("Your current balance: "+this.balance);
  }
}
public class bank2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
      System.out.println("Welcome to your bank!!!");
    System.out.print("Enter your name: ");
    String Name=input.nextLine();
    System.out.print("Enter your Account no.: ");
    String Acc_no=input.nextLine();
    System.out.print("Enter your Account type: ");
    String Acc_type=input.nextLine();
    System.out.print("Enter your balance: ");
    double balance=input.nextDouble();
  bank_account Acc = new bank_account(Name, Acc_no,Acc_type,balance);
  int option;
  System.out.println("Here are your options:");
  while(true){
  System.out.println("1. Deposit");
  System.out.println("2. Withdraw");
  System.out.println("3. Display");
  System.out.println("4. Exit");
  System.out.print("Enter your choice: ");
  int m = input.nextInt();
  switch(m){
    case 1:{
        Acc.deposit();
        break;
    }
    case 2:{
        Acc.withDraw();
        break;
    }
    case 3:{
        Acc.display();
        break;
    }
    case 4:{
        System.out.println(Acc.Name+" Thanks for visiting, Vist again!!!");
        System.exit(1);
    }
    default:{
        System.out.println("Plz enter a valid option!!!");
    }
  }
}

}

}
