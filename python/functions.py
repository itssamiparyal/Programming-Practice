#Functions are the group of statements that together performs a specific task
# #Advantage: Creates reusable logic

# def add(): #Function declaration #Def is used to declare a function and a function's name starts with parenthesis
#     print(1+1)

# add() #Calling of function #executing a fuction #Invoking a function

# #Extra information provided to the function (Arguments)(parameters)

# def info(fn,ln,age):#This is parameter #Arguments in functions are postional arguments
#     print(f'Hello {fn} {ln}. You are {age} years old.')
# info('Umesh','Regmi',29)#This is argument

# def info(fn,ln,age):
#     print(f'Hello {fn} {ln}. You are {age} years old.')
# info(age=29,fn='Umesh', ln='Regmi') #these ar keyword arguments


#Default argument: If no value is given it provides 0 and is replaced when another value is provided

# def info(fn,ln,age, balance=0):
#     print(f'Hello {fn} {ln}. You are {age} years old.')
#     print(f'Your balance is {balance}')
# info(age=29,fn='Umesh', ln='Regmi')

# arguments --> *args(args is variable)
# keyword argments--> **kwargs

# def add(*args): # * indicates the function can input multiple values
#     print(args) # Multiple Length Positional Arguments
#     print(sum(args))
# add()
# add(1)
# add(1,2)
# add(1,2,3)
# add(1,2,3,4)

# def add(**kwargs): #second string means it takes Keyword values
#     print(kwargs)
# add(i=5)
# add(i=5,j=10)
# add(i=5,j=10,k=11)

# def add(i,j):
#     return i+j
# a = add(2,3)
# print(a)

#Write a function that takes a number as a paremeter and returns ture if the number is even and false if its odd
#Write a function that takes a number as a parameter and prints whether the given number is odd or even
#Write a function that takes a number and print even number upto that number

# def oddEven(number):
#     if number % 2==0:
#         return True
#     else:
#         return False
# userNumber = int(input('Enter a number: '))
# print(oddEven(userNumber))

# def oddEven(number):
#     if number%2==0:
#         print(f"{number} is even")
#     else:
#         print(f"{number} is odd")
# userNumber = int(input("Enter a number: "))
# oddEven(userNumber)

# def rangeNumber(userNum):
#     for i in range (2 , userNum+1 , 2):
#         print(i)
# num = int(input('Enter a number: '))
# rangeNumber(num)



#1 Write a function that takes a string as a  parameter and returns the length of string
#2 Write a function that takes string as a paramerter and returns the reverse of the string
#3 Write a function that takes a string as a parameter and checks whether it is a palindrome or not disregarding case sensitivity
#4 Write a function that takes multiple number as a parameter and returns the mean of those numbers
#5 Write a function that takes a string as a parameter and returns the first vowel present in that string
#6 Write a function that takes a string as a parameter and returns the total number of vowel present in the string
#7 Write a function that takes a string as a parameter and returns the total number of consonant present in the string

#1
# def length_of_string(a_string):
#     return len(a_string)
# input_string = input("Enter a string: ")
# print(f'the length of the string is {length_of_string(input_string)}')

#2
# def reverse_str(a_string):
#     return a_string[::-1]
# user_string = input("Enter a string: ")
# print(reverse_str(user_string))

#3
def palindrome(a_string):
    if (a_string[::-1]).lower() == a_string.lower():
        return True
    else:
        return False
user_string = input("Enter a string: ")
print(f'Palindrome: {palindrome(user_string)}')

#4
# def mean(*args):
#     mean_number = sum(args)/len(args)
#     return mean_number
# print(mean(1,5))

#5
# def first_vowel(vowel):
#     for item in vowel.lower():
#         if item in 'aeiou':
#             return item
# user_input = input('Enter a string: ')
# print(first_vowel(user_input))

#6
# def count_vowels(string):
#     count = 0
#     for item in string.lower():
#         if item in 'aeiou':
#             count += 1
#     return count
# user_input = input("Enter a string: ")
# print(count_vowels(user_input))

#7
# def count_consonants(string):
#     count = 0
#     for item in string.lower():
#         if item not in 'aeiou':
#             count += 1
#     return count
# user_input = input("Enter a string: ")
# print(count_consonants(user_input))