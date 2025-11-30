#bugs: fault/error in program  are called bugs
#thier types are syntax Error, logical error and runtime error
#syntax errors: occurs because of type. if you write code that pythom compiler doesn't understand type error occurs.

# print('hello) this is a syntax error

# print('hello world')
# print('hello world')
# print('hello world')
# print('hello world')
# print('hello world')
# print('hello world)
# print('hello world')
# print('hello world')

#if the program has 1 eroor then it is not converted to byte code.

# logical error
# while True: 
#     age = int(input('enter age: '))
#     if age < 18:
#         print('your can vote')
#     else:
#         print('you cannot vote')
# # the  programs runs but you would not get the expected output.
# while True: 
#     age = int(input('enter age: '))
#     if age < 18:
#         print('your cannot vote')
#     else:
#         print('you can vote')

#Runtime Error/Exceptions
# while True:
#     fn = int(input('Enter first no'))
#     ln = int(input('Enter las no'))
#     print(fn/ln)
#in runtime error for some exceptional values program chrashes.

#try and except
    # try:
    #     #risky code
    #     #code that can thorw error
    
    # except:
    #     #alternative code
    #     #code to run when there is error

while True:
    try:
        fn = int(input('Enter first no: '))
        ln = int(input('Enter las no: '))
        print(fn/ln)
    except ZeroDivisionError:
        print('second number cannot be 0')
    except ValueError:
        print('Inputs must be numbers')
    except:
        print('An error occured')

#