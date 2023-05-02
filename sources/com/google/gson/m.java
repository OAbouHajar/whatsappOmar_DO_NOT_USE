package com.google.gson;

import com.google.gson.stream.JsonReader;
import java.math.BigDecimal;

/* 'enum' modifier removed */
/* compiled from: XFMFile */
public final class m extends ToNumberPolicy {
    public m() {
        super("BIG_DECIMAL", 3);
    }

    public final Number readNumber(JsonReader jsonReader) {
        String nextString = jsonReader.nextString();
        try {
            return new BigDecimal(nextString);
        } catch (NumberFormatException e2) {
            throw new JsonParseException("Cannot parse " + nextString + "; at path " + jsonReader.getPreviousPath(), e2);
        }
    }
}
