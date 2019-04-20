package org.test.sanedb

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
data class B(
        val value: String,
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @JsonIgnore val id: Int? = null
) {
    @ManyToOne(optional = false)
    @JsonIgnore
    var a: A? = null
}
