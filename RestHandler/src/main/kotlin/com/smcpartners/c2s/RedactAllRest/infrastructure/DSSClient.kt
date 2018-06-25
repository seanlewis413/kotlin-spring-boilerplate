package com.smcpartners.c2s.RedactAllRest.infrastructure

import com.smcpartners.c2s.RedactAllRest.dto.DSSRequestDto
import com.smcpartners.c2s.RedactAllRest.dto.DSSResponseDto
import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import javax.validation.Valid

@RibbonClient
@FeignClient("\${c2s.dss.context-path:/dss}")
interface DSSClient {
    @PostMapping("/segmentedDocument")
    fun segmentDocument(@Valid @RequestBody dssRequestDto: DSSRequestDto): DSSResponseDto
}