class UserInput {

  private static final int MAX_RETRY_ATTEMPTS = 3
  
  static String getPassword(def message) {
    def retryCount = 0
    def password = null
    while(retryCount <= MAX_RETRY_ATTEMPTS) {
      char[] passwordChars = System.console().readPassword "$message: "
      password = new String(passwordChars)
      def x = 1
      if(password.trim()) {
        break
      }
      else {
        println('Password cannot be blank. Please enter non-blank Password.')
        retryCount++
        if(retryCount == MAX_RETRY_ATTEMPTS) {
          println('Maximum retry attempts reached.')
          break
        }
      }
    }
    return password
  }
  
}

def p = UserInput.getPassword('Please enter password')
println "Your password is: $p"