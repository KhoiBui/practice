import random

""" Alternate method for swapping two elements without 
    using a temp variable. This question was posed to
    our class by Solaris's Director, Fadi Salem, during
    a guest lecture near the end of Spring 2016 semester. """

def main():
    swapTest()

def doAltSwap(x, y):
    """ Swap two numbers without using a temp variable. """
    result = []

    # do swap
    x = x + y
    y = x - y
    x = x - y

    result.append(x)
    result.append(y)

    return result

def doSwap(x, y):
    """ Swap two numbers using a temp variable. """
    result = []

    # do swap
    temp = x
    x = y
    y = temp

    result.append(x)
    result.append(y)

    return result

def swapTest():
    for i in range(1, 101, 1):
        x_test = random.randint(-9999, 9999)
        y_test = random.randint(-9999, 9999)
        alt_result  = doAltSwap(x_test, y_test)
        swap_result = doSwap(x_test, y_test)

        if alt_result == swap_result:
            print("Test #{}: PASSED".format(i))
        else:
            print("Test #{}: FAILED!!!".format(i))
            print("actual:   x = {}, y = {}".format(alt_result[0], alt_result[1]))
            print("expected: x = {}, y = {}".format(swap_result[0], swap_result[1]))

if __name__ == '__main__':
    main()
