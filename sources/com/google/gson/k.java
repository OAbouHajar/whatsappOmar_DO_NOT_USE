package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;

/* 'enum' modifier removed */
/* compiled from: XFMFile */
public final class k extends ToNumberPolicy {
    public k() {
        super("LAZILY_PARSED_NUMBER", 1);
    }

    public final Number readNumber(JsonReader jsonReader) {
        return new LazilyParsedNumber(jsonReader.nextString());
    }
}
