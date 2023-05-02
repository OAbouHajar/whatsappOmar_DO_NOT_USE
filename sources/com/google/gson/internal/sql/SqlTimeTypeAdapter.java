package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* compiled from: XFMFile */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final TypeAdapterFactory f436b = new TypeAdapterFactory() {
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f437a;

    private SqlTimeTypeAdapter() {
        this.f437a = new SimpleDateFormat("hh:mm:ss a");
    }

    public /* synthetic */ SqlTimeTypeAdapter(int i2) {
        this();
    }

    public final Object read(JsonReader jsonReader) {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        try {
            synchronized (this) {
                time = new Time(this.f437a.parse(nextString).getTime());
            }
            return time;
        } catch (ParseException e2) {
            throw new JsonSyntaxException("Failed parsing '" + nextString + "' as SQL Time; at path " + jsonReader.getPreviousPath(), e2);
        }
    }

    public final void write(JsonWriter jsonWriter, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format = this.f437a.format(time);
        }
        jsonWriter.value(format);
    }
}
