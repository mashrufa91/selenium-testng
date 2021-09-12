package javaIntroduction5;

public class CarPriceCalculation {

	public static void main(String[] args) {
		
		
double basePrice=26000;
double interest=0;

double creditScore=750;
double months=72;
double downpayment=2000;
double priceAfterDownpayment;
double financingPrice;
double tax= 7;
double taxPercentage;
double interestRate;
double monthlyPayments;
double outofDoorCarprice;
if (creditScore>700) {
interest=2.9;
}
if (creditScore<=700) {
interest=4.5;
}
taxPercentage= tax/100;
outofDoorCarprice=basePrice+(basePrice*taxPercentage);
priceAfterDownpayment= (outofDoorCarprice-downpayment);
interestRate=interest/100;

financingPrice= priceAfterDownpayment+ (priceAfterDownpayment*interestRate);


monthlyPayments=financingPrice/months;
		
		System.out.println(monthlyPayments);

	}

}
