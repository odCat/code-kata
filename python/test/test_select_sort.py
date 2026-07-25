from kata.select_sort import select_sort


class TestSelectSort(object):

    def test_select_sort(self):
        nums = [5, 3, 8, 4, 2]

        actual = select_sort(nums)
        expected = [2, 3, 4, 5, 8]

        assert actual == expected


    def test_select_sort_empty_list(self):
        nums = []

        actual = select_sort(nums)
        expected = []

        assert actual == expected


    def test_select_sort_one_element(self):
        nums = [1]

        actual = select_sort(nums)
        expected = [1]

        assert actual == expected
