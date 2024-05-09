class ContaCorrente(val numeroDaConta: Int, var saldo: Double){
    
    fun depositar(valor: Double){
        saldo = saldo + valor
    }
    fun sacar(valor: Double){
        if(valor > saldo){
            println("O saque não foi aprovado")
        }else{
            saldo = saldo - valor
        }
    }
    
    fun imprimir(){
        println("Número da conta: $numeroDaConta\nSaldo: R$ $saldo")
    }
}

fun main(){
    val conta1 = ContaCorrente(1, 1000.0)
    conta1.depositar(100.0)
    conta1.sacar(200.0)
    conta1.imprimir()
}
