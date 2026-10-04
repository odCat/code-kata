import math
from hypothesis import given, strategies as some

from kata.erathostenes import find_primes


def is_prime(n: int) -> bool:
    for i in range(2, math.floor(math.sqrt(n))):
        if n % i == 0:
            return False
    return True


class TestEratosthenes(object):

    def test_eratosthenes(self):
        actual = find_primes(20)
        expected = [ 2, 3, 5, 7, 11, 13, 17, 19 ]

        assert expected == actual

    def test_zero(self):
        actual = find_primes(0)
        expected = []
        assert  expected == actual

    def test_one(self):
        actual = find_primes(1)
        expected = []
        assert  expected == actual

    @given(some.integers(min_value = 0, max_value = 1000)
               .filter(lambda x: x > 1))
    def test_primes_are_less(self, n):
        assert len(find_primes(n)) <= n

    @given(some.integers(min_value=0, max_value=1000)
           .filter(lambda x: x > 1))
    def test_each_number_is_prime(self, n):
        for num in find_primes(n):
            assert is_prime(num)
