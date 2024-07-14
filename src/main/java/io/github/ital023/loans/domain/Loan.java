package io.github.ital023.loans.domain;

public class Loan {

    private Customer customer;

    public Loan(Customer customer) {
        this.customer = customer;
    }

    public boolean isPersonalLoanAvailable(){
        if(customer.IsIncomeEqualOrLowerThan(3000.0)){
            return true;
        }

        return customer.isIncomeBetween(3000.00,5000.00)
                && customer.isAgeLowerThan(30)
                && customer.isFromLocation("SP");

    }

    public boolean isGuaranteedAvailable(){
        return customer.isIncomeEqualOrHigherThan(5000.0);
    }

    public double getPersonalLoanInterestedRate(){
        if(isPersonalLoanAvailable()){
            return 4.0;
        }

        throw new LoanNotAvailableException();

    }

    public double getGuaranteedLoanInterestedRate(){
        if(isGuaranteedAvailable()){
            return 3.0;
        }

        throw new LoanNotAvailableException();
    }

}
