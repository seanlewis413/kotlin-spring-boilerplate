package com.smcpartners.c2s.RedactAllRest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RedactAllController {

    @GetMapping("/greeting")
    //Mapped to the url 'http://HOSTNAME:8080/greeting?name=MYNAME' GET method returns greeting based off of name valu
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) = RedactAllTestRequest("hello $name")
}