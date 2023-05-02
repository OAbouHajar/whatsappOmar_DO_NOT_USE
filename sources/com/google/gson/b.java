package com.google.gson;

import java.lang.reflect.Field;

/* 'enum' modifier removed */
/* compiled from: XFMFile */
public final class b extends FieldNamingPolicy {
    public b() {
        super("UPPER_CAMEL_CASE", 1);
    }

    public final String translateName(Field field) {
        return FieldNamingPolicy.b(field.getName());
    }
}
