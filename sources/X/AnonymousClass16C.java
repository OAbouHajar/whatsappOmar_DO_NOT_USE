package X;

import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.16C  reason: invalid class name */
public final class AnonymousClass16C implements C19550yc {
    public C440022j A00;
    public final AnonymousClass013 A01;
    public final C17190ug A02;

    public AnonymousClass16C(AnonymousClass013 r2, C17190ug r3) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public static final JSONObject A00(C439922i r4) {
        C18450wi.A0H(r4, 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", r4.A0A);
        jSONObject.put("locale", r4.A06);
        jSONObject.put("expiresData", r4.A01);
        jSONObject.put("appId", r4.A03);
        jSONObject.put("version", r4.A00);
        jSONObject.put("platform", r4.A08);
        jSONObject.put("bizJid", r4.A04);
        jSONObject.put("flowVersionId", r4.A02);
        jSONObject.put("signature", r4.A09);
        String str = r4.A07;
        if (str != null) {
            jSONObject.put("minAppVersion", str);
        }
        String str2 = r4.A05;
        if (str2 != null) {
            jSONObject.put("bloksVersionId", str2);
        }
        List<C439922i> list = r4.A0B;
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (C439922i A002 : list) {
                jSONArray.put(A00(A002));
            }
            jSONObject.put("extraVersions", jSONArray);
        }
        return jSONObject;
    }

    public void APb(String str) {
        C18450wi.A0H(str, 0);
        Log.e(C18450wi.A06("GetCommerceMetadataProtocolHelper/onDeliveryFailure: Network failed  while sending the payload: ", str));
        C440022j r0 = this.A00;
        if (r0 == null) {
            C18450wi.A0O("listener");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        AnonymousClass16I r1 = r0.A00;
        r1.A07.set(false);
        C440122k r02 = r1.A01;
        if (r02 != null) {
            r02.A00();
        }
    }

    public void AQe(C28371Vv r4, String str) {
        C18450wi.A0H(r4, 1);
        Log.e("GetCommerceMetadataProtocolHelper/response-error");
        C28371Vv A0J = r4.A0J("error");
        if (A0J != null) {
            A0J.A0A("code", 0);
            C440022j r0 = this.A00;
            if (r0 == null) {
                C18450wi.A0O("listener");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            AnonymousClass16I r2 = r0.A00;
            r2.A07.set(false);
            C440122k r02 = r2.A01;
            if (r02 != null) {
                r02.A00();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0144, code lost:
        if (r7 != null) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0146, code lost:
        r7 = X.C440222l.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0148, code lost:
        r2 = new X.C440322m(r7);
        r4 = r0.A00;
        r4.A07.set(false);
        r1 = r2.A00;
        r14 = new java.util.ArrayList(X.AnonymousClass1J9.A0M(r1, 10));
        r16 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016a, code lost:
        if (r16.hasNext() == false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x016c, code lost:
        r1 = (X.C439922i) r16.next();
        r15 = r1.A03;
        r12 = r1.A0A;
        r11 = r1.A06;
        r5 = r1.A01;
        r10 = r1.A08;
        r9 = r1.A04;
        r14.add(new X.C439922i(r1.A02, r12, r11, r15, (java.lang.String) ((java.util.Map) r4.A08.getValue()).get(r15), r10, r9, r1.A09, r1.A07, r1.A05, r1.A0B, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01b9, code lost:
        r0 = new X.C440322m(r14);
        r5 = r4.A03;
        r2 = new org.json.JSONArray();
        r3 = r0.A00;
        r1 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01cf, code lost:
        if (r1.hasNext() == false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d1, code lost:
        r2.put(A00((X.C439922i) r1.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01df, code lost:
        r1 = new org.json.JSONObject();
        r1.put("bloksLinks", r2);
        r5.A0K().putString("commerce_metadata", r1.toString()).apply();
        r0 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01fc, code lost:
        if (r0 == null) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01fe, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x020b, code lost:
        if (r4.A05.A0E(X.C16620tM.A02, 2175) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020d, code lost:
        r4 = r4.A06;
        r5 = new java.util.ArrayList();
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021c, code lost:
        if (r3.hasNext() == false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x021e, code lost:
        r2 = r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x022d, code lost:
        if (X.C18450wi.A0R(((X.C439922i) r2).A08, "android") == false) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x022f, code lost:
        r5.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0233, code lost:
        r3 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x023b, code lost:
        if (r3.hasNext() == false) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023d, code lost:
        r1 = X.C439922i.A00((X.C439922i) r3.next());
        r2 = X.C440422n.A00(r1, r4.A05);
        r7 = r4.A01;
        r10 = r4.A04;
        new X.C19960zH(r4.A00, r7, r4.A02, r4.A03, r10).A0B(new X.C440522o(), r1.A0A, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYG(X.C28371Vv r45, java.lang.String r46) {
        /*
            r44 = this;
            r0 = 0
            r1 = r46
            X.C18450wi.A0H(r1, r0)
            r0 = 1
            r1 = r45
            X.C18450wi.A0H(r1, r0)
            java.lang.String r20 = "commerce_metadata"
            r0 = r20
            X.1Vv r1 = r1.A0J(r0)
            if (r1 == 0) goto L_0x0130
            java.lang.String r0 = "bloks_links"
            X.1Vv r0 = r1.A0J(r0)
            if (r0 == 0) goto L_0x0130
            X.1Vv[] r6 = r0.A03
            if (r6 == 0) goto L_0x0130
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r4 = r6.length
            r3 = 0
        L_0x0029:
            if (r3 >= r4) goto L_0x003d
            r2 = r6[r3]
            int r3 = r3 + 1
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "link"
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 == 0) goto L_0x0029
            r5.add(r2)
            goto L_0x0029
        L_0x003d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r19 = r5.iterator()
        L_0x0046:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r0 = r19.next()
            X.1Vv r0 = (X.C28371Vv) r0
            java.lang.String r1 = "language"
            r2 = 0
            java.lang.String r24 = r0.A0N(r1, r2)
            java.lang.String r29 = ""
            if (r24 != 0) goto L_0x0067
            java.lang.String r1 = "locale"
            java.lang.String r24 = r0.A0N(r1, r2)
            if (r24 != 0) goto L_0x0067
            r24 = r29
        L_0x0067:
            java.lang.String r1 = "extra_versions"
            X.1Vv r1 = r0.A0J(r1)
            java.lang.String r18 = "signature"
            java.lang.String r15 = "biz_jid"
            java.lang.String r14 = "flow_version_id"
            java.lang.String r13 = "platform"
            java.lang.String r12 = "bloks_app_id"
            java.lang.String r11 = "expires_at"
            java.lang.String r9 = "url"
            if (r1 == 0) goto L_0x00e4
            X.1Vv[] r6 = r1.A03
            if (r6 == 0) goto L_0x00e4
            int r8 = r6.length
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r8)
            r2 = 0
        L_0x008a:
            if (r2 >= r8) goto L_0x00e5
            r5 = r6[r2]
            int r2 = r2 + 1
            r1 = 0
            java.lang.String r34 = r0.A0N(r12, r1)
            if (r34 != 0) goto L_0x0099
            r34 = r29
        L_0x0099:
            java.lang.String r36 = r0.A0N(r13, r1)
            if (r36 != 0) goto L_0x00a1
            r36 = r29
        L_0x00a1:
            r3 = -1
            long r16 = r0.A0D(r14, r3)
            java.lang.String r37 = r0.A0N(r15, r1)
            java.lang.String r32 = r5.A0N(r9, r1)
            if (r32 != 0) goto L_0x00b3
            r32 = r29
        L_0x00b3:
            r3 = r18
            java.lang.String r38 = r5.A0N(r3, r1)
            if (r38 != 0) goto L_0x00bd
            r38 = r29
        L_0x00bd:
            r3 = 0
            long r42 = r5.A0D(r11, r3)
            java.lang.String r3 = "min_app_version"
            java.lang.String r39 = r5.A0N(r3, r1)
            java.lang.String r3 = "bloks_version_id"
            java.lang.String r40 = r5.A0N(r3, r1)
            java.lang.Long r31 = java.lang.Long.valueOf(r16)
            X.22i r3 = new X.22i
            r41 = r1
            r30 = r3
            r33 = r24
            r35 = r1
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r10.add(r3)
            goto L_0x008a
        L_0x00e4:
            r10 = 0
        L_0x00e5:
            r3 = 0
            java.lang.String r23 = r0.A0N(r9, r3)
            if (r23 != 0) goto L_0x00ee
            r23 = r29
        L_0x00ee:
            r1 = 0
            long r33 = r0.A0D(r11, r1)
            java.lang.String r25 = r0.A0N(r12, r3)
            if (r25 != 0) goto L_0x00fc
            r25 = r29
        L_0x00fc:
            java.lang.String r27 = r0.A0N(r13, r3)
            if (r27 != 0) goto L_0x0104
            r27 = r29
        L_0x0104:
            r1 = -1
            long r4 = r0.A0D(r14, r1)
            java.lang.String r28 = r0.A0N(r15, r3)
            r1 = r18
            java.lang.String r0 = r0.A0N(r1, r3)
            if (r0 == 0) goto L_0x0118
            r29 = r0
        L_0x0118:
            java.lang.Long r22 = java.lang.Long.valueOf(r4)
            X.22i r0 = new X.22i
            r30 = r3
            r31 = r3
            r21 = r0
            r26 = r3
            r32 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r7.add(r0)
            goto L_0x0046
        L_0x0130:
            r7 = 0
        L_0x0131:
            r0 = r44
            X.22j r0 = r0.A00
            if (r0 != 0) goto L_0x0144
            java.lang.String r0 = "listener"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0144:
            if (r7 != 0) goto L_0x0148
            X.22l r7 = X.C440222l.A00
        L_0x0148:
            X.22m r2 = new X.22m
            r2.<init>(r7)
            X.16I r4 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A07
            r0 = 0
            r1.set(r0)
            java.util.List r1 = r2.A00
            r0 = 10
            int r0 = X.AnonymousClass1J9.A0M(r1, r0)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r0)
            java.util.Iterator r16 = r1.iterator()
        L_0x0166:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r1 = r16.next()
            X.22i r1 = (X.C439922i) r1
            X.0qW r0 = r4.A08
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r15 = r1.A03
            java.lang.Object r13 = r0.get(r15)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r12 = r1.A0A
            java.lang.String r11 = r1.A06
            long r5 = r1.A01
            java.lang.String r10 = r1.A08
            java.lang.String r9 = r1.A04
            java.lang.Long r8 = r1.A02
            java.lang.String r7 = r1.A09
            java.lang.String r3 = r1.A07
            java.lang.String r2 = r1.A05
            java.util.List r1 = r1.A0B
            X.22i r0 = new X.22i
            r21 = r0
            r22 = r8
            r23 = r12
            r24 = r11
            r25 = r15
            r26 = r13
            r27 = r10
            r28 = r9
            r29 = r7
            r30 = r3
            r31 = r2
            r32 = r1
            r33 = r5
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r14.add(r0)
            goto L_0x0166
        L_0x01b9:
            X.22m r0 = new X.22m
            r0.<init>(r14)
            X.0rz r5 = r4.A03
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.List r3 = r0.A00
            java.util.Iterator r1 = r3.iterator()
        L_0x01cb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01df
            java.lang.Object r0 = r1.next()
            X.22i r0 = (X.C439922i) r0
            org.json.JSONObject r0 = A00(r0)
            r2.put(r0)
            goto L_0x01cb
        L_0x01df:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "bloksLinks"
            r1.put(r0, r2)
            java.lang.String r2 = r1.toString()
            android.content.SharedPreferences$Editor r1 = r5.A0K()
            r0 = r20
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
            X.22k r0 = r4.A01
            if (r0 == 0) goto L_0x0201
            r0.A00()
        L_0x0201:
            X.0pd r2 = r4.A05
            r1 = 2175(0x87f, float:3.048E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 != 0) goto L_0x0267
            X.16D r4 = r4.A06
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0218:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0233
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.22i r0 = (X.C439922i) r0
            java.lang.String r1 = r0.A08
            java.lang.String r0 = "android"
            boolean r0 = X.C18450wi.A0R(r1, r0)
            if (r0 == 0) goto L_0x0218
            r5.add(r2)
            goto L_0x0218
        L_0x0233:
            java.util.Iterator r3 = r5.iterator()
        L_0x0237:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0267
            java.lang.Object r0 = r3.next()
            X.22i r0 = (X.C439922i) r0
            X.22i r1 = X.C439922i.A00(r0)
            X.0wh r0 = r4.A05
            java.lang.String r2 = X.C440422n.A00(r1, r0)
            X.0tz r7 = r4.A01
            X.0sq r10 = r4.A04
            X.0ua r6 = r4.A00
            X.0vS r9 = r4.A03
            X.0zG r8 = r4.A02
            X.0zH r5 = new X.0zH
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String r1 = r1.A0A
            X.22o r0 = new X.22o
            r0.<init>()
            r5.A0B(r0, r1, r2)
            goto L_0x0237
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16C.AYG(X.1Vv, java.lang.String):void");
    }
}
