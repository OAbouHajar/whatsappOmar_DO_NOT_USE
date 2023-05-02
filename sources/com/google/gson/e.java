package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* 'enum' modifier removed */
/* compiled from: XFMFile */
public final class e extends FieldNamingPolicy {
    public e() {
        super("LOWER_CASE_WITH_UNDERSCORES", 4);
    }

    public final String translateName(Field field) {
        return FieldNamingPolicy.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
    }
}
