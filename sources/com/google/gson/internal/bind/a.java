package com.google.gson.internal.bind;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.util.Date;

/* compiled from: XFMFile */
public final class a extends DefaultDateTypeAdapter.DateType {
    public a() {
        super(Date.class);
    }

    public final Date deserialize(Date date) {
        return date;
    }
}
