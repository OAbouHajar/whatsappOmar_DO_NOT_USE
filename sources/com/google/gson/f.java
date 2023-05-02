package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* 'enum' modifier removed */
/* compiled from: XFMFile */
public final class f extends FieldNamingPolicy {
    public f() {
        super("LOWER_CASE_WITH_DASHES", 5);
    }

    public final String translateName(Field field) {
        return FieldNamingPolicy.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
    }
}
