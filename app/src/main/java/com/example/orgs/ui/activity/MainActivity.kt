package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recycleview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity: Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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