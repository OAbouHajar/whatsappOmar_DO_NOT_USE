package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.redex.IDxRCallbackShape49S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.facebook.redex.RunnableRunnableShape0S0700000_I0;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.facebook.redex.RunnableRunnableShape7S0200000_I0_5;
import com.obwhatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob;
import com.obwhatsapp.push.RegistrationIntentService;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0ul  reason: invalid class name and case insensitive filesystem */
public class C17240ul {
    public static Handler A15;
    public long A00 = 0;
    public AnonymousClass2BH A01;
    public Integer A02;
    public Integer A03;
    public Runnable A04;
    public AtomicBoolean A05 = new AtomicBoolean();
    public final C16300so A06;
    public final C14870pt A07;
    public final C16040sK A08;
    public final C18020w1 A09;
    public final C216815a A0A;
    public final C17230uk A0B;
    public final AnonymousClass17D A0C;
    public final C18260wP A0D;
    public final C16000sG A0E;
    public final AnonymousClass18Q A0F;
    public final C16080sP A0G;
    public final AnonymousClass120 A0H;
    public final C19230xz A0I;
    public final AnonymousClass16U A0J;
    public final C15800rs A0K;
    public final C16440t3 A0L;
    public final C16980tz A0M;
    public final C15860rz A0N;
    public final C208211s A0O;
    public final AnonymousClass16P A0P;
    public final AnonymousClass126 A0Q;
    public final C15810rt A0R;
    public final AnonymousClass11A A0S;
    public final C16460t6 A0T;
    public final AnonymousClass11H A0U;
    public final AnonymousClass18P A0V;
    public final AnonymousClass18U A0W;
    public final AnonymousClass18V A0X;
    public final AnonymousClass18S A0Y;
    public final AnonymousClass11J A0Z;
    public final C16070sO A0a;
    public final C18550ws A0b;
    public final C19780yz A0c;
    public final C16900tq A0d;
    public final C19810z2 A0e;
    public final C14710pd A0f;
    public final AnonymousClass18M A0g;
    public final AnonymousClass2BU A0h;
    public final AnonymousClass18N A0i;
    public final AnonymousClass18O A0j;
    public final AnonymousClass18R A0k;
    public final C17780vd A0l;
    public final C217415g A0m;
    public final C217915l A0n;
    public final C220716n A0o;
    public final C19430yQ A0p;
    public final C17190ug A0q;
    public final C222517f A0r;
    public final AnonymousClass124 A0s;
    public final C18090w8 A0t;
    public final C17600vL A0u;
    public final AnonymousClass12B A0v;
    public final AnonymousClass121 A0w;
    public final C222617g A0x;
    public final AnonymousClass122 A0y;
    public final C17770vc A0z;
    public final C16320sq A10;
    public final Map A11 = new ConcurrentHashMap();
    public final Set A12 = Collections.newSetFromMap(new ConcurrentHashMap());
    public volatile boolean A13;
    public volatile boolean A14;

    public C17240ul(C16300so r26, C14870pt r27, C16040sK r28, C18020w1 r29, C15900s5 r30, C216815a r31, C17230uk r32, AnonymousClass17D r33, C18260wP r34, C16000sG r35, AnonymousClass18Q r36, C16080sP r37, AnonymousClass120 r38, C19230xz r39, AnonymousClass16U r40, C15800rs r41, C16440t3 r42, C16980tz r43, C15860rz r44, AnonymousClass013 r45, C208211s r46, AnonymousClass16P r47, AnonymousClass126 r48, C15810rt r49, AnonymousClass11A r50, C16460t6 r51, AnonymousClass11H r52, AnonymousClass18P r53, AnonymousClass18U r54, AnonymousClass18V r55, AnonymousClass18S r56, AnonymousClass11J r57, C16070sO r58, C18550ws r59, C19780yz r60, C16900tq r61, C19810z2 r62, C14710pd r63, AnonymousClass18M r64, AnonymousClass18N r65, AnonymousClass18O r66, AnonymousClass18R r67, C17780vd r68, C217415g r69, AnonymousClass18T r70, C217915l r71, C220716n r72, C19430yQ r73, C17190ug r74, C222517f r75, AnonymousClass124 r76, C18090w8 r77, C17600vL r78, AnonymousClass12B r79, AnonymousClass121 r80, C222617g r81, AnonymousClass122 r82, C17770vc r83, C16320sq r84) {
        AnonymousClass2BU r0 = new AnonymousClass2BU();
        this.A0h = r0;
        this.A0L = r42;
        this.A0f = r63;
        C14870pt r15 = r27;
        this.A07 = r15;
        C16300so r6 = r26;
        this.A06 = r6;
        this.A08 = r28;
        C16980tz r7 = r43;
        this.A0M = r7;
        this.A10 = r84;
        this.A0R = r49;
        this.A0s = r76;
        this.A0r = r75;
        this.A0b = r59;
        C17190ug r3 = r74;
        this.A0q = r3;
        C16000sG r9 = r35;
        this.A0E = r9;
        this.A0U = r52;
        this.A09 = r29;
        C16080sP r8 = r37;
        this.A0G = r8;
        this.A0x = r81;
        this.A0c = r60;
        C16460t6 r5 = r51;
        this.A0T = r5;
        this.A0z = r83;
        this.A0J = r40;
        this.A0o = r72;
        this.A0O = r46;
        this.A0n = r71;
        this.A0e = r62;
        this.A0Q = r48;
        this.A0H = r38;
        this.A0I = r39;
        this.A0g = r64;
        this.A0l = r68;
        C16900tq r4 = r61;
        this.A0d = r4;
        this.A0i = r65;
        this.A0v = r79;
        this.A0w = r80;
        C15860rz r10 = r44;
        this.A0N = r10;
        C17230uk r11 = r32;
        this.A0B = r11;
        this.A0C = r33;
        this.A0K = r41;
        this.A0m = r69;
        this.A0y = r82;
        this.A0S = r50;
        this.A0Z = r57;
        this.A0t = r77;
        this.A0p = r73;
        AnonymousClass18O r12 = r66;
        this.A0j = r12;
        C16070sO r13 = r58;
        this.A0a = r13;
        this.A0D = r34;
        this.A0V = r53;
        this.A0F = r36;
        this.A0k = r67;
        this.A0u = r78;
        this.A0Y = r56;
        this.A0A = r31;
        this.A0W = r54;
        this.A0X = r55;
        this.A0P = r47;
        C16460t6 r21 = r5;
        C16980tz r19 = r7;
        C16080sP r18 = r8;
        C16000sG r17 = r9;
        A15 = new AnonymousClass2BV(r15, r30, r17, r18, r19, r45, r21, r13, r0, r12);
        this.A04 = new RunnableRunnableShape0S0700000_I0(this, r11, r4, r70, r3, r10, r6, 2);
    }

    public static UserJid A00(C16740tZ r3) {
        C28381Vw r2 = r3.A11;
        C15830rv r1 = r2.A00;
        if (C16030sJ.A0L(r1)) {
            if (r2.A02 && (r3 instanceof AnonymousClass1WU)) {
                AnonymousClass1WU r22 = (AnonymousClass1WU) r3;
                int i2 = r22.A00;
                if (i2 == 10) {
                    return ((AnonymousClass1WT) r22).A00;
                }
                if (i2 == 20 || i2 == 52 || i2 == 79) {
                    return (UserJid) ((C39291sE) r22).A01.get(0);
                }
            }
            r1 = r3.A0B();
        }
        return UserJid.of(r1);
    }

    public static void A01(int i2, Object obj) {
        A15.obtainMessage(i2, obj).sendToTarget();
    }

    public final int A02(C30361cE r30, String str, Map map, int i2, long j2, boolean z2, boolean z3, boolean z4, boolean z5) {
        C30361cE r13;
        int i3;
        int i4;
        AnonymousClass1ZX r4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map map2 = map;
        ArrayList arrayList3 = new ArrayList(map2.size());
        Iterator it = map2.keySet().iterator();
        while (true) {
            int i5 = 1;
            r13 = r30;
            if (!it.hasNext()) {
                break;
            }
            UserJid userJid = (UserJid) it.next();
            AnonymousClass2Bb r42 = (AnonymousClass2Bb) map2.get(userJid);
            AnonymousClass00B.A06(r42);
            String str2 = r42.A03;
            if (!"admin".equals(str2)) {
                i5 = 0;
                if ("superadmin".equals(str2)) {
                    i5 = 2;
                }
            }
            C30661ck A052 = r13.A05(userJid);
            if (A052 == null) {
                StringBuilder sb = new StringBuilder("groupmgr/sync-add-participant: ");
                sb.append(userJid);
                Log.i(sb.toString());
                arrayList.add(userJid);
            } else if (A052.A01 != i5) {
                StringBuilder sb2 = new StringBuilder("groupmgr/sync-change-admin-participant: ");
                sb2.append(userJid);
                sb2.append(" was ");
                sb2.append(A052.A01);
                Log.i(sb2.toString());
                arrayList2.add(A052);
            }
            C19810z2 r3 = this.A0e;
            arrayList3.add(new C30661ck(userJid, C30361cE.A01(r3.A0D(userJid)), i5, false));
            if (C16030sJ.A0M(userJid)) {
                C16040sK r11 = this.A08;
                if (r11.A0I(userJid)) {
                    r11.A0B();
                    AnonymousClass1ZT r10 = r11.A05;
                    AnonymousClass00B.A06(r10);
                    r11.A0B();
                    AnonymousClass1ZT r0 = r11.A05;
                    AnonymousClass00B.A06(r0);
                    arrayList3.add(new C30661ck(r10, C30361cE.A01(r3.A0D(r0)), i5, false));
                }
            }
            if (r42.A00() && (r4 = r42.A00) != null) {
                arrayList3.add(new C30661ck(r4, C30361cE.A01(r3.A0D(r4)), i5, false));
            }
        }
        r13.A0J(arrayList3);
        Collection<AnonymousClass2Bb> values = map2.values();
        HashSet hashSet = new HashSet();
        if (values != null) {
            for (AnonymousClass2Bb r43 : values) {
                if (r43.A00()) {
                    hashSet.add(r43.A00);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        C28031Ub it2 = r13.A03().iterator();
        while (it2.hasNext()) {
            C15830rv r5 = (C15830rv) it2.next();
            if (!map2.containsKey(r5) && !hashSet.contains(r5)) {
                C16040sK r44 = this.A08;
                if (!r44.A0I(r5) || !map2.containsKey(r44.A03())) {
                    StringBuilder sb3 = new StringBuilder("groupmgr/sync-remove-participant:");
                    sb3.append(r5);
                    Log.i(sb3.toString());
                    arrayList4.add(r5);
                }
            }
        }
        C16040sK r32 = this.A08;
        r32.A0B();
        AnonymousClass1ZT r7 = r32.A05;
        AnonymousClass1ZX A032 = r32.A03();
        if (arrayList.contains(A032) && arrayList4.contains(r7)) {
            arrayList.remove(A032);
            arrayList4.remove(r7);
        } else if (arrayList.contains(r7) && arrayList4.contains(A032)) {
            arrayList.remove(r7);
            arrayList4.remove(A032);
        }
        C16060sN r14 = r13.A06;
        GroupJid of = GroupJid.of(r14);
        List A092 = A09(of, arrayList);
        List A093 = A09(of, arrayList4);
        r13.A0K(arrayList4);
        long j3 = j2;
        if (z2) {
            ArrayList A0C2 = r13.A0C();
            if (!A092.isEmpty()) {
                i4 = 2;
                this.A0g.A00(this.A0y.A05(r13, r14, (!z4 || A0C2.size() != 1) ? null : ((C30661ck) A0C2.get(0)).A03, (C30641ci) null, A092, 12, this.A0L.A00(), 0), 2);
            } else {
                i4 = 2;
            }
            if (!A093.isEmpty()) {
                this.A0g.A00(this.A0y.A05((C30361cE) null, r14, (UserJid) null, (C30641ci) null, A093, 13, this.A0L.A00(), 0), i4);
            }
            A0L(r14, Long.valueOf(j3), arrayList2);
        } else if (z3) {
            String str3 = str;
            if (str != null && !r13.A0B().equals(str3)) {
                AnonymousClass18M r6 = this.A0g;
                AnonymousClass122 r72 = this.A0y;
                r6.A00(AnonymousClass122.A00(r72.A00, r72.A03.A02(r14, true), (C30641ci) null, 86, this.A0L.A00()), 2);
            }
        }
        this.A0a.A05(r13, j3);
        if (!A092.isEmpty() && r13.A0M(r32)) {
            r32.A0B();
            boolean contains = A092.contains(r32.A05);
            int i6 = i2;
            boolean z6 = z5;
            if (contains) {
                A0G(r13, r13.A03(), i6, z6);
            } else {
                A0G(r13, A092, i6, z6);
            }
        }
        this.A10.Acl(new RunnableRunnableShape7S0200000_I0_5(this, 41, arrayList));
        if (!A092.isEmpty() || !A093.isEmpty()) {
            r13.A0G();
            i3 = 1;
        } else {
            i3 = 0;
        }
        return !arrayList2.isEmpty() ? i3 | 2 : i3;
    }

    public int A03(C16010sH r4) {
        int A022 = this.A0R.A02((GroupJid) r4.A08(C16050sL.class));
        if (!r4.A0J()) {
            return 0;
        }
        if (A022 == 3 || A022 == 1) {
            return r4.A02;
        }
        return 0;
    }

    public int A04(GroupJid groupJid, GroupJid groupJid2) {
        C14710pd r4 = this.A0f;
        C16620tM r3 = C16620tM.A02;
        int i2 = 4;
        if (r4.A0E(r3, 1887)) {
            C16010sH A092 = this.A0E.A09(groupJid);
            if (A092 == null || !A092.A0k) {
                return 1;
            }
        } else {
            if (r4.A0E(r3, 1728)) {
                C16010sH A093 = this.A0E.A09(groupJid);
                if (A093 != null && A093.A0k) {
                    return 4;
                }
            } else if (!r4.A0E(r3, 2447)) {
                return 1;
            }
            C15840rx A062 = this.A0R.A06(groupJid2);
            i2 = 1;
            if (A062 == null) {
                StringBuilder sb = new StringBuilder("GroupChatManager/getGroupJoinMode/Unknown chatInfo ");
                sb.append(groupJid2);
                Log.i(sb.toString());
                return 1;
            } else if (A062.A0g) {
                return 2;
            }
        }
        return i2;
    }

    public int A05(C16050sL r4) {
        if (this.A0E.A09(r4) == null) {
            return 0;
        }
        return this.A0a.A0A.A03(C16620tM.A02, 1304) - 1;
    }

    public final C30661ck A06(C30361cE r8, UserJid userJid, int i2) {
        UserJid userJid2 = userJid;
        if (userJid == null) {
            return null;
        }
        C30361cE r1 = r8;
        C30661ck A052 = r8.A05(userJid);
        int i3 = i2;
        if (A052 == null) {
            return r1.A07(userJid2, this.A0e.A0D(userJid), i3, false, true);
        }
        A052.A01 = i2;
        return A052;
    }

    public AnonymousClass1WP A07() {
        return AnonymousClass1WP.A03(this.A08, UUID.randomUUID().toString().replace("-", ""));
    }

    public AnonymousClass1WU A08(C34841kx r10, List list) {
        A0K(r10, list, false);
        AnonymousClass122 r3 = this.A0y;
        long A002 = this.A0L.A00();
        C16040sK r0 = this.A08;
        r0.A0B();
        AnonymousClass1ZT r2 = r0.A05;
        AnonymousClass00B.A06(r2);
        AnonymousClass1WU A003 = AnonymousClass122.A00(r3.A00, r3.A03.A02(r10, true), (C30641ci) null, 9, A002);
        A003.A0k((String) null);
        A003.A0t(list);
        A003.A0b(r2);
        return A003;
    }

    public final List A09(GroupJid groupJid, List list) {
        if (groupJid == null || !A0k(groupJid)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Jid jid = (Jid) it.next();
            if (!C16030sJ.A0M(jid)) {
                arrayList.add(jid);
            }
        }
        return arrayList;
    }

    public final List A0A(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GroupJid groupJid = (GroupJid) it.next();
            String A092 = this.A0R.A09(groupJid);
            if (A092 == null) {
                A092 = "";
            }
            arrayList.add(new C39461sW(groupJid, A092, 2, 0));
        }
        return arrayList;
    }

    public List A0B(Map map) {
        ArrayList arrayList = new ArrayList(map.keySet().size());
        for (C15830rv A082 : map.keySet()) {
            C16010sH A083 = this.A0E.A08(A082);
            if (!(A083 == null || A083.A0D == null)) {
                arrayList.add(A083);
            }
        }
        Collections.sort(arrayList, new AnonymousClass2BY(this.A08, this.A0G, this));
        return arrayList;
    }

    public synchronized void A0C(int i2) {
        Log.i("groupmgr/groupSyncFailedOrTimedOut");
        this.A13 = false;
        this.A14 = false;
        this.A02 = null;
        A0D(i2);
    }

    public final synchronized void A0D(int i2) {
        Integer valueOf;
        Integer num = this.A03;
        if (num != null) {
            valueOf = Integer.valueOf(i2 | num.intValue());
            this.A03 = valueOf;
        } else {
            valueOf = Integer.valueOf(i2);
            this.A03 = valueOf;
        }
        Integer num2 = this.A02;
        this.A0N.A0i(num2 != null ? num2.intValue() | valueOf.intValue() : valueOf.intValue());
    }

    public synchronized void A0E(int i2, boolean z2, boolean z3) {
        A0Y((C19550yc) null, i2, z2, z3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
        if (r9 != null) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(X.C30361cE r28, com.whatsapp.jid.GroupJid r29, com.whatsapp.jid.GroupJid r30, X.C16050sL r31, com.whatsapp.jid.UserJid r32, X.C30641ci r33, java.lang.String r34, java.util.List r35, long r36, long r38) {
        /*
            r27 = this;
            r9 = r30
            java.lang.String r0 = "auto_add"
            r4 = r34
            boolean r3 = r0.equals(r4)
            r2 = r27
            r11 = r28
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r35
            r0 = r36
            r19 = r38
            if (r3 != 0) goto L_0x00d3
            java.lang.String r3 = "default_sub_group_admin_add"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00d3
            X.0pd r6 = r2.A0f
            r5 = 2857(0xb29, float:4.004E-42)
            X.0tM r3 = X.C16620tM.A02
            boolean r3 = r6.A0E(r3, r5)
            if (r3 == 0) goto L_0x009d
            java.lang.String r3 = "invite_auto_add"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x009d
            if (r30 != 0) goto L_0x0040
            X.0uk r3 = r2.A0B
            X.0sL r9 = r3.A02(r12)
        L_0x0040:
            X.122 r6 = r2.A0y
            X.0rt r3 = r2.A0R
            r10 = r29
            java.lang.String r8 = r3.A09(r10)
            java.lang.String r7 = r3.A09(r9)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r29 == 0) goto L_0x005e
            r4 = 2
            X.1sY r3 = new X.1sY
            r3.<init>(r10, r8, r4)
            r5.add(r3)
        L_0x005e:
            if (r9 == 0) goto L_0x0069
            r4 = 1
            X.1sY r3 = new X.1sY
            r3.<init>(r9, r7, r4)
            r5.add(r3)
        L_0x0069:
            r8 = 101(0x65, float:1.42E-43)
            if (r33 != 0) goto L_0x0097
            X.18b r4 = r6.A03
            r3 = 1
            X.1Vw r22 = r4.A02(r12, r3)
            X.0so r3 = r6.A00
            r23 = 0
            r21 = r3
            r25 = r0
            r24 = r8
            X.1WU r3 = X.AnonymousClass122.A00(r21, r22, r23, r24, r25)
            X.1sX r3 = (X.C39471sX) r3
        L_0x0084:
            r3.A17(r5)
            r4 = r6
            r5 = r13
            r6 = r3
            r7 = r15
            r9 = r19
            r4.A0A(r5, r6, r7, r8, r9)
        L_0x0090:
            X.18M r1 = r2.A0g
            r0 = 2
            r1.A00(r3, r0)
            return
        L_0x0097:
            X.1tn r3 = new X.1tn
            r3.<init>(r11, r14, r0)
            goto L_0x0084
        L_0x009d:
            java.lang.String r3 = "accept"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b0
            r16 = 52
        L_0x00a7:
            X.122 r10 = r2.A0y
            r17 = r0
            X.1sE r3 = r10.A05(r11, r12, r13, r14, r15, r16, r17, r19)
            goto L_0x0090
        L_0x00b0:
            java.lang.String r3 = "default_sub_group_promote"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00bb
            r16 = 93
            goto L_0x00a7
        L_0x00bb:
            java.lang.String r3 = "invite"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00c6
            r16 = 20
            goto L_0x00a7
        L_0x00c6:
            java.lang.String r3 = "linked_group_join"
            boolean r3 = r3.equals(r4)
            r16 = 12
            if (r3 == 0) goto L_0x00a7
            r16 = 79
            goto L_0x00a7
        L_0x00d3:
            if (r30 != 0) goto L_0x00de
            X.0uk r3 = r2.A0B
            X.0sL r9 = r3.A02(r12)
            r7 = 0
            if (r9 == 0) goto L_0x00ea
        L_0x00de:
            X.0rt r3 = r2.A0R
            java.lang.String r4 = r3.A09(r9)
            r3 = 1
            X.1sY r7 = new X.1sY
            r7.<init>(r9, r4, r3)
        L_0x00ea:
            X.0pd r5 = r2.A0f
            r4 = 2857(0xb29, float:4.004E-42)
            X.0tM r3 = X.C16620tM.A02
            boolean r3 = r5.A0E(r3, r4)
            X.122 r6 = r2.A0y
            if (r3 == 0) goto L_0x012f
            if (r33 != 0) goto L_0x0129
            X.18b r4 = r6.A03
            r3 = 1
            X.1Vw r4 = r4.A02(r12, r3)
            X.1tl r3 = new X.1tl
            r3.<init>((X.C28381Vw) r4, (long) r0)
        L_0x0106:
            if (r7 == 0) goto L_0x011c
            com.whatsapp.jid.GroupJid r5 = r7.A01
            java.lang.String r4 = r7.A02
            r1 = 1
            X.1sY r0 = new X.1sY
            r0.<init>(r5, r4, r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.C18450wi.A0B(r0)
            r3.A17(r0)
        L_0x011c:
            r8 = 106(0x6a, float:1.49E-43)
            r4 = r6
            r5 = r13
            r6 = r3
            r7 = r15
            r9 = r19
            r4.A0A(r5, r6, r7, r8, r9)
            goto L_0x0090
        L_0x0129:
            X.1tl r3 = new X.1tl
            r3.<init>((X.C30641ci) r14, (long) r0)
            goto L_0x0106
        L_0x012f:
            if (r7 != 0) goto L_0x015d
            r5 = 0
        L_0x0132:
            if (r33 != 0) goto L_0x0157
            X.18b r4 = r6.A03
            r3 = 1
            X.1Vw r8 = r4.A02(r12, r3)
            X.0so r3 = r6.A00
            r10 = 90
            r9 = 0
            r7 = r3
            r11 = r0
            X.1WU r3 = X.AnonymousClass122.A00(r7, r8, r9, r10, r11)
            X.1sU r3 = (X.C39441sU) r3
        L_0x0148:
            r3.A00 = r5
            r8 = 90
            r4 = r6
            r5 = r13
            r6 = r3
            r7 = r15
            r9 = r19
            r4.A0A(r5, r6, r7, r8, r9)
            goto L_0x0090
        L_0x0157:
            X.1sU r3 = new X.1sU
            r3.<init>((X.C30361cE) r11, (X.C30641ci) r14, (long) r0)
            goto L_0x0148
        L_0x015d:
            java.lang.String r5 = r7.A02
            goto L_0x0132
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17240ul.A0F(X.1cE, com.whatsapp.jid.GroupJid, com.whatsapp.jid.GroupJid, X.0sL, com.whatsapp.jid.UserJid, X.1ci, java.lang.String, java.util.List, long, long):void");
    }

    public final void A0G(C30361cE r8, Collection collection, int i2, boolean z2) {
        GroupJid of = GroupJid.of(r8.A06);
        if (z2) {
            int size = r8.A04().size();
            C14710pd r2 = this.A0f;
            C16620tM r1 = C16620tM.A02;
            if (size >= r2.A03(r1, 934) && size <= r2.A03(r1, 1946) && of != null) {
                AnonymousClass16U r4 = this.A0J;
                C222617g r3 = this.A0x;
                C39121rx r32 = new C39121rx(r3.A05.A02(of, true), this.A0L.A00());
                UserJid[] userJidArr = (UserJid[]) collection.toArray(new UserJid[0]);
                if (userJidArr.length == 0) {
                    StringBuilder sb = new StringBuilder("SyncDevicesAndSendInvisibleMessageJob/empty recipients for ");
                    sb.append(r32.A11);
                    Log.w(sb.toString());
                    return;
                } else if (r4.A02.A01(r32.A11)) {
                    r4.A00.A00(new SyncDevicesAndSendInvisibleMessageJob(r32, userJidArr));
                    return;
                } else {
                    return;
                }
            }
        }
        this.A0J.A01((UserJid[]) collection.toArray(new UserJid[0]), i2);
    }

    public final void A0H(C39461sW r12, C39461sW r13, UserJid userJid, int i2, long j2) {
        C39461sW r3 = r12;
        if (r12.A00 == 1) {
            C16300so r5 = this.A06;
            C16320sq r1 = this.A10;
            C17190ug r0 = this.A0q;
            new C45792Bc(r5, this.A0B, this, (C16050sL) r12.A02, r0, r1).A00();
        }
        A0I(r3, r13, userJid, (C30641ci) null, (Integer) null, i2, j2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.1sT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.1tu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.1tu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.1tu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: X.1sT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: X.1sT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: X.1sT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.1sT} */
    /* JADX WARNING: type inference failed for: r14v7, types: [X.1sE, X.1u8, X.1u5] */
    /* JADX WARNING: type inference failed for: r14v8, types: [X.1sE, X.1u5, X.1u4] */
    /* JADX WARNING: type inference failed for: r14v9, types: [X.1sE, X.1u6, X.1u5] */
    /* JADX WARNING: type inference failed for: r14v10, types: [X.1u7, X.1sE, X.1u5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(X.C39461sW r26, X.C39461sW r27, com.whatsapp.jid.UserJid r28, X.C30641ci r29, java.lang.Integer r30, int r31, long r32) {
        /*
            r25 = this;
            r6 = r26
            int r13 = r6.A00
            r9 = 0
            r0 = r27
            if (r27 == 0) goto L_0x017b
            com.whatsapp.jid.GroupJid r8 = r0.A02
            java.lang.String r3 = r0.A03
        L_0x000d:
            java.lang.String r0 = "GroupChatManager/updateLinkGroupInfoIfNeeded()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 1
            r0 = 2
            r12 = r25
            r18 = r29
            if (r13 == r0) goto L_0x001f
            if (r13 == r1) goto L_0x001f
            r0 = 3
            if (r13 != r0) goto L_0x0091
        L_0x001f:
            com.whatsapp.jid.GroupJid r11 = r6.A02
            boolean r0 = r11 instanceof X.C16050sL
            if (r0 == 0) goto L_0x0091
            X.0sL r5 = X.C16050sL.A03(r8)
            if (r5 == 0) goto L_0x0040
            X.0uk r0 = r12.A0B
            X.28n r4 = r0.A03
            java.lang.String r0 = "CommunityChatManagerDelegateDbonSubgroupLinked()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sq r2 = r4.A06
            r1 = 26
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r0.<init>(r4, r6, r5, r1)
            r2.Acl(r0)
        L_0x0040:
            X.0uk r0 = r12.A0B
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "groupChatManager/updateLinkGroupInfoIfNeeded/ab prop is off"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.17D r3 = r12.A0C
            java.lang.String r1 = "CommunitySharedPrefs/setTempGroupType()/groupType = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.SharedPreferences r0 = r3.A00()
            android.content.SharedPreferences$Editor r2 = r0.edit()
            java.lang.String r0 = "create_"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r11.getRawString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.content.SharedPreferences$Editor r0 = r2.putInt(r0, r13)
            r0.apply()
            X.11H r0 = r12.A0U
            boolean r0 = r0.A03(r11, r13)
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = "groupChatManager/updateLinkGroupInfoIfNeeded/successfully add group type"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A01(r11)
        L_0x0091:
            if (r29 == 0) goto L_0x009a
            X.124 r1 = r12.A0s
            r0 = r18
            r1.A02(r0)
        L_0x009a:
            return
        L_0x009b:
            r0 = 79
            r16 = 3010(0xbc2, float:4.218E-42)
            r1 = r31
            if (r1 != r0) goto L_0x00a5
            r16 = 3012(0xbc4, float:4.221E-42)
        L_0x00a5:
            X.0pd r7 = r12.A0f
            r0 = 2857(0xb29, float:4.004E-42)
            X.0tM r6 = X.C16620tM.A02
            boolean r2 = r7.A0E(r6, r0)
            r10 = r28
            r17 = r30
            r0 = r32
            if (r2 == 0) goto L_0x0152
            if (r8 == 0) goto L_0x0152
            if (r11 == 0) goto L_0x0152
            r15 = 1
            r14 = 0
            if (r30 != 0) goto L_0x00c0
            r14 = 1
        L_0x00c0:
            if (r13 == r15) goto L_0x013e
            r2 = 2
            X.122 r5 = r12.A0y
            X.18b r4 = r5.A03
            if (r13 == r2) goto L_0x0119
            X.1Vw r2 = r4.A02(r11, r15)
            X.1u7 r14 = new X.1u7
            r14.<init>(r2, r0)
            r14.A18(r8, r3)
            r5.A0B(r10, r14, r15)
        L_0x00d8:
            X.18M r3 = r12.A0g
            r2 = r16
            r3.A00(r14, r2)
            r2 = 2367(0x93f, float:3.317E-42)
            boolean r2 = r7.A0E(r6, r2)
            if (r2 == 0) goto L_0x009a
            r2 = 2
            if (r13 != r2) goto L_0x009a
            if (r8 == 0) goto L_0x009a
            r13 = 2857(0xb29, float:4.004E-42)
            boolean r6 = r7.A0E(r6, r13)
            if (r6 == 0) goto L_0x01a5
            X.0rt r6 = r12.A0R
            java.lang.String r14 = r6.A09(r8)
            int r6 = r12.A04(r11, r8)
            r7 = 1
            if (r6 == r7) goto L_0x0192
            if (r6 == r2) goto L_0x017f
            r2 = 4
            if (r6 == r2) goto L_0x01c0
            r2 = 0
            java.lang.String r1 = "GroupChatManager/displaySubGroupLinkedWithJoinModeDisclaimer Unhandled groupJoinMode "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A0B(r0, r2)
            return
        L_0x0119:
            if (r14 == 0) goto L_0x012b
            X.1Vw r2 = r4.A02(r11, r15)
            X.1u6 r14 = new X.1u6
            r14.<init>(r2, r0)
            r14.A18(r8, r3)
            r5.A0B(r10, r14, r15)
            goto L_0x00d8
        L_0x012b:
            X.1Vw r15 = r4.A02(r11, r15)
            X.1u4 r14 = new X.1u4
            r2 = r18
            r14.<init>(r15, r2, r0)
            r14.A18(r8, r3)
            r2 = 0
            r5.A0B(r10, r14, r2)
            goto L_0x00d8
        L_0x013e:
            X.122 r5 = r12.A0y
            X.18b r4 = r5.A03
            X.1Vw r2 = r4.A02(r8, r15)
            X.1u8 r14 = new X.1u8
            r14.<init>(r2, r0)
            r14.A18(r8, r3)
            r5.A0B(r10, r14, r15)
            goto L_0x00d8
        L_0x0152:
            X.122 r5 = r12.A0y
            X.18b r4 = r5.A03
            r3 = 1
            X.1Vw r20 = r4.A02(r11, r3)
            r22 = 75
            X.0so r2 = r5.A00
            r19 = r2
            r21 = r18
            r23 = r0
            X.1WU r14 = X.AnonymousClass122.A00(r19, r20, r21, r22, r23)
            X.1sT r14 = (X.C39431sT) r14
            r2 = r17
            r14.A02 = r2
            r14.A00 = r13
            r14.A01 = r8
            if (r30 == 0) goto L_0x0176
            r3 = 0
        L_0x0176:
            r5.A0B(r10, r14, r3)
            goto L_0x00d8
        L_0x017b:
            r3 = r9
            r8 = r9
            goto L_0x000d
        L_0x017f:
            X.1Vw r2 = r4.A02(r11, r7)
            X.1tv r4 = new X.1tv
            r4.<init>(r2, r9, r0)
            r11 = r10
            r12 = r4
            r13 = r17
            r9 = r5
            r10 = r8
            r9.A09(r10, r11, r12, r13, r14)
            goto L_0x01d2
        L_0x0192:
            X.1Vw r2 = r4.A02(r11, r7)
            X.1tt r4 = new X.1tt
            r4.<init>(r2, r9, r0)
            r11 = r10
            r12 = r4
            r13 = r17
            r9 = r5
            r10 = r8
            r9.A09(r10, r11, r12, r13, r14)
            goto L_0x01d2
        L_0x01a5:
            r6 = 1
            X.1Vw r12 = r4.A02(r11, r6)
            r14 = 95
            X.1sT r4 = new X.1sT
            r11 = r4
            r13 = r9
            r15 = r0
            r11.<init>(r12, r13, r14, r15)
            r4.A00 = r2
            r4.A01 = r8
            r0 = 0
            if (r30 != 0) goto L_0x01bc
            r0 = 1
        L_0x01bc:
            r5.A0B(r10, r4, r0)
            goto L_0x01d2
        L_0x01c0:
            X.1Vw r2 = r4.A02(r11, r7)
            X.1tw r4 = new X.1tw
            r4.<init>(r2, r9, r0)
            r12 = r9
            r9 = r10
            r10 = r4
            r11 = r17
            r7 = r5
            r7.A09(r8, r9, r10, r11, r12)
        L_0x01d2:
            r0 = 3013(0xbc5, float:4.222E-42)
            r3.A00(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17240ul.A0I(X.1sW, X.1sW, com.whatsapp.jid.UserJid, X.1ci, java.lang.Integer, int, long):void");
    }

    public final void A0J(C15830rv r4, List list) {
        if (this.A0t.A0C(0) && C16030sJ.A0L(r4)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A0T.A0Q(r4, (UserJid) it.next());
            }
        }
    }

    public final void A0K(C16060sN r13, Iterable iterable, boolean z2) {
        boolean z3;
        C30361cE A042 = this.A0a.A07.A04(r13);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            z3 = z2;
            if (!it.hasNext()) {
                break;
            }
            UserJid userJid = (UserJid) it.next();
            arrayList.add(new C30661ck(userJid, C30361cE.A01(this.A0e.A0D(userJid)), 0, z2));
        }
        A042.A0J(arrayList);
        if (C16030sJ.A0H(r13)) {
            C16040sK r0 = this.A08;
            r0.A0B();
            AnonymousClass1ZT r7 = r0.A05;
            AnonymousClass00B.A06(r7);
            A042.A07(r7, this.A0e.A0D(r7), 2, z3, true);
        }
    }

    public void A0L(C16060sN r9, Long l2, List list) {
        this.A0Q.A01(new RunnableRunnableShape0S0400000_I0(this, r9, l2, list, 26), 46);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r6.A0P(r10) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.C16060sN r18, java.util.List r19) {
        /*
            r17 = this;
            java.lang.String r0 = ""
            r10 = r19
            X.AnonymousClass00B.A0A(r0, r10)
            r4 = r17
            X.0sO r0 = r4.A0a
            X.0us r0 = r0.A07
            r7 = r18
            X.1cE r6 = r0.A04(r7)
            X.0pd r2 = r4.A0f
            r1 = 1108(0x454, float:1.553E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r3 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0028
            boolean r0 = r6.A0P(r10)
            r1 = 0
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            r6.A0K(r10)
            X.0yQ r0 = r4.A0p
            r0.A0Q(r7, r10)
            boolean r0 = X.C16030sJ.A0G(r7)
            if (r0 == 0) goto L_0x0083
            if (r1 == 0) goto L_0x0047
            X.16P r2 = r4.A0P
            r0 = 13
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r1 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r1.<init>(r4, r6, r7, r0)
            java.util.concurrent.ThreadPoolExecutor r0 = r2.A00
            r0.submit(r1)
        L_0x0047:
            X.0sP r0 = r4.A0G
            r0.A0P(r7)
        L_0x004c:
            int r2 = r10.size()
            r1 = 2
            X.18M r0 = r4.A0g
            if (r2 != r5) goto L_0x0070
            X.122 r8 = r4.A0y
            r11 = 0
            X.0t3 r2 = r4.A0L
            long r13 = r2.A00()
            r12 = 7
            java.lang.Object r10 = r10.get(r3)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            r15 = 0
            r9 = r7
            X.1sE r2 = r8.A07(r9, r10, r11, r12, r13, r15)
        L_0x006c:
            r0.A00(r2, r1)
            return
        L_0x0070:
            X.122 r5 = r4.A0y
            r8 = 0
            X.0t3 r2 = r4.A0L
            long r12 = r2.A00()
            r11 = 14
            r14 = 0
            r9 = r8
            X.1sE r2 = r5.A05(r6, r7, r8, r9, r10, r11, r12, r14)
            goto L_0x006c
        L_0x0083:
            r4.A0J(r7, r10)
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17240ul.A0M(X.0sN, java.util.List):void");
    }

    public final void A0N(C16050sL r5) {
        C30361cE A042 = this.A0a.A07.A04(r5);
        C16040sK r3 = this.A08;
        r3.A0B();
        AnonymousClass1ZT r0 = r3.A05;
        AnonymousClass00B.A06(r0);
        A042.A06(r0);
        C28031Ub it = A042.A04().iterator();
        while (it.hasNext()) {
            ((C30661ck) it.next()).A01 = 0;
        }
        this.A0p.A0R(r5);
        r3.A0B();
        A0J(r5, Collections.singletonList(r3.A05));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0067 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x006c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(X.C16050sL r7, int r8) {
        /*
            r6 = this;
            java.lang.String r0 = "groupmgr/updateGroupMemberCount/updating group size metadata for group: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = " to:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.18Q r1 = r6.A0F
            java.lang.Integer r0 = r1.A00(r7)
            if (r0 == 0) goto L_0x0027
            int r0 = r0.intValue()
            if (r0 == r8) goto L_0x0085
        L_0x0027:
            r0 = 1
            if (r8 < r0) goto L_0x006d
            X.11X r0 = r1.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075 }
            X.0tf r3 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075 }
            X.1cj r5 = r3.A00()     // Catch:{ all -> 0x0068 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0063 }
            r4.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "jid_row_id"
            X.14v r0 = r1.A00     // Catch:{ all -> 0x0063 }
            long r0 = r0.A01(r7)     // Catch:{ all -> 0x0063 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0063 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "member_count"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0063 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0063 }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "group_membership_count"
            r0 = 5
            r2.A06(r4, r1, r0)     // Catch:{ all -> 0x0063 }
            r5.A00()     // Catch:{ all -> 0x0063 }
            r5.close()     // Catch:{ all -> 0x0068 }
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075 }
            goto L_0x0079
        L_0x0063:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0067 }
        L_0x0067:
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x006c }
        L_0x006c:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0075 }
        L_0x006d:
            java.lang.String r1 = "Number of members can't be less than 1."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0075:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0079:
            android.os.Handler r2 = A15
            r1 = 31
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r0.<init>(r6, r1, r7)
            r2.post(r0)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17240ul.A0O(X.0sL, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.1sW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: X.1sW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: X.1jl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: X.1sW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.1sW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v3, resolved type: X.1sW} */
    /* JADX WARNING: type inference failed for: r13v2, types: [X.1jl] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x019d, code lost:
        if (r30 != false) goto L_0x019f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(X.C16050sL r47, X.C16050sL r48, com.whatsapp.jid.UserJid r49, X.C30371cF r50, X.C34141jl r51, java.lang.Integer r52, java.lang.String r53, java.lang.String r54, java.util.Map r55, int r56, int r57, int r58, int r59, long r60, long r62, long r64, long r66, boolean r68, boolean r69, boolean r70, boolean r71, boolean r72, boolean r73, boolean r74) {
        /*
            r46 = this;
            r8 = r62
            java.lang.String r1 = "groupmgr/onGroupInfoFromList/gjid:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r1 = r47
            r0.append(r1)
            java.lang.String r2 = "/creator:"
            r0.append(r2)
            r11 = r49
            r0.append(r11)
            java.lang.String r2 = "/creation:"
            r0.append(r2)
            r42 = r60
            r2 = r42
            r0.append(r2)
            java.lang.String r2 = "/subject:"
            r0.append(r2)
            r45 = r53
            r2 = r45
            r0.append(r2)
            java.lang.String r2 = "/subject_time:"
            r0.append(r2)
            r0.append(r8)
            java.lang.String r2 = "/type:"
            r0.append(r2)
            r2 = r54
            r0.append(r2)
            java.lang.String r2 = "/vid:"
            r0.append(r2)
            r40 = r64
            r2 = r40
            r0.append(r2)
            java.lang.String r2 = "/inAppSupport:"
            r0.append(r2)
            r7 = r68
            r0.append(r7)
            java.lang.String r2 = "/restrictMode:"
            r0.append(r2)
            r5 = r69
            r0.append(r5)
            java.lang.String r2 = "/announcementsOnly:"
            r0.append(r2)
            r4 = r70
            r0.append(r4)
            java.lang.String r2 = "/ephemeralDuration"
            r0.append(r2)
            r6 = r56
            r0.append(r6)
            java.lang.String r2 = "/isMembershipApprovalRequired"
            r0.append(r2)
            r3 = r74
            r0.append(r3)
            java.lang.String r2 = "/syncDeviceType"
            r0.append(r2)
            r44 = r57
            r2 = r44
            r0.append(r2)
            java.lang.String r2 = "/groupType:"
            r0.append(r2)
            r14 = r58
            r0.append(r14)
            java.lang.String r2 = "/defaultMembershipApprovalMode"
            r0.append(r2)
            r38 = r59
            r2 = r38
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r46
            X.0sG r15 = r0.A0E
            X.0sH r2 = r15.A0A(r1)
            java.lang.String r10 = r2.A0R
            boolean r30 = android.text.TextUtils.isEmpty(r10)
            r19 = r50
            r28 = r73
            r27 = r72
            r26 = r71
            r21 = r42
            r23 = r7
            r24 = r5
            r25 = r4
            r29 = r3
            r16 = r0
            r17 = r2
            r18 = r11
            r20 = r45
            boolean r18 = r16.A0i(r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29)
            int r3 = r2.A01
            r39 = 0
            if (r3 == r6) goto L_0x02a4
            r2.A01 = r6
            r18 = 1
            r17 = 1
        L_0x00e1:
            X.0rt r12 = r0.A0R
            boolean r3 = r12.A0F(r1)
            r4 = 1
            r16 = r3 ^ 1
            r3 = 0
            r5 = 3
            if (r14 != r5) goto L_0x00ef
            r3 = 1
        L_0x00ef:
            r13 = 0
            r33 = r48
            if (r16 == 0) goto L_0x026c
            boolean r5 = r0.A0q(r1, r3)
            if (r5 == 0) goto L_0x0117
            X.18M r5 = r0.A0g
            X.122 r7 = r0.A0y
            X.0t3 r6 = r0.A0L
            long r24 = r6.A00()
            r23 = 99
            r22 = r13
            r20 = r13
            r21 = r1
            r19 = r7
            X.1sE r6 = r19.A06(r20, r21, r22, r23, r24)
            X.0t6 r5 = r5.A01
            r5.A0W(r6)
        L_0x0117:
            X.18M r7 = r0.A0g
            X.122 r6 = r0.A0y
            r23 = 11
            r22 = r13
            r19 = r6
            r20 = r13
            r21 = r1
            r24 = r8
            X.1sE r10 = r19.A06(r20, r21, r22, r23, r24)
            r5 = r45
            r10.A0k(r5)
            r10.A0b(r11)
            r7.A00(r10, r4)
            X.0sK r5 = r0.A08
            boolean r10 = r5.A0I(r11)
            if (r10 != 0) goto L_0x0161
            r5.A0B()
            X.1ZT r5 = r5.A05
            X.AnonymousClass00B.A06(r5)
            X.18b r10 = r6.A03
            X.1Vw r20 = r10.A02(r1, r4)
            X.0so r6 = r6.A00
            r22 = 4
            r19 = r6
            r21 = r13
            r23 = r8
            X.1WU r6 = X.AnonymousClass122.A00(r19, r20, r21, r22, r23)
            r6.A0b(r5)
            r5 = 2
            r7.A00(r6, r5)
        L_0x0161:
            if (r48 == 0) goto L_0x0170
            r36 = 0
            java.lang.String r34 = ""
            X.1sW r13 = new X.1sW
            r35 = 1
            r32 = r13
            r32.<init>(r33, r34, r35, r36)
        L_0x0170:
            X.1sW r20 = new X.1sW
            r21 = r1
            r22 = r45
            r23 = r14
            r24 = r8
            r20.<init>(r21, r22, r23, r24)
            r23 = 75
            r19 = r0
            r21 = r13
            r22 = r11
            r24 = r42
            r19.A0H(r20, r21, r22, r23, r24)
        L_0x018a:
            r6 = r55
            if (r55 == 0) goto L_0x0199
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L_0x0199
            X.0vL r5 = r0.A0u
            r5.A00(r6)
        L_0x0199:
            if (r16 != 0) goto L_0x019f
            r29 = 1
            if (r30 == 0) goto L_0x01a1
        L_0x019f:
            r29 = 0
        L_0x01a1:
            if (r55 != 0) goto L_0x0238
            r7 = 0
            r3 = 1
        L_0x01a5:
            if (r18 == 0) goto L_0x01aa
            r15.A0M(r2)
        L_0x01aa:
            X.11J r4 = r0.A0Z
            java.util.concurrent.ConcurrentHashMap r4 = r4.A03
            boolean r4 = r4.containsKey(r1)
            if (r4 != 0) goto L_0x01bb
            X.12B r6 = r0.A0v
            r5 = 2
            r4 = 0
            r6.A01(r1, r4, r5)
        L_0x01bb:
            r4 = r7 & 2
            if (r4 == 0) goto L_0x01c3
            r4 = 5
            A01(r4, r1)
        L_0x01c3:
            if (r17 == 0) goto L_0x01e4
            if (r29 == 0) goto L_0x01e4
            r4 = 3017(0xbc9, float:4.228E-42)
            X.122 r5 = r0.A0y
            r19 = 0
            int r2 = r2.A01
            X.0t3 r6 = r0.A0L
            long r22 = r6.A00()
            r18 = r1
            r20 = r19
            r21 = r2
            r17 = r5
            X.1WU r2 = r17.A04(r18, r19, r20, r21, r22)
            A01(r4, r2)
        L_0x01e4:
            r2 = 3
            if (r14 != r2) goto L_0x0213
            if (r52 == 0) goto L_0x01f0
            int r2 = r52.intValue()
            r0.A0O(r1, r2)
        L_0x01f0:
            r39 = 1
        L_0x01f2:
            r32 = r0
            r34 = r1
            r35 = r45
            r36 = r14
            r37 = r8
            r32.A0Q(r33, r34, r35, r36, r37, r39)
            X.18S r0 = r0.A0Y
            r2 = r66
            r0.A00(r1, r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r8 = r62 / r2
            r0.A03(r1, r8)
            r2 = r40
            r0.A02(r1, r2)
            return
        L_0x0213:
            if (r14 != r3) goto L_0x01f2
            X.0rx r6 = r12.A06(r1)
            if (r6 == 0) goto L_0x022b
            X.0uk r5 = r0.A0B
            r4 = 1
            r2 = r38
            if (r2 == r3) goto L_0x0223
            r4 = 0
        L_0x0223:
            r6.A0g = r4
            X.15m r2 = r5.A07
            r2.A00(r6)
            goto L_0x01f2
        L_0x022b:
            if (r16 == 0) goto L_0x01f2
            r2 = r38
            if (r2 == r3) goto L_0x0232
            r3 = 0
        L_0x0232:
            X.17D r2 = r0.A0C
            r2.A02(r1, r3)
            goto L_0x01f2
        L_0x0238:
            X.0sO r5 = r0.A0a
            X.0us r5 = r5.A07
            X.1cE r5 = r5.A04(r1)
            boolean r7 = r5.A05
            if (r7 != 0) goto L_0x024a
            if (r3 == 0) goto L_0x024a
            if (r73 == 0) goto L_0x024a
            r5.A05 = r4
        L_0x024a:
            java.lang.String r4 = r2.A0O
            r31 = 1
            r3 = 1
            r32 = 0
            r22 = r0
            r23 = r5
            r24 = r4
            r25 = r6
            r26 = r44
            r27 = r40
            int r7 = r22.A02(r23, r24, r25, r26, r27, r29, r30, r31, r32)
            r4 = r7 & 1
            if (r4 == 0) goto L_0x01a5
            X.0sP r4 = r0.A0G
            r4.A0P(r1)
            goto L_0x01a5
        L_0x026c:
            X.0rx r5 = r12.A06(r1)
            if (r5 == 0) goto L_0x0274
            X.1jl r13 = r5.A0a
        L_0x0274:
            X.16n r6 = r0.A0o
            X.0t3 r5 = r0.A0L
            long r26 = r5.A00()
            r21 = r51
            r23 = r1
            r24 = r13
            r25 = r21
            r22 = r6
            X.1WU r7 = r22.A00(r23, r24, r25, r26)
            if (r7 == 0) goto L_0x0293
            X.18M r6 = r0.A0g
            r5 = 8
            r6.A00(r7, r5)
        L_0x0293:
            X.11H r5 = r0.A0U
            r19 = r5
            r20 = r1
            r22 = r45
            r23 = r14
            r24 = r42
            r19.A01(r20, r21, r22, r23, r24)
            goto L_0x018a
        L_0x02a4:
            r17 = 0
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17240ul.A0P(X.0sL, X.0sL, com.whatsapp.jid.UserJid, X.1cF, X.1jl, java.lang.Integer, java.lang.String, java.lang.String, java.util.Map, int, int, int, int, long, long, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final void A0Q(C16050sL r8, C16050sL r9, String str, int i2, long j2, boolean z2) {
        String str2 = str;
        C16050sL r2 = r9;
        if (i2 != 2) {
            if (i2 != 0) {
                if (i2 != 3) {
                    return;
                }
            }
            this.A0B.A03.A04.A02(r9);
        }
        if (r8 != null) {
            C17230uk r0 = this.A0B;
            if (str == null) {
                str2 = "";
            }
            int i3 = 2;
            if (z2) {
                i3 = 3;
            }
            r0.A03.A04.A04(r8, Collections.singletonList(new C39461sW(r2, str2, i3, j2)));
            return;
        }
        this.A0B.A03.A04.A02(r9);
    }

    public final void A0R(C16050sL r5, C16050sL r6, String str, boolean z2) {
        String A082;
        if (!z2) {
            return;
        }
        if (r6 == null) {
            C16300so r3 = this.A06;
            StringBuilder sb = new StringBuilder();
            sb.append(r5);
            sb.append(" has a null parent group");
            r3.AcB("comm-failures/parentGroupJid is null", sb.toString(), false);
            return;
        }
        C16000sG r2 = this.A0E;
        C16010sH A092 = r2.A09(r6);
        if (A092 != null && (A082 = this.A0G.A08(A092)) != null && A082.equals(str)) {
            C16010sH A0A2 = r2.A0A(r6);
            A0A2.A0L = str;
            r2.A06.A0J(A0A2);
            r2.A04.A00(A0A2);
            this.A07.A0K(new RunnableRunnableShape7S0200000_I0_5(this, 34, r6));
        }
    }

    public final void A0S(C16050sL r11, UserJid userJid) {
        StringBuilder sb = new StringBuilder("groupmgr/addGroupParticipantOnCurrentThread/adding participant: ");
        sb.append(userJid);
        sb.append(" to group:");
        sb.append(r11);
        Log.i(sb.toString());
        this.A0a.A07.A04(r11).A07(userJid, this.A0e.A0D(userJid), 0, false, true);
        this.A0G.A0P(r11);
        AnonymousClass122 r1 = this.A0y;
        C39291sE A072 = r1.A07(r11, userJid, (C30641ci) null, 4, this.A0L.A00(), 0);
        this.A0T.A0u(A072);
        A15.post(new RunnableRunnableShape7S0200000_I0_5(this, 39, A072));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.1sV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.1sV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: X.1tz} */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.1ty] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0T(X.C16050sL r11, com.whatsapp.jid.UserJid r12, X.C30641ci r13, java.util.Set r14, long r15, boolean r17) {
        /*
            r10 = this;
            if (r17 == 0) goto L_0x0091
            X.0uk r0 = r10.A0B
            X.0sL r1 = r0.A02(r11)
            if (r1 != 0) goto L_0x0089
            X.0so r3 = r10.A06
            r2 = 1
            java.lang.String r1 = "groupChatManager/nullParent"
            java.lang.String r0 = "Could not find parent group to link"
            r3.AcB(r1, r0, r2)
        L_0x0014:
            X.0uk r1 = r10.A0B
            boolean r0 = r1.A0A()
            r6 = r13
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x00b3
            X.18M r3 = r10.A0g
            X.0sL r2 = r1.A02(r11)
            X.0pd r4 = r10.A0f
            r1 = 2857(0xb29, float:4.004E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r4.A0E(r0, r1)
            r8 = r15
            if (r0 == 0) goto L_0x005b
            X.122 r0 = r10.A0y
            X.18b r1 = r0.A03
            r0 = 1
            X.1Vw r0 = r1.A02(r11, r0)
            if (r17 == 0) goto L_0x0055
            X.1ty r1 = new X.1ty
            r1.<init>(r0, r13, r8)
        L_0x0046:
            r1.A0b(r12)
            r1.A19(r2)
            r1.A1A(r14)
        L_0x004f:
            r0 = 3011(0xbc3, float:4.22E-42)
            r3.A00(r1, r0)
            return
        L_0x0055:
            X.1tz r1 = new X.1tz
            r1.<init>(r0, r13, r8)
            goto L_0x0046
        L_0x005b:
            X.122 r4 = r10.A0y
            X.18b r1 = r4.A03
            r0 = 1
            X.1Vw r5 = r1.A02(r11, r0)
            r7 = 78
            if (r17 == 0) goto L_0x006a
            r7 = 77
        L_0x006a:
            X.0so r4 = r4.A00
            X.1WU r1 = X.AnonymousClass122.A00(r4, r5, r6, r7, r8)
            X.1sV r1 = (X.C39451sV) r1
            r1.A0b(r12)
            java.util.Set r0 = r1.A03
            r0.clear()
            r0.addAll(r14)
            int r0 = r14.size()
            if (r0 >= 0) goto L_0x0084
            r0 = 0
        L_0x0084:
            r1.A00 = r0
            r1.A01 = r2
            goto L_0x004f
        L_0x0089:
            X.28n r0 = r0.A03
            X.15k r0 = r0.A04
            r0.A04(r1, r14)
            goto L_0x0014
        L_0x0091:
            java.util.Iterator r2 = r14.iterator()
        L_0x0095:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r2.next()
            X.1sW r0 = (X.C39461sW) r0
            com.whatsapp.jid.GroupJid r0 = r0.A02
            X.0sL r1 = X.C16050sL.A03(r0)
            if (r1 == 0) goto L_0x0095
            X.0uk r0 = r10.A0B
            X.28n r0 = r0.A03
            X.15k r0 = r0.A04
            r0.A02(r1)
            goto L_0x0095
        L_0x00b3:
            X.124 r0 = r10.A0s
            r0.A02(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17240ul.A0T(X.0sL, com.whatsapp.jid.UserJid, X.1ci, java.util.Set, long, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [X.1u2, X.1u1, X.0tZ] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.1u1, X.1u0, X.0tZ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(X.C16050sL r9, com.whatsapp.jid.UserJid r10, X.C30641ci r11, java.util.Set r12, long r13, boolean r15) {
        /*
            r8 = this;
            X.0pd r2 = r8.A0f
            r1 = 2857(0xb29, float:4.004E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r4 = r11
            r6 = r13
            if (r0 == 0) goto L_0x0038
            X.122 r0 = r8.A0y
            X.18b r1 = r0.A03
            r0 = 1
            X.1Vw r0 = r1.A02(r9, r0)
            if (r15 == 0) goto L_0x002c
            X.1u0 r1 = new X.1u0
            r1.<init>(r0, r11, r13)
            r1.A0b(r10)
            r1.A19(r12)
        L_0x0024:
            X.18M r2 = r8.A0g
            r0 = 3010(0xbc2, float:4.218E-42)
            r2.A00(r1, r0)
            return
        L_0x002c:
            X.1u2 r1 = new X.1u2
            r1.<init>(r0, r11, r13)
            r1.A0b(r10)
            r1.A19(r12)
            goto L_0x0024
        L_0x0038:
            X.122 r2 = r8.A0y
            X.18b r1 = r2.A03
            r0 = 1
            X.1Vw r3 = r1.A02(r9, r0)
            r5 = 89
            if (r15 == 0) goto L_0x0047
            r5 = 88
        L_0x0047:
            X.0so r2 = r2.A00
            X.1WU r1 = X.AnonymousClass122.A00(r2, r3, r4, r5, r6)
            X.1sV r1 = (X.C39451sV) r1
            r1.A0b(r10)
            java.util.Set r0 = r1.A03
            r0.clear()
            r0.addAll(r12)
            int r0 = r12.size()
            if (r0 >= 0) goto L_0x0061
            r0 = 0
        L_0x0061:
            r1.A00 = r0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17240ul.A0U(X.0sL, com.whatsapp.jid.UserJid, X.1ci, java.util.Set, long, boolean):void");
    }

    public void A0V(C16050sL r10, C34141jl r11, long j2) {
        C16050sL r4 = r10;
        C15840rx A062 = this.A0R.A06(r10);
        if (A062 == null) {
            Log.e("groupmgr/onGrowthLockChanged/notification for nonexistent group");
            return;
        }
        AnonymousClass1WU A002 = this.A0o.A00(r4, A062.A0a, r11, j2);
        if (A002 != null) {
            this.A0g.A00(A002, 8);
        }
        AnonymousClass11H r3 = this.A0U;
        StringBuilder sb = new StringBuilder("msgstore/updategroupchatgrowthlockifexists/");
        sb.append(r10);
        Log.i(sb.toString());
        r3.A00.A01(new RunnableRunnableShape1S0300000_I0_1(r3, r10, r11, 7), 58);
    }

    public void A0W(UserJid userJid, C30641ci r11, int i2, long j2) {
        String str;
        int i3 = i2;
        StringBuilder sb = new StringBuilder("groupmgr/onGroupEphemeralChanged/");
        C30641ci r5 = r11;
        sb.append(r11);
        sb.append("/");
        sb.append(i2);
        Log.i(sb.toString());
        if (i2 < 0) {
            i3 = 0;
        }
        C16050sL A032 = C16050sL.A03(C16030sJ.A00(r11.A01));
        AnonymousClass00B.A06(A032);
        C16000sG r1 = this.A0E;
        C16010sH A092 = r1.A09(A032);
        if (A092 == null) {
            str = "groupmgr/onGroupEphemeralChanged/new group";
        } else if (A092.A01 != i3) {
            Log.i("groupmgr/onGroupEphemeralChanged/changed");
            r1.A0R(A032, i3);
            A01(3017, this.A0y.A04(A032, userJid, r5, i3, j2));
            return;
        } else {
            str = "groupmgr/onGroupEphemeralChanged/did not change";
        }
        Log.i(str);
        this.A0s.A02(r11);
    }

    public final synchronized void A0X(C19550yc r6) {
        synchronized (this) {
            Integer num = this.A03;
            AnonymousClass00B.A06(num);
            if (num.intValue() == 3) {
                this.A00 = this.A0L.A00();
            }
            int intValue = this.A03.intValue();
            StringBuilder sb = new StringBuilder();
            sb.append("groupmgr/sendGetGroups/ ");
            sb.append(intValue);
            Log.i(sb.toString());
            this.A02 = Integer.valueOf(intValue);
            this.A14 = true;
            AnonymousClass2Ba r2 = new AnonymousClass2Ba(this.A06, this, this.A0q, intValue);
            if (r6 == null) {
                r2.A00(r2);
            } else {
                r2.A00(new IDxRCallbackShape49S0200000_2_I0(r6, 7, r2));
            }
            this.A03 = null;
        }
    }

    public final synchronized void A0Y(C19550yc r6, int i2, boolean z2, boolean z3) {
        if (z3) {
            if (this.A00 != 0 && this.A0L.A00() - this.A00 < 120000) {
                StringBuilder sb = new StringBuilder();
                sb.append("groupmgr/sendGetGroups/skip backoff param=");
                sb.append(i2);
                Log.i(sb.toString());
            }
        }
        if (i2 == 3) {
            Log.i("groupmgr/sendGetGroups/all");
            this.A13 = true;
        }
        Integer num = this.A02;
        if (num == null) {
            A0D(i2);
            A0X(r6);
        } else if (!z2 || (num.intValue() & i2) != i2) {
            A0D(i2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("groupmgr/sendGetGroups/skip inFlight param=");
            sb2.append(i2);
            Log.i(sb2.toString());
        }
    }

    public void A0Z(C30641ci r4, boolean z2) {
        String str;
        StringBuilder sb = new StringBuilder("groupmgr/onGroupSuspensionChanged/");
        sb.append(r4);
        sb.append("/");
        sb.append(z2);
        Log.i(sb.toString());
        C16050sL A032 = C16050sL.A03(C16030sJ.A00(r4.A01));
        AnonymousClass00B.A06(A032);
        C16000sG r1 = this.A0E;
        C16010sH A092 = r1.A09(A032);
        if (A092 == null) {
            str = "groupmgr/onGroupSuspensionChanged/new group";
            Log.i(str);
        } else if (A092.A0c != z2) {
            Log.i("groupmgr/onGroupSuspensionChanged/changed");
            r1.A0Q(A032, z2);
        } else {
            str = "groupmgr/onGroupSuspensionChanged/did not change";
            Log.i(str);
        }
        this.A0s.A02(r4);
    }

    public void A0a(List list, boolean z2) {
        StringBuilder sb = new StringBuilder("groupmgr/onLeaveGroup/");
        sb.append(Arrays.deepToString(list.toArray()));
        Log.i(sb.toString());
        C16040sK r3 = this.A08;
        r3.A0B();
        AnonymousClass1ZT r8 = r3.A05;
        AnonymousClass00B.A06(r8);
        AnonymousClass1ZX A032 = r3.A03();
        Iterator it = list.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            C16050sL r7 = (C16050sL) it.next();
            this.A0G.A0P(r7);
            C30361cE A042 = this.A0a.A07.A04(r7);
            if (A042.A0M(r3)) {
                A042.A06(r8);
                if (A032 != null) {
                    A042.A06(A032);
                }
                this.A0p.A0R(r7);
                if (this.A0f.A0E(C16620tM.A02, 1728)) {
                    this.A10.Acl(new RunnableRunnableShape7S0200000_I0_5(this, 33, r7));
                }
                this.A07.A0K(new RunnableRunnableShape7S0200000_I0_5(this, 36, r7));
                A0J(r7, Collections.singletonList(r8));
                C39291sE A072 = this.A0y.A07(r7, r8, (C30641ci) null, 5, this.A0L.A00(), 0);
                if (!z2 || !this.A0R.A0F(r7)) {
                    A01(3, A072);
                } else {
                    this.A0g.A00(A072, 7);
                }
                z3 = true;
            }
        }
        if (z3) {
            Context context = this.A0M.A00;
            Log.i("GCM: force updating push config");
            RegistrationIntentService.A03(context, (String) null, (String) null, (String) null);
        }
    }

    public boolean A0b() {
        C14710pd r5 = this.A0f;
        C16620tM r4 = C16620tM.A02;
        boolean A0E2 = r5.A0E(r4, 1173);
        boolean A0G2 = this.A08.A0G();
        boolean A0c2 = A0c();
        if (A0G2) {
            if (!A0c2 || !A0E2) {
                return false;
            }
            A0E2 = r5.A0E(r4, 2695);
        } else if (!A0c2) {
            return false;
        }
        return A0E2;
    }

    public boolean A0c() {
        C14710pd r3 = this.A0f;
        C16620tM r2 = C16620tM.A02;
        boolean A0E2 = r3.A0E(r2, 982);
        return this.A08.A0G() ? A0E2 && r3.A0E(r2, 2695) : A0E2;
    }

    public boolean A0d(int i2) {
        return A0c() && i2 == 1;
    }

    public boolean A0e(C16010sH r3) {
        int A022 = this.A0R.A02((GroupJid) r3.A08(C16050sL.class));
        if (!r3.A0J() || A022 == 3 || A022 == 1) {
            return false;
        }
        return r3.A0c;
    }

    public boolean A0f(C16010sH r2) {
        if (r2 == null) {
            return false;
        }
        return A0e(r2);
    }

    public boolean A0g(C16010sH r4, C15830rv r5) {
        if (!r4.A0J() || !C16030sJ.A0L(r5)) {
            return false;
        }
        return (r4.A0Y && !this.A0a.A0A((GroupJid) r5)) || A0e(r4) || this.A0n.A00(r4) || r4.A02 == 1;
    }

    public boolean A0h(C16010sH r5, C16050sL r6) {
        C15810rt r3 = this.A0R;
        C217915l r2 = this.A0n;
        C16070sO r1 = this.A0a;
        return AnonymousClass2BW.A01(r1, r5, r2, r6) || AnonymousClass2BX.A03(r3, r1, r5, r2, r6);
    }

    public final boolean A0i(C16010sH r19, UserJid userJid, C30371cF r21, String str, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C30371cF r0;
        boolean A0E2 = this.A0f.A0E(C16620tM.A02, 1728);
        C16010sH r12 = r19;
        String str2 = str;
        boolean z9 = z4;
        boolean z10 = z5;
        boolean z11 = z6;
        boolean z12 = z7;
        boolean z13 = z8;
        boolean z14 = z2;
        boolean z15 = z3;
        UserJid userJid2 = userJid;
        C30371cF r10 = r21;
        if (TextUtils.equals(r12.A09(), str2) && TextUtils.equals(r12.A0R, Long.toString(j2))) {
            String str3 = r12.A0H.A02;
            String str4 = r10.A02;
            if (TextUtils.equals(str3, str4) && ((r0 = r12.A0H) != null ? !(!TextUtils.equals(r0.A03, r10.A03)) : r10.A03 == null && r10.A00 == 0 && r10.A01 == null && str4 == null) && r12.A0a == z14 && r12.A0l == z15 && r12.A0Y == z9 && r12.A0j == z10 && C34901l3.A00(r12.A0F, userJid2) && r12.A0c == z11 && r12.A0b == z12 && (!A0E2 || r12.A0k == z13)) {
                return false;
            }
        }
        r12.A0L = str2;
        r12.A0R = Long.toString(j2);
        if (!(r21 == null || r10.A02 == null)) {
            r12.A0H = r10;
        }
        r12.A0a = z14;
        r12.A0l = z15;
        r12.A0Y = z9;
        r12.A0j = z10;
        r12.A0F = userJid2;
        r12.A0c = z11;
        r12.A0b = z12;
        if (!A0E2) {
            return true;
        }
        r12.A0k = z13;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r0 = r5.A0E.A09(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0j(com.whatsapp.jid.GroupJid r6) {
        /*
            r5 = this;
            X.0sO r0 = r5.A0a
            boolean r0 = r0.A0A(r6)
            r4 = 0
            if (r0 == 0) goto L_0x0014
            X.0rt r0 = r5.A0R
            if (r6 == 0) goto L_0x0015
            int r1 = r0.A02(r6)
            r0 = 3
            if (r1 != r0) goto L_0x0015
        L_0x0014:
            return r4
        L_0x0015:
            X.0pd r3 = r5.A0f
            r0 = 1887(0x75f, float:2.644E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r1 = r3.A0E(r2, r0)
            r0 = 1
            if (r1 == 0) goto L_0x0023
            return r0
        L_0x0023:
            r0 = 1728(0x6c0, float:2.421E-42)
            boolean r0 = r3.A0E(r2, r0)
            if (r0 == 0) goto L_0x0014
            X.0sG r0 = r5.A0E
            X.0sH r0 = r0.A09(r6)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A0k
            if (r0 == 0) goto L_0x0014
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17240ul.A0j(com.whatsapp.jid.GroupJid):boolean");
    }

    public final boolean A0k(GroupJid groupJid) {
        C16010sH A092 = this.A0E.A09(groupJid);
        return A092 != null && A092.A0b && this.A0R.A0H(groupJid);
    }

    public boolean A0l(C16050sL r4) {
        return A0c() && r4 != null && this.A0R.A02(r4) == 3;
    }

    public boolean A0m(C16050sL r3) {
        return A0c() && r3 != null && this.A0R.A02(r3) == 1;
    }

    public boolean A0n(C16050sL r4) {
        return A0c() && r4 != null && this.A0R.A02(r4) == 2;
    }

    public boolean A0o(C16050sL r4) {
        if (this.A08.A0G()) {
            C16010sH A082 = this.A0E.A08(r4);
            if (A082 != null) {
                return A082.A0O != null || !TextUtils.isEmpty(A082.A0R);
            }
            return false;
        }
    }

    public final boolean A0p(C16050sL r4, Map map) {
        if (!A0k(r4)) {
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (C16030sJ.A0M(((AnonymousClass2Bb) it.next()).A01)) {
                    return this.A0f.A0E(C16620tM.A02, 2962);
                }
            }
        }
    }

    public final boolean A0q(C16050sL r5, boolean z2) {
        C16010sH A092 = this.A0E.A09(r5);
        C14710pd r2 = this.A0f;
        C16620tM r1 = C16620tM.A02;
        return r2.A0E(r1, 982) && r2.A0E(r1, 2035) && A092 != null && z2 && !this.A0a.A0A(r5) && A092.A0b;
    }
}
