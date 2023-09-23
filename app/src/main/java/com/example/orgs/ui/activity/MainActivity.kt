package com.example.orgs.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recycleview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity: AppCompatActivity(R.layout.activity_main){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            this,
            listOf(
                Produto("teste", "Descricao", BigDecimal(50)),
                Produto("teste 2", "Descricao 1", BigDecimal(50)),
                Produto("teste 3", "Descricao 2", BigDecimal(50)),
            )
        )

    }
}