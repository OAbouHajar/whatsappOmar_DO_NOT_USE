package X;

/* renamed from: X.4yO  reason: invalid class name and case insensitive filesystem */
public class C102094yO implements AnonymousClass2OV {
    public final long A00;
    public final /* synthetic */ C615739l A01;

    public C102094yO(C615739l r1, long j2) {
        this.A01 = r1;
        this.A00 = j2;
    }

    public String AGT() {
        return Long.toString(this.A00);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap AKB() {
        /*
            r6 = this;
            r5 = 0
            X.1wq r4 = new X.1wq     // Catch:{ Exception | OutOfMemoryError -> 0x0026 }
            r4.<init>()     // Catch:{ Exception | OutOfMemoryError -> 0x0026 }
            X.39l r0 = r6.A01     // Catch:{ all -> 0x0021 }
            com.obwhatsapp.audiopicker.AudioPickerActivity r0 = r0.A0C     // Catch:{ all -> 0x0021 }
            android.content.Context r3 = r0.getApplicationContext()     // Catch:{ all -> 0x0021 }
            android.net.Uri r2 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch:{ all -> 0x0021 }
            long r0 = r6.A00     // Catch:{ all -> 0x0021 }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r2, r0)     // Catch:{ all -> 0x0021 }
            r4.setDataSource(r3, r0)     // Catch:{ all -> 0x0021 }
            byte[] r5 = r4.getEmbeddedPicture()     // Catch:{ all -> 0x0021 }
            r4.close()     // Catch:{ Exception | OutOfMemoryError -> 0x0026 }
            goto L_0x0026
        L_0x0021:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0     // Catch:{ Exception | OutOfMemoryError -> 0x0026 }
        L_0x0026:
            if (r5 != 0) goto L_0x002b
            android.graphics.Bitmap r0 = X.C43201zV.A07
            return r0
        L_0x002b:
            r1 = 0
            int r0 = r5.length     // Catch:{ OutOfMemoryError -> 0x0032 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r5, r1, r0)     // Catch:{ OutOfMemoryError -> 0x0032 }
            return r0
        L_0x0032:
            android.graphics.Bitmap r0 = X.C43201zV.A07
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102094yO.AKB():android.graphics.Bitmap");
    }
}
