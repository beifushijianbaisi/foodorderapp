package com.uilover.project2142.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.uilover.project2142.Model.CategoryModel
import com.uilover.project2142.Model.FoodModel
import com.uilover.project2142.Repository.MainRepository

class MainViewModel : ViewModel() {
    private val repository = MainRepository()

    fun loadCategory(): LiveData<MutableList<CategoryModel>> {
        return repository.loadCategory()
    }

    fun loadPopular(): LiveData<MutableList<FoodModel>> {
        return repository.loadPopular()
    }
}