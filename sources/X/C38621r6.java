package X;

import android.os.Build;
import android.os.Bundle;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;

/* renamed from: X.1r6  reason: invalid class name and case insensitive filesystem */
public class C38621r6 extends C30921dB {
    public static int A06(C16730tY r1) {
        if (A10(r1)) {
            return A0z(r1) ? 1 : 0;
        }
        if (A11(r1)) {
            return 2;
        }
        return A0z(r1) ? 4 : 3;
    }

    public static long A07(C16740tZ r5) {
        if (r5 == null || r5.A13 == 0) {
            return Long.MIN_VALUE;
        }
        return r5.A14;
    }

    public static Bundle A08(C28381Vw r3) {
        if (r3 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("message_key_jid", C16030sJ.A03(r3.A00));
        bundle.putBoolean("message_key_from_me", r3.A02);
        bundle.putString("message_key_id", r3.A01);
        return bundle;
    }

    public static C16010sH A09(C216114t r2, C16740tZ r3) {
        C15830rv r1 = r3.A11.A00;
        if (C16030sJ.A0L(r1) || C16030sJ.A0Q(r1)) {
            r1 = r3.A0B();
        }
        if (r1 != null) {
            return r2.A01(r1);
        }
        return null;
    }

    public static C16050sL A0A(C16740tZ r1) {
        if (r1 instanceof C38651rC) {
            return C16050sL.A03(r1.A11.A00);
        }
        return null;
    }

    public static UserJid A0B(C16040sK r1, C16740tZ r2) {
        if (!r2.A11.A02) {
            return r2.A0C();
        }
        r1.A0B();
        return r1.A05;
    }

    @Deprecated
    public static C16740tZ A0C(C16440t3 r2, C222717h r3, C16740tZ r4) {
        C39181s3 A0F;
        C16740tZ A0D = A0D(r2, r3, r4);
        if (A0D != null) {
            return A0D;
        }
        C39101rv A0G = A0G(r2, r3, r4);
        if (A0G != null) {
            return A0G;
        }
        if ((r4 instanceof C39171s2) && (A0F = A0F(r2, r3, (C39171s2) r4)) != null) {
            return A0F;
        }
        C39191s4 r1 = r4.A1A;
        if (r1 == null || !r1.A11.A02) {
            return null;
        }
        C16740tZ A0D2 = A0D(r2, r3, r1);
        if (A0D2 instanceof C39191s4) {
            return A0D2;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r0 != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C16740tZ A0D(X.C16440t3 r8, X.C222717h r9, X.C16740tZ r10) {
        /*
            boolean r0 = r10 instanceof X.C39191s4
            if (r0 == 0) goto L_0x0024
            r6 = 30000(0x7530, double:1.4822E-319)
        L_0x0006:
            X.1Vw r5 = r10.A11
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x003d
            int r1 = r10.A0C
            r0 = 4
            int r0 = X.C42881yp.A00(r1, r0)
            if (r0 >= 0) goto L_0x0033
            long r3 = r10.A0I
            long r3 = r3 + r6
            long r1 = r8.A00()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0033
            java.util.Map r1 = r9.A01
            monitor-enter(r1)
            goto L_0x0028
        L_0x0024:
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x0006
        L_0x0028:
            boolean r0 = r1.containsKey(r5)     // Catch:{ all -> 0x002e }
            monitor-exit(r1)     // Catch:{ all -> 0x002e }
            goto L_0x0031
        L_0x002e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002e }
            throw r0
        L_0x0031:
            if (r0 == 0) goto L_0x003c
        L_0x0033:
            int r1 = r10.A0C
            r0 = 7
            if (r1 == r0) goto L_0x003c
            r0 = 20
            if (r1 != r0) goto L_0x003d
        L_0x003c:
            return r10
        L_0x003d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38621r6.A0D(X.0t3, X.17h, X.0tZ):X.0tZ");
    }

    public static C28381Vw A0E(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C15830rv A02 = C15830rv.A02(bundle.getString("message_key_jid"));
        boolean z2 = bundle.getBoolean("message_key_from_me");
        String string = bundle.getString("message_key_id");
        if (A02 == null || string == null) {
            return null;
        }
        return new C28381Vw(A02, string, z2);
    }

    public static C39181s3 A0F(C16440t3 r4, C222717h r5, C39171s2 r6) {
        List<C16740tZ> list = r6.A04;
        if (list != null) {
            for (C16740tZ r1 : list) {
                if (r1.A11.A02) {
                    C16740tZ A0D = A0D(r4, r5, r1);
                    if (A0D instanceof C39181s3) {
                        return (C39181s3) A0D;
                    }
                }
            }
        }
        return null;
    }

    public static C39101rv A0G(C16440t3 r4, C222717h r5, C16740tZ r6) {
        AnonymousClass23T r0 = r6.A0W;
        if (r0 != null) {
            for (C16740tZ r1 : r0.A02()) {
                if (r1.A11.A02) {
                    C16740tZ A0D = A0D(r4, r5, r1);
                    if (A0D instanceof C39101rv) {
                        return (C39101rv) A0D;
                    }
                }
            }
        }
        return null;
    }

    public static String A0H(byte b2) {
        if (b2 != 0) {
            if (b2 == 7) {
                return "system";
            }
            if (b2 == 1 || b2 == 25 || b2 == 42) {
                return "image";
            }
            if (b2 == 2) {
                return "audio";
            }
            if (b2 == 3 || b2 == 28 || b2 == 43) {
                return "video";
            }
            if (b2 != 13) {
                if (b2 == 4) {
                    return "vcard";
                }
                if (b2 != 5) {
                    if (b2 == 16) {
                        return "livelocation";
                    }
                    if (b2 != 9) {
                        if (b2 == 20) {
                            return "sticker";
                        }
                        if (b2 == 23) {
                            return "product";
                        }
                        if (b2 == 37) {
                            return "catalog";
                        }
                        if (b2 == 24) {
                            return "invite";
                        }
                        if (b2 != 26) {
                            if (b2 != 29) {
                                if (b2 != 30) {
                                    if (b2 == 45) {
                                        return "list";
                                    }
                                    if (b2 == 46) {
                                        return "list_response";
                                    }
                                    if (b2 == 52) {
                                        return "product_list";
                                    }
                                }
                            }
                        }
                    }
                    return "document";
                }
                return "location";
            }
            return "gif";
        }
        return null;
    }

    public static String A0I(AnonymousClass013 r3, long j2) {
        return j2 <= 0 ? "" : AnonymousClass2GQ.A03(r3, j2);
    }

    public static String A0J(C16740tZ r3) {
        StringBuilder sb = new StringBuilder("fmsg/status:");
        sb.append(r3.A0C);
        sb.append("/type:");
        sb.append(r3.A10);
        C28381Vw r1 = r3.A11;
        if (C16030sJ.A0L(r1.A00) && (r3 instanceof AnonymousClass1WU)) {
            sb.append("/grp_action:");
            sb.append(((AnonymousClass1WU) r3).A00);
        }
        sb.append("/rmt-src:");
        sb.append(r3.A0B());
        sb.append(" ");
        sb.append(r1.toString());
        return sb.toString();
    }

    public static void A0K(C16040sK r0, C15810rt r1, C16740tZ r2) {
        C15840rx A06;
        if (A0Q(r0, r2) && (A06 = r1.A06(r2.A11.A00)) != null) {
            synchronized (A06) {
                int i2 = A06.A04;
                if (i2 > 0) {
                    A06.A04 = i2 - 1;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("chatInfo/decrementUnseenImportantMessageCount/");
                sb.append(A06.A07());
                Log.i(sb.toString());
            }
        }
    }

    public static void A0L(C16740tZ r2) {
        C42591y4 A12;
        C42591y4 A122;
        if (r2.A0F() != null) {
            r2.A0F().A01 = true;
        }
        if ((r2 instanceof C16730tY) && (A122 = ((C16730tY) r2).A12()) != null) {
            A122.A00 = true;
        }
        C16740tZ A0D = r2.A0D();
        if (A0D != null) {
            if (A0D.A0F() != null) {
                r2.A0D().A0F().A01 = true;
            }
            C16740tZ A0D2 = r2.A0D();
            if ((A0D2 instanceof C16730tY) && (A12 = ((C16730tY) A0D2).A12()) != null) {
                A12.A00 = true;
            }
        }
    }

    public static boolean A0M(byte b2) {
        return b2 == 13 || b2 == 29;
    }

    public static boolean A0N(byte b2) {
        return b2 == 1 || b2 == 23 || b2 == 37 || b2 == 2 || b2 == 3 || b2 == 13 || b2 == 9 || b2 == 20 || b2 == 25 || b2 == 26 || b2 == 28 || b2 == 29;
    }

    public static boolean A0O(int i2) {
        return i2 == 12 || i2 == 79 || i2 == 20 || i2 == 90 || i2 == 93 || i2 == 106;
    }

    public static boolean A0P(C16300so r3, C15810rt r4, C16070sO r5, C16740tZ r6) {
        C28381Vw r1 = r6.A11;
        if (!r1.A02 && !(r6 instanceof C39161s1)) {
            return false;
        }
        C15830rv r12 = r1.A00;
        if (!(r12 instanceof GroupJid) || (r6 instanceof C38821rT) || (r6 instanceof C38541qx) || (r6 instanceof AnonymousClass1WU) || !r4.A0H(r12) || r5.A0A((GroupJid) r12)) {
            return true;
        }
        Log.e("SendMessageMethods/only admins can send message to CAGs");
        r3.AcB("SendMessageMethods/prohibited send to CAG", (String) null, false);
        return false;
    }

    public static boolean A0Q(C16040sK r2, C16740tZ r3) {
        C28381Vw r1 = r3.A11;
        if (r1.A02 || A0o(r3) || !C16030sJ.A0L(r1.A00)) {
            return false;
        }
        List list = r3.A0q;
        if (list != null) {
            r2.A0B();
            if (list.contains(r2.A05)) {
                return true;
            }
        }
        C16740tZ A0D = r3.A0D();
        return A0D != null && A0D.A11.A02;
    }

    public static boolean A0R(C16040sK r2, C16740tZ r3) {
        if (!(r3 instanceof AnonymousClass1WU)) {
            return false;
        }
        int i2 = ((AnonymousClass1WU) r3).A00;
        if (A0O(i2) || i2 == 52) {
            List list = ((C39291sE) r3).A01;
            r2.A0B();
            AnonymousClass1ZT r0 = r2.A05;
            AnonymousClass00B.A06(r0);
            return list.contains(r0);
        } else if (i2 == 4) {
            return r2.A0I(r3.A0B());
        } else {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0046, code lost:
        if (r1 != 12) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0S(X.C16040sK r4, X.C16740tZ r5) {
        /*
            X.1Vw r0 = r5.A11
            boolean r0 = r0.A02
            r3 = 0
            if (r0 == 0) goto L_0x0048
            boolean r0 = r5 instanceof X.AnonymousClass1WU
            r2 = 1
            if (r0 == 0) goto L_0x0063
            r0 = r5
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r1 = r0.A00
            if (r1 == r2) goto L_0x005a
            r0 = 14
            if (r1 == r0) goto L_0x005a
            r0 = 17
            if (r1 == r0) goto L_0x005a
            r0 = 20
            if (r1 == r0) goto L_0x0049
            r0 = 27
            if (r1 == r0) goto L_0x005a
            r0 = 79
            if (r1 == r0) goto L_0x0049
            r0 = 90
            if (r1 == r0) goto L_0x005a
            r0 = 99
            if (r1 == r0) goto L_0x005a
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto L_0x0049
            r0 = 106(0x6a, float:1.49E-43)
            if (r1 == r0) goto L_0x005a
            r0 = 4
            if (r1 == r0) goto L_0x005a
            r0 = 5
            if (r1 == r0) goto L_0x005a
            r0 = 6
            if (r1 == r0) goto L_0x005a
            r0 = 11
            if (r1 == r0) goto L_0x005a
            r0 = 12
            if (r1 == r0) goto L_0x005a
        L_0x0048:
            return r3
        L_0x0049:
            X.1sE r5 = (X.C39291sE) r5
            java.util.List r1 = r5.A01
            r4.A0B()
            X.1ZT r0 = r4.A05
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r1.contains(r0)
            return r0
        L_0x005a:
            X.0rv r0 = r5.A0B()
            boolean r0 = r4.A0I(r0)
            return r0
        L_0x0063:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38621r6.A0S(X.0sK, X.0tZ):boolean");
    }

    public static boolean A0T(C16040sK r2, C16740tZ r3) {
        return !r3.A11.A02 && r3.A10 == 64 && r2.A0I(((C39161s1) r3).A00) && !r3.A1D;
    }

    public static boolean A0U(C16040sK r2, C16740tZ r3) {
        if (!(r3 instanceof C39451sV) ? (r3 instanceof C40371u0) : ((AnonymousClass1WU) r3).A00 == 88) {
            return !r2.A0I(r3.A0B());
        }
    }

    public static boolean A0V(C16040sK r2, C38831rU r3) {
        boolean A0I;
        byte b2 = r3.A10;
        if (b2 == 15) {
            A0I = r3.A11.A02;
        } else if (b2 != 64) {
            return false;
        } else {
            A0I = r2.A0I(((C39161s1) r3).A00);
        }
        return !A0I || r3.A1D;
    }

    public static boolean A0W(C15900s5 r7, C14710pd r8, C16740tZ r9) {
        String str;
        String str2;
        if ((!(r9 instanceof C38891ra) || ((C38891ra) r9).A01 != null) && !(r9 instanceof C39021rn)) {
            if (r9 instanceof C16840tj) {
                C42101xE A01 = C42091xD.A01((C16840tj) r9);
                if (A01 != null) {
                    if ((((A01 instanceof C42111xF) || ((A01 instanceof AnonymousClass33v) && !"mpm".equals(A01.A00.A06))) ? C795540h.ALL : C795540h.NONE) != C795540h.NONE) {
                        return true;
                    }
                }
            } else {
                byte b2 = r9.A10;
                if (!(C30921dB.A00(b2) || b2 == 78 || b2 == 10 || b2 == 11 || b2 == 31 || b2 == 12 || A0o(r9))) {
                    r9.A0I();
                    if (r9.A0L == null) {
                        if (A0N(b2)) {
                            C16730tY r1 = (C16730tY) r9;
                            C16750ta r3 = r1.A02;
                            if (r3 == null) {
                                str2 = "userActionForwardMessage/media_data is null";
                            } else if (!(r9 instanceof C38711rI) || !A12((C38711rI) r9)) {
                                if (r3.A0F == null) {
                                    str2 = "userActionForwardMessage/media_data.file is null";
                                } else if (!r3.A03()) {
                                    str2 = "userActionForwardMessage/media_data.file does not exist";
                                } else {
                                    long j2 = r3.A0A;
                                    long j3 = 0;
                                    if (j2 != 0) {
                                        File file = r3.A0F;
                                        if (file != null) {
                                            j3 = file.length();
                                        }
                                        if (j2 != j3) {
                                            StringBuilder sb = new StringBuilder("userActionForwardMessage/original_size:");
                                            sb.append(r3.A0A);
                                            sb.append(" file_length:");
                                            sb.append(r3.A0F.length());
                                            str = sb.toString();
                                            Log.w(str);
                                            return false;
                                        }
                                    }
                                    if (r9.A11.A02 && !r3.A0P && !r7.A05(C15910s6.A0c)) {
                                        str = "userActionForwardMessage/cannot forward partially uploaded message.";
                                        Log.w(str);
                                        return false;
                                    }
                                }
                            } else if (r1.A04 == null) {
                                return false;
                            }
                            Log.e(str2);
                            return false;
                        }
                        return !A0Z(r8, r9) && !A0n(r9) && ((r9 instanceof C16860tl) || (r9 instanceof C16730tY) || (r9 instanceof C30581cc));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (new X.C32441gM(r5, r1).A02() != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r0 = r4.A08(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0X(X.C16000sG r4, X.C17030uP r5, X.C16070sO r6, X.C14710pd r7, X.C20260zl r8, X.C17240ul r9, X.C16740tZ r10, X.AnonymousClass135 r11) {
        /*
            X.1Vw r0 = r10.A11
            X.0rv r2 = r0.A00
            boolean r0 = X.C40561uK.A01(r8, r2)
            r3 = 0
            if (r0 != 0) goto L_0x0054
            boolean r0 = X.C40571uL.A00(r7, r2)
            if (r0 != 0) goto L_0x0054
            com.whatsapp.jid.GroupJid r1 = com.whatsapp.jid.GroupJid.of(r2)
            if (r1 == 0) goto L_0x0064
            X.0sH r0 = r4.A08(r1)
            if (r0 == 0) goto L_0x005d
            boolean r0 = r9.A0g(r0, r1)
            if (r0 == 0) goto L_0x005d
        L_0x0023:
            r1 = 0
        L_0x0024:
            boolean r0 = A0t(r10)
            if (r0 == 0) goto L_0x0054
            if (r1 == 0) goto L_0x0054
            boolean r0 = X.C41871wn.A01(r7, r11)
            if (r0 == 0) goto L_0x0055
            X.AnonymousClass00B.A06(r2)
            X.0sH r1 = r4.A07(r2)
            if (r1 == 0) goto L_0x0055
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r1.A08(r0)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r0 = X.C32431gL.A01(r8, r1)
            if (r0 != 0) goto L_0x0055
            X.1gM r0 = new X.1gM
            r0.<init>(r5, r1)
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0055
        L_0x0054:
            return r3
        L_0x0055:
            boolean r0 = X.C41861wm.A00(r4, r5, r7, r8, r10)
            if (r0 != 0) goto L_0x0054
            r3 = 1
            return r3
        L_0x005d:
            boolean r0 = r6.A09(r1)
            if (r0 != 0) goto L_0x0064
            goto L_0x0023
        L_0x0064:
            r1 = 1
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38621r6.A0X(X.0sG, X.0uP, X.0sO, X.0pd, X.0zl, X.0ul, X.0tZ, X.135):boolean");
    }

    public static boolean A0Y(C15810rt r2, C16740tZ r3) {
        if ((r3 instanceof C38541qx) && !(r3 instanceof C39191s4)) {
            C15830rv r1 = r3.A11.A00;
            return C16030sJ.A0L(r1) && r2.A02(C16050sL.A03(r1)) == 3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0Z(X.C14710pd r3, X.C16740tZ r4) {
        /*
            boolean r0 = r4 instanceof X.C30571cb
            if (r0 == 0) goto L_0x002a
            X.1cb r4 = (X.C30571cb) r4
            X.1cf r0 = r4.A00
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x002a
            java.util.Iterator r2 = r0.iterator()
        L_0x0010:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r1 = r2.next()
            X.1sy r1 = (X.C39731sy) r1
            boolean r0 = A0a(r3, r1)
            if (r0 != 0) goto L_0x0028
            boolean r0 = A0b(r3, r1)
            if (r0 == 0) goto L_0x0010
        L_0x0028:
            r0 = 1
            return r0
        L_0x002a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38621r6.A0Z(X.0pd, X.0tZ):boolean");
    }

    public static boolean A0a(C14710pd r3, C39731sy r4) {
        C16620tM r2 = C16620tM.A02;
        return !r3.A0E(r2, 1023) && r4.A03 == 2 && r4.A05.startsWith(r3.A06(r2, 1024));
    }

    public static boolean A0b(C14710pd r3, C39731sy r4) {
        C16620tM r2 = C16620tM.A02;
        return !r3.A0E(r2, 1544) && r4.A03 == 2 && r4.A05.startsWith(r3.A06(r2, 1547));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r1 = r4.A10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0c(X.C20260zl r3, X.C16740tZ r4) {
        /*
            X.1Vw r1 = r4.A11
            boolean r0 = r1.A02
            r2 = 0
            if (r0 != 0) goto L_0x0031
            X.0rv r0 = r1.A00
            boolean r0 = X.C40561uK.A01(r3, r0)
            if (r0 != 0) goto L_0x0031
            byte r1 = r4.A10
            r0 = 8
            if (r1 == r0) goto L_0x0031
            r0 = 10
            if (r1 == r0) goto L_0x0031
            r0 = 7
            if (r1 == r0) goto L_0x0031
            r0 = 12
            if (r1 == r0) goto L_0x0031
            boolean r0 = A0o(r4)
            if (r0 != 0) goto L_0x0031
            r0 = 19
            if (r1 == r0) goto L_0x0031
            boolean r0 = X.C41061vA.A0I(r4)
            if (r0 != 0) goto L_0x0031
            r2 = 1
        L_0x0031:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38621r6.A0c(X.0zl, X.0tZ):boolean");
    }

    public static boolean A0d(C16740tZ r1) {
        if (r1.A0t) {
            C28381Vw r12 = r1.A11;
            return r12.A02 && !C16030sJ.A0G(r12.A00);
        }
    }

    public static boolean A0e(C16740tZ r6) {
        if (!(r6 instanceof AnonymousClass1WU)) {
            return false;
        }
        long j2 = (long) ((AnonymousClass1WU) r6).A00;
        return j2 == 61 || j2 == 69;
    }

    public static boolean A0f(C16740tZ r2) {
        return r2.A11.A02 && A0p(r2) && ((AnonymousClass1WU) r2).A00 == 67;
    }

    public static boolean A0g(C16740tZ r1) {
        if (!r1.A11.A02 || !A0p(r1)) {
            return false;
        }
        int i2 = ((AnonymousClass1WU) r1).A00;
        return i2 == 28 || i2 == 10;
    }

    public static boolean A0h(C16740tZ r2) {
        return r2.A11.A02 && A0p(r2) && ((AnonymousClass1WU) r2).A00 == 57;
    }

    public static boolean A0i(C16740tZ r2) {
        return r2.A11.A02 && A0p(r2) && ((AnonymousClass1WU) r2).A00 == 71;
    }

    public static boolean A0j(C16740tZ r2) {
        if (r2.A10 != 36) {
            return r2.A11.A02 && A0p(r2) && (r2 instanceof AnonymousClass1WU) && ((AnonymousClass1WU) r2).A00 == 59;
        }
        return true;
    }

    public static boolean A0k(C16740tZ r2) {
        return r2.A11.A02 && A0p(r2) && ((AnonymousClass1WU) r2).A00 == 18;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = r2.A10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0l(X.C16740tZ r2) {
        /*
            int r0 = r2.A04
            r1 = 0
            if (r0 <= 0) goto L_0x0006
            r1 = 1
        L_0x0006:
            boolean r0 = r2.A0x
            if (r1 == 0) goto L_0x0029
            if (r0 != 0) goto L_0x0029
            boolean r0 = A0o(r2)
            if (r0 != 0) goto L_0x0029
            boolean r0 = r2 instanceof X.C39001rl
            if (r0 != 0) goto L_0x0029
            byte r2 = r2.A10
            r0 = 10
            if (r2 == r0) goto L_0x0029
            r0 = 12
            if (r2 == r0) goto L_0x0029
            r0 = 11
            if (r2 == r0) goto L_0x0029
            r1 = 31
            r0 = 1
            if (r2 != r1) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38621r6.A0l(X.0tZ):boolean");
    }

    public static boolean A0m(C16740tZ r6) {
        if ((r6 instanceof C38891ra) || !(r6 instanceof C16730tY)) {
            return false;
        }
        boolean z2 = false;
        if (r6.A05 >= 127) {
            z2 = true;
        }
        if (r6 instanceof C39001rl) {
            return false;
        }
        C16750ta r0 = ((C16730tY) r6).A02;
        boolean z3 = r0 != null ? r0.A0P : false;
        boolean z4 = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z4 = true;
        }
        if (r6.A11.A02 || z3) {
            return !z4 || !z2;
        }
        return false;
    }

    public static boolean A0n(C16740tZ r3) {
        if (C42551xz.A04(r3)) {
            for (C39821t7 r0 : r3.A0E().A00.A02) {
                if (r0.A02 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0o(C16740tZ r2) {
        byte b2 = r2.A10;
        return b2 == 15 || b2 == 64;
    }

    public static boolean A0p(C16740tZ r3) {
        byte b2 = r3.A10;
        return b2 == 0 ? r3.A0C == 6 : b2 == 7;
    }

    public static boolean A0q(C16740tZ r6) {
        if (!(r6 instanceof AnonymousClass1WU)) {
            return false;
        }
        long j2 = (long) ((AnonymousClass1WU) r6).A00;
        return j2 == 22 || j2 == 34 || j2 == 35 || j2 == 36 || j2 == 23 || j2 == 24 || j2 == 25 || j2 == 26 || j2 == 46 || j2 == 47 || j2 == 48 || j2 == 49 || j2 == 50 || j2 == 55;
    }

    public static boolean A0r(C16740tZ r5) {
        C28381Vw r2 = r5.A11;
        C15830rv r1 = r2.A00;
        return !(r5 instanceof AnonymousClass1WU) && r2.A02 && ((r1 instanceof UserJid) || (r1 instanceof C16060sN)) && r5.A0G == 0 && r5.A19 == null && r5.A0B == 0;
    }

    public static boolean A0s(C16740tZ r1) {
        return r1.A10(512) || r1.A10(4096);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r2 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r0 = r3.A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0t(X.C16740tZ r5) {
        /*
            X.1Vw r0 = r5.A11
            boolean r4 = r0.A02
            r2 = 0
            if (r4 == 0) goto L_0x0011
            int r1 = r5.A0C
            r0 = 4
            int r0 = X.C42881yp.A00(r1, r0)
            if (r0 >= 0) goto L_0x0011
        L_0x0010:
            return r2
        L_0x0011:
            byte r1 = r5.A10
            if (r1 != 0) goto L_0x0045
            X.1Vt r3 = r5.A0L
            if (r3 == 0) goto L_0x0043
            if (r4 == 0) goto L_0x0043
            int r2 = r3.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto L_0x003f
            r0 = 406(0x196, float:5.69E-43)
            if (r2 == r0) goto L_0x003f
            r0 = 407(0x197, float:5.7E-43)
            if (r2 == r0) goto L_0x003f
            r1 = 403(0x193, float:5.65E-43)
            if (r2 == r1) goto L_0x003f
            r0 = 412(0x19c, float:5.77E-43)
            if (r2 == r0) goto L_0x003f
            r0 = 408(0x198, float:5.72E-43)
            if (r2 != r0) goto L_0x0043
            X.1W2 r0 = r3.A0A
            if (r0 == 0) goto L_0x0043
            int r0 = r0.A06()
            if (r0 != r1) goto L_0x0043
        L_0x003f:
            r0 = 1
        L_0x0040:
            r0 = r0 ^ 1
            return r0
        L_0x0043:
            r0 = 0
            goto L_0x0040
        L_0x0045:
            r0 = 10
            if (r1 == r0) goto L_0x0010
            r0 = 12
            if (r1 == r0) goto L_0x0010
            boolean r0 = A0o(r5)
            if (r0 != 0) goto L_0x0010
            boolean r0 = X.C41061vA.A0I(r5)
            if (r0 != 0) goto L_0x0010
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38621r6.A0t(X.0tZ):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0u(X.C16740tZ r5) {
        /*
            int r4 = r5.A05
            r3 = 127(0x7f, float:1.78E-43)
            r0 = 0
            if (r4 < r3) goto L_0x0008
            r0 = 1
        L_0x0008:
            r2 = 0
            if (r0 != 0) goto L_0x0019
            X.1Vw r0 = r5.A11
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L_0x001a
            int r0 = java.lang.Math.max(r1, r4)
            if (r0 != r3) goto L_0x0019
        L_0x0018:
            r2 = 1
        L_0x0019:
            return r2
        L_0x001a:
            int r0 = r4 + 1
            int r1 = java.lang.Math.max(r1, r0)
            r0 = 5
            if (r1 < r0) goto L_0x0019
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38621r6.A0u(X.0tZ):boolean");
    }

    public static boolean A0v(C16740tZ r3, long j2) {
        if (r3.A04 <= 0) {
            return false;
        }
        Long l2 = r3.A0Z;
        AnonymousClass00B.A06(l2);
        return l2.longValue() < j2 && r3.A06() != 1;
    }

    public static boolean A0w(C16740tZ r3, boolean z2) {
        C15830rv r1;
        int i2;
        if (A0d(r3) && !z2) {
            return false;
        }
        byte b2 = r3.A10;
        if (b2 == 24) {
            if (r3.A11.A02 && !z2) {
                return false;
            }
        } else if (b2 == 8) {
            return false;
        }
        if (A0f(r3) || A0k(r3) || A0h(r3) || A0i(r3)) {
            return false;
        }
        C28381Vw r2 = r3.A11;
        if ((r2.A02 && A0p(r3) && ((i2 = ((AnonymousClass1WU) r3).A00) == 50 || i2 == 49 || i2 == 47 || i2 == 48 || i2 == 46 || i2 == 55)) || A0q(r3)) {
            return false;
        }
        if ((A0g(r3) && (!z2 || (r1 = r2.A00) == null || !r1.equals(((AnonymousClass1WT) r3).A01))) || (r3 instanceof C39391sP) || A0e(r3)) {
            return false;
        }
        if (!(r3 instanceof AnonymousClass1WU)) {
            return true;
        }
        long j2 = (long) ((AnonymousClass1WU) r3).A00;
        return (j2 == 62 || j2 == 63) ? false : true;
    }

    public static boolean A0x(C16730tY r6) {
        int[] A06;
        C42591y4 A12 = r6.A12();
        if (A12 == null) {
            return false;
        }
        C16750ta r0 = A12.A04.A02;
        AnonymousClass00B.A06(r0);
        if (!r0.A0M || (A06 = A12.A06()) == null || A06.length < 4) {
            return false;
        }
        long j2 = (long) (A06[0] + A06[1] + A06[2]);
        C16750ta r02 = r6.A02;
        AnonymousClass00B.A06(r02);
        return r02.A09 >= j2;
    }

    public static boolean A0y(C16730tY r3) {
        byte b2 = r3.A10;
        if (b2 == 2) {
            if (r3.A08 == 1) {
                return true;
            }
        } else if (b2 == 20) {
            return true;
        }
        return C30921dB.A00(b2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r6.A11.A02 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0z(X.C16730tY r6) {
        /*
            boolean r0 = X.C811346z.A00(r6)
            r5 = 1
            if (r0 != 0) goto L_0x002a
            X.0ta r2 = r6.A02
            X.AnonymousClass00B.A06(r2)
            boolean r0 = r2.A0W
            if (r0 == 0) goto L_0x0017
            X.1Vw r0 = r6.A11
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = r2.A0P
            if (r0 == 0) goto L_0x0026
            if (r1 != 0) goto L_0x0026
            long r3 = r6.A14
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x002b
        L_0x0026:
            java.lang.String r0 = r6.A08
            if (r0 == 0) goto L_0x002b
        L_0x002a:
            return r5
        L_0x002b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38621r6.A0z(X.0tY):boolean");
    }

    public static boolean A10(C16730tY r1) {
        C16750ta r12 = r1.A02;
        AnonymousClass00B.A06(r12);
        return r12.A0Z && !r12.A0X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r4.A11.A02 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A11(X.C16730tY r4) {
        /*
            boolean r0 = X.C811346z.A00(r4)
            r3 = 0
            if (r0 != 0) goto L_0x0031
            X.0ta r2 = r4.A02
            X.AnonymousClass00B.A06(r2)
            boolean r0 = r2.A0W
            if (r0 == 0) goto L_0x0017
            X.1Vw r0 = r4.A11
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = r2.A0P
            if (r0 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x0030
        L_0x001e:
            boolean r0 = r4.A0t
            if (r0 == 0) goto L_0x0031
            X.1Vw r1 = r4.A11
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0031
            X.0rv r0 = r1.A00
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            r3 = 1
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38621r6.A11(X.0tY):boolean");
    }

    public static boolean A12(C38711rI r5) {
        C16750ta r1 = r5.A02;
        return AnonymousClass20C.A00(r5.A10) && r1 != null && !r5.A11.A02 && !r1.A0P && r1.A0C > 0;
    }
}
