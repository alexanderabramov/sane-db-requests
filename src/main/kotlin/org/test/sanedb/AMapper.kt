package org.test.sanedb

import org.springframework.jdbc.core.RowMapper
import java.sql.ResultSet

class AMapper : RowMapper<A> {
    override fun mapRow(rs: ResultSet, rowNum: Int): A? {
        return A(
                id = rs.getInt("a.id"),
                value = rs.getString("a.value")
        )
    }
}
