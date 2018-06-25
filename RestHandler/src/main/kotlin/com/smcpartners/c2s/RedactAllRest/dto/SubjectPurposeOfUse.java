package com.smcpartners.c2s.RedactAllRest.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

/**
 * The Enum SubjectPurposeOfUse.
 */
@XmlEnum
public enum SubjectPurposeOfUse {
    @XmlEnumValue("TREATMENT")
    HEALTHCARE_TREATMENT("TREATMENT"),
    @XmlEnumValue("PAYMENT")
    PAYMENT("PAYMENT"),
    @XmlEnumValue("RESEARCH")
    RESEARCH("RESEARCH");

    private final String purpose;

    SubjectPurposeOfUse(String p) {
        purpose = p;
    }

    public static SubjectPurposeOfUse fromValue(String v) {
        return valueOf(v);
    }

    public static SubjectPurposeOfUse fromAbbreviation(String purposeOfUse) {
        for (SubjectPurposeOfUse p : SubjectPurposeOfUse.values()) {
            if (p.getPurpose().equals(purposeOfUse)) {
                return p;
            }
        }
        StringBuilder builder = new StringBuilder();
        builder.append("The abbreviation '");
        builder.append(purposeOfUse);
        builder.append("' is not defined in this enum.");
        throw new IllegalArgumentException(builder.toString());
    }

    public String getPurpose() {
        return purpose;
    }
}
