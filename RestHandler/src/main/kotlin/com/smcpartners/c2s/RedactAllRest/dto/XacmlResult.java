package com.smcpartners.c2s.RedactAllRest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

/**
 * The Class XacmlResult.
 */
@XmlRootElement(name = "xacmlResult")
@XmlAccessorType(XmlAccessType.FIELD)
public class XacmlResult {

    public XacmlResult(String pdpDecision, SubjectPurposeOfUse subjectPurposeOfUse, String messageId, String homeCommunityId, List<String> pdpObligations, String patientId) {
        this.pdpDecision = pdpDecision;
        this.subjectPurposeOfUse = subjectPurposeOfUse;
        this.messageId = messageId;
        this.homeCommunityId = homeCommunityId;
        this.pdpObligations = pdpObligations;
        this.patientId = patientId;
    }

    /**
     * The pdp decision.
     */

    private String pdpDecision;

    /**
     * The subject purpose of use.
     */
    @XmlElement(name = "purposeOfUse")
    private SubjectPurposeOfUse subjectPurposeOfUse;

    /**
     * The message id.
     */
    private String messageId;

    /**
     * The home community id.
     */
    private String homeCommunityId;

    /**
     * The pdp obligations.
     */
    @XmlElement(name = "pdpObligation")
    private List<String> pdpObligations;

    /**
     * The patient id.
     */
    private String patientId;

    /**
     * Instantiates a new xacml result.
     */
    public XacmlResult() {
        pdpObligations = new LinkedList<>();
    }

    /**
     * Gets the home community id.
     *
     * @return the home community id
     */
    public String getHomeCommunityId() {
        return homeCommunityId;
    }

    /**
     * Sets the home community id.
     *
     * @param homeCommunityId the new home community id
     */
    public void setHomeCommunityId(String homeCommunityId) {
        this.homeCommunityId = homeCommunityId;
    }

    /**
     * Gets the message id.
     *
     * @return the message id
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the message id.
     *
     * @param messageId the new message id
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Gets the pdp decision.
     *
     * @return the pdp decision
     */
    public String getPdpDecision() {
        return pdpDecision;
    }

    /**
     * Sets the pdp decision.
     *
     * @param pdpDecision the new pdp decision
     */
    public void setPdpDecision(String pdpDecision) {
        this.pdpDecision = pdpDecision;
    }

    /**
     * Gets the subject purpose of use.
     *
     * @return the subject purpose of use
     */
    public SubjectPurposeOfUse getSubjectPurposeOfUse() {
        return subjectPurposeOfUse;
    }

    /**
     * Sets the subject purpose of use.
     *
     * @param subjectPurposeOfUse the new subject purpose of use
     */
    public void setSubjectPurposeOfUse(SubjectPurposeOfUse subjectPurposeOfUse) {
        this.subjectPurposeOfUse = subjectPurposeOfUse;
    }

    /**
     * Gets the pdp obligations.
     *
     * @return the pdp obligations
     */
    public List<String> getPdpObligations() {
        return pdpObligations;
    }

    /**
     * Sets the pdp obligations.
     *
     * @param pdpObligations the new pdp obligations
     */
    public void setPdpObligations(List<String> pdpObligations) {
        this.pdpObligations = pdpObligations;
    }

    /**
     * Gets the patient id.
     *
     * @return the patient id
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * Sets the patient id.
     *
     * @param patientId the new patient id
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
}
