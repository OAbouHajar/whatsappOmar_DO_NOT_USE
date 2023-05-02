package X;

import android.content.Context;
import com.obwhatsapp.R;
import java.io.File;

/* renamed from: X.1PZ  reason: invalid class name */
public class AnonymousClass1PZ {
    public final C38411qk A00;

    public AnonymousClass1PZ(C14870pt r10, C17130ua r11, C16980tz r12, C19950zG r13) {
        Context context = r12.A00;
        C38461qp r3 = new C38461qp(r10, r11, r13, new File(context.getCacheDir(), "api_biz_search_cache"), "api-biz-search-image");
        r3.A00 = context.getResources().getDimensionPixelSize(R.dimen.dimen009b);
        r3.A01 = 16777216;
        r3.A05 = true;
        this.A00 = r3.A00();
    }
}
