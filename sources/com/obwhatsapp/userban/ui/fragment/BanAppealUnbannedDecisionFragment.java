package com.obwhatsapp.userban.ui.fragment;

import X.AnonymousClass01V;
import X.C13680ns;
import X.C17110uY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanAppealUnbannedDecisionFragment extends Hilt_BanAppealUnbannedDecisionFragment {
    public AnonymousClass01V A00;
    public BanAppealViewModel A01;
    public C17110uY A02;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout008c);
    }

    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v10, types: [android.util.Pair, java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A18(android.os.Bundle r12, android.view.View r13) {
        /*
            r11 = this;
            com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel r0 = X.C13680ns.A0W(r11)
            r11.A01 = r0
            X.00l r0 = r11.A0D()
            r6 = 0
            com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel.A01(r0, r6)
            r0 = 2131362160(0x7f0a0170, float:1.8344093E38)
            android.widget.ImageView r2 = X.C13680ns.A0J(r13, r0)
            android.content.res.Resources r1 = r11.A03()
            r0 = 2131232012(0x7f08050c, float:1.8080121E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.setImageDrawable(r0)
            r0 = 2131364022(0x7f0a08b6, float:1.834787E38)
            android.widget.TextView r1 = X.C13680ns.A0L(r13, r0)
            r0 = 2131892333(0x7f12186d, float:1.9419411E38)
            r1.setText(r0)
            r0 = 2131366486(0x7f0a1256, float:1.8352867E38)
            com.obwhatsapp.TextEmojiLabel r5 = X.C13680ns.A0Q(r13, r0)
            r0 = 2131366487(0x7f0a1257, float:1.8352869E38)
            android.widget.TextView r4 = X.C13680ns.A0L(r13, r0)
            com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel r2 = r11.A01
            X.0yw r0 = r2.A09
            X.0rz r0 = r0.A04
            X.01D r8 = r0.A01
            android.content.SharedPreferences r1 = X.C13680ns.A0C(r8)
            java.lang.String r0 = "support_ban_appeal_unban_reason"
            java.lang.String r1 = X.C13700nu.A0E(r1, r0)
            java.lang.String r0 = "BanAppealRepository/getUnbanReason "
            java.lang.String r0 = X.C13680ns.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r3 = "OOPS"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x007b
            r7 = r3
        L_0x0063:
            android.content.SharedPreferences r8 = X.C13680ns.A0C(r8)
            java.lang.String r0 = "support_ban_appeal_unban_reason_url"
            r1 = 0
            java.lang.String r8 = r8.getString(r0, r1)
            java.lang.String r0 = "BanAppealRepository/getUnbanReasonUrl "
            java.lang.String r0 = X.C13680ns.A0h(r0, r8)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r8 == 0) goto L_0x0092
            goto L_0x007e
        L_0x007b:
            java.lang.String r7 = "OTHER"
            goto L_0x0063
        L_0x007e:
            X.1Aj r0 = r2.A04     // Catch:{ Exception -> 0x0089 }
            android.net.Uri r0 = r0.A00(r8)     // Catch:{ Exception -> 0x0089 }
            android.util.Pair r1 = X.C13690nt.A0I(r7, r0)     // Catch:{ Exception -> 0x0089 }
            goto L_0x00a4
        L_0x0089:
            java.lang.String r0 = "BanAppealViewModel/getUnbanReasonData Exception when creating uri from unban reason url: "
            java.lang.String r0 = X.C13680ns.A0h(r0, r8)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0092:
            boolean r0 = r3.equals(r7)
            X.0uj r2 = r2.A08
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = "android"
            android.net.Uri r0 = r2.A02(r1, r0, r1, r1)
        L_0x00a0:
            android.util.Pair r1 = X.C13690nt.A0I(r7, r0)
        L_0x00a4:
            java.lang.Object r0 = r1.first
            java.lang.Object r10 = r1.second
            boolean r0 = r3.equals(r0)
            r8 = 8
            if (r0 == 0) goto L_0x00df
            r0 = 2131892334(0x7f12186e, float:1.9419413E38)
            r5.setText(r0)
            r4.setVisibility(r6)
            r0 = 2131892336(0x7f121870, float:1.9419417E38)
            r4.setText(r0)
        L_0x00bf:
            r0 = 2131361895(0x7f0a0067, float:1.8343555E38)
            android.view.View r0 = X.C004601z.A0E(r13, r0)
            r0.setVisibility(r8)
            r0 = 2131361896(0x7f0a0068, float:1.8343557E38)
            android.widget.TextView r1 = X.C13680ns.A0L(r13, r0)
            r1.setVisibility(r6)
            r0 = 2131892337(0x7f121871, float:1.941942E38)
            r1.setText(r0)
            r0 = 45
            X.C13680ns.A19(r1, r11, r0)
            return
        L_0x00df:
            X.0uY r9 = r11.A02
            r0 = 2131892335(0x7f12186f, float:1.9419415E38)
            java.lang.String r7 = r11.A0J(r0)
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r0 = "using-whatsapp-responsibly-link"
            r3[r6] = r0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r0 = r10.toString()
            r2[r6] = r0
            java.lang.Runnable[] r1 = new java.lang.Runnable[r1]
            com.facebook.redex.RunnableRunnableShape1S0000000_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0000000_I1
            r0.<init>()
            r1[r6] = r0
            android.text.SpannableString r1 = r9.A05(r7, r1, r3, r2)
            X.01V r0 = r11.A00
            X.C30531cW.A04(r5, r0, r1)
            r4.setVisibility(r8)
            goto L_0x00bf
        L_0x010e:
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "how-to-use-whatsapp-responsibly"
            android.net.Uri r0 = r2.A05(r1, r0)
            goto L_0x00a0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.userban.ui.fragment.BanAppealUnbannedDecisionFragment.A18(android.os.Bundle, android.view.View):void");
    }
}
