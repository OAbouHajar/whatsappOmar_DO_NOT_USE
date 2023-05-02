package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: XFMFile */
public final class JsonStreamParser implements Iterator<JsonElement> {

    /* renamed from: a  reason: collision with root package name */
    public final JsonReader f273a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f274b;

    public JsonStreamParser(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.f273a = jsonReader;
        jsonReader.setLenient(true);
        this.f274b = new Object();
    }

    public JsonStreamParser(String str) {
        this((Reader) new StringReader(str));
    }

    public boolean hasNext() {
        boolean z2;
        synchronized (this.f274b) {
            try {
                z2 = this.f273a.peek() != JsonToken.END_DOCUMENT;
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            } catch (IOException e3) {
                throw new JsonIOException((Throwable) e3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public JsonElement next() {
        if (hasNext()) {
            try {
                return Streams.parse(this.f273a);
            } catch (StackOverflowError e2) {
                throw new JsonParseException("Failed parsing JSON source to Json", e2);
            } catch (OutOfMemoryError e3) {
                throw new JsonParseException("Failed parsing JSON source to Json", e3);
            } catch (JsonParseException e4) {
                e = e4;
                if (e.getCause() instanceof EOFException) {
                    e = new NoSuchElementException();
                }
                throw e;
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
