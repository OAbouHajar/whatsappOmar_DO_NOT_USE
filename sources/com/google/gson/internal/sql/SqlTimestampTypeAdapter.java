package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: XFMFile */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: b  reason: collision with root package name */
    public static final TypeAdapterFactory f438b = new TypeAdapterFactory() {
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.getAdapter(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final TypeAdapter f439a;

    public SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.f439a = typeAdapter;
    }

    public final Object read(JsonReader jsonReader) {
        Date date = (Date) this.f439a.read(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    public final void write(JsonWriter jsonWriter, Object obj) {
        this.f439a.write(jsonWriter, (Timestamp) obj);
    }
}
