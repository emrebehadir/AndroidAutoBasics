package com.emrebehadir.auto

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.ItemList
import androidx.car.app.model.ListTemplate
import androidx.car.app.model.Row
import androidx.car.app.model.Template

class ShopScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        return ListTemplate.Builder()
            .setTitle("Shop List")
            .setSingleList(
                ItemList.Builder()
                    .addItem(
                        Row.Builder()
                            .setTitle("First Shop")
                            .build()
                    )
                    .addItem(
                        Row.Builder()
                            .setTitle("Second Shop")
                            .build()
                    )
                    .build()
            )
            .build()
    }
}