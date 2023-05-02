package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: X.283  reason: invalid class name */
public class AnonymousClass283 implements C19550yc {
    public final C16300so A00;
    public final AnonymousClass281 A01;
    public final C17580vJ A02;
    public final C14710pd A03;
    public final C17190ug A04;
    public final Map A05 = Collections.synchronizedMap(new HashMap());

    public AnonymousClass283(C16300so r2, AnonymousClass281 r3, C17580vJ r4, C14710pd r5, C17190ug r6) {
        this.A03 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
    }

    public static final C451527g A00(C28371Vv r9, String str) {
        if (r9.A0J("error") != null) {
            C28371Vv A0K = r9.A0K("error");
            Long valueOf = Long.valueOf(Math.min(A0K.A0D("backoff", 7200) * 1000, 3600000));
            String A0N = A0K.A0N("text", (String) null);
            int A0A = A0K.A0A("code", -1);
            long A0D = A0K.A0D("backoff", -1);
            StringBuilder sb = new StringBuilder("connection/unisynciq/parse/");
            sb.append(str);
            sb.append("/error/error_text= ");
            sb.append(A0N);
            sb.append(", code: ");
            sb.append(A0A);
            sb.append(", backoff:");
            sb.append(A0D);
            Log.w(sb.toString());
            return new C451527g(Integer.valueOf(A0A), (Long) null, valueOf, false);
        }
        String A0N2 = r9.A0N("refresh", (String) null);
        return new C451527g((Integer) null, A0N2 != null ? Long.valueOf(Long.parseLong(A0N2) * 1000) : null, (Long) null, true);
    }

    public static C28371Vv A01(C17930vs r3, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        C35081lL[] r4 = null;
        if (!r3.containsKey(valueOf)) {
            return null;
        }
        String str = (String) r3.get(valueOf);
        if (!TextUtils.isEmpty(str)) {
            r4 = new C35081lL[]{new C35081lL("dhash", str)};
        }
        return new C28371Vv("consumer_status", r4);
    }

    public static C28371Vv A02(C17930vs r3, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        C35081lL[] r4 = null;
        if (!r3.containsKey(valueOf)) {
            return null;
        }
        String str = (String) r3.get(valueOf);
        if (!TextUtils.isEmpty(str)) {
            r4 = new C35081lL[]{new C35081lL("dhash", str)};
        }
        return new C28371Vv("eligible_offers", r4);
    }

    public static Future A03(C34861kz r4, AnonymousClass283 r5, String str, List list, int i2) {
        return r5.A04(new C52462dq(r4, list, i2, false), AnonymousClass288.A00(str), 64000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0324, code lost:
        if (r0 != false) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05dc, code lost:
        if ((r26 & 16) == 16) goto L_0x05de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0269, code lost:
        if ((r26 & 16) == 16) goto L_0x026b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.concurrent.Future A04(X.C52462dq r39, java.lang.String r40, long r41) {
        /*
            r38 = this;
            r37 = r38
            r0 = r37
            X.0ug r0 = r0.A04
            r36 = r0
            java.lang.String r20 = r36.A02()
            r0 = 4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            r0 = 2
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r0)
            r13 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
        L_0x0035:
            r10 = r39
            java.util.List r2 = r10.A02
            int r0 = r2.size()
            java.lang.String r17 = "lid"
            java.lang.String r23 = "sidelist"
            java.lang.String r16 = "pay"
            java.lang.String r12 = "devices"
            java.lang.String r11 = "business"
            java.lang.String r9 = "profile"
            java.lang.String r25 = "id"
            java.lang.String r8 = "picture"
            java.lang.String r5 = "verified_name"
            java.lang.String r4 = "status"
            java.lang.String r1 = "contact"
            java.lang.String r15 = "type"
            if (r13 >= r0) goto L_0x03bd
            java.lang.Object r2 = r2.get(r13)
            X.27f r2 = (X.C451427f) r2
            r3.clear()
            boolean r0 = r2.A0C
            java.lang.String r24 = "delete"
            if (r0 == 0) goto L_0x0089
            boolean r0 = r2.A0G
            if (r0 != 0) goto L_0x0089
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x03ab
            r0 = 1
            X.1lL[] r6 = new X.C35081lL[r0]
            X.1lL r7 = new X.1lL
            r0 = r24
            r7.<init>((java.lang.String) r15, (java.lang.String) r0)
            r0 = 0
            r6[r0] = r7
            X.1Vv r7 = new X.1Vv
            r7.<init>(r1, r6)
        L_0x0084:
            r3.add(r7)
        L_0x0087:
            r27 = 1
        L_0x0089:
            boolean r0 = r2.A0L
            r21 = 0
            if (r0 == 0) goto L_0x00b7
            long r0 = r2.A03
            int r6 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r6 <= 0) goto L_0x00b5
            r0 = 1
            X.1lL[] r6 = new X.C35081lL[r0]
            long r0 = r2.A03
            r21 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r21
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "t"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r7)
            r1 = 0
            r6[r1] = r0
            X.1Vv r0 = new X.1Vv
            r0.<init>(r4, r6)
            r3.add(r0)
        L_0x00b5:
            r28 = 1
        L_0x00b7:
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x010f
            r14.clear()
            java.lang.String r0 = r2.A0A
            if (r0 == 0) goto L_0x00da
            r0 = 1
            X.1lL[] r6 = new X.C35081lL[r0]
            java.lang.String r4 = r2.A0A
            java.lang.String r1 = "serial"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r4)
            r1 = 0
            r6[r1] = r0
            X.1Vv r0 = new X.1Vv
            r0.<init>(r5, r6)
            r14.add(r0)
        L_0x00da:
            java.lang.String r0 = r2.A07
            if (r0 == 0) goto L_0x03a8
            r0 = 1
            X.1lL[] r5 = new X.C35081lL[r0]
            java.lang.String r4 = r2.A07
            java.lang.String r1 = "tag"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r4)
            r1 = 0
            r5[r1] = r0
            X.1Vv r0 = new X.1Vv
            r0.<init>(r9, r5)
            r14.add(r0)
        L_0x00f6:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x010d
            X.1Vv[] r0 = new X.C28371Vv[r1]
            java.lang.Object[] r4 = r14.toArray(r0)
            X.1Vv[] r4 = (X.C28371Vv[]) r4
            r1 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r11, (X.C35081lL[]) r1, (X.C28371Vv[]) r4)
            r3.add(r0)
        L_0x010d:
            r30 = 1
        L_0x010f:
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x0130
            int r0 = r2.A00
            if (r0 <= 0) goto L_0x012e
            r0 = 1
            X.1lL[] r5 = new X.C35081lL[r0]
            int r4 = r2.A00
            X.1lL r1 = new X.1lL
            r0 = r25
            r1.<init>((java.lang.String) r0, (int) r4)
            r0 = 0
            r5[r0] = r1
            X.1Vv r0 = new X.1Vv
            r0.<init>(r8, r5)
            r3.add(r0)
        L_0x012e:
            r29 = 1
        L_0x0130:
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x018a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r0 = r2.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0188
            java.lang.String r5 = r2.A08
            java.lang.String r1 = "device_hash"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r5)
            r4.add(r0)
            long r0 = r2.A02
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0174
            long r0 = r2.A02
            java.lang.String r6 = "ts"
            X.1lL r5 = new X.1lL
            r5.<init>((java.lang.String) r6, (long) r0)
            r4.add(r5)
            long r5 = r2.A01
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0174
            long r0 = r2.A01
            java.lang.String r6 = "expected_ts"
            X.1lL r5 = new X.1lL
            r5.<init>((java.lang.String) r6, (long) r0)
            r4.add(r5)
        L_0x0174:
            int r0 = r4.size()
            X.1lL[] r0 = new X.C35081lL[r0]
            java.lang.Object[] r1 = r4.toArray(r0)
            X.1lL[] r1 = (X.C35081lL[]) r1
            X.1Vv r0 = new X.1Vv
            r0.<init>(r12, r1)
            r3.add(r0)
        L_0x0188:
            r32 = 1
        L_0x018a:
            com.whatsapp.jid.UserJid r0 = r2.A06
            java.lang.String r11 = "jid"
            if (r0 == 0) goto L_0x03a5
            r0 = 1
            X.1lL[] r10 = new X.C35081lL[r0]
            com.whatsapp.jid.UserJid r1 = r2.A06
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r11)
            r1 = 0
            r10[r1] = r0
        L_0x019d:
            boolean r0 = r2.A0I
            if (r0 == 0) goto L_0x0309
            X.1xt r0 = r2.A04
            if (r0 == 0) goto L_0x0309
            boolean r0 = r2.A0I
            if (r0 == 0) goto L_0x0225
            X.1xt r6 = r2.A04
            if (r6 == 0) goto L_0x0225
            android.util.Pair r0 = r6.A00
            if (r0 == 0) goto L_0x01bd
            java.lang.Object r0 = r0.first
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01bd
            r26 = r26 | 1
        L_0x01bd:
            X.0vs r0 = r6.A01
            boolean r1 = r0.isEmpty()
            r5 = 3
            r4 = 1
            if (r1 != 0) goto L_0x01f5
            X.0uz r0 = r0.entrySet()
            X.1Ub r7 = r0.iterator()
        L_0x01cf:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01f5
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L_0x01eb
            r26 = r26 | 4
            goto L_0x01cf
        L_0x01eb:
            if (r1 != r4) goto L_0x01f0
            r26 = r26 | 2
            goto L_0x01cf
        L_0x01f0:
            if (r1 != r5) goto L_0x01cf
            r26 = r26 | 8
            goto L_0x01cf
        L_0x01f5:
            X.0vs r0 = r6.A02
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0225
            X.0uz r0 = r0.entrySet()
            X.1Ub r1 = r0.iterator()
        L_0x0205:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0225
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x0220
            r26 = r26 | 16
            goto L_0x0205
        L_0x0220:
            if (r0 != r5) goto L_0x0205
            r26 = r26 | 32
            goto L_0x0205
        L_0x0225:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            X.1xt r6 = r2.A04
            android.util.Pair r0 = r6.A00
            r5 = 0
            r1 = 1
            if (r0 == 0) goto L_0x025f
            java.lang.Object r4 = r0.first
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x025f
            java.lang.Object r4 = r0.second
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x025f
            X.1lL[] r7 = new X.C35081lL[r1]
            java.lang.Object r4 = r0.second
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r8 = "dhash"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r8, (java.lang.String) r4)
            r7[r5] = r0
            java.lang.String r4 = "merchant_status"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r4, r7)
            r9.add(r0)
        L_0x025f:
            r4 = r26 & 2
            r0 = 2
            if (r4 == r0) goto L_0x026b
            r4 = 16
            r0 = r26 & 16
            r7 = 0
            if (r0 != r4) goto L_0x026c
        L_0x026b:
            r7 = 1
        L_0x026c:
            r4 = 0
            if (r7 == 0) goto L_0x029d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.0vs r7 = r6.A01
            X.1Vv r8 = A01(r7, r1)
            X.0vs r7 = r6.A02
            X.1Vv r7 = A02(r7, r1)
            if (r8 == 0) goto L_0x0285
            r0.add(r8)
        L_0x0285:
            if (r7 == 0) goto L_0x028a
            r0.add(r7)
        L_0x028a:
            X.1Vv[] r7 = new X.C28371Vv[r5]
            java.lang.Object[] r0 = r0.toArray(r7)
            X.1Vv[] r0 = (X.C28371Vv[]) r0
            java.lang.String r8 = "upi"
            X.1Vv r7 = new X.1Vv
            r7.<init>((java.lang.String) r8, (X.C35081lL[]) r4, (X.C28371Vv[]) r0)
            r9.add(r7)
        L_0x029d:
            r7 = 4
            r0 = r26 & 4
            if (r0 != r7) goto L_0x02b7
            X.1Vv[] r1 = new X.C28371Vv[r1]
            r7 = 2
            X.0vs r0 = r6.A01
            X.1Vv r0 = A01(r0, r7)
            r1[r5] = r0
            java.lang.String r7 = "novi"
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r7, (X.C35081lL[]) r4, (X.C28371Vv[]) r1)
            r9.add(r0)
        L_0x02b7:
            r1 = r26 & 8
            r0 = 8
            if (r1 == r0) goto L_0x02c3
            r1 = 32
            r0 = r26 & 32
            if (r0 != r1) goto L_0x02f1
        L_0x02c3:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.0vs r0 = r6.A01
            r7 = 3
            X.1Vv r0 = A01(r0, r7)
            X.0vs r6 = r6.A02
            X.1Vv r6 = A02(r6, r7)
            if (r0 == 0) goto L_0x02da
            r1.add(r0)
        L_0x02da:
            if (r6 == 0) goto L_0x02df
            r1.add(r6)
        L_0x02df:
            X.1Vv[] r0 = new X.C28371Vv[r5]
            java.lang.Object[] r6 = r1.toArray(r0)
            X.1Vv[] r6 = (X.C28371Vv[]) r6
            java.lang.String r1 = "fbpay"
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (X.C35081lL[]) r4, (X.C28371Vv[]) r6)
            r9.add(r0)
        L_0x02f1:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0309
            X.1Vv[] r0 = new X.C28371Vv[r5]
            java.lang.Object[] r5 = r9.toArray(r0)
            X.1Vv[] r5 = (X.C28371Vv[]) r5
            X.1Vv r1 = new X.1Vv
            r0 = r16
            r1.<init>((java.lang.String) r0, (X.C35081lL[]) r4, (X.C28371Vv[]) r5)
            r3.add(r1)
        L_0x0309:
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x030f
            r33 = 1
        L_0x030f:
            boolean r0 = r2.A0H
            if (r0 == 0) goto L_0x0315
            r34 = 1
        L_0x0315:
            boolean r0 = r2.A0G
            java.lang.String r1 = "user"
            if (r0 == 0) goto L_0x0394
            boolean r0 = r2.A0K
            if (r0 != 0) goto L_0x0326
            r0 = r31
            r31 = 0
            if (r0 == 0) goto L_0x0328
        L_0x0326:
            r31 = 1
        L_0x0328:
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x0343
            r0 = 1
            X.1lL[] r4 = new X.C35081lL[r0]
            X.1lL r5 = new X.1lL
            r0 = r24
            r5.<init>((java.lang.String) r15, (java.lang.String) r0)
            r0 = 0
            r4[r0] = r5
            X.1Vv r5 = new X.1Vv
            r0 = r23
            r5.<init>(r0, r4)
            r3.add(r5)
        L_0x0343:
            com.whatsapp.jid.UserJid r0 = r2.A06
            boolean r0 = X.C16030sJ.A0O(r0)
            if (r0 == 0) goto L_0x0392
            r0 = r37
            X.0pd r5 = r0.A03
            r4 = 1892(0x764, float:2.651E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r4)
            if (r0 == 0) goto L_0x0392
            r0 = r37
            X.0vJ r0 = r0.A02
            com.whatsapp.jid.UserJid r2 = r2.A06
            X.1ZT r2 = (X.AnonymousClass1ZT) r2
            X.1ZX r2 = r0.A00(r2)
            if (r2 == 0) goto L_0x0392
            r0 = 1
            X.1lL[] r4 = new X.C35081lL[r0]
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r11)
            r5 = 0
            r4[r5] = r0
            X.1Vv r2 = new X.1Vv
            r0 = r17
            r2.<init>(r0, r4)
            r3.add(r2)
        L_0x037c:
            X.1Vv[] r0 = new X.C28371Vv[r5]
            java.lang.Object[] r0 = r3.toArray(r0)
            X.1Vv[] r0 = (X.C28371Vv[]) r0
            X.1Vv r2 = new X.1Vv
            r2.<init>((java.lang.String) r1, (X.C35081lL[]) r10, (X.C28371Vv[]) r0)
            r0 = r19
        L_0x038b:
            r0.add(r2)
            int r13 = r13 + 1
            goto L_0x0035
        L_0x0392:
            r5 = 0
            goto L_0x037c
        L_0x0394:
            r0 = 0
            X.1Vv[] r0 = new X.C28371Vv[r0]
            java.lang.Object[] r0 = r3.toArray(r0)
            X.1Vv[] r0 = (X.C28371Vv[]) r0
            X.1Vv r2 = new X.1Vv
            r2.<init>((java.lang.String) r1, (X.C35081lL[]) r10, (X.C28371Vv[]) r0)
            r0 = r18
            goto L_0x038b
        L_0x03a5:
            r10 = 0
            goto L_0x019d
        L_0x03a8:
            r1 = 0
            goto L_0x00f6
        L_0x03ab:
            java.lang.String r0 = r2.A09
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0087
            java.lang.String r6 = r2.A09
            r0 = 0
            X.1Vv r7 = new X.1Vv
            r7.<init>((java.lang.String) r1, (java.lang.String) r6, (X.C35081lL[]) r0)
            goto L_0x0084
        L_0x03bd:
            int r0 = r27 + r28
            int r0 = r0 + r30
            int r0 = r0 + r31
            int r0 = r0 + r29
            int r0 = r0 + r32
            r2 = 0
            if (r26 == 0) goto L_0x03cb
            r2 = 1
        L_0x03cb:
            int r0 = r0 + r2
            int r0 = r0 + r33
            int r0 = r0 + r34
            X.1Vv[] r6 = new X.C28371Vv[r0]
            r0 = 0
            if (r27 == 0) goto L_0x0673
            X.1Vv r2 = new X.1Vv
            r2.<init>(r1, r0)
            r1 = 0
            r6[r1] = r2
            r13 = 1
        L_0x03de:
            if (r28 == 0) goto L_0x03ea
            int r2 = r13 + 1
            X.1Vv r1 = new X.1Vv
            r1.<init>(r4, r0)
            r6[r13] = r1
            r13 = r2
        L_0x03ea:
            if (r30 == 0) goto L_0x041a
            r1 = 2
            X.1Vv[] r3 = new X.C28371Vv[r1]
            X.1Vv r1 = new X.1Vv
            r1.<init>(r5, r0)
            r0 = 0
            r3[r0] = r1
            r0 = 1
            X.1lL[] r4 = new X.C35081lL[r0]
            int r2 = r10.A00
            java.lang.String r1 = "v"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (int) r2)
            r1 = 0
            r4[r1] = r0
            X.1Vv r0 = new X.1Vv
            r0.<init>(r9, r4)
            r1 = 1
            r3[r1] = r0
            int r2 = r13 + 1
            r1 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r11, (X.C35081lL[]) r1, (X.C28371Vv[]) r3)
            r6[r13] = r0
            r13 = r2
        L_0x041a:
            if (r29 == 0) goto L_0x0439
            int r3 = r13 + 1
            r0 = 1
            X.1lL[] r2 = new X.C35081lL[r0]
            X.1kz r1 = r10.A01
            X.1kz r0 = X.C34861kz.A06
            if (r1 != r0) goto L_0x066f
            java.lang.String r1 = "image"
        L_0x0429:
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r15, (java.lang.String) r1)
            r1 = 0
            r2[r1] = r0
            X.1Vv r0 = new X.1Vv
            r0.<init>(r8, r2)
            r6[r13] = r0
            r13 = r3
        L_0x0439:
            if (r31 == 0) goto L_0x0448
            int r3 = r13 + 1
            r2 = 0
            X.1Vv r1 = new X.1Vv
            r0 = r23
            r1.<init>(r0, r2)
            r6[r13] = r1
            r13 = r3
        L_0x0448:
            if (r32 == 0) goto L_0x0464
            int r4 = r13 + 1
            r0 = 1
            X.1lL[] r3 = new X.C35081lL[r0]
            java.lang.String r2 = "version"
            java.lang.String r1 = "2"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r1 = 0
            r3[r1] = r0
            X.1Vv r0 = new X.1Vv
            r0.<init>(r12, r3)
            r6[r13] = r0
            r13 = r4
        L_0x0464:
            r2 = r26 & 1
            r0 = 1
            if (r2 == r0) goto L_0x05b1
            r1 = r26 & 4
            r0 = 4
            if (r1 == r0) goto L_0x05b1
            r1 = r26 & 2
            r0 = 2
            if (r1 == r0) goto L_0x05b1
            r1 = r26 & 8
            r0 = 8
            if (r1 == r0) goto L_0x05b1
            r1 = r26 & 16
            r0 = 16
            if (r1 == r0) goto L_0x05b1
            r1 = 32
            r0 = r26 & 32
            if (r0 == r1) goto L_0x05b1
            r2 = 0
        L_0x0486:
            if (r33 == 0) goto L_0x0494
            int r3 = r13 + 1
            java.lang.String r1 = "disappearing_mode"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r2)
            r6[r13] = r0
            r13 = r3
        L_0x0494:
            if (r34 == 0) goto L_0x049f
            X.1Vv r0 = new X.1Vv
            r1 = r17
            r0.<init>(r1, r2)
            r6[r13] = r0
        L_0x049f:
            boolean r0 = r18.isEmpty()
            r2 = r0 ^ 1
            boolean r0 = r19.isEmpty()
            r7 = r0 ^ 1
            int r0 = r2 + 1
            int r0 = r0 + r7
            X.1Vv[] r5 = new X.C28371Vv[r0]
            java.lang.String r1 = "query"
            r3 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (X.C35081lL[]) r3, (X.C28371Vv[]) r6)
            r4 = 0
            r5[r4] = r0
            if (r2 == 0) goto L_0x05ae
            X.1Vv[] r0 = new X.C28371Vv[r4]
            r1 = r18
            java.lang.Object[] r2 = r1.toArray(r0)
            X.1Vv[] r2 = (X.C28371Vv[]) r2
            java.lang.String r1 = "list"
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (X.C35081lL[]) r3, (X.C28371Vv[]) r2)
            r1 = 1
            r5[r1] = r0
            r6 = 2
        L_0x04d2:
            if (r7 == 0) goto L_0x04e8
            X.1Vv[] r0 = new X.C28371Vv[r4]
            r1 = r19
            java.lang.Object[] r2 = r1.toArray(r0)
            X.1Vv[] r2 = (X.C28371Vv[]) r2
            java.lang.String r1 = "side_list"
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (X.C35081lL[]) r3, (X.C28371Vv[]) r2)
            r5[r6] = r0
        L_0x04e8:
            X.1kz r4 = r10.A01
            r0 = 5
            X.1lL[] r6 = new X.C35081lL[r0]
            java.lang.String r1 = "sid"
            X.1lL r0 = new X.1lL
            r7 = r40
            r0.<init>((java.lang.String) r1, (java.lang.String) r7)
            r1 = 0
            r6[r1] = r0
            java.lang.String r2 = "index"
            java.lang.String r1 = "0"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r1 = 1
            r6[r1] = r0
            java.lang.String r2 = "last"
            java.lang.String r1 = "true"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r1 = 2
            r6[r1] = r0
            X.27z r0 = r4.mode
            java.lang.String r2 = r0.modeString
            java.lang.String r1 = "mode"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r3 = 3
            r6[r3] = r0
            X.27y r0 = r4.context
            java.lang.String r2 = r0.contextString
            java.lang.String r1 = "context"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r1 = 4
            r6[r1] = r0
            java.lang.String r0 = "usync"
            X.1Vv r1 = new X.1Vv
            r1.<init>((java.lang.String) r0, (X.C35081lL[]) r6, (X.C28371Vv[]) r5)
            X.1lL[] r3 = new X.C35081lL[r3]
            java.lang.String r5 = "xmlns"
            X.1lL r2 = new X.1lL
            r2.<init>((java.lang.String) r5, (java.lang.String) r0)
            r0 = 0
            r3[r0] = r2
            X.1lL r5 = new X.1lL
            r2 = r25
            r0 = r20
            r5.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 1
            r3[r0] = r5
            java.lang.String r2 = "get"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r15, (java.lang.String) r2)
            r2 = 2
            r3[r2] = r0
            java.lang.String r2 = "iq"
            X.1Vv r0 = new X.1Vv
            r0.<init>((X.C28371Vv) r1, (java.lang.String) r2, (X.C35081lL[]) r3)
            boolean r2 = r10.A03
            X.1kz r1 = X.C34861kz.A06
            if (r4 != r1) goto L_0x05ab
            java.lang.String r24 = "image"
        L_0x0569:
            X.4P8 r1 = new X.4P8
            r23 = r4
            r25 = r7
            r35 = r2
            r22 = r1
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            android.util.Pair r5 = android.util.Pair.create(r1, r0)
            java.lang.Object r3 = r5.first
            X.4P8 r3 = (X.AnonymousClass4P8) r3
            r0 = r37
            java.util.Map r1 = r0.A05
            r0 = r20
            r1.put(r0, r3)
            X.27y r2 = r4.context
            X.27y r0 = X.C453227y.REGISTRATION
            r1 = 0
            if (r2 != r0) goto L_0x058f
            r1 = 1
        L_0x058f:
            java.lang.Object r0 = r5.second
            X.1Vv r0 = (X.C28371Vv) r0
            r8 = 102(0x66, float:1.43E-43)
            r11 = 1
            r9 = r41
            r4 = r36
            r5 = r37
            r6 = r0
            r7 = r20
            if (r1 == 0) goto L_0x05a7
            r4.A0H(r5, r6, r7, r8, r9, r11)
        L_0x05a4:
            X.1kE r0 = r3.A02
            return r0
        L_0x05a7:
            r4.A0C(r5, r6, r7, r8, r9, r11)
            goto L_0x05a4
        L_0x05ab:
            java.lang.String r24 = "preview"
            goto L_0x0569
        L_0x05ae:
            r6 = 1
            goto L_0x04d2
        L_0x05b1:
            java.lang.String r0 = "merchant_status"
            r5 = 0
            X.1Vv r1 = new X.1Vv
            r1.<init>(r0, r5)
            java.lang.String r0 = "consumer_status"
            X.1Vv r4 = new X.1Vv
            r4.<init>(r0, r5)
            java.lang.String r0 = "eligible_offers"
            X.1Vv r9 = new X.1Vv
            r9.<init>(r0, r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0 = 1
            if (r2 != r0) goto L_0x05d2
            r3.add(r1)
        L_0x05d2:
            r7 = r26 & 2
            r1 = 2
            if (r7 == r1) goto L_0x05de
            r2 = 16
            r0 = r26 & 16
            r8 = 0
            if (r0 != r2) goto L_0x05df
        L_0x05de:
            r8 = 1
        L_0x05df:
            r2 = 0
            if (r8 == 0) goto L_0x0608
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r7 != r1) goto L_0x05ec
            r0.add(r4)
        L_0x05ec:
            r7 = r26 & 16
            r1 = 16
            if (r7 != r1) goto L_0x05f5
            r0.add(r9)
        L_0x05f5:
            X.1Vv[] r1 = new X.C28371Vv[r2]
            java.lang.Object[] r1 = r0.toArray(r1)
            X.1Vv[] r1 = (X.C28371Vv[]) r1
            java.lang.String r7 = "upi"
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r7, (X.C35081lL[]) r5, (X.C28371Vv[]) r1)
            r3.add(r0)
        L_0x0608:
            r1 = 4
            r0 = r26 & 4
            if (r0 != r1) goto L_0x0627
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r4)
            X.1Vv[] r0 = new X.C28371Vv[r2]
            java.lang.Object[] r1 = r1.toArray(r0)
            X.1Vv[] r1 = (X.C28371Vv[]) r1
            java.lang.String r7 = "novi"
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r7, (X.C35081lL[]) r5, (X.C28371Vv[]) r1)
            r3.add(r0)
        L_0x0627:
            r7 = r26 & 8
            r1 = 8
            if (r7 == r1) goto L_0x0633
            r8 = 32
            r0 = r26 & 32
            if (r0 != r8) goto L_0x0658
        L_0x0633:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r7 != r1) goto L_0x063d
            r0.add(r4)
        L_0x063d:
            r4 = 32
            r1 = r26 & 32
            if (r1 != r4) goto L_0x0646
            r0.add(r9)
        L_0x0646:
            X.1Vv[] r1 = new X.C28371Vv[r2]
            java.lang.Object[] r4 = r0.toArray(r1)
            X.1Vv[] r4 = (X.C28371Vv[]) r4
            java.lang.String r1 = "fbpay"
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (X.C35081lL[]) r5, (X.C28371Vv[]) r4)
            r3.add(r0)
        L_0x0658:
            int r4 = r13 + 1
            X.1Vv[] r0 = new X.C28371Vv[r2]
            java.lang.Object[] r3 = r3.toArray(r0)
            X.1Vv[] r3 = (X.C28371Vv[]) r3
            r2 = 0
            X.1Vv r1 = new X.1Vv
            r0 = r16
            r1.<init>((java.lang.String) r0, (X.C35081lL[]) r5, (X.C28371Vv[]) r3)
            r6[r13] = r1
            r13 = r4
            goto L_0x0486
        L_0x066f:
            java.lang.String r1 = "preview"
            goto L_0x0429
        L_0x0673:
            r13 = 0
            goto L_0x03de
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass283.A04(X.2dq, java.lang.String, long):java.util.concurrent.Future");
    }

    public void APb(String str) {
        AnonymousClass4P8 r0 = (AnonymousClass4P8) this.A05.remove(str);
        if (r0 != null) {
            r0.A02.A01(new C802543d(str));
        } else {
            Log.w("UniSyncProtocolHelper/onDeliveryFailure missing request");
        }
    }

    public void AQe(C28371Vv r11, String str) {
        AnonymousClass4P8 r2 = (AnonymousClass4P8) this.A05.remove(str);
        if (r2 != null) {
            C28371Vv A0J = r11.A0J("error");
            int i2 = 0;
            long j2 = -1;
            if (A0J != null) {
                String A0N = A0J.A0N("code", (String) null);
                if (A0N != null) {
                    i2 = Integer.parseInt(A0N);
                }
                String A0N2 = A0J.A0N("backoff", (String) null);
                if (A0N2 != null) {
                    j2 = Math.min(Long.parseLong(A0N2) * 1000, 3600000);
                }
            }
            StringBuilder sb = new StringBuilder("UniSyncProtocolHelper/handleSyncContactError sid=");
            String str2 = r2.A04;
            sb.append(str2);
            sb.append(" code=");
            sb.append(i2);
            sb.append(" backoff=");
            sb.append(j2);
            Log.i(sb.toString());
            this.A01.AHP(r2.A01, str2, 0, i2, j2);
            r2.A02.A02((Object) null);
            return;
        }
        Log.w("UniSyncProtocolHelper/onError missing request");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: X.27a} */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0211, code lost:
        r0 = new java.lang.StringBuilder("Invalid contact type=");
        r0.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0224, code lost:
        throw new X.AnonymousClass1W9(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0242, code lost:
        r1 = r27;
        r1.A04 = r7;
        r4 = r4.A0L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x024a, code lost:
        if (r4 == null) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x024c, code lost:
        r1.A0G.add(r4);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0260  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYG(X.C28371Vv r41, java.lang.String r42) {
        /*
            r40 = this;
            r39 = r40
            r0 = r39
            java.util.Map r0 = r0.A05
            r1 = r42
            java.lang.Object r16 = r0.remove(r1)
            r0 = r16
            X.4P8 r0 = (X.AnonymousClass4P8) r0
            r16 = r0
            if (r0 == 0) goto L_0x068c
            java.lang.String r0 = "usync"
            r1 = r41
            X.1Vv r1 = r1.A0J(r0)
            if (r1 == 0) goto L_0x0683
            java.lang.String r0 = "result"
            X.1Vv r0 = r1.A0K(r0)
            r2 = r16
            boolean r4 = r2.A07
            java.lang.String r3 = " backoff="
            java.lang.String r2 = " code="
            r15 = 0
            if (r4 == 0) goto L_0x0617
            java.lang.String r5 = "contact"
            X.1Vv r4 = r0.A0K(r5)
            X.27g r26 = A00(r4, r5)
            r4 = r26
            boolean r4 = r4.A03
            if (r4 != 0) goto L_0x0082
            r4 = r16
            boolean r4 = r4.A05
            if (r4 != 0) goto L_0x0082
            java.lang.String r4 = "UniSyncProtocolHelper/handleSyncContactError sid="
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r4)
            r4 = r16
            java.lang.String r10 = r4.A04
            r8.append(r10)
            r8.append(r2)
            r4 = r26
            java.lang.Integer r7 = r4.A00
            r8.append(r7)
            r8.append(r3)
            java.lang.Long r6 = r4.A01
            r8.append(r6)
            java.lang.String r4 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r4 = r39
            X.281 r8 = r4.A01
            r4 = r16
            X.1kz r9 = r4.A01
            r11 = 0
            int r12 = r7.intValue()
            long r13 = r6.longValue()
            r8.AHP(r9, r10, r11, r12, r13)
        L_0x0082:
            X.1Vv r5 = r0.A0K(r5)
            java.lang.String r4 = "version"
            java.lang.String r38 = r5.A0N(r4, r15)
        L_0x008d:
            r4 = r16
            boolean r4 = r4.A0D
            if (r4 == 0) goto L_0x0613
            java.lang.String r5 = "sidelist"
            X.1Vv r4 = r0.A0K(r5)
            X.27g r25 = A00(r4, r5)
            r4 = r25
            boolean r4 = r4.A03
            if (r4 != 0) goto L_0x00e1
            r4 = r16
            boolean r4 = r4.A05
            if (r4 != 0) goto L_0x00e1
            java.lang.String r4 = "UniSyncProtocolHelper/handleSyncSidelistError sid="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r4 = r16
            java.lang.String r6 = r4.A04
            r5.append(r6)
            r5.append(r2)
            r2 = r25
            java.lang.Integer r4 = r2.A00
            r5.append(r4)
            r5.append(r3)
            java.lang.Long r3 = r2.A01
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r2 = r39
            X.281 r5 = r2.A01
            r7 = 0
            int r8 = r4.intValue()
            long r9 = r3.longValue()
            r5.AHR(r6, r7, r8, r9)
        L_0x00e1:
            r2 = r16
            boolean r2 = r2.A0C
            if (r2 == 0) goto L_0x060f
            java.lang.String r3 = "status"
            X.1Vv r2 = r0.A0K(r3)
            X.27g r32 = A00(r2, r3)
        L_0x00f2:
            r2 = r16
            boolean r2 = r2.A0B
            if (r2 == 0) goto L_0x060b
            java.lang.String r3 = "picture"
            X.1Vv r2 = r0.A0K(r3)
            X.27g r33 = A00(r2, r3)
        L_0x0102:
            r2 = r16
            boolean r2 = r2.A06
            java.lang.String r24 = "business"
            if (r2 == 0) goto L_0x0607
            r2 = r24
            X.1Vv r3 = r0.A0K(r2)
            X.27g r19 = A00(r3, r2)
        L_0x0114:
            r2 = r16
            boolean r2 = r2.A08
            if (r2 == 0) goto L_0x0603
            java.lang.String r3 = "devices"
            X.1Vv r2 = r0.A0K(r3)
            X.27g r34 = A00(r2, r3)
        L_0x0124:
            r2 = r16
            int r4 = r2.A00
            r3 = r4 & 1
            r2 = 1
            if (r3 == r2) goto L_0x05f7
            r3 = r4 & 4
            r2 = 4
            if (r3 == r2) goto L_0x05f7
            r3 = r4 & 2
            r2 = 2
            if (r3 == r2) goto L_0x05f7
            r3 = r4 & 8
            r2 = 8
            if (r3 == r2) goto L_0x05f7
            r3 = r4 & 16
            r2 = 16
            if (r3 == r2) goto L_0x05f7
            r3 = 32
            r2 = r4 & 32
            if (r2 == r3) goto L_0x05f7
            r35 = r15
        L_0x014b:
            r2 = r16
            boolean r2 = r2.A09
            if (r2 == 0) goto L_0x05f3
            java.lang.String r3 = "disappearing_mode"
            X.1Vv r2 = r0.A0K(r3)
            X.27g r36 = A00(r2, r3)
        L_0x015b:
            r2 = r16
            boolean r2 = r2.A0A
            java.lang.String r23 = "lid"
            if (r2 == 0) goto L_0x016f
            r2 = r23
            X.1Vv r2 = r0.A0K(r2)
            r0 = r23
            X.27g r15 = A00(r2, r0)
        L_0x016f:
            java.lang.String r0 = "list"
            X.1Vv r0 = r1.A0K(r0)
            java.lang.String r2 = "side_list"
            X.1Vv r20 = r1.A0J(r2)
            X.1Vv[] r0 = r0.A03
            r18 = r0
            if (r0 == 0) goto L_0x05f0
            int r14 = r0.length
        L_0x0183:
            if (r20 == 0) goto L_0x05ec
            r0 = r20
            X.1Vv[] r0 = r0.A03
            if (r0 == 0) goto L_0x05ec
            int r0 = r0.length
            r17 = r0
        L_0x018e:
            int r17 = r17 + r14
            java.util.HashMap r21 = new java.util.HashMap
            r21.<init>()
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            r3 = 0
        L_0x019b:
            r0 = r17
            if (r3 >= r0) goto L_0x063b
            if (r3 >= r14) goto L_0x05e0
            r2 = r18[r3]
            r29 = 0
        L_0x01a5:
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            r0 = r39
            X.0so r0 = r0.A00
            r37 = r0
            java.lang.String r4 = "jid"
            com.whatsapp.jid.Jid r5 = r2.A0F(r0, r1, r4)
            if (r5 != 0) goto L_0x05bc
            X.27a r27 = new X.27a
            r27.<init>()
        L_0x01ba:
            r1 = r22
            r0 = r27
            r1.add(r0)
        L_0x01c1:
            r6 = 0
            java.lang.String r0 = r2.A0N(r4, r6)
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.getNullable(r0)
            r0 = r27
            r0.A0C = r1
            if (r29 == 0) goto L_0x05b8
            java.lang.String r0 = "sidelist"
        L_0x01d3:
            java.util.List r7 = r2.A0O(r0)
            boolean r1 = r7.isEmpty()
            r11 = 0
            java.lang.String r10 = "type"
            r31 = 3
            r30 = 2
            r0 = 1
            r5 = -1
            if (r1 != 0) goto L_0x0252
            r1 = r27
            java.util.List r1 = r1.A0G
            if (r1 != 0) goto L_0x01f6
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1 = r27
            r1.A0G = r4
        L_0x01f6:
            java.util.Iterator r8 = r7.iterator()
        L_0x01fa:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0256
            java.lang.Object r4 = r8.next()
            X.1Vv r4 = (X.C28371Vv) r4
            java.lang.String r7 = r4.A0M(r10)
            int r1 = r7.hashCode()
            switch(r1) {
                case 3365: goto L_0x0225;
                case 110414: goto L_0x022f;
                case 1959784951: goto L_0x0239;
                default: goto L_0x0211;
            }
        L_0x0211:
            java.lang.String r1 = "Invalid contact type="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = r0.toString()
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0225:
            java.lang.String r1 = "in"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0211
            r7 = 1
            goto L_0x0242
        L_0x022f:
            java.lang.String r1 = "out"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0211
            r7 = 2
            goto L_0x0242
        L_0x0239:
            java.lang.String r1 = "invalid"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0211
            r7 = 3
        L_0x0242:
            r1 = r27
            r1.A04 = r7
            java.lang.String r4 = r4.A0L()
            if (r4 == 0) goto L_0x01fa
            java.util.List r1 = r1.A0G
            r1.add(r4)
            goto L_0x01fa
        L_0x0252:
            r1 = r27
            r1.A04 = r0
        L_0x0256:
            java.lang.String r1 = "devices"
            X.1Vv r4 = r2.A0J(r1)
            java.lang.String r8 = "code"
            if (r4 == 0) goto L_0x02a8
            X.1Vv r7 = r2.A0K(r1)
            java.lang.String r4 = "error"
            X.1Vv r1 = r7.A0J(r4)
            if (r1 == 0) goto L_0x042e
            r0 = r27
            r0.A00 = r5
            java.lang.String r0 = "UniSyncProtocolHelper/parseUser/partial error code="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vv r0 = r7.A0J(r4)
            int r0 = r0.A0A(r8, r5)
            r1.append(r0)
            java.lang.String r0 = "; text="
            r1.append(r0)
            X.1Vv r4 = r7.A0J(r4)
            java.lang.String r0 = "text"
            java.lang.String r0 = r4.A0N(r0, r6)
            r1.append(r0)
            java.lang.String r0 = "; jid="
            r1.append(r0)
            r0 = r27
            com.whatsapp.jid.UserJid r0 = r0.A0C
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x02a8:
            java.lang.String r0 = "status"
            X.1Vv r1 = r2.A0J(r0)
            java.lang.String r4 = "t"
            if (r1 == 0) goto L_0x02f4
            X.1Vv r5 = r2.A0K(r0)
            r6 = 1000(0x3e8, double:4.94E-321)
            r0 = 0
            long r0 = r5.A0D(r4, r0)
            long r0 = r0 * r6
            r6 = 0
            java.lang.String r8 = r5.A0N(r8, r6)
            java.lang.String r9 = r5.A0N(r10, r6)
            java.lang.String r7 = r5.A0L()
            if (r9 == 0) goto L_0x040d
            java.lang.String r6 = "fail"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x040d
            java.lang.String r0 = "401"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x040b
            java.lang.String r0 = "403"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x040b
            java.lang.String r0 = "404"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x040b
            r0 = r27
            r0.A03 = r11
        L_0x02f4:
            java.lang.String r0 = "picture"
            X.1Vv r1 = r2.A0J(r0)
            java.lang.String r13 = "id"
            if (r1 == 0) goto L_0x0404
            X.1Vv r5 = r2.A0K(r0)
            r0 = -1
            int r1 = r5.A0A(r13, r0)
            r0 = r27
            r0.A02 = r1
            java.lang.String r1 = "direct_path"
            r0 = 0
            java.lang.String r1 = r5.A0N(r1, r0)
            r0 = r27
            r0.A0D = r1
        L_0x0316:
            java.lang.String r0 = "pay"
            X.1Vv r9 = r2.A0J(r0)
            if (r9 == 0) goto L_0x0501
            X.27h r1 = new X.27h
            r1.<init>()
            r0 = r27
            r0.A0A = r1
            java.lang.String r0 = "merchant_status"
            X.1Vv r6 = r9.A0J(r0)
            java.lang.String r11 = "value"
            java.lang.String r8 = "dhash"
            if (r6 == 0) goto L_0x0352
            r0 = r27
            X.27h r5 = r0.A0A
            java.lang.String r0 = "false"
            java.lang.String r1 = r6.A0N(r11, r0)
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)
            r5.A03 = r0
            r0 = r27
            X.27h r1 = r0.A0A
            r0 = 0
            java.lang.String r0 = r6.A0N(r8, r0)
            r1.A00 = r0
        L_0x0352:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "upi"
            r5.put(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            java.lang.String r0 = "novi"
            r5.put(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            java.lang.String r0 = "fbpay"
            r5.put(r1, r0)
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r28 = r0.iterator()
        L_0x037c:
            boolean r0 = r28.hasNext()
            if (r0 == 0) goto L_0x0501
            java.lang.Object r7 = r28.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r0 = r7.getValue()
            java.lang.String r0 = (java.lang.String) r0
            X.1Vv r6 = r9.A0J(r0)
            if (r6 == 0) goto L_0x037c
            java.lang.String r0 = "consumer_status"
            X.1Vv r1 = r6.A0J(r0)
            if (r1 == 0) goto L_0x03bb
            r0 = r27
            X.27h r10 = r0.A0A
            java.lang.Object r12 = r7.getKey()
            java.lang.String r5 = r1.A0M(r11)
            r0 = 0
            java.lang.String r1 = r1.A0N(r8, r0)
            X.27i r0 = new X.27i
            r0.<init>()
            r0.A01 = r5
            r0.A00 = r1
            java.util.HashMap r1 = r10.A01
            r1.put(r12, r0)
        L_0x03bb:
            java.lang.String r0 = "eligible_offers"
            X.1Vv r0 = r6.A0J(r0)
            if (r0 == 0) goto L_0x037c
            java.lang.String r1 = "offer"
            X.1Vv r1 = r0.A0J(r1)
            if (r1 == 0) goto L_0x03eb
            r5 = r27
            X.27h r6 = r5.A0A
            java.lang.Object r7 = r7.getKey()
            java.lang.String r1 = r1.A0M(r13)
            r5 = 0
            java.lang.String r0 = r0.A0N(r8, r5)
            X.27j r5 = new X.27j
            r5.<init>()
            r5.A01 = r1
            r5.A00 = r0
        L_0x03e5:
            java.util.HashMap r0 = r6.A02
            r0.put(r7, r5)
            goto L_0x037c
        L_0x03eb:
            r1 = r27
            X.27h r6 = r1.A0A
            java.lang.Object r7 = r7.getKey()
            r1 = 0
            java.lang.String r1 = r0.A0N(r8, r1)
            java.lang.String r0 = ""
            X.27j r5 = new X.27j
            r5.<init>()
            r5.A01 = r0
            r5.A00 = r1
            goto L_0x03e5
        L_0x0404:
            r1 = -1
            r0 = r27
            r0.A02 = r1
            goto L_0x0316
        L_0x040b:
            r1 = 2
            goto L_0x041d
        L_0x040d:
            X.1lL[] r5 = r5.A0Q()
            if (r5 == 0) goto L_0x0416
            int r5 = r5.length
            if (r5 != 0) goto L_0x0423
        L_0x0416:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 == 0) goto L_0x0423
            r1 = 3
        L_0x041d:
            r0 = r27
            r0.A03 = r1
            goto L_0x02f4
        L_0x0423:
            r6 = 1
            r5 = r27
            r5.A03 = r6
            r5.A08 = r0
            r5.A0F = r7
            goto L_0x02f4
        L_0x042e:
            r1 = r27
            r1.A00 = r0
            java.lang.String r6 = "device"
            r0 = 0
            java.lang.String r4 = "unisyncprotocolhelper/parseDeviceData v2 user="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r4 = r27
            com.whatsapp.jid.UserJid r4 = r4.A0C
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            java.lang.String r4 = "device-list"
            X.1Vv r5 = r7.A0J(r4)
            if (r5 == 0) goto L_0x04a8
            X.1Vv r4 = r7.A0J(r4)
            java.util.List r6 = r4.A0O(r6)
            boolean r4 = r6.isEmpty()
            if (r4 != 0) goto L_0x04a8
            r4 = r27
            java.util.Map r4 = r4.A0H
            if (r4 != 0) goto L_0x0471
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r4 = r27
            r4.A0H = r5
        L_0x0471:
            java.util.Iterator r28 = r6.iterator()
        L_0x0475:
            boolean r4 = r28.hasNext()
            if (r4 == 0) goto L_0x04a8
            java.lang.Object r9 = r28.next()
            X.1Vv r9 = (X.C28371Vv) r9
            java.lang.String r5 = "id"
            java.lang.String r4 = r9.A0M(r5)
            int r5 = r9.A0B(r4, r5)
            r4 = r27
            com.whatsapp.jid.UserJid r4 = r4.A0C     // Catch:{ 1W4 -> 0x061d }
            X.AnonymousClass00B.A06(r4)     // Catch:{ 1W4 -> 0x061d }
            com.whatsapp.jid.DeviceJid r6 = com.whatsapp.jid.DeviceJid.getFromUserJidAndDeviceId(r4, r5)     // Catch:{ 1W4 -> 0x061d }
            r4 = r27
            java.util.Map r5 = r4.A0H
            java.lang.String r4 = "key-index"
            long r12 = r9.A0D(r4, r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r5.put(r6, r4)
            goto L_0x0475
        L_0x04a8:
            java.lang.String r6 = "key-index-list"
            X.1Vv r4 = r7.A0J(r6)
            if (r4 == 0) goto L_0x02a8
            X.1Vv r9 = r7.A0J(r6)
            java.lang.String r5 = "ts"
            java.lang.String r4 = r9.A0M(r5)
            long r4 = r9.A0E(r4, r5)
            r9 = r27
            r9.A06 = r4
            X.1Vv r5 = r7.A0J(r6)
            java.lang.String r4 = "expected_ts"
            long r0 = r5.A0D(r4, r0)
            r9.A05 = r0
            X.1Vv r0 = r7.A0J(r6)
            byte[] r1 = r0.A01
            r9.A0J = r1
            java.lang.String r0 = "unisyncprotocolhelper/parseDeviceData v2 index list="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            com.whatsapp.jid.UserJid r0 = r9.A0C
            r4.append(r0)
            java.lang.String r0 = "; ts="
            r4.append(r0)
            long r0 = r9.A06
            r4.append(r0)
            java.lang.String r0 = "; expectedTs="
            r4.append(r0)
            long r0 = r9.A05
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x02a8
        L_0x0501:
            java.lang.String r0 = "disappearing_mode"
            X.1Vv r5 = r2.A0J(r0)
            if (r5 == 0) goto L_0x0520
            java.lang.String r1 = "duration"
            r0 = -1
            int r1 = r5.A0A(r1, r0)
            r0 = r27
            r0.A01 = r1
            java.lang.String r0 = r5.A0M(r4)
            long r0 = r5.A0E(r0, r4)
            r4 = r27
            r4.A07 = r0
        L_0x0520:
            r1 = r27
            r0 = r29
            r1.A0I = r0
            r0 = r16
            java.lang.String r1 = r0.A03
            r0 = r27
            r0.A0E = r1
            com.whatsapp.jid.UserJid r0 = r0.A0C
            if (r0 == 0) goto L_0x0591
            r0 = r24
            X.1Vv r1 = r2.A0J(r0)
            if (r19 == 0) goto L_0x0591
            r0 = r19
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0591
            if (r1 == 0) goto L_0x0591
            r0 = r27
            com.whatsapp.jid.UserJid r0 = r0.A0C
            X.27l r8 = new X.27l
            r8.<init>()
            r8.A01 = r0
            r8.A02 = r1
            java.lang.String r0 = "verified_name"
            X.1Vv r7 = r1.A0J(r0)
            if (r7 == 0) goto L_0x05b4
            X.27n r6 = new X.27n
            r6.<init>()
            byte[] r0 = r7.A01
            r6.A02 = r0
            java.lang.String r0 = "verified_level"
            r5 = 0
            java.lang.String r0 = r7.A0N(r0, r5)
            X.AnonymousClass00B.A06(r0)
            int r0 = X.C53782gH.A00(r0)
            r6.A00 = r0
            java.lang.String r0 = "host_storage"
            java.lang.String r4 = r7.A0N(r0, r5)
            java.lang.String r0 = "actual_actors"
            java.lang.String r1 = r7.A0N(r0, r5)
            java.lang.String r0 = "privacy_mode_ts"
            java.lang.String r5 = r7.A0N(r0, r5)
            X.1ta r0 = new X.1ta
            r0.<init>((java.lang.String) r4, (java.lang.String) r1, (java.lang.String) r5)
            r6.A01 = r0
            r8.A00 = r6
        L_0x058d:
            r0 = r27
            r0.A09 = r8
        L_0x0591:
            if (r15 == 0) goto L_0x05b0
            boolean r0 = r15.A03
            if (r0 == 0) goto L_0x05b0
            r0 = r23
            X.1Vv r4 = r2.A0J(r0)
            if (r4 == 0) goto L_0x05b0
            java.lang.Class<X.1ZX> r2 = X.AnonymousClass1ZX.class
            java.lang.String r1 = "val"
            r0 = r37
            com.whatsapp.jid.Jid r1 = r4.A0F(r0, r2, r1)
            X.1ZX r1 = (X.AnonymousClass1ZX) r1
            r0 = r27
            r0.A0B = r1
        L_0x05b0:
            int r3 = r3 + 1
            goto L_0x019b
        L_0x05b4:
            r0 = 0
            r8.A00 = r0
            goto L_0x058d
        L_0x05b8:
            java.lang.String r0 = "contact"
            goto L_0x01d3
        L_0x05bc:
            r0 = r21
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x05d2
            r0 = r21
            java.lang.Object r27 = r0.get(r5)
            r0 = r27
            X.27a r0 = (X.C450927a) r0
            r27 = r0
            goto L_0x01c1
        L_0x05d2:
            X.27a r27 = new X.27a
            r27.<init>()
            r1 = r21
            r0 = r27
            r1.put(r5, r0)
            goto L_0x01ba
        L_0x05e0:
            r0 = r20
            X.1Vv[] r0 = r0.A03
            int r1 = r3 - r14
            r2 = r0[r1]
            r29 = 1
            goto L_0x01a5
        L_0x05ec:
            r17 = 0
            goto L_0x018e
        L_0x05f0:
            r14 = 0
            goto L_0x0183
        L_0x05f3:
            r36 = r15
            goto L_0x015b
        L_0x05f7:
            java.lang.String r3 = "pay"
            X.1Vv r2 = r0.A0K(r3)
            X.27g r35 = A00(r2, r3)
            goto L_0x014b
        L_0x0603:
            r34 = r15
            goto L_0x0124
        L_0x0607:
            r19 = r15
            goto L_0x0114
        L_0x060b:
            r33 = r15
            goto L_0x0102
        L_0x060f:
            r32 = r15
            goto L_0x00f2
        L_0x0613:
            r25 = r15
            goto L_0x00e1
        L_0x0617:
            r38 = r15
            r26 = r15
            goto L_0x008d
        L_0x061d:
            java.lang.String r0 = "Invalid device id jid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r27
            r1.append(r0)
            java.lang.String r0 = "; id="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x063b:
            r0 = 0
            X.27a[] r1 = new X.C450927a[r0]
            r0 = r22
            java.lang.Object[] r1 = r0.toArray(r1)
            X.27a[] r1 = (X.C450927a[]) r1
            X.27e r0 = new X.27e
            r28 = r0
            r29 = r26
            r30 = r25
            r31 = r19
            r37 = r15
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            X.27c r3 = new X.27c
            r3.<init>(r0, r1)
            java.lang.String r0 = "UniSyncProtocolHelper/handleSyncResult sid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r16
            java.lang.String r2 = r0.A04
            r1.append(r2)
            java.lang.String r0 = " querySync="
            r1.append(r0)
            r0 = r16
            boolean r0 = r0.A05
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r39
            X.281 r1 = r0.A01
            r0 = 0
            r1.AHQ(r3, r2, r0)
        L_0x0683:
            r0 = r16
            X.1kE r1 = r0.A02
            r0 = 0
            r1.A02(r0)
            return
        L_0x068c:
            java.lang.String r0 = "UniSyncProtocolHelper/onSuccess missing request"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass283.AYG(X.1Vv, java.lang.String):void");
    }
}
