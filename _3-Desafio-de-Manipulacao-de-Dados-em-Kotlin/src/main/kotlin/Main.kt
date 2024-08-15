import java.text.DecimalFormat

fun main() {
    val produto: String = "Iphone 15 Pro"
    val preco: Double = 2555.75
    val quantProdutosComprados: Int = 10
    val taxaDeImposto: Double = 0.05
    val margemDeLucro: Double = 0.20

    // Cálculo do valor total sem imposto
    val valorTotalSemImposto: Double = preco * quantProdutosComprados

    // Cálculo do valor total com imposto
    val valorTotalComImposto: Double = valorTotalSemImposto * (1 + taxaDeImposto)

    // Cálculo do preço de venda para alcançar a margem de lucro desejada
    val precoVenda: Double = valorTotalComImposto * (1 + margemDeLucro) / quantProdutosComprados

    // Configuração da formatação de moeda
    val formatoMoeda = DecimalFormat("R$ #,##0.00")

    // Formatação dos valores
    val precoVendaFormatado = formatoMoeda.format(precoVenda)
    val valorTotalFormatado = formatoMoeda.format(valorTotalComImposto)

    // Mensagem final
    val mensagemFinal = """
        Nome do Produto: $produto
        Preço de venda sugerido: $precoVendaFormatado
        Valor total com Impostos: $valorTotalFormatado
    """.trimIndent()

    // Impressão dos resultados
    println(mensagemFinal)
}
