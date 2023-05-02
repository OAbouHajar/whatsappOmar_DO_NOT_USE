package com.google.gson;

import java.lang.reflect.Field;

/* 'enum' modifier removed */
/* compiled from: XFMFile */
public final class c extends FieldNamingPolicy {
    public c() {
        super("UPPER_CAMEL_CASE_WITH_SPACES", 2);
    }

    public final String translateName(Field field) {
        return FieldNamingPolicy.b(FieldNamingPolicy.a(field.getName(), ' '));
    }
}
