fun main(){
    multiples()
    robot(12)
    robot(7)
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
    fun  multiples() {
        for (num in 1..100){
            if (num % 15 == 0){
                println("FizzBuzz")
            }else if(num % 5 == 0){
                println("Buzz")
            }else if(num % 3 == 0){
                println("Fizz")
            }else{
                println("num")
            }
        }


    }
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun robot(age:Int) {
    if (age < 6) {
        println("Glass of milk")
    } else if (age < 15 && age > 6) {
        println("Bottle of fanta orange")
    } else {
        println("Bottle of coca cola")
    }

}
