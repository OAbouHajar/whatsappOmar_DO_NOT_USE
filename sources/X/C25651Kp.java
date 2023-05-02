package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.1Kp  reason: invalid class name and case insensitive filesystem */
public class C25651Kp {
    public C19980zJ A00;
    public C16300so A01;
    public C14870pt A02;
    public AnonymousClass01V A03;
    public C17220uj A04;

    public C25651Kp(C19980zJ r1, C16300so r2, C14870pt r3, AnonymousClass01V r4, C17220uj r5) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
    }

    public final void A00(Context context, TextEmojiLabel textEmojiLabel, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            C16300so r3 = this.A01;
            StringBuilder sb = new StringBuilder("groupname=");
            sb.append(str2);
            sb.append(", articleName=");
            sb.append(str3);
            r3.AcB("BusinessDirectoryFaqLinkHelper/addDirectoryGeneralFaqLink/group name or article name are null or empty", sb.toString(), true);
            return;
        }
        Context context2 = context;
        C45922Bq.A08(context2, this.A04.A05(str2, str3), this.A00, this.A02, textEmojiLabel, this.A03, str);
    }
}
