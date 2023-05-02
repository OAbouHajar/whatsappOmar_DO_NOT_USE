package X;

import com.obwhatsapp.mediacomposer.VideoComposerFragment;

/* renamed from: X.4yN  reason: invalid class name and case insensitive filesystem */
public class C102084yN implements AnonymousClass2OV {
    public final /* synthetic */ VideoComposerFragment A00;

    public C102084yN(VideoComposerFragment videoComposerFragment) {
        this.A00 = videoComposerFragment;
    }

    public String AGT() {
        return this.A00.A0N.getAbsolutePath();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap AKB() {
        /*
            r3 = this;
            X.1wq r2 = new X.1wq     // Catch:{ Exception | NoSuchMethodError -> 0x001f }
            r2.<init>()     // Catch:{ Exception | NoSuchMethodError -> 0x001f }
            com.obwhatsapp.mediacomposer.VideoComposerFragment r0 = r3.A00     // Catch:{ all -> 0x001a }
            java.io.File r0 = r0.A0N     // Catch:{ all -> 0x001a }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x001a }
            r2.setDataSource(r0)     // Catch:{ all -> 0x001a }
            r0 = 1
            android.graphics.Bitmap r0 = r2.getFrameAtTime(r0)     // Catch:{ all -> 0x001a }
            r2.close()     // Catch:{ Exception | NoSuchMethodError -> 0x001f }
            return r0
        L_0x001a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x001e }
        L_0x001e:
            throw r0     // Catch:{ Exception | NoSuchMethodError -> 0x001f }
        L_0x001f:
            r1 = move-exception
            java.lang.String r0 = "VideoComposerFragment/getvideothumb"
            com.whatsapp.util.Log.e(r0, r1)
            com.obwhatsapp.mediacomposer.VideoComposerFragment r0 = r3.A00
            java.io.File r0 = r0.A0N
            android.graphics.Bitmap r0 = X.C18830xK.A01(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102084yN.AKB():android.graphics.Bitmap");
    }
}
