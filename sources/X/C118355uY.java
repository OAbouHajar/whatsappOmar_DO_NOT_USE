package X;

import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.io.File;

/* renamed from: X.5uY  reason: invalid class name and case insensitive filesystem */
public class C118355uY {
    public C38411qk A00;
    public final AnonymousClass01D A01;
    public final AnonymousClass01D A02;
    public final AnonymousClass01D A03;
    public final AnonymousClass01D A04;

    public C118355uY(AnonymousClass01D r1, AnonymousClass01D r2, AnonymousClass01D r3, AnonymousClass01D r4) {
        this.A03 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r4;
    }

    public void A00(ImageView imageView, C88024Zp r16, String str, String str2) {
        String str3 = str;
        ImageView imageView2 = imageView;
        if (str3.startsWith("file:///")) {
            imageView.setImageBitmap(BitmapFactory.decodeFile(str3.replaceAll("file:///", "")));
            return;
        }
        AnonymousClass62Z r6 = null;
        C88024Zp r0 = r16;
        if (r16 != null) {
            r6 = new AnonymousClass62Z(r0, this);
        }
        C38411qk r02 = this.A00;
        if (r02 == null) {
            C38461qp r8 = new C38461qp((C14870pt) this.A01.get(), (C17130ua) this.A02.get(), (C19950zG) this.A04.get(), new File(((C16980tz) this.A03.get()).A00.getCacheDir(), "wabloks_images"), "bk-image");
            r8.A05 = true;
            r8.A01 = 16777216;
            r8.A00 = Integer.MAX_VALUE;
            r02 = r8.A00();
            this.A00 = r02;
        }
        int i2 = r02.A01;
        r02.A02.A01(new C100204vG((Drawable) null, (Drawable) null, imageView2, r6, str3, str2, i2, i2), r02.A03);
    }
}
