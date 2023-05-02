package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.2sK  reason: invalid class name and case insensitive filesystem */
public final class C58002sK extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92684hy();
    public String A00;

    public C58002sK(String str) {
        C13710nw.A02(str, "json must not be null");
        this.A00 = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|(2:17|18)|19|20|21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0020 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0023 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x0023=Splitter:B:12:0x0023, B:21:0x003d=Splitter:B:21:0x003d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C58002sK A03(android.content.Context r6, int r7) {
        /*
            android.content.res.Resources r0 = r6.getResources()
            java.io.InputStream r6 = r0.openRawResource(r7)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x003e }
            r5.<init>()     // Catch:{ IOException -> 0x003e }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r4]     // Catch:{ IOException -> 0x003e }
        L_0x0011:
            r2 = 0
            int r1 = r6.read(r3, r2, r4)     // Catch:{ all -> 0x0034 }
            r0 = -1
            if (r1 == r0) goto L_0x001d
            r5.write(r3, r2, r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0011
        L_0x001d:
            r6.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            r5.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            byte[] r2 = r5.toByteArray()     // Catch:{ IOException -> 0x003e }
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x003e }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x003e }
            X.2sK r0 = new X.2sK     // Catch:{ IOException -> 0x003e }
            r0.<init>(r1)     // Catch:{ IOException -> 0x003e }
            return r0
        L_0x0034:
            r0 = move-exception
            if (r6 == 0) goto L_0x003a
            r6.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            r5.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            throw r0     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = r2.length()
            int r0 = r0 + 37
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Failed to read resource "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ": "
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58002sK.A03(android.content.Context, int):X.2sK");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A01 = C32251fv.A01(parcel, 20293);
        C32251fv.A0A(parcel, this.A00, 2, false);
        C32251fv.A05(parcel, A01);
    }
}
