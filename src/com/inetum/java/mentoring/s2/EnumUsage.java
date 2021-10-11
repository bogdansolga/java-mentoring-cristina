package com.inetum.java.mentoring.s2;

import com.inetum.java.mentoring.model.SectionType;

public class EnumUsage {

    public static void main(String[] args) {
        SectionType sectionType = SectionType.SHOES;
        SectionType fromString = SectionType.valueOf("CLOTHES");
    }
}
