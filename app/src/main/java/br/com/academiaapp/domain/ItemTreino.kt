package br.com.academiaapp.domain

data class ItemTreino(
    val nome: String,
    val repet: Int,
    val series: Int
) {
    fun exibir(): String = "$series X $repet"
}
