// Converter.java

// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import com.apiverve.data.Converter;
//
// Then you can deserialize a JSON string with
//
//     SunriseSunsetData data = Converter.fromJsonString(jsonString);

package com.apiverve.sunrisesunset.data;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Converter {
    // Date-time helpers

    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_INSTANT)
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetDateTime parseDateTimeString(String str) {
        return ZonedDateTime.from(Converter.DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
    }

    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
            .parseDefaulting(ChronoField.YEAR, 2020)
            .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetTime parseTimeString(String str) {
        return ZonedDateTime.from(Converter.TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
    }
    // Serialize/deserialize helpers

    public static SunriseSunsetData fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(SunriseSunsetData obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        reader = mapper.readerFor(SunriseSunsetData.class);
        writer = mapper.writerFor(SunriseSunsetData.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}

// SunriseSunsetData.java

package com.apiverve.sunrisesunset.data;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;

public class SunriseSunsetData {
    private OffsetDateTime solarNoon;
    private OffsetDateTime sunrise;
    private OffsetDateTime sunset;
    private OffsetDateTime sunriseEnd;
    private OffsetDateTime sunsetStart;
    private OffsetDateTime dawn;
    private OffsetDateTime dusk;
    private OffsetDateTime nauticalDawn;
    private OffsetDateTime nauticalDusk;
    private OffsetDateTime nightEnd;
    private OffsetDateTime night;
    private OffsetDateTime goldenHourEnd;
    private OffsetDateTime goldenHour;

    @JsonProperty("solarNoon")
    public OffsetDateTime getSolarNoon() { return solarNoon; }
    @JsonProperty("solarNoon")
    public void setSolarNoon(OffsetDateTime value) { this.solarNoon = value; }

    @JsonProperty("sunrise")
    public OffsetDateTime getSunrise() { return sunrise; }
    @JsonProperty("sunrise")
    public void setSunrise(OffsetDateTime value) { this.sunrise = value; }

    @JsonProperty("sunset")
    public OffsetDateTime getSunset() { return sunset; }
    @JsonProperty("sunset")
    public void setSunset(OffsetDateTime value) { this.sunset = value; }

    @JsonProperty("sunriseEnd")
    public OffsetDateTime getSunriseEnd() { return sunriseEnd; }
    @JsonProperty("sunriseEnd")
    public void setSunriseEnd(OffsetDateTime value) { this.sunriseEnd = value; }

    @JsonProperty("sunsetStart")
    public OffsetDateTime getSunsetStart() { return sunsetStart; }
    @JsonProperty("sunsetStart")
    public void setSunsetStart(OffsetDateTime value) { this.sunsetStart = value; }

    @JsonProperty("dawn")
    public OffsetDateTime getDawn() { return dawn; }
    @JsonProperty("dawn")
    public void setDawn(OffsetDateTime value) { this.dawn = value; }

    @JsonProperty("dusk")
    public OffsetDateTime getDusk() { return dusk; }
    @JsonProperty("dusk")
    public void setDusk(OffsetDateTime value) { this.dusk = value; }

    @JsonProperty("nauticalDawn")
    public OffsetDateTime getNauticalDawn() { return nauticalDawn; }
    @JsonProperty("nauticalDawn")
    public void setNauticalDawn(OffsetDateTime value) { this.nauticalDawn = value; }

    @JsonProperty("nauticalDusk")
    public OffsetDateTime getNauticalDusk() { return nauticalDusk; }
    @JsonProperty("nauticalDusk")
    public void setNauticalDusk(OffsetDateTime value) { this.nauticalDusk = value; }

    @JsonProperty("nightEnd")
    public OffsetDateTime getNightEnd() { return nightEnd; }
    @JsonProperty("nightEnd")
    public void setNightEnd(OffsetDateTime value) { this.nightEnd = value; }

    @JsonProperty("night")
    public OffsetDateTime getNight() { return night; }
    @JsonProperty("night")
    public void setNight(OffsetDateTime value) { this.night = value; }

    @JsonProperty("goldenHourEnd")
    public OffsetDateTime getGoldenHourEnd() { return goldenHourEnd; }
    @JsonProperty("goldenHourEnd")
    public void setGoldenHourEnd(OffsetDateTime value) { this.goldenHourEnd = value; }

    @JsonProperty("goldenHour")
    public OffsetDateTime getGoldenHour() { return goldenHour; }
    @JsonProperty("goldenHour")
    public void setGoldenHour(OffsetDateTime value) { this.goldenHour = value; }
}