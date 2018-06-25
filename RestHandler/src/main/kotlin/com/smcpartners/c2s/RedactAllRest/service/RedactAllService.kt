package com.smcpartners.c2s.RedactAllRest.service

import com.smcpartners.c2s.RedactAllRest.dto.RedactAllRequestDto
import com.smcpartners.c2s.RedactAllRest.dto.RedactAllResponseDto

interface RedactAllService {

    fun redactAll(redactAllRequestDto: RedactAllRequestDto): RedactAllResponseDto
}