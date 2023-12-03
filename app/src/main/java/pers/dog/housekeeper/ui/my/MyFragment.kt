package pers.dog.housekeeper.ui.my

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import pers.dog.housekeeper.databinding.FragmentMyBinding
import pers.dog.housekeeper.viewmodel.MyViewModel

class MyFragment : Fragment() {

    private var _binding: FragmentMyBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMyBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myViewModel = ViewModelProvider(this)[MyViewModel::class.java]

        binding.lifecycleOwner = viewLifecycleOwner
        binding.myViewModel = myViewModel
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}