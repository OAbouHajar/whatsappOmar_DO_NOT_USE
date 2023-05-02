package X;

import android.util.JsonReader;
import java.io.Closeable;
import java.util.NoSuchElementException;

/* renamed from: X.54O  reason: invalid class name */
public abstract class AnonymousClass54O implements Closeable {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final JsonReader A04;

    public AnonymousClass54O(JsonReader jsonReader) {
        this.A04 = jsonReader;
    }

    public Object A00() {
        Object obj;
        if (this.A01) {
            throw AnonymousClass3K3.A0e("Closed.");
        } else if (!A01() || (obj = this.A00) == null) {
            throw new NoSuchElementException();
        } else {
            this.A00 = null;
            return obj;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01() {
        /*
            r10 = this;
            boolean r0 = r10.A01
            if (r0 != 0) goto L_0x0108
            android.util.JsonReader r4 = r10.A04
            r9 = 0
            java.lang.Object r0 = r10.A00
            r3 = 1
            if (r0 != 0) goto L_0x0107
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x0106
            boolean r0 = r10.A03
            if (r0 != 0) goto L_0x005c
            r1 = r10
            boolean r0 = r10 instanceof X.C77003v4
            if (r0 == 0) goto L_0x003e
            X.3v4 r1 = (X.C77003v4) r1
            java.util.zip.ZipInputStream r0 = r1.A01
            X.AnonymousClass00B.A06(r0)
            X.0st r0 = r1.A00
            X.AnonymousClass00B.A06(r0)
            r4.beginObject()
        L_0x0028:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.String r1 = r4.nextName()
            java.lang.String r0 = "files"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0057
            r4.skipValue()
            goto L_0x0028
        L_0x003e:
            r4.beginObject()
        L_0x0041:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.String r1 = r4.nextName()
            java.lang.String r0 = "files"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0057
            r4.skipValue()
            goto L_0x0041
        L_0x0057:
            r4.beginArray()
            r10.A03 = r3
        L_0x005c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0104
            r8 = r10
            boolean r0 = r10 instanceof X.C77003v4
            if (r0 == 0) goto L_0x009c
            X.3v4 r8 = (X.C77003v4) r8
            X.0st r6 = r8.A00
            X.AnonymousClass00B.A06(r6)
            r4.beginObject()
            r7 = 0
            r5 = r7
            r2 = r7
        L_0x0074:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.String r1 = r4.nextName()
            java.lang.String r0 = "iv"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = "path"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0092
            r4.skipValue()
            goto L_0x0074
        L_0x0092:
            java.lang.String r5 = r4.nextString()
            goto L_0x0074
        L_0x0097:
            java.lang.String r2 = r4.nextString()
            goto L_0x0074
        L_0x009c:
            X.3v3 r8 = (X.C76993v3) r8
            r4.beginObject()
            r7 = 0
            r1 = -1
            r6 = r7
        L_0x00a5:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.lang.String r5 = r4.nextName()
            java.lang.String r0 = "path"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00cd
            java.lang.String r0 = "size"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x00c8
            java.lang.String r0 = "GoogleMigrateFileData/parseFileDataObject/field not recognized"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4.skipValue()
            goto L_0x00a5
        L_0x00c8:
            long r1 = r4.nextLong()
            goto L_0x00a5
        L_0x00cd:
            java.lang.String r6 = r4.nextString()
            goto L_0x00a5
        L_0x00d2:
            r4.endObject()
            if (r6 == 0) goto L_0x00e3
            X.0st r0 = r8.A01
            java.lang.String r0 = r0.A02(r6)
            X.4Vl r7 = new X.4Vl
            r7.<init>(r0, r1)
            goto L_0x00f0
        L_0x00e3:
            java.lang.String r0 = "GoogleMigrateFileData/parseFileDataObject/file path is null or empty"
            goto L_0x00ed
        L_0x00e6:
            r4.endObject()
            if (r5 != 0) goto L_0x00f5
            java.lang.String r0 = "EncFileInfo/fromJson; file path is null, skipping..."
        L_0x00ed:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00f0:
            r10.A00 = r7
            if (r7 == 0) goto L_0x005c
            return r3
        L_0x00f5:
            if (r2 != 0) goto L_0x00fa
            java.lang.String r0 = "EncFileInfo/fromJson; file IV is null, skipping..."
            goto L_0x00ed
        L_0x00fa:
            java.lang.String r0 = r6.A02(r5)
            X.4Qv r7 = new X.4Qv
            r7.<init>(r0, r2)
            goto L_0x00f0
        L_0x0104:
            r10.A02 = r3
        L_0x0106:
            return r9
        L_0x0107:
            return r3
        L_0x0108:
            java.lang.String r0 = "Closed."
            java.io.IOException r0 = X.AnonymousClass3K3.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54O.A01():boolean");
    }

    public void close() {
        this.A01 = true;
        this.A04.close();
    }
}
