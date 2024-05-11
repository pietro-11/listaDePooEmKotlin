class Gato(var nome: String, var raca: String, var idade: Int){
    fun miar(){
        println("Miau!")
    }
}

fun main(){
    val gato1 = Gato("yu", "siamês", 2)
    
    gato1.miar()
}
