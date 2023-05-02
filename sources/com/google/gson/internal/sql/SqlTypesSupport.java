package com.google.gson.internal.sql;

import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: XFMFile */
public final class SqlTypesSupport {
    public static final DefaultDateTypeAdapter.DateType<? extends Date> DATE_DATE_TYPE;
    public static final TypeAdapterFactory DATE_FACTORY;
    public static final boolean SUPPORTS_SQL_TYPES;
    public static final DefaultDateTypeAdapter.DateType<? extends Date> TIMESTAMP_DATE_TYPE;
    public static final TypeAdapterFactory TIMESTAMP_FACTORY;
    public static final TypeAdapterFactory TIME_FACTORY;

    static {
        boolean z2;
        TypeAdapterFactory typeAdapterFactory;
        try {
            Class.forName("java.sql.Date");
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
        }
        SUPPORTS_SQL_TYPES = z2;
        if (z2) {
            DATE_DATE_TYPE = new a(java.sql.Date.class, 0);
            TIMESTAMP_DATE_TYPE = new a(Timestamp.class, 1);
            DATE_FACTORY = SqlDateTypeAdapter.f434b;
            TIME_FACTORY = SqlTimeTypeAdapter.f436b;
            typeAdapterFactory = SqlTimestampTypeAdapter.f438b;
        } else {
            typeAdapterFactory = null;
            DATE_DATE_TYPE = null;
            TIMESTAMP_DATE_TYPE = null;
            DATE_FACTORY = null;
            TIME_FACTORY = null;
        }
        TIMESTAMP_FACTORY = typeAdapterFactory;
    }
}
