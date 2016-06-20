from sort_tests import test

def main():
    test(do_insertion_sort)

def do_insertion_sort(arr):
    """ Do insertion sort on arr. """
    for i in range(1, len(arr)):
        index = i
        current = arr[i]
        while (index > 0 and arr[index - 1] > current):
            arr[index] = arr[index - 1]
            index -= 1

        arr[index] = current

    return arr

if __name__ == '__main__':
    main()