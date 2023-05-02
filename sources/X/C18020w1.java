package X;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import com.facebook.redex.RunnableRunnableShape0S0301000_I0;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.obwhatsapp.Me;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0w1  reason: invalid class name and case insensitive filesystem */
public class C18020w1 {
    public static final AnonymousClass00F A0N = new AnonymousClass00F(1, 1);
    public static final AnonymousClass00F A0O = new AnonymousClass00F(1, 50, 100);
    public final LruCache A00 = new LruCache(50);
    public final C16300so A01;
    public final C16040sK A02;
    public final C16000sG A03;
    public final C16440t3 A04;
    public final AnonymousClass18H A05;
    public final C15810rt A06;
    public final C16070sO A07;
    public final C17290uq A08;
    public final C18030w2 A09;
    public final C18600wx A0A;
    public final C14710pd A0B;
    public final C16490t9 A0C;
    public final C207811o A0D;
    public final AnonymousClass18E A0E;
    public final AnonymousClass18C A0F;
    public final C16220sf A0G;
    public final AnonymousClass18L A0H;
    public final AnonymousClass18G A0I;
    public final AnonymousClass18K A0J;
    public final AnonymousClass1WA A0K;
    public final C16320sq A0L;
    public final boolean A0M;

    public C18020w1(C16300so r4, C16040sK r5, C16000sG r6, C16440t3 r7, AnonymousClass18H r8, C15810rt r9, C16070sO r10, C17290uq r11, C18030w2 r12, C18600wx r13, C14710pd r14, C16490t9 r15, C207811o r16, AnonymousClass18E r17, AnonymousClass18C r18, C16220sf r19, AnonymousClass18L r20, AnonymousClass18G r21, AnonymousClass18K r22, C16320sq r23) {
        this.A04 = r7;
        this.A0B = r14;
        this.A01 = r4;
        this.A02 = r5;
        C16320sq r2 = r23;
        this.A0L = r2;
        this.A06 = r9;
        this.A08 = r11;
        this.A0C = r15;
        this.A03 = r6;
        this.A09 = r12;
        this.A0G = r19;
        this.A0D = r16;
        this.A0J = r22;
        this.A05 = r8;
        this.A0I = r21;
        this.A07 = r10;
        this.A0E = r17;
        this.A0F = r18;
        this.A0H = r20;
        this.A0A = r13;
        this.A0K = new AnonymousClass1WA(r2, false);
        this.A0M = r14.A0E(C16620tM.A02, 1191);
    }

    public static int A00(int i2) {
        if (i2 < 32) {
            return 1;
        }
        if (i2 < 64) {
            return 2;
        }
        if (i2 < 128) {
            return 3;
        }
        if (i2 < 256) {
            return 4;
        }
        if (i2 < 512) {
            return 5;
        }
        if (i2 < 1024) {
            return 16;
        }
        if (i2 < 1500) {
            return 7;
        }
        if (i2 < 2000) {
            return 8;
        }
        if (i2 < 2500) {
            return 9;
        }
        if (i2 < 3000) {
            return 10;
        }
        if (i2 < 3500) {
            return 11;
        }
        if (i2 < 4000) {
            return 12;
        }
        if (i2 >= 4500) {
            return i2 < 5000 ? 14 : 15;
        }
        return 13;
    }

    public static int A01(C16040sK r0, DeviceJid deviceJid) {
        if (r0.A0J(deviceJid)) {
            return 3;
        }
        return (deviceJid == null || deviceJid.device == 0) ? 2 : 4;
    }

    public static int A02(C18030w2 r3, C16740tZ r4) {
        C42131xH A002;
        C42101xE A012;
        C16740tZ A0D2;
        if (r4 instanceof C39101rv) {
            return 34;
        }
        if (r4 instanceof C39171s2) {
            return 37;
        }
        if (r4 instanceof C39181s3) {
            return 38;
        }
        int i2 = 1;
        if (r4 instanceof C39191s4) {
            return ((C39191s4) r4).A01 == 1 ? 40 : 41;
        }
        if (C38621r6.A0n(r4)) {
            return 30;
        }
        if (r4.A0x()) {
            return 27;
        }
        if (!(r4 instanceof C30581cc) || (A0D2 = r4.A0D()) == null || A0D2.A10 != 54) {
            if (!(r4 instanceof C16840tj) || (A012 = C42091xD.A01((C16840tj) r4)) == null) {
                if ((r4 instanceof C39041rp) && (A002 = C42121xG.A00((C39041rp) r4)) != null) {
                    return A002.ADE();
                }
                i2 = C42141xI.A00(r4.A10, r4.A08, C30921dB.A04(r4));
                if (i2 == 9 && r4.A0w()) {
                    if (r3.A0D(C30931dC.A01(r4.A0I()))) {
                        return 22;
                    }
                    String A013 = C30931dC.A01(r4.A0I());
                    if (TextUtils.isEmpty(A013) || 5 != r3.A08(Uri.parse(A013))) {
                        return i2;
                    }
                    return 23;
                }
            } else if (A012 instanceof C42111xF) {
                return 33;
            } else {
                if (A012 instanceof C42151xJ) {
                    return 25;
                }
                return A012 instanceof C42161xK ? 35 : 1;
            }
        }
        return i2;
    }

    public static int A03(C18030w2 r1, C30161br r2) {
        C16740tZ r0 = r2.A0B;
        if (r0 != null) {
            return A02(r1, r0);
        }
        String str = r2.A0b;
        if ("text".equals(str)) {
            return 45;
        }
        if ("medianotify".equals(str)) {
            return 49;
        }
        if ("reaction".equals(str)) {
            return 48;
        }
        if ("pay".equals(str)) {
            return 46;
        }
        if ("poll".equals(str)) {
            return 47;
        }
        return "media".equals(str) ? 44 : 1;
    }

    public static int A04(Jid jid) {
        if (C16030sJ.A0L(jid)) {
            return 2;
        }
        if (C16030sJ.A0Q(jid)) {
            return 4;
        }
        return C16030sJ.A0H(jid) ? 3 : 1;
    }

    public static int A05(C16740tZ r1) {
        C15830rv r12 = r1.A11.A00;
        boolean A0Q = C16030sJ.A0Q(r12);
        boolean A0L2 = C16030sJ.A0L(r12);
        if (A0Q) {
            return 3;
        }
        return A0L2 ? 2 : 1;
    }

    public static int A06(C16740tZ r1) {
        C15830rv r12 = r1.A11.A00;
        if (C16030sJ.A0L(r12)) {
            return 2;
        }
        if (C16030sJ.A0Q(r12)) {
            return 4;
        }
        return C16030sJ.A0G(r12) ? 3 : 1;
    }

    public static Boolean A07(C16040sK r2, C28381Vw r3) {
        C15830rv r0;
        r2.A0B();
        Me me = r2.A00;
        if (me == null || (r0 = r3.A00) == null) {
            return null;
        }
        return Boolean.valueOf(!r0.getRawString().startsWith(me.cc));
    }

    public static Integer A08(int i2) {
        int i3;
        if (i2 != 7) {
            i3 = 1;
            if (i2 != 8) {
                return null;
            }
        } else {
            i3 = 0;
        }
        return Integer.valueOf(i3);
    }

    public static Integer A09(int i2) {
        int i3 = 10;
        if (i2 != -10000) {
            i3 = 33;
            if (i2 != -9999) {
                i3 = 24;
                if (i2 != -1201) {
                    i3 = 25;
                    if (i2 != -1200) {
                        i3 = 11;
                        if (i2 != -1100) {
                            i3 = 26;
                            if (i2 != -22) {
                                if (i2 != -12) {
                                    switch (i2) {
                                        case -1011:
                                            i3 = 32;
                                            break;
                                        case -1010:
                                            i3 = 5;
                                            break;
                                        case -1009:
                                            i3 = 31;
                                            break;
                                        case -1008:
                                            i3 = 6;
                                            break;
                                        case -1007:
                                            i3 = 1;
                                            break;
                                        case -1006:
                                            i3 = 2;
                                            break;
                                        case -1005:
                                            i3 = 0;
                                            break;
                                        case -1004:
                                            i3 = 29;
                                            break;
                                        case -1003:
                                            i3 = 28;
                                            break;
                                        case -1002:
                                            i3 = 27;
                                            break;
                                        case -1001:
                                            i3 = 23;
                                            break;
                                        case -1000:
                                            i3 = 34;
                                            break;
                                        default:
                                            return null;
                                    }
                                } else {
                                    i3 = 30;
                                }
                            }
                        }
                    }
                }
            }
        }
        return Integer.valueOf(i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r3.A04 != null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A0A(X.C30581cc r3) {
        /*
            r0 = 0
            X.1xL r2 = X.C42171xL.A00(r0, r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L_0x0019
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0019
            X.1cv r0 = r3.A0U
            if (r0 == 0) goto L_0x0019
            r1 = 5
        L_0x0014:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0019:
            X.1cv r0 = r3.A0U
            if (r0 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0014
        L_0x001f:
            byte[] r0 = r3.A17()
            if (r0 != 0) goto L_0x0034
            byte[] r0 = r3.A08
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = r3.A06
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = r3.A04
            r1 = 1
            if (r0 == 0) goto L_0x0014
        L_0x0032:
            r1 = 2
            goto L_0x0014
        L_0x0034:
            r1 = 3
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18020w1.A0A(X.1cc):java.lang.Integer");
    }

    public static Integer A0B(C30581cc r3) {
        int i2;
        String A012 = C30931dC.A01(r3.A0I());
        String str = null;
        if (A012 != null) {
            str = TextUtils.isEmpty(r3.A07) ? A012 : r3.A07;
        } else {
            A012 = null;
        }
        if (TextUtils.isEmpty(A012) || TextUtils.isEmpty(A012) || TextUtils.isEmpty(str)) {
            return null;
        }
        switch (C42181xM.A01(str)) {
            case 1:
                i2 = 5;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 2;
                break;
            case 6:
                i2 = 7;
                break;
            case 7:
                i2 = 6;
                break;
            case 8:
                i2 = 8;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (A0N(r8.A11.A00, r2.A07) == false) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C36381nS r5, com.whatsapp.jid.DeviceJid r6, com.whatsapp.jid.Jid r7, X.C16740tZ r8, int r9, int r10, int r11) {
        /*
            r4 = this;
            X.1xP r2 = new X.1xP
            r2.<init>()
            r0 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0A = r0
            int r3 = r5.A00
            r0 = 1
            if (r3 != r0) goto L_0x00b3
            r0 = 0
        L_0x0013:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0017:
            r2.A03 = r0
            int r0 = r5.A01
            if (r0 == 0) goto L_0x00af
            java.lang.Integer r0 = A09(r0)
            r2.A05 = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x0025:
            r2.A00 = r0
            java.lang.Integer r0 = A08(r11)
            r2.A08 = r0
            boolean r0 = r7 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x00a2
            r1 = 1
        L_0x0032:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A04 = r0
            if (r6 == 0) goto L_0x0045
            byte r1 = r6.device
            if (r1 != 0) goto L_0x00a0
            r0 = 1
        L_0x003f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A06 = r0
        L_0x0045:
            long r0 = (long) r9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0C = r0
            if (r8 == 0) goto L_0x005a
            X.0w2 r0 = r4.A09
            int r0 = A02(r0, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A07 = r0
        L_0x005a:
            r3 = 1
            if (r8 == 0) goto L_0x006a
            X.1Vw r0 = r8.A11
            X.0rv r1 = r0.A00
            java.lang.Integer r0 = r2.A07
            boolean r1 = r4.A0N(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            X.0rt r1 = r4.A06
            if (r8 != 0) goto L_0x0097
            r0 = 0
        L_0x0076:
            r2.A09 = r0
            long r0 = (long) r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0B = r0
            if (r8 == 0) goto L_0x0089
            boolean r0 = r8 instanceof X.C39131ry
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
        L_0x0089:
            java.lang.Boolean r0 = r2.A00
            boolean r0 = r0.booleanValue()
            X.0t9 r1 = r4.A0C
            if (r0 == 0) goto L_0x00c2
            r1.A06(r2)
            return
        L_0x0097:
            X.1Vw r0 = r8.A11
            X.0rv r0 = r0.A00
            java.lang.Integer r0 = X.C30871d6.A00(r1, r0)
            goto L_0x0076
        L_0x00a0:
            r0 = 2
            goto L_0x003f
        L_0x00a2:
            boolean r0 = r7 instanceof X.C34841kx
            if (r0 == 0) goto L_0x00a8
            r1 = 2
            goto L_0x0032
        L_0x00a8:
            boolean r0 = r7 instanceof X.C34771kq
            r1 = 0
            if (r0 == 0) goto L_0x0032
            r1 = 3
            goto L_0x0032
        L_0x00af:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x0025
        L_0x00b3:
            r1 = 2
            if (r3 == r1) goto L_0x0013
            r0 = 3
            if (r3 != r0) goto L_0x00bf
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0017
        L_0x00bf:
            r0 = 0
            goto L_0x0017
        L_0x00c2:
            X.00F r0 = new X.00F
            r0.<init>(r3, r3)
            r1.A0B(r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18020w1.A0C(X.1nS, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid, X.0tZ, int, int, int):void");
    }

    public final void A0D(C42191xN r7, String str, long j2) {
        Integer num;
        Integer num2;
        Integer num3;
        C14710pd r4 = this.A0B;
        C16620tM r1 = C16620tM.A02;
        int A032 = r4.A03(r1, 1073);
        int A033 = r4.A03(r1, 1127);
        int A034 = r4.A03(r1, 1128);
        if (A032 != 0 && ((num3 = r7.A0I) == null || A032 != num3.intValue())) {
            return;
        }
        if (A033 != 0 && ((num2 = r7.A0H) == null || A033 != num2.intValue())) {
            return;
        }
        if (A034 == 0 || ((num = r7.A0G) != null && A034 == num.intValue())) {
            Integer num4 = r7.A0I;
            String obj = num4 == null ? null : num4.toString();
            Integer num5 = r7.A0H;
            String obj2 = num5 == null ? null : num5.toString();
            Integer num6 = r7.A0G;
            String obj3 = num6 == null ? null : num6.toString();
            C16300so r2 = this.A01;
            StringBuilder sb = new StringBuilder("stage: ");
            sb.append(obj);
            sb.append("; messageType: ");
            sb.append(obj2);
            sb.append("; mediaType: ");
            sb.append(obj3);
            sb.append("; durationTime: ");
            sb.append(j2);
            r2.AcB(str, sb.toString(), true);
        }
    }

    public void A0E(DeviceJid deviceJid, int i2) {
        int i3;
        C42201xO r3 = new C42201xO();
        r3.A00 = Integer.valueOf(i2);
        if (deviceJid != null) {
            i3 = Integer.valueOf(deviceJid.device == 0 ? 1 : 2).intValue();
        } else {
            i3 = 1;
        }
        r3.A01 = Integer.valueOf(i3);
        this.A0C.A0B(r3, new AnonymousClass00F(1, 1), true);
    }

    public void A0F(DeviceJid deviceJid, C28381Vw r5, int i2, boolean z2) {
        C42311xa r2 = new C42311xa();
        r2.A02 = Integer.valueOf(A04(r5.A00));
        r2.A01 = Integer.valueOf(deviceJid.device == 0 ? 1 : 2);
        r2.A03 = Long.valueOf((long) i2);
        r2.A00 = Boolean.valueOf(z2);
        this.A0C.A05(r2);
    }

    public void A0G(DeviceJid deviceJid, C28381Vw r5, Integer num, int i2, int i3) {
        C42321xb r2 = new C42321xb();
        r2.A01 = Integer.valueOf(A04(r5.A00));
        r2.A03 = Integer.valueOf(deviceJid.device == 0 ? 1 : 2);
        r2.A04 = Long.valueOf((long) i2);
        boolean z2 = false;
        if (A08(i3) != null) {
            z2 = true;
        }
        r2.A00 = Boolean.valueOf(z2);
        r2.A02 = num;
        this.A0C.A06(r2);
    }

    public void A0H(C16060sN r8, Integer num) {
        int i2;
        C16060sN r5 = r8;
        if (C16030sJ.A0L(r8)) {
            i2 = 2;
        } else if (C16030sJ.A0Q(r8)) {
            i2 = 3;
        } else if (C16030sJ.A0G(r8)) {
            i2 = 4;
        } else {
            return;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf != null) {
            this.A0L.Acl(new RunnableRunnableShape0S0400000_I0(this, valueOf, num, r5, 6));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0111, code lost:
        if (r10.A07 == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0142, code lost:
        if (r0 == false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015e, code lost:
        if (r0.A07 == false) goto L_0x0160;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.C16740tZ r28, int r29, int r30, int r31, int r32, int r33, int r34, long r35, boolean r37, boolean r38, boolean r39, boolean r40) {
        /*
            r27 = this;
            r7 = r28
            r6 = r30
            if (r28 == 0) goto L_0x0548
            r8 = 1
            boolean r23 = r7.A10(r8)
            X.1xT r5 = new X.1xT
            r5.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)
            r5.A0I = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r35)
            r5.A0P = r0
            r4 = r27
            X.0w2 r0 = r4.A09
            r26 = r0
            int r0 = A02(r0, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0H = r0
            int r20 = A06(r7)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r20)
            r0 = r19
            r5.A0J = r0
            X.0rt r3 = r4.A06
            X.1Vw r15 = r7.A11
            X.0rv r2 = r15.A00
            java.lang.Integer r0 = X.C30871d6.A00(r3, r2)
            r5.A0L = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r40)
            r5.A0A = r0
            r1 = r31
            if (r31 <= 0) goto L_0x005a
            r0 = 32
            if (r1 > r0) goto L_0x0176
            r0 = 32
        L_0x0054:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0Q = r0
        L_0x005a:
            r9 = r32
            if (r32 <= 0) goto L_0x0074
            r0 = 32
            if (r9 > r0) goto L_0x0173
            r0 = 32
        L_0x0064:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0M = r0
            int r0 = A00(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0E = r0
        L_0x0074:
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r37)
            r0 = r18
            r5.A09 = r0
            java.lang.Integer r0 = r5.A0J
            int r0 = r0.intValue()
            if (r0 != r8) goto L_0x008e
            X.0sK r0 = r4.A02
            java.lang.Boolean r0 = A07(r0, r15)
            if (r0 == 0) goto L_0x008e
            r5.A06 = r0
        L_0x008e:
            java.lang.Integer r0 = r5.A0H
            boolean r0 = r4.A0N(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A02 = r0
            X.0wx r0 = r4.A0A
            r25 = r0
            java.lang.Integer r0 = r25.A04()
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0U = r0
            boolean r0 = r2 instanceof com.whatsapp.jid.UserJid
            r22 = r0
            if (r0 == 0) goto L_0x00c3
            r1 = r2
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = r25
            int r0 = r0.A00(r1)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0R = r0
        L_0x00c3:
            X.0rx r0 = r3.A06(r2)
            if (r0 == 0) goto L_0x00d7
            X.1WV r0 = r0.A0X
            int r1 = r0.disappearingMessagesInitiator
            r0 = 2
            if (r1 != 0) goto L_0x016e
            r0 = 1
        L_0x00d1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A0F = r0
        L_0x00d7:
            boolean r0 = r7 instanceof X.C16730tY
            if (r0 == 0) goto L_0x00ee
            r0 = r7
            X.0tY r0 = (X.C16730tY) r0
            java.lang.String r0 = r0.A13()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A04 = r0
        L_0x00ee:
            boolean r0 = r7 instanceof X.C38631rA
            if (r0 == 0) goto L_0x0103
            r0 = r7
            X.1rA r0 = (X.C38631rA) r0
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A04 = r0
        L_0x0103:
            boolean r0 = r7 instanceof X.C38641rB
            if (r0 == 0) goto L_0x02d8
            r14 = r7
            X.1rB r14 = (X.C38641rB) r14
            X.1XO r10 = r14.A02
            if (r10 == 0) goto L_0x0113
            boolean r1 = r10.A07
            r0 = 1
            if (r1 != 0) goto L_0x0114
        L_0x0113:
            r0 = 0
        L_0x0114:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            r5.A0C = r11
            boolean r0 = r14.A1B()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            r5.A0B = r9
            X.1xU r1 = new X.1xU
            r1.<init>()
            java.lang.Integer r0 = r14.A03
            r1.A05 = r0
            boolean r0 = r14.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            r1.A02 = r11
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r1.A04 = r13
            if (r10 == 0) goto L_0x0144
            boolean r0 = r10.A08
            r10 = 1
            if (r0 != 0) goto L_0x0145
        L_0x0144:
            r10 = 0
        L_0x0145:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1.A03 = r0
            r1.A01 = r9
            X.0t9 r12 = r4.A0C
            r12.A06(r1)
            X.18G r1 = r4.A0I
            java.lang.Integer r11 = r14.A03
            X.1XO r0 = r14.A02
            if (r0 == 0) goto L_0x0160
            boolean r0 = r0.A07
            r21 = 1
            if (r0 != 0) goto L_0x0162
        L_0x0160:
            r21 = 0
        L_0x0162:
            boolean r0 = r14.A00
            r17 = r0
            X.18F r0 = r1.A01
            r24 = r0
            java.lang.Object r10 = r0.A05
            monitor-enter(r10)
            goto L_0x0179
        L_0x016e:
            if (r1 != r0) goto L_0x00d1
            r0 = 3
            goto L_0x00d1
        L_0x0173:
            long r0 = (long) r9
            goto L_0x0064
        L_0x0176:
            long r0 = (long) r1
            goto L_0x0054
        L_0x0179:
            android.content.SharedPreferences r1 = r24.A00()     // Catch:{ all -> 0x02c1 }
            java.lang.String r9 = "sticker_send_count"
            r0 = 0
            int r16 = r1.getInt(r9, r0)     // Catch:{ all -> 0x02c1 }
            android.content.SharedPreferences r0 = r24.A00()     // Catch:{ all -> 0x02c1 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x02c1 }
            int r0 = r16 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r9, r0)     // Catch:{ all -> 0x02c1 }
            r0.apply()     // Catch:{ all -> 0x02c1 }
            monitor-exit(r10)     // Catch:{ all -> 0x02c1 }
            if (r11 == 0) goto L_0x01a0
            int r0 = r11.intValue()
            switch(r0) {
                case 1: goto L_0x0247;
                case 2: goto L_0x0226;
                case 3: goto L_0x0205;
                case 4: goto L_0x01e5;
                case 5: goto L_0x01c5;
                case 6: goto L_0x01a5;
                default: goto L_0x01a0;
            }
        L_0x01a0:
            if (r17 == 0) goto L_0x028a
            monitor-enter(r10)
            goto L_0x0268
        L_0x01a5:
            monitor-enter(r10)
            android.content.SharedPreferences r1 = r24.A00()     // Catch:{ all -> 0x02af }
            java.lang.String r9 = "sticker_send_from_pack_count"
            r0 = 0
            int r11 = r1.getInt(r9, r0)     // Catch:{ all -> 0x02af }
            android.content.SharedPreferences r0 = r24.A00()     // Catch:{ all -> 0x02af }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x02af }
            int r0 = r11 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r9, r0)     // Catch:{ all -> 0x02af }
            r0.apply()     // Catch:{ all -> 0x02af }
            monitor-exit(r10)     // Catch:{ all -> 0x02af }
            goto L_0x01a0
        L_0x01c5:
            monitor-enter(r10)
            android.content.SharedPreferences r1 = r24.A00()     // Catch:{ all -> 0x02b2 }
            java.lang.String r9 = "sticker_send_from_emotion_count"
            r0 = 0
            int r11 = r1.getInt(r9, r0)     // Catch:{ all -> 0x02b2 }
            android.content.SharedPreferences r0 = r24.A00()     // Catch:{ all -> 0x02b2 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x02b2 }
            int r0 = r11 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r9, r0)     // Catch:{ all -> 0x02b2 }
            r0.apply()     // Catch:{ all -> 0x02b2 }
            monitor-exit(r10)     // Catch:{ all -> 0x02b2 }
            goto L_0x01a0
        L_0x01e5:
            monitor-enter(r10)
            android.content.SharedPreferences r1 = r24.A00()     // Catch:{ all -> 0x02b5 }
            java.lang.String r9 = "sticker_send_from_favorites_count"
            r0 = 0
            int r11 = r1.getInt(r9, r0)     // Catch:{ all -> 0x02b5 }
            android.content.SharedPreferences r0 = r24.A00()     // Catch:{ all -> 0x02b5 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x02b5 }
            int r0 = r11 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r9, r0)     // Catch:{ all -> 0x02b5 }
            r0.apply()     // Catch:{ all -> 0x02b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x02b5 }
            goto L_0x01a0
        L_0x0205:
            monitor-enter(r10)
            android.content.SharedPreferences r1 = r24.A00()     // Catch:{ all -> 0x02b8 }
            java.lang.String r9 = "sticker_send_from_recent_count"
            r0 = 0
            int r11 = r1.getInt(r9, r0)     // Catch:{ all -> 0x02b8 }
            android.content.SharedPreferences r0 = r24.A00()     // Catch:{ all -> 0x02b8 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x02b8 }
            int r0 = r11 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r9, r0)     // Catch:{ all -> 0x02b8 }
            r0.apply()     // Catch:{ all -> 0x02b8 }
            monitor-exit(r10)     // Catch:{ all -> 0x02b8 }
            goto L_0x01a0
        L_0x0226:
            monitor-enter(r10)
            android.content.SharedPreferences r1 = r24.A00()     // Catch:{ all -> 0x02bb }
            java.lang.String r9 = "sticker_send_from_forward_count"
            r0 = 0
            int r11 = r1.getInt(r9, r0)     // Catch:{ all -> 0x02bb }
            android.content.SharedPreferences r0 = r24.A00()     // Catch:{ all -> 0x02bb }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x02bb }
            int r0 = r11 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r9, r0)     // Catch:{ all -> 0x02bb }
            r0.apply()     // Catch:{ all -> 0x02bb }
            monitor-exit(r10)     // Catch:{ all -> 0x02bb }
            goto L_0x01a0
        L_0x0247:
            monitor-enter(r10)
            android.content.SharedPreferences r1 = r24.A00()     // Catch:{ all -> 0x02be }
            java.lang.String r9 = "sticker_send_from_search_count"
            r0 = 0
            int r11 = r1.getInt(r9, r0)     // Catch:{ all -> 0x02be }
            android.content.SharedPreferences r0 = r24.A00()     // Catch:{ all -> 0x02be }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x02be }
            int r0 = r11 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r9, r0)     // Catch:{ all -> 0x02be }
            r0.apply()     // Catch:{ all -> 0x02be }
            monitor-exit(r10)     // Catch:{ all -> 0x02be }
            goto L_0x01a0
        L_0x0268:
            android.content.SharedPreferences r1 = r24.A00()     // Catch:{ all -> 0x0287 }
            java.lang.String r9 = "sticker_send_animated_count"
            r0 = 0
            int r11 = r1.getInt(r9, r0)     // Catch:{ all -> 0x0287 }
            android.content.SharedPreferences r0 = r24.A00()     // Catch:{ all -> 0x0287 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0287 }
            int r0 = r11 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r9, r0)     // Catch:{ all -> 0x0287 }
            r0.apply()     // Catch:{ all -> 0x0287 }
            monitor-exit(r10)     // Catch:{ all -> 0x0287 }
            goto L_0x028a
        L_0x0287:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0287 }
            throw r0
        L_0x028a:
            if (r21 == 0) goto L_0x02c4
            monitor-enter(r10)
            android.content.SharedPreferences r1 = r24.A00()     // Catch:{ all -> 0x02ac }
            java.lang.String r9 = "sticker_send_first_party_count"
            r0 = 0
            int r11 = r1.getInt(r9, r0)     // Catch:{ all -> 0x02ac }
            android.content.SharedPreferences r0 = r24.A00()     // Catch:{ all -> 0x02ac }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x02ac }
            int r0 = r11 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r9, r0)     // Catch:{ all -> 0x02ac }
            r0.apply()     // Catch:{ all -> 0x02ac }
            monitor-exit(r10)     // Catch:{ all -> 0x02ac }
            goto L_0x02c4
        L_0x02ac:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02ac }
            throw r0
        L_0x02af:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02af }
            throw r0
        L_0x02b2:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02b2 }
            throw r0
        L_0x02b5:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02b5 }
            throw r0
        L_0x02b8:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02b8 }
            throw r0
        L_0x02bb:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02bb }
            throw r0
        L_0x02be:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02be }
            throw r0
        L_0x02c1:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x02c1 }
            throw r0
        L_0x02c4:
            boolean r0 = r14.A1B()
            if (r0 == 0) goto L_0x02d8
            X.1xV r1 = new X.1xV
            r1.<init>()
            r1.A00 = r13
            java.lang.Integer r0 = r14.A03
            r1.A01 = r0
            r12.A06(r1)
        L_0x02d8:
            boolean r13 = r7 instanceof X.C38831rU
            if (r13 == 0) goto L_0x04fe
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r5.A08 = r0
            X.0t3 r0 = r4.A04
            long r16 = r0.A00()
            long r0 = r7.A0I
            long r16 = r16 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r5.A0T = r0
            boolean r0 = r7 instanceof X.C39161s1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r5.A0K = r11
            r9 = 0
            int r0 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0319
            java.lang.String r1 = "MessageLogging/buildMessageSend Failed to log revoke duration; type="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r5.A0T = r0
        L_0x0319:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            r5.A05 = r0
            if (r6 <= r8) goto L_0x032a
            int r0 = r30 - r8
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0S = r0
        L_0x032a:
            int r0 = r7.A04
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0N = r0
            byte r0 = r7.A10
            boolean r0 = X.C30921dB.A00(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A03 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r39)
            r5.A00 = r0
            if (r38 == 0) goto L_0x035c
            boolean r0 = r7 instanceof X.C30581cc
            if (r0 == 0) goto L_0x04e2
            r0 = r7
            X.1cc r0 = (X.C30581cc) r0
            byte[] r0 = r0.A17()
            if (r0 == 0) goto L_0x035c
            int r0 = r0.length
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x035a:
            r5.A0D = r0
        L_0x035c:
            boolean r0 = r7 instanceof X.C39131ry
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A07 = r0
            X.0tZ r1 = r7.A0D()
            r0 = 0
            if (r1 == 0) goto L_0x036c
            r0 = 1
        L_0x036c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A01 = r0
            r0 = r33
            if (r33 <= 0) goto L_0x038b
            double r0 = (double) r0
            r8 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r0 = r0 / r8
            double r0 = java.lang.Math.ceil(r0)
            long r8 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r5.A0O = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r34)
            r5.A0G = r0
        L_0x038b:
            X.0pd r10 = r4.A0B
            r0 = 2430(0x97e, float:3.405E-42)
            X.0tM r9 = X.C16620tM.A02
            boolean r0 = r10.A0E(r9, r0)
            if (r0 == 0) goto L_0x03c2
            boolean r0 = r7 instanceof X.C30581cc
            if (r0 == 0) goto L_0x03c2
            r8 = r7
            X.1cc r8 = (X.C30581cc) r8
            java.lang.String r0 = r8.A0I()
            java.lang.String r0 = X.C30931dC.A01(r0)
            if (r0 == 0) goto L_0x03c2
            X.1xW r1 = new X.1xW
            r1.<init>()
            r0 = r19
            r1.A01 = r0
            java.lang.Integer r0 = A0B(r8)
            r1.A00 = r0
            java.lang.Integer r0 = A0A(r8)
            r1.A02 = r0
            X.0t9 r0 = r4.A0C
            r0.A06(r1)
        L_0x03c2:
            X.0t9 r8 = r4.A0C
            r8.A06(r5)
            if (r23 == 0) goto L_0x0473
            X.1xX r11 = new X.1xX
            r11.<init>()
            r0 = r26
            int r0 = A02(r0, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A06 = r0
            r0 = r19
            r11.A07 = r0
            java.lang.Integer r0 = X.C30871d6.A00(r3, r2)
            r11.A08 = r0
            int r14 = r7.A05
            r1 = 127(0x7f, float:1.78E-43)
            r0 = 0
            if (r14 < r1) goto L_0x03ec
            r0 = 1
        L_0x03ec:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r11.A01 = r0
            r17 = 0
            r1 = 1
            r12 = 2
            r0 = 0
            if (r14 < r12) goto L_0x03fa
            r0 = 1
        L_0x03fa:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r11.A00 = r0
            r0 = 3
            r16 = 0
            if (r14 < r0) goto L_0x0407
            r16 = 1
        L_0x0407:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            r11.A03 = r0
            r0 = 4
            if (r14 < r0) goto L_0x0412
            r17 = 1
        L_0x0412:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)
            r11.A04 = r0
            java.lang.Integer r0 = r11.A07
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x042a
            X.0sK r0 = r4.A02
            java.lang.Boolean r0 = A07(r0, r15)
            if (r0 == 0) goto L_0x042a
            r11.A02 = r0
        L_0x042a:
            r0 = 536(0x218, float:7.51E-43)
            boolean r0 = r10.A0E(r9, r0)
            if (r0 == 0) goto L_0x0467
            java.lang.Integer r0 = r25.A04()
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.A0B = r0
            if (r22 == 0) goto L_0x0453
            r1 = r2
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = r25
            int r0 = r0.A00(r1)
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.A0A = r0
        L_0x0453:
            X.0rx r0 = r3.A06(r2)
            if (r0 == 0) goto L_0x0467
            X.1WV r0 = r0.A0X
            int r1 = r0.disappearingMessagesInitiator
            r0 = 2
            if (r1 != 0) goto L_0x04de
            r0 = 1
        L_0x0461:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A05 = r0
        L_0x0467:
            int r0 = r7.A04
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.A09 = r0
            r8.A05(r11)
        L_0x0473:
            java.lang.Long r0 = r5.A0P
            if (r0 == 0) goto L_0x04cb
            java.lang.Long r0 = r5.A0S
            if (r0 != 0) goto L_0x04cb
            java.lang.Integer r0 = r5.A0I
            if (r0 == 0) goto L_0x04cb
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L_0x04cb
            java.lang.Boolean r0 = r5.A05
            if (r0 == 0) goto L_0x04cb
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x04cb
            java.lang.Integer r0 = r5.A0J
            if (r0 == 0) goto L_0x04cb
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x04cb
            java.lang.Integer r0 = r5.A0H
            if (r0 == 0) goto L_0x04cb
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x04cb
            r0 = 1625(0x659, float:2.277E-42)
            int r0 = r10.A03(r9, r0)
            if (r0 <= 0) goto L_0x04cb
            java.lang.Long r5 = r5.A0P
            long r11 = r5.longValue()
            long r0 = (long) r0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x04cb
            X.1xY r3 = new X.1xY
            r3.<init>()
            java.lang.String r2 = "message_send"
            r3.A02 = r2
            r3.A00 = r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A01 = r0
            r8.A04(r3)
        L_0x04cb:
            r0 = 1865(0x749, float:2.613E-42)
            boolean r0 = r10.A0E(r9, r0)
            if (r0 == 0) goto L_0x0548
            if (r13 == 0) goto L_0x0548
            r5 = 1
            r0 = r20
            if (r0 == r5) goto L_0x0504
            r1 = 2
            if (r0 == r1) goto L_0x0504
            return
        L_0x04de:
            if (r1 != r12) goto L_0x0461
            r0 = 3
            goto L_0x0461
        L_0x04e2:
            X.18C r0 = r4.A0F
            r0.A00(r7)
            X.0tm r8 = r7.A0F()
            if (r8 == 0) goto L_0x035c
            monitor-enter(r8)
            byte[] r0 = r8.A03     // Catch:{ all -> 0x0545 }
            if (r0 != 0) goto L_0x04f3
            goto L_0x04fa
        L_0x04f3:
            int r0 = r0.length     // Catch:{ all -> 0x0545 }
            double r0 = (double) r0     // Catch:{ all -> 0x0545 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0545 }
            goto L_0x04fb
        L_0x04fa:
            r0 = 0
        L_0x04fb:
            monitor-exit(r8)
            goto L_0x035a
        L_0x04fe:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.A08 = r0
            goto L_0x0319
        L_0x0504:
            X.1xZ r2 = new X.1xZ
            r2.<init>()
            r0 = r19
            r2.A01 = r0
            boolean r0 = r7 instanceof X.C39161s1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            X.0t3 r0 = r4.A04
            long r3 = r0.A00()
            long r0 = r7.A0I
            long r3 = r3 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.A05 = r0
            if (r6 <= r5) goto L_0x0532
            int r6 = r30 - r5
            long r0 = (long) r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A03 = r0
        L_0x0532:
            int r0 = r7.A0B
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            r0 = r18
            r2.A00 = r0
            X.00F r0 = A0N
            r8.A0A(r2, r0)
            return
        L_0x0545:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0548:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18020w1.A0I(X.0tZ, int, int, int, int, int, int, long, boolean, boolean, boolean, boolean):void");
    }

    public void A0J(C16740tZ r29, Collection collection, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        int i10;
        int length;
        long longValue;
        int size;
        C16740tZ r8 = r29;
        int i11 = i6;
        int i12 = i5;
        C28381Vw r11 = r8.A11;
        if (r11.A02 && r8.A0z()) {
            C42191xN r1 = new C42191xN();
            r1.A0N = Long.valueOf(j4);
            long j5 = j2;
            r1.A0L = Long.valueOf(j5);
            long j6 = j3;
            r1.A0M = Long.valueOf(j6);
            r1.A07 = Boolean.valueOf(r8 instanceof C38831rU);
            r1.A0G = Integer.valueOf(A02(this.A09, r8));
            int i13 = i2;
            r1.A0I = Integer.valueOf(i13);
            r1.A0H = Integer.valueOf(A06(r8));
            C15810rt r2 = this.A06;
            C15830rv r7 = r11.A00;
            r1.A0J = C30871d6.A00(r2, r7);
            int i14 = 1;
            r1.A06 = Boolean.valueOf(r8.A10(1));
            byte b2 = r8.A10;
            r1.A08 = Boolean.valueOf(C30921dB.A00(b2));
            r1.A0U = Long.valueOf((long) i4);
            r1.A0T = Long.valueOf((long) i3);
            r1.A05 = Boolean.valueOf(C38621r6.A0r(r8));
            r1.A0B = Boolean.valueOf(z2);
            AnonymousClass18H r6 = this.A05;
            synchronized (r6) {
                i10 = 0;
                if (r7 != null) {
                    Integer num = (Integer) r6.A00.get(r7);
                    if (num != null) {
                        i10 = num.intValue();
                    }
                }
            }
            if (i10 > 0) {
                r1.A0D = Boolean.TRUE;
            } else {
                r1.A01 = Boolean.valueOf(z3);
            }
            C14710pd r4 = this.A0B;
            int A032 = r4.A03(C16620tM.A01, 767);
            if (i12 >= A032 || i10 >= A032) {
                r1.A0C = Boolean.TRUE;
            }
            r1.A00 = Boolean.valueOf(z4);
            r1.A03 = Boolean.valueOf(z5);
            if (i13 == 5) {
                r1.A0P = Long.valueOf((long) i7);
                r1.A0X = Long.valueOf((long) i8);
            }
            int i15 = i9;
            if (C16030sJ.A0L(r7) || C16030sJ.A0G(r7)) {
                if (i9 > 0) {
                    r1.A0Q = Long.valueOf(i15 <= 32 ? 32 : (long) i15);
                    r1.A0F = Integer.valueOf(C40511uF.A01(i15));
                }
                if (collection != null && (size = collection.size()) > 0) {
                    r1.A0K = Long.valueOf(size <= 32 ? 32 : (long) size);
                    r1.A0E = Integer.valueOf(A00(size));
                    if (i10 > 0) {
                        i12 = i10;
                    } else if (i5 < 0) {
                        i12 = 0;
                    }
                    double d2 = (double) size;
                    r1.A0O = Long.valueOf((long) Math.ceil((((double) i12) * 100.0d) / d2));
                    if (i6 < 0) {
                        i11 = 0;
                    }
                    r1.A0W = Long.valueOf((long) Math.ceil((((double) i11) * 100.0d) / d2));
                }
            } else if (collection != null) {
                Iterator it = collection.iterator();
                int i16 = 0;
                while (it.hasNext()) {
                    DeviceJid deviceJid = (DeviceJid) it.next();
                    C16040sK r3 = this.A02;
                    if (r3.A0I(deviceJid.getUserJid()) || r3.A0J(deviceJid)) {
                        i14++;
                    } else {
                        i16++;
                    }
                }
                r1.A0V = Long.valueOf((long) i14);
                r1.A0S = Long.valueOf((long) i16);
            }
            r1.A02 = Boolean.valueOf(z6);
            r1.A0A = Boolean.valueOf(r8 instanceof C39131ry);
            r1.A04 = Boolean.valueOf(A0N(r7, r1.A0G));
            this.A0K.execute(new RunnableRunnableShape0S0301000_I0(this, r1, r8, i15, 1));
            r8.A18 = SystemClock.uptimeMillis();
            if (i13 == 3 && i10 > 0) {
                synchronized (r6) {
                    if (r7 != null) {
                        r6.A00.put(r7, 0);
                    }
                }
            }
            if (this.A0M) {
                AnonymousClass18E r22 = this.A0E;
                int hashCode = r11.A01.hashCode();
                Integer num2 = r1.A0I;
                if (num2 != null) {
                    if (num2.intValue() == 3) {
                        C31081dR r32 = r22.A01;
                        AnonymousClass17S r9 = r32.A07;
                        int i17 = r32.A06.A05;
                        r9.AKo("wa_type", i17, hashCode, (long) b2);
                        r1.toString();
                        Field[] declaredFields = C42191xN.class.getDeclaredFields();
                        if (declaredFields != null && (length = declaredFields.length) > 0) {
                            int i18 = 0;
                            do {
                                Field field = declaredFields[i18];
                                try {
                                    Object obj = field.get(r1);
                                    if (obj != null) {
                                        String name = field.getName();
                                        if (obj instanceof Integer) {
                                            longValue = (long) ((Number) obj).intValue();
                                        } else if (obj instanceof Long) {
                                            longValue = ((Number) obj).longValue();
                                        } else if (obj instanceof Boolean) {
                                            r9.AKq(name, i17, hashCode, ((Boolean) obj).booleanValue());
                                        } else if (obj instanceof String) {
                                            r9.AKp(name, (String) obj, i17, hashCode);
                                        }
                                        r9.AKo(name, i17, hashCode, longValue);
                                    }
                                } catch (IllegalAccessException unused) {
                                }
                                i18++;
                            } while (i18 < length);
                        }
                    }
                    r22.A04(hashCode, r1.A0I.intValue());
                }
            }
            C16620tM r5 = C16620tM.A02;
            int A033 = r4.A03(r5, 920);
            int A034 = r4.A03(r5, 1488);
            if (!z2 && A034 > 0 && A034 > A033 && r4.A0E(r5, 919) && j2 >= ((long) A033) && j2 <= ((long) A034)) {
                A0D(r1, "MessageLogging/AbsDurationTooHigh", j5);
            }
            int A035 = r4.A03(r5, 1072);
            int A036 = r4.A03(r5, 1489);
            if (!z2 && !z4 && A036 > 0 && A036 > A035 && r4.A0E(r5, 1126) && j3 >= ((long) A035) && j3 <= ((long) A036)) {
                A0D(r1, "MessageLogging/RelativeDurationTooHigh", j6);
            }
        }
    }

    public void A0K(C30161br r4, int i2) {
        int i3;
        C42231xR r2 = new C42231xR();
        r2.A04 = Integer.valueOf(A03(this.A09, r4));
        r2.A03 = Integer.valueOf(i2);
        C28381Vw r0 = r4.A0C;
        if (r0 == null) {
            r0 = r4.A0m;
        }
        C15830rv r1 = r0.A00;
        if (r1 instanceof GroupJid) {
            i3 = 1;
        } else if (r1 instanceof C34841kx) {
            i3 = 2;
        } else {
            boolean z2 = r1 instanceof C34771kq;
            i3 = 0;
            if (z2) {
                i3 = 3;
            }
        }
        r2.A01 = Integer.valueOf(i3);
        r2.A02 = Integer.valueOf(A01(this.A02, DeviceJid.of(r4.A01())));
        r2.A06 = Long.valueOf((long) r4.A00());
        boolean z3 = false;
        if (r4.A0H != null) {
            z3 = true;
        }
        r2.A00 = Boolean.valueOf(z3);
        r2.A05 = A08(r4.A01);
        this.A0C.A06(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (r1 == null) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L(X.C30161br r5, java.lang.Integer r6, int r7) {
        /*
            r4 = this;
            X.1xS r2 = new X.1xS
            r2.<init>()
            java.lang.String r0 = r5.A0o
            r2.A08 = r0
            if (r6 == 0) goto L_0x0019
            int r3 = r6.intValue()
            r0 = 1
            if (r3 != r0) goto L_0x0090
            r0 = 0
        L_0x0013:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0017:
            r2.A01 = r0
        L_0x0019:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.A03 = r0
            com.whatsapp.jid.Jid r3 = r5.A01()
            if (r3 == 0) goto L_0x003b
            java.lang.String r0 = r3.getRawString()
            r2.A09 = r0
            X.0sK r1 = r4.A02
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r3)
            int r0 = A01(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04 = r0
        L_0x003b:
            X.0w2 r0 = r4.A09
            int r0 = A03(r0, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A05 = r0
            X.0tZ r0 = r5.A0B
            if (r0 == 0) goto L_0x0050
            java.lang.Integer r1 = r0.A0X
            r0 = 1
            if (r1 != 0) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            int r0 = r5.A00()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A07 = r0
            X.1Vw r0 = r5.A0C
            if (r0 != 0) goto L_0x0068
            X.1Vw r0 = r5.A0m
        L_0x0068:
            X.0rv r1 = r0.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0083
            r1 = 1
        L_0x006f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A02 = r0
            int r0 = r5.A01
            java.lang.Integer r0 = A08(r0)
            r2.A06 = r0
            X.0t9 r0 = r4.A0C
            r0.A06(r2)
            return
        L_0x0083:
            boolean r0 = r1 instanceof X.C34841kx
            if (r0 == 0) goto L_0x0089
            r1 = 2
            goto L_0x006f
        L_0x0089:
            boolean r0 = r1 instanceof X.C34771kq
            r1 = 0
            if (r0 == 0) goto L_0x006f
            r1 = 3
            goto L_0x006f
        L_0x0090:
            r1 = 2
            if (r3 == r1) goto L_0x0013
            r0 = 3
            if (r3 != r0) goto L_0x009c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0017
        L_0x009c:
            r0 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18020w1.A0L(X.1br, java.lang.Integer, int):void");
    }

    public void A0M(Long l2, int[] iArr, int i2, long j2, boolean z2) {
        C42221xQ r2 = new C42221xQ();
        r2.A02 = Integer.valueOf(i2);
        r2.A00 = Boolean.valueOf(z2);
        r2.A07 = l2;
        if (iArr != null) {
            int length = iArr.length;
            r2.A08 = Long.valueOf((long) length);
            if (length >= 1) {
                r2.A03 = Long.valueOf((long) iArr[0]);
                if (length >= 2) {
                    r2.A04 = Long.valueOf((long) iArr[1]);
                    if (length >= 3) {
                        r2.A05 = Long.valueOf((long) iArr[2]);
                        if (length >= 4) {
                            r2.A06 = Long.valueOf((long) iArr[3]);
                        }
                    }
                }
            }
        }
        r2.A01 = Double.valueOf((double) j2);
        this.A0C.A04(r2);
    }

    public boolean A0N(C15830rv r5, Integer num) {
        if (!(r5 instanceof AnonymousClass1ZX)) {
            GroupJid of = GroupJid.of(r5);
            if (of == null || num == null || num.intValue() != 34) {
                return false;
            }
            C16000sG r0 = this.A03;
            C15810rt r1 = this.A06;
            C16010sH A092 = r0.A09(of);
            if (A092 == null || !A092.A0b || !r1.A0H(of)) {
                return false;
            }
        }
        return true;
    }
}
