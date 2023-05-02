package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.3Ec  reason: invalid class name and case insensitive filesystem */
public class C62573Ec implements AnonymousClass5SS {
    public View A00;
    public final AnonymousClass1VI A01;
    public final C15900s5 A02;
    public final C53832gN A03;

    public C62573Ec(AnonymousClass1VI r1, C15900s5 r2, C53832gN r3) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
    }

    public void AHm() {
        C13680ns.A13(this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009b, code lost:
        r1 = X.C13680ns.A0C(r3).getInt("biz_app_cross_sell_banner_cool_off_days", 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AfA() {
        /*
            r8 = this;
            X.2gN r3 = r8.A03
            X.0s5 r2 = r8.A02
            X.1VI r0 = r8.A01
            android.content.Context r1 = r0.getContext()
            X.0s8 r0 = X.C15910s6.A0z
            boolean r0 = r2.A05(r0)
            r5 = 0
            if (r0 == 0) goto L_0x00aa
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r0 = "com.obwhatsapp.w4b"
            android.content.Intent r0 = r1.getLaunchIntentForPackage(r0)
            if (r0 != 0) goto L_0x00aa
            X.0rz r4 = r3.A00
            java.lang.String r0 = "biz_app_cross_sell_banner_notif_time"
            long r2 = r4.A0J(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            int r2 = X.C42681yF.A00(r0, r2)
            X.01D r3 = r4.A01
            android.content.SharedPreferences r1 = X.C13680ns.A0C(r3)
            java.lang.String r0 = "biz_app_cross_sell_banner_expiry_days"
            int r0 = r1.getInt(r0, r5)
            if (r2 >= r0) goto L_0x00aa
            android.content.SharedPreferences r1 = X.C13680ns.A0C(r3)
            java.lang.String r0 = "biz_app_cross_sell_banner_dismiss_count"
            int r0 = r1.getInt(r0, r5)
            r2 = 1
            if (r0 >= r2) goto L_0x00aa
            android.content.SharedPreferences r1 = X.C13680ns.A0C(r3)
            java.lang.String r0 = "biz_app_cross_sell_banner_click_count"
            int r0 = r1.getInt(r0, r5)
            if (r0 >= r2) goto L_0x00aa
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            java.lang.String r2 = "biz_app_upsell_banner_timestamp"
            boolean r0 = r4.A1n(r2, r0)
            if (r0 == 0) goto L_0x008e
            android.content.SharedPreferences r0 = X.C13680ns.A0C(r3)
            java.lang.String r6 = "biz_app_cross_sell_banner_consecutive_days"
            int r1 = r0.getInt(r6, r5)
            r0 = 2
            if (r1 < r0) goto L_0x00ab
            X.C13680ns.A1S(r4, r6, r5)
        L_0x0074:
            android.content.SharedPreferences r0 = X.C13680ns.A0C(r3)
            java.lang.String r7 = "biz_app_cross_sell_banner_cool_off_days"
            int r0 = r0.getInt(r7, r5)
            int r1 = r0 + 1
        L_0x0080:
            android.content.SharedPreferences$Editor r0 = r4.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r7, r1)
        L_0x0088:
            r0.apply()
            r4.A0x(r2)
        L_0x008e:
            android.content.SharedPreferences r1 = X.C13680ns.A0C(r3)
            java.lang.String r0 = "biz_app_cross_sell_banner_total_days"
            int r1 = r1.getInt(r0, r5)
            r0 = 4
            if (r1 >= r0) goto L_0x00aa
            android.content.SharedPreferences r1 = X.C13680ns.A0C(r3)
            java.lang.String r0 = "biz_app_cross_sell_banner_cool_off_days"
            int r1 = r1.getInt(r0, r5)
            if (r1 <= 0) goto L_0x00e9
            r0 = 5
            if (r1 > r0) goto L_0x00e9
        L_0x00aa:
            return r5
        L_0x00ab:
            android.content.SharedPreferences r0 = X.C13680ns.A0C(r3)
            java.lang.String r7 = "biz_app_cross_sell_banner_cool_off_days"
            int r0 = r0.getInt(r7, r5)
            r1 = 5
            if (r0 < r1) goto L_0x00ba
            r1 = 0
            goto L_0x0080
        L_0x00ba:
            android.content.SharedPreferences r0 = X.C13680ns.A0C(r3)
            int r0 = r0.getInt(r7, r5)
            if (r0 <= 0) goto L_0x00c7
            if (r0 > r1) goto L_0x00c7
            goto L_0x0074
        L_0x00c7:
            android.content.SharedPreferences r0 = X.C13680ns.A0C(r3)
            java.lang.String r1 = "biz_app_cross_sell_banner_total_days"
            int r0 = r0.getInt(r1, r5)
            int r0 = r0 + 1
            X.C13680ns.A1S(r4, r1, r0)
            android.content.SharedPreferences r0 = X.C13680ns.A0C(r3)
            int r0 = r0.getInt(r6, r5)
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = r4.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r6, r1)
            goto L_0x0088
        L_0x00e9:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62573Ec.AfA():boolean");
    }

    public void AhG() {
        if (AfA() && this.A00 == null) {
            AnonymousClass1VI r2 = this.A01;
            View A0H = C13680ns.A0H(C13680ns.A0G(r2), r2, R.layout.layout01fb);
            this.A00 = A0H;
            r2.addView(A0H);
        }
        View view = this.A00;
        if (view == null) {
            AnonymousClass1VI r22 = this.A01;
            view = C13680ns.A0H(C13680ns.A0G(r22), r22, R.layout.layout01fb);
            this.A00 = view;
        }
        TextEmojiLabel A0Q = C13680ns.A0Q(view, R.id.smb_upsell_chat_banner_description);
        AnonymousClass1VI r4 = this.A01;
        A0Q.A0I((List) null, AnonymousClass1ZW.A00(r4.getContext(), new Object[0], R.string.str164c));
        r4.setBackgroundResource(R.color.color0141);
        C13680ns.A1A(r4, this, 26);
        C13680ns.A1A(C004601z.A0E(view, R.id.close), this, 27);
        view.setVisibility(0);
        this.A03.A00(1);
    }
}
