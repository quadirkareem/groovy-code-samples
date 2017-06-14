// backslash is used for escaping
// \r, \n, \t etc. are interpreted
// multiline
// interpolation
def a = "hello"
def h = """\
Welcome to Man't
Bye \tto \r\nWan"t
$a
"""
print h