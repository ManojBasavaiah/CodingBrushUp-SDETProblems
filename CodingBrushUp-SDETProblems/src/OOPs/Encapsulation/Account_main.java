package OOPs.Encapsulation;

public class Account_main {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAccNo(43476);
        System.out.println(acc.getAccNo());
        acc.setName("John");
        System.out.println(acc.getName());
        acc.setAmount(6457.56);
        System.out.println(acc.getAmount());
    }


}
