#Write a program that takes two number input and an operator, +, -, *, /, and if operator is an invalid operator then print invalid operator

parameter1 = int(input("Enter a number: "))
operator = input("Enter the required operator, +, -,*,/ : ")
parameter2 = int(input("Enter another number: "))


if(operator == '+'):
    print(f'{parameter1} + {parameter2} = {parameter1 + parameter2}')
elif(operator == '-'):
    print(f'{parameter1} - {parameter2} = {parameter1 - parameter2}')
elif(operator == '*'):
    print(f'{parameter1} * {parameter2} = {parameter1 * parameter2}')
elif(operator == '/'):
    print(f'{parameter1} / {parameter2} = {parameter1 / parameter2}')
else:
    print("INVALID OPERATOR, CAN'T PERFORM CALCULATION")
