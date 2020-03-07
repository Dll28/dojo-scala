class Persona(primerNombre: String, segundoNombre: Option[String], apellido: String)

object persona{

def Main (args: Array[String]):Unit={
    def nombreCompleto = {
  segundoNombre match {
    case Some(i) => println(primerNombre+" "+i+" "+apellido)
    case None => println(primerNombre+" "+apellido)
  }
  val persona = new Persona("Pepito", Some("Arnulfo"), "Pérez")
persona.nombreCompleto //Retorna "Pepito Arnulfo Pérez"

val otraPersona = new Persona("Juan", None, "Gutiérrez")
otraPersona.nombreCompleto //Retorna "Pepito Arnulfo Pérez"

    }
    def fact(n:Int):BigInt =
    if (n==0) 1
    else n*fact(n-1)      
    }
}