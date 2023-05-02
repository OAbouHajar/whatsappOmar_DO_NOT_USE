package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.redex.IDxCListenerShape27S0300000_3_I1;
import com.facebook.redex.IDxCListenerShape33S0200000_3_I1;
import com.facebook.redex.IDxICallbackShape7S1200000_3_I1;
import com.obwhatsapp.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5nF  reason: invalid class name and case insensitive filesystem */
public class C114175nF extends C110755em {
    public String A00;
    public boolean A01;
    public final C15900s5 A02;
    public final C16440t3 A03;
    public final C14710pd A04;
    public final AnonymousClass60O A05;
    public final C119365wy A06;
    public final AnonymousClass60V A07;
    public final AnonymousClass17Y A08;
    public final C112355iM A09;
    public final C112285iF A0A;
    public final C112225i9 A0B;
    public final AnonymousClass1MB A0C;
    public final C1200960h A0D;
    public final AnonymousClass5xN A0E;
    public final AnonymousClass1HB A0F;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C114175nF(android.os.Bundle r50, X.C16300so r51, X.C14870pt r52, X.C16040sK r53, X.C15900s5 r54, X.C17150uc r55, X.AnonymousClass1ME r56, X.AnonymousClass01Y r57, X.C16000sG r58, X.AnonymousClass01V r59, X.C16440t3 r60, X.C16980tz r61, X.AnonymousClass013 r62, X.C16460t6 r63, X.C17630vO r64, X.C221116r r65, X.AnonymousClass173 r66, X.AnonymousClass160 r67, X.C14710pd r68, X.C17190ug r69, X.C1204661t r70, X.AnonymousClass60O r71, X.C119365wy r72, X.AnonymousClass60V r73, X.AnonymousClass107 r74, X.AnonymousClass175 r75, X.C18340wX r76, X.C18300wT r77, X.AnonymousClass17Y r78, X.C18310wU r79, X.C18090w8 r80, X.C18290wS r81, X.AnonymousClass1MA r82, X.C1222969a r83, X.AnonymousClass1MB r84, X.AnonymousClass1GO r85, X.C1200960h r86, X.C112715ix r87, X.AnonymousClass5wT r88, X.AnonymousClass5xN r89, X.C18280wR r90, X.C218315p r91, X.AnonymousClass1HB r92, X.C16320sq r93) {
        /*
            r49 = this;
            r8 = r49
            r1 = r78
            r28 = r77
            r27 = r75
            r26 = r74
            r25 = r70
            r24 = r67
            r23 = r66
            r22 = r65
            r21 = r64
            r31 = r81
            r10 = r52
            r32 = r82
            r11 = r53
            r33 = r83
            r12 = r55
            r34 = r85
            r13 = r56
            r14 = r57
            r15 = r58
            r35 = r88
            r16 = r59
            r0 = r60
            r6 = r61
            r36 = r91
            r19 = r62
            r20 = r63
            r37 = r93
            r30 = r80
            r9 = r50
            r29 = r1
            r17 = r0
            r18 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r8.A03 = r0
            r0 = r54
            r8.A02 = r0
            r0 = r68
            r8.A04 = r0
            r0 = r89
            r8.A0E = r0
            r0 = r86
            r8.A0D = r0
            r3 = r92
            r8.A0F = r3
            r5 = r72
            r8.A06 = r5
            r7 = r71
            r8.A05 = r7
            r4 = r73
            r8.A07 = r4
            r8.A08 = r1
            r0 = r84
            r8.A0C = r0
            android.content.Context r2 = r6.A00
            X.4XO r18 = new X.4XO
            r18.<init>()
            r1 = 0
            X.5iM r0 = new X.5iM
            r17 = r76
            r15 = r69
            r21 = r90
            r13 = r51
            r19 = r79
            r11 = r0
            r12 = r2
            r14 = r10
            r16 = r4
            r20 = r1
            r22 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r8.A09 = r0
            X.5iF r0 = new X.5iF
            r47 = r87
            r38 = r0
            r39 = r2
            r40 = r10
            r41 = r23
            r42 = r15
            r43 = r7
            r44 = r5
            r45 = r17
            r46 = r19
            r48 = r21
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r8.A0A = r0
            X.5i9 r0 = new X.5i9
            r11 = r0
            r12 = r10
            r13 = r6
            r14 = r5
            r15 = r17
            r16 = r19
            r17 = r31
            r18 = r3
            r19 = r37
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r8.A0B = r0
            if (r50 == 0) goto L_0x00d3
            java.lang.String r0 = "extra_return_after_completion"
            boolean r0 = r9.getBoolean(r0)
            r8.A01 = r0
            java.lang.String r0 = "referral_screen"
            java.lang.String r0 = r9.getString(r0, r1)
            r8.A00 = r0
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114175nF.<init>(android.os.Bundle, X.0so, X.0pt, X.0sK, X.0s5, X.0uc, X.1ME, X.01Y, X.0sG, X.01V, X.0t3, X.0tz, X.013, X.0t6, X.0vO, X.16r, X.173, X.160, X.0pd, X.0ug, X.61t, X.60O, X.5wy, X.60V, X.107, X.175, X.0wX, X.0wT, X.17Y, X.0wU, X.0w8, X.0wS, X.1MA, X.69a, X.1MB, X.1GO, X.60h, X.5ix, X.5wT, X.5xN, X.0wR, X.15p, X.1HB, X.0sq):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r0 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A09(X.AnonymousClass1Vt r3) {
        /*
            r2 = this;
            X.1W2 r1 = r3.A0A
            X.5hW r1 = (X.C111855hW) r1
            com.whatsapp.jid.UserJid r0 = r3.A0E
            if (r0 != 0) goto L_0x0013
            if (r1 == 0) goto L_0x0013
            java.lang.String r0 = r1.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            boolean r0 = r3.A0E()
            if (r0 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r3.A0F
            boolean r0 = X.AnonymousClass1W1.A09(r0)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r3.A0F
            return r0
        L_0x0027:
            java.lang.String r0 = r3.A0K
            return r0
        L_0x002a:
            java.lang.String r0 = super.A09(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114175nF.A09(X.1Vt):java.lang.String");
    }

    public void A0A() {
        String str;
        AnonymousClass1Vo r2 = this.A0f;
        r2.A06("IN- HANDLE_SEND_AGAIN start");
        C117415sx r0 = this.A07;
        if (r0 != null) {
            AnonymousClass1Vt r02 = r0.A01;
            if (r02 != null) {
                boolean z2 = r02.A0P;
                if (z2) {
                    r2.A06("IN- HANDLE_SEND_AGAIN transaction is not null and it's interop");
                    AnonymousClass1W2 r1 = this.A07.A01.A0A;
                    String str2 = r1 instanceof C111855hW ? ((C111855hW) r1).A0J : "";
                    if (AnonymousClass5x5.A00(str2)) {
                        C35301lh A0K = C110105dW.A0K(str2);
                        if (!this.A05.AId(A0K)) {
                            A0S(true);
                            this.A0A.A01(A0K, (C35301lh) null, new IDxICallbackShape7S1200000_3_I1(A0K, str2, this, 0));
                            return;
                        }
                        r2.A06("IN- HANDLE_SEND_AGAIN user blocked checked locally");
                        C117725tS A002 = C117725tS.A00(13);
                        A002.A0F = str2;
                        C110755em.A01(this, A002);
                        return;
                    }
                    r2.A06("IN- HANDLE_SEND_AGAIN vpa valid check locally, incorrect vpa");
                    C117725tS A003 = C117725tS.A00(8);
                    A003.A0C = this.A0P.A00.getString(R.string.str0f65);
                    C110755em.A01(this, A003);
                    return;
                }
                StringBuilder A0r = AnonymousClass000.A0r("IN- HANDLE_SEND_AGAIN isInterop is ");
                A0r.append(z2);
                str = A0r.toString();
            } else {
                str = "IN- HANDLE_SEND_AGAIN transactionInfo is null?";
            }
        } else {
            str = "IN- HANDLE_SEND_AGAIN transactionDetailData is null?";
        }
        r2.A06(str);
        r2.A06("IN- HANDLE_SEND_AGAIN calling super");
        super.A0A();
    }

    public void A0C() {
        AnonymousClass1Vt r1;
        C111855hW r0;
        C117415sx r02 = this.A07;
        if (!(r02 == null || (r1 = r02.A01) == null || (r0 = (C111855hW) r1.A0A) == null || r0.A0B == null)) {
            int i2 = r1.A02;
            int i3 = R.string.str1937;
            if (i2 == 115) {
                i3 = R.string.str143a;
            }
            this.A01 = i3;
        }
        super.A0C();
    }

    public void A0F(C114015mz r7) {
        if (!A0f()) {
            super.A0F(r7);
            return;
        }
        AnonymousClass1Vt r5 = this.A07.A01;
        AnonymousClass1yE A052 = C218315p.A05(r5);
        C16980tz r1 = this.A0P;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A052.iconType);
        Typeface A022 = AnonymousClass00X.A02(r1.A00);
        if (A022 != null) {
            spannableStringBuilder.setSpan(new C39771t2(A022), 0, A052.iconType.length(), 0);
        }
        r7.A03 = spannableStringBuilder;
        r7.A01 = C218315p.A01(r5);
        r7.A00 = 30.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        r0 = (r0 = r2.A07).A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.C116275r7 r3) {
        /*
            r2 = this;
            int r1 = r3.A00
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 == r0) goto L_0x005c
            r0 = 301(0x12d, float:4.22E-43)
            if (r1 == r0) goto L_0x000e
            super.A0G(r3)
            return
        L_0x000e:
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x002f
            r0 = 101(0x65, float:1.42E-43)
            X.5nA r1 = new X.5nA
            r1.<init>(r0)
            X.1Vw r0 = r2.A08
            java.lang.String r0 = r0.A01
            r1.A02 = r0
            java.lang.String r0 = r2.A0D
            r1.A05 = r0
            java.lang.String r0 = "SUBMITTED"
            r1.A04 = r0
            java.lang.String r0 = "00"
            r1.A03 = r0
        L_0x002b:
            X.C110755em.A01(r2, r1)
            return
        L_0x002f:
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "chat"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "payment_composer_icon"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0055
        L_0x0041:
            X.5sx r0 = r2.A07
            if (r0 == 0) goto L_0x0055
            X.1Vt r0 = r0.A01
            if (r0 == 0) goto L_0x0055
            boolean r0 = r0.A0P
            if (r0 == 0) goto L_0x0055
            r0 = 106(0x6a, float:1.49E-43)
            X.5nA r1 = new X.5nA
            r1.<init>(r0)
            goto L_0x002b
        L_0x0055:
            r0 = 19
            X.5tS r1 = X.C117725tS.A00(r0)
            goto L_0x002b
        L_0x005c:
            r0 = 0
            r2.A0T(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114175nF.A0G(X.5r7):void");
    }

    public void A0I(List list) {
        int i2;
        AnonymousClass5xC r0;
        C117415sx r02 = this.A07;
        AnonymousClass1Vt r8 = r02.A01;
        C111855hW A0K = C110115dX.A0K(r8);
        AnonymousClass00B.A06(r02);
        C30671cl r7 = r02.A00;
        List list2 = list;
        if (r8.A03 == 40 && (r0 = A0K.A0B) != null && r0.A0L) {
            A0a(r8, A0K, list, false);
            A0X(r8, A0K, list);
            A0b(r8, list);
            A0Y(r8, A0K, list);
            A0d(list);
            A0Z(r8, A0K, list);
            A0K(list);
            C110755em.A02(list);
            A0W(r7, r8, A0K, list2, true);
            C110755em.A02(list);
            A0O(list);
            C110755em.A02(list);
        } else if (!TextUtils.isEmpty(A0K.A0G)) {
            if (r8.A02 == 12) {
                C113715mV r4 = new C113715mV();
                Context context = this.A0P.A00;
                r4.A02 = context.getString(R.string.str1939);
                String A9I = C35481m0.A05.A9I(this.A0Q, new BigDecimal(this.A04.A02(1650)), 0);
                Object[] A1Z = C13690nt.A1Z();
                A1Z[0] = A9I;
                r4.A01 = C13680ns.A0d(context, AnonymousClass1ZW.A06(context, R.color.color007f), A1Z, 1, R.string.str1938);
                r4.A00 = new IDxCListenerShape33S0200000_3_I1(r8, 26, this);
                list.add(r4);
            }
            A0P(list);
            if (!"mandate_payment_screen".equals(this.A00)) {
                C110755em.A02(list);
                AnonymousClass1W2 r3 = r8.A0A;
                AnonymousClass00B.A06(r3);
                C113885mm r2 = new C113885mm();
                r2.A01 = this.A0P.A00.getString(R.string.str18cf);
                r2.A00 = new IDxCListenerShape27S0300000_3_I1(r8, r3, this, 3);
                list.add(r2);
            }
            A0R(list);
            C110755em.A02(list);
            A0O(list);
            A0Q(list);
        } else {
            super.A0I(list);
            i2 = 1000;
            list.add(new C113745mY(i2));
        }
        i2 = 1007;
        list.add(new C113745mY(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00da, code lost:
        r2.A00 = com.obwhatsapp.R.drawable.ic_hours;
        r8 = r5.A0P;
        r2.A04 = r8.A02(com.obwhatsapp.R.string.str1952);
        r0 = com.obwhatsapp.R.string.str1951;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ed, code lost:
        r2.A02 = r8.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f3, code lost:
        r2.A03 = X.C13680ns.A0d(r8.A00, X.C28891Zc.A03(r5.A0Q, r5.A03.A02(r7.A01)), new java.lang.Object[1], 0, com.obwhatsapp.R.string.str063a);
        r2.A05 = true;
        r2.A07 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(java.util.List r18) {
        /*
            r17 = this;
            r5 = r17
            r6 = r18
            r5.A0H(r6)
            r5.A0M(r6)
            r5.A0J(r6)
            r5.A0L(r6)
            r5.A0N(r6)
            boolean r0 = r5.A0f()
            if (r0 == 0) goto L_0x00ae
            X.5sx r0 = r5.A07
            X.1Vt r8 = r0.A01
            int r4 = r8.A02
            X.5ml r3 = new X.5ml
            r3.<init>()
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r3.A00 = r0
            r2 = 0
            r7 = 0
        L_0x002c:
            java.util.List r0 = r3.A00
            r16 = r0
            X.5wT r13 = r5.A0h
            X.0t3 r10 = r5.A03
            X.5t6 r9 = new X.5t6
            r9.<init>()
            X.15p r0 = r13.A04
            java.lang.String r14 = r0.A0N(r8)
            long r0 = r8.A05
            java.lang.CharSequence r11 = r13.A01(r10, r0)
            r0 = 403(0x193, float:5.65E-43)
            r12 = 0
            r15 = 2
            r1 = 1
            if (r4 == r0) goto L_0x027d
            r0 = 408(0x198, float:5.72E-43)
            if (r4 == r0) goto L_0x020c
            r0 = 405(0x195, float:5.68E-43)
            if (r4 == r0) goto L_0x01eb
            r0 = 406(0x196, float:5.69E-43)
            if (r4 == r0) goto L_0x01d8
            switch(r4) {
                case 422: goto L_0x020c;
                case 423: goto L_0x0251;
                case 424: goto L_0x0222;
                default: goto L_0x005b;
            }
        L_0x005b:
            if (r7 == 0) goto L_0x02b1
            if (r7 == r1) goto L_0x01c8
            if (r7 != r15) goto L_0x008a
            r11 = 2131231935(0x7f0804bf, float:1.8079965E38)
            X.0tz r0 = r13.A01
            android.content.Context r12 = r0.A00
            r10 = 2131892208(0x7f1217f0, float:1.9419158E38)
        L_0x006b:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r12 = X.C13680ns.A0d(r12, r14, r0, r2, r10)
        L_0x0071:
            r10 = 0
        L_0x0072:
            r1 = 2131101170(0x7f0605f2, float:1.7814742E38)
        L_0x0075:
            r0 = 2131101280(0x7f060660, float:1.7814965E38)
            r9.A03 = r0
            r0 = 2131101381(0x7f0606c5, float:1.781517E38)
            r9.A02 = r0
            r9.A01 = r11
            r9.A05 = r12
            if (r10 != 0) goto L_0x0086
            r10 = 0
        L_0x0086:
            r9.A04 = r10
            r9.A00 = r1
        L_0x008a:
            r0 = r16
            r0.add(r9)
            int r7 = r7 + 1
            r0 = 3
            if (r7 < r0) goto L_0x002c
            r0 = 422(0x1a6, float:5.91E-43)
            if (r4 == r0) goto L_0x00a9
            r0 = 423(0x1a7, float:5.93E-43)
            if (r4 == r0) goto L_0x00a9
            r0 = 406(0x196, float:5.69E-43)
            if (r4 == r0) goto L_0x00a9
            r0 = 408(0x198, float:5.72E-43)
            if (r4 == r0) goto L_0x00a9
            r0 = 424(0x1a8, float:5.94E-43)
            if (r4 == r0) goto L_0x00a9
            r2 = 1
        L_0x00a9:
            r3.A01 = r2
            r6.add(r3)
        L_0x00ae:
            boolean r0 = r5.A0f()
            if (r0 == 0) goto L_0x0115
            X.5sx r0 = r5.A07
            X.1Vt r9 = r0.A01
            X.1W2 r0 = r9.A0A
            X.5hW r0 = (X.C111855hW) r0
            X.609 r7 = r0.A0C
            if (r7 == 0) goto L_0x0115
            long r0 = r7.A00
            boolean r12 = r7.A03
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0154
            X.5mw r2 = new X.5mw
            r2.<init>()
            java.lang.String r1 = r7.A02
            int r0 = r1.hashCode()
            r4 = 0
            r3 = 1
            switch(r0) {
                case -828048883: goto L_0x0119;
                case 441297912: goto L_0x0132;
                default: goto L_0x00da;
            }
        L_0x00da:
            r0 = 2131231700(0x7f0803d4, float:1.8079488E38)
            r2.A00 = r0
            X.0tz r8 = r5.A0P
            r0 = 2131892562(0x7f121952, float:1.9419876E38)
            java.lang.String r0 = r8.A02(r0)
            r2.A04 = r0
            r0 = 2131892561(0x7f121951, float:1.9419874E38)
        L_0x00ed:
            java.lang.String r0 = r8.A02(r0)
            r2.A02 = r0
        L_0x00f3:
            android.content.Context r12 = r8.A00
            r11 = 2131887674(0x7f12063a, float:1.9409962E38)
            java.lang.Object[] r10 = new java.lang.Object[r3]
            X.013 r9 = r5.A0Q
            X.0t3 r8 = r5.A03
            long r0 = r7.A01
            long r0 = r8.A02(r0)
            java.lang.String r0 = X.C28891Zc.A03(r9, r0)
            java.lang.String r0 = X.C13680ns.A0d(r12, r0, r10, r4, r11)
            r2.A03 = r0
            r2.A05 = r3
            r2.A07 = r3
        L_0x0112:
            r6.add(r2)
        L_0x0115:
            r5.A0K(r6)
            return
        L_0x0119:
            java.lang.String r0 = "TRANSACTION_CLOSED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00da
            r0 = 2131231919(0x7f0804af, float:1.8079933E38)
            r2.A00 = r0
            X.0tz r8 = r5.A0P
            r0 = 2131892564(0x7f121954, float:1.941988E38)
            java.lang.String r0 = r8.A02(r0)
            r2.A04 = r0
            goto L_0x00f3
        L_0x0132:
            java.lang.String r0 = "RESOLVED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00da
            r0 = 2131231919(0x7f0804af, float:1.8079933E38)
            r2.A00 = r0
            X.0tz r8 = r5.A0P
            r0 = 2131892564(0x7f121954, float:1.941988E38)
            java.lang.String r0 = r8.A02(r0)
            r2.A04 = r0
            int r1 = r9.A02
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x00f3
            r0 = 2131892563(0x7f121953, float:1.9419878E38)
            goto L_0x00ed
        L_0x0154:
            long r2 = r9.A05
            X.0w8 r0 = r5.A0b
            X.0pd r4 = r0.A03
            r0 = 1422(0x58e, float:1.993E-42)
            int r0 = r4.A02(r0)
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
            X.0t3 r7 = r5.A03
            long r10 = r7.A00()
            long r0 = r8.toMillis(r0)
            long r2 = r2 + r0
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x01ae
            if (r12 == 0) goto L_0x0115
            X.5mw r2 = new X.5mw
            r2.<init>()
            r11 = 0
            r2.A07 = r11
            r0 = 1421(0x58d, float:1.991E-42)
            int r0 = r4.A02(r0)
            long r0 = (long) r0
            long r3 = r9.A05
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MINUTES
            long r7 = r7.A00()
            long r0 = r10.toMillis(r0)
            long r3 = r3 + r0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x01a2
            r0 = 1
            r2.A06 = r0
            r1 = 27
            com.facebook.redex.IDxCListenerShape33S0200000_3_I1 r0 = new com.facebook.redex.IDxCListenerShape33S0200000_3_I1
            r0.<init>(r9, r1, r5)
            r2.A01 = r0
            goto L_0x0112
        L_0x01a2:
            r2.A06 = r11
            r0 = 126(0x7e, float:1.77E-43)
            com.facebook.redex.IDxCListenerShape135S0100000_3_I1 r0 = X.C110115dX.A06(r5, r0)
            r2.A01 = r0
            goto L_0x0112
        L_0x01ae:
            if (r12 == 0) goto L_0x0115
            X.5mw r2 = new X.5mw
            r2.<init>()
            X.0tz r1 = r5.A0P
            r0 = 2131892566(0x7f121956, float:1.9419884E38)
            java.lang.String r0 = r1.A02(r0)
            r2.A02 = r0
            r0 = 0
            r2.A05 = r0
            r0 = 1
            r2.A07 = r0
            goto L_0x0112
        L_0x01c8:
            r11 = 2131231936(0x7f0804c0, float:1.8079967E38)
            X.0tz r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131892207(0x7f1217ef, float:1.9419156E38)
            java.lang.String r12 = r1.getString(r0)
            goto L_0x0071
        L_0x01d8:
            if (r7 == 0) goto L_0x02b1
            if (r7 != r1) goto L_0x026f
            r11 = 2131231934(0x7f0804be, float:1.8079963E38)
            X.0tz r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131892205(0x7f1217ed, float:1.9419152E38)
            java.lang.String r12 = r1.getString(r0)
            goto L_0x024f
        L_0x01eb:
            if (r7 == 0) goto L_0x02b1
            if (r7 == r1) goto L_0x028f
            if (r7 != r15) goto L_0x008a
            r11 = 2131231933(0x7f0804bd, float:1.807996E38)
            X.0tz r0 = r13.A01
            android.content.Context r15 = r0.A00
            r12 = 2131892216(0x7f1217f8, float:1.9419174E38)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r12 = X.C13680ns.A0d(r15, r14, r0, r2, r12)
            long r0 = r8.A06
            java.lang.CharSequence r10 = r13.A01(r10, r0)
            r1 = 2131101207(0x7f060617, float:1.7814817E38)
            goto L_0x0075
        L_0x020c:
            if (r7 == 0) goto L_0x02b1
            if (r7 != r1) goto L_0x023d
            r11 = 2131231933(0x7f0804bd, float:1.807996E38)
            X.0tz r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131892215(0x7f1217f7, float:1.9419172E38)
            java.lang.String r12 = r1.getString(r0)
            r0 = 2131892210(0x7f1217f2, float:1.9419162E38)
            goto L_0x0237
        L_0x0222:
            if (r7 == 0) goto L_0x02b1
            if (r7 != r1) goto L_0x023d
            r11 = 2131231936(0x7f0804c0, float:1.8079967E38)
            X.0tz r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131892215(0x7f1217f7, float:1.9419172E38)
            java.lang.String r12 = r1.getString(r0)
            r0 = 2131892211(0x7f1217f3, float:1.9419164E38)
        L_0x0237:
            java.lang.String r10 = r1.getString(r0)
            goto L_0x0072
        L_0x023d:
            if (r7 != r15) goto L_0x008a
            r11 = 2131231934(0x7f0804be, float:1.8079963E38)
            X.0tz r0 = r13.A01
            android.content.Context r12 = r0.A00
            r10 = 2131892206(0x7f1217ee, float:1.9419154E38)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r12 = X.C13680ns.A0d(r12, r14, r0, r2, r10)
        L_0x024f:
            r10 = 0
            goto L_0x026a
        L_0x0251:
            if (r7 == 0) goto L_0x02b1
            if (r7 != r1) goto L_0x026f
            r11 = 2131231934(0x7f0804be, float:1.8079963E38)
            X.0tz r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131892213(0x7f1217f5, float:1.9419168E38)
            java.lang.String r12 = r1.getString(r0)
            r0 = 2131892212(0x7f1217f4, float:1.9419166E38)
            java.lang.String r10 = r1.getString(r0)
        L_0x026a:
            r1 = 2131101208(0x7f060618, float:1.781482E38)
            goto L_0x0075
        L_0x026f:
            if (r7 != r15) goto L_0x008a
            r11 = 2131231934(0x7f0804be, float:1.8079963E38)
            X.0tz r0 = r13.A01
            android.content.Context r12 = r0.A00
            r10 = 2131892206(0x7f1217ee, float:1.9419154E38)
            goto L_0x006b
        L_0x027d:
            if (r7 == 0) goto L_0x02b1
            if (r7 == r1) goto L_0x028f
            if (r7 != r15) goto L_0x008a
            r11 = 2131231936(0x7f0804c0, float:1.8079967E38)
            X.0tz r0 = r13.A01
            android.content.Context r12 = r0.A00
            r10 = 2131892209(0x7f1217f1, float:1.941916E38)
            goto L_0x006b
        L_0x028f:
            X.0tz r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131892215(0x7f1217f7, float:1.9419172E38)
            java.lang.String r10 = r1.getString(r0)
            r1 = 2131231933(0x7f0804bd, float:1.807996E38)
            r0 = 2131100877(0x7f0604cd, float:1.7814148E38)
            r9.A00 = r0
            r0 = 2131101206(0x7f060616, float:1.7814815E38)
            r9.A03 = r0
            r9.A02 = r0
            r9.A01 = r1
            r9.A05 = r10
            r9.A04 = r12
            goto L_0x008a
        L_0x02b1:
            X.0tz r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131892214(0x7f1217f6, float:1.941917E38)
            java.lang.String r10 = r1.getString(r0)
            r1 = 2131231933(0x7f0804bd, float:1.807996E38)
            r0 = 2131100877(0x7f0604cd, float:1.7814148E38)
            r9.A00 = r0
            r0 = 2131101206(0x7f060616, float:1.7814815E38)
            r9.A03 = r0
            r9.A02 = r0
            r9.A01 = r1
            r9.A05 = r10
            if (r11 != 0) goto L_0x02d2
            r11 = 0
        L_0x02d2:
            r9.A04 = r11
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114175nF.A0P(java.util.List):void");
    }

    public boolean A0U(AnonymousClass1Vt r3) {
        C111855hW r1 = (C111855hW) r3.A0A;
        if (r1 == null || (TextUtils.isEmpty(r1.A0G) && r1.A0B == null)) {
            return super.A0U(r3);
        }
        return false;
    }

    public final void A0V() {
        A0S(true);
        AnonymousClass1MB r3 = this.A0C;
        String str = this.A07.A01.A0K;
        AnonymousClass61Z r1 = new AnonymousClass61Z(this);
        if (!TextUtils.isEmpty(str)) {
            ArrayList A0u = AnonymousClass000.A0u();
            A0u.add(str);
            r3.A02(r1, A0u);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r1 != 418) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(X.C30671cl r19, X.AnonymousClass1Vt r20, X.C111855hW r21, java.util.List r22, boolean r23) {
        /*
            r18 = this;
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()
            r17 = 401(0x191, float:5.62E-43)
            r5 = r18
            r4 = r19
            r13 = r20
            if (r19 == 0) goto L_0x0020
            int r1 = r13.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x01d0
            r0 = 415(0x19f, float:5.82E-43)
            if (r1 == r0) goto L_0x01dd
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x01d0
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x01d0
        L_0x0020:
            r7 = r21
            X.5xC r10 = r7.A0B
            X.AnonymousClass00B.A06(r10)
            X.5xN r4 = r5.A0E
            long r0 = r10.A01
            X.5x8 r2 = r10.A0B
            r9 = 1
            r8 = 0
            boolean r16 = X.AnonymousClass000.A1V(r2)
            java.lang.String r2 = r10.A0E
            boolean r2 = X.AnonymousClass5xN.A02(r2)
            if (r2 == 0) goto L_0x01ca
            X.0t3 r12 = r4.A01
            java.lang.String r2 = "Asia/Kolkata"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            int r2 = r2.getRawOffset()
            long r2 = (long) r2
            long r0 = r0 - r2
            long r0 = r12.A02(r0)
            X.013 r11 = r4.A03
            java.lang.String r3 = X.C28891Zc.A05(r11, r0)
            java.lang.String r1 = r10.A0E
            java.lang.String r0 = "DAILY"
            boolean r0 = r1.equals(r0)
            r14 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L_0x01a1
            java.lang.String r0 = "ASPRESENTED"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0197
            long r2 = r10.A04
            long r0 = r10.A03
            r15 = 0
            int r14 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x0185
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x0185
            X.0tz r14 = r4.A02
            android.content.Context r14 = r14.A00
            r16 = r14
            r15 = 2131892494(0x7f12190e, float:1.9419738E38)
            java.lang.Object[] r14 = X.C13690nt.A1Z()
            java.lang.String r2 = X.AnonymousClass5xN.A00(r12, r11, r2)
            r14[r8] = r2
            java.lang.String r1 = X.AnonymousClass5xN.A00(r12, r11, r0)
            r0 = r16
            java.lang.String r3 = X.C13680ns.A0d(r0, r1, r14, r9, r15)
        L_0x0092:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00af
            X.5mv r2 = new X.5mv
            r2.<init>()
            X.0tz r0 = r5.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131892505(0x7f121919, float:1.941976E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A04 = r0
            r2.A03 = r3
            r6.add(r2)
        L_0x00af:
            java.util.HashSet r2 = X.C13680ns.A0o()
            r0 = 5
            java.lang.Integer[] r3 = new java.lang.Integer[r0]
            r0 = 115(0x73, float:1.61E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11 = 0
            r3[r8] = r0
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r12 = 1
            r3[r9] = r17
            r1 = 2
            r0 = 417(0x1a1, float:5.84E-43)
            X.AnonymousClass000.A1M(r3, r0, r1)
            r1 = 3
            r0 = 20
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            r3[r1] = r16
            r1 = 4
            r0 = 418(0x1a2, float:5.86E-43)
            X.AnonymousClass000.A1M(r3, r0, r1)
            java.util.Collections.addAll(r2, r3)
            int r0 = r13.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0107
            X.5mv r2 = new X.5mv
            r2.<init>()
            X.0tz r0 = r5.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131892452(0x7f1218e4, float:1.9419653E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A04 = r0
            java.lang.String r0 = r10.A0E
            java.lang.String r0 = r4.A06(r0)
            r2.A03 = r0
            r6.add(r2)
        L_0x0107:
            int r1 = r13.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0153
            r0 = 20
            if (r1 == r0) goto L_0x0153
            java.lang.String r0 = r10.A0E
            boolean r0 = X.AnonymousClass5xN.A02(r0)
            if (r0 == 0) goto L_0x0153
            X.5mv r9 = new X.5mv
            r9.<init>()
            X.0tz r0 = r5.A0P
            android.content.Context r8 = r0.A00
            r0 = 2131892528(0x7f121930, float:1.9419807E38)
            java.lang.String r0 = r8.getString(r0)
            r9.A04 = r0
            java.lang.Object[] r15 = new java.lang.Object[r12]
            X.0t3 r14 = r5.A03
            long r0 = r10.A01
            java.lang.String r2 = "Asia/Kolkata"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            int r2 = r2.getRawOffset()
            long r2 = (long) r2
            long r0 = r0 - r2
            long r0 = r14.A02(r0)
            X.013 r2 = r4.A03
            java.lang.String r1 = X.C28891Zc.A05(r2, r0)
            r0 = 2131892527(0x7f12192f, float:1.9419805E38)
            java.lang.String r0 = X.C13680ns.A0d(r8, r1, r15, r11, r0)
            r9.A03 = r0
            r6.add(r9)
        L_0x0153:
            int r0 = r13.A02
            r5.A0c(r7, r6, r0)
            r5.A0e(r6)
            X.5r4 r0 = r5.A06()
            if (r0 == 0) goto L_0x0164
            r6.add(r0)
        L_0x0164:
            int r0 = r6.size()
            r2 = r22
            if (r11 >= r0) goto L_0x01fd
            java.lang.Object r0 = r6.get(r11)
            r2.add(r0)
            int r0 = r6.size()
            int r0 = r0 - r12
            if (r11 == r0) goto L_0x0182
            X.5mZ r0 = new X.5mZ
            r0.<init>()
            r2.add(r0)
        L_0x0182:
            int r11 = r11 + 1
            goto L_0x0164
        L_0x0185:
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x018f
            java.lang.String r3 = X.AnonymousClass5xN.A00(r12, r11, r2)
            goto L_0x0092
        L_0x018f:
            java.lang.String r0 = "[PAY]IndiaMandateUtils/getPayeeMetadataDueDateDesc next payment date info is unavailable"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3 = 0
            goto L_0x0092
        L_0x0197:
            if (r16 != 0) goto L_0x01b2
            X.0tz r0 = r4.A02
            android.content.Context r2 = r0.A00
            r1 = 2131892491(0x7f12190b, float:1.9419732E38)
            goto L_0x01aa
        L_0x01a1:
            if (r16 != 0) goto L_0x01b2
            X.0tz r0 = r4.A02
            android.content.Context r2 = r0.A00
            r1 = 2131892492(0x7f12190c, float:1.9419734E38)
        L_0x01aa:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r3 = X.C13680ns.A0d(r2, r3, r0, r8, r1)
            goto L_0x0092
        L_0x01b2:
            X.0tz r0 = r4.A02
            android.content.Context r12 = r0.A00
            r3 = 2131892493(0x7f12190d, float:1.9419736E38)
            java.lang.Object[] r2 = new java.lang.Object[r9]
            X.5x8 r0 = r10.A0B
            long r0 = r0.A00
            long r0 = r0 / r14
            java.lang.String r0 = X.C28891Zc.A05(r11, r0)
            java.lang.String r3 = X.C13680ns.A0d(r12, r0, r2, r8, r3)
            goto L_0x0092
        L_0x01ca:
            java.lang.String r3 = r4.A04(r0)
            goto L_0x0092
        L_0x01d0:
            X.5mv r3 = new X.5mv
            r3.<init>()
            X.0tz r0 = r5.A0P
            android.content.Context r2 = r0.A00
            r0 = 2131892220(0x7f1217fc, float:1.9419182E38)
            goto L_0x01e9
        L_0x01dd:
            X.5mv r3 = new X.5mv
            r3.<init>()
            X.0tz r0 = r5.A0P
            android.content.Context r2 = r0.A00
            r0 = 2131892219(0x7f1217fb, float:1.941918E38)
        L_0x01e9:
            java.lang.String r0 = r2.getString(r0)
            r3.A04 = r0
            X.0wS r1 = r5.A0c
            r0 = 1
            java.lang.String r0 = X.C119405xi.A05(r2, r4, r1, r0)
            r3.A03 = r0
            r6.add(r3)
            goto L_0x0020
        L_0x01fd:
            if (r23 == 0) goto L_0x026f
            int r3 = r13.A02
            X.5xC r0 = r7.A0B
            if (r0 == 0) goto L_0x026f
            java.lang.String r0 = r0.A0E
            boolean r0 = X.AnonymousClass5xN.A02(r0)
            if (r0 == 0) goto L_0x026f
            java.util.HashSet r1 = X.C13680ns.A0o()
            r0 = 2
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r6 = 0
            r0[r6] = r17
            r0[r12] = r16
            java.util.Collections.addAll(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x026f
            X.C110755em.A02(r2)
            X.5mU r4 = new X.5mU
            r4.<init>()
            X.5xC r0 = r7.A0B
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x024a
            X.013 r0 = r5.A0Q
            java.util.Locale r3 = X.C13690nt.A0m(r0)
            X.5xC r0 = r7.A0B
            int r0 = r0.A00
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r0 = java.lang.String.format(r3, r1, r0)
            r4.A02 = r0
        L_0x024a:
            X.013 r0 = r5.A0Q
            java.util.Locale r3 = X.C13690nt.A0m(r0)
            X.5xC r0 = r7.A0B
            X.5wO[] r0 = r0.A0O
            if (r0 != 0) goto L_0x0270
            r0 = 0
        L_0x0257:
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r0 = java.lang.String.format(r3, r1, r0)
            r4.A01 = r0
            r1 = 28
            com.facebook.redex.IDxCListenerShape33S0200000_3_I1 r0 = new com.facebook.redex.IDxCListenerShape33S0200000_3_I1
            r0.<init>(r7, r1, r5)
            r4.A00 = r0
            r2.add(r4)
        L_0x026f:
            return
        L_0x0270:
            int r0 = r0.length
            goto L_0x0257
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114175nF.A0W(X.1cl, X.1Vt, X.5hW, java.util.List, boolean):void");
    }

    public void A0X(AnonymousClass1Vt r6, C111855hW r7, List list) {
        boolean A002 = this.A0c.A05("UPI").AEP().A00(r6);
        C28401Vy r3 = r6.A08;
        C113695mT r2 = new C113695mT(r3 != null ? C218315p.A03(this.A0P.A00, this.A0Q, r6.A00(), r3) : new SpannableStringBuilder(), A002);
        if ("MAX".equals(r7.A0B.A0F)) {
            r2.A00 = this.A0P.A00.getString(R.string.str1917);
        }
        list.add(r2);
    }

    public void A0Y(AnonymousClass1Vt r5, C111855hW r6, List list) {
        Context context;
        int i2;
        if (TextUtils.isEmpty(r6.A0B.A0G) || r5.A02 != 417) {
            AnonymousClass5xB r2 = r6.A0B.A0C;
            if (r2 != null && "ACCEPT".equals(r2.A08)) {
                String str = r2.A09;
                if (str.equals("PENDING")) {
                    C113915mp r22 = new C113915mp();
                    r22.A02 = false;
                    r22.A01 = this.A0P.A00.getString(R.string.str1922);
                    r22.A00 = new IDxCListenerShape33S0200000_3_I1(r5, 25, this);
                    list.add(r22);
                } else if (str.equals("FAILURE") && !TextUtils.isEmpty(r2.A05)) {
                    C113915mp r23 = new C113915mp();
                    r23.A02 = true;
                    r23.A01 = this.A0P.A00.getString(R.string.str18e0);
                    list.add(r23);
                    this.A0j.Acl(new AnonymousClass66Y(r5, r6, this));
                }
            }
        } else {
            C113915mp r24 = new C113915mp();
            r24.A02 = true;
            AnonymousClass5x8 r0 = r6.A0B.A0B;
            if (r0 != null) {
                String str2 = r0.A02;
                if ("PAUSE".equals(str2)) {
                    context = this.A0P.A00;
                    i2 = R.string.str1920;
                } else {
                    if ("RESUME".equals(str2)) {
                        context = this.A0P.A00;
                        i2 = R.string.str1921;
                    }
                    list.add(r24);
                    this.A0j.Acl(new AnonymousClass66Z(r5, r6, this));
                }
            } else {
                context = this.A0P.A00;
                i2 = R.string.str191f;
            }
            r24.A01 = context.getString(i2);
            list.add(r24);
            this.A0j.Acl(new AnonymousClass66Z(r5, r6, this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (r2 == 6) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r1 == 418) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Z(X.AnonymousClass1Vt r11, X.C111855hW r12, java.util.List r13) {
        /*
            r10 = this;
            X.5mz r3 = new X.5mz
            r3.<init>()
            int r0 = X.C218315p.A01(r11)
            r3.A01 = r0
            int r1 = r11.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x001e
            r0 = 415(0x19f, float:5.82E-43)
            if (r1 == r0) goto L_0x001e
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x001e
            r0 = 418(0x1a2, float:5.86E-43)
            r2 = 1
            if (r1 != r0) goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            X.1Vz r1 = r11.A00()
            X.0tz r0 = r10.A0P
            android.content.Context r5 = r0.A00
            java.lang.CharSequence r0 = r1.ABF(r5, r2)
            r3.A03 = r0
            boolean r1 = r11.A0E()
            r0 = 2131889972(0x7f120f34, float:1.9414623E38)
            if (r1 == 0) goto L_0x0039
            r0 = 2131890077(0x7f120f9d, float:1.9414836E38)
        L_0x0039:
            java.lang.String r0 = r5.getString(r0)
            r3.A04 = r0
            X.15p r9 = r10.A0i
            java.lang.String r0 = r9.A0K(r11)
            r3.A05 = r0
            int r2 = r11.A02
            r1 = 15
            r0 = 2131892498(0x7f121912, float:1.9419746E38)
            if (r2 == r1) goto L_0x0100
            r0 = 16
            if (r2 == r0) goto L_0x00f9
            r0 = 20
            r4 = 0
            r6 = 1
            if (r2 == r0) goto L_0x00d2
            r0 = 115(0x73, float:1.61E-43)
            if (r2 == r0) goto L_0x00d2
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto L_0x00b3
            r0 = 415(0x19f, float:5.82E-43)
            r1 = 418(0x1a2, float:5.86E-43)
            if (r2 == r0) goto L_0x009f
            r0 = 417(0x1a1, float:5.84E-43)
            if (r2 == r0) goto L_0x0076
            if (r2 == r1) goto L_0x00fd
            java.lang.String r0 = ""
        L_0x0070:
            r3.A0A = r0
            r13.add(r3)
            return
        L_0x0076:
            X.5xC r8 = r12.A0B
            X.AnonymousClass00B.A06(r8)
            X.013 r7 = r10.A0Q
            X.0t3 r2 = r10.A03
            long r0 = r8.A01
            java.lang.String r7 = X.AnonymousClass5xN.A00(r2, r7, r0)
            int r2 = r8.A00()
            r0 = 2
            if (r2 == r0) goto L_0x0095
            r0 = 4
            if (r2 == r0) goto L_0x0095
            r0 = 6
            r1 = 2131892501(0x7f121915, float:1.9419752E38)
            if (r2 != r0) goto L_0x0098
        L_0x0095:
            r1 = 2131892500(0x7f121914, float:1.941975E38)
        L_0x0098:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r0 = X.C13680ns.A0d(r5, r7, r0, r4, r1)
            goto L_0x0070
        L_0x009f:
            int r0 = r12.A01
            if (r0 != r1) goto L_0x00a7
            r0 = 2131892495(0x7f12190f, float:1.941974E38)
            goto L_0x0100
        L_0x00a7:
            r2 = 2131892496(0x7f121910, float:1.9419742E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r12.A0J
            java.lang.String r0 = X.C13680ns.A0d(r5, r0, r1, r4, r2)
            goto L_0x0070
        L_0x00b3:
            long r0 = r12.A04
            X.0t3 r2 = r9.A04
            long r7 = r2.A00()
            long r0 = r0 - r7
            android.util.Pair r0 = r9.A0C(r0)
            if (r0 == 0) goto L_0x00ce
            r2 = 2131892502(0x7f121916, float:1.9419754E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Object r0 = r0.second
            java.lang.String r0 = X.C13680ns.A0d(r5, r0, r1, r4, r2)
            goto L_0x0070
        L_0x00ce:
            r0 = 2131892232(0x7f121808, float:1.9419206E38)
            goto L_0x0100
        L_0x00d2:
            long r0 = r12.A04
            X.0t3 r2 = r9.A04
            long r7 = r2.A00()
            long r0 = r0 - r7
            android.util.Pair r2 = r9.A0C(r0)
            if (r2 == 0) goto L_0x00f9
            X.013 r8 = r10.A0Q
            r7 = 2131755384(0x7f100178, float:1.9141646E38)
            java.lang.Object r0 = r2.first
            int r0 = X.AnonymousClass000.A0D(r0)
            long r0 = (long) r0
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Object r2 = r2.second
            r5[r4] = r2
            java.lang.String r0 = r8.A0J(r5, r7, r0)
            goto L_0x0070
        L_0x00f9:
            r0 = 2131892499(0x7f121913, float:1.9419748E38)
            goto L_0x0100
        L_0x00fd:
            r0 = 2131892225(0x7f121801, float:1.9419192E38)
        L_0x0100:
            java.lang.String r0 = r5.getString(r0)
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114175nF.A0Z(X.1Vt, X.5hW, java.util.List):void");
    }

    public void A0a(AnonymousClass1Vt r9, C111855hW r10, List list, boolean z2) {
        AnonymousClass5xB r2;
        int i2;
        Object[] A1Z;
        AnonymousClass5xC r0 = r10.A0B;
        if (r0 != null && (r2 = r0.A0C) != null && "UNKNOWN".equals(r2.A08) && "INIT".equals(r2.A09)) {
            String str = r10.A0J;
            C113715mV r5 = new C113715mV();
            Context context = this.A0P.A00;
            String A062 = AnonymousClass1ZW.A06(context, R.color.color007f);
            if (z2) {
                r5.A02 = context.getString(R.string.str193c);
                i2 = R.string.str193b;
                A1Z = new Object[]{A062};
            } else {
                r5.A02 = context.getString(R.string.str193e);
                i2 = R.string.str1931;
                A1Z = C13690nt.A1Z();
                A1Z[0] = str;
                A1Z[1] = A062;
            }
            r5.A01 = context.getString(i2, A1Z);
            r5.A00 = new C119615yl(r9, this, z2);
            list.add(r5);
        }
    }

    public void A0b(AnonymousClass1Vt r14, List list) {
        Context context;
        int i2;
        Object[] objArr;
        String string;
        int i3;
        int A002;
        C111855hW A0K = C110115dX.A0K(r14);
        C113865mk r6 = new C113865mk();
        AnonymousClass5xC r2 = A0K.A0B;
        AnonymousClass00B.A06(r2);
        AnonymousClass5xN r8 = this.A0E;
        int i4 = r14.A02;
        String str = A0K.A0J;
        long j2 = r2.A01;
        String str2 = r2.A0E;
        if (i4 == 20 || i4 == 115) {
            boolean A022 = AnonymousClass5xN.A02(str2);
            context = r8.A02.A00;
            if (A022) {
                i3 = R.string.str195b;
                string = C13680ns.A0d(context, str, new Object[1], 0, i3);
            } else {
                i2 = R.string.str191a;
                objArr = new Object[]{str, AnonymousClass5xN.A00(r8.A01, r8.A03, j2)};
                string = context.getString(i2, objArr);
            }
        } else if (i4 != 401 && i4 != 417 && i4 != 418) {
            string = null;
        } else if (!AnonymousClass5xN.A02(str2) || !((A002 = r2.A00()) == 2 || A002 == 4 || A002 == 6)) {
            context = r8.A02.A00;
            i3 = R.string.str191b;
            string = C13680ns.A0d(context, str, new Object[1], 0, i3);
        } else {
            AnonymousClass5x8 r9 = r2.A0B;
            AnonymousClass00B.A06(r9);
            context = r8.A02.A00;
            i2 = R.string.str195a;
            AnonymousClass013 r82 = r8.A03;
            objArr = new Object[]{str, C28891Zc.A05(r82, r9.A01 / 1000), C28891Zc.A05(r82, r9.A00 / 1000)};
            string = context.getString(i2, objArr);
        }
        r6.A01 = string;
        if (!TextUtils.isEmpty(string)) {
            r6.A00 = 0;
            list.add(r6);
        }
    }

    public final void A0c(C111855hW r4, List list, int i2) {
        AnonymousClass5xC r0;
        if (i2 != 401 && i2 != 20 && (r0 = r4.A0B) != null && !C39841t9.A03(r0.A08)) {
            C113975mv r2 = new C113975mv();
            r2.A04 = this.A0P.A00.getString(R.string.str191e);
            r2.A03 = (String) C110105dW.A0d(r4.A0B.A08);
            r2.A02 = new C119675yr(r4, this);
            list.add(r2);
        }
    }

    public void A0d(List list) {
        C113925mq r2 = new C113925mq();
        r2.A02 = this.A07;
        r2.A01 = this;
        r2.A00 = this.A0c.A05("UPI").ABY();
        list.add(r2);
    }

    public final void A0e(List list) {
        C111855hW r3 = (C111855hW) this.A07.A01.A0A;
        if (this.A02.A05(C15910s6.A0q) && !TextUtils.isEmpty(r3.A0Q)) {
            C113975mv r2 = new C113975mv();
            Context context = this.A0P.A00;
            r2.A04 = context.getString(R.string.str1970);
            r2.A03 = context.getString(R.string.str196f);
            r2.A01 = new IDxCListenerShape33S0200000_3_I1(r3, 29, this);
            list.add(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r0 = ((X.C111855hW) (r1 = (r2 = (r0 = r4.A07).A01).A0A)).A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        r0 = r2.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        r0 = r1.A0C(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0f() {
        /*
            r4 = this;
            X.0w8 r2 = r4.A0b
            X.60V r0 = r4.A07
            java.lang.String r0 = r0.A08()
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = r0.toLowerCase()
            int r0 = r1.hashCode()
            switch(r0) {
                case 113658: goto L_0x0069;
                case 3008417: goto L_0x005c;
                case 3197625: goto L_0x004f;
                case 100023093: goto L_0x0042;
                default: goto L_0x0015;
            }
        L_0x0015:
            r0 = 0
        L_0x0016:
            r3 = 0
            if (r0 == 0) goto L_0x0033
            X.5sx r0 = r4.A07
            if (r0 == 0) goto L_0x0033
            X.1Vt r2 = r0.A01
            if (r2 == 0) goto L_0x0033
            X.1W2 r1 = r2.A0A
            if (r1 == 0) goto L_0x0033
            boolean r0 = r1 instanceof X.C111855hW
            if (r0 == 0) goto L_0x0033
            X.5hW r1 = (X.C111855hW) r1
            X.5xC r0 = r1.A0B
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x0034
        L_0x0033:
            return r3
        L_0x0034:
            java.lang.Boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0033
            r0 = 1
            return r0
        L_0x0042:
            java.lang.String r0 = "icici"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.0pd r1 = r2.A03
            r0 = 2327(0x917, float:3.261E-42)
            goto L_0x0075
        L_0x004f:
            java.lang.String r0 = "hdfc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.0pd r1 = r2.A03
            r0 = 2328(0x918, float:3.262E-42)
            goto L_0x0075
        L_0x005c:
            java.lang.String r0 = "axis"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.0pd r1 = r2.A03
            r0 = 2330(0x91a, float:3.265E-42)
            goto L_0x0075
        L_0x0069:
            java.lang.String r0 = "sbi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.0pd r1 = r2.A03
            r0 = 2329(0x919, float:3.264E-42)
        L_0x0075:
            boolean r0 = r1.A0C(r0)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114175nF.A0f():boolean");
    }
}
