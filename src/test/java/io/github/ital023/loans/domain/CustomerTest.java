package io.github.ital023.loans.domain;

import io.github.ital023.loans.factory.CustomerFactory;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CustomerTest {

    @Nested
    class IsIncomeEqualOrLowerThan {

        @Test
        void shouldBeTrueWhenIncomeIsEqual(){
            Customer customer = CustomerFactory.build(5000.00);

            assertTrue(customer.IsIncomeEqualOrLowerThan(5000.00));
        }

        @Test
        void shouldBeTrueWhenIncomeIsLowerThan(){
            Customer customer = CustomerFactory.build(5000.00);

            assertTrue(customer.IsIncomeEqualOrLowerThan(9000.00));
        }

        @Test
        void shouldBeFalseWhenIncomeIsGreaterThan(){
            Customer customer = CustomerFactory.build(5000.00);

            assertFalse(customer.IsIncomeEqualOrLowerThan(3000.00));
        }


    }

    @Nested
    class IsIncomeEqualOrGreaterThan {

        @Test
        void shouldBeTrueWhenIncomeIsEqual(){
            Customer customer = CustomerFactory.build(5000.00);

            assertTrue(customer.isIncomeEqualOrHigherThan(5000.00));
        }

        @Test
        void shouldBeTrueWhenIncomeIsGreaterThan(){
            Customer customer = CustomerFactory.build(10000.00);

            assertTrue(customer.isIncomeEqualOrHigherThan(9000.00));
        }

        @Test
        void shouldBeFalseWhenIncomeIsGreaterThan(){
            Customer customer = CustomerFactory.build(5000.00);

            assertFalse(customer.isIncomeEqualOrHigherThan(8000.00));
        }


    }

}