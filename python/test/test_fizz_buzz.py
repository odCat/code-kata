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