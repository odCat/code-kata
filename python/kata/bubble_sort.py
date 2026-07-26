def bubble_sort(arr):
    end = len(arr)
    switched = True
    while switched:
        switched = False
        for i in range(1, end):
            if arr[i-1] > arr[i]:
                arr[i-1], arr[i] = arr[i], arr[i-1]
                switched = True
        end -= 1

    return arr