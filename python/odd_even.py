#Write a program that takes a integer input from the user and print whether the number is odd or even

integer_input = input("Enter an integer: ")
integer_input = int(integer_input)
if (integer_input%2 == 0):
    print(f'{integer_input} is an even number')
else:
    print(f'{integer_input} is an odd number')

