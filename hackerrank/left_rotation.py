import sys

def main():
    forms  = [int(i) for i in input().split()]
    arr    = [int(i) for i in input().split()]
    result = doRotation(arr, forms[1])
    print(' '.join(str(i) for i in result))

def doRotation(arr, rotate):
    """ Rotate elements in the array left. """
    temp_arr = [0 for i in range(len(arr))]
    for i in range(len(arr)):
        num_to_shift = arr[i]
        new_index = i - d
        if new_index < 0:
            new_index = len(arr) - abs(new_index)
        temp_arr[new_index] = num_to_shift

    return temp_arr

if __name__ == '__main__':
    main()
