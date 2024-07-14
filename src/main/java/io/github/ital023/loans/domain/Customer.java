package io.github.ital023.loans.domain;

public class Customer {

    private Integer age;
    private String cpf;
    private String nome;
    private Double income;
    private String location;

    public Customer(Integer age, String cpf, String nome, Double income, String location) {
        this.age = age;
        this.cpf = cpf;
        this.nome = nome;
        this.income = income;
        this.location = location;
    }


    public boolean IsIncomeEqualOrLowerThan(double value) {
        return income <= value;
    }

    public boolean isIncomeBetween(double minValue, double maxValue){
        return income >= minValue && income <= maxValue;
    }

    public boolean isAgeLowerThan(int value) {
        return age < value;
    }

    public boolean isFromLocation(String value) {
        return location.equalsIgnoreCase(value);
    }

}
