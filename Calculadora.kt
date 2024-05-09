class Calculadora(){
    fun somar(a: Int, b: Int){
        println(a + b)
    }
    
    fun subtrair(a: Int, b: Int){
        println(a - b)
    }
    
    fun multiplicar(a: Int, b: Int){
        println(a * b)
    }
    
    fun dividir (a: Int, b: Int){
        println(a/b)
    }
}

fun main(){
    val calc1 = Calculadora()
    
    calc1.somar(2,2)
    calc1.subtrair(5,2)
    calc1.multiplicar(3,2)
    calc1.dividir(10,2)
}
