package org.npci.commonlibrary;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass69I;
import X.C110385e1;
import X.C110495eG;
import X.C118985vj;
import X.C13680ns;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.HashMap;

public class PinFragment extends Hilt_PinFragment implements AnonymousClass69I {
    public int A00 = 0;
    public Boolean A01 = null;
    public C118985vj A02;
    public boolean A03 = false;
    public final HashMap A04 = AnonymousClass000.A0x();

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout041e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r0.booleanValue() != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012c, code lost:
        r1 = A19(r0, r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0130, code lost:
        if (r17 != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0132, code lost:
        r1.A9B();
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0137, code lost:
        r1.A07 = r4;
        r2.A0B.add(r1);
        r18.addView(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015d, code lost:
        r0 = A0J(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0170, code lost:
        if (r0 == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0172, code lost:
        r0 = A0J(com.obwhatsapp.R.string.str1d39);
        r2.A00 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A18(android.os.Bundle r21, android.view.View r22) {
        /*
            r20 = this;
            r2 = r20
            r0 = r21
            r1 = r22
            super.A18(r0, r1)
            r2.A1B()
            r0 = 2131364435(0x7f0a0a53, float:1.8348707E38)
            android.view.ViewGroup r18 = X.C13690nt.A0K(r1, r0)
            org.json.JSONArray r0 = r2.A07
            if (r0 == 0) goto L_0x0182
            r3 = 0
            r17 = 0
        L_0x001a:
            org.json.JSONArray r0 = r2.A07
            int r0 = r0.length()
            if (r3 >= r0) goto L_0x0182
            org.json.JSONArray r0 = r2.A07     // Catch:{ JSONException -> 0x017c }
            org.json.JSONObject r4 = r0.getJSONObject(r3)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r15 = "subtype"
            java.lang.String r11 = r4.getString(r15)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r1 = "dLength"
            int r0 = r4.optInt(r1)
            if (r0 != 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            int r5 = r4.optInt(r1)
            goto L_0x003d
        L_0x003c:
            r5 = 6
        L_0x003d:
            java.lang.String r13 = "MPIN"
            boolean r16 = r11.equals(r13)
            java.lang.String r10 = "EMAIL"
            java.lang.String r9 = "TOTP"
            java.lang.String r8 = "HOTP"
            java.lang.String r7 = "SMS"
            java.lang.String r6 = "OTP"
            java.lang.String r1 = "ATMPIN"
            java.lang.String r12 = "NMPIN"
            if (r16 != 0) goto L_0x007d
            boolean r0 = r11.equals(r12)
            if (r0 != 0) goto L_0x007d
            boolean r0 = r1.equals(r11)
            if (r0 != 0) goto L_0x007d
            boolean r0 = r6.equals(r11)
            if (r0 != 0) goto L_0x007d
            boolean r0 = r7.equals(r11)
            if (r0 != 0) goto L_0x007d
            boolean r0 = r10.equals(r11)
            if (r0 != 0) goto L_0x007d
            boolean r0 = r8.equals(r11)
            if (r0 != 0) goto L_0x007d
            boolean r0 = r9.equals(r11)
            if (r0 == 0) goto L_0x00ce
        L_0x007d:
            boolean r0 = r11.equals(r12)
            if (r0 != 0) goto L_0x008f
            if (r16 == 0) goto L_0x0123
            java.lang.Boolean r0 = r2.A01
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0123
        L_0x008f:
            r0 = 2131893562(0x7f121d3a, float:1.9421904E38)
            java.lang.String r0 = r2.A0J(r0)
            X.5eG r1 = r2.A19(r0, r3, r5)
            r0 = 2131893552(0x7f121d30, float:1.9421884E38)
            java.lang.String r0 = r2.A0J(r0)
            X.5eG r0 = r2.A19(r0, r3, r5)
            if (r17 != 0) goto L_0x00ac
            r1.A9B()
            r17 = 1
        L_0x00ac:
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            r5.add(r1)
            r5.add(r0)
            X.00l r0 = r2.A0C()
            X.5e1 r1 = new X.5e1
            r1.<init>(r0)
            r1.A00(r5, r2)
            r1.A02 = r4
            java.util.ArrayList r0 = r2.A0B
            r0.add(r1)
            r0 = r18
            r0.addView(r1)
        L_0x00ce:
            int r3 = r3 + 1
            goto L_0x001a
        L_0x00d2:
            org.json.JSONArray r0 = r2.A07
            if (r0 == 0) goto L_0x011f
            java.util.ArrayList r12 = X.AnonymousClass000.A0u()
            r14 = 0
        L_0x00db:
            org.json.JSONArray r0 = r2.A07
            int r0 = r0.length()
            if (r14 >= r0) goto L_0x00f5
            org.json.JSONArray r0 = r2.A07     // Catch:{ JSONException -> 0x017c }
            org.json.JSONObject r0 = r0.getJSONObject(r14)     // Catch:{ JSONException -> 0x017c }
            java.lang.String r0 = r0.getString(r15)     // Catch:{ JSONException -> 0x017c }
            if (r0 == 0) goto L_0x00f2
            r12.add(r0)     // Catch:{ JSONException -> 0x017c }
        L_0x00f2:
            int r14 = r14 + 1
            goto L_0x00db
        L_0x00f5:
            boolean r0 = r12.contains(r6)
            if (r0 != 0) goto L_0x0119
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L_0x0119
            boolean r0 = r12.contains(r10)
            if (r0 != 0) goto L_0x0119
            boolean r0 = r12.contains(r8)
            if (r0 != 0) goto L_0x0119
            boolean r0 = r12.contains(r9)
            if (r0 == 0) goto L_0x011f
            boolean r0 = r12.contains(r13)
            if (r0 == 0) goto L_0x011f
        L_0x0119:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A01 = r0
            goto L_0x008f
        L_0x011f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.A01 = r0
        L_0x0123:
            int r0 = r11.hashCode()
            switch(r0) {
                case 78603: goto L_0x016c;
                case 82233: goto L_0x0167;
                case 2223555: goto L_0x0162;
                case 2373128: goto L_0x0158;
                case 2581047: goto L_0x0153;
                case 66081660: goto L_0x014e;
                case 1940843707: goto L_0x0144;
                default: goto L_0x012a;
            }
        L_0x012a:
            java.lang.String r0 = ""
        L_0x012c:
            X.5eG r1 = r2.A19(r0, r3, r5)
            if (r17 != 0) goto L_0x0137
            r1.A9B()
            r17 = 1
        L_0x0137:
            r1.A07 = r4
            java.util.ArrayList r0 = r2.A0B
            r0.add(r1)
            r0 = r18
            r0.addView(r1)
            goto L_0x00ce
        L_0x0144:
            boolean r0 = r11.equals(r1)
            if (r0 == 0) goto L_0x012a
            r0 = 2131893549(0x7f121d2d, float:1.9421878E38)
            goto L_0x015d
        L_0x014e:
            boolean r0 = r11.equals(r10)
            goto L_0x0170
        L_0x0153:
            boolean r0 = r11.equals(r9)
            goto L_0x0170
        L_0x0158:
            if (r16 == 0) goto L_0x012a
            r0 = 2131893559(0x7f121d37, float:1.9421898E38)
        L_0x015d:
            java.lang.String r0 = r2.A0J(r0)
            goto L_0x012c
        L_0x0162:
            boolean r0 = r11.equals(r8)
            goto L_0x0170
        L_0x0167:
            boolean r0 = r11.equals(r7)
            goto L_0x0170
        L_0x016c:
            boolean r0 = r11.equals(r6)
        L_0x0170:
            if (r0 == 0) goto L_0x012a
            r0 = 2131893561(0x7f121d39, float:1.9421902E38)
            java.lang.String r0 = r2.A0J(r0)
            r2.A00 = r3
            goto L_0x012c
        L_0x017c:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C110115dX.A0Z(r0)
            throw r0
        L_0x0182:
            int r3 = r2.A00
            r0 = -1
            if (r3 == r0) goto L_0x019b
            java.util.ArrayList r1 = r2.A0B
            java.lang.Object r0 = r1.get(r3)
            boolean r0 = r0 instanceof X.C110495eG
            if (r0 == 0) goto L_0x019b
            X.5eG r1 = X.C110115dX.A0l(r1, r3)
            r2.A1D(r1)
            r0 = 1
            r1.A0C = r0
        L_0x019b:
            r4 = 0
            java.util.ArrayList r3 = r2.A0B
            int r1 = r3.size()
        L_0x01a2:
            if (r4 >= r1) goto L_0x01ea
            int r0 = r2.A00
            if (r4 == r0) goto L_0x01e7
            java.lang.Object r13 = r3.get(r4)
            X.69X r13 = (X.AnonymousClass69X) r13
            X.00l r5 = r2.A0C()
            r0 = 2131231979(0x7f0804eb, float:1.8080054E38)
            android.graphics.drawable.Drawable r7 = X.AnonymousClass00T.A04(r5, r0)
            X.00l r5 = r2.A0C()
            r0 = 2131231978(0x7f0804ea, float:1.8080052E38)
            android.graphics.drawable.Drawable r6 = X.AnonymousClass00T.A04(r5, r0)
            r0 = 2131893546(0x7f121d2a, float:1.9421872E38)
            java.lang.String r10 = r2.A0J(r0)
            r0 = 2131893548(0x7f121d2c, float:1.9421876E38)
            java.lang.String r11 = r2.A0J(r0)
            r12 = 1
            com.facebook.redex.IDxCListenerShape0S2400000_3_I1 r5 = new com.facebook.redex.IDxCListenerShape0S2400000_3_I1
            r8 = r2
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r17 = 0
            r18 = 1
            r19 = 1
            r14 = r7
            r15 = r5
            r16 = r11
            r13.Agw(r14, r15, r16, r17, r18, r19)
        L_0x01e7:
            int r4 = r4 + 1
            goto L_0x01a2
        L_0x01ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.npci.commonlibrary.PinFragment.A18(android.os.Bundle, android.view.View):void");
    }

    public void ARZ(int i2) {
        if (!(this.A0B.get(i2) instanceof C110385e1)) {
            this.A00 = i2;
        }
    }

    public void ARa(int i2, String str) {
        int i3 = this.A00;
        if (i3 != -1 && i3 == i2) {
            ArrayList arrayList = this.A0B;
            if (arrayList.get(i3) instanceof C110495eG) {
                C110495eG A002 = C110495eG.A00(arrayList, this);
                Drawable A042 = AnonymousClass00T.A04(A0C(), R.drawable.ic_tick_ok);
                if (A042 != null) {
                    A002.A03.setImageDrawable(A042);
                }
                A002.A01(A002.A03, true);
            }
        }
    }
}
