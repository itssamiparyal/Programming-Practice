# a = () # Preferred way to to create an empty tuple
# b = tuple() # also a way to create a tuple
# print(type(a))
# print(type(b))

#Tuple is heterogenous, indexed/ordered
hetero = ('ram', 1, 1.1, True)
print(hetero[2])
print(hetero[::2])
# hetero[1] = 3 # Tuple is immutable (error code)

a = ('sun','mon','tue','wed','thurs','fri','sat')
print(a)
print(len(a))
print('sun' in a)
print('Sun' in a)
print('Sun'.lower() in a)

# a = (2) # Not a tuple
# a = (2,) # A tuple

i,j,k = (1,2,3)
print(i)