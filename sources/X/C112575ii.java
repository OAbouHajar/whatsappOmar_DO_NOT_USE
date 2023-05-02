package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5ii  reason: invalid class name and case insensitive filesystem */
public class C112575ii extends AnonymousClass61Y {
    public final C19980zJ A00;
    public final C14870pt A01;
    public final C15900s5 A02;
    public final C17130ua A03;
    public final C18890xQ A04;
    public final C18260wP A05;
    public final C16440t3 A06;
    public final AnonymousClass013 A07;
    public final C221116r A08;
    public final AnonymousClass173 A09;
    public final C14710pd A0A;
    public final C17190ug A0B;
    public final AnonymousClass60O A0C;
    public final C119365wy A0D;
    public final AnonymousClass60V A0E;
    public final C1200360b A0F;
    public final AnonymousClass175 A0G;
    public final C18340wX A0H;
    public final AnonymousClass17O A0I;
    public final C228019i A0J;
    public final C18490wm A0K;
    public final C18300wT A0L;
    public final AnonymousClass17Y A0M;
    public final C18310wU A0N;
    public final C18090w8 A0O;
    public final AnonymousClass61W A0P;
    public final AnonymousClass1GO A0Q;
    public final C1200660e A0R;
    public final C1200960h A0S;
    public final C227719f A0T;
    public final C112715ix A0U;
    public final AnonymousClass5xN A0V;
    public final C18280wR A0W;
    public final C16320sq A0X;

    public C112575ii(C19980zJ r9, C14870pt r10, C15900s5 r11, C17130ua r12, C18890xQ r13, C18260wP r14, C16000sG r15, C16080sP r16, C16440t3 r17, C16980tz r18, AnonymousClass013 r19, C221116r r20, AnonymousClass173 r21, C14710pd r22, C17190ug r23, AnonymousClass60O r24, C119365wy r25, AnonymousClass60V r26, C1200360b r27, AnonymousClass175 r28, C18340wX r29, AnonymousClass17O r30, C228019i r31, C18490wm r32, C18300wT r33, AnonymousClass17Y r34, C18310wU r35, C18090w8 r36, C18290wS r37, AnonymousClass61W r38, AnonymousClass1GO r39, C1200660e r40, C1200960h r41, C227719f r42, C112715ix r43, AnonymousClass5xN r44, C18280wR r45, C218315p r46, C16320sq r47) {
        super(r15, r16, r18, r37, r46, "UPI");
        this.A06 = r17;
        this.A04 = r13;
        this.A0A = r22;
        this.A01 = r10;
        this.A0X = r47;
        this.A03 = r12;
        this.A02 = r11;
        this.A00 = r9;
        this.A0B = r23;
        this.A07 = r19;
        this.A0W = r45;
        this.A0V = r44;
        this.A0L = r33;
        this.A0S = r41;
        this.A0G = r28;
        this.A0D = r25;
        this.A0N = r35;
        this.A0O = r36;
        this.A0R = r40;
        this.A09 = r21;
        this.A0Q = r39;
        this.A08 = r20;
        this.A0K = r32;
        this.A0C = r24;
        this.A0P = r38;
        this.A05 = r14;
        this.A0F = r27;
        this.A0H = r29;
        this.A0T = r42;
        this.A0E = r26;
        this.A0J = r31;
        this.A0I = r30;
        this.A0M = r34;
        this.A0U = r43;
    }

    public List AEL(AnonymousClass1Vt r12, C28381Vw r13) {
        ArrayList arrayList;
        List AEL = super.AEL(r12, r13);
        AnonymousClass1W2 r3 = r12.A0A;
        if (r3 instanceof C111855hW) {
            C111855hW r32 = (C111855hW) r3;
            if (!TextUtils.isEmpty(r32.A0P)) {
                arrayList = AnonymousClass000.A0u();
                C35081lL[] r8 = new C35081lL[1];
                C35081lL.A02("token", r32.A0P, r8, 0);
                C35421lu r0 = r32.A02;
                C28371Vv r2 = null;
                if (r0 != null) {
                    ArrayList A0u = AnonymousClass000.A0u();
                    if (!TextUtils.isEmpty(r0.A01)) {
                        C35421lu r22 = r32.A02;
                        C110105dW.A1P("order-id", r22.A01, A0u);
                        long j2 = r22.A00;
                        if (j2 != 0) {
                            A0u.add(new C35081lL("expiry-ts", j2));
                        }
                        r2 = new C28371Vv("order", C110115dX.A1F(A0u, 0));
                    }
                }
                arrayList.add(new C28371Vv(r2, "upi", r8));
                ArrayList A0u2 = AnonymousClass000.A0u();
                if (AEL != null && !AEL.isEmpty()) {
                    A0u2.addAll(AEL);
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    A0u2.addAll(arrayList);
                }
                return A0u2;
            }
        }
        arrayList = null;
        ArrayList A0u22 = AnonymousClass000.A0u();
        A0u22.addAll(AEL);
        A0u22.addAll(arrayList);
        return A0u22;
    }

    public int AG1() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r0.A0G() != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
        if (r1 == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        if (r9.A0O.A01(r12) == 2) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C42491xt AGq(X.C35511m3 r10, com.whatsapp.jid.UserJid r11, java.lang.String r12) {
        /*
            r9 = this;
            r7 = 0
            X.0pd r1 = r9.A0A
            r0 = 733(0x2dd, float:1.027E-42)
            boolean r0 = r1.A0C(r0)
            r6 = 0
            if (r0 == 0) goto L_0x00af
            X.175 r2 = r9.A0G
            boolean r0 = r2.A0E()
            if (r0 != 0) goto L_0x001a
            boolean r0 = r2.A0D()
            if (r0 == 0) goto L_0x00af
        L_0x001a:
            r8 = 1
        L_0x001b:
            java.util.HashMap r5 = X.AnonymousClass000.A0x()
            java.util.HashMap r4 = X.AnonymousClass000.A0x()
            java.lang.String r3 = ""
            if (r8 == 0) goto L_0x003b
            if (r10 == 0) goto L_0x00ad
            X.1t8 r0 = r10.A06()
            r2 = 3
            java.util.Map r0 = r0.A01
            java.lang.Object r2 = X.AnonymousClass000.A0Y(r0, r2)
        L_0x0034:
            java.lang.Integer r0 = X.C13680ns.A0Y()
            r5.put(r0, r2)
        L_0x003b:
            X.1GO r2 = r9.A0Q
            boolean r0 = r2.A0B()
            if (r0 == 0) goto L_0x007c
            r0 = 888(0x378, float:1.244E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x007c
            if (r11 == 0) goto L_0x0082
            X.0w8 r0 = r9.A0O
            int r1 = r0.A00(r11)
            r0 = 2
            if (r1 != r0) goto L_0x007c
            X.0sG r0 = r2.A04
            X.0sH r0 = r0.A08(r11)
            if (r0 == 0) goto L_0x007c
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x007c
        L_0x0064:
            r6 = 1
            if (r10 == 0) goto L_0x0079
            r1 = 3
            X.1tK r0 = r10.A03
            if (r0 != 0) goto L_0x0073
            X.1tK r0 = new X.1tK
            r0.<init>()
            r10.A03 = r0
        L_0x0073:
            java.util.Map r0 = r0.A01
            java.lang.Object r3 = X.AnonymousClass000.A0Y(r0, r1)
        L_0x0079:
            X.AnonymousClass3K2.A1Q(r3, r4, r6)
        L_0x007c:
            if (r8 != 0) goto L_0x00b2
            if (r6 != 0) goto L_0x00b2
            r0 = 0
            return r0
        L_0x0082:
            r0 = 2595(0xa23, float:3.636E-42)
            boolean r0 = r1.A0C(r0)
            r2 = 2
            if (r0 == 0) goto L_0x00a4
            if (r12 == 0) goto L_0x00a4
            java.lang.String r0 = "\\D"
            java.lang.String r1 = r12.replaceAll(r0, r3)
            java.lang.String r0 = "[0]?[6-9]\\d{9}$"
            boolean r1 = java.util.regex.Pattern.matches(r0, r1)
            X.0w8 r0 = r9.A0O
            int r0 = r0.A01(r12)
            if (r0 == r2) goto L_0x0064
            if (r1 == 0) goto L_0x007c
            goto L_0x0064
        L_0x00a4:
            X.0w8 r0 = r9.A0O
            int r0 = r0.A01(r12)
            if (r0 != r2) goto L_0x007c
            goto L_0x0064
        L_0x00ad:
            r2 = r3
            goto L_0x0034
        L_0x00af:
            r8 = 0
            goto L_0x001b
        L_0x00b2:
            X.1xt r0 = new X.1xt
            r0.<init>(r7, r11, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112575ii.AGq(X.1m3, com.whatsapp.jid.UserJid, java.lang.String):X.1xt");
    }
}
