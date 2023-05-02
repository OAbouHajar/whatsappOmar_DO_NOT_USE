package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.0IQ  reason: invalid class name */
public class AnonymousClass0IQ extends AnonymousClass0QD {
    public float A00;
    public float A01;
    public RectF A02 = AnonymousClass000.A0K();
    public final /* synthetic */ AnonymousClass0XJ A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0IQ(AnonymousClass0XJ r2, float f2, float f3) {
        super(r2);
        this.A03 = r2;
        this.A00 = f2;
        this.A01 = f3;
    }

    public void A00(String str) {
        AnonymousClass0XJ r4 = this.A03;
        if (r4.A0w()) {
            Rect A0J = AnonymousClass000.A0J();
            r4.A02.A00.getTextBounds(str, 0, str.length(), A0J);
            RectF rectF = new RectF(A0J);
            rectF.offset(this.A00, this.A01);
            this.A02.union(rectF);
        }
        this.A00 += r4.A02.A00.measureText(str);
    }

    public boolean A01(C03250Hu r7) {
        if (!(r7 instanceof AnonymousClass0II)) {
            return true;
        }
        AnonymousClass0II r2 = (AnonymousClass0II) r7;
        AnonymousClass0PV A04 = r7.A01.A04(r2.A02);
        if (A04 == null) {
            AnonymousClass0XJ.A0I("TextPath path reference '%s' not found", r2.A02);
            return false;
        }
        C03140Hj r4 = (C03140Hj) A04;
        Path path = new C08720eB(r4.A00, this.A03).A02;
        Matrix matrix = r4.A00;
        if (matrix != null) {
            path.transform(matrix);
        }
        RectF A0K = AnonymousClass000.A0K();
        path.computeBounds(A0K, true);
        this.A02.union(A0K);
        return false;
    }
}
