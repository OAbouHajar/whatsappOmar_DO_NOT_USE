package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.0yw  reason: invalid class name and case insensitive filesystem */
public class C19750yw {
    public final AnonymousClass1H6 A00;
    public final AnonymousClass1H5 A01;
    public final C18260wP A02;
    public final C16980tz A03;
    public final C15860rz A04;
    public final AnonymousClass1Bc A05;
    public final C16320sq A06;

    public C19750yw(AnonymousClass1H6 r1, AnonymousClass1H5 r2, C18260wP r3, C16980tz r4, C15860rz r5, AnonymousClass1Bc r6, C16320sq r7) {
        this.A03 = r4;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String A00() {
        return AnonymousClass2JS.A00(((SharedPreferences) this.A04.A01.get()).getString("support_ban_appeal_state", (String) null));
    }

    public final void A01(AnonymousClass2JT r3, AnonymousClass2JU r4) {
        Integer num;
        AnonymousClass14R r1 = r3.A03;
        int i2 = 2;
        if (r1 != null) {
            num = (Integer) r1.A00((Object) null);
            if (num == null) {
                i2 = -1;
            }
            r4.AQv(num);
        }
        num = Integer.valueOf(i2);
        r4.AQv(num);
    }

    public final void A02(AnonymousClass2JV r5) {
        String str = r5.A00;
        C15860rz r3 = this.A04;
        r3.A0K().putString("support_ban_appeal_state", str).apply();
        if ("UNBANNED".equals(str)) {
            String str2 = r5.A01;
            StringBuilder sb = new StringBuilder("BanAppealRepository/storeUnbanReason ");
            sb.append(str2);
            Log.i(sb.toString());
            r3.A0K().putString("support_ban_appeal_unban_reason", str2).apply();
            String str3 = r5.A02;
            StringBuilder sb2 = new StringBuilder("BanAppealRepository/storeUnbanReasonUrl ");
            sb2.append(str3);
            Log.i(sb2.toString());
            r3.A0K().putString("support_ban_appeal_unban_reason_url", str3).apply();
        }
    }
}
