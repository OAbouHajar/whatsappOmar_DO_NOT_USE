package X;

import android.graphics.Bitmap;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.52W  reason: invalid class name */
public class AnonymousClass52W implements AnonymousClass25V {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C615139f A01;
    public final /* synthetic */ Bitmap[] A02;

    public AnonymousClass52W(C615139f r1, Bitmap[] bitmapArr, int i2) {
        this.A01 = r1;
        this.A02 = bitmapArr;
        this.A00 = i2;
    }

    public int AG6() {
        return this.A00;
    }

    public /* synthetic */ void ARJ() {
    }

    public void AfV(Bitmap bitmap, View view, C16740tZ r7) {
        C615139f r3 = this.A01;
        if (bitmap != null) {
            r3.A0C.setVideoLargeThumbWithBitmap(bitmap);
            this.A02[0] = bitmap;
            return;
        }
        C14710pd r1 = r3.A09;
        if (r1 == null || !r1.A0C(2060)) {
            r3.A0C.setVideoLargeThumbWithBackground(AnonymousClass00T.A00(r3.A03, R.color.color065f));
            return;
        }
        WebPagePreviewView webPagePreviewView = r3.A0C;
        webPagePreviewView.A0D.setAlpha(0.3f);
        webPagePreviewView.setVideoLargeThumbWithBackground(-7829368);
    }

    public void Afm(View view) {
        this.A01.A0C.setVideoLargeThumbWithBackground(-7829368);
    }
}
