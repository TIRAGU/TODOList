package com.service

import com.model.TodoItem

interface TodoListApi {
    fun getAllItem() : List<String>
    fun getTodoItem() : List<String>
    fun getCompleteItem() : List<String>
    fun addItem(item : TodoItem) : Unit
    fun updateItem(item : TodoItem) : Boolean
    fun deleteItem(id : Int) : Unit
}