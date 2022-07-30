public class Loan {
 private double annualInterestRate; private java.util.Date loanDate;
 private int numberOfYears; private double loanAmount;
 public Loan() {
 this(2.5, 1, 1000);
 }
 public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
 this.annualInterestRate = annualInterestRate;
 this.numberOfYears = numberOfYears;
 this.loanAmount = loanAmount;
 loanDate = new java.util.Date();
 }
 public double getAnnualInterestRate() {
 return annualInterestRate; }
 public void setAnnualInterestRate(double annualInterestRate) {
 this.annualInterestRate = annualInterestRate;
 }
 public int getNumberOfYears() {
 return numberOfYears;
 }
 public void setNumberOfYears(int numberOfYears) {
 this.numberOfYears = numberOfYears;
 }
 public double getLoanAmount() {
 return loanAmount;
 }
}