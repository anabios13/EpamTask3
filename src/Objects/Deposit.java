package Objects;

public class Deposit {
    private String identity;
    private String name;
    private String country;
    private DepositType depositType;
    private String depositor;
    private int accountID;
    private int amountOnDeposit;
    private int profitability;

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getIdentity() {
        return identity;
    }

    private int timeConstraints;

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public void setDepositType(DepositType depositType) {
        this.depositType = depositType;
    }

    public DepositType getDepositType() {
        return depositType;
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
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AccountID: ").append(getAccountID()).append('\n');
        builder.append("Bank name: ").append(getName()).append('\n');
        builder.append("Country: ").append(getCountry()).append('\n');
        builder.append("Depositor: ").append(getDepositor()).append('\n');
        builder.append("Amount On Deposit: ").append(getAmountOnDeposit()).append('\n');
        builder.append("Deposit type: ").append(getDepositType().getName()).append('\n');
        builder.append("Profitability: ").append(getProfitability()).append('\n');
        builder.append("Time Constraints: ").append(getTimeConstraints()).append('\n');
        return builder.toString();
    }
}
