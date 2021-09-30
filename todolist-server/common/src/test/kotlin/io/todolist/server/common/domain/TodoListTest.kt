package io.todolist.server.common.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.LocalDate

internal class TodoListTest{
    @Test
    fun `todoList 기본 생성`() {
        // 기본 생성 - 노출여부 : true, 핀 : false, 목표일자 : 생성일
        val todoList = TodoList("title", "content")

        assertThat(todoList.isShow).isTrue
        assertThat(todoList.isPin).isFalse
        assertThat(todoList.targetDate).isEqualTo(LocalDate.now())
        assertThat(todoList.completedAt).isNull()
    }
}