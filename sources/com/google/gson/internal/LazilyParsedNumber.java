package com.google.gson.internal;

import java.math.BigDecimal;

/* compiled from: XFMFile */
public final class LazilyParsedNumber extends Number {

    /* renamed from: a  reason: collision with root package name */
    public final String f294a;

    public LazilyParsedNumber(String str) {
        this.f294a = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.f294a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazilyParsedNumber)) {
            return false;
        }
        String str = ((LazilyParsedNumber) obj).f294a;
        String str2 = this.f294a;
        return str2 == str || str2.equals(str);
    }

    public float floatValue() {
        return Float.parseFloat(this.f294a);
    }

    public int hashCode() {
        return this.f294a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return new java.math.BigDecimal(r0).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        return (int) java.lang.Long.parseLong(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f294a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000d }
            int r1 = (int) r0
            return r1
        L_0x000d:
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r0)
            int r0 = r1.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.LazilyParsedNumber.intValue():int");
    }

    public long longValue() {
        String str = this.f294a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public String toString() {
        return this.f294a;
    }
}
