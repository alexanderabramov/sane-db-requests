package org.test.sanedb

import org.springframework.data.domain.Pageable
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/spring-jdbc")
class SpringJdbcController(
        val jdbcTemplate: JdbcTemplate
) {
    val aMapper = AMapper()

    @GetMapping("/as")
    fun list(pageable: Pageable): List<A> {
        return jdbcTemplate.query("SELECT a.id, a.value from a LIMIT ?", arrayOf(pageable.pageSize), aMapper)
    }
}
