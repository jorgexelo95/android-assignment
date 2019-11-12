package com.apolis.assignment.Views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.apolis.assignment.R
import com.apolis.assignment.Views.fragments.FirstFragment
import com.apolis.assignment.Views.fragments.SecondFragment
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*

class MainActivity : AppCompatActivity(), FirstFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var fragmentManager1 =
            supportFragmentManager.beginTransaction().add(R.id.fragment_container1, FirstFragment())
                .commit()
        var fragmentManager2 =
            supportFragmentManager.beginTransaction().add(R.id.fragment_container2, SecondFragment())
                .commit()

    }

    override fun onFragmentInteraction(name: String) {
        textView_name.text = editText_name.text
        textView_address.text = editText_address.text
        textView_age.text = editText_age.text
        textView_height.text = editText_height.text
        textView_pet.text = editText_pet.text
        textView_mother.text = editText_mother.text
    }
}