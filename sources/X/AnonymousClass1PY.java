package X;

import android.content.Context;
import com.obwhatsapp.R;
import java.io.File;

/* renamed from: X.1PY  reason: invalid class name */
public final class AnonymousClass1PY {
    public final C38411qk A00;

    public AnonymousClass1PY(C14870pt r11, C17130ua r12, C16980tz r13, C19950zG r14) {
        C18450wi.A0H(r11, 1);
        C18450wi.A0H(r13, 2);
        C18450wi.A0H(r12, 3);
        C18450wi.A0H(r14, 4);
        Context context = r13.A00;
        C38461qp r4 = new C38461qp(r11, r12, r14, new File(context.getCacheDir(), "biz_api_cache"), "biz_api_image");
        r4.A00 = context.getResources().getDimensionPixelSize(R.dimen.dimen009b);
        r4.A01 = 16777216;
        r4.A05 = true;
        this.A00 = r4.A00();
    }
}
