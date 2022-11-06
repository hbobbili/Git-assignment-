package com.Bank;

public class SavingAccount {

float interestRate;
float years;
float amount;
public SavingAccount (float i,float y, float r) {
    interestRate=i;
    years=y;
    amount=r;
}
public float totalamount() {
    float FixedDeposit= interestRate*years*amount;
    return FixedDeposit;
}
}