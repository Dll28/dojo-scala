import scala.collection.mutable.{Set,ListMap}
import scala.collection.mutable

object prueba{

    def main(args: Array[String]): Unit = {
           
      val n = 5
if (n == 5) {
    print("Si, n vale 5")
  } else {
    if (n == 6) {
      println("Vale 6")
    } else {
      println("Tiene otro valor")
    }
  }
     val valor = 6
   println(valor match {
      case 1 => "Uno"
      case 2 => "Dos"
      case 3 => "Tres"
      case 4 => "Cuatro"
      case 5 => "Cinco"
      case 6 => "Seis"
      //El case _ funciona como un default
      case _ => "Ninguno"
   })
     var k = 0;

    while (k < 5) {
    
      //Igual que en java
      println("k vale " + k)
      k = k + 1
      
    }
         k = 0;

    do {

      println(s"k vale $k+ asd")

      k = k + 1
    } while (k < 5)

    val frutas = Array("Pera", "Manzana", "Naranja")
      println(frutas.length)   //Tamaño => 3
   println(frutas.apply(1)) //Posición => Manzana
   println(frutas(1))       // Otra forma de escribir la posición => Manzana
   println(frutas.isEmpty)  //Si esta vacio => false
   println(frutas.nonEmpty)  //Si no esta vacio => true
   
   println(frutas.indexOf("Pera"))  //Posición de un objeto => 0
    val numeros = List(4, 8, 15, 16, 23, 42);
    val dobles=numeros.map{x=>2*x}
        println(dobles);
    
    val lista = List(List(1,2,6), List(2,3,5))

    //Obtendremos el doble de cada sublista
    println(lista.map{(x: List[Int]) => x.map{ n => n*2}})


    val mapa1 = mutable.Map(4 -> "Carlos", 5 -> "Juan")
    val mapa2 = mutable.Map(1 -> "Elena", 2 -> "Luis", 3 -> "Miguel")
    mapa1 += (6 -> "Daniel", 7 -> "Camilo")  //Agrega registros a mapa1


    val set = Set(1,2,3,4,5)

    println(set(1)) //Buscar un elemento.
   
    println(set + 6) //Agregar un elemento.
    val lenguajes = Seq("Java", "Scala", "Kotlin")
    lenguajes.foreach(l => println("${l} me parece un buen lenguaje"))
    }
}
