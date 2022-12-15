package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int accountNumber; //hesap numarasi
    private int pinNumber; // sifre

    private double checkingBalance; // vadesiz hesap bakiyesi
    private double savingBalance; // vadeli hesap bakiyesi

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    //para cekme // paraCekmeIslemindenSonraKalanMiktar
    public double calculateCheckingBalanceAfterWithdraw (double amount){
        checkingBalance = checkingBalance - amount;
        return checkingBalance;
    }

    // parayatirma  paraEklemeIslemindenSonraOlusanMiktar
    private double calculateCheckingBalanceAfterDeposit(double amount){
        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }

    //para cekme saving hesabindan // paraCekmeIslemindenSonraKalanMiktar
    public double calculateSavingBalanceAfterWithdraw (double amount){
        savingBalance = savingBalance - amount;
        return savingBalance;
    }
    // parayatirma saving hesabi paraEklemeIslemindenSonraOlusanMiktar
    private double calculateSavingBalanceAfterDeposit(double amount){
        savingBalance = savingBalance + amount;
        return savingBalance;
    }

    //Musteri ile para cekmek icin etkilesime gecelim ==> checking hesabi icin

    public void getCheckingWithdraw(){
        System.out.println("checking hesabindaki bakiye: "+ moneyFormat.format(checkingBalance));
        System.out.println("Cekmek istediginiz miktari giriniz");
        double amount = input.nextDouble();
        if (amount<=0){
            System.out.println("sifir ve eksi rakamlar gecersizdir");
            getCheckingWithdraw();// recursive methodu ==> ayni methodu tekrar cagirma
        } else if (amount<=checkingBalance) {
            calculateCheckingBalanceAfterWithdraw(amount);
            System.out.println("checking hesabindaki bakiye: "+ moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Yetersiz bakiye");
        }
    }

 //Musteri ile para eklemek icin etkilesime gecelim ==> checking hesabi icin
    public void getCheckingDeposit(){
        System.out.println("checking hesabindaki bakiye: "+ moneyFormat.format(checkingBalance));
        System.out.println("Yatirmak istediginiz miktari giriniz");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("sifir ve eksi rakamlar gecersizdir");
            getCheckingWithdraw();// recursive methodu ==> ayni methodu kendi icinde tekrar cagirma
        } else {
            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println("checking hesabindaki bakiye: "+ moneyFormat.format(checkingBalance));

        }

    }
    //Musteri ile para cekmek icin etkilesime gecelim ==> saving hesabi icin
    public void getSavingWithdraw(){
        System.out.println("Saving hesabindaki bakiye: "+ moneyFormat.format(savingBalance));
        System.out.println("Cekmek istediginiz miktari giriniz");
        double amount = input.nextDouble();
        if(amount<=0){
        System.out.println("sifir ve eksi rakamlar gecersizdir");
        getSavingWithdraw();// recursive methodu ==> ayni methodu kendi icinde tekrar cagirma

        } else if (amount<=savingBalance) {
            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println("Saving hesabindaki bakiye: "+ moneyFormat.format(savingBalance));

        }else{
            System.out.println("Yetersiz bakiye");
        }
    }

    //Musteri ile para ekleme icin etkilesime gecelim ==> saving hesabi icin
    public void getSavingDeposit(){
        System.out.println("Saving hesabindaki bakiye: "+ moneyFormat.format(savingBalance));
        System.out.println("Yatirmak istediginiz miktari giriniz");
        double amount = input.nextDouble();
        if(amount<=0) {
            System.out.println("sifir ve eksi rakamlar gecersizdir");
            getSavingDeposit ();// recursive methodu ==> ayni methodu kendi icinde tekrar cagirma
        } else {
            calculateSavingBalanceAfterDeposit(amount);
            System.out.println("Saving hesabindaki bakiye: "+ moneyFormat.format(savingBalance));
        }
    }

}
