package io.todolist.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodolistServerApplication

fun main(args: Array<String>) {
    runApplication<TodolistServerApplication>(*args)
}
