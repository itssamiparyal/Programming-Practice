#string is contained within single double or triple quotations

# print(type(first_name))
# print(type(last_name))
# print(type(adress))

# string concatenation hepls us to combine strings
# print('hello'+' '+'all')

# len helps us to tell the number of characters in string
# print(len('rudy'))
# print(len(''))

# is a sting contains a quotation we use a double or triple quotation
# a = "ram's opinion is objectively correct since he hates paneer unlike a certain individual"
# print(a) 

# '*' is used to replicate string
# print('hello'*5)

#'upper' changes string to uppercase
# name = 'ram'
# upper_case = name.upper()
# print (upper_case)

#'lower' changes string to lowercase
# name = 'SHYAM'
# lower_case = name.lower90
# print(lower_case)

#capitalize changes the first letter into uppercase
#'title turns each first letter of the word of the sentence into capital
# name = 'this is a title'
# print(name.title())

# replace replaces the value of the words in string
# b = "hello everyone"
# print(b.replace('hello','hi'))

first_name = 'gaurab'
last_name = "k.C."
age = 'sixteen'
adress = "baneshowr"

intro = ('hello your first name is ' + first_name + ' your last name is ' + last_name + ' your age is ' + age + 'your adress is  ' + adress)
print(intro.title())

# we can check the letters and word in string value as true or false
print('r' in 'ram')
print('R' in 'ram')
print('ra' in 'ram')
print('rm' in 'ram')
