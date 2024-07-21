package OOPs.Encapsulation;

public class Account {
    //Encapsulation - data hiding
    private int accNo;
    private String name;
    private double amount;
// below methods are getters and setters for accNo, name, amount variables
    // deserialization and serialization in java - converting java object into byte stream and vice versa
    //below is deserialization
    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
