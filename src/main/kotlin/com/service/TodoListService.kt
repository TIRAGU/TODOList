package com.service

import com.model.*

class TodoListService : TodoListApi{

    override fun getAllItem(): List<String> = todoItems.map{ it.name }

    override fun getTodoItem(): List<String> = todoItems.filter{ !it.status }.map{ it.name }

    override fun getCompleteItem(): List<String> = todoItems.filter{ it.status }.map{ it.name }

    override fun addItem(item: TodoItem): Unit {
        todoItems.add(item)
    }

    override fun updateItem(item: TodoItem): Boolean {
        todoItems[item.id - 1].status = true
        return false;
    }

    override fun deleteItem(id: Int): Unit {
        todoItems.removeAt(id)
    }

}