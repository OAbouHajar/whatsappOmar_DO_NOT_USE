package X;

import com.facebook.redex.IDxCListenerShape227S0100000_2_I0;
import com.facebook.redex.IDxConsumerShape209S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0;
import com.obwhatsapp.group.IDxGObserverShape83S0100000_2_I0;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2AS  reason: invalid class name */
public class AnonymousClass2AS extends C003401n implements AnonymousClass2AT {
    public int A00;
    public long A01;
    public C101234ww A02;
    public C50182Yh A03;
    public C15840rx A04;
    public C16010sH A05;
    public String A06;
    public String A07;
    public final AnonymousClass026 A08;
    public final AnonymousClass026 A09;
    public final AnonymousClass027 A0A;
    public final AnonymousClass027 A0B = new AnonymousClass027();
    public final AnonymousClass027 A0C;
    public final AnonymousClass027 A0D;
    public final AnonymousClass027 A0E;
    public final C16300so A0F;
    public final C50672aG A0G;
    public final C14870pt A0H;
    public final C16040sK A0I;
    public final C17230uk A0J;
    public final C1047756w A0K;
    public final C49622Uk A0L;
    public final AnonymousClass57A A0M;
    public final AnonymousClass4NA A0N;
    public final C16000sG A0O;
    public final C33481ie A0P;
    public final C17140ub A0Q;
    public final C16080sP A0R;
    public final C16440t3 A0S;
    public final C15860rz A0T;
    public final C15810rt A0U;
    public final C33501ig A0V;
    public final AnonymousClass11A A0W;
    public final C16460t6 A0X;
    public final C16070sO A0Y;
    public final C17240ul A0Z;
    public final AnonymousClass28S A0a;
    public final AnonymousClass18O A0b;
    public final AnonymousClass1VD A0c;
    public final AnonymousClass18R A0d;
    public final C17780vd A0e;
    public final C45882Bm A0f;
    public final C217415g A0g;
    public final AnonymousClass18T A0h;
    public final C217915l A0i;
    public final C16050sL A0j;
    public final C17190ug A0k;
    public final AnonymousClass124 A0l;
    public final AnonymousClass12B A0m;
    public final AnonymousClass2OJ A0n;
    public final AnonymousClass2OJ A0o;
    public final AnonymousClass2OJ A0p;
    public final AnonymousClass2OJ A0q;
    public final AnonymousClass2OJ A0r;
    public final AnonymousClass1WA A0s;
    public final C30801cy A0t;
    public final C30801cy A0u;
    public final C30801cy A0v;
    public final C30801cy A0w;
    public final C30801cy A0x;
    public final C30801cy A0y;
    public final C16320sq A0z;
    public final List A10;
    public final List A11;
    public final List A12;
    public final List A13;
    public final Set A14;

    public AnonymousClass2AS(C16300so r23, C50672aG r24, C14870pt r25, C16040sK r26, C17230uk r27, C49622Uk r28, AnonymousClass4NA r29, C16000sG r30, C17140ub r31, C16080sP r32, C16440t3 r33, C15860rz r34, C15810rt r35, AnonymousClass11A r36, C16460t6 r37, C16070sO r38, C17240ul r39, AnonymousClass18O r40, AnonymousClass18R r41, C17780vd r42, C217415g r43, AnonymousClass18T r44, C217915l r45, C16050sL r46, C17190ug r47, AnonymousClass124 r48, AnonymousClass12B r49, C16320sq r50) {
        AnonymousClass027 r0;
        Boolean bool = Boolean.FALSE;
        AnonymousClass2OJ r7 = new AnonymousClass2OJ(bool);
        this.A0p = r7;
        AnonymousClass2OJ r6 = new AnonymousClass2OJ(bool);
        this.A0q = r6;
        this.A0A = new AnonymousClass027();
        this.A0C = new AnonymousClass027();
        AnonymousClass026 r5 = new AnonymousClass026();
        this.A09 = r5;
        this.A0r = new AnonymousClass2OJ(new ArrayList());
        this.A0o = new AnonymousClass2OJ(new ArrayList());
        this.A0n = new AnonymousClass2OJ(0);
        this.A0y = new C30801cy();
        this.A0x = new C30801cy();
        this.A0v = new C30801cy();
        C30801cy r4 = new C30801cy(0);
        this.A0t = r4;
        this.A0w = new C30801cy(bool);
        this.A0u = new C30801cy(bool);
        this.A0E = new AnonymousClass027();
        AnonymousClass026 r3 = new AnonymousClass026();
        this.A08 = r3;
        this.A11 = new CopyOnWriteArrayList();
        this.A10 = new CopyOnWriteArrayList();
        this.A13 = new ArrayList();
        this.A12 = new ArrayList();
        this.A14 = new HashSet();
        this.A00 = -1;
        IDxCObserverShape68S0100000_2_I0 iDxCObserverShape68S0100000_2_I0 = new IDxCObserverShape68S0100000_2_I0(this, 8);
        this.A0P = iDxCObserverShape68S0100000_2_I0;
        IDxCListenerShape227S0100000_2_I0 iDxCListenerShape227S0100000_2_I0 = new IDxCListenerShape227S0100000_2_I0(this, 2);
        this.A0a = iDxCListenerShape227S0100000_2_I0;
        AnonymousClass32S r2 = new AnonymousClass32S(this);
        this.A0c = r2;
        IDxGObserverShape83S0100000_2_I0 iDxGObserverShape83S0100000_2_I0 = new IDxGObserverShape83S0100000_2_I0(this, 0);
        this.A0f = iDxGObserverShape83S0100000_2_I0;
        IDxCObserverShape72S0100000_2_I0 iDxCObserverShape72S0100000_2_I0 = new IDxCObserverShape72S0100000_2_I0(this, 5);
        this.A0V = iDxCObserverShape72S0100000_2_I0;
        this.A0K = new C1047756w();
        this.A0S = r33;
        this.A0H = r25;
        this.A0F = r23;
        this.A0I = r26;
        C16320sq r10 = r50;
        this.A0z = r10;
        C15810rt r20 = r35;
        this.A0U = r20;
        this.A0l = r48;
        this.A0k = r47;
        C16000sG r15 = r30;
        this.A0O = r15;
        this.A0R = r32;
        C17140ub r21 = r31;
        this.A0Q = r21;
        this.A0X = r37;
        this.A0Z = r39;
        this.A0e = r42;
        this.A0i = r45;
        this.A0m = r49;
        this.A0T = r34;
        this.A0J = r27;
        C49622Uk r9 = r28;
        this.A0L = r9;
        C217415g r16 = r43;
        this.A0g = r16;
        AnonymousClass11A r19 = r36;
        this.A0W = r19;
        AnonymousClass18O r18 = r40;
        this.A0b = r18;
        this.A0Y = r38;
        AnonymousClass18R r17 = r41;
        this.A0d = r17;
        this.A0N = r29;
        this.A0h = r44;
        this.A0G = r24;
        C16050sL r02 = r46;
        this.A0j = r02;
        C16010sH A082 = r15.A08(r02);
        this.A05 = A082;
        if (A082 != null) {
            r0 = new AnonymousClass027(A082);
        }
        this.A0D = r0;
        r16.A02(iDxGObserverShape83S0100000_2_I0);
        r21.A02(iDxCObserverShape68S0100000_2_I0);
        r19.A02(iDxCObserverShape72S0100000_2_I0);
        r18.A00.add(iDxCListenerShape227S0100000_2_I0);
        r17.A02(r2);
        StringBuilder sb = new StringBuilder("CommunitySubgroupsViewModel/init/Creating serialExecutor: ");
        sb.append(this);
        Log.i(sb.toString());
        this.A0s = new AnonymousClass1WA(r10, false);
        this.A0M = new AnonymousClass57A(r20);
        r5.A0D(r6, new IDxObserverShape115S0100000_2_I0((Object) this, 120));
        r5.A0D(r7, new IDxObserverShape115S0100000_2_I0((Object) this, 120));
        r5.A0D(r9.A09, new IDxObserverShape115S0100000_2_I0((Object) this, 120));
        r3.A0D(r9.A08, new IDxObserverShape115S0100000_2_I0((Object) r3, 119));
        r3.A0D(r4, new IDxObserverShape115S0100000_2_I0((Object) r3, 119));
    }

    public void A04() {
        this.A0g.A03(this.A0f);
        this.A0Q.A03(this.A0P);
        this.A0W.A03(this.A0V);
        AnonymousClass18O r0 = this.A0b;
        r0.A00.remove(this.A0a);
        this.A0d.A03(this.A0c);
    }

    public void A05() {
        this.A0w.A09(Boolean.TRUE);
        AnonymousClass4NA r8 = this.A0N;
        C16050sL r4 = this.A0j;
        RunnableRunnableShape5S0100000_I0_4 runnableRunnableShape5S0100000_I0_4 = new RunnableRunnableShape5S0100000_I0_4((Object) this, 39);
        IDxConsumerShape209S0100000_2_I0 iDxConsumerShape209S0100000_2_I0 = new IDxConsumerShape209S0100000_2_I0(this, 0);
        IDxConsumerShape209S0100000_2_I0 iDxConsumerShape209S0100000_2_I02 = new IDxConsumerShape209S0100000_2_I0(this, 1);
        IDxConsumerShape209S0100000_2_I0 iDxConsumerShape209S0100000_2_I03 = new IDxConsumerShape209S0100000_2_I0(this, 1);
        C17190ug r11 = r8.A04;
        String A022 = r11.A02();
        C83074Fg r9 = new C83074Fg(new AnonymousClass4J8(new C51812cK(A022)), new AnonymousClass53S(Collections.emptyList(), Collections.singletonList(new C83064Ff(new C83084Fh(r4)))));
        r11.A0A(new AnonymousClass51K(iDxConsumerShape209S0100000_2_I02, iDxConsumerShape209S0100000_2_I0, iDxConsumerShape209S0100000_2_I03, r8, r9, runnableRunnableShape5S0100000_I0_4), r9.A00, A022, 16, AnonymousClass1NO.A0L);
    }

    public void A06() {
        C50672aG r1 = this.A0G;
        int i2 = this.A00;
        this.A02 = new C101234ww(new IDxConsumerShape209S0100000_2_I0(this, 2), (AnonymousClass013) r1.A00.A03.AR8.get(), new RunnableRunnableShape5S0100000_I0_4((Object) this, 49), i2);
        AnonymousClass1WA r2 = this.A0s;
        r2.execute(new RunnableRunnableShape5S0100000_I0_4((Object) this, 44));
        if (this.A03.A01.A01) {
            StringBuilder sb = new StringBuilder("CommunitySubgroupsViewModel/updateActivitySeen: ");
            sb.append(this);
            Log.i(sb.toString());
            r2.execute(new RunnableRunnableShape5S0100000_I0_4((Object) this, 46));
        }
        r2.execute(new RunnableRunnableShape5S0100000_I0_4((Object) this, 45));
        r2.execute(new RunnableRunnableShape5S0100000_I0_4((Object) this, 42));
        r2.execute(new RunnableRunnableShape5S0100000_I0_4((Object) this, 40));
        C49622Uk r4 = this.A0L;
        r4.A0B.Acl(new RunnableRunnableShape4S0200000_I0_2(r4, 15, this.A0j));
        this.A0z.Acl(new RunnableRunnableShape5S0100000_I0_4((Object) this, 47));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c9, code lost:
        if (r4.isEmpty() == false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r11 = this;
            java.util.List r3 = r11.A11
            r3.clear()
            java.util.List r5 = r11.A13
            X.57A r0 = r11.A0M
            java.util.Collections.sort(r5, r0)
            X.0sL r6 = r11.A0j
            r8 = 1
            r11.A09(r6, r6, r8)
            X.0rz r0 = r11.A0T
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "dismissed_invite_member_row"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x003b
            X.0sO r0 = r11.A0Y
            boolean r0 = r0.A0E(r6)
            if (r0 == 0) goto L_0x003b
            X.15l r1 = r11.A0i
            X.0sH r0 = r11.A05
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x003b
            r0 = 2
            r11.A09(r6, r6, r0)
        L_0x003b:
            boolean r0 = r5.isEmpty()
            r2 = 3
            r7 = 0
            if (r0 != 0) goto L_0x0069
            r0 = 2131889957(0x7f120f25, float:1.9414592E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A09(r7, r0, r2)
            java.util.Iterator r9 = r5.iterator()
        L_0x0051:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r9.next()
            X.1sW r0 = (X.C39461sW) r0
            r4 = 4
            com.whatsapp.jid.GroupJid r1 = r0.A02
            X.2Wo r0 = new X.2Wo
            r0.<init>(r1)
            r11.A09(r1, r0, r4)
            goto L_0x0051
        L_0x0069:
            X.0sO r0 = r11.A0Y
            boolean r0 = r0.A0A(r6)
            r10 = 0
            if (r0 == 0) goto L_0x00c2
            X.15l r1 = r11.A0i
            X.0sH r0 = r11.A05
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x00c2
        L_0x007c:
            r0 = 2131889685(0x7f120e15, float:1.941404E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A09(r7, r0, r2)
            if (r8 == 0) goto L_0x0094
            r1 = 12
            r0 = 2131889620(0x7f120dd4, float:1.9413909E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.A09(r7, r0, r1)
        L_0x0094:
            java.util.List r4 = r11.A12
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0109
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r4.iterator()
        L_0x00a5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r2 = r8.next()
            X.1sW r2 = (X.C39461sW) r2
            java.util.Set r1 = r11.A14
            com.whatsapp.jid.GroupJid r0 = r2.A02
            boolean r1 = r1.contains(r0)
            X.4Kj r0 = new X.4Kj
            r0.<init>(r2, r6, r1)
            r9.add(r0)
            goto L_0x00a5
        L_0x00c2:
            r8 = 0
            java.util.List r4 = r11.A12
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0109
            goto L_0x007c
        L_0x00cc:
            int r1 = r11.A00
            int r0 = r9.size()
            int r8 = java.lang.Math.min(r1, r0)
            r0 = -1
            if (r8 != r0) goto L_0x00dd
            int r8 = r9.size()
        L_0x00dd:
            X.56w r0 = r11.A0K
            java.util.Collections.sort(r9, r0)
        L_0x00e2:
            if (r10 >= r8) goto L_0x00f5
            java.lang.Object r2 = r9.get(r10)
            X.4Kj r2 = (X.C84394Kj) r2
            r1 = 5
            X.1sW r0 = r2.A00
            com.whatsapp.jid.GroupJid r0 = r0.A02
            r11.A09(r0, r2, r1)
            int r10 = r10 + 1
            goto L_0x00e2
        L_0x00f5:
            int r0 = r9.size()
            if (r0 <= r8) goto L_0x0109
            r2 = 6
            int r1 = r9.size()
            int r1 = r1 - r8
            X.4EM r0 = new X.4EM
            r0.<init>(r1)
            r11.A09(r7, r0, r2)
        L_0x0109:
            r0 = 11
            r11.A09(r6, r6, r0)
            X.2OJ r2 = r11.A0n
            int r1 = r5.size()
            int r0 = r4.size()
            int r1 = r1 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A09(r0)
            X.2OJ r0 = r11.A0r
            r0.A09(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2AS.A07():void");
    }

    public final void A08(int i2) {
        C30801cy r1;
        this.A0w.A09(Boolean.FALSE);
        int i3 = 2;
        if (i2 == 0) {
            r1 = this.A0t;
        } else if (i2 == 1) {
            r1 = this.A0t;
            i3 = 3;
        } else if (i2 == 2) {
            r1 = this.A0t;
            i3 = 4;
        } else {
            return;
        }
        r1.A09(Integer.valueOf(i3));
    }

    public final void A09(C15830rv r3, Object obj, int i2) {
        if (this.A03.Agg(i2, obj) && this.A02.Agg(i2, obj)) {
            this.A11.add(new AnonymousClass4UJ(r3, obj, i2));
        }
    }

    public final void A0A(C16740tZ r4, long j2) {
        Set<C39461sW> A18;
        if (r4 instanceof C39451sV) {
            C39451sV r42 = (C39451sV) r4;
            if (r42.A00 == 88 && r42.A0I > j2) {
                A18 = r42.A03;
            } else {
                return;
            }
        } else if (r4 instanceof C40371u0) {
            C40381u1 r43 = (C40381u1) r4;
            if (r43.A0I > j2) {
                A18 = r43.A18();
            } else {
                return;
            }
        } else {
            return;
        }
        if (A18 != null) {
            for (C39461sW r0 : A18) {
                this.A14.add(r0.A02);
            }
        }
    }

    public void ASM() {
        this.A0s.execute(new RunnableRunnableShape5S0100000_I0_4((Object) this, 48));
    }
}
