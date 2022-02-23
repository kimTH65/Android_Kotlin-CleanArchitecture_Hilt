package com.example.memo.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.memo.RecyclerViewAdapter
import com.example.memo.databinding.FragmentMainBinding
import com.example.memo.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Fragment_Main : Fragment() {
    private var mBinding: FragmentMainBinding? = null
    private val binding get() = mBinding!!

    private val mainViewModel by viewModels<MainViewModel>()

    private fun init(){
        observeViewModel()
    }
    private fun observeViewModel(){
        val result = mainViewModel.getMovie("0a248ab8367333fba08f7bfade19fce4","20220215")

        val mAdapter = RecyclerViewAdapter(requireContext() , mainViewModel)
        val LinearManager = LinearLayoutManager(requireContext())
        LinearManager.reverseLayout = true
        LinearManager.stackFromEnd = true


        mainViewModel.movieRepository.observe(requireActivity(), Observer { movies ->
            // Update the cached copy of the users in the adapter.
            movies?.let { mAdapter.setMovies(it) }
        })

        binding.recyclerview.apply {
            adapter = mAdapter
            layoutManager = LinearManager
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentMainBinding.inflate(inflater, container, false)

        init()



        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}