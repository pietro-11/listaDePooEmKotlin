class Triangulo(var ladoA: Double, var ladoB: Double, var ladoC: Double){
    fun area(base: Double, altura: Double){
        println((base*altura)/2)
    }
    fun calcPerimetro(){
        println(ladoA + ladoB + ladoC)
    }
}

fun main(){
    val t1 = Triangulo(2.0,3.0,4.0)
    t1.area(2.0,5.0)
    t1.calcPerimetro()
}
