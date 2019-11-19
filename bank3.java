import java.util.*;
class bank_acc{
 String Name;
 String Acc_No;
 String Acc_type;

}
class savings extends bank_acc{
  //area for data members....
  double Balance;
  Scanner input = new Scanner(System.in);
  //area for method functions....
  void getData(String n, String An){
    this.Name = n;
    this.Acc_No = An;
    this.Acc_type = "Savings";
    System.out.print("Enter your balance: ");
    this.Balance = input.nextDouble();
  }
  void deposit(){
    double dep;
    System.out.print("How much money you want to deposit: ");
    dep = input.nextDouble();
    this.Balance = this.Balance + dep;
    System.out.println("Your account updated successfully!!!");
  }
  void withDraw(){
    double withdraw;
    System.out.print("How much money you want to withdraw: ");
    withdraw = input.nextDouble();
    if (withdraw > this.Balance) {
      System.out.println("You don\'t have enough money in your account...");
    }
    else{
    this.Balance = this.Balance - withdraw;
    System.out.println("Your account updated successfully!!!");
  }
}
  void display(){
    System.out.println("Hi "+this.Name);
    System.out.println("Your current balance: "+this.Balance);
  }

}
class current extends bank_acc{
  //area for data members....
  double Balance;
  double Min_bal = 1000;
  Scanner input = new Scanner(System.in);
  //area for method functions....
  void getData(String n, String An){
    this.Name = n;
    this.Acc_No = An;
    this.Acc_type = "Current";
    System.out.println("You should have a minimum balance of Rs 1000 ");
    System.out.print("Enter your balance: ");
    this.Balance = input.nextDouble();
  }
  void penalty(){
    if(this.Balance < this.Min_bal){
      System.out.println("your balance is below the minimum limit so a penalty of 1000 Rs is imposed on you");
      this.Balance = this.Balance - 1000;
    }
  }
  void deposit(){
    double dep;
    System.out.print("How much money you want to deposit: ");
    dep = input.nextDouble();
      this.Balance = this.Balance + dep;
    System.out.println("Your Account updated successfully!!!");
    this.penalty();
  }
  void withDraw(){
    double withdraw;
    System.out.println("How much money you want to withdraw: ");
    withdraw = input.nextDouble();
    if (withdraw > this.Balance) {
      System.out.println("You don\'t have enough money in your account...");
    }
    else{
    this.Balance = this.Balance - withdraw;
    System.out.println("Your Account updated successfully!!!");
    this.penalty();
  }
  }
  void display(){
    System.out.println("Hi "+this.Name);
    System.out.println("Your current balance: "+this.Balance);
  }
  void Issue_cheque(){
    double ch_amount;
    String Name_Recipent;
    System.out.println("How much amount you want to give to the Recipent: ");
    ch_amount = input.nextDouble();
    System.out.println("To whom you want to issue Cheque: ");
    Name_Recipent = input.next();

    if(this.Balance < ch_amount){
      System.out.println("Sorry "+this.Name+" you dont have adequate money in your Account to issue this Cheque...");
      System.out.println("Please deposit adequate money and then try again...");
    }
    else{
      int a;
      double rem =this.Balance - ch_amount;
      if(rem < this.Min_bal){
        System.out.println(this.Name+" if you issue this cheque your balnce will be less than minimum bal..");
        System.out.println("A penalty will be imposed on you..");
        System.out.print("if you want to proceed press 1 otherwise 2: ");
        a = input.nextInt();
        switch(a){
          case 1:{
            this.Balance = this.Balance - ch_amount;
            System.out.println("A cheque of Rs "+ch_amount+ " is issued to "+Name_Recipent);
            this.penalty();
            break;
          }
          case 2:{
            System.out.println("So you dont want to proceed...");
          }

          default: {
            System.out.println("Plzz enter a valid number...");
          }
        }

      }
      else{
      this.Balance = this.Balance - ch_amount;
      System.out.println("A cheque of Rs "+ch_amount+ " is issued to "+Name_Recipent);
    }
    }

}
}
public class bank3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String Name;
    String Accno;
    int n;
    savings Sav = new savings();
    current Cur = new current();
    System.out.println("Welcome to your bank!!!");
    System.out.print("Enter your Name: ");
    Name = input.nextLine();
    System.out.print("Enter your Account No: ");
    Accno = input.nextLine();
    System.out.println("Your account type:\n 1. Savings \n 2. Current \n");
    System.out.print("Enter your choice: ");
    n = input.nextInt();
    if(n == 1){
       Sav.getData(Name ,Accno);
       int s;
       while(true){
       System.out.println("Here are your options "+Sav.Name);
       System.out.println("1. Deposit");
       System.out.println("2. Withdraw");
       System.out.println("3. Display");
       System.out.println("4. Exit");
       System.out.print("Enter your choice:");
       s = input.nextInt();
       switch(s){
         case 1:{
           Sav.deposit();
           break;
         }
         case 2:{
           Sav.withDraw();
           break;
         }
         case 3:{
           Sav.display();
           break;
         }
         case 4:{
           System.exit(0);
         }
         default:{
           System.out.println("Plzz enter a valid option...");
         }
       }
      }
     }
    else{
      Cur.getData(Name ,Accno);
      int p;
      while(true){
      System.out.println("Here are your options "+Cur.Name);
      System.out.println("1. Deposit");
      System.out.println("2. Withdraw");
      System.out.println("3. Issue Cheque");
      System.out.println("4. Display");
      System.out.println("5. Exit");
      System.out.print("Enter your choice:");
      p = input.nextInt();
      switch(p){
        case 1:{
          Cur.deposit();
          break;
        }
        case 2:{
          Cur.withDraw();
          break;
        }
        case 3:{
          Cur.Issue_cheque();
          break;
        }
        case 4:{
          Cur.display();
          break;
        }
        case 5:{
          System.exit(0);
        }
        default:{
          System.out.println("Plzz enter a valid option...");
        }
      }
     }
    }
  }

}
