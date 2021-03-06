package com.example.whoistheguest.ui.form

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.whoistheguest.R

class FormFragment : Fragment() {

    companion object {
        fun newInstance() = FormFragment()
    }

    private lateinit var viewModel: FormViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_form, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FormViewModel::class.java)
        // TODO: Use the ViewModel
    }

}