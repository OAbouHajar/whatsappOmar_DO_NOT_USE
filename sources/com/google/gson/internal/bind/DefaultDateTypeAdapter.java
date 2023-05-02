package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: XFMFile */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public final DateType f313a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f314b;

    /* compiled from: XFMFile */
    public abstract class DateType<T extends Date> {
        public static final DateType<Date> DATE = new a();

        /* renamed from: a  reason: collision with root package name */
        public final Class f315a;

        public DateType(Class<T> cls) {
            this.f315a = cls;
        }

        public final TypeAdapterFactory createAdapterFactory(int i2) {
            return TypeAdapters.newFactory(this.f315a, new DefaultDateTypeAdapter(this, i2));
        }

        public final TypeAdapterFactory createAdapterFactory(int i2, int i3) {
            return TypeAdapters.newFactory(this.f315a, new DefaultDateTypeAdapter(this, i2, i3));
        }

        public final TypeAdapterFactory createAdapterFactory(String str) {
            return TypeAdapters.newFactory(this.f315a, new DefaultDateTypeAdapter(this, str));
        }

        public final TypeAdapterFactory createDefaultsAdapterFactory() {
            return TypeAdapters.newFactory(this.f315a, new DefaultDateTypeAdapter(this, 2, 2));
        }

        public abstract T deserialize(Date date);
    }

    public DefaultDateTypeAdapter(DateType dateType, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f314b = arrayList;
        this.f313a = (DateType) C$Gson$Preconditions.checkNotNull(dateType);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i2));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateFormat(i2));
        }
    }

    public DefaultDateTypeAdapter(DateType dateType, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.f314b = arrayList;
        this.f313a = (DateType) C$Gson$Preconditions.checkNotNull(dateType);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateTimeFormat(i2, i3));
        }
    }

    public DefaultDateTypeAdapter(DateType dateType, String str) {
        ArrayList arrayList = new ArrayList();
        this.f314b = arrayList;
        this.f313a = (DateType) C$Gson$Preconditions.checkNotNull(dateType);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    public T read(JsonReader jsonReader) {
        Date parse;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        synchronized (this.f314b) {
            Iterator it = this.f314b.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        parse = ((DateFormat) it.next()).parse(nextString);
                        break;
                    } catch (ParseException unused) {
                    }
                } else {
                    try {
                        parse = ISO8601Utils.parse(nextString, new ParsePosition(0));
                        break;
                    } catch (ParseException e2) {
                        throw new JsonSyntaxException("Failed parsing '" + nextString + "' as Date; at path " + jsonReader.getPreviousPath(), e2);
                    }
                }
            }
        }
        return this.f313a.deserialize(parse);
    }

    public String toString() {
        StringBuilder sb;
        String str;
        DateFormat dateFormat = (DateFormat) this.f314b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder("DefaultDateTypeAdapter(");
            str = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder("DefaultDateTypeAdapter(");
            str = dateFormat.getClass().getSimpleName();
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public void write(JsonWriter jsonWriter, Date date) {
        String format;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f314b.get(0);
        synchronized (this.f314b) {
            format = dateFormat.format(date);
        }
        jsonWriter.value(format);
    }
}
