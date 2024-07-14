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

    public double getPersonalLoanInterestedRate(){
        if(isPersonalLoanAvailable()){
            return 4.0;
        }

        throw new LoanNotAvailableException();

    }

}
