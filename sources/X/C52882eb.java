package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import java.util.Locale;

/* renamed from: X.2eb  reason: invalid class name and case insensitive filesystem */
public class C52882eb implements C52852eY {
    public final C16300so A00;
    public final C17090uW A01;
    public final C14710pd A02;
    public final C25321Ji A03;

    public C52882eb(C16300so r1, C17090uW r2, C14710pd r3, C25321Ji r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public void AaR(Context context, C16740tZ r10, C16880tn r11, int i2) {
        C16300so r1;
        String str;
        String str2;
        C35131lQ r0 = r11.A05;
        if (r0 == null || (str2 = r0.A02) == null) {
            r1 = this.A00;
            str = "missing content/shopId";
        } else {
            String A06 = this.A02.A06(C16620tM.A02, 1054);
            if (TextUtils.isEmpty(A06)) {
                r1 = this.A00;
                str = "missing url format";
            } else {
                this.A01.Act(context, Uri.parse(String.format(Locale.US, A06, new Object[]{str2})));
                this.A03.A00((Jid) null, (Integer) null, (String) null, 5, 6, 33, false);
                return;
            }
        }
        r1.AcB("OpenShopAction/perform", str, false);
    }
}
