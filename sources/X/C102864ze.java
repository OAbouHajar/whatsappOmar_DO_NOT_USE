package X;

import android.graphics.Bitmap;
import com.obwhatsapp.mediaview.PhotoView;

/* renamed from: X.4ze  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C102864ze implements AnonymousClass29A {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C100484vi A01;
    public final /* synthetic */ PhotoView A02;

    public /* synthetic */ C102864ze(Bitmap bitmap, C100484vi r2, PhotoView photoView) {
        this.A01 = r2;
        this.A02 = photoView;
        this.A00 = bitmap;
    }

    public final void AZA(boolean z2) {
        C001000l A0C;
        C100484vi r0 = this.A01;
        PhotoView photoView = this.A02;
        Bitmap bitmap = this.A00;
        if (z2 && (A0C = r0.A02.A0C()) != null && !A0C.isFinishing()) {
            photoView.A06(bitmap);
        }
    }
}
