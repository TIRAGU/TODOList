package com.model

val todoItems = arrayListOf<TodoItem>(
    TodoItem(0,"세수하기",true),
    TodoItem(1,"출근하기",true),
    TodoItem(2,"점심먹기", false),
    TodoItem(3,"퇴근하기",false)
)

data class TodoItem(var id: Int, val name: String, var status : Boolean)