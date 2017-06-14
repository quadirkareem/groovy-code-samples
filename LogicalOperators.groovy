// The logical "not" has a higher priority than the logical "and".
assert !false && true

// The logical "and" has a higher priority than the logical "or".
assert false || true && true

// logical "or" operator is supporting short-circuiting: 
// if the left operand is true, it won’t evaluate the right operand.