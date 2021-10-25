package br.com.locacoesferreira.taxifare

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/taxifare")
class TaxiFareController {

    @GetMapping
    fun getAllTaxiFare(): String {
        return "Success"
    }
}