// backslash is used for escaping
// \r, \n, \t etc. are interpreted
// NOT multiline
// NO interpolation
def a = "welcome"
def h = 'hello \r\nworld\tso"s mine\'s $a'
println h