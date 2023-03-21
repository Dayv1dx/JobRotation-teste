fun main() {

    val nome = "Testando"
    
     val list = nome.split("")
     var tamanho = list.size
     
     for (i in list){

         print(list[tamanho - 1])
         tamanho--
         
     }   
     
 }