package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmations.data.Datasource
import com.example.affirmations.databinding.ActivityMainBinding
import com.example.affirmations.model.ItemAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var datasource: Datasource

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        datasource = Datasource()
        setContentView(binding.root)
        val myDataSet = datasource.loadAffirmations()
        val recyclerView = binding.recyclerView
        recyclerView.adapter = ItemAdapter(this, myDataSet)
        recyclerView.setHasFixedSize(true)
        //binding.affirmationsCountTextView.text = datasource.loadAffirmations().size.toString()
    }
}