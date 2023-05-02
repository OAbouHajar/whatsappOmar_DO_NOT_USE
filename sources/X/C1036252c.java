package X;

import android.graphics.Bitmap;
import android.util.Pair;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.52c  reason: invalid class name and case insensitive filesystem */
public abstract class C1036252c implements AnonymousClass25V {
    public final /* synthetic */ C615139f A00;

    public C1036252c(C615139f r1) {
        this.A00 = r1;
    }

    public int AG6() {
        return 0;
    }

    public /* synthetic */ void ARJ() {
    }

    public void AfV(Bitmap bitmap, View view, C16740tZ r9) {
        C30771cv r0 = r9.A0U;
        AnonymousClass00B.A06(r0);
        C615139f r4 = this.A00;
        int i2 = r0.A01;
        int i3 = r0.A00;
        C73853pA r1 = r4.A02;
        r1.A09(i2, i3);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        Pair A07 = r1.A07(makeMeasureSpec, makeMeasureSpec);
        int A0D = AnonymousClass000.A0D(A07.first);
        int i4 = (A0D - r4.A00) - r4.A01;
        int A0D2 = (AnonymousClass000.A0D(A07.second) * i4) / A0D;
        int i5 = new int[]{i4, A0D2}[0];
        if (this instanceof C73663oh) {
            C73663oh r3 = (C73663oh) this;
            C615139f r12 = r3.A00;
            WebPagePreviewView webPagePreviewView = r12.A0C;
            webPagePreviewView.A0A.getLayoutParams().width = i5;
            webPagePreviewView.A0A.getLayoutParams().height = A0D2;
            webPagePreviewView.A0A.requestLayout();
            if (bitmap == null) {
                webPagePreviewView.setVideoLargeThumbWithBackground(AnonymousClass00T.A00(r12.A03, R.color.color065f));
                return;
            }
            webPagePreviewView.setVideoLargeThumbWithBitmap(bitmap);
            r3.A01[0] = bitmap;
            return;
        }
        C615139f r02 = ((C73653og) this).A00;
        WebPagePreviewView webPagePreviewView2 = r02.A0C;
        webPagePreviewView2.A05(i5, A0D2);
        if (bitmap == null) {
            webPagePreviewView2.setImageLargeThumbWithBackground(AnonymousClass00T.A00(r02.A03, R.color.color065f));
        } else {
            webPagePreviewView2.setImageLargeThumbWithBitmap(bitmap);
        }
    }

    public /* synthetic */ void Afm(View view) {
    }
}
