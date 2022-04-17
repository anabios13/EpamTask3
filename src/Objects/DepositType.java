package Objects;

 public enum DepositType {
  Demand("Demand"), Term("Term"), Settlement("Settlement"), Accumulative("Accumulative"), Saving("Saving");
  private String name;


  public String getName() {
   return name;
  }

  private DepositType(String name) {
   this.name = name;
  }
}
