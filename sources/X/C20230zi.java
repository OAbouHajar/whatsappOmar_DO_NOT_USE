package X;

import android.content.Context;
import android.content.Intent;
import com.obwhatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import com.obwhatsapp.wabloks.ui.WaFcsPreloadedBloksActivity;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0zi  reason: invalid class name and case insensitive filesystem */
public final class C20230zi implements C20240zj {
    public C25401Jq A00;
    public final C16980tz A01;
    public final C20170zc A02;
    public final AnonymousClass5wM A03;

    public C20230zi(C16980tz r2, C20170zc r3, AnonymousClass5wM r4) {
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r4, 2);
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final C25401Jq A00() {
        C25401Jq r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18450wi.A0O("dataModuleNamespaceData");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void A5f() {
        Context context = this.A01.A00;
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.wabloks.ui.WaFcsModalActivity");
        intent.setFlags(872415232);
        context.startActivity(intent);
    }

    public AnonymousClass01A ADp(String str, String str2, Map map, Map map2, int i2) {
        String str3;
        Object obj = map.get("app_id");
        if (!(obj instanceof String) || (str3 = (String) obj) == null) {
            throw new IllegalArgumentException("FcsScreenOpenerBloksDelegate: app_id is not present");
        }
        String obj2 = new JSONObject(map2).toString();
        return BkFcsPreloadingScreenFragment.A01(this.A02.A02, str3, (String) A00().first, (String) A00().second, obj2, AnonymousClass5wM.A00(Integer.valueOf(i2)), str2);
    }

    public void AZt(String str, String str2, String str3, String str4, String str5, Map map, Map map2, int i2) {
        String str6;
        Object obj = map.get("app_id");
        if (!(obj instanceof String) || (str6 = (String) obj) == null) {
            throw new IllegalArgumentException("FcsScreenOpenerBloksDelegate: app_id is not present");
        }
        Context context = this.A01.A00;
        String obj2 = new JSONObject(map2).toString();
        String str7 = str5;
        Intent A022 = WaFcsPreloadedBloksActivity.A02(context, this.A02.A02, str6, (String) A00().first, (String) A00().second, obj2, str7, str, str2, str3, str4, AnonymousClass5wM.A00(Integer.valueOf(i2)));
        A022.setFlags(268435456);
        context.startActivity(A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (r0 == null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Aa0(X.AnonymousClass41K r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.Map r21, java.util.Map r22, int r23) {
        /*
            r14 = this;
            java.lang.String r0 = "app_id"
            r1 = r21
            java.lang.Object r6 = r1.get(r0)
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L_0x0056
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0056
            X.0tz r0 = r14.A01
            android.content.Context r4 = r0.A00
            X.41K r2 = X.AnonymousClass41K.BOTTOMSHEET
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            org.json.JSONObject r0 = new org.json.JSONObject
            r3 = r22
            r0.<init>(r3)
            r9 = r16
            r10 = r17
            r11 = r18
            r13 = r19
            r8 = r20
            if (r15 != r2) goto L_0x003f
            java.lang.String r5 = r0.toString()
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r13
            android.content.Intent r0 = com.obwhatsapp.wabloks.ui.WaFcsBottomsheetModalActivity.A02(r4, r5, r6, r7, r8, r9, r10)
        L_0x0038:
            r0.setFlags(r1)
        L_0x003b:
            r4.startActivity(r0)
            return
        L_0x003f:
            java.lang.String r7 = r0.toString()
            X.0zc r0 = r14.A02
            X.1lD r5 = r0.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            java.lang.String r12 = X.AnonymousClass5wM.A00(r0)
            android.content.Intent r0 = com.obwhatsapp.wabloks.ui.WaFcsModalActivity.A02(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r0 != 0) goto L_0x0038
            goto L_0x003b
        L_0x0056:
            java.lang.String r1 = "FcsScreenOpenerBloksDelegate: app_id is not present"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20230zi.Aa0(X.41K, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Map, int):void");
    }
}
