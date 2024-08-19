 


/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
   
    public DebitCard(int BalanceAmount,int CardID,String BankAccount,String issuerBank,String Clientname,int PINnumber)
    {
        super(BalanceAmount,CardID,issuerBank,BankAccount);
        super.setClientname(Clientname);
        this.pinNumber = pinNumber;
        hasWithdrawn = false;
        dateOfWithdrawal = "";
        withdrawalAmount = 0;
       
    }
   
    public int getpinNumber()
    {
        return this.pinNumber;
    }
    public int getWithdrawalAmount()
    {
        return withdrawalAmount;
    }
    public String getdateOfWithrawal()
    {
       return dateOfWithdrawal;
    }
    public boolean gethasWithdrawn()
    {
        return hasWithdrawn;
    }
    public void setWithdrawalAmount(int WithdrawalAmount)
    {
        this.withdrawalAmount = WithdrawalAmount;
    }
   
   
    public void withdraw(int pinNumber,int withdrawalAmount,String DateofWithdrawal)
    {
        if(this.pinNumber == pinNumber){
            System.out.println("Pin number is valid");
            if(this.withdrawalAmount <= super.getBalanceAmount()){
                this.withdrawalAmount = withdrawalAmount;
                this.dateOfWithdrawal = dateOfWithdrawal;
                this.hasWithdrawn = true;
                super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
            }else{
                System.out.println("Insufficient Amount");
               
            }
           
        }else{
            System.out.println("Incorrect PIN Number");
        }
    }
   
    public void display(){
        super.display();
        System.out.println("PIN Number: " + pinNumber);
        if(hasWithdrawn){
            System.out.println("Withdrawal Amount: " + withdrawalAmount);
            System.out.println("Date Of Withdrawal: " + dateOfWithdrawal);
        }else{
            System.out.println("Withdrawm has not been done yet.");
        }
       
    }
}

