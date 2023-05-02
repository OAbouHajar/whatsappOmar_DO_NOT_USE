package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: XFMFile */
public final class a extends DefaultDateTypeAdapter.DateType {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f440b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Class cls, int i2) {
        super(cls);
        this.f440b = i2;
    }

    public final Date deserialize(Date date) {
        switch (this.f440b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
