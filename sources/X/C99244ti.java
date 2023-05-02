package X;

import android.util.JsonReader;

/* renamed from: X.4ti  reason: invalid class name and case insensitive filesystem */
public class C99244ti implements C109615Sw {
    public C99264tk A00;
    public AnonymousClass424 A01;
    public String A02;
    public final JsonReader A03;

    public C99244ti(JsonReader jsonReader) {
        this.A03 = jsonReader;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        return r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        throw X.AnonymousClass000.A0V(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass424 ALo() {
        /*
            r4 = this;
            r0 = 0
            r4.A02 = r0
            r4.A00 = r0
            android.util.JsonReader r3 = r4.A03
            android.util.JsonToken r2 = r3.peek()
            int[] r1 = X.AnonymousClass499.A00
            int r0 = r2.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x003c;
                case 2: goto L_0x0039;
                case 3: goto L_0x0036;
                case 4: goto L_0x0033;
                case 5: goto L_0x0030;
                case 6: goto L_0x002d;
                case 7: goto L_0x002a;
                case 8: goto L_0x0027;
                case 9: goto L_0x0024;
                case 10: goto L_0x0021;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.String r0 = "unknown JsonToken "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r2)
        L_0x001c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0021:
            X.424 r0 = X.AnonymousClass424.STRING
            goto L_0x003e
        L_0x0024:
            X.424 r0 = X.AnonymousClass424.BOOLEAN
            goto L_0x003e
        L_0x0027:
            X.424 r0 = X.AnonymousClass424.END_DOCUMENT
            goto L_0x003e
        L_0x002a:
            X.424 r0 = X.AnonymousClass424.END_OBJECT
            goto L_0x003e
        L_0x002d:
            X.424 r0 = X.AnonymousClass424.START_OBJECT
            goto L_0x003e
        L_0x0030:
            X.424 r0 = X.AnonymousClass424.END_ARRAY
            goto L_0x003e
        L_0x0033:
            X.424 r0 = X.AnonymousClass424.START_ARRAY
            goto L_0x003e
        L_0x0036:
            X.424 r0 = X.AnonymousClass424.NULL
            goto L_0x003e
        L_0x0039:
            X.424 r0 = X.AnonymousClass424.NUMBER
            goto L_0x003e
        L_0x003c:
            X.424 r0 = X.AnonymousClass424.NAME
        L_0x003e:
            r4.A01 = r0
            android.util.JsonToken r0 = r3.peek()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0050;
                case 2: goto L_0x0057;
                case 3: goto L_0x0057;
                case 4: goto L_0x005f;
                case 5: goto L_0x0063;
                case 6: goto L_0x0067;
                case 7: goto L_0x006b;
                case 8: goto L_0x006e;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                default: goto L_0x004d;
            }
        L_0x004d:
            java.lang.String r0 = "unknown JsonToken "
            goto L_0x001c
        L_0x0050:
            java.lang.String r0 = r3.nextName()
            r4.A02 = r0
            goto L_0x006e
        L_0x0057:
            X.4tk r0 = new X.4tk
            r0.<init>(r3)
            r4.A00 = r0
            goto L_0x006e
        L_0x005f:
            r3.beginArray()
            goto L_0x006e
        L_0x0063:
            r3.endArray()
            goto L_0x006e
        L_0x0067:
            r3.beginObject()
            goto L_0x006e
        L_0x006b:
            r3.endObject()
        L_0x006e:
            X.424 r0 = r4.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99244ti.ALo():X.424");
    }

    public String AaN() {
        return this.A02;
    }

    public AnonymousClass424 AaO() {
        return this.A01;
    }

    public C109625Sx AaP() {
        return this.A00;
    }

    public void Afy() {
        AnonymousClass424 r1 = this.A01;
        AnonymousClass424 r3 = AnonymousClass424.START_ARRAY;
        if (r1 == r3 || r1 == AnonymousClass424.START_OBJECT) {
            int i2 = 1;
            while (true) {
                AnonymousClass424 ALo = ALo();
                if (ALo == r3 || ALo == AnonymousClass424.START_OBJECT) {
                    i2++;
                } else if (ALo == AnonymousClass424.END_ARRAY || ALo == AnonymousClass424.END_OBJECT) {
                    i2--;
                }
                if (i2 == 0) {
                    return;
                }
            }
        }
    }
}
