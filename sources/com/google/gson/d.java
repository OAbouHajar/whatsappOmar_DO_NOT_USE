package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* 'enum' modifier removed */
/* compiled from: XFMFile */
public final class d extends FieldNamingPolicy {
    public d() {
        super("UPPER_CASE_WITH_UNDERSCORES", 3);
    }

    public final String translateName(Field field) {
        return FieldNamingPolicy.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
    }
}
