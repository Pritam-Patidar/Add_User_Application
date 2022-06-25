package com.example.adduserapplication

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_user.*

class UserFragment : Fragment() {

    companion object {
        fun newInstance() = UserFragment()
    }

    private lateinit var viewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnAdd.setOnClickListener {

            if(edtUserName.length() <= 5 ){
                Toast.makeText(requireContext(), "UserName must be 5 Character", Toast.LENGTH_LONG).show()
            }else if(edtEmail.length() <= 8){
                Toast.makeText(requireContext(),"Email-Id must be 8 Character", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(requireContext(),"User Added Successfully", Toast.LENGTH_LONG).show()
            }
        }

    }

}