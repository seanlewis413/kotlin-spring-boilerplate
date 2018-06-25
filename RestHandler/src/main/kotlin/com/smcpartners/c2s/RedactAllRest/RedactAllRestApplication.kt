package com.smcpartners.c2s.RedactAllRest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
class RedactAllRestApplication
fun main(args: Array<String>) {

    runApplication<RedactAllRestApplication>(*args)

}
