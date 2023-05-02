package X;

import android.graphics.Paint;

/* renamed from: X.5Eh  reason: invalid class name and case insensitive filesystem */
public final class C106555Eh extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ C88804b7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106555Eh(C88804b7 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        Paint paint = new Paint(1);
        C88804b7 r1 = this.this$0;
        paint.setStyle(Paint.Style.STROKE);
        paint.setDither(true);
        paint.setStrokeWidth(r1.A04.A01);
        paint.setStrokeCap(Paint.Cap.ROUND);
        C813447u r2 = r1.A05;
        if (r2 instanceof C79463zx) {
            C13690nt.A0r(r1.A08, paint, ((C79463zx) r2).A00.statusColor);
        }
        return paint;
    }
}
