package com.google.gson.internal;

import java.io.Writer;

/* compiled from: XFMFile */
public final class p extends Writer {

    /* renamed from: a  reason: collision with root package name */
    public final Appendable f427a;

    /* renamed from: b  reason: collision with root package name */
    public final o f428b = new o();

    public p(Appendable appendable) {
        this.f427a = appendable;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final void write(int i2) {
        this.f427a.append((char) i2);
    }

    public final void write(char[] cArr, int i2, int i3) {
        o oVar = this.f428b;
        oVar.f426a = cArr;
        this.f427a.append(oVar, i2, i3 + i2);
    }
}
