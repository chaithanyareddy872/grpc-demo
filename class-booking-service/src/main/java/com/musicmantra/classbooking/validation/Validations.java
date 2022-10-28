package com.musicmantra.classbooking.validation;

import com.google.protobuf.Timestamp;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Validations {
    public Boolean stringvalidation(String val){
        return val.matches(".*[a-zA-Z]+.*");
    }
    public boolean dateandtimevalidation(Timestamp timestamp){
        Instant instant = Instant.ofEpochSecond(timestamp.getSeconds(),
                timestamp.getNanos());
        LocalDateTime givendate = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime nowdate =LocalDateTime.now();
        return timestamp.isInitialized() && givendate.isAfter(nowdate);
    }
    public boolean statusvalidation(String val){
        return val.equalsIgnoreCase("confirm")||val.equalsIgnoreCase("cancel");
    }
}
