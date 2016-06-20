""" Harness to run tests on sorting algorithms. """
import random

def test(sort_algo):
    """ Run the tests with the given sorting algorithm.
        Array of random values from 1-100 is generated
        and sorted using my sorting algo and compared
        against Python's sorting algo. """

    print('Test name: {}'.format(sort_algo.__name__))
    print('{} BEGIN TESTS {}'.format('=' * 10, '=' * 10))

    for i in range(1, 11):
        test_arr = []

        for j in range(10, random.randint(20, 50)):
            test_arr.append(random.randint(1, 100))

        temp_arr = sorted(test_arr)
        sorted_arr = sort_algo(test_arr)
        
        if sorted_arr == temp_arr:
            print_test_results(sorted_arr, temp_arr, 1, i)
        else:
            print_test_results(sorted_arr, temp_arr, 0, i)

    print('{} FINISHED TESTS {}'.format('=' * 10, '=' * 10))

def print_test_results(sorted_arr, temp_arr, status, test_num):
    """ Print the results of the tests. """

    if status:
        print('Test #{}: {}'.format(test_num,'\tPassed'))
    else:
        print('Test #{}: {} FAILED!!! {}'.format(test_num, '*' * 5, '*' * 5))
        print('Expected: {}'.format(temp_arr))
        print('Actual:   {}'.format(sorted_arr))
