package Objects;

public class Deposit {
    String name;
    String country;
    Enum Type;
    String depositor;
    int accountID;
    int amountOnDeposit;
    int profitability;
    int timeConstraints;

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setType(Enum type) {
        Type = type;
    }

    public void setDepositor(String depositor) {
        this.depositor = depositor;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setAmountOnDeposit(int amountOnDeposit) {
        this.amountOnDeposit = amountOnDeposit;
    }

    public void setProfitability(int profitability) {
        this.profitability = profitability;
    }

    public void setTimeConstraints(int timeConstraints) {
        this.timeConstraints = timeConstraints;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Enum getType() {
        return Type;
    }

    public String getDepositor() {
        return depositor;
    }

    public int getAccountID() {
        return accountID;
    }

    public int getAmountOnDeposit() {
        return amountOnDeposit;
    }

    public int getProfitability() {
        return profitability;
    }

    public int getTimeConstraints() {
        return timeConstraints;
    }
}
