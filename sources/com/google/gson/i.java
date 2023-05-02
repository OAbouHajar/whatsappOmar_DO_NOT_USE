package com.google.gson;

/* 'enum' modifier removed */
/* compiled from: XFMFile */
public final class i extends LongSerializationPolicy {
    public i() {
        super("STRING", 1);
    }

    public final JsonElement serialize(Long l2) {
        return l2 == null ? JsonNull.INSTANCE : new JsonPrimitive(l2.toString());
    }
}
