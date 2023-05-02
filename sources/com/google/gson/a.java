package com.google.gson;

import java.lang.reflect.Field;

/* 'enum' modifier removed */
/* compiled from: XFMFile */
public final class a extends FieldNamingPolicy {
    public a() {
        super("IDENTITY", 0);
    }

    public final String translateName(Field field) {
        return field.getName();
    }
}
