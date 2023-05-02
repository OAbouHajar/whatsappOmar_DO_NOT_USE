package X;

import android.content.Context;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import com.obwhatsapp.conversation.conversationrow.viewmodel.SharePhoneNumberRowViewModel;
import com.obwhatsapp.payments.model.BipProcessActionViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ba  reason: invalid class name and case insensitive filesystem */
public class C30001ba {
    public AnonymousClass2Ao A00;
    public AnonymousClass1MF A01;
    public C50772aQ A02;
    public List A03;
    public final AnonymousClass02C A04;
    public final C15900s5 A05;
    public final C17200uh A06;
    public final C29991bZ A07;
    public final AnonymousClass1B5 A08;
    public final C19610yi A09;
    public final C14710pd A0A;
    public final AnonymousClass1RV A0B;
    public final C43331zp A0C;

    public C30001ba(AnonymousClass02C r2, C15900s5 r3, C17200uh r4, AnonymousClass1B5 r5, C19610yi r6, C14710pd r7, AnonymousClass1RV r8, AnonymousClass1MF r9, C50772aQ r10, C16320sq r11, C43331zp r12) {
        this.A0A = r7;
        this.A05 = r3;
        this.A06 = r4;
        this.A04 = r2;
        this.A0B = r8;
        this.A01 = r9;
        this.A02 = r10;
        this.A08 = r5;
        this.A09 = r6;
        this.A07 = new C29991bZ(this, r7, r11);
        this.A0C = r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01a6, code lost:
        if (X.AnonymousClass2QA.A00(r15) == 1) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01b7, code lost:
        if (r15.A11.A02 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01b9, code lost:
        return 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        return 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        return 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0117, code lost:
        if (r15.A11.A02 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0119, code lost:
        return 26;
     */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0276 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0064 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(X.C16740tZ r15) {
        /*
            r14 = this;
            byte r11 = r15.A10
            r7 = 73
            r3 = 6
            r1 = 66
            r13 = 35
            r12 = 8
            r0 = 36
            if (r11 == 0) goto L_0x0065
            r9 = 78
            r5 = 1
            if (r11 == r5) goto L_0x0221
            r6 = 7
            r4 = 2
            if (r11 == r4) goto L_0x01f2
            r4 = 3
            if (r11 == r4) goto L_0x01d2
            r4 = 4
            r2 = 5
            if (r11 == r4) goto L_0x01a8
            if (r11 == r2) goto L_0x018b
            if (r11 == r6) goto L_0x0065
            r6 = 49
            if (r11 == r6) goto L_0x026e
            r4 = 57
            if (r11 == r4) goto L_0x0180
            if (r11 == r1) goto L_0x0175
            r10 = 72
            if (r11 == r9) goto L_0x016c
            if (r11 == r0) goto L_0x0169
            r9 = 37
            if (r11 == r9) goto L_0x0160
            r0 = 51
            if (r11 == r0) goto L_0x0155
            r8 = 52
            if (r11 == r8) goto L_0x014a
            r0 = 54
            if (r11 == r0) goto L_0x014a
            r1 = 55
            if (r11 == r1) goto L_0x014a
            if (r11 == r10) goto L_0x013f
            if (r11 == r7) goto L_0x013c
            switch(r11) {
                case 9: goto L_0x019c;
                case 10: goto L_0x0139;
                case 11: goto L_0x0132;
                case 12: goto L_0x0283;
                case 13: goto L_0x0127;
                case 14: goto L_0x01b1;
                case 15: goto L_0x0111;
                case 16: goto L_0x011c;
                default: goto L_0x004e;
            }
        L_0x004e:
            switch(r11) {
                case 19: goto L_0x022f;
                case 20: goto L_0x00f0;
                case 21: goto L_0x00e2;
                case 22: goto L_0x00df;
                case 23: goto L_0x00d4;
                case 24: goto L_0x00c9;
                case 25: goto L_0x00e5;
                case 26: goto L_0x00ff;
                case 27: goto L_0x009f;
                case 28: goto L_0x0108;
                case 29: goto L_0x00be;
                case 30: goto L_0x00b3;
                case 31: goto L_0x0095;
                case 32: goto L_0x00a8;
                default: goto L_0x0051;
            }
        L_0x0051:
            switch(r11) {
                case 42: goto L_0x016c;
                case 43: goto L_0x016c;
                case 44: goto L_0x008a;
                case 45: goto L_0x014a;
                case 46: goto L_0x026e;
                default: goto L_0x0054;
            }
        L_0x0054:
            switch(r11) {
                case 62: goto L_0x007f;
                case 63: goto L_0x0278;
                case 64: goto L_0x0111;
                default: goto L_0x0057;
            }
        L_0x0057:
            int r0 = r15.A0C
            r7 = -1
            if (r0 != r7) goto L_0x026d
            if (r11 != r7) goto L_0x026d
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0255
        L_0x0064:
            return r3
        L_0x0065:
            boolean r0 = r15 instanceof X.AnonymousClass1WU
            if (r0 == 0) goto L_0x025b
            r0 = r15
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r4 = r0.A00
            X.1Vw r0 = r15.A11
            boolean r2 = r0.A02
            if (r2 == 0) goto L_0x0235
            if (r4 != r3) goto L_0x0235
            X.1sH r15 = (X.C39321sH) r15
            com.obwhatsapp.data.ProfilePhotoChange r0 = r15.A00
            if (r0 == 0) goto L_0x0064
            r1 = 19
            return r1
        L_0x007f:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 89
            if (r0 == 0) goto L_0x0282
            r1 = 88
            return r1
        L_0x008a:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 68
            if (r0 == 0) goto L_0x0282
            r1 = 67
            return r1
        L_0x0095:
            X.1Vt r0 = r15.A0L
            if (r0 == 0) goto L_0x020f
            int r0 = r0.A03
            if (r0 == r2) goto L_0x020f
            goto L_0x028b
        L_0x009f:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0282
            r1 = 54
            return r1
        L_0x00a8:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 63
            if (r0 == 0) goto L_0x0282
            r1 = 62
            return r1
        L_0x00b3:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 61
            if (r0 == 0) goto L_0x0282
            r1 = 60
            return r1
        L_0x00be:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 59
            if (r0 == 0) goto L_0x0282
            r1 = 58
            return r1
        L_0x00c9:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 48
            if (r0 == 0) goto L_0x0282
            r1 = 47
            return r1
        L_0x00d4:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 46
            if (r0 == 0) goto L_0x0282
            r1 = 45
            return r1
        L_0x00df:
            r1 = 44
            return r1
        L_0x00e2:
            r1 = 43
            return r1
        L_0x00e5:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 51
            if (r0 == 0) goto L_0x0282
            r1 = 50
            return r1
        L_0x00f0:
            X.1Vt r0 = r15.A0L
            if (r0 != 0) goto L_0x028b
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 39
            if (r0 == 0) goto L_0x0282
            r1 = 38
            return r1
        L_0x00ff:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0107
            r8 = 53
        L_0x0107:
            return r8
        L_0x0108:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0220
            r4 = 56
            return r4
        L_0x0111:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 27
            if (r0 == 0) goto L_0x0282
            r1 = 26
            return r1
        L_0x011c:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 31
            if (r0 == 0) goto L_0x0282
            r1 = 30
            return r1
        L_0x0127:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 25
            if (r0 == 0) goto L_0x0282
            r1 = 24
            return r1
        L_0x0132:
            X.1Vt r0 = r15.A0L
            if (r0 != 0) goto L_0x028b
            r1 = 20
            return r1
        L_0x0139:
            r1 = 21
            return r1
        L_0x013c:
            r1 = 97
            return r1
        L_0x013f:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 96
            if (r0 == 0) goto L_0x0282
            r1 = 95
            return r1
        L_0x014a:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 70
            if (r0 == 0) goto L_0x0282
            r1 = 69
            return r1
        L_0x0155:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 84
            if (r0 == 0) goto L_0x0282
            r1 = 83
            return r1
        L_0x0160:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0282
            r1 = 65
            return r1
        L_0x0169:
            r1 = 64
            return r1
        L_0x016c:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0174
            r10 = 71
        L_0x0174:
            return r10
        L_0x0175:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 94
            if (r0 == 0) goto L_0x0282
            r1 = 93
            return r1
        L_0x0180:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 87
            if (r0 == 0) goto L_0x0282
            r1 = 86
            return r1
        L_0x018b:
            boolean r1 = r15.A0x()
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r1 == 0) goto L_0x021c
            r1 = 82
            if (r0 == 0) goto L_0x0282
            r1 = 81
            return r1
        L_0x019c:
            boolean r0 = X.C42941yx.A02(r15)
            if (r0 == 0) goto L_0x01bc
            int r0 = X.AnonymousClass2QA.A00(r15)
            if (r0 != r5) goto L_0x01b1
        L_0x01a8:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x01b0
            r2 = 14
        L_0x01b0:
            return r2
        L_0x01b1:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 29
            if (r0 == 0) goto L_0x0282
            r1 = 28
            return r1
        L_0x01bc:
            boolean r1 = r15.A0x()
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r1 == 0) goto L_0x01cd
            r1 = 80
            if (r0 == 0) goto L_0x0282
            r1 = 79
            return r1
        L_0x01cd:
            if (r0 != 0) goto L_0x01d1
            r12 = 17
        L_0x01d1:
            return r12
        L_0x01d2:
            boolean r1 = r15.A0x()
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r1 == 0) goto L_0x01e3
            r1 = 76
            if (r0 == 0) goto L_0x0282
            r1 = 75
            return r1
        L_0x01e3:
            if (r0 != 0) goto L_0x0220
            X.0pd r0 = r14.A0A
            boolean r0 = X.AnonymousClass20C.A01(r0, r15)
            r1 = 23
            if (r0 == 0) goto L_0x0282
            r1 = 12
            return r1
        L_0x01f2:
            r3 = r15
            X.1rH r3 = (X.C38701rH) r3
            X.0pd r2 = r14.A0A
            r1 = 1040(0x410, float:1.457E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0210
            boolean r1 = r3.A1B()
        L_0x0205:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r1 == 0) goto L_0x0217
            if (r0 != 0) goto L_0x020f
            r6 = 16
        L_0x020f:
            return r6
        L_0x0210:
            int r0 = r3.A08
            r1 = 1
            if (r0 == r5) goto L_0x0205
            r1 = 0
            goto L_0x0205
        L_0x0217:
            if (r0 != 0) goto L_0x0220
            r4 = 11
            return r4
        L_0x021c:
            if (r0 != 0) goto L_0x0220
            r4 = 13
        L_0x0220:
            return r4
        L_0x0221:
            boolean r1 = r15.A0x()
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r1 == 0) goto L_0x0230
            if (r0 == 0) goto L_0x022f
            r9 = 77
        L_0x022f:
            return r9
        L_0x0230:
            if (r0 != 0) goto L_0x0234
            r5 = 10
        L_0x0234:
            return r5
        L_0x0235:
            r0 = 41
            if (r4 == r0) goto L_0x0258
            r0 = 40
            if (r4 == r0) goto L_0x0258
            r0 = 42
            if (r4 == r0) goto L_0x0258
            r0 = 64
            if (r4 == r0) goto L_0x0258
            r0 = 65
            if (r4 == r0) goto L_0x0258
            if (r4 == r1) goto L_0x0258
            r0 = 76
            if (r4 != r0) goto L_0x0252
            r1 = 92
            return r1
        L_0x0252:
            if (r2 == 0) goto L_0x0255
            return r3
        L_0x0255:
            r3 = 15
            return r3
        L_0x0258:
            r1 = 40
            return r1
        L_0x025b:
            X.1Vt r0 = r15.A0L
            if (r0 != 0) goto L_0x028b
            boolean r0 = r15.A0x()
            if (r0 == 0) goto L_0x026e
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x026d
            r7 = 74
        L_0x026d:
            return r7
        L_0x026e:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 9
            if (r0 == 0) goto L_0x0282
            r1 = 0
            return r1
        L_0x0278:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            r1 = 91
            if (r0 == 0) goto L_0x0282
            r1 = 90
        L_0x0282:
            return r1
        L_0x0283:
            X.1Vt r0 = r15.A0L
            if (r0 == 0) goto L_0x0294
            int r0 = r0.A03
            if (r0 == r2) goto L_0x0294
        L_0x028b:
            X.1Vw r0 = r15.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0293
            r13 = 36
        L_0x0293:
            return r13
        L_0x0294:
            r1 = 22
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30001ba.A00(X.0tZ):int");
    }

    public AnonymousClass2Ao A01(Context context) {
        AnonymousClass2Ao r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass2Ao A042 = this.A06.A04(context, "conversation-row-inflater");
        this.A00 = A042;
        return A042;
    }

    public C30011bb A02(Context context, AnonymousClass1YG r18, C16740tZ r19) {
        C16740tZ r15 = r19;
        Class<BipProcessActionViewModel> cls = BipProcessActionViewModel.class;
        byte b2 = r15.A10;
        BipProcessActionViewModel bipProcessActionViewModel = null;
        Context context2 = context;
        AnonymousClass1YG r11 = r18;
        if (b2 != 0) {
            if (b2 == 1) {
                boolean A0x = r15.A0x();
                C38681rF r152 = (C38681rF) r15;
                return A0x ? new C602030m(context2, r11, r152) : new AnonymousClass31B(context2, r11, r152);
            } else if (b2 == 2) {
                C38701rH r153 = (C38701rH) r15;
                if (!this.A0A.A0E(C16620tM.A02, 1040) ? r153.A08 != 1 : !r153.A1B()) {
                    return new AnonymousClass2Q5(context2, r11, this.A08, this.A09, r153);
                }
                return new AnonymousClass2Q3(context2, A01(context2), r11, this.A08, this.A09, this.A0B, r153);
            } else if (b2 != 3) {
                if (b2 == 4) {
                    return new C600930a(context2, A01(context2), r11, r15, this.A0C);
                } else if (b2 == 5) {
                    boolean A0x2 = r15.A0x();
                    C38751rM r154 = (C38751rM) r15;
                    return A0x2 ? new C602230o(context2, r11, r154) : new AnonymousClass31D(context2, r11, r154);
                } else if (b2 != 7) {
                    if (b2 == 36) {
                        return new AnonymousClass30U(context2, r11, (C38971ri) r15);
                    }
                    if (b2 != 49) {
                        if (b2 == 57) {
                            return new C601930l(context2, r11, (C39111rw) r15);
                        }
                        if (b2 == 66) {
                            return new AnonymousClass2TM(context2, A01(context2), r11, (C39171s2) r15);
                        } else if (b2 == 78) {
                            C30581cc r155 = (C30581cc) r15;
                            return r155.A11.A02 ? new AnonymousClass31K(context2, r11, r155) : !this.A0A.A0E(C16620tM.A02, 2802) ? new AnonymousClass30M(context2, r11, r155) : new AnonymousClass30Z(context2, r11, r155);
                        } else if (b2 == 51) {
                            return ((C39061rr) r15).A00 == 3 ? new AnonymousClass31F(context2, r11, r15) : new AnonymousClass30M(context2, r11, r15);
                        } else {
                            if (!(b2 == 52 || b2 == 54 || b2 == 55)) {
                                if (b2 == 72) {
                                    return new C601130c(context2, r11, (C39211s6) r15);
                                }
                                if (b2 == 73) {
                                    return new C601030b(context2, r11, (C39221s7) r15);
                                }
                                switch (b2) {
                                    case 9:
                                        if (C42941yx.A02(r15)) {
                                            int A002 = AnonymousClass2QA.A00(r15);
                                            AnonymousClass2Ao A012 = A01(context2);
                                            C43331zp r0 = this.A0C;
                                            return A002 == 1 ? new C600930a(context2, A012, r11, r15, r0) : new AnonymousClass30W(context2, A012, r11, r15, r0);
                                        }
                                        boolean A0x3 = r15.A0x();
                                        C38631rA r156 = (C38631rA) r15;
                                        return A0x3 ? new C601730j(context2, r11, r156) : new AnonymousClass318(context2, r11, r156);
                                    case 10:
                                        return new AnonymousClass30P(context2, r11, (C38771rO) r15);
                                    case 11:
                                        return r15.A0L != null ? new AnonymousClass31E(context2, r11, (BipProcessActionViewModel) null, r15) : new AnonymousClass30K(context2, r11, (C38781rP) r15);
                                    case 12:
                                        AnonymousClass1Vt r02 = r15.A0L;
                                        return (r02 == null || r02.A03 == 5) ? new AnonymousClass30M(context2, r11, r15) : new AnonymousClass31E(context2, r11, (BipProcessActionViewModel) null, r15);
                                    case 13:
                                        C602430q r2 = new C602430q(context2, r11, (C38801rR) r15);
                                        List list = this.A03;
                                        if (list == null) {
                                            list = new ArrayList();
                                            this.A03 = list;
                                        }
                                        list.add(r2);
                                        return r2;
                                    case 14:
                                        return new AnonymousClass30W(context2, A01(context2), r11, r15, this.A0C);
                                    case 15:
                                        return new AnonymousClass31H(context2, r11, (C38831rU) r15);
                                    case 16:
                                        return new AnonymousClass2QF(context2, A01(context2), r11, (C38841rV) r15);
                                    default:
                                        switch (b2) {
                                            case 19:
                                                return new AnonymousClass30Q(context2, r11, (C38851rW) r15);
                                            case 20:
                                                if (r15.A0L != null) {
                                                    if (r18 != null) {
                                                        bipProcessActionViewModel = (BipProcessActionViewModel) r11.AAy(cls);
                                                    }
                                                    return new AnonymousClass31E(context2, r11, bipProcessActionViewModel, r15);
                                                }
                                                return new AnonymousClass31I(context2, r11, (C38641rB) r15, this.A01, this.A02);
                                            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                                            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                                                return new AnonymousClass30R(context2, r11, r15);
                                            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                                                return new C603030w(context2, r11, (C38891ra) r15);
                                            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                                                return new AnonymousClass30X(context2, r11, (C30071bh) r15);
                                            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                                                return new AnonymousClass319(context2, r11, (C38901rb) r15);
                                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                                return new C601630i(context2, r11, (C38911rc) r15);
                                            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                                                return new AnonymousClass30Y(context2, r11, (C30571cb) r15);
                                            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                                                return new AnonymousClass310(context2, r11, (C38921rd) r15);
                                            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                                                return new C601830k(context2, r11, (C38931re) r15);
                                            case 30:
                                                return new C602130n(context2, r11, (C38941rf) r15);
                                            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                                                if (r15.A0L == null) {
                                                    return new AnonymousClass30L(context2, r11, (C38951rg) r15);
                                                }
                                                if (r18 != null) {
                                                    bipProcessActionViewModel = (BipProcessActionViewModel) r11.AAy(cls);
                                                }
                                                return new AnonymousClass31E(context2, r11, bipProcessActionViewModel, r15);
                                            case 32:
                                                break;
                                            default:
                                                switch (b2) {
                                                    case 42:
                                                        C16730tY r157 = (C16730tY) r15;
                                                        return r157.A11.A02 ? new AnonymousClass312(context2, r11, r157) : new AnonymousClass31M(context2, r11, r157);
                                                    case 43:
                                                        C16730tY r158 = (C16730tY) r15;
                                                        return r158.A11.A02 ? new AnonymousClass312(context2, r11, r158) : new AnonymousClass31M(context2, r11, r158);
                                                    case 44:
                                                        return new AnonymousClass2Y2(context2, r11, (C39021rn) r15);
                                                    case 45:
                                                        break;
                                                    case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
                                                        break;
                                                    default:
                                                        switch (b2) {
                                                            case 62:
                                                                return new C603330z(context2, r11, (C39141rz) r15);
                                                            case 63:
                                                                return new C601530h(context2, r11, (C39151s0) r15);
                                                            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                                                                return new C603130x(context2, r11, (C39161s1) r15);
                                                            default:
                                                                return (r15.A0C == -1 && b2 == -1) ? new AnonymousClass2QC(context2, r11, (AnonymousClass1WU) r15) : new AnonymousClass30M(context2, r11, r15);
                                                        }
                                                }
                                        }
                                }
                            }
                            return new AnonymousClass30N(context2, r11, (C16830ti) r15);
                        }
                    }
                    return new AnonymousClass31K(context2, r11, (C30581cc) r15);
                }
            } else if (r15.A0x()) {
                return new AnonymousClass311(context2, r11, (C38711rI) r15);
            } else {
                C38711rI r22 = (C38711rI) r15;
                return (AnonymousClass20C.A01(this.A0A, r22) || r15.A11.A02) ? new AnonymousClass31L(context2, r11, r22) : new C602930v(context2, r11, r22);
            }
        }
        if (r15 instanceof AnonymousClass1WU) {
            AnonymousClass1WU r5 = (AnonymousClass1WU) r15;
            int i2 = r5.A00;
            if (!r15.A11.A02 || i2 != 6) {
                if (i2 == 41 || i2 == 40 || i2 == 42 || i2 == 64 || i2 == 65 || i2 == 66) {
                    return new AnonymousClass31G(context2, r11, r5);
                }
                if (i2 == 68) {
                    return new AnonymousClass30V(context2, r11, (C40281tr) r15);
                }
                if (i2 == 76) {
                    return new AnonymousClass30S(context2, r11, r5);
                }
                if (i2 == 80) {
                    return new AnonymousClass30T(context2, this.A04, r11, r5);
                }
                if (i2 == 67) {
                    AnonymousClass2QC r4 = new AnonymousClass2QC(context2, r11, r5);
                    AnonymousClass2TZ r3 = r4.A0D;
                    if (r3.A00.A0E(C16620tM.A02, 1071)) {
                        r3.A04.Acl(new RunnableRunnableShape9S0200000_I0_7(r3, 32, r5));
                    }
                    return r4;
                } else if (i2 == 96) {
                    AnonymousClass2QC r23 = new AnonymousClass2QC(context2, r11, r5);
                    r23.A03 = (SharePhoneNumberRowViewModel) new C006602z((C001100m) C19980zJ.A01(r23.getContext(), C000900k.class)).A01(SharePhoneNumberRowViewModel.class);
                    return r23;
                }
            } else if (((C39321sH) r15).A00 != null) {
                return new C601430g(context2, r11, r5);
            }
            return new AnonymousClass2QC(context2, r11, r5);
        } else if (r15.A0L != null) {
            if (r18 != null) {
                bipProcessActionViewModel = (BipProcessActionViewModel) r11.AAy(cls);
            }
            return new AnonymousClass31E(context2, r11, bipProcessActionViewModel, r15);
        } else {
            boolean A0x4 = r15.A0x();
            C30581cc r159 = (C30581cc) r15;
            return A0x4 ? new AnonymousClass30O(context2, r11, r159) : new AnonymousClass31K(context2, r11, r159);
        }
    }
}
