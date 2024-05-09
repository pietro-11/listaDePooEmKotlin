 class Pessoa(var nome: String, var idade: Int, var altura: Double){
            fun imprimir(){
                println("Nome: $nome\nIdade: $idade\nAltura: $altura")
            }
    }
   
   fun main(){
       var Pietro = Pessoa("Pietro", 17, 1.7)
       Pietro.imprimir()
   }
