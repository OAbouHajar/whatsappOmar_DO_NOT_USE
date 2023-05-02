package com.google.gson.internal;

/* compiled from: XFMFile */
public final class o implements CharSequence {

    /* renamed from: a  reason: collision with root package name */
    public char[] f426a;

    public final char charAt(int i2) {
        return this.f426a[i2];
    }

    public final int length() {
        return this.f426a.length;
    }

    public final CharSequence subSequence(int i2, int i3) {
        return new String(this.f426a, i2, i3 - i2);
    }
}
