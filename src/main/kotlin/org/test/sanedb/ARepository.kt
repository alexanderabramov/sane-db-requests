package org.test.sanedb

import org.springframework.data.repository.PagingAndSortingRepository

interface ARepository : PagingAndSortingRepository<A, Int>
