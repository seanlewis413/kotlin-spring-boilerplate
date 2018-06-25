package com.smcpartners.c2s.RedactAllRest.web

import com.smcpartners.c2s.RedactAllRest.RedactAllTestRequest
import com.smcpartners.c2s.RedactAllRest.dto.RedactAllRequestDto
import com.smcpartners.c2s.RedactAllRest.dto.RedactAllResponseDto
import com.smcpartners.c2s.RedactAllRest.service.RedactAllServiceImpl
import org.springframework.web.bind.annotation.*

@RestController
class RedactAllController(val redactAllServiceImpl: RedactAllServiceImpl) {

//    @GetMapping("/")
//    //Mapped to the url 'http://HOSTNAME:8080/greeting?name=MYNAME' GET method returns greeting based off of name valu
//    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) = RedactAllTestRequest("hello $name")

    @PostMapping("/redactAll")
    fun redactAll(@RequestBody redactAllRequestDto: RedactAllRequestDto): RedactAllResponseDto {
        return this.redactAllServiceImpl.redactAll(redactAllRequestDto)
    }
}