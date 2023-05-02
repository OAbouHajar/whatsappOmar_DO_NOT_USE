package com.google.gson;

/* 'enum' modifier removed */
/* compiled from: XFMFile */
public final class h extends LongSerializationPolicy {
    public h() {
        super("DEFAULT", 0);
    }

    public final JsonElement serialize(Long l2) {
        return l2 == null ? JsonNull.INSTANCE : new JsonPrimitive((Number) l2);
    }
}
