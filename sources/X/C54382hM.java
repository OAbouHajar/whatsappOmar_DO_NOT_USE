package X;

import android.graphics.Bitmap;
import android.view.View;
import com.obwhatsapp.WaMediaThumbnailView;

/* renamed from: X.2hM  reason: invalid class name and case insensitive filesystem */
public final class C54382hM {
    public final Bitmap A00;
    public final View A01;
    public final AnonymousClass2BF A02;
    public final String A03;

    public C54382hM() {
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
    }

    public /* synthetic */ C54382hM(Bitmap bitmap, View view, AnonymousClass2BF r4, String str, C54392hN r6, int i2) {
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
    }

    public C54382hM(WaMediaThumbnailView waMediaThumbnailView, String str) {
        C18450wi.A0H(waMediaThumbnailView, 1);
        Bitmap bitmap = waMediaThumbnailView.A00;
        AnonymousClass2BF r0 = waMediaThumbnailView.A01;
        this.A03 = str;
        this.A01 = waMediaThumbnailView;
        this.A00 = bitmap;
        this.A02 = r0;
    }
}
