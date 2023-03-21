
fun main() {
    val numero_procurado = 8
    val numero_termosSequencia = 12
    var x1 = 0
    var x2 = 1
    
    val sequenciaFibonacci: MutableList<Int> = mutableListOf() 
    
  for (i in 1..numero_termosSequencia) {
        
		sequenciaFibonacci.add(x1)
        
        val soma = x1 + x2
        
        x1 = x2
        x2 = soma
    }
  
  if(sequenciaFibonacci.contains(numero_procurado)){
      println("O número procurado ($numero_procurado) pertence a Sequência de Fibonacci")
  } else{
      println("O número procurado ($numero_procurado) não faz parte da Sequência de Fibonacci")

  }
  
}