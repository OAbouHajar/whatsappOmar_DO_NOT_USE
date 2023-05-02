package com.obwhatsapp.wabloks.commerce.ui.viewmodel;

import X.AnonymousClass00B;
import X.AnonymousClass01D;
import X.AnonymousClass1JU;
import X.AnonymousClass2WZ;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C16460t6;
import X.C17030uP;
import X.C18260wP;
import X.C18450wi;
import X.C25321Ji;
import X.C30801cy;
import X.C56072ku;
import android.app.Activity;
import com.obwhatsapp.R;
import java.util.Map;
import java.util.Set;

public final class WaBkExtensionsLayoutViewModel extends C56072ku {
    public final C18260wP A00;
    public final C17030uP A01;
    public final C16460t6 A02;
    public final C14710pd A03;
    public final C25321Ji A04;
    public final C30801cy A05 = C30801cy.A01();
    public final C30801cy A06 = C30801cy.A01();
    public final C30801cy A07 = C30801cy.A01();
    public final C30801cy A08 = C30801cy.A01();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaBkExtensionsLayoutViewModel(C18260wP r2, C17030uP r3, C16460t6 r4, C14710pd r5, C25321Ji r6, AnonymousClass01D r7) {
        super(r7);
        C18450wi.A0L(r7, r5, r4, r3, r2);
        C18450wi.A0H(r6, 6);
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r6;
    }

    public static /* synthetic */ void A01(Activity activity, AnonymousClass1JU r5, WaBkExtensionsLayoutViewModel waBkExtensionsLayoutViewModel, String str, String str2, String str3, int i2, boolean z2) {
        int i3;
        Map map;
        Set keySet;
        String str4 = null;
        if ((i2 & 4) != 0) {
            r5 = null;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            str2 = null;
        }
        if ((i2 & 32) == 0) {
            str4 = str3;
        }
        if (str2 != null && str2.length() > 0) {
            waBkExtensionsLayoutViewModel.A06.A0B(str2);
        } else if (str == null) {
            if (!waBkExtensionsLayoutViewModel.A00.A0A()) {
                i3 = R.string.str08ab;
                str4 = "extensions-no-network-error";
            } else if (r5 == null || (map = r5.A00) == null || (keySet = map.keySet()) == null || !C13690nt.A1V(keySet, 2498058)) {
                i3 = R.string.str08ac;
            } else {
                i3 = R.string.str08ad;
                str4 = "extensions-timeout-error";
            }
            C13680ns.A1O(z2 ? waBkExtensionsLayoutViewModel.A07 : waBkExtensionsLayoutViewModel.A08, i3);
        } else {
            waBkExtensionsLayoutViewModel.A05.A0B(str);
            waBkExtensionsLayoutViewModel.A06(activity, "extensions-custom-business-error");
            return;
        }
        waBkExtensionsLayoutViewModel.A06(activity, str4);
    }

    public boolean A05(AnonymousClass2WZ r5) {
        int i2 = r5.A00;
        if (i2 == 3 || i2 == 4 || i2 == 6 || i2 == 7) {
            C30801cy r2 = this.A07;
            boolean A0A = this.A00.A0A();
            int i3 = R.string.str08ab;
            if (A0A) {
                i3 = R.string.str08ac;
            }
            C13680ns.A1O(r2, i3);
            return false;
        }
        AnonymousClass00B.A08("BkLayoutViewModel: invalid error status");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = r0.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(android.app.Activity r19, java.lang.String r20) {
        /*
            r18 = this;
            r12 = 0
            android.content.Intent r0 = r19.getIntent()
            if (r0 == 0) goto L_0x00e8
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x00e8
            java.lang.String r0 = "action_name"
            java.lang.String r8 = r1.getString(r0)
        L_0x0013:
            java.lang.String r2 = "flow_id"
            android.content.Intent r0 = r19.getIntent()
            if (r0 == 0) goto L_0x00e5
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x00e5
            java.lang.String r9 = r0.getString(r2)
        L_0x0025:
            android.content.Intent r0 = r19.getIntent()
            if (r0 == 0) goto L_0x00e2
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x00e2
            java.lang.String r0 = "chat_id"
            java.lang.String r0 = r1.getString(r0)
        L_0x0037:
            com.whatsapp.jid.Jid r11 = com.whatsapp.jid.Jid.getNullable(r0)
            boolean r0 = r11 instanceof X.C15830rv
            if (r0 == 0) goto L_0x00df
            X.0rv r11 = (X.C15830rv) r11
        L_0x0041:
            android.content.Intent r0 = r19.getIntent()
            if (r0 == 0) goto L_0x00dc
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x00dc
            java.lang.String r0 = "message_id"
            java.lang.String r10 = r1.getString(r0)
        L_0x0053:
            java.lang.String r7 = "session_id"
            android.content.Intent r0 = r19.getIntent()
            if (r0 == 0) goto L_0x00da
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x00da
            java.lang.String r6 = r0.getString(r7)
        L_0x0066:
            org.json.JSONObject r5 = X.C13700nu.A0J()
            r4 = r18
            if (r10 == 0) goto L_0x00d8
            r0 = 0
            X.1Vw r1 = new X.1Vw
            r1.<init>(r11, r10, r0)
            X.0t6 r0 = r4.A02
            X.0tZ r3 = X.C16460t6.A00(r0, r1)
            java.lang.String r1 = X.AnonymousClass22T.A00(r10)
            java.lang.String r0 = "extensions_message_id"
            r5.put(r0, r1)
        L_0x0083:
            java.lang.String r0 = "cta"
            r5.put(r0, r8)
            r5.put(r2, r9)
            X.0pd r2 = r4.A03
            r1 = 2548(0x9f4, float:3.57E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = "error_type"
            r1 = r20
            r5.put(r0, r1)
        L_0x009e:
            r5.put(r7, r6)
            boolean r0 = r11 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x00d6
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            if (r11 == 0) goto L_0x00b7
            X.0uP r0 = r4.A01
            X.1Vq r0 = r0.A00(r11)
            int r0 = X.C18180wH.A00(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
        L_0x00b7:
            X.1Ji r10 = r4.A04
            java.lang.String r13 = r5.toString()
            if (r3 != 0) goto L_0x00c9
            r16 = 1
        L_0x00c1:
            r14 = 3
            r17 = 1
            r15 = 4
            r10.A00(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x00c9:
            byte r2 = r3.A10
            int r1 = r3.A08
            boolean r0 = X.C30921dB.A04(r3)
            int r16 = X.C42141xI.A00(r2, r1, r0)
            goto L_0x00c1
        L_0x00d6:
            r11 = r12
            goto L_0x00b7
        L_0x00d8:
            r3 = r12
            goto L_0x0083
        L_0x00da:
            r6 = r12
            goto L_0x0066
        L_0x00dc:
            r10 = r12
            goto L_0x0053
        L_0x00df:
            r11 = r12
            goto L_0x0041
        L_0x00e2:
            r0 = r12
            goto L_0x0037
        L_0x00e5:
            r9 = r12
            goto L_0x0025
        L_0x00e8:
            r8 = r12
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel.A06(android.app.Activity, java.lang.String):void");
    }
}
