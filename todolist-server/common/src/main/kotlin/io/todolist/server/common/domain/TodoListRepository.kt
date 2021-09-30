package io.todolist.server.common.domain

import org.springframework.data.jpa.repository.JpaRepository

interface TodoListRepository : JpaRepository<TodoList, Long>