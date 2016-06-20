from sort_tests import test

def main():
    test(do_selection_sort)

def do_selection_sort(arr):
    """ Do selection sort on the given array. """
    for i in range(len(arr) - 1):
        min_index = i
        for j in range(i + 1, len(arr)):
            # i is constant through entire iteration of this loop
            if arr[j] < arr[min_index]:
                min_index = j

        # found new minimum element & index
        if min_index != i:
            swap(arr, min_index, i)

    return arr

def swap(arr, a, b):
    """ Swap two elements in the array. """
    temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp

if __name__ == '__main__':
    main()