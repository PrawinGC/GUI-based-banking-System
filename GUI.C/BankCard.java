 


/**
 * Write a description of class BankCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
    private int CardID;
    private String Clientname;
    private String issuerBank;
    private float BalanceAmount;
    private String BankAccount;
    public BankCard(float BalanceAmount,int CardID,String BankAccount,String issuerBank){
        this.Clientname = "";
        this.BalanceAmount = BalanceAmount;
        this.CardID = CardID;
        this.BankAccount = BankAccount;
        this.issuerBank = issuerBank;
    }
       
        public int getCardID()
        {
            return this.CardID;
        }
        public  float getBalanceAmount()
        {
            return this.BalanceAmount;
        }
        public String getClientname()
        {
            return this.Clientname;
        }
        public String getBankAccount()
        {
            return this.BankAccount;
        }
        public String getissuerBank()
        {
            return this.issuerBank;
        }
       
        public void setClientname(String Clientname)
        {
            this.Clientname = Clientname;
        }
        public void setBalanceAmount(float BalanceAmount)
        {
             this.BalanceAmount = BalanceAmount;
        }
       
        public void display()
        {
            System.out.println("CardID");
            System.out.println("BalanceAmount");
            System.out.println("BankAccount");
            System.out.println("issuerBank");
           
            if (Clientname == ""){
                System.out.println("Name cannot be display");
            }else
            {
                System.out.println("Clientname");
            }
           
        }
    }

