package com.smcpartners.c2s.RedactAllRest.service

import com.smcpartners.c2s.RedactAllRest.dto.*
import com.smcpartners.c2s.RedactAllRest.infrastructure.DSSClient
import org.springframework.stereotype.Service
//import org.slf4j.Logger
//import org.slf4j.LoggerFactory
//import org.codehaus.jackson.map.ObjectMapper

//val log = LoggerFactory.getLogger(RedactAllServiceImpl::class.simpleName)

@Service
class RedactAllServiceImpl(val dssClient: DSSClient) : RedactAllService {
//    val mapper = ObjectMapper()
//    val log = LoggerFactory.getLogger(RedactAllServiceImpl::class.simpleName)

    override fun redactAll(redactAllRequestDto: RedactAllRequestDto): RedactAllResponseDto {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        var redactedDocument = this.dssClient.
        val document = redactAllRequestDto.document
        val subjectPurposeOfUse = SubjectPurposeOfUse.HEALTHCARE_TREATMENT

        val pdpOb: MutableList<String> = mutableListOf()

//        pdpOb.add("HIV")
//        pdpOb.add("PSY")
//        pdpOb.add("ETH")
//        pdpOb.add("GDIS")
//        pdpOb.add("SDV")
//        pdpOb.add("SEX")
//        pdpOb.add("STD")
        pdpOb.add("46240-8")
        pdpOb.add("46241-6")
        pdpOb.add("11348-0")
        pdpOb.add("18782-3")
        pdpOb.add("29554-3")
        pdpOb.add("@Allergies")
        pdpOb.add("10154-3")
        pdpOb.add("@Results")
        pdpOb.add("51848-0")
        pdpOb.add("121181")
        pdpOb.add("18776-5")
        pdpOb.add("29762-2")
        pdpOb.add("10157-6")
        pdpOb.add("@Medications")
        pdpOb.add("@Problems")
        pdpOb.add("11369-6")
        pdpOb.add("47420-5")
        pdpOb.add("HIV")
        pdpOb.add("PSY")
        pdpOb.add("ETH")
        pdpOb.add("GDIS")
        pdpOb.add("SDV")
        pdpOb.add("SEX")
        pdpOb.add("STD")

        val xacmlResult = XacmlResult("PERMIT", subjectPurposeOfUse, "555", "111", pdpOb, "333")
        val dssRequest = DSSRequestDto(xacmlResult, document)
//        log.info("DSS REQUEST START")
//        val dssRequestString = mapper.writeValueAsString(dssRequest)
//        log.info(dssRequestString)
//        log.info("DSS REQUEST STOP")
        val redactedResponse = dssClient.segmentDocument(dssRequest)
        //create response from redacted document
        val redactedDocument = redactedResponse.segmentedDocument
        return RedactAllResponseDto(redactedDocument)
    }


}