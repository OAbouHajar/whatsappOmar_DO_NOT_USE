package X;

import android.util.Pair;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.3Gi  reason: invalid class name and case insensitive filesystem */
public final class C63153Gi implements C19550yc {
    public final C16300so A00;
    public final C16040sK A01;
    public final C16440t3 A02;
    public final C14710pd A03;
    public final C17240ul A04;
    public final AnonymousClass2NY A05;
    public final AnonymousClass4OC A06;
    public final C17190ug A07;
    public final String A08;

    public C63153Gi(C16300so r2, C16040sK r3, C16440t3 r4, C14710pd r5, C17240ul r6, AnonymousClass2NY r7, AnonymousClass4OC r8, C17190ug r9) {
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A07 = r9;
        this.A04 = r6;
        this.A05 = r7;
        this.A08 = r8.A02.getRawString();
        this.A06 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r5.A03.A0E(X.C16620tM.A02, 1173) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        r16 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        r0 = (((X.C13680ns.A07(r9) + (r19 ? 1 : 0)) + r18) + r17) + r16;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (r0 == 0) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        r7 = new X.C28371Vv[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r9 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r9.size() <= 0) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r13 = 0;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r13 >= r9.size()) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        r6 = new X.C35081lL[r1];
        r6[0] = new X.C35081lL((com.whatsapp.jid.Jid) r9.get(r13), "jid");
        r7[r15] = new X.C28371Vv("participant", r6);
        r13 = r13 + 1;
        r15 = r15 + 1;
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r19 == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r6 = new X.C35081lL[r1];
        r6[0] = new X.C35081lL("expiration", java.lang.String.valueOf(r2));
        r7[r15] = new X.C28371Vv("ephemeral", r6);
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        if (r18 == 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        r7[r15] = new X.C28371Vv("linked_parent", new X.C35081lL[]{new X.C35081lL((com.whatsapp.jid.Jid) r12, "jid")});
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d2, code lost:
        if (r17 == 0) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00de, code lost:
        if (r5.A03.A0E(X.C16620tM.A02, 2447) == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e0, code lost:
        r6 = new X.C35081lL[]{new X.C35081lL("default_membership_approval_mode", "request_required")};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ef, code lost:
        r7[r15] = new X.C28371Vv("parent", r6);
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fb, code lost:
        if (r16 == 0) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fd, code lost:
        r0 = X.C224718b.A01(r5.A01, r5.A02, false);
        X.AnonymousClass00B.A06(r0);
        r6 = new X.C35081lL[1];
        X.C35081lL.A02("id", X.C004101u.A04(r0), r6, 0);
        r7[r15] = new X.C28371Vv(new X.C28371Vv("body", r10, (X.C35081lL[]) null), com.mod2.fblibs.FacebookFacade.RequestParameter.DESCRIPTION, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0126, code lost:
        if (r17 == 0) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0128, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012d, code lost:
        if (r9.isEmpty() == false) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r5.A03.A0E(X.C16620tM.A02, 1173) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012f, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0130, code lost:
        X.AnonymousClass00B.A0B("CreateGroupApiHandler/getNodeChildren request cannot have both <parent/> and <participant/> tags.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0135, code lost:
        r10 = r5.A08;
        r6 = android.text.TextUtils.isEmpty(r10);
        r1 = new X.C35081lL[((r6 ^ true ? 1 : 0) + true)];
        r2 = X.C35081lL.A03("subject", r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0149, code lost:
        if (r6 != false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014b, code lost:
        X.C35081lL.A02("key", r10, r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0154, code lost:
        if (r7 != null) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0156, code lost:
        r8 = new X.C28371Vv("create", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0159, code lost:
        r6 = new X.C35081lL[4];
        X.C35081lL.A02("xmlns", "w:g2", r6, r2 ? 1 : 0);
        X.C35081lL.A02("id", r3, r6, 1);
        X.C35081lL.A02("type", "set", r6, 2);
        r4.A0G(r5, X.C28371Vv.A03(X.C34961l9.A00, r8, r6, 3), r3, 14, 20000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0183, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0184, code lost:
        r8 = new X.C28371Vv("create", r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0188, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (r5.A03.A0E(X.C16620tM.A02, 1173) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if (r11 != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r20 = this;
            r5 = r20
            X.0ug r4 = r5.A07
            java.lang.String r3 = r4.A02()
            X.4OC r0 = r5.A06
            java.lang.String r8 = r0.A04
            java.util.List r9 = r0.A05
            int r2 = r0.A00
            boolean r11 = r0.A06
            com.whatsapp.jid.GroupJid r12 = r0.A01
            java.lang.String r10 = r0.A03
            r1 = 1
            boolean r19 = X.AnonymousClass000.A1Q(r2)
            if (r12 == 0) goto L_0x002b
            X.0pd r7 = r5.A03
            r6 = 1173(0x495, float:1.644E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r7.A0E(r0, r6)
            r18 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002b:
            r18 = 0
        L_0x002d:
            if (r11 == 0) goto L_0x003d
            X.0pd r7 = r5.A03
            r6 = 1173(0x495, float:1.644E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r7.A0E(r0, r6)
            r17 = 1
            if (r0 != 0) goto L_0x0041
        L_0x003d:
            r17 = 0
            if (r11 == 0) goto L_0x0055
        L_0x0041:
            X.0pd r7 = r5.A03
            r6 = 1173(0x495, float:1.644E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r7.A0E(r0, r6)
            if (r0 == 0) goto L_0x0055
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r16 = 1
            if (r0 == 0) goto L_0x0057
        L_0x0055:
            r16 = 0
        L_0x0057:
            int r0 = X.C13680ns.A07(r9)
            int r0 = r0 + r19
            int r0 = r0 + r18
            int r0 = r0 + r17
            int r0 = r0 + r16
            r7 = 0
            if (r0 == 0) goto L_0x0135
            X.1Vv[] r7 = new X.C28371Vv[r0]
            java.lang.String r11 = "jid"
            if (r9 == 0) goto L_0x009a
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x009a
            r13 = 0
            r15 = 0
        L_0x0074:
            int r0 = r9.size()
            if (r13 >= r0) goto L_0x009b
            java.lang.Object r0 = r9.get(r13)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            int r14 = r15 + 1
            X.1lL[] r6 = new X.C35081lL[r1]
            X.1lL r1 = new X.1lL
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r11)
            r0 = 0
            r6[r0] = r1
            java.lang.String r1 = "participant"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r6)
            r7[r15] = r0
            int r13 = r13 + 1
            r15 = r14
            r1 = 1
            goto L_0x0074
        L_0x009a:
            r15 = 0
        L_0x009b:
            if (r19 == 0) goto L_0x00b9
            int r13 = r15 + 1
            X.1lL[] r6 = new X.C35081lL[r1]
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "expiration"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r0, (java.lang.String) r2)
            r0 = 0
            r6[r0] = r1
            java.lang.String r1 = "ephemeral"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r6)
            r7[r15] = r0
            r15 = r13
        L_0x00b9:
            if (r18 == 0) goto L_0x00d2
            int r6 = r15 + 1
            r0 = 1
            X.1lL[] r2 = new X.C35081lL[r0]
            X.1lL r1 = new X.1lL
            r1.<init>((com.whatsapp.jid.Jid) r12, (java.lang.String) r11)
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "linked_parent"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r2)
            r7[r15] = r0
            r15 = r6
        L_0x00d2:
            if (r17 == 0) goto L_0x00fb
            X.0pd r2 = r5.A03
            r1 = 2447(0x98f, float:3.429E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0188
            r0 = 1
            X.1lL[] r6 = new X.C35081lL[r0]
            java.lang.String r2 = "default_membership_approval_mode"
            java.lang.String r0 = "request_required"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 0
            r6[r0] = r1
        L_0x00ef:
            int r2 = r15 + 1
            java.lang.String r1 = "parent"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r6)
            r7[r15] = r0
            r15 = r2
        L_0x00fb:
            if (r16 == 0) goto L_0x0126
            X.0t3 r1 = r5.A02
            X.0sK r0 = r5.A01
            r2 = 0
            byte[] r0 = X.C224718b.A01(r0, r1, r2)
            X.AnonymousClass00B.A06(r0)
            java.lang.String r1 = X.C004101u.A04(r0)
            r0 = 1
            X.1lL[] r6 = new X.C35081lL[r0]
            java.lang.String r0 = "id"
            X.C35081lL.A02(r0, r1, r6, r2)
            java.lang.String r1 = "body"
            r0 = 0
            X.1Vv r2 = new X.1Vv
            r2.<init>((java.lang.String) r1, (java.lang.String) r10, (X.C35081lL[]) r0)
            java.lang.String r1 = "description"
            X.1Vv r0 = new X.1Vv
            r0.<init>((X.C28371Vv) r2, (java.lang.String) r1, (X.C35081lL[]) r6)
            r7[r15] = r0
        L_0x0126:
            if (r17 == 0) goto L_0x012f
            boolean r0 = r9.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0130
        L_0x012f:
            r1 = 1
        L_0x0130:
            java.lang.String r0 = "CreateGroupApiHandler/getNodeChildren request cannot have both <parent/> and <participant/> tags."
            X.AnonymousClass00B.A0B(r0, r1)
        L_0x0135:
            java.lang.String r10 = r5.A08
            boolean r6 = android.text.TextUtils.isEmpty(r10)
            r0 = r6 ^ 1
            r9 = 1
            int r0 = r0 + 1
            X.1lL[] r1 = new X.C35081lL[r0]
            java.lang.String r0 = "subject"
            boolean r2 = X.C35081lL.A03(r0, r8, r1)
            if (r6 != 0) goto L_0x0150
            java.lang.String r0 = "key"
            X.C35081lL.A02(r0, r10, r1, r9)
        L_0x0150:
            java.lang.String r0 = "create"
            X.1Vv r8 = new X.1Vv
            if (r7 != 0) goto L_0x0184
            r8.<init>(r0, r1)
        L_0x0159:
            r0 = 4
            X.1lL[] r6 = new X.C35081lL[r0]
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:g2"
            X.C35081lL.A02(r1, r0, r6, r2)
            java.lang.String r0 = "id"
            X.C35081lL.A02(r0, r3, r6, r9)
            r2 = 2
            java.lang.String r1 = "type"
            java.lang.String r0 = "set"
            X.C35081lL.A02(r1, r0, r6, r2)
            r1 = 3
            X.1l9 r0 = X.C34961l9.A00
            X.1Vv r6 = X.C28371Vv.A03(r0, r8, r6, r1)
            r8 = 14
            r9 = 20000(0x4e20, double:9.8813E-320)
            r7 = r3
            r4.A0G(r5, r6, r7, r8, r9)
            return
        L_0x0184:
            r8.<init>((java.lang.String) r0, (X.C35081lL[]) r1, (X.C28371Vv[]) r7)
            goto L_0x0159
        L_0x0188:
            r6 = 0
            goto L_0x00ef
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63153Gi.A00():void");
    }

    public void APb(String str) {
        this.A05.AYu();
    }

    public void AQe(C28371Vv r4, String str) {
        Pair A012 = C34451kH.A01(r4);
        if (A012 != null) {
            int A0D = AnonymousClass000.A0D(A012.first);
            String str2 = (String) A012.second;
            if (A0D == 500 && str2 != null && str2.equals("internal-server-error")) {
                A0D = -500;
            }
            this.A05.AQR(A0D);
        }
    }

    public void AYG(C28371Vv r19, String str) {
        C28371Vv r15 = r19;
        C28371Vv A0H = r15.A0H();
        C28371Vv.A06(A0H, "group");
        try {
            String A0N = A0H.A0N("id", (String) null);
            AnonymousClass00B.A06(A0N);
            C16050sL A012 = C16030sJ.A01(A0N);
            Class<UserJid> cls = UserJid.class;
            C16300so r13 = this.A00;
            Jid A0F = A0H.A0F(r13, cls, "creator");
            String A0N2 = A0H.A0N("subject", (String) null);
            Jid A0F2 = A0H.A0F(r13, cls, "s_o");
            String A0N3 = A0H.A0N("type", (String) null);
            AnonymousClass4MJ r6 = new AnonymousClass4MJ(A012);
            AnonymousClass3BT.A00(r13, r6, r15, "group");
            StringBuilder A0r = AnonymousClass000.A0r("groupmgr/onGroupCreated/");
            A0r.append(A012);
            A0r.append("/");
            A0r.append(A0F);
            A0r.append("/");
            A0r.append(C29501aj.A01(A0H.A0N("creation", (String) null), 0) * 1000);
            A0r.append("/");
            C13690nt.A1M(A0F2, A0N2, "/", A0r);
            A0r.append("/");
            A0r.append(C29501aj.A01(A0H.A0N("s_t", (String) null), 0) * 1000);
            A0r.append("/");
            A0r.append(A0N3);
            A0r.append("/");
            A0r.append(r6.A03.keySet());
            C13680ns.A1V(A0r);
            Map map = r6.A01;
            if (!map.isEmpty()) {
                C17240ul.A01(3001, map);
            }
            this.A05.AYI(r6, A012);
        } catch (AnonymousClass1W4 unused) {
            this.A05.AQR(800);
        }
    }
}
