package com.yildizan.bot.kandilli.model;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class Earthquake {

    private Date date;
    private double latitude;
    private double longitude;
    private double depth;
    private double magnitude;
    private String location;

    @Override
    public String toString() {
        return "```⏰: " + new SimpleDateFormat("HH:mm:ss").format(date) + '\n' +
                "\uD83D\uDCC5: " + new SimpleDateFormat("dd.MM.yyyy").format(date) + '\n' +
                "\uD83D\uDCC8: " + magnitude + '\n' +
                "\uD83D\uDCCD: " + location + "```";
    }
}
