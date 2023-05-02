package com.google.gson.internal;

import com.google.gson.stream.JsonReader;

/* compiled from: XFMFile */
public abstract class JsonReaderInternalAccess {
    public static JsonReaderInternalAccess INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader);
}
