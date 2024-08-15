package Main
fun main() {

    // Criação e atribuição de variáveis
    val idade1: Int = 18
    val altura1: Double = 1.65
    val nome1: String = "Leo"
    val estudante1: Boolean = true

    val idade2: Int = 20
    val altura2: Double = 1.85
    val nome2: String = "Fassini"
    val estudante2: Boolean = false

    // Operações
    val somaIdades: Int = idade1 + idade2
    val alturaDobro: Double = altura2 * 2
    val saudacao: String = "Olá ${nome2}!"

    // Exibição dos resultados
    println("")
    println("Idade 1: $idade1")
    println("Altura 1: $altura1")
    println("Nome 1: $nome1")
    println("Estudante 1: $estudante1")
    println("Idade 2: $idade2")
    println("Altura 2: $altura2")
    println("Nome 2: $nome2")
    println("Estudante 2: $estudante2")
    println("Soma das idades: $somaIdades")
    println("Altura dobrada de $nome2: $alturaDobro")
    println(saudacao)
}