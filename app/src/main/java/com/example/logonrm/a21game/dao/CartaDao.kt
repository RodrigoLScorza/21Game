package com.example.logonrm.a21game.dao

import com.example.logonrm.a21game.R
import com.example.logonrm.a21game.model.Carta

/**
 * Created by logonrm on 31/01/2018.
 */
class CartaDao {
    private val cartas = listOf<Carta>(
            Carta(R.drawable.as_de_espada, 1),
            Carta(R.drawable.cinco_de_espada, 5),
            Carta(R.drawable.dama_de_espada, 10),
            Carta(R.drawable.dez_de_espada, 10),
            Carta(R.drawable.dois_de_espada, 2),
            Carta(R.drawable.nove_de_espada, 9),
            Carta(R.drawable.oito_de_espada, 8),
            Carta(R.drawable.quatro_de_espada, 4),
            Carta(R.drawable.rei_de_espada, 11),
            Carta(R.drawable.sete_de_espada, 7),
            Carta(R.drawable.seis_de_espada, 6),
            Carta(R.drawable.tres_de_espada, 3),
            Carta(R.drawable.valete_de_espada, 7)
    )
}