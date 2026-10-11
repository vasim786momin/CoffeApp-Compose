package com.example.coffeapp.screens.homescreen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeapp.model.Product


@Composable
fun ProductGrid(
    products: List<Product>
) {

    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .padding(8.dp)
    ) {
        items(products.chunked(2)){rowItem->
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                ProductCard(
                    product=rowItem[0],
                    modifier= Modifier.weight(1f)

                )

                if(rowItem.size==2){
                    ProductCard(
                        product=rowItem[1],
                        modifier= Modifier.weight(1f)

                    )
                }else{
                    Spacer(modifier = Modifier.weight(1f))
                }
            }

        }
    }
}