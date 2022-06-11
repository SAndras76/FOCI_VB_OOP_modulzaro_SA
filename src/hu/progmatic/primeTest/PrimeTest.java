package hu.progmatic.primeTest;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeTest {

    @org.junit.jupiter.api.Test
    void test_isPrime(){
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(2));
        assertFalse(Prime.isPrime(12));


        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(8));
        assertTrue(Prime.isPrime(71));
    }

}