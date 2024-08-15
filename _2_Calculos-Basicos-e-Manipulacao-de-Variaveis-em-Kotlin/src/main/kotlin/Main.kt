fun main() {
    // 1. Criação de Variáveis
    val nome: String
    var idade: Int
    var salarioBrutoMensal: Double
    val quantidadeMesesTrabalhados: Int
    val quantidadeProdutosComprados: Int


    // 2. Atribuição de Valores
    nome = "Leonardo"
    idade = 18
    salarioBrutoMensal = 2500.00
    quantidadeMesesTrabalhados = 12
    quantidadeProdutosComprados = 15


    // 3. Operações Simples
    val salarioAnualBruto = salarioBrutoMensal * quantidadeMesesTrabalhados
    val desconto = 1000.00
    val salarioAnualLiquido = salarioAnualBruto - desconto


    // Concatenação da mensagem
    val mensagem = "O nome do funcionário é $nome e o seu salário anual líquido é R$$salarioAnualLiquido."


    // 4. Exibição de Resultados
    println("Nome: $nome")
    println("Idade: $idade anos")
    println("Salário Bruto Mensal: R$$salarioBrutoMensal")
    println("Quantidade de Meses Trabalhados: $quantidadeMesesTrabalhados")
    println("Quantidade de Produtos Comprados: $quantidadeProdutosComprados")
    println("Salário Anual Bruto: R$$salarioAnualBruto")
    println("Salário Anual Líquido: R$$salarioAnualLiquido")
    println(mensagem)
}

