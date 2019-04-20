package org.test.sanedb

import org.springframework.data.domain.Pageable
import org.springframework.data.repository.CrudRepository

interface ARepository : CrudRepository<A, Int> {
    fun list(pageable: Pageable): List<A>
}
