package X;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: X.4yL  reason: invalid class name and case insensitive filesystem */
public abstract class C102064yL implements AnonymousClass2BF {
    public final long A00;
    public final long A01;
    public final long A02;
    public final ContentResolver A03;
    public final Uri A04;
    public final String A05;
    public final String A06;

    public C102064yL(ContentResolver contentResolver, Uri uri, String str, String str2, long j2, long j3, long j4) {
        this.A03 = contentResolver;
        this.A02 = j2;
        this.A04 = uri;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = j3;
        this.A00 = j4;
    }

    public /* synthetic */ int A00() {
        return 0;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x005b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A01(int r5, long r6) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C76063tD
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r4.A05
            if (r0 != 0) goto L_0x0012
            r3 = 0
        L_0x0009:
            r2 = 0
            if (r3 != 0) goto L_0x0018
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/file=null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        L_0x0012:
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            goto L_0x0009
        L_0x0018:
            X.C41911wr.A04(r3)     // Catch:{ IOException -> 0x001d }
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 == 0) goto L_0x0030
            android.graphics.Bitmap r2 = X.C41911wr.A00(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x0029, Exception -> 0x0025 }
            return r2
        L_0x0025:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/unexpected gif exception "
            goto L_0x002c
        L_0x0029:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/gif file not read "
        L_0x002c:
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        L_0x0030:
            r2 = 512(0x200, float:7.175E-43)
            r1 = 0
            X.1wp r0 = new X.1wp
            r0.<init>(r3)
            android.graphics.Bitmap r2 = X.C18830xK.A00(r0, r2, r1)
            return r2
        L_0x003d:
            android.net.Uri r2 = r4.A04
            android.content.ContentResolver r1 = r4.A03
            X.AnonymousClass00B.A06(r2)
            r3 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r1.openFileDescriptor(r2, r0)     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x005c }
            android.graphics.Bitmap r1 = X.C61883Au.A01(r2, r5, r6)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x005d
            r2.close()     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x005c }
            goto L_0x005d
        L_0x0055:
            r0 = move-exception
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            throw r0     // Catch:{ IOException | IllegalArgumentException | NullPointerException -> 0x005c }
        L_0x005c:
            r1 = r3
        L_0x005d:
            if (r1 == 0) goto L_0x0067
            int r0 = r4.A00()
            android.graphics.Bitmap r1 = X.C61883Au.A00(r1, r0)
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102064yL.A01(int, long):android.graphics.Bitmap");
    }

    public Uri A9L() {
        return this.A04;
    }

    public long ABe() {
        return this.A01;
    }

    public /* synthetic */ long ABq() {
        return 0;
    }

    public String ADk() {
        return this.A06;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C102064yL)) {
            return false;
        }
        return this.A04.equals(((C102064yL) obj).A04);
    }

    public long getContentLength() {
        return this.A00;
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public String toString() {
        return this.A04.toString();
    }
}
