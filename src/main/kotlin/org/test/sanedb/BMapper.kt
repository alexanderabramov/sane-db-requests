package org.test.sanedb

import org.springframework.jdbc.core.RowMapper
import java.sql.ResultSet

class BMapper : RowMapper<B> {
    override fun mapRow(rs: ResultSet, rowNum: Int): B? {
        return B(
                id = rs.getInt("b.id"),
                value = rs.getString("b.value")
        )
    }
}
