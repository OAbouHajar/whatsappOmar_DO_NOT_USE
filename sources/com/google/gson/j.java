package com.google.gson;

import com.google.gson.stream.JsonReader;

/* 'enum' modifier removed */
/* compiled from: XFMFile */
public final class j extends ToNumberPolicy {
    public j() {
        super("DOUBLE", 0);
    }

    public final Number readNumber(JsonReader jsonReader) {
        return Double.valueOf(jsonReader.nextDouble());
    }
}
