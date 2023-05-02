package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;

/* compiled from: XFMFile */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f380a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f381b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f382c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Field f383d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f384e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TypeAdapter f385f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Gson f386g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TypeToken f387h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f388i;

    public f(String str, boolean z2, boolean z3, Field field, boolean z4, TypeAdapter typeAdapter, Gson gson, TypeToken typeToken, boolean z5) {
        this.f383d = field;
        this.f384e = z4;
        this.f385f = typeAdapter;
        this.f386g = gson;
        this.f387h = typeToken;
        this.f388i = z5;
        this.f380a = str;
        this.f381b = z2;
        this.f382c = z3;
    }
}
