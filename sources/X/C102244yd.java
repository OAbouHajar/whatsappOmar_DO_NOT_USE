package X;

import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.obwhatsapp.gifvideopreview.GifVideoPreviewActivity;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.4yd  reason: invalid class name and case insensitive filesystem */
public class C102244yd implements AnonymousClass20R {
    public final WeakReference A00;

    public C102244yd(GifVideoPreviewActivity gifVideoPreviewActivity) {
        this.A00 = C13690nt.A0h(gifVideoPreviewActivity);
    }

    public void AQu(Exception exc) {
    }

    public void ARL(File file, String str, byte[] bArr) {
        C49302Si r1 = (C49302Si) this.A00.get();
        if (file == null) {
            if (r1 != null) {
                r1.A01.setVisibility(8);
            }
        } else if (r1 != null) {
            r1.A03.postDelayed(new RunnableRunnableShape14S0200000_I1_2(r1, 21, file), 50);
        }
    }
}
