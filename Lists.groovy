def numbers = [1, 2, 3]         

assert numbers instanceof List  
assert arrayList instanceof java.util.ArrayList
assert numbers.size() == 3

def linkedList = [2, 3, 4] as LinkedList    
assert linkedList instanceof java.util.LinkedList

LinkedList otherLinked = [3, 4, 5]          
assert otherLinked instanceof java.util.LinkedList

def heterogeneous = [1, "a", true]

def letters = ['a', 'b', 'c', 'd']

assert letters[0] == 'a'
assert letters[1] == 'b'

// negative index starts from end of list
assert letters[-1] == 'd'
assert letters[-2] == 'c'

letters[2] = 'C'
assert letters[2] == 'C'

// append to end of list
letters << 'e'    
assert letters[4] == 'e'
assert letters[-1] == 'e'

// [start_index, end_index] - both start and end indices are inclusive
assert letters[1, 3] == ['b', 'd']

// [start_index..end_index] - both start and end indices are inclusive
assert letters[2..4] == ['C', 'd', 'e']
assert letters[0 .. 1] == ['a', 'b']

def multi = [[0, 1], [2, 3]]
assert multi[1][0] == 2

