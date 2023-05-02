package X;

import com.obwhatsapp.webpagepreview.WebPagePreviewView;
import java.util.List;

/* renamed from: X.56F  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56F implements Runnable {
    public final /* synthetic */ C70653hS A00;
    public final /* synthetic */ AnonymousClass4OT A01;
    public final /* synthetic */ WebPagePreviewView A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ AnonymousClass56F(C70653hS r1, AnonymousClass4OT r2, WebPagePreviewView webPagePreviewView, List list, boolean z2, boolean z3) {
        this.A02 = webPagePreviewView;
        this.A00 = r1;
        this.A04 = z2;
        this.A03 = list;
        this.A05 = z3;
        this.A01 = r2;
    }

    public final void run() {
        WebPagePreviewView webPagePreviewView = this.A02;
        C70653hS r4 = this.A00;
        boolean z2 = this.A04;
        List list = this.A03;
        boolean z3 = this.A05;
        AnonymousClass4OT r0 = this.A01;
        webPagePreviewView.A08(r4, list, z2, z3);
        r0.A01.A01(r0.A00, r0.A02, r0.A03, r0.A04, r0.A05, r0.A06, r0.A07);
    }
}
