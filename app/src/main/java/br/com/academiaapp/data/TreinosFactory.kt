package br.com.academiaapp.data

import br.com.academiaapp.domain.ItemTreino

object TreinosFactory {

    val list = listOf<ItemTreino>(
        ItemTreino(
            "Flexão",
            10,
            3
        ),
        ItemTreino(
            "Agachamento",
            10,
            3
        ),
        ItemTreino(
            "Flexão",
            10,
            3
        ),
        ItemTreino(
            "Agachamento",
            10,
            3
        )
        ,ItemTreino(
            "Levantamento \nde copo",
            10,
            3
        ),
        ItemTreino(
            "Barra fixa",
            10,
            3
        )
    )

}