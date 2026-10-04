from hypothesis import given, strategies as some

from kata.fizz_buzz import fizz_buzz


class TestFizzBuzz:

    def test_fizz(self):
        actual = fizz_buzz(3)
        expected = "Fizz"

        assert actual == expected

    def test_buzz(self):
        actual = fizz_buzz(5)
        expected = "Buzz"

        assert actual == expected

    def test_fizz_buzz(self):
        actual = fizz_buzz(15)
        expected = "FizzBuzz"

        assert actual == expected

    def test_not_fizz_or_buzz(self):
        actual = fizz_buzz(8)
        expected = "8"

        assert actual == expected

    @given(some.integers().filter(lambda x: x % 5 != 0 and x % 3 != 0))
    def test_always_returns_a_number(self, num):
        assert fizz_buzz(num) == str(num)

    @given(some.integers().filter(lambda x: x % 3 == 0 and x % 5 != 0))
    def test_fizz_for_all_multiples_of_three(self, num):
        assert fizz_buzz(num) == "Fizz"

    @given(some.integers().filter(lambda x: x % 5 == 0 and x % 3 != 0))
    def test_buzz_for_all_multiples_of_five(self, num):
        assert fizz_buzz(num) == "Buzz"
