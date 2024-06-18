public class Account
{
    class Transaction
    {
        private int amount;
        private String timestamp;
        public Transaction(int amount,String timestamp)
        {
            this.amount=amount;
            this.timestamp=timestamp;
        }
        public void printTransaction()
        {
            System.out.println("Transaction of "+amount+" at "+timestamp);
        }
    }
    public static void main(String args[])
    {
        Account a=new Account();
        Transaction t1=a.new Transaction(100000, "10:24");
        Transaction t2=a.new Transaction(200000, "17:43");
        t1.printTransaction();
        t2.printTransaction();
    }
}
