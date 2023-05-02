package X;

import android.text.TextUtils;
import com.obwhatsapp.R;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.51p  reason: invalid class name and case insensitive filesystem */
public class C1034951p implements AnonymousClass5S7 {
    public final /* synthetic */ C55472jf A00;

    public C1034951p(C55472jf r1) {
        this.A00 = r1;
    }

    public void AR6(Map map) {
    }

    public void AR7(C93644jX r11) {
        String str = r11.A04;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(r11.A02) || !TextUtils.isEmpty(r11.A03)) {
            C55472jf r1 = this.A00;
            r1.A09.A0R((C16740tZ) null, r11.A00, str, r11.A02, r1.A02.getString(R.string.str1b92), Collections.singletonList(r1.A0T), r11.A00());
        }
    }
}
