package br.com.academiaapp.ui.treino

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.academiaapp.data.TreinosFactory
import br.com.academiaapp.domain.ItemTreino

class TreinoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _adapter = MutableLiveData<List<ItemTreino>>().apply {
        value = TreinosFactory.list
    }
    val adapter: LiveData<List<ItemTreino>> = _adapter
}