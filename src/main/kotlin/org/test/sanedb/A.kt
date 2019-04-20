package org.test.sanedb

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.BatchSize
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import javax.persistence.*

@Entity
data class A(
        val value: String,

        @BatchSize(size = 100) @Fetch(FetchMode.SELECT)
        @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER, mappedBy = "a") val bs: List<B> = listOf(),

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @JsonIgnore val id: Int? = null
)
