def multiply(int a, int b) {
	def result = 0;
	for( i in 0 .. b-1 ) {
		result = add(result, a);
	}
	result;
}

def add(int a, int b) {
	a+b;
}

def method = "add"
def arg1 = 1
def arg2 = 2
println add(1, 2);
println multiply(10, 0);