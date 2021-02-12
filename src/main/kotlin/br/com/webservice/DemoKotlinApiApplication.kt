package br.com.webservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoKotlinApiApplication

fun main(args: Array<String>) {
	runApplication<DemoKotlinApiApplication>(*args)
}
