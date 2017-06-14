// backslash is used to escape forward slash
// \r, \n, \t etc. are interpreted
// multiline
// interpolation
def a = "hello"
def escapeSlash = /
The character 
\/ is a forward slash
Welcome to Man't
Bye \tto \r\nWan"t
$a
/
print escapeSlash