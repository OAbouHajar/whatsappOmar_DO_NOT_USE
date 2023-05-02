package X;

import android.content.SharedPreferences;
import com.OM7753.GOLD;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import org.apache.commons.io.FileUtils;

/* renamed from: X.14u  reason: invalid class name and case insensitive filesystem */
public class C216214u {
    public final C16040sK A00;
    public final C15900s5 A01;
    public final C18260wP A02;
    public final C16000sG A03;
    public final C16440t3 A04;
    public final C15860rz A05;
    public final C14730pf A06;
    public final C15810rt A07;
    public final C216114t A08;
    public final C16070sO A09;
    public final AnonymousClass11G A0A;
    public final C14710pd A0B;
    public final C20260zl A0C;
    public final C18210wK A0D;
    public final C216014s A0E;

    public C216214u(C16040sK r1, C15900s5 r2, C18260wP r3, C16000sG r4, C16440t3 r5, C15860rz r6, C14730pf r7, C15810rt r8, C216114t r9, C16070sO r10, AnonymousClass11G r11, C14710pd r12, C20260zl r13, C18210wK r14, C216014s r15) {
        this.A04 = r5;
        this.A0B = r12;
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A0E = r15;
        this.A0A = r11;
        this.A0C = r13;
        this.A06 = r7;
        this.A0D = r14;
        this.A03 = r4;
        this.A05 = r6;
        this.A09 = r10;
        this.A02 = r3;
        this.A08 = r9;
    }

    public final boolean A00(C15830rv r10) {
        if (r10 == null) {
            return false;
        }
        C15810rt r2 = this.A07;
        if (r2.A00(r10) < 5) {
            return false;
        }
        long j2 = ((SharedPreferences) this.A05.A01.get()).getLong("last_read_conversation_time", 0);
        C15840rx r0 = (C15840rx) r2.A0C().get(r10);
        if (r0 == null) {
            return false;
        }
        long j3 = r0.A0W;
        return j3 != 0 && j3 + 86400000 < j2;
    }

    public boolean A01(C15830rv r7, AnonymousClass1XK r8, int i2, int i3, long j2, boolean z2) {
        if (r8 == AnonymousClass1XK.A0S) {
            if (i3 >= 0) {
                long j3 = (long) i3;
                if (j2 < j3 && !A00(r7)) {
                    if (i2 != 3) {
                        return j3 < 102400;
                    }
                }
            }
            return false;
        } else if (r8 == AnonymousClass1XK.A0B || r8 == AnonymousClass1XK.A0G || r8 == AnonymousClass1XK.A0Z) {
            return i3 > 0 && j2 < ((long) i3) && i3 <= 35000 && i2 != 3 && !A00(r7);
        } else {
            if (r8 != AnonymousClass1XK.A0X || !z2 || j2 >= 262144) {
                return false;
            }
        }
        return (AnonymousClass20B.A00(this.A05, i2) & 1) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a0, code lost:
        if (r13 <= 524288) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(X.AnonymousClass1XK r11, int r12, long r13, boolean r15, boolean r16, boolean r17, boolean r18) {
        /*
            r10 = this;
            X.0wP r0 = r10.A02
            int r4 = r0.A04(r15)
            X.1XK r0 = X.AnonymousClass1XK.A0S
            r3 = 1
            if (r11 != r0) goto L_0x006e
            r1 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x006e
        L_0x0012:
            r9 = 0
            if (r3 != 0) goto L_0x00c9
            r2 = 2
            r3 = 1
            if (r17 == 0) goto L_0x0020
            if (r18 == 0) goto L_0x0020
            if (r4 == r3) goto L_0x001f
            if (r4 != r2) goto L_0x0020
        L_0x001f:
            return r3
        L_0x0020:
            X.0rz r0 = r10.A05
            int r8 = X.AnonymousClass20B.A00(r0, r4)
            byte r1 = r11.A00
            if (r1 == 0) goto L_0x00c3
            if (r1 == r3) goto L_0x00c3
            r5 = 524288(0x80000, double:2.590327E-318)
            if (r1 == r2) goto L_0x0061
            r7 = 3
            if (r1 == r7) goto L_0x00bc
            r0 = 9
            if (r1 == r0) goto L_0x00a3
            r0 = 13
            if (r1 == r0) goto L_0x009e
            r0 = 20
            if (r1 == r0) goto L_0x00bf
            r0 = 23
            if (r1 == r0) goto L_0x00c3
            r0 = 37
            if (r1 == r0) goto L_0x00c3
            r0 = 25
            if (r1 == r0) goto L_0x00c3
            r0 = 26
            if (r1 == r0) goto L_0x00b9
            r0 = 28
            if (r1 == r0) goto L_0x00bc
            r0 = 29
            if (r1 == r0) goto L_0x009e
            r0 = 42
            if (r1 == r0) goto L_0x00c3
            r0 = 43
            if (r1 == r0) goto L_0x00bc
            return r9
        L_0x0061:
            r0 = r8 & 2
            if (r0 != 0) goto L_0x001f
            if (r12 != r3) goto L_0x00c9
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c7
            if (r4 != r3) goto L_0x00c9
            goto L_0x00c7
        L_0x006e:
            X.0pf r0 = r10.A06
            long r7 = r0.A01()
            X.0pd r2 = r10.A0B
            r1 = 1291(0x50b, float:1.809E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            long r0 = (long) r0
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r5
            long r0 = r0 + r13
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0012
            X.0s5 r1 = r10.A01
            if (r4 != r3) goto L_0x009b
            X.0tC r0 = X.C15910s6.A1e
        L_0x008e:
            int r0 = r1.A02(r0)
            long r0 = (long) r0
            long r0 = r0 * r5
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0012
            r3 = 0
            goto L_0x0012
        L_0x009b:
            X.0tC r0 = X.C15910s6.A1d
            goto L_0x008e
        L_0x009e:
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x00bc
            goto L_0x00c3
        L_0x00a3:
            r0 = 7
            if (r12 != r0) goto L_0x00b9
            X.0s5 r1 = r10.A01
            X.0tC r0 = X.C15910s6.A1h
            int r0 = r1.A02(r0)
            long r1 = (long) r0
            r5 = 1024(0x400, double:5.06E-321)
            long r1 = r1 * r5
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b9
            if (r4 == r7) goto L_0x00b9
            return r3
        L_0x00b9:
            r0 = r8 & 8
            goto L_0x00c5
        L_0x00bc:
            r0 = r8 & 4
            goto L_0x00c5
        L_0x00bf:
            if (r16 != 0) goto L_0x00c3
            if (r4 != r7) goto L_0x00c7
        L_0x00c3:
            r0 = r8 & 1
        L_0x00c5:
            if (r0 == 0) goto L_0x00c9
        L_0x00c7:
            r9 = 1
            return r9
        L_0x00c9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216214u.A02(X.1XK, int, long, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r11.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.C16730tY r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C38641rB
            if (r0 == 0) goto L_0x000b
            r0 = r11
            X.1rB r0 = (X.C38641rB) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0013
        L_0x000b:
            X.0ta r0 = r11.A02
            if (r0 == 0) goto L_0x0036
            int r0 = r0.A04
            if (r0 <= 0) goto L_0x0036
        L_0x0013:
            r5 = 1
        L_0x0014:
            byte r1 = r11.A10
            int r6 = r11.A08
            X.1XK r1 = X.C31831f6.A01(r1, r6)
            long r2 = r11.A01
            r4 = 0
            X.1Vw r0 = r11.A11
            X.0rv r0 = r0.A00
            boolean r7 = X.C16030sJ.A0Q(r0)
            X.0rv r0 = r11.A0B()
            boolean r8 = X.C16030sJ.A0P(r0)
            r0 = r10
            r9 = r11
            boolean r0 = r0.A07(r1, r2, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0036:
            r5 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216214u.A03(X.0tY):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r1.A00((X.C15830rv) r0) == 1) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.C16730tY r8) {
        /*
            r7 = this;
            X.14t r1 = r7.A08
            X.1Vw r0 = r8.A11
            X.0rv r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            X.0sH r3 = r1.A01(r0)
            boolean r0 = r3.A0J()
            r6 = 0
            if (r0 == 0) goto L_0x0065
            X.0sG r1 = r7.A03
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r0 = r3.A08(r0)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            com.whatsapp.jid.UserJid r0 = r1.A0D(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0063
            X.0sH r4 = r1.A0A(r0)
        L_0x0029:
            X.0sK r0 = r7.A00
            r0.A0B()
            X.1ZT r2 = r0.A05
            X.0rv r0 = r8.A0B()
            if (r0 == 0) goto L_0x003a
            X.0sH r5 = r1.A0A(r0)
        L_0x003a:
            X.0sO r1 = r7.A09
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            com.whatsapp.jid.Jid r0 = r3.A08(r0)
            X.AnonymousClass00B.A06(r0)
            X.0sL r0 = (X.C16050sL) r0
            boolean r0 = r1.A0D(r0)
            if (r0 != 0) goto L_0x0061
            if (r4 == 0) goto L_0x005b
            X.1ko r0 = r4.A0D
            if (r0 != 0) goto L_0x0061
            X.0rv r0 = r4.A0E
            boolean r0 = X.C34901l3.A00(r2, r0)
            if (r0 != 0) goto L_0x0061
        L_0x005b:
            if (r5 == 0) goto L_0x0062
            X.1ko r0 = r5.A0D
            if (r0 == 0) goto L_0x0062
        L_0x0061:
            r6 = 1
        L_0x0062:
            return r6
        L_0x0063:
            r4 = r5
            goto L_0x0029
        L_0x0065:
            int r1 = r3.A06
            r0 = 3
            if (r1 != r0) goto L_0x007f
            X.14s r1 = r7.A0E
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r3.A08(r0)
            X.AnonymousClass00B.A06(r0)
            X.0rv r0 = (X.C15830rv) r0
            int r1 = r1.A00(r0)
            r0 = 1
            if (r1 != r0) goto L_0x007f
            goto L_0x0061
        L_0x007f:
            X.1ko r0 = r3.A0D
            if (r0 != 0) goto L_0x0061
            X.0zl r1 = r7.A0C
            X.0rv r0 = r3.A0E
            boolean r0 = X.C40561uK.A01(r1, r0)
            if (r0 == 0) goto L_0x0062
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216214u.A04(X.0tY):boolean");
    }

    public final boolean A05(C16730tY r4) {
        if (AnonymousClass20D.A00(this.A04, this.A05, this.A0B, r4) && (r4 instanceof C38681rF)) {
            C42591y4 A12 = r4.A12();
            AnonymousClass00B.A06(A12);
            C16750ta r0 = A12.A04.A02;
            AnonymousClass00B.A06(r0);
            if (r0.A0M) {
                C16870tm A0F = r4.A0F();
                AnonymousClass00B.A06(A0F);
                return !A0F.A04();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (X.AnonymousClass20C.A01(r12.A0B, r13) != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.A0J.A02(r3, 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(X.C16730tY r13, int r14) {
        /*
            r12 = this;
            X.0ta r2 = r13.A02
            X.AnonymousClass00B.A06(r2)
            r4 = r12
            X.0wK r0 = r12.A0D
            java.lang.String r3 = r2.A0I
            if (r3 == 0) goto L_0x002a
            X.1OJ r1 = r0.A0J
            r0 = 1
            X.1f1 r0 = r1.A02(r3, r0)
            if (r0 == 0) goto L_0x002a
            long r9 = r0.A0A
        L_0x0017:
            boolean r0 = r13 instanceof X.C38681rF
            if (r0 == 0) goto L_0x002d
            X.1Vw r0 = r13.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x002d
            boolean r0 = r12.A05(r13)
            return r0
        L_0x002a:
            r9 = 0
            goto L_0x0017
        L_0x002d:
            byte r1 = r13.A10
            int r0 = r13.A08
            X.1XK r6 = X.C31831f6.A01(r1, r0)
            boolean r0 = X.C40541uI.A03(r13)
            if (r0 != 0) goto L_0x0044
            X.0pd r0 = r12.A0B
            boolean r0 = X.AnonymousClass20C.A01(r0, r13)
            r11 = 0
            if (r0 == 0) goto L_0x0045
        L_0x0044:
            r11 = 1
        L_0x0045:
            int r8 = r2.A04
            X.1Vw r0 = r13.A11
            X.0rv r5 = r0.A00
            r7 = r14
            boolean r0 = r4.A01(r5, r6, r7, r8, r9, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C216214u.A06(X.0tY, int):boolean");
    }

    public boolean A07(AnonymousClass1XK r14, long j2, boolean z2, boolean z3, int i2, boolean z4, boolean z5, C16740tZ r22) {
        int A042 = this.A02.A04(z2);
        boolean z6 = false;
        if (r14 == AnonymousClass1XK.A0S) {
            C15900s5 r1 = this.A01;
            if (j2 > FileUtils.ONE_MB) {
                return false;
            }
        }
        C15900s5 r4 = this.A01;
        if (A042 == 1) {
            if (j2 > ((long) r4.A02(C15910s6.A1e)) * SearchActionVerificationClientService.MS_TO_NS) {
                return false;
            }
        } else if (j2 > ((long) r4.A02(C15910s6.A1d)) * SearchActionVerificationClientService.MS_TO_NS) {
            return false;
        }
        if (z4 && z5 && (A042 == 1 || A042 == 2)) {
            return true;
        }
        int A002 = AnonymousClass20B.A00(this.A05, A042);
        byte b2 = r14.A00;
        if (!(b2 == 0 || b2 == 1)) {
            int i3 = i2;
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 != 9) {
                        if (b2 != 13) {
                            if (b2 == 20) {
                                if ((!z3 && A042 != 3) || (A002 & 1) != 0) {
                                    z6 = true;
                                }
                                return GOLD.Image(r22, z6);
                            } else if (!(b2 == 23 || b2 == 37 || b2 == 25)) {
                                if (b2 == 26) {
                                    if ((A002 & 8) != 0) {
                                        z6 = true;
                                    }
                                    return GOLD.Documents(r22, z6);
                                } else if (b2 != 28) {
                                    if (b2 != 29) {
                                        if (b2 != 42) {
                                            if (b2 != 43) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (j2 <= 524288) {
                            if ((A002 & 1) != 0) {
                                z6 = true;
                            }
                            return GOLD.Image(r22, z6);
                        }
                        if ((A002 & 4) != 0) {
                            z6 = true;
                        }
                        return GOLD.Video(r22, z6);
                    } else if (i3 == 7 && j2 <= ((long) r4.A02(C15910s6.A1h)) * FileUtils.ONE_KB && A042 != 3) {
                        return true;
                    } else {
                        if ((A002 & 8) != 0) {
                            z6 = true;
                        }
                        return GOLD.Documents(r22, z6);
                    }
                }
                if ((A002 & 4) != 0) {
                    z6 = true;
                }
                return GOLD.Video(r22, z6);
            } else if ((A002 & 2) != 0) {
                return GOLD.Audio(r22, true);
            } else {
                if (i3 != 1) {
                    return GOLD.Audio(r22, false);
                }
                if (j2 <= 524288 || A042 == 1) {
                    z6 = true;
                }
                return GOLD.Audio(r22, z6);
            }
        }
        if ((A002 & 1) != 0) {
            z6 = true;
        }
        return GOLD.Image(r22, z6);
    }
}
