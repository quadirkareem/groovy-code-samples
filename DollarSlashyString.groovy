// $ is used to escape
// \r, \n, \t etc. are NOT interpreted
// multiline
// interpolation
def name = "Guillaume"
def date = "April, 1st"
def dollarSlashy = $/
    Hello "$name",
    today we're ${date}.

    $ dollar sign
    $$escaped dollar sign
    \ backslash
    / forward slash
    $/ escaped \tforward \r\nslash
    $$/ escaped dollar slashy string delimiter
    $/$ escaped dollar slashy string delimiter
/$

print dollarSlashy
