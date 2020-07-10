package com.arpitram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Tests for Customer Specification")
public class CustomerSpec {
    @BeforeEach
    void setUpCustomer(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
    }

    @Test
    @DisplayName("String check")
    void areStringEquals(){
        assertTrue(() -> "arpit".equalsIgnoreCase("ARPIT"));
    }
}
