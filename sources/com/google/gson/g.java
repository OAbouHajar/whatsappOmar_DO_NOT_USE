package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;
import org.apache.commons.io.FilenameUtils;

/* 'enum' modifier removed */
/* compiled from: XFMFile */
public final class g extends FieldNamingPolicy {
    public g() {
        super("LOWER_CASE_WITH_DOTS", 6);
    }

    public final String translateName(Field field) {
        return FieldNamingPolicy.a(field.getName(), FilenameUtils.EXTENSION_SEPARATOR).toLowerCase(Locale.ENGLISH);
    }
}
