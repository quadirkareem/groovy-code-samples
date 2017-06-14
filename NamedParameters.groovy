class Robot {
    def type, height, width
    
    def xxx(location, weight, fragile) {
        println "xxx: Received fragile? $fragile, weight: $weight, loc: $location"
    }
    
    def yyy(weight, fragile, location) {
        println "yyy: Received fragile? $fragile, weight: $weight, loc: $location"
    }
    
    def access(Map location, weight, fragile) {
        print "access: Received fragile? $fragile, weight: $weight, loc: $location"
    }
}

robot = new Robot(type: 'arm', width: 10, height: 40)
println "$robot.type, $robot.height, $robot.width"
//robot.xxx(x: 30, y: 20, z: 10, 50, true)
//You can change the order
robot.xxx(50, true, x: 30, y: 20, z: 10)

robot.xxx(true, 50, x: 30, y: 20, z: 10)

robot.yyy(50, true, x: 30, y: 20, z: 10)

robot.access(50, true, x: 30, y: 20, z: 10)
