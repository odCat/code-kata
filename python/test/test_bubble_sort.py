from kata.bubble_sort import bubble_sort


class TestBubbleSort(object):

    def test_merge_sort(self):
        nums = [5, 3, 8, 4, 2]

        actual = bubble_sort(nums)
        expected = [2, 3, 4, 5, 8]

        assert actual == expected


    def test_merge_sort_empty_list(self):
        nums = []

        actual = bubble_sort(nums)
        expected = []

        assert actual == expected


    def test_merge_sort_one_element(self):
        nums = [1]

        actual = bubble_sort(nums)
        expected = [1]

        assert actual == expected
