package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* compiled from: XFMFile */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final TypeAdapterFactory f434b = new TypeAdapterFactory() {
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f435a;

    private SqlDateTypeAdapter() {
        this.f435a = new SimpleDateFormat("MMM d, yyyy");
    }

    public /* synthetic */ SqlDateTypeAdapter(int i2) {
        this();
    }

    public final Object read(JsonReader jsonReader) {
        java.util.Date parse;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        try {
            synchronized (this) {
                parse = this.f435a.parse(nextString);
            }
            return new Date(parse.getTime());
        } catch (ParseException e2) {
            throw new JsonSyntaxException("Failed parsing '" + nextString + "' as SQL Date; at path " + jsonReader.getPreviousPath(), e2);
        }
    }

    public final void write(JsonWriter jsonWriter, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format = this.f435a.format(date);
        }
        jsonWriter.value(format);
    }
}
