package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Locale;

/* renamed from: X.0Rn  reason: invalid class name and case insensitive filesystem */
public class C05460Rn {
    public C61803Aj A00;
    public C614939d A01;
    public final C13340ls A02;
    public final AnonymousClass5NU A03;

    public C05460Rn(C13340ls r3, C61803Aj r4) {
        C08900ea r1 = new C08900ea(this);
        this.A03 = r1;
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = new C614939d(r4, r1);
    }

    public int A00() {
        return this.A00.A02();
    }

    public int A01() {
        return this.A00.A04();
    }

    public void A02(Rect rect) {
        C61803Aj A06 = this.A00.A06(rect);
        if (A06 != this.A00) {
            this.A00 = A06;
            this.A01 = new C614939d(A06, this.A03);
        }
    }

    public boolean A03(Bitmap bitmap, int i2) {
        try {
            this.A01.A00(i2, bitmap);
            return true;
        } catch (IllegalStateException e2) {
            Class<C05460Rn> cls = C05460Rn.class;
            Object[] objArr = {Integer.valueOf(i2)};
            C13370lv r2 = AnonymousClass0X1.A00;
            if (r2.AJ7(6)) {
                r2.A8K(cls.getSimpleName(), String.format((Locale) null, "Rendering of frame unsuccessful. Frame number: %d", objArr), e2);
            }
            return false;
        }
    }
}
