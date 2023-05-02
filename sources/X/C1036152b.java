package X;

import android.graphics.Bitmap;
import android.view.View;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.52b  reason: invalid class name and case insensitive filesystem */
public class C1036152b implements AnonymousClass25V {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C30771cv A03;
    public final /* synthetic */ C606734v A04;
    public final /* synthetic */ WebPagePreviewView A05;
    public final /* synthetic */ boolean A06;

    public C1036152b(View view, View view2, C30771cv r3, C606734v r4, WebPagePreviewView webPagePreviewView, int i2, boolean z2) {
        this.A04 = r4;
        this.A05 = webPagePreviewView;
        this.A01 = view;
        this.A02 = view2;
        this.A03 = r3;
        this.A00 = i2;
        this.A06 = z2;
    }

    public int AG6() {
        return this.A04.A0N;
    }

    public /* synthetic */ void ARJ() {
    }

    public void AfV(Bitmap bitmap, View view, C16740tZ r12) {
        C606734v r3 = this.A04;
        WebPagePreviewView webPagePreviewView = this.A05;
        View view2 = this.A01;
        View view3 = this.A02;
        C30771cv r0 = this.A03;
        C606734v.A01(bitmap, view2, view3, r3, webPagePreviewView, r0.A01, r0.A00, this.A00, this.A06);
    }

    public /* synthetic */ void Afm(View view) {
    }
}
