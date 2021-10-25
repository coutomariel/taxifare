package br.com.locacoesferreira.taxifare

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TaxiserviceApplication

fun main(args: Array<String>) {
	runApplication<TaxiserviceApplication>(*args)
}
