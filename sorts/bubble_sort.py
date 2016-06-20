from sort_tests import test

def main():
    test(do_bubble_sort)

def do_bubble_sort(arr):
    """ Do bubble sort. """
    swapped = True
    while swapped:
        # allows loop to exit when everything is sorted
        swapped = False
        for i in range(len(arr) - 1):
            if arr[i] > arr[i + 1]:
                swap(arr, i, i + 1)
                swapped = True

    return arr

def swap(arr, a, b):
    """ Swap two elements in an array. """
    temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp

if __name__ == '__main__':
    main()