package org.test.sanedb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.EnableTransactionManagement


@SpringBootApplication
@EnableTransactionManagement
class SaneApplication

fun main(args: Array<String>) {
    runApplication<SaneApplication>(*args)
}
