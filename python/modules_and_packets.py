# #modules
# # it is a python file that consist code with similar functionality
# # every python file is a modlue the empty file is called  empty module. generally module isa python file that consist code with similar functionality
# # import 'filename' :- this inports the code into that file

# import arithmaetic
# arithmaetic.add()
# arithmaetic.sub()

# # import constant
# # print(constant.PI)

# #or
# from constant import PI,GRAVITY
# print(PI)
# print(GRAVITY)

# # group of related modules is called package

# #variables
# #naming convention of variables
# #data type primitive and non primitive
# #list tuple dictionary
# #true + true = 2
# #comparison operator
# #slicing length, f string string concatination
# #nested dictionary
# #if else, loop while and for
# #function 15 - 20 marks
# #file handaling,

# a = {'name':'ram','age':25,'address':{'city':'sifal','district':'ktm'}}
# a['name']
# a['age']
# del a['address']['city']
# print(a['address'])
# a['address']['district']

# First, let's define a nested dictionary
products = {
    "fruits": {"citrus": "orange", "berry": "blueberry"},
    "gadgets": {"laptop": "macbook", "phone": "iphone"}
}

# Now, let's add a new item to the "gadgets" dictionary
products["gadgets"]["tablet"] = "ipad"

# Let's print the updated dictionary
print(products)