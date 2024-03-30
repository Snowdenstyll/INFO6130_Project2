package jlin2.examples.localtesting

import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private var emailValidator = EmailValidator
    @Test
    fun emailFormatCorrect_test() {
        assertTrue(emailValidator.isValidEmail("123@abc.com"))
        assertTrue(emailValidator.isValidEmail("123@abc.co.ca"))
    }
    @Test
    fun emailFormatIncorrect_test() {
        assertFalse(emailValidator.isValidEmail("123@abc"))
        assertFalse(emailValidator.isValidEmail("123@abc..com"))
        assertFalse(emailValidator.isValidEmail("@abc.com"))
        assertFalse(emailValidator.isValidEmail("testing123"))
        assertFalse(emailValidator.isValidEmail(" "))
        assertFalse(emailValidator.isValidEmail(null))
    }
}