from kata.insert_sort import insert_sort


class TestInsertSort(object):

    def test_insert_sort(self):
        nums = [5, 3, 8, 4, 2]

        actual = insert_sort(nums)
        expected = [2, 3, 4, 5, 8]

        assert actual == expected


    def test_insert_sort_empty_list(self):
        nums = []

        actual = insert_sort(nums)
        expected = []

        assert actual == expected


    def test_insert_sort_one_element(self):
        nums = [1]

        actual = insert_sort(nums)
        expected = [1]

        assert actual == expected
