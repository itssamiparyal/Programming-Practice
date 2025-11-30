# WAF that takes a string as a parameter and returns the length of the string

def find_length(s):
    return len(s)

a = input("Enter a string: ")
length = find_length(a)
print(f"Length of the string is : {length}")

# WAF that takes a string as a parameter and prints the reverse of the string

def find_reverse(s):
    print(s[::-1])
a = input("Enter a string: ")
find_reverse(a)

# WAF hat takes a sting as a parameter and checks if the string is  palindrome or not disregarding case sensivity.

def palindrome(string):
    lowercase = string.lower()
    if lowercase == lowercase[::-1]:
        return True
    else:
        return False
a = input("Enter a string: ")
print(palindrome(a))  
 

# WAF that takes multiple num as a parameter and returns the mean of those numbers.

def mean(*args):
    total = sum(args)
    mean = total / len(args)
    return mean
a = mean(1, 5, 3, 4, 5)
print(f"Mean: {a}") 
a = mean(10, 20, 30, 80)
print(f"Mean: {a}") 

# WAF that takes and retrns the first vowel present in the string.

def find_first_vowel(s):
    for item in s:
        if item in 'aeiouAeiou':
            return item
print(find_first_vowel('ramesh'))    

# WAF that takes string and returns the total no of vowels present in the string

def count_vowels(s):
    count = 0
    for item in s.lower():
        if item in 'aeiou':
            count = count+1
    return count
print(count_vowels('ramesh'))

# WAF that takes string and returns the total no constants present in the string
def count_consonants(s):
    count = 0
    for item in s.lower():
        if item not in 'aeiou':
            count = count+1
    return count
print(count_consonants('ramesh'))