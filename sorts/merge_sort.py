from sort_tests import test

def main():
    test(do_merge_sort)

def do_merge_sort(arr):
    """ Perform merge sort on a given array of integers. """
    result = split(arr)
    return result

def split(arr):
    """ Recursively divide the array into halves. """
    if len(arr) <= 1:
        return arr
    """ (lo + hi) // 2 is known to overflow to a negative number for
        large lo and hi where the sum is > (2 ^ 31) - 1, causing the
        integer division by 2 to return a negative number. >> 1 is
        equivalent to // 2 but the bits are preserved, whereas // 2
        could change the underlying bits.
        EDIT: don't have to worry about overflow in python. :D """
    middle = len(arr) >> 1
    left_arr = split(arr[:middle])
    right_arr = split(arr[middle:])
    return merge(left_arr, right_arr)

def merge(left_arr, right_arr):
    """ Merge two arrays in ascending order. """
    left_index = 0
    right_index = 0
    result = []

    while left_index < len(left_arr) and right_index < len(right_arr):
        if left_arr[left_index] <= right_arr[right_index]:
            result.append(left_arr[left_index])
            left_index += 1
        else:
            result.append(right_arr[right_index])
            right_index += 1

    # add leftover elements
    if left_index < len(left_arr):
        result.extend(left_arr[left_index:])
    if right_index < len(right_arr):
        result.extend(right_arr[right_index:])

    return result

if __name__ == '__main__':
    main()