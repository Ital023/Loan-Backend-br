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

    public boolean isConsigmentLoanAvailable(){
        return customer.isIncomeEqualOrHigherThan(5000.0);
    }

    public boolean isGuaranteedLoanAvailable(){
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

    public double getGuaranteedLoanInterestedRate(){
        if(isGuaranteedLoanAvailable()){
            return 3.0;
        }

        throw new LoanNotAvailableException();

    }

    public double getConsigmentLoanInterestedRate(){
        if(isConsigmentLoanAvailable()){
            return 2.0;
        }

        throw new LoanNotAvailableException();
    }



}
