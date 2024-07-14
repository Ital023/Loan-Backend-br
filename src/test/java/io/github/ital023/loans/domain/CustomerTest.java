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

        @Nested
        class IsIncomeBetween {

            @Test
            void shouldBeTrueWhenIncomeIsBetween() {
                Customer customer = CustomerFactory.build(5000.00);

                assertTrue(customer.isIncomeBetween(3000.00, 8000.00));
            }

            @Test
            void shouldBeTrueWhenIncomeIsEqualToMin() {
                Customer customer = CustomerFactory.build(5000.00);

                assertTrue(customer.isIncomeBetween(5000.00, 8000.00));
            }

            @Test
            void shouldBeTrueWhenIncomeIsEqualToMax() {
                Customer customer = CustomerFactory.build(8000.00);

                assertTrue(customer.isIncomeBetween(3000.00, 8000.00));
            }

            @Test
            void shouldBeFalseWhenIncomeNotBetween() {
                Customer customer = CustomerFactory.build(5000.00);

                assertFalse(customer.isIncomeBetween(3000.0, 4500.0));
            }
        }

        @Nested
        class IsAgeLowerThan {

            @Test
            void shouldBeTrueWhenAgeIsLowerThan() {
                Customer customer = CustomerFactory.build(25);

                assertTrue(customer.isAgeLowerThan(30));
            }

            @Test
            void shouldBeFalseWhenAgeIsNotLowerThan() {
                Customer customer = CustomerFactory.build(25);

                assertFalse(customer.isAgeLowerThan(22));
            }

            @Test
            void shouldBeFalseWhenAgeIsEqual() {
                Customer customer = CustomerFactory.build(25);

                assertFalse(customer.isAgeLowerThan(25));
            }


        }

        @Nested
        class IsFromLocation {
            @Test
            void shouldBeTrueWhenLocationIsTheSame() {
                Customer customer = CustomerFactory.build("SP");

                assertTrue(customer.isFromLocation("SP"));
            }
            @Test
            void shouldBeTrueWhenLocationIsNotTheSame() {
                Customer customer = CustomerFactory.build("SP");

                assertFalse(customer.isFromLocation("RJ"));
            }

        }



        }


    }
