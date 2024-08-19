 


/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
   private int CVCnumber;
   private double CreditLimit;
   private double IntrestRate;
   private String ExpirationDate;
   private int GracePeriod;
   private boolean isGranted;
   
   public CreditCard(int CardID,String Clientname,String issuerBank,String BankAccount,float BalanceAmount,int CVCnumber,
   double IntrestRate,String ExpirationDate)
   {
       super(BalanceAmount,CardID,issuerBank,BankAccount);
       this.CVCnumber = CVCnumber;
       this.IntrestRate = IntrestRate;
       this.ExpirationDate = ExpirationDate;
       isGranted = false;
   }
   
   public int getCVCnumber()
   {
       return this.CVCnumber;
   }
   public double getCreditLimit()
   {
       return CreditLimit;
   }
   public double getIntrestRate()
   {
       return this.IntrestRate;
   }
   public String getExpirationDate()
   {
       return this.ExpirationDate;
   }
   public int getGracePeriod()
   {
       return GracePeriod;
   }
   public boolean getisGranted()
   {
      return isGranted;
   }
   
   public void setCreditLimit(double newCreditLimit,int newGracePeriod,float BalanceAmount){
       if(newCreditLimit <= 2.5 * super.getBalanceAmount()){
           this.CreditLimit = newCreditLimit;
           this.GracePeriod = newGracePeriod;
           this.isGranted = true;
       }else{
           System.out.println("Credit can't be issued.");
       }
   }
   
   
   public void CancelCreditCard(){
       this.CVCnumber = 0;
       this.CreditLimit = 0;
       this.IntrestRate = 0;
       this.ExpirationDate = "";
       this.GracePeriod = 0;
       this.isGranted = false;
       
       System.out.println("CreditCard has been Cancelled.");
   }
   
   public void display(){
       super.display();
       if(isGranted = true){
           System.out.println("CVCnumber: " + CVCnumber);
           System.out.println("CreditLimit: " + CreditLimit);
           System.out.println("IntrestRate: " + IntrestRate);
           System.out.println("ExpirationDate: " + ExpirationDate);
           System.out.println("GracePeriod: " + GracePeriod);
       }else{
           System.out.println("CreditCard has not been granted yet.");
       }
   }
}   

public static void main String[]args

