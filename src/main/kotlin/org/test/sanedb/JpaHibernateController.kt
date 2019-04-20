package org.test.sanedb

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/jpa-hibernate")
class JpaHibernateController(
        val repository: ARepository
) {
    @GetMapping("/as")
    fun list(pageable: Pageable): Page<A> {
        return repository.findAll(pageable)
    }
}
