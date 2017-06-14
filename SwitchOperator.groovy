/* 
Switch supports the following kinds of comparisons
- Class case values matches if the switchValue is an instanceof the class
- Regular expression case value matches if the string of the switchValue matches the regex
- Collection case value matches if the switchValue is contained in the collection.
  This also includes ranges too (since they are Lists)
- if none of the above are used then the case value matches if the case value equals the switch value

in Java the default can be placed anywhere in the switch/case, 
the default in Groovy is used more as an else than assigning a default case.
*/

def i = 10
def result = ""

switch (i) {
    case Number:
        result = "Number"
        break
    case 10:
        result = 10
        break
    case Integer:
        result = "Integer"
        break
    default:
        result = "default"
}

println result


// ==============================
def x = 1.23

switch ( x ) {
    case "foo":
        result = "found foo"
        // if break is not added, 
        // then execution fall through

    case "bar":
        result += "bar"

    case [4, 5, 6, 'inList']:
        result = "list"
        break

    case 12..30:
        result = "range"
        break

    case Integer:
        result = "integer"
        break

    case Number:
        result = "number"
        break

    default:
        result = "default"
}

assert result == "number"