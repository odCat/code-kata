from kata.erathostenes import find_primes


class TestEratosthenes(object):

    def test_eratosthenes(self):
        actual = find_primes(20)
        expected = [ 2, 3, 5, 7, 11, 13, 17, 19 ]

        assert expected == actual