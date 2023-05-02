package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.obwhatsapp.R;
import java.io.File;

/* renamed from: X.1Kq  reason: invalid class name and case insensitive filesystem */
public class C25661Kq {
    public final C14710pd A00;
    public final C38411qk A01;

    public C25661Kq(C14870pt r10, C17130ua r11, C16980tz r12, C14710pd r13, C19950zG r14) {
        this.A00 = r13;
        Context context = r12.A00;
        C38461qp r3 = new C38461qp(r10, r11, r14, new File(context.getCacheDir(), "biz_directory_cache"), "directory-image");
        r3.A00 = context.getResources().getDimensionPixelSize(R.dimen.dimen009b);
        r3.A01 = 16777216;
        r3.A05 = true;
        this.A01 = r3.A00();
        if (this.A00.A0E(C16620tM.A02, 2185)) {
            this.A01.A02.A03.A01 = true;
        }
    }

    public void A00(ImageView imageView, String str) {
        Drawable A02 = AnonymousClass2SR.A02(imageView.getContext(), R.drawable.ic_business_category, R.color.color04d2);
        this.A01.A00((Drawable) null, A02, imageView, (C109485Sh) null, str);
    }
}
