package X;

import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.youbasha.ui.lockV2.LockUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2fQ  reason: invalid class name and case insensitive filesystem */
public class C53262fQ {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r4.A0J("parent");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C28371Vv r4) {
        /*
            int r0 = A02(r4)
            r3 = 1
            if (r0 != r3) goto L_0x001f
            java.lang.String r0 = "parent"
            X.1Vv r2 = r4.A0J(r0)
            if (r2 == 0) goto L_0x001f
            java.lang.String r1 = "default_membership_approval_mode"
            r0 = 0
            java.lang.String r1 = r2.A0N(r1, r0)
            java.lang.String r0 = "request_required"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001f
            return r3
        L_0x001f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53262fQ.A00(X.1Vv):int");
    }

    public static int A01(C28371Vv r4) {
        try {
            C28371Vv A0J = r4.A0J("ephemeral");
            if (A0J != null) {
                return A0J.A0A("expiration", 0);
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("GroupProtocolTreeNodeHelper/getEphemeralDuration ");
            sb.append(e2.getMessage());
            Log.e(sb.toString(), e2);
        }
        return 0;
    }

    public static int A02(C28371Vv r5) {
        boolean z2 = false;
        if (r5.A0J("default_sub_group") != null) {
            z2 = true;
        }
        boolean z3 = false;
        if (r5.A0J("linked_parent") != null) {
            z3 = true;
        }
        if (r5.A0J("parent") != null) {
            return 1;
        }
        if (z2) {
            return 3;
        }
        return z3 ? 2 : 0;
    }

    public static C16050sL A03(C16300so r3, C28371Vv r4) {
        C28371Vv A0J = r4.A0J("linked_parent");
        if (A0J == null) {
            return null;
        }
        return (C16050sL) A0J.A0F(r3, C16050sL.class, "jid");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
        if (r3 == null) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C30371cF A04(X.C16300so r8, X.C28371Vv r9, X.C28371Vv r10) {
        /*
            java.lang.String r0 = "description"
            X.1Vv r4 = r9.A0J(r0)
            if (r4 == 0) goto L_0x003e
            java.lang.String r0 = "body"
            X.1Vv r3 = r4.A0J(r0)
            java.lang.String r0 = "delete"
            X.1Vv r2 = r4.A0J(r0)
            if (r3 == 0) goto L_0x004c
            if (r2 == 0) goto L_0x004c
            java.lang.String r0 = "Node: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = " contains both a body and delete child: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x003c:
            if (r3 != 0) goto L_0x0041
        L_0x003e:
            X.1cF r0 = X.C30371cF.A04
            return r0
        L_0x0041:
            java.lang.String r0 = r3.A0L()
            if (r0 == 0) goto L_0x0087
            java.lang.String r5 = r3.A0L()
            goto L_0x0059
        L_0x004c:
            X.1lL[] r0 = r4.A0Q()
            if (r0 == 0) goto L_0x003c
            int r0 = r0.length
            if (r0 == 0) goto L_0x003c
            if (r3 != 0) goto L_0x0041
            java.lang.String r5 = ""
        L_0x0059:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x007f
            r4 = 0
        L_0x0060:
            X.AnonymousClass00B.A06(r10)
            r0 = 0
            java.lang.String r2 = "t"
            long r6 = r10.A0D(r2, r0)
            X.AnonymousClass00B.A06(r10)
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r3 = r10.A0F(r8, r1, r0)
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.1cF r2 = new X.1cF
            r2.<init>(r3, r4, r5, r6)
            return r2
        L_0x007f:
            java.lang.String r1 = "id"
            r0 = 0
            java.lang.String r4 = r4.A0N(r1, r0)
            goto L_0x0060
        L_0x0087:
            java.lang.String r1 = "Non-empy description tag with no body"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53262fQ.A04(X.0so, X.1Vv, X.1Vv):X.1cF");
    }

    public static C34141jl A05(C28371Vv r6) {
        if (A02(r6) == 1) {
            return null;
        }
        C28371Vv A0J = r6.A0J("growth_locked");
        if (A0J == null) {
            return new C34141jl(0, 0);
        }
        String A0N = A0J.A0N("type", "");
        if ("invite".equals(A0N)) {
            return new C34141jl(1, A0J.A0E(A0J.A0M("expiration"), "expiration"));
        }
        StringBuilder sb = new StringBuilder("GroupProtocolTreeNodeHelper/getGrowthLock unexpected type: ");
        sb.append(A0N);
        Log.i(sb.toString());
        return null;
    }

    public static Map A06(C16300so r10, C28371Vv r11) {
        String str = null;
        AnonymousClass1ZX r4 = null;
        HashMap hashMap = new HashMap();
        for (C28371Vv r8 : r11.A0O("participant")) {
            Class<UserJid> cls = UserJid.class;
            UserJid userJid = (UserJid) r8.A0F(r10, cls, "jid");
            if (userJid != null) {
                String A0N = r8.A0N("type", "");
                AnonymousClass00B.A06(A0N);
                UserJid userJid2 = (UserJid) r8.A0F(r10, cls, "lid");
                if (userJid2 != null) {
                    r4 = userJid2;
                }
                String A0N2 = r8.A0N("display_name", (String) null);
                if (!AnonymousClass1ZW.A0E(A0N2)) {
                    str = A0N2;
                }
                AnonymousClass00B.A06(userJid);
                AnonymousClass00B.A06(A0N);
                hashMap.put(userJid, new AnonymousClass2Bb((r4 == null || !(r4 instanceof AnonymousClass1ZX)) ? null : r4, userJid, A0N, str));
            }
        }
        return hashMap;
    }

    public static void A07(C16300so r33, C17240ul r34, C28371Vv r35, int i2) {
        C28371Vv r3 = r35;
        C28371Vv A0H = r3.A0H();
        C16300so r4 = r33;
        Jid A0F = r3.A0F(r4, Jid.class, "from");
        AnonymousClass00B.A06(A0F);
        C16050sL A03 = C16050sL.A03(A0F);
        C17240ul r7 = r34;
        if (r7.A0o(A03)) {
            UserJid userJid = (UserJid) A0H.A0F(r4, UserJid.class, "creator");
            long A01 = C29501aj.A01(A0H.A0N("creation", (String) null), 0) * 1000;
            String A0N = A0H.A0N("subject", (String) null);
            long A012 = 1000 * C29501aj.A01(A0H.A0N("s_t", (String) null), 0);
            String A0N2 = A0H.A0N("type", (String) null);
            long A0D = A0H.A0D("p_v_id", 0);
            long A0D2 = A0H.A0D("a_v_id", 0);
            boolean z2 = false;
            if (A0H.A0J(LockUtils.PATTERN_LOCK) != null) {
                z2 = true;
            }
            boolean z3 = false;
            if (A0H.A0J("announcement") != null) {
                z3 = true;
            }
            boolean z4 = false;
            if (A0H.A0J("incognito") != null) {
                z4 = true;
            }
            boolean z5 = false;
            if (A0H.A0J("no_frequently_forwarded") != null) {
                z5 = true;
            }
            boolean z6 = false;
            if (A0H.A0J("suspended") != null) {
                z6 = true;
            }
            boolean z7 = false;
            if (A0H.A0J("support") != null) {
                z7 = true;
            }
            Map A06 = A06(r4, A0H);
            int A013 = A01(A0H);
            C34141jl A05 = A05(A0H);
            int A00 = C29501aj.A00(A0H.A0N("size", (String) null), A06.size());
            C30371cF A04 = A04(r4, A0H, A0H.A0J(FacebookFacade.RequestParameter.DESCRIPTION));
            int A02 = A02(A0H);
            C16050sL A032 = A03(r4, A0H);
            boolean A08 = A08(A0H);
            r7.A0P(A03, A032, userJid, A04, A05, Integer.valueOf(A00), A0N, A0N2, A06, A013, i2, A02, A00(A0H), A01, A012, A0D, A0D2, z7, z2, z3, z5, z6, z4, A08);
            r7.A0z.A00.A01(A03);
        }
    }

    public static boolean A08(C28371Vv r2) {
        C28371Vv A0J;
        C28371Vv A0J2 = r2.A0J("membership_approval_mode");
        if (A0J2 == null || (A0J = A0J2.A0J("group_join")) == null) {
            return false;
        }
        return A0J.A0N("state", "").equals("on");
    }
}
