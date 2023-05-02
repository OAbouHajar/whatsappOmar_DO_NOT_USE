package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.view.inputmethod.InputMethodManager;
import com.obwhatsapp.Conversation;
import java.util.Map;

/* renamed from: X.1R9  reason: invalid class name */
public abstract class AnonymousClass1R9 extends C27151Qq {
    public final C17030uP A00;
    public final AnonymousClass01V A01;
    public final C15860rz A02;
    public final AnonymousClass013 A03;
    public final C14710pd A04;
    public final C16490t9 A05;

    public AnonymousClass1R9(C20190ze r1, C17030uP r2, AnonymousClass01V r3, C15860rz r4, AnonymousClass013 r5, C14710pd r6, C16490t9 r7) {
        super(r1);
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r7;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0188, code lost:
        if (r8 == 1) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01a1, code lost:
        if (r2.A01 != 7) goto L_0x01a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0199  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C33211iD r13, X.C30161br r14) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.AnonymousClass1RA
            if (r0 == 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            com.whatsapp.jid.Jid r1 = r14.A0k
            X.0rv r0 = X.C16030sJ.A00(r1)
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 != 0) goto L_0x021c
            X.0rv r0 = X.C16030sJ.A00(r1)
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 != 0) goto L_0x021c
            X.0rv r0 = X.C16030sJ.A00(r1)
        L_0x0020:
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.of(r0)
            r11 = 1
            if (r4 == 0) goto L_0x0267
            X.0uP r0 = r12.A00
            X.1Vq r0 = r0.A00(r4)
            int r10 = X.C18180wH.A00(r0)
            X.220 r0 = r13.A0O
            if (r0 != 0) goto L_0x0037
            X.220 r0 = X.AnonymousClass220.A07
        L_0x0037:
            X.221 r0 = r0.A0d()
            r3 = 0
            X.1XE r0 = r0.A02
            java.lang.Object r0 = r0.get(r3)
            X.222 r0 = (X.AnonymousClass222) r0
            java.lang.String r0 = r0.A01
            java.util.Map r5 = X.C438921y.A01(r0)
            java.lang.String r7 = "flow_message_version"
            boolean r0 = r5.containsKey(r7)
            if (r0 == 0) goto L_0x0219
            java.lang.Object r0 = r5.get(r7)
            java.lang.String r6 = "1"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00a4
            java.lang.String r2 = "flow_id"
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L_0x0219
            java.lang.String r1 = "flow_version_id"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x0219
            java.lang.String r0 = "flow_data_endpoint"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0219
            java.lang.String r0 = "flow_token"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0219
            java.lang.String r0 = "flow_cta"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0219
            java.lang.Object r0 = r5.get(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "\\d+"
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L_0x0219
            java.lang.Object r0 = r5.get(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L_0x0219
        L_0x00a4:
            boolean r0 = r5.containsKey(r7)
            r2 = 0
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r1 = r5.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00ba
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00ba
            r2 = r1
        L_0x00ba:
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r1 = "flow_id"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x0219
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0219
            X.0pd r2 = r12.A04
            r1 = 1320(0x528, float:1.85E-42)
            X.0tM r0 = X.C16620tM.A02
            java.lang.String r0 = r2.A06(r0, r1)
            if (r0 != 0) goto L_0x01a5
            java.util.List r5 = java.util.Collections.emptyList()
        L_0x00e0:
            java.util.Iterator r2 = r5.iterator()
        L_0x00e4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0219
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r4.user
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00e4
        L_0x00f8:
            r0 = 1
        L_0x00f9:
            r11 = r11 ^ r0
            X.0pd r2 = r12.A04
            r1 = 2840(0xb18, float:3.98E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0267
            if (r11 != 0) goto L_0x0267
            boolean r0 = r12.A03(r2, r13)
            if (r0 != 0) goto L_0x0267
            X.1Vw r0 = r14.A0m
            java.lang.String r5 = r0.A01
            java.lang.String r6 = "galaxy_message"
            X.220 r7 = r13.A0O
            r9 = r7
            if (r7 != 0) goto L_0x011b
            X.220 r7 = X.AnonymousClass220.A07
        L_0x011b:
            int r1 = r7.A00
            r0 = 1
            r8 = r1 & 1
            if (r8 != r0) goto L_0x016b
            X.22R r0 = r7.A05
            r2 = r0
            if (r0 != 0) goto L_0x0129
            X.22R r0 = X.AnonymousClass22R.A06
        L_0x0129:
            int r0 = r0.A00
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x016b
            if (r2 != 0) goto L_0x0135
            X.22R r2 = X.AnonymousClass22R.A06
        L_0x0135:
            int r1 = r2.A01
            r0 = 3
            if (r1 != r0) goto L_0x016b
            r7 = 8
        L_0x013c:
            java.lang.String r4 = r4.user
            if (r9 != 0) goto L_0x0142
            X.220 r9 = X.AnonymousClass220.A07
        L_0x0142:
            X.221 r0 = r9.A0d()
            X.1XE r0 = r0.A02
            java.lang.Object r0 = r0.get(r3)
            X.222 r0 = (X.AnonymousClass222) r0
            java.lang.String r2 = r0.A01
            java.lang.String r1 = "flow_id"
            X.22S r3 = new X.22S
            r3.<init>()
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r3.A02 = r0
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            goto L_0x0224
        L_0x016b:
            r0 = 1
            if (r8 != r0) goto L_0x0188
            X.22R r0 = r7.A05
            r2 = r0
            if (r0 != 0) goto L_0x0175
            X.22R r0 = X.AnonymousClass22R.A06
        L_0x0175:
            int r0 = r0.A00
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x018a
            if (r2 != 0) goto L_0x0181
            X.22R r2 = X.AnonymousClass22R.A06
        L_0x0181:
            int r1 = r2.A01
            r0 = 4
            if (r1 != r0) goto L_0x018a
            r7 = 2
            goto L_0x013c
        L_0x0188:
            if (r8 != r0) goto L_0x01a3
        L_0x018a:
            X.22R r0 = r7.A05
            r2 = r0
            if (r0 != 0) goto L_0x0191
            X.22R r0 = X.AnonymousClass22R.A06
        L_0x0191:
            int r0 = r0.A00
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x01a3
            if (r2 != 0) goto L_0x019d
            X.22R r2 = X.AnonymousClass22R.A06
        L_0x019d:
            int r1 = r2.A01
            r0 = 7
            r7 = 3
            if (r1 == r0) goto L_0x013c
        L_0x01a3:
            r7 = 1
            goto L_0x013c
        L_0x01a5:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01fd }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x01fd }
            java.lang.String r0 = "galaxy_message"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x01fd }
            if (r1 != 0) goto L_0x01b8
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ JSONException -> 0x01fd }
            goto L_0x00e0
        L_0x01b8:
            java.lang.String r0 = "flows"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x01fd }
            if (r0 != 0) goto L_0x01c6
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ JSONException -> 0x01fd }
            goto L_0x00e0
        L_0x01c6:
            org.json.JSONObject r1 = r0.optJSONObject(r5)     // Catch:{ JSONException -> 0x01fd }
            if (r1 != 0) goto L_0x01d2
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ JSONException -> 0x01fd }
            goto L_0x00e0
        L_0x01d2:
            java.lang.String r0 = "supported_businesses"
            org.json.JSONArray r2 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x01fd }
            if (r2 == 0) goto L_0x01f7
            int r0 = r2.length()     // Catch:{ JSONException -> 0x01fd }
            if (r0 == 0) goto L_0x01f7
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ JSONException -> 0x01fd }
            r5.<init>()     // Catch:{ JSONException -> 0x01fd }
            r1 = 0
        L_0x01e7:
            int r0 = r2.length()     // Catch:{ JSONException -> 0x01fd }
            if (r1 >= r0) goto L_0x00e0
            java.lang.String r0 = r2.getString(r1)     // Catch:{ JSONException -> 0x01fd }
            r5.add(r0)     // Catch:{ JSONException -> 0x01fd }
            int r1 = r1 + 1
            goto L_0x01e7
        L_0x01f7:
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ JSONException -> 0x01fd }
            goto L_0x00e0
        L_0x01fd:
            r2 = move-exception
            java.lang.String r0 = "GalaxyFlowsAction/getSupportedBizIdsForFlow/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.util.List r5 = java.util.Collections.emptyList()
            goto L_0x00e0
        L_0x0219:
            r0 = 0
            goto L_0x00f9
        L_0x021c:
            com.whatsapp.jid.Jid r0 = r14.A08
            X.0rv r0 = X.C16030sJ.A00(r0)
            goto L_0x0020
        L_0x0224:
            java.lang.String r0 = "cta"
            r7.put(r0, r6)     // Catch:{ JSONException -> 0x023e }
            java.util.Map r0 = X.C438921y.A01(r2)     // Catch:{ JSONException -> 0x023e }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ JSONException -> 0x023e }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x023e }
            java.lang.String r1 = "extensions_message_id"
            java.lang.String r0 = X.AnonymousClass22T.A00(r5)     // Catch:{ JSONException -> 0x023e }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x023e }
            goto L_0x0254
        L_0x023e:
            r2 = move-exception
            java.lang.String r0 = "ExtensionsAction/sendMessageReceiveWamEvent/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0254:
            java.lang.String r0 = r7.toString()
            r3.A04 = r0
            r3.A03 = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r3.A00 = r0
            X.0t9 r0 = r12.A05
            r0.A04(r3)
        L_0x0267:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R9.A04(X.1iD, X.1br):boolean");
    }

    public void A05(Activity activity, C35071lK r5, String str, String str2, long j2) {
        super.A05(activity, r5, str, str2, j2);
        if (Build.VERSION.SDK_INT == 26) {
            new AnonymousClass22Q().A02(activity);
        }
        InputMethodManager A0Q = this.A01.A0Q();
        if (A0Q != null && activity.getCurrentFocus() != null) {
            A0Q.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
        }
    }

    public void A06(Activity activity, Intent intent, String str, Map map, long j2) {
        String A032 = C16030sJ.A03(((Conversation) ((AnonymousClass1yP) activity)).A00.A2l.A08(C15830rv.class));
        Object obj = map.get("flow_id");
        AnonymousClass00B.A06(obj);
        intent.putExtra("chat_id", A032);
        intent.putExtra("message_id", str);
        intent.putExtra("action_name", "galaxy_message");
        intent.putExtra("message_row_id", j2);
        intent.putExtra("user_locale", this.A03.A07());
        intent.putExtra("flow_id", (String) obj);
        intent.putExtra("flow_token", (String) map.get("flow_token"));
        intent.putExtra("flow_message_version", (String) map.get("flow_message_version"));
    }
}
