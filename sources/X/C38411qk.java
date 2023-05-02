package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.io.File;

/* renamed from: X.1qk  reason: invalid class name and case insensitive filesystem */
public class C38411qk {
    public Drawable A00;
    public final int A01;
    public final C38451qo A02;
    public final boolean A03;

    public C38411qk(C14870pt r10, C19950zG r11, C38461qp r12, int i2) {
        C38451qo r0 = r12.A04;
        if (r0 == null) {
            C17130ua r2 = r12.A07;
            Drawable drawable = r12.A03;
            File file = r12.A09;
            long j2 = r12.A01;
            String str = r12.A0A;
            r0 = new C59462yK(r10, r2, new C38421ql(drawable, (Drawable) null), r11, file, str, j2);
        }
        this.A02 = r0;
        this.A03 = r12.A05;
        this.A01 = i2;
        this.A00 = r12.A02;
    }

    public void A00(Drawable drawable, Drawable drawable2, ImageView imageView, C109485Sh r15, String str) {
        int i2 = this.A01;
        String str2 = str;
        this.A02.A01(new C100204vG(drawable, drawable2, imageView, r15, str2, str2, i2, i2), this.A03);
    }

    public void A01(ImageView imageView, String str) {
        A00((Drawable) null, (Drawable) null, imageView, (C109485Sh) null, str);
    }
}
