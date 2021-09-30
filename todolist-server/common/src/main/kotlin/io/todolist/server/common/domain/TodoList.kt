package io.todolist.server.common.domain

import java.time.LocalDate
import javax.persistence.*

@Entity
class TodoList(
    @Column(columnDefinition = "TEXT", nullable = false)
    var title: String,

    @Column(columnDefinition = "TEXT", nullable = false)
    var content: String,

    /** 노출 여부 */
    @Column(columnDefinition = "TINYINT")
    var shown: Int = 1,

    /** 핀 여부 */
    @Column(columnDefinition = "TINYINT")
    var pin: Int = 0,

    /** 목표 일자 */
    var targetDate: LocalDate = LocalDate.now(),

    /** 완료 일자*/
    var completedAt: LocalDate? = null,

    /** 수정 일자 */
    var updatedAt: LocalDate? = null,

    /** 생성 일자 */
    var createdAt: LocalDate = LocalDate.now()

) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
        get() = field!!

    val isCompleted: Boolean
        get() = completedAt != null

    val isShow: Boolean
        get() = shown == 1

    val isPin: Boolean
        get() = pin == 1
}