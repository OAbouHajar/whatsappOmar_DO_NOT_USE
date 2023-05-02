package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;

/* renamed from: X.1HB  reason: invalid class name */
public class AnonymousClass1HB {
    public final C16040sK A00;
    public final C16460t6 A01;
    public final AnonymousClass173 A02;
    public final C14710pd A03;
    public final C18300wT A04;
    public final AnonymousClass174 A05;
    public final C18290wS A06;
    public final C28361Vu A07;
    public final C46842Gl A08;

    public AnonymousClass1HB(C16300so r4, C16040sK r5, C16460t6 r6, AnonymousClass173 r7, C14710pd r8, C18300wT r9, AnonymousClass174 r10, C18290wS r11) {
        this.A03 = r8;
        this.A00 = r5;
        this.A06 = r11;
        this.A01 = r6;
        this.A04 = r9;
        this.A02 = r7;
        this.A05 = r10;
        C46822Gj r2 = new C46822Gj();
        this.A07 = new C28361Vu((C16300so) null, r2, (C46832Gk) null);
        this.A08 = new C46842Gl(r4, r8, r2, (C46852Gm) null);
    }

    public AnonymousClass1Vt A00(UserJid userJid, UserJid userJid2, C28371Vv r23, long j2) {
        long j3 = j2;
        C28371Vv r6 = r23;
        String A0N = r6.A0N("country", this.A05.A01().A03);
        C228919r r2 = null;
        int A002 = C29501aj.A00(r6.A0N("version", (String) null), 1);
        String A0N2 = r6.A0N("request-id", (String) null);
        AnonymousClass00B.A06(A0N2);
        String A0N3 = r6.A0N("expiry-ts", (String) null);
        AnonymousClass00B.A06(A0N3);
        UserJid nullable = UserJid.getNullable(r6.A0N("sender", (String) null));
        if (nullable == null) {
            nullable = userJid;
        }
        AnonymousClass00B.A06(A0N);
        String str = ((C35491m1) C35481m0.A06).A04;
        C28391Vx A022 = this.A06.A02(A0N);
        if (A022 != null) {
            r2 = A022.AEp(str);
        }
        AnonymousClass00B.A06(r2);
        C28411Vz A012 = this.A02.A01(str);
        AnonymousClass00B.A06(nullable);
        AnonymousClass1Vt A013 = AnonymousClass1W1.A01(A012, new C28401Vy(new BigDecimal(0), 1), nullable, userJid2, str, A0N2, A0N, 20, 12, A002, r2.AG1(), 0, j3);
        AnonymousClass1W2 AI7 = r2.AI7();
        if (AI7 != null) {
            A013.A03(AI7, C29501aj.A01(A0N3, j2 / 1000) * 1000);
        }
        return A013;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0083, code lost:
        r0 = r0.AEp(r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1Vt A01(com.whatsapp.jid.UserJid r19, X.C28371Vv r20, long r21) {
        /*
            r18 = this;
            java.lang.String r0 = "version"
            r9 = 0
            r1 = r20
            java.lang.String r2 = r1.A0N(r0, r9)
            r0 = 1
            int r13 = X.C29501aj.A00(r2, r0)
            java.lang.String r0 = "sync-status"
            java.lang.String r2 = r1.A0N(r0, r9)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = "PARTIAL"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x00ec
            r6 = 1
            X.1Vz r0 = X.C35481m0.A06
            X.1m1 r0 = (X.C35491m1) r0
            java.lang.String r8 = r0.A04
            X.1cm r0 = X.C30681cm.A0E
        L_0x002d:
            java.lang.String r2 = r0.A03
            java.lang.String r0 = "country"
            java.lang.String r10 = r1.A0N(r0, r2)
            java.lang.String r0 = "amount"
            java.lang.String r2 = r1.A0N(r0, r9)
            java.lang.String r0 = "receiver"
            java.lang.String r0 = r1.A0N(r0, r9)
            com.whatsapp.jid.UserJid r7 = com.whatsapp.jid.UserJid.getNullable(r0)
            r3 = r18
            if (r7 != 0) goto L_0x00e7
            X.0sK r4 = r3.A00
            boolean r0 = r4.A0G()
            if (r0 == 0) goto L_0x00e7
            r4.A0B()
            X.1ZT r7 = r4.A05
        L_0x0056:
            java.lang.String r4 = "UNSET"
            boolean r0 = r4.equals(r10)
            if (r0 == 0) goto L_0x007b
            X.0wS r0 = r3.A06
            r5 = r8
            X.1GR r0 = r0.A01
            if (r0 == 0) goto L_0x007a
            if (r8 == 0) goto L_0x006d
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = r8.toUpperCase(r0)
        L_0x006d:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x007a
            int r0 = r5.hashCode()
            switch(r0) {
                case 66044: goto L_0x00c6;
                case 72653: goto L_0x00d1;
                case 82032: goto L_0x00dc;
                default: goto L_0x007a;
            }
        L_0x007a:
            r10 = r4
        L_0x007b:
            X.0wS r0 = r3.A06
            X.1Vx r0 = r0.A02(r10)
            if (r0 == 0) goto L_0x00c4
            X.19r r0 = r0.AEp(r8)
            if (r0 == 0) goto L_0x00c4
            int r14 = r0.AG1()
        L_0x008d:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00f7
            X.173 r0 = r3.A02
            X.1Vz r4 = r0.A01(r8)
            if (r6 == 0) goto L_0x00b9
            r5 = r9
            r11 = 1000(0x3e8, float:1.401E-42)
        L_0x009e:
            r12 = 0
            r15 = 0
            r6 = r19
            r16 = r21
            X.1Vt r2 = X.AnonymousClass1W1.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = "transaction-id"
            java.lang.String r1 = r1.A0N(r0, r9)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00b8
            r2.A06(r1)
        L_0x00b8:
            return r2
        L_0x00b9:
            r0 = r4
            X.1m1 r0 = (X.C35491m1) r0
            int r0 = r0.A01
            X.1Vy r5 = X.C28401Vy.A00(r2, r0)
            r11 = 3
            goto L_0x009e
        L_0x00c4:
            r14 = 0
            goto L_0x008d
        L_0x00c6:
            java.lang.String r0 = "BRL"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x007a
            java.lang.String r4 = "BR"
            goto L_0x007a
        L_0x00d1:
            java.lang.String r0 = "INR"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x007a
            java.lang.String r4 = "IN"
            goto L_0x007a
        L_0x00dc:
            java.lang.String r0 = "SGD"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x007a
            java.lang.String r4 = "SG"
            goto L_0x007a
        L_0x00e7:
            X.AnonymousClass00B.A06(r7)
            goto L_0x0056
        L_0x00ec:
            r6 = 0
            java.lang.String r0 = "currency"
            java.lang.String r8 = r1.A0N(r0, r9)
            X.1cm r0 = X.C30681cm.A0F
            goto L_0x002d
        L_0x00f7:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HB.A01(com.whatsapp.jid.UserJid, X.1Vv, long):X.1Vt");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[ExcHandler: JSONException (unused org.json.JSONException), SYNTHETIC, Splitter:B:433:0x0850] */
    public X.AnonymousClass1Vt A02(X.AnonymousClass1W5 r71, X.C28371Vv r72) {
        /*
            r70 = this;
            r3 = 0
            java.lang.String r0 = "sender"
            r1 = 0
            r2 = r72
            java.lang.String r0 = r2.A0N(r0, r1)
            com.whatsapp.jid.UserJid r32 = com.whatsapp.jid.UserJid.getNullable(r0)
            java.lang.String r0 = "receiver"
            java.lang.String r0 = r2.A0N(r0, r1)
            com.whatsapp.jid.UserJid r47 = com.whatsapp.jid.UserJid.getNullable(r0)
            java.lang.String r1 = "transaction-type"
            java.lang.String r0 = "p2p"
            java.lang.String r8 = r2.A0N(r1, r0)
            int r40 = r8.hashCode()
            r30 = 0
            r69 = r70
            switch(r40) {
                case -1703305877: goto L_0x08c1;
                case -1629586251: goto L_0x08c4;
                case -934813832: goto L_0x08c8;
                case 1554454174: goto L_0x08cb;
                default: goto L_0x002e;
            }
        L_0x002e:
            r0 = r69
            X.0sK r1 = r0.A00
            r0 = r32
            boolean r0 = r1.A0I(r0)
            if (r0 != 0) goto L_0x003c
            if (r47 != 0) goto L_0x003e
        L_0x003c:
            r30 = 1
        L_0x003e:
            java.lang.String r0 = "IN"
            java.lang.String r7 = "country"
            java.lang.String r5 = r2.A0N(r7, r0)
            java.lang.String r6 = "version"
            r9 = 0
            java.lang.String r1 = r2.A0N(r6, r9)
            r0 = 1
            int r0 = X.C29501aj.A00(r1, r0)
            boolean r0 = X.AnonymousClass1W1.A0A(r5, r0)
            if (r0 != 0) goto L_0x0062
            r3 = -1
            r0 = r69
            X.1Vt r1 = r0.A03(r2, r3)
        L_0x0061:
            return r1
        L_0x0062:
            java.lang.String r0 = "message-id"
            java.lang.String r35 = r2.A0N(r0, r9)
            java.lang.String r0 = "group"
            java.lang.String r0 = r2.A0N(r0, r9)
            com.whatsapp.jid.GroupJid r34 = com.whatsapp.jid.GroupJid.getNullable(r0)
            java.lang.String r26 = "id"
            r0 = r26
            java.lang.String r33 = r2.A0N(r0, r9)
            java.lang.String r0 = "status"
            java.lang.String r0 = r2.A0N(r0, r9)
            java.lang.String r1 = "ts"
            java.lang.String r1 = r2.A0N(r1, r9)
            long r18 = X.C29501aj.A01(r1, r3)
            r10 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 * r10
            java.lang.String r1 = "credential-id"
            java.lang.String r31 = r2.A0N(r1, r9)
            java.lang.String r1 = "error-code"
            java.lang.String r29 = r2.A0N(r1, r9)
            java.lang.String r1 = "bank-transaction-id"
            java.lang.String r28 = r2.A0N(r1, r9)
            java.lang.String r1 = "expiry-ts"
            java.lang.String r1 = r2.A0N(r1, r9)
            long r20 = X.C29501aj.A01(r1, r3)
            long r20 = r20 * r10
            java.lang.String r1 = "created-ts"
            java.lang.String r1 = r2.A0N(r1, r9)
            long r16 = X.C29501aj.A01(r1, r3)
            long r16 = r16 * r10
            java.lang.String r1 = "counter"
            java.lang.String r5 = r2.A0N(r1, r9)
            r1 = 0
            int r25 = X.C29501aj.A00(r5, r1)
            java.lang.String r1 = "sender-alias"
            java.lang.String r24 = r2.A0N(r1, r9)
            java.lang.String r1 = "receiver-alias"
            java.lang.String r23 = r2.A0N(r1, r9)
            java.lang.String r1 = "note"
            java.lang.String r22 = r2.A0N(r1, r9)
            java.lang.String r1 = "payment_initiator"
            java.lang.String r10 = r2.A0N(r1, r9)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00ec
            java.lang.String r1 = "p2m"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x00ee
        L_0x00ec:
            java.lang.String r10 = "na"
        L_0x00ee:
            java.lang.String r1 = "mandate"
            X.1Vv r1 = r2.A0J(r1)
            r9 = 0
            if (r1 == 0) goto L_0x0118
            r9 = 1
            r1 = r69
            X.0wT r12 = r1.A04
            android.content.SharedPreferences r11 = r12.A01()
            java.lang.String r5 = "payment_has_received_upi_mandate_request"
            r1 = 0
            boolean r1 = r11.getBoolean(r5, r1)
            if (r1 != 0) goto L_0x0118
            android.content.SharedPreferences r1 = r12.A01()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r5, r9)
            r1.apply()
        L_0x0118:
            r1 = r69
            X.174 r1 = r1.A05
            X.1cm r1 = r1.A01()
            r5 = 0
            java.lang.String r14 = r2.A0N(r7, r5)
            if (r14 != 0) goto L_0x012d
            if (r1 != 0) goto L_0x012b
            X.1cm r1 = X.C30681cm.A0F
        L_0x012b:
            java.lang.String r14 = r1.A03
        L_0x012d:
            java.lang.String r6 = r2.A0N(r6, r5)
            r1 = 1
            int r53 = X.C29501aj.A00(r6, r1)
            java.lang.String r1 = "onboarding-provider-id"
            java.lang.String r36 = r2.A0N(r1, r5)
            java.lang.String r1 = "onboarding-provider-name"
            r7 = 0
            r2.A0N(r1, r5)
            java.lang.String r1 = "is_vpa"
            java.lang.String r6 = r2.A0N(r1, r5)
            r1 = 0
            int r6 = X.C29501aj.A00(r6, r1)
            r27 = 1
            r1 = 1
            if (r6 == r1) goto L_0x0162
            java.lang.String r1 = "is-vpa"
            java.lang.String r6 = r2.A0N(r1, r5)
            r1 = 0
            int r6 = X.C29501aj.A00(r6, r1)
            r1 = 1
            if (r6 == r1) goto L_0x0162
            r27 = 0
        L_0x0162:
            java.lang.String r1 = "sync-status"
            java.lang.String r5 = r2.A0N(r1, r5)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0178
            java.lang.String r1 = "PARTIAL"
            boolean r1 = r1.equalsIgnoreCase(r5)
            r15 = 1
            if (r1 != 0) goto L_0x0179
        L_0x0178:
            r15 = 0
        L_0x0179:
            X.1Vz r11 = X.C35481m0.A06
            r12 = r11
            X.1lv r37 = new X.1lv
            r5 = 1
            r1 = r37
            r1.<init>(r11, r5, r3)
            if (r15 != 0) goto L_0x01b2
            java.lang.String r6 = "amount"
            X.1Vv r13 = r2.A0J(r6)
            java.lang.String r5 = "currency"
            java.lang.String r1 = "PAY: PaymentsProtoParser :: extractAmountFromNode"
            if (r13 != 0) goto L_0x0714
            java.lang.String r5 = r2.A0N(r5, r7)
            java.lang.String r13 = r2.A0N(r6, r7)
            if (r5 != 0) goto L_0x06f6
            if (r13 != 0) goto L_0x06f6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " :: amount node is null"
        L_0x01a8:
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x01b2:
            r1 = r37
            X.1Vz r1 = r1.A01
            X.1m1 r1 = (X.C35491m1) r1
            java.lang.String r3 = r1.A04
            r1 = r69
            X.173 r1 = r1.A02
            r68 = r1
            X.1Vz r44 = r1.A01(r3)
            X.1m1 r12 = (X.C35491m1) r12
            java.lang.String r1 = r12.A04
            boolean r43 = r3.equals(r1)
            r1 = 0
            if (r43 != 0) goto L_0x06f3
            r4 = r37
            X.1Vy r6 = r4.A02
            java.math.BigDecimal r4 = r6.A00
            double r38 = r4.doubleValue()
            r11 = 0
            int r4 = (r38 > r11 ? 1 : (r38 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x06f3
        L_0x01df:
            if (r15 != 0) goto L_0x01ea
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            r4 = r4 ^ 1
            X.AnonymousClass00B.A0G(r4)
        L_0x01ea:
            java.lang.String r4 = "service"
            java.lang.String r5 = r2.A0N(r4, r7)
            java.lang.String r11 = "P2M_LITE"
            boolean r12 = r11.equals(r5)
            r5 = r69
            X.0wS r5 = r5.A06
            if (r12 == 0) goto L_0x06e7
            X.19r r42 = r5.A04(r11)
        L_0x0201:
            if (r42 == 0) goto L_0x0959
            int r5 = r10.hashCode()
            r1 = -906014849(0xffffffffc9ff4f7f, float:-2091503.9)
            if (r5 == r1) goto L_0x06dc
            r1 = 3507(0xdb3, float:4.914E-42)
            if (r5 == r1) goto L_0x021f
            r1 = 94110131(0x59c01b3, float:1.4670794E-35)
            if (r5 != r1) goto L_0x021f
            java.lang.String r1 = "buyer"
            boolean r1 = r10.equals(r1)
            r55 = 1
        L_0x021d:
            if (r1 != 0) goto L_0x0221
        L_0x021f:
            r55 = 0
        L_0x0221:
            if (r15 == 0) goto L_0x027f
            int r54 = r42.AG1()
            r51 = 1000(0x3e8, float:1.401E-42)
            r52 = 0
            r49 = r7
            r45 = r7
            r46 = r32
            r48 = r3
            r50 = r14
            r56 = r18
            X.1Vt r1 = X.AnonymousClass1W1.A01(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
        L_0x023b:
            r0 = r35
            r1.A0L = r0
            if (r34 != 0) goto L_0x0247
            r34 = r32
            if (r30 == 0) goto L_0x0247
            r34 = r47
        L_0x0247:
            r0 = r34
            r1.A0C = r0
            r0 = r30
            r1.A0Q = r0
            r0 = r33
            r1.A0K = r0
            r0 = r28
            r1.A0F = r0
            r0 = r31
            r1.A0H = r0
            r0 = r29
            r1.A0J = r0
            r3 = r18
            r1.A06 = r3
            r3 = r16
            r1.A05 = r3
            r0 = r27
            r1.A0P = r0
            if (r43 != 0) goto L_0x0271
            r0 = r37
            r1.A09 = r0
        L_0x0271:
            X.1W2 r0 = r42.AI7()
            if (r0 == 0) goto L_0x0061
            android.text.TextUtils.isEmpty(r36)
            int r5 = r1.A03
            monitor-enter(r1)
            goto L_0x0781
        L_0x027f:
            java.lang.String r1 = "COLLECT_SUCCESS"
            boolean r41 = r1.equalsIgnoreCase(r0)
            if (r41 != 0) goto L_0x0675
            java.lang.String r1 = "COLLECT_FAILED"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L_0x0675
            java.lang.String r1 = "COLLECT_FAILED_RISK"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L_0x0675
            java.lang.String r1 = "COLLECT_REJECTED"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L_0x0675
            java.lang.String r1 = "COLLECT_EXPIRED"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L_0x0675
            if (r9 == 0) goto L_0x02b9
            java.lang.String r1 = "AUTH_SUCCESS"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L_0x0675
            java.lang.String r1 = "AUTH_CANCELED"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L_0x0675
        L_0x02b9:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r5 = 2
            if (r1 != 0) goto L_0x02cd
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r9 = r8.toLowerCase(r1)
            int r1 = r9.hashCode()
            switch(r1) {
                case -1703305877: goto L_0x062a;
                case -1629586251: goto L_0x0636;
                case -995205722: goto L_0x0643;
                case -934813832: goto L_0x064f;
                case 109291: goto L_0x065a;
                case 1554454174: goto L_0x066a;
                default: goto L_0x02cd;
            }
        L_0x02cd:
            if (r30 == 0) goto L_0x02d0
            r5 = 1
        L_0x02d0:
            int r54 = r42.AG1()
            r9 = r54
            r1 = 9
            if (r5 != r1) goto L_0x02f3
            java.lang.String r4 = r2.A0N(r4, r7)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x02f1
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r1)
            int r1 = r4.hashCode()
            switch(r1) {
                case -2031560318: goto L_0x061e;
                case 116014: goto L_0x0614;
                case 3387444: goto L_0x060b;
                case 97229420: goto L_0x0602;
                default: goto L_0x02f1;
            }
        L_0x02f1:
            r54 = 0
        L_0x02f3:
            switch(r40) {
                case -1629586251: goto L_0x05eb;
                case -934813832: goto L_0x05e8;
                case 1554454174: goto L_0x05e5;
                default: goto L_0x02f6;
            }
        L_0x02f6:
            if (r30 == 0) goto L_0x05fc
            X.AnonymousClass00B.A06(r42)
            r54 = r9
            r56 = -1
            r52 = 401(0x191, float:5.62E-43)
        L_0x0301:
            r45 = r6
            r46 = r32
            r48 = r3
            r49 = r7
            r50 = r14
            r51 = r5
            X.1Vt r1 = X.AnonymousClass1W1.A01(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
        L_0x0311:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r4 != 0) goto L_0x034c
            java.lang.String r40 = "FAILURE"
            java.lang.String r39 = "FAILED_RISK"
            java.lang.String r38 = "AUTH_CANCELED"
            java.lang.String r15 = "FAILED_DA"
            java.lang.String r14 = "EXPIRED"
            java.lang.String r13 = "IN_REVIEW"
            java.lang.String r12 = "PENDING"
            java.lang.String r11 = "CANCELLED"
            java.lang.String r10 = "FAILED"
            java.lang.String r9 = "COMPLETED"
            java.lang.String r8 = "SUCCESS"
            r3 = 1
            if (r5 == r3) goto L_0x04d6
            r3 = 2
            if (r5 == r3) goto L_0x0438
            java.lang.String r6 = "COLLECT_EXPIRED"
            java.lang.String r4 = "COLLECT_REJECTED"
            r3 = 20
            if (r5 == r3) goto L_0x03e8
            r3 = 40
            if (r5 == r3) goto L_0x03d6
            r3 = 100
            if (r5 == r3) goto L_0x04d6
            r3 = 200(0xc8, float:2.8E-43)
            if (r5 == r3) goto L_0x0438
            switch(r5) {
                case 6: goto L_0x03b1;
                case 7: goto L_0x04c6;
                case 8: goto L_0x0350;
                case 9: goto L_0x0438;
                case 10: goto L_0x03e8;
                default: goto L_0x034b;
            }
        L_0x034b:
            r3 = 0
        L_0x034c:
            r1.A02 = r3
            goto L_0x023b
        L_0x0350:
            java.lang.String r3 = "PENDING_CODE"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x03ae
            boolean r3 = r12.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x03ae
            boolean r3 = r13.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0367
            r3 = 603(0x25b, float:8.45E-43)
            goto L_0x034c
        L_0x0367:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x03ab
            boolean r3 = r9.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x03ab
            boolean r3 = r10.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x03a8
            java.lang.String r3 = "DECLINED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x03a8
            boolean r3 = r11.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x038a
            r3 = 606(0x25e, float:8.49E-43)
            goto L_0x034c
        L_0x038a:
            boolean r3 = r14.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0393
            r3 = 607(0x25f, float:8.5E-43)
            goto L_0x034c
        L_0x0393:
            java.lang.String r3 = "WITHDRAWAL_ACTIVE"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x039e
            r3 = 608(0x260, float:8.52E-43)
            goto L_0x034c
        L_0x039e:
            java.lang.String r3 = "PENDING_CANCELLATION"
            boolean r0 = r3.equalsIgnoreCase(r0)
            r3 = 609(0x261, float:8.53E-43)
            goto L_0x05d5
        L_0x03a8:
            r3 = 605(0x25d, float:8.48E-43)
            goto L_0x034c
        L_0x03ab:
            r3 = 604(0x25c, float:8.46E-43)
            goto L_0x034c
        L_0x03ae:
            r3 = 602(0x25a, float:8.44E-43)
            goto L_0x034c
        L_0x03b1:
            boolean r3 = r12.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03ba
            r3 = 701(0x2bd, float:9.82E-43)
            goto L_0x034c
        L_0x03ba:
            boolean r3 = r13.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03c3
            r3 = 702(0x2be, float:9.84E-43)
            goto L_0x034c
        L_0x03c3:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03cc
            r3 = 703(0x2bf, float:9.85E-43)
            goto L_0x034c
        L_0x03cc:
            boolean r3 = r10.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x05cf
            r3 = 704(0x2c0, float:9.87E-43)
            goto L_0x034c
        L_0x03d6:
            if (r41 == 0) goto L_0x03dc
            r3 = 20
            goto L_0x034c
        L_0x03dc:
            java.lang.String r3 = "AUTH_SUCCESS"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x041c
            r3 = 417(0x1a1, float:5.84E-43)
            goto L_0x034c
        L_0x03e8:
            if (r41 == 0) goto L_0x03ee
            r3 = 12
            goto L_0x034c
        L_0x03ee:
            java.lang.String r3 = "COLLECT_FAILED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x03fa
            r3 = 13
            goto L_0x034c
        L_0x03fa:
            java.lang.String r3 = "COLLECT_FAILED_RISK"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0406
            r3 = 14
            goto L_0x034c
        L_0x0406:
            boolean r3 = r4.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x0434
            boolean r3 = r6.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x0430
            java.lang.String r3 = "COLLECT_CANCELED"
            boolean r0 = r3.equalsIgnoreCase(r0)
            r3 = 18
            goto L_0x05d5
        L_0x041c:
            r3 = r38
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05d9
            boolean r3 = r4.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x0434
            boolean r0 = r6.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x034b
        L_0x0430:
            r3 = 16
            goto L_0x034c
        L_0x0434:
            r3 = 15
            goto L_0x034c
        L_0x0438:
            java.lang.String r3 = "PENDING_SETUP"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0444
            r3 = 102(0x66, float:1.43E-43)
            goto L_0x034c
        L_0x0444:
            boolean r3 = r15.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x044e
            r3 = 103(0x67, float:1.44E-43)
            goto L_0x034c
        L_0x044e:
            java.lang.String r3 = "FAILED_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x045a
            r3 = 104(0x68, float:1.46E-43)
            goto L_0x034c
        L_0x045a:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04d2
            boolean r3 = r9.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04d2
            r3 = r40
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04c2
            boolean r3 = r10.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04c2
            boolean r3 = r14.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x047e
            r3 = 107(0x6b, float:1.5E-43)
            goto L_0x034c
        L_0x047e:
            r3 = r39
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x048a
            r3 = 108(0x6c, float:1.51E-43)
            goto L_0x034c
        L_0x048a:
            java.lang.String r3 = "WITHDRAWAL_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0496
            r3 = 109(0x6d, float:1.53E-43)
            goto L_0x034c
        L_0x0496:
            java.lang.String r3 = "WITHDRAWAL_FAILURE"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04a2
            r3 = 110(0x6e, float:1.54E-43)
            goto L_0x034c
        L_0x04a2:
            java.lang.String r3 = "WITHDRAWAL_PERMANENT_FAILED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04ae
            r3 = 111(0x6f, float:1.56E-43)
            goto L_0x034c
        L_0x04ae:
            boolean r3 = r11.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04b8
            r3 = 112(0x70, float:1.57E-43)
            goto L_0x034c
        L_0x04b8:
            java.lang.String r3 = "SENT_TO_SELLER"
            boolean r0 = r3.equalsIgnoreCase(r0)
            r3 = 113(0x71, float:1.58E-43)
            goto L_0x05d5
        L_0x04c2:
            r3 = 105(0x69, float:1.47E-43)
            goto L_0x034c
        L_0x04c6:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x04d2
            boolean r0 = r9.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x034b
        L_0x04d2:
            r3 = 106(0x6a, float:1.49E-43)
            goto L_0x034c
        L_0x04d6:
            java.lang.String r3 = "PENDING_RECEIVER_SETUP"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04e2
            r3 = 402(0x192, float:5.63E-43)
            goto L_0x034c
        L_0x04e2:
            boolean r3 = r15.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04ec
            r3 = 403(0x193, float:5.65E-43)
            goto L_0x034c
        L_0x04ec:
            java.lang.String r3 = "REFUND_FAILED_DA"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x04f8
            r3 = 404(0x194, float:5.66E-43)
            goto L_0x034c
        L_0x04f8:
            r3 = r39
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0504
            r3 = 407(0x197, float:5.7E-43)
            goto L_0x034c
        L_0x0504:
            java.lang.String r3 = "INITIAL"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0510
            r3 = 401(0x191, float:5.62E-43)
            goto L_0x034c
        L_0x0510:
            boolean r3 = r8.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05e1
            boolean r3 = r9.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05e1
            r3 = r40
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05dd
            boolean r3 = r10.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05dd
            java.lang.String r3 = "REFUNDED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0536
            r3 = 408(0x198, float:5.72E-43)
            goto L_0x034c
        L_0x0536:
            java.lang.String r3 = "REFUND_FAILED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0542
            r3 = 409(0x199, float:5.73E-43)
            goto L_0x034c
        L_0x0542:
            java.lang.String r3 = "FAILED_RECEIVER_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x054e
            r3 = 410(0x19a, float:5.75E-43)
            goto L_0x034c
        L_0x054e:
            java.lang.String r3 = "REFUND_FAILED_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x055a
            r3 = 411(0x19b, float:5.76E-43)
            goto L_0x034c
        L_0x055a:
            java.lang.String r3 = "FAILED_DA_FINAL"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0566
            r3 = 412(0x19c, float:5.77E-43)
            goto L_0x034c
        L_0x0566:
            java.lang.String r3 = "AUTH_CANCEL_FAILED_PROCESSING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0572
            r3 = 413(0x19d, float:5.79E-43)
            goto L_0x034c
        L_0x0572:
            java.lang.String r3 = "AUTH_CANCEL_FAILED"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x057e
            r3 = 414(0x19e, float:5.8E-43)
            goto L_0x034c
        L_0x057e:
            r3 = r38
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto L_0x05d9
            boolean r3 = r14.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x0590
            r3 = 416(0x1a0, float:5.83E-43)
            goto L_0x034c
        L_0x0590:
            boolean r3 = r13.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x059a
            r3 = 419(0x1a3, float:5.87E-43)
            goto L_0x034c
        L_0x059a:
            boolean r3 = r12.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x05a4
            r3 = 420(0x1a4, float:5.89E-43)
            goto L_0x034c
        L_0x05a4:
            boolean r3 = r11.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x05ae
            r3 = 421(0x1a5, float:5.9E-43)
            goto L_0x034c
        L_0x05ae:
            java.lang.String r3 = "REVERSAL_SUCCESS"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x05ba
            r3 = 422(0x1a6, float:5.91E-43)
            goto L_0x034c
        L_0x05ba:
            java.lang.String r3 = "REVERSAL_PENDING"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x05c6
            r3 = 423(0x1a7, float:5.93E-43)
            goto L_0x034c
        L_0x05c6:
            java.lang.String r3 = "REFUND_PENDING"
            boolean r0 = r3.equalsIgnoreCase(r0)
            r3 = 424(0x1a8, float:5.94E-43)
            goto L_0x05d5
        L_0x05cf:
            boolean r0 = r11.equalsIgnoreCase(r0)
            r3 = 705(0x2c1, float:9.88E-43)
        L_0x05d5:
            if (r0 != 0) goto L_0x034c
            goto L_0x034b
        L_0x05d9:
            r3 = 415(0x19f, float:5.82E-43)
            goto L_0x034c
        L_0x05dd:
            r3 = 406(0x196, float:5.69E-43)
            goto L_0x034c
        L_0x05e1:
            r3 = 405(0x195, float:5.68E-43)
            goto L_0x034c
        L_0x05e5:
            java.lang.String r1 = "deposit"
            goto L_0x05ee
        L_0x05e8:
            java.lang.String r1 = "refund"
            goto L_0x05ee
        L_0x05eb:
            java.lang.String r1 = "withdrawal"
        L_0x05ee:
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x02f6
            X.AnonymousClass00B.A06(r42)
            r54 = r9
            r52 = 401(0x191, float:5.62E-43)
            goto L_0x05fe
        L_0x05fc:
            r52 = 101(0x65, float:1.42E-43)
        L_0x05fe:
            r56 = r18
            goto L_0x0301
        L_0x0602:
            java.lang.String r1 = "fbpay"
            boolean r1 = r4.equals(r1)
            r54 = 2
            goto L_0x0626
        L_0x060b:
            java.lang.String r1 = "novi"
            boolean r1 = r4.equals(r1)
            r54 = 3
            goto L_0x0626
        L_0x0614:
            java.lang.String r1 = "upi"
            boolean r1 = r4.equals(r1)
            r54 = 1
            goto L_0x0626
        L_0x061e:
            java.lang.String r1 = "p2m_lite"
            boolean r1 = r4.equals(r1)
            r54 = 4
        L_0x0626:
            if (r1 != 0) goto L_0x02f3
            goto L_0x02f1
        L_0x062a:
            java.lang.String r1 = "incentive"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x02cd
            r5 = 9
            goto L_0x02d0
        L_0x0636:
            java.lang.String r1 = "withdrawal"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x02cd
            r5 = 8
            goto L_0x02d0
        L_0x0643:
            java.lang.String r1 = "payout"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x02cd
            r5 = 300(0x12c, float:4.2E-43)
            goto L_0x02d0
        L_0x064f:
            java.lang.String r1 = "refund"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x02cd
            r5 = 7
            goto L_0x02d0
        L_0x065a:
            java.lang.String r1 = "p2m"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x02cd
            r5 = 200(0xc8, float:2.8E-43)
            if (r30 == 0) goto L_0x02d0
            r5 = 100
            goto L_0x02d0
        L_0x066a:
            java.lang.String r1 = "deposit"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x02cd
            r5 = 6
            goto L_0x02d0
        L_0x0675:
            if (r30 == 0) goto L_0x06b8
            if (r9 == 0) goto L_0x0697
            int r54 = r42.AG1()
            r51 = 40
            r52 = 12
            r55 = 0
            r45 = r6
            r46 = r32
            r48 = r3
            r49 = r7
            r50 = r14
            r56 = r18
            X.1Vt r1 = X.AnonymousClass1W1.A01(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
        L_0x0693:
            int r5 = r1.A03
            goto L_0x0311
        L_0x0697:
            int r63 = X.AnonymousClass1W0.A00(r14)
            r61 = 20
            r62 = 12
            r65 = 0
            r54 = r44
            r55 = r6
            r56 = r32
            r57 = r47
            r58 = r3
            r59 = r7
            r60 = r14
            r64 = r53
            r66 = r18
            X.1Vt r1 = X.AnonymousClass1W1.A01(r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            goto L_0x0693
        L_0x06b8:
            int r63 = X.AnonymousClass1W0.A00(r14)
            r61 = 10
            r62 = 11
            r65 = 0
            r54 = r44
            r55 = r6
            r56 = r32
            r57 = r47
            r58 = r3
            r59 = r7
            r60 = r14
            r64 = r53
            r66 = r18
            X.1Vt r1 = X.AnonymousClass1W1.A01(r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
            r5 = 10
            goto L_0x0311
        L_0x06dc:
            java.lang.String r1 = "seller"
            boolean r1 = r10.equals(r1)
            r55 = 2
            goto L_0x021d
        L_0x06e7:
            X.1Vx r5 = r5.A02(r14)
            if (r5 == 0) goto L_0x0959
            X.19r r42 = r5.AEp(r3)
            goto L_0x0201
        L_0x06f3:
            r6 = r7
            goto L_0x01df
        L_0x06f6:
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r5 == 0) goto L_0x0702
            r6 = r69
            X.173 r6 = r6.A02
            X.1Vz r11 = r6.A01(r5)
        L_0x0702:
            if (r13 == 0) goto L_0x070b
            double r5 = java.lang.Double.parseDouble(r13)
            double r3 = (double) r1
            double r5 = r5 * r3
            long r3 = (long) r5
        L_0x070b:
            X.1lv r37 = new X.1lv
            r5 = r37
            r5.<init>(r11, r1, r3)
            goto L_0x01b2
        L_0x0714:
            java.lang.String r3 = "money"
            X.1Vv r4 = r13.A0J(r3)
            if (r4 != 0) goto L_0x0728
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " :: money node is null"
            goto L_0x01a8
        L_0x0728:
            java.lang.String r3 = "value"
            java.lang.String r13 = r4.A0N(r3, r7)     // Catch:{ Exception -> 0x0763 }
            java.lang.String r3 = "offset"
            java.lang.String r6 = r4.A0N(r3, r7)     // Catch:{ Exception -> 0x0763 }
            java.lang.String r4 = r4.A0N(r5, r7)     // Catch:{ Exception -> 0x0763 }
            r3 = r69
            X.173 r3 = r3.A02     // Catch:{ Exception -> 0x0763 }
            X.1Vz r11 = r3.A01(r4)     // Catch:{ Exception -> 0x0763 }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0763 }
            long r3 = r3.longValue()     // Catch:{ Exception -> 0x0763 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0763 }
            int r6 = r5.intValue()     // Catch:{ Exception -> 0x0763 }
            if (r6 > 0) goto L_0x075a
            r6 = 1
            X.1lv r5 = new X.1lv     // Catch:{ Exception -> 0x0763 }
            r5.<init>(r11, r6, r3)     // Catch:{ Exception -> 0x0763 }
            goto L_0x075f
        L_0x075a:
            X.1lv r5 = new X.1lv     // Catch:{ Exception -> 0x0763 }
            r5.<init>(r11, r6, r3)     // Catch:{ Exception -> 0x0763 }
        L_0x075f:
            r37 = r5
            goto L_0x01b2
        L_0x0763:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " :: an error occurred while parsing the money node :: e = "
            r3.append(r1)
            java.lang.String r1 = r4.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x01b2
        L_0x0781:
            X.1W2 r4 = r1.A0A     // Catch:{ all -> 0x0956 }
            if (r4 != 0) goto L_0x0788
            r1.A0A = r0     // Catch:{ all -> 0x0956 }
            r4 = r0
        L_0x0788:
            r3 = r68
            r4.A01(r3, r2, r5)     // Catch:{ all -> 0x0956 }
            X.1lv r3 = r1.A09     // Catch:{ all -> 0x0956 }
            if (r3 == 0) goto L_0x0793
            r4.A01 = r3     // Catch:{ all -> 0x0956 }
        L_0x0793:
            java.lang.String r3 = "offer_claim"
            X.1Vv r5 = r2.A0J(r3)     // Catch:{ all -> 0x0956 }
            if (r5 == 0) goto L_0x07c1
            java.lang.String r3 = "offer_id"
            java.lang.String r9 = r5.A0N(r3, r7)     // Catch:{ all -> 0x0956 }
            r3 = r26
            java.lang.String r8 = r5.A0N(r3, r7)     // Catch:{ all -> 0x0956 }
            java.lang.String r3 = "parent_transaction_id"
            java.lang.String r6 = r5.A0N(r3, r7)     // Catch:{ all -> 0x0956 }
            java.lang.String r3 = "incentive_payment_id"
            java.lang.String r5 = r5.A0N(r3, r7)     // Catch:{ all -> 0x0956 }
            if (r9 == 0) goto L_0x07c1
            if (r8 != 0) goto L_0x07ba
            if (r6 != 0) goto L_0x07ba
            goto L_0x07c1
        L_0x07ba:
            X.1lz r3 = new X.1lz     // Catch:{ all -> 0x0956 }
            r3.<init>(r9, r8, r6, r5)     // Catch:{ all -> 0x0956 }
            r4.A00 = r3     // Catch:{ all -> 0x0956 }
        L_0x07c1:
            java.lang.String r3 = "order"
            X.1Vv r6 = r2.A0J(r3)     // Catch:{ all -> 0x0956 }
            if (r6 == 0) goto L_0x07f0
            r2 = r26
            java.lang.String r9 = r6.A0N(r2, r7)     // Catch:{ all -> 0x0956 }
            if (r9 == 0) goto L_0x07f0
            java.lang.String r2 = "message_id"
            java.lang.String r10 = r6.A0N(r2, r7)     // Catch:{ all -> 0x0956 }
            if (r10 == 0) goto L_0x07f0
            r12 = 0
            java.lang.String r5 = "expiry_ts"
            long r12 = r6.A0D(r5, r12)     // Catch:{ 1W9 -> 0x07e2 }
            goto L_0x07e7
        L_0x07e2:
            java.lang.String r2 = "PAY: PaymentTransactionCountryData/parseOrderData : invalid expiry timestamp format"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0956 }
        L_0x07e7:
            X.1lu r2 = new X.1lu     // Catch:{ all -> 0x0956 }
            r8 = r2
            r11 = r7
            r8.<init>(r9, r10, r11, r12)     // Catch:{ all -> 0x0956 }
            r4.A02 = r2     // Catch:{ all -> 0x0956 }
        L_0x07f0:
            monitor-exit(r1)
            monitor-enter(r1)
            if (r25 <= 0) goto L_0x0800
            X.1W2 r3 = r1.A0A     // Catch:{ all -> 0x0956 }
            if (r3 != 0) goto L_0x07fb
            r1.A0A = r0     // Catch:{ all -> 0x0956 }
            r3 = r0
        L_0x07fb:
            r2 = r25
            r3.A0N(r2)     // Catch:{ all -> 0x0956 }
        L_0x0800:
            monitor-exit(r1)
            monitor-enter(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r24)     // Catch:{ all -> 0x0956 }
            if (r2 != 0) goto L_0x0814
            X.1W2 r3 = r1.A0A     // Catch:{ all -> 0x0956 }
            if (r3 != 0) goto L_0x080f
            r1.A0A = r0     // Catch:{ all -> 0x0956 }
            r3 = r0
        L_0x080f:
            r2 = r24
            r3.A0X(r2)     // Catch:{ all -> 0x0956 }
        L_0x0814:
            monitor-exit(r1)
            monitor-enter(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r23)     // Catch:{ all -> 0x0956 }
            if (r2 != 0) goto L_0x0828
            X.1W2 r3 = r1.A0A     // Catch:{ all -> 0x0956 }
            if (r3 != 0) goto L_0x0823
            r1.A0A = r0     // Catch:{ all -> 0x0956 }
            r3 = r0
        L_0x0823:
            r2 = r23
            r3.A0W(r2)     // Catch:{ all -> 0x0956 }
        L_0x0828:
            monitor-exit(r1)
            r2 = r20
            r1.A03(r0, r2)
            r2 = r71
            if (r71 == 0) goto L_0x0061
            if (r27 == 0) goto L_0x0061
            boolean r3 = android.text.TextUtils.isEmpty(r22)
            if (r3 != 0) goto L_0x0061
            r3 = r69
            X.0pd r5 = r3.A03
            r4 = 1718(0x6b6, float:2.407E-42)
            X.0tM r3 = X.C16620tM.A02
            boolean r3 = r5.A0E(r3, r4)
            if (r3 == 0) goto L_0x0061
            boolean r3 = android.text.TextUtils.isEmpty(r22)
            if (r3 != 0) goto L_0x0061
            if (r22 == 0) goto L_0x0061
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0061 }
            r3 = r22
            r4.<init>(r3)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r3 = "pkeVersion"
            r4.getInt(r3)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r3 = "nonce"
            java.lang.String r7 = r4.getString(r3)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r3 = "serverPubKey"
            java.lang.String r6 = r4.getString(r3)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r3 = "serverPubKeySig"
            java.lang.String r5 = r4.getString(r3)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r3 = "cert"
            java.lang.String r10 = r4.getString(r3)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r3 = "encData"
            java.lang.String r4 = r4.getString(r3)     // Catch:{ JSONException -> 0x0061 }
            r3 = 8
            byte[] r11 = android.util.Base64.decode(r7, r3)     // Catch:{ JSONException -> 0x0061 }
            byte[] r12 = android.util.Base64.decode(r6, r3)     // Catch:{ JSONException -> 0x0061 }
            byte[] r13 = android.util.Base64.decode(r5, r3)     // Catch:{ JSONException -> 0x0061 }
            byte[] r14 = android.util.Base64.decode(r4, r3)     // Catch:{ JSONException -> 0x0061 }
            X.2Gn r9 = new X.2Gn     // Catch:{ JSONException -> 0x0061 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x0061 }
            byte[] r6 = r9.A03
            byte[] r8 = r9.A04
            java.lang.String r7 = r9.A00
            X.14I r5 = new X.14I
            r5.<init>()
            r15 = 0
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ CertificateExpiredException -> 0x0950, JSONException -> 0x0061 }
            java.lang.String r3 = "CN=Facebook Purpose Encryption Signature"
            r4[r15] = r3     // Catch:{ CertificateExpiredException -> 0x0950, JSONException -> 0x0061 }
            java.security.cert.X509Certificate r5 = r5.A00(r7, r4)     // Catch:{ CertificateExpiredException -> 0x0950, JSONException -> 0x0061 }
            java.lang.String r3 = "SHA256withRSA"
            java.security.Signature r4 = java.security.Signature.getInstance(r3)     // Catch:{ CertificateExpiredException -> 0x0950, JSONException -> 0x0061 }
            java.security.PublicKey r3 = r5.getPublicKey()     // Catch:{ CertificateExpiredException -> 0x0950, JSONException -> 0x0061 }
            r4.initVerify(r3)     // Catch:{ CertificateExpiredException -> 0x0950, JSONException -> 0x0061 }
            r4.update(r6)     // Catch:{ CertificateExpiredException -> 0x0950, JSONException -> 0x0061 }
            boolean r3 = r4.verify(r8)     // Catch:{ CertificateExpiredException -> 0x0950, JSONException -> 0x0061 }
            if (r3 == 0) goto L_0x0061
            goto L_0x08d5
        L_0x08c1:
            java.lang.String r0 = "incentive"
            goto L_0x08cd
        L_0x08c4:
            java.lang.String r0 = "withdrawal"
            goto L_0x08cd
        L_0x08c8:
            java.lang.String r0 = "refund"
            goto L_0x08cd
        L_0x08cb:
            java.lang.String r0 = "deposit"
        L_0x08cd:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x002e
            goto L_0x003e
        L_0x08d5:
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.A00
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x0948
            byte[] r3 = r2.A01
            byte[] r4 = X.C46862Go.A01(r6, r3)
            byte[] r3 = r9.A02
            byte[] r7 = r9.A01
            X.2Gq r12 = X.C46872Gp.A00(r4, r3)
            X.2Gs r10 = new X.2Gs
            r10.<init>()
            r4 = 32
            byte[] r13 = new byte[r4]
            r17 = 0
            r16 = 32
            r14 = r13
            r12.A01(r13, r14, r15, r16, r17)
            X.2Gu r3 = new X.2Gu
            r3.<init>(r13, r4)
            r10.AHz(r3)
            int r11 = r7.length
            r4 = 16
            r9 = 16
            int r3 = r11 - r4
            int r8 = java.lang.Math.max(r3, r15)
            byte[] r6 = new byte[r4]
            byte[] r5 = new byte[r4]
            byte[] r4 = new byte[r8]
            r10.update(r7, r9, r8)
            r10.A8A(r6, r15)
            int r3 = java.lang.Math.min(r11, r9)
            java.lang.System.arraycopy(r7, r15, r5, r15, r3)
            boolean r3 = java.security.MessageDigest.isEqual(r6, r5)
            if (r3 == 0) goto L_0x093d
            r13 = 16
            r10 = r12
            r12 = r4
            r14 = r8
            r11 = r7
            r10.A01(r11, r12, r13, r14, r15)
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            r0.A0U(r3)
            r2.destroy()
            return r1
        L_0x093d:
            java.lang.String r0 = "XSalsa20Poly1305/decrypt Presented MAC doesn't match calculated MAC (MAC prepended)"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.2Gw r0 = new X.2Gw
            r0.<init>()
            throw r0
        L_0x0948:
            java.lang.String r1 = "key has been destroyed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0950:
            java.lang.String r0 = "Certificate expired"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r1
        L_0x0956:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0959:
            java.lang.String r0 = "PaymentsProtoParser/parsePaymentTransaction service == null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HB.A02(X.1W5, X.1Vv):X.1Vt");
    }

    public final AnonymousClass1Vt A03(C28371Vv r11, long j2) {
        byte[] bArr;
        String A0N = r11.A0N("country", "IN");
        int A002 = C29501aj.A00(r11.A0N("version", (String) null), 1);
        try {
            C46842Gl r2 = this.A08;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            r2.A05(r11, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            StringBuilder sb = new StringBuilder("PAY: PaymentsProtoParser serializeProtocolNode: ");
            sb.append(e2);
            Log.e(sb.toString());
            bArr = null;
        }
        StringBuilder sb2 = new StringBuilder("PAY PaymentsProtoParser: buildFuturePaymentFromPayNode: futurePayment country=");
        sb2.append(A0N);
        sb2.append(" version=");
        sb2.append(A002);
        Log.i(sb2.toString());
        AnonymousClass1Vt r3 = new AnonymousClass1Vt(A0N, 5, A002, 0, j2);
        r3.A0R = bArr;
        return r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.1lw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: X.1lr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.1lw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: X.1m4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.1lw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.1lw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x024a, code lost:
        switch(r14) {
            case 0: goto L_0x0287;
            case 1: goto L_0x0282;
            case 2: goto L_0x027d;
            case 3: goto L_0x0278;
            case 4: goto L_0x0273;
            case 5: goto L_0x026e;
            case 6: goto L_0x026b;
            case 7: goto L_0x0266;
            case 8: goto L_0x0264;
            case 9: goto L_0x025a;
            case 10: goto L_0x0255;
            case 11: goto L_0x0250;
            default: goto L_0x024d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0250, code lost:
        r20 = "1".equals(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0255, code lost:
        r17 = "1".equals(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x025a, code lost:
        r0 = X.C29501aj.A01(r7, 0) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0264, code lost:
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0266, code lost:
        r19 = "1".equals(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x026b, code lost:
        r25 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x026e, code lost:
        r26 = X.C35391lr.A04(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0273, code lost:
        r31 = X.C35391lr.A05(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0278, code lost:
        r21 = "1".equals(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x027d, code lost:
        r18 = "1".equals(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0282, code lost:
        r16 = "1".equals(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0287, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02ec, code lost:
        if (r12 == false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0325, code lost:
        if (r20 != false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x032d, code lost:
        if (r18 != false) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        com.whatsapp.util.Log.w("PAY: PaymentsProtoParser unset payment method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0054 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0054 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A04(X.C28371Vv r33) {
        /*
            r32 = this;
            r9 = r33
            if (r33 == 0) goto L_0x036e
            java.lang.String r1 = "wa-support-phone-number"
            r0 = 0
            java.lang.String r1 = r9.A0N(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r3 = r32
            if (r0 != 0) goto L_0x0019
            X.0wT r0 = r3.A04
            r0.A0K(r1)
        L_0x0019:
            X.1Vv[] r0 = r9.A03
            if (r0 == 0) goto L_0x036e
            int r15 = r0.length
            if (r15 <= 0) goto L_0x036e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5 = 0
        L_0x0026:
            if (r5 >= r15) goto L_0x036f
            X.1Vv r4 = r9.A0I(r5)
            X.AnonymousClass00B.A06(r4)
            java.lang.String r1 = r4.A00
            int r0 = r1.hashCode()
            switch(r0) {
                case -795192327: goto L_0x0362;
                case -505296440: goto L_0x035f;
                case 3016252: goto L_0x035c;
                case 3046160: goto L_0x0359;
                default: goto L_0x0038;
            }
        L_0x0038:
            java.lang.String r0 = "PAY: PaymentsProtoParser unset payment method"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r4.A00
            int r0 = r1.hashCode()
            switch(r0) {
                case -795192327: goto L_0x0057;
                case -505296440: goto L_0x0083;
                case 3016252: goto L_0x012f;
                case 3046160: goto L_0x020a;
                default: goto L_0x0049;
            }
        L_0x0049:
            java.lang.String r0 = "PAY: PaymentsProtoParser unset payment method"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x004e:
            r2 = 0
        L_0x004f:
            if (r2 == 0) goto L_0x0054
            r6.add(r2)
        L_0x0054:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x0057:
            java.lang.String r0 = "wallet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "country"
            r2 = 0
            java.lang.String r1 = r4.A0N(r0, r2)
            X.0wS r0 = r3.A06
            X.1Vx r0 = r0.A02(r1)
            X.AnonymousClass00B.A06(r0)
            X.19r r0 = r0.AEp(r2)
            X.1tH r0 = r0.AI8()
            X.AnonymousClass00B.A06(r0)
            java.lang.String r1 = "fromNetwork"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0083:
            java.lang.String r0 = "merchant"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            r2 = 0
            X.1lL[] r13 = r4.A0Q()     // Catch:{ Exception -> 0x012a }
            if (r13 != 0) goto L_0x0098
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing merchant: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x012a }
            goto L_0x004f
        L_0x0098:
            r12 = 0
            r11 = r2
            r19 = r2
            r20 = r2
            r21 = r2
            r10 = 0
            r23 = 0
            r24 = 0
        L_0x00a5:
            int r0 = r13.length     // Catch:{ Exception -> 0x012a }
            if (r10 >= r0) goto L_0x00fa
            r0 = r13[r10]     // Catch:{ Exception -> 0x012a }
            java.lang.String r8 = r0.A02     // Catch:{ Exception -> 0x012a }
            r0 = r13[r10]     // Catch:{ Exception -> 0x012a }
            java.lang.String r7 = r0.A03     // Catch:{ Exception -> 0x012a }
            java.lang.String r0 = "credential-id"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x012a }
            if (r0 == 0) goto L_0x00bb
            r19 = r7
            goto L_0x00f7
        L_0x00bb:
            java.lang.String r0 = "country"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x012a }
            if (r0 == 0) goto L_0x00c4
            goto L_0x00f6
        L_0x00c4:
            java.lang.String r0 = "merchant-id"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x012a }
            if (r0 == 0) goto L_0x00cf
            r21 = r7
            goto L_0x00f7
        L_0x00cf:
            java.lang.String r0 = "p2m-eligible"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x012a }
            java.lang.String r1 = "1"
            if (r0 == 0) goto L_0x00de
            boolean r23 = r1.equals(r7)     // Catch:{ Exception -> 0x012a }
            goto L_0x00f7
        L_0x00de:
            java.lang.String r0 = "p2p-eligible"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x012a }
            if (r0 == 0) goto L_0x00eb
            boolean r24 = r1.equals(r7)     // Catch:{ Exception -> 0x012a }
            goto L_0x00f7
        L_0x00eb:
            java.lang.String r0 = "logo-uri"
            boolean r0 = r8.equals(r0)     // Catch:{ Exception -> 0x012a }
            if (r0 == 0) goto L_0x00f7
            r20 = r7
            goto L_0x00f7
        L_0x00f6:
            r11 = r7
        L_0x00f7:
            int r10 = r10 + 1
            goto L_0x00a5
        L_0x00fa:
            java.lang.String r1 = "gateway-name"
            java.lang.String r0 = ""
            java.lang.String r22 = r4.A0N(r1, r0)     // Catch:{ Exception -> 0x012a }
            X.0wS r0 = r3.A06     // Catch:{ Exception -> 0x012a }
            X.1Vx r0 = r0.A02(r11)     // Catch:{ Exception -> 0x012a }
            X.AnonymousClass00B.A06(r0)     // Catch:{ Exception -> 0x012a }
            X.19r r0 = r0.AEp(r2)     // Catch:{ Exception -> 0x012a }
            X.1tI r1 = r0.AI6()     // Catch:{ Exception -> 0x012a }
            X.AnonymousClass00B.A06(r1)     // Catch:{ Exception -> 0x012a }
            X.173 r0 = r3.A02     // Catch:{ Exception -> 0x012a }
            r1.A01(r0, r4, r12)     // Catch:{ Exception -> 0x012a }
            X.1cm r17 = X.C30681cm.A00(r11)     // Catch:{ Exception -> 0x012a }
            X.1lw r16 = new X.1lw     // Catch:{ Exception -> 0x012a }
            r18 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x012a }
            r2 = r16
            goto L_0x004f
        L_0x012a:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating merchant account: "
            goto L_0x0205
        L_0x012f:
            java.lang.String r0 = "bank"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            r2 = 0
            X.1lL[] r13 = r4.A0Q()     // Catch:{ Exception -> 0x0202 }
            if (r13 != 0) goto L_0x0145
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating bank account: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0202 }
            goto L_0x004f
        L_0x0145:
            r0 = 0
            r14 = r2
            r27 = r2
            r26 = r2
            r25 = r2
            r21 = 0
            r12 = 0
            r17 = 0
            r16 = 0
        L_0x0155:
            int r7 = r13.length     // Catch:{ Exception -> 0x0202 }
            if (r12 >= r7) goto L_0x01bb
            r7 = r13[r12]     // Catch:{ Exception -> 0x0202 }
            java.lang.String r11 = r7.A02     // Catch:{ Exception -> 0x0202 }
            r7 = r13[r12]     // Catch:{ Exception -> 0x0202 }
            java.lang.String r10 = r7.A03     // Catch:{ Exception -> 0x0202 }
            java.lang.String r7 = "credential-id"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0202 }
            if (r7 == 0) goto L_0x016b
            r27 = r10
            goto L_0x01b8
        L_0x016b:
            java.lang.String r7 = "account-number"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0202 }
            if (r7 == 0) goto L_0x0174
            goto L_0x01b6
        L_0x0174:
            java.lang.String r7 = "bank-name"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0202 }
            if (r7 == 0) goto L_0x017f
            r25 = r10
            goto L_0x01b8
        L_0x017f:
            java.lang.String r7 = "country"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0202 }
            if (r7 == 0) goto L_0x0189
            r14 = r10
            goto L_0x01b8
        L_0x0189:
            java.lang.String r7 = "default-debit"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0202 }
            java.lang.String r8 = "1"
            if (r7 == 0) goto L_0x0198
            boolean r17 = r10.equals(r8)     // Catch:{ Exception -> 0x0202 }
            goto L_0x01b8
        L_0x0198:
            java.lang.String r7 = "default-credit"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0202 }
            if (r7 == 0) goto L_0x01a5
            boolean r16 = r10.equals(r8)     // Catch:{ Exception -> 0x0202 }
            goto L_0x01b8
        L_0x01a5:
            java.lang.String r7 = "created"
            boolean r7 = r11.equals(r7)     // Catch:{ Exception -> 0x0202 }
            if (r7 == 0) goto L_0x01b8
            long r21 = X.C29501aj.A01(r10, r0)     // Catch:{ Exception -> 0x0202 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r21 = r21 * r7
            goto L_0x01b8
        L_0x01b6:
            r26 = r10
        L_0x01b8:
            int r12 = r12 + 1
            goto L_0x0155
        L_0x01bb:
            X.0wS r0 = r3.A06     // Catch:{ Exception -> 0x0202 }
            X.1Vx r0 = r0.A02(r14)     // Catch:{ Exception -> 0x0202 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ Exception -> 0x0202 }
            X.19r r0 = r0.AEp(r2)     // Catch:{ Exception -> 0x0202 }
            X.1tG r0 = r0.AI3()     // Catch:{ Exception -> 0x0202 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ Exception -> 0x0202 }
            X.173 r7 = r3.A02     // Catch:{ Exception -> 0x0202 }
            r1 = 0
            r0.A01(r7, r4, r1)     // Catch:{ Exception -> 0x0202 }
            X.1cm r18 = X.C30681cm.A00(r14)     // Catch:{ Exception -> 0x0202 }
            r19 = 0
            if (r17 == 0) goto L_0x01df
            r19 = 2
        L_0x01df:
            r20 = 0
            if (r16 == 0) goto L_0x01e5
            r20 = 2
        L_0x01e5:
            r23 = -1
            X.1m4 r4 = new X.1m4     // Catch:{ Exception -> 0x0202 }
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ Exception -> 0x0202 }
            r1 = r27
            r4.A0A = r1     // Catch:{ Exception -> 0x0202 }
            r1 = r26
            r4.A09(r1)     // Catch:{ Exception -> 0x0202 }
            r1 = r25
            r4.A0B = r1     // Catch:{ Exception -> 0x0202 }
            r4.A0D = r2     // Catch:{ Exception -> 0x0202 }
            r4.A08 = r0     // Catch:{ Exception -> 0x0202 }
            r2 = r4
            goto L_0x004f
        L_0x0202:
            r1 = move-exception
            java.lang.String r0 = "PAY: PaymentsProtoParser when creating bank account: "
        L_0x0205:
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x004f
        L_0x020a:
            java.lang.String r0 = "card"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            X.1lL[] r11 = r4.A0Q()
            r2 = 0
            if (r11 != 0) goto L_0x0220
            java.lang.String r0 = "PAY: PaymentsProtoParser when parsing card: attributes are null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x004f
        L_0x0220:
            r25 = r2
            r0 = -1
            r10 = 0
            r21 = 0
            r26 = 7
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r31 = 0
            r16 = 0
            r8 = r2
        L_0x0236:
            int r7 = r11.length
            r14 = 2
            if (r10 >= r7) goto L_0x02f0
            r7 = r11[r10]
            java.lang.String r13 = r7.A02
            java.lang.String r7 = r7.A03
            int r12 = r13.hashCode()
            switch(r12) {
                case -1485088175: goto L_0x02e5;
                case -387679965: goto L_0x02dd;
                case -387679962: goto L_0x02d6;
                case -129299872: goto L_0x02ce;
                case -65633415: goto L_0x02c6;
                case 3575610: goto L_0x02bd;
                case 102744158: goto L_0x02b5;
                case 270132229: goto L_0x02ad;
                case 957831062: goto L_0x02a4;
                case 1028554472: goto L_0x029b;
                case 1830091262: goto L_0x0292;
                case 1830091265: goto L_0x0289;
                default: goto L_0x0247;
            }
        L_0x0247:
            r14 = -1
        L_0x0248:
            java.lang.String r12 = "1"
            switch(r14) {
                case 0: goto L_0x0287;
                case 1: goto L_0x0282;
                case 2: goto L_0x027d;
                case 3: goto L_0x0278;
                case 4: goto L_0x0273;
                case 5: goto L_0x026e;
                case 6: goto L_0x026b;
                case 7: goto L_0x0266;
                case 8: goto L_0x0264;
                case 9: goto L_0x025a;
                case 10: goto L_0x0255;
                case 11: goto L_0x0250;
                default: goto L_0x024d;
            }
        L_0x024d:
            int r10 = r10 + 1
            goto L_0x0236
        L_0x0250:
            boolean r20 = r12.equals(r7)
            goto L_0x024d
        L_0x0255:
            boolean r17 = r12.equals(r7)
            goto L_0x024d
        L_0x025a:
            r0 = 0
            long r0 = X.C29501aj.A01(r7, r0)
            r12 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            goto L_0x024d
        L_0x0264:
            r8 = r7
            goto L_0x024d
        L_0x0266:
            boolean r19 = r12.equals(r7)
            goto L_0x024d
        L_0x026b:
            r25 = r7
            goto L_0x024d
        L_0x026e:
            int r26 = X.C35391lr.A04(r7)
            goto L_0x024d
        L_0x0273:
            int r31 = X.C35391lr.A05(r7)
            goto L_0x024d
        L_0x0278:
            boolean r21 = r12.equals(r7)
            goto L_0x024d
        L_0x027d:
            boolean r18 = r12.equals(r7)
            goto L_0x024d
        L_0x0282:
            boolean r16 = r12.equals(r7)
            goto L_0x024d
        L_0x0287:
            r2 = r7
            goto L_0x024d
        L_0x0289:
            java.lang.String r12 = "default-debit-p2p"
            boolean r12 = r13.equals(r12)
            r14 = 11
            goto L_0x02ec
        L_0x0292:
            java.lang.String r12 = "default-debit-p2m"
            boolean r12 = r13.equals(r12)
            r14 = 10
            goto L_0x02ec
        L_0x029b:
            java.lang.String r12 = "created"
            boolean r12 = r13.equals(r12)
            r14 = 9
            goto L_0x02ec
        L_0x02a4:
            java.lang.String r12 = "country"
            boolean r12 = r13.equals(r12)
            r14 = 8
            goto L_0x02ec
        L_0x02ad:
            java.lang.String r12 = "default-credit"
            boolean r12 = r13.equals(r12)
            r14 = 7
            goto L_0x02ec
        L_0x02b5:
            java.lang.String r12 = "last4"
            boolean r12 = r13.equals(r12)
            r14 = 6
            goto L_0x02ec
        L_0x02bd:
            java.lang.String r12 = "type"
            boolean r12 = r13.equals(r12)
            r14 = 5
            goto L_0x02ec
        L_0x02c6:
            java.lang.String r12 = "network-type"
            boolean r12 = r13.equals(r12)
            r14 = 4
            goto L_0x02ec
        L_0x02ce:
            java.lang.String r12 = "default-debit"
            boolean r12 = r13.equals(r12)
            r14 = 3
            goto L_0x02ec
        L_0x02d6:
            java.lang.String r12 = "default-credit-p2p"
            boolean r12 = r13.equals(r12)
            goto L_0x02ec
        L_0x02dd:
            java.lang.String r12 = "default-credit-p2m"
            boolean r12 = r13.equals(r12)
            r14 = 1
            goto L_0x02ec
        L_0x02e5:
            java.lang.String r12 = "credential-id"
            boolean r12 = r13.equals(r12)
            r14 = 0
        L_0x02ec:
            if (r12 != 0) goto L_0x0248
            goto L_0x0247
        L_0x02f0:
            X.0wS r7 = r3.A06
            X.1Vx r10 = r7.A02(r8)
            if (r10 != 0) goto L_0x030b
            java.lang.String r1 = "[PAY] : PaymentsProtoParser/parseCard unsupported country : "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x004e
        L_0x030b:
            r7 = 0
            X.19r r7 = r10.AEp(r7)
            X.1tE r7 = r7.AI4()
            X.AnonymousClass00B.A06(r7)
            X.173 r11 = r3.A02
            r10 = 0
            r7.A01(r11, r4, r10)
            X.1cm r22 = X.C30681cm.A00(r8)
            if (r21 != 0) goto L_0x0327
            r27 = 0
            if (r20 == 0) goto L_0x0329
        L_0x0327:
            r27 = 2
        L_0x0329:
            if (r19 != 0) goto L_0x032f
            r28 = 0
            if (r18 == 0) goto L_0x0331
        L_0x032f:
            r28 = 2
        L_0x0331:
            r29 = 0
            if (r17 == 0) goto L_0x0337
            r29 = 2
        L_0x0337:
            r30 = 0
            if (r16 == 0) goto L_0x033d
            r30 = 2
        L_0x033d:
            X.1lh r4 = r7.A08
            if (r4 != 0) goto L_0x0356
            r8 = 0
        L_0x0342:
            java.lang.String r8 = (java.lang.String) r8
            X.1lr r4 = new X.1lr
            r21 = r4
            r23 = r2
            r24 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r4.A05 = r0
            r4.A08 = r7
            r2 = r4
            goto L_0x004f
        L_0x0356:
            java.lang.Object r8 = r4.A00
            goto L_0x0342
        L_0x0359:
            java.lang.String r0 = "card"
            goto L_0x0365
        L_0x035c:
            java.lang.String r0 = "bank"
            goto L_0x0365
        L_0x035f:
            java.lang.String r0 = "merchant"
            goto L_0x0365
        L_0x0362:
            java.lang.String r0 = "wallet"
        L_0x0365:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x003e
        L_0x036e:
            r6 = 0
        L_0x036f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HB.A04(X.1Vv):java.util.ArrayList");
    }
}
