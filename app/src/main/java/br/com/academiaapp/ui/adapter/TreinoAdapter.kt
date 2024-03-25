package br.com.academiaapp.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.academiaapp.R
import br.com.academiaapp.domain.ItemTreino

class TreinoAdapter(
    private val treinos: List<ItemTreino>
) : RecyclerView.Adapter<TreinoAdapter.ViewHolder>() {

    var itemLister: (ItemTreino) -> Unit = {}

    class ViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val nome: TextView
        val repet: TextView

        init {
            view.apply {
                nome = findViewById(R.id.tv_nome_valor)
                repet = findViewById(R.id.tv_quantidade_valor)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.treino_item, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nome.text = treinos[position].nome
        holder.repet.text = treinos[position].exibir()
    }

    override fun getItemCount(): Int = treinos.size
}