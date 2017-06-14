public class Greetings {
    public static void main(String[] args) {
       // for(i in 0 .. 2) { print 'ho ' }
      // 0.upto(2) { print 'ho ' }
     // 0.upto(2) { print "$it " }
       // 3.times  { print "$it " }
        0.step(10, 2) { print "$it " }
        for(i in 0 .. 2) { print '$i ' }
        println '\nMerry Groovy!'
        println 'hello'.reverse()
        print 'bolo'.reverse()
        print 'chalo'.reverse()
    }
}