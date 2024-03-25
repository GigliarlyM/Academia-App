package br.com.academiaapp.ui.treino

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import br.com.academiaapp.R
import br.com.academiaapp.databinding.FragmentTreinoBinding
import br.com.academiaapp.ui.adapter.TreinoAdapter

class TreinoFragment : Fragment() {

    private var _binding: FragmentTreinoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val treinoViewModel = ViewModelProvider(this).get(TreinoViewModel::class.java)

        _binding = FragmentTreinoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView: RecyclerView = binding.listaTreino
        treinoViewModel.adapter.observe(viewLifecycleOwner) {
            recyclerView.adapter = TreinoAdapter(it)
        }

        binding.btnDepois.setOnClickListener {
            binding.btnDepois.setTextColor( resources.getColor(R.color.white) )
            binding.btnHoje.setTextColor( resources.getColor(R.color.text_unfocus) )
        }

//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}