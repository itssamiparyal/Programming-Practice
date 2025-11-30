# #Dictionary stores collection of key value pairs

# #To create an empty dictionary

# a = {}

# b = dict()

# print(type(a))

# print(type(b))

# #Creating a dictionary

# Student_grades = {'ram':25,'shyam':35,'hari':80}

# #Dictionary is heterogenous. In the variable below fname, lname,.... are keys

# #Dictionary is mutable

# info = {'fname':'umesh', 'lname':'regmi', 'age':29, 'is Married':False, 'salary':5.01}


# #Keys should be unique in dictionary

# #If keys are repeated, the repeated key replaces the original value

# grades = {'ram':25,'shyam':28, 'rita':52,'ram':36}#here the value of 'ram' will be 36 because repeated value replaces the original value

# print(len(grades))

# print('ram' in grades)

# grades['ram'] = 100

# print(grades['ram'])

# grades['rama'] = 87#This will add key "rama" in DICTIONARY and assign its value 87

# grades['shyam'] = 82

# print(grades['rama'])

# # print(grades['madan'])#Throws out key errors as 'madan' is not in grades



# # del grades['shyam']

# # print(grades['shyam'])

# print(grades.keys())#All keys inside the dictionary is printed

# print(grades.values())#All values inside the dictionary is printed

# print(grades.items())#

# info = {'name':'umesh regmi','salary':50.01, 'address':{'city':'balaju', 'district':'kathmandu'}}

# print(info)

# print(info['address']['district'])