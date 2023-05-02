package X;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.redex.IDxSListenerShape277S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.33c  reason: invalid class name */
public class AnonymousClass33c extends C009904t implements C41801wg {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public C59212v3 A05;
    public AnonymousClass5QT A06;
    public AnonymousClass359 A07;
    public AnonymousClass35A A08;
    public AnonymousClass35A A09;
    public AnonymousClass35A A0A;
    public AnonymousClass35A A0B;
    public AnonymousClass35D A0C;
    public AnonymousClass35C A0D;
    public AnonymousClass3GL A0E;
    public String A0F;
    public HashMap A0G;
    public List A0H;
    public List A0I;
    public boolean A0J = false;
    public boolean A0K = false;
    public final int A0L;
    public final LayoutInflater A0M;
    public final ViewTreeObserver.OnGlobalLayoutListener A0N = new AnonymousClass3D5(this);
    public final C16300so A0O;
    public final C16040sK A0P;
    public final AnonymousClass01V A0Q;
    public final C15860rz A0R;
    public final C14710pd A0S;
    public final C16490t9 A0T;
    public final AnonymousClass3H7 A0U;
    public final C212613k A0V;
    public final AnonymousClass18G A0W;
    public final AnonymousClass1MF A0X;
    public final AnonymousClass14W A0Y;
    public final C88554ah A0Z;
    public final AnonymousClass1CX A0a;
    public final AnonymousClass5QT A0b = new IDxSListenerShape277S0100000_2_I1(this, 1);
    public final AnonymousClass1M9 A0c;
    public final C26161Mo A0d;
    public final AnonymousClass3GN A0e;
    public final C41791wf A0f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass33c(android.app.Activity r18, android.view.ViewGroup r19, X.AnonymousClass071 r20, X.C16300so r21, X.C16040sK r22, X.AnonymousClass01V r23, X.C15860rz r24, X.AnonymousClass013 r25, X.C14710pd r26, X.C16490t9 r27, X.AnonymousClass3H7 r28, X.C212613k r29, X.AnonymousClass18G r30, X.AnonymousClass1MF r31, X.AnonymousClass14W r32, X.AnonymousClass1CX r33, X.AnonymousClass1M9 r34, X.C26161Mo r35, X.C41791wf r36, X.C16320sq r37, boolean r38) {
        /*
            r17 = this;
            r11 = r36
            r6 = r18
            r10 = 2131366414(0x7f0a120e, float:1.835272E38)
            r5 = r17
            r9 = r25
            r8 = r20
            r7 = r19
            r5.<init>(r6, r7, r8, r9, r10)
            r1 = 0
            r5.A0K = r1
            r5.A0J = r1
            r2 = 1
            com.facebook.redex.IDxSListenerShape277S0100000_2_I1 r0 = new com.facebook.redex.IDxSListenerShape277S0100000_2_I1
            r0.<init>(r5, r2)
            r5.A0b = r0
            X.3D5 r0 = new X.3D5
            r0.<init>(r5)
            r5.A0N = r0
            r0 = r26
            r5.A0S = r0
            r0 = r21
            r5.A0O = r0
            r0 = r22
            r5.A0P = r0
            r0 = r27
            r5.A0T = r0
            r0 = r23
            r5.A0Q = r0
            r14 = r32
            r5.A0Y = r14
            r15 = r33
            r5.A0a = r15
            r12 = r24
            r5.A0R = r12
            r0 = r30
            r5.A0W = r0
            r0 = r31
            r5.A0X = r0
            r0 = r28
            r5.A0U = r0
            r13 = r29
            r5.A0V = r13
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r6)
            r5.A0M = r0
            r0 = r38
            r5.A0J = r0
            X.4ah r0 = new X.4ah
            r0.<init>()
            r5.A0Z = r0
            if (r36 != 0) goto L_0x0070
            X.1wf r11 = new X.1wf
            r16 = r37
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0070:
            r5.A0f = r11
            r3 = r35
            r5.A0d = r3
            r0 = r34
            r5.A0c = r0
            X.0sK r0 = r5.A0P
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0113
            X.0pd r4 = r5.A0S
            r2 = 1396(0x574, float:1.956E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r4.A0E(r0, r2)
            if (r0 == 0) goto L_0x0113
            r0 = 2131366475(0x7f0a124b, float:1.8352845E38)
            X.C13690nt.A11(r7, r0)
            r0 = 2131366474(0x7f0a124a, float:1.8352843E38)
            X.C13690nt.A13(r7, r0, r1)
            r0 = 2131366473(0x7f0a1249, float:1.835284E38)
            android.view.View r0 = r7.findViewById(r0)
            r5.A03 = r0
            r0 = 2131366472(0x7f0a1248, float:1.8352839E38)
        L_0x00a6:
            android.view.View r0 = r7.findViewById(r0)
            r5.A04 = r0
            androidx.viewpager.widget.ViewPager r0 = r5.A0A
            android.content.res.Resources r2 = X.C13680ns.A0D(r0)
            r0 = 2131167155(0x7f0707b3, float:1.7948576E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r5.A0L = r0
            android.content.res.Resources r2 = r6.getResources()
            r0 = 2131167152(0x7f0707b0, float:1.794857E38)
            int r2 = r2.getDimensionPixelSize(r0)
            int r0 = r7.getWidth()
            r5.A01 = r0
            int r0 = r7.getHeight()
            int r0 = r0 - r2
            r5.A00 = r0
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r5.A0I = r0
            java.util.HashMap r0 = X.AnonymousClass000.A0x()
            r5.A0G = r0
            X.3GL[] r1 = new X.AnonymousClass3GL[r1]
            X.2v3 r0 = new X.2v3
            r0.<init>(r9, r1)
            r5.A05 = r0
            r5.A02(r0)
            android.content.Context r0 = r5.A07
            X.3GN r2 = new X.3GN
            r2.<init>(r0, r7, r9)
            r5.A0e = r2
            if (r35 == 0) goto L_0x00ff
            X.027 r1 = r3.A03
            X.00o r6 = (X.C001300o) r6
            r0 = 32
            X.C13690nt.A1J(r6, r1, r5, r0)
        L_0x00ff:
            android.view.View r1 = r5.A03
            r0 = 7
            X.C34331k5.A02(r1, r5, r0)
            X.5Se r1 = r5.A04
            if (r1 == 0) goto L_0x010d
            r0 = 0
            r1.Adj(r0)
        L_0x010d:
            r5.A04 = r2
            r2.Adj(r5)
            return
        L_0x0113:
            r0 = 2131366474(0x7f0a124a, float:1.8352843E38)
            X.C13690nt.A11(r7, r0)
            r0 = 2131366475(0x7f0a124b, float:1.8352845E38)
            X.C13690nt.A13(r7, r0, r1)
            r0 = 2131366429(0x7f0a121d, float:1.8352751E38)
            android.view.View r0 = r7.findViewById(r0)
            r5.A03 = r0
            r0 = 2131366428(0x7f0a121c, float:1.835275E38)
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33c.<init>(android.app.Activity, android.view.ViewGroup, X.071, X.0so, X.0sK, X.01V, X.0rz, X.013, X.0pd, X.0t9, X.3H7, X.13k, X.18G, X.1MF, X.14W, X.1CX, X.1M9, X.1Mo, X.1wf, X.0sq, boolean):void");
    }

    public static AnonymousClass35A A00(AnonymousClass33c r7, int i2) {
        return new AnonymousClass35A(r7.A07, r7.A0M, r7.A0S, r7.A0X, r7.A0b, i2, r7.A0L);
    }

    public static final AnonymousClass3GL A01(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3GL r1 = (AnonymousClass3GL) it.next();
            if (str.equals(r1.getId())) {
                return r1;
            }
        }
        return null;
    }

    public void A03(int i2) {
        AnonymousClass35C r1;
        AnonymousClass35D r12;
        AnonymousClass3GL r5 = (AnonymousClass3GL) this.A0I.get(i2);
        r5.A07 = true;
        C57482rF r13 = r5.A06;
        if (r13 != null) {
            r13.A04 = true;
            r13.A00 = 2;
            r13.A01();
        }
        AnonymousClass3GL r14 = this.A0E;
        if (!(r14 == null || r14 == r5)) {
            r14.A07 = false;
            C57482rF r15 = r14.A06;
            if (r15 != null) {
                r15.A04 = false;
                r15.A00 = 1;
                r15.A01();
            }
        }
        this.A0E = r5;
        if (r5 instanceof AnonymousClass35B) {
            C37771pi r4 = ((AnonymousClass35B) r5).A04;
            r4.A07 = false;
            AnonymousClass1CX r3 = this.A0a;
            r3.A0Y.Acl(new RunnableRunnableShape10S0200000_I0_8(r3, 41, r4));
        }
        if (!(r5.getId().equals("recents") || (r12 = this.A0C) == null || r12.A04 == null)) {
            r12.A01();
        }
        if (!r5.getId().equals("starred") && (r1 = this.A0D) != null && r1.A04 != null) {
            r1.A01();
        }
    }

    public void A04() {
        if (this.A04.getVisibility() == 0) {
            C15860rz r8 = this.A0R;
            long A082 = C13680ns.A08(C13680ns.A0B(r8), "sticker_store_update_hidden_time");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - A082 >= 604800000) {
                C13680ns.A0x(r8.A0K(), "sticker_store_update_hidden_time", currentTimeMillis);
            }
        }
        Iterator A002 = C16590tJ.A00(this.A0Y);
        while (A002.hasNext()) {
            ((C41781we) A002.next()).A01();
        }
        Context context = this.A07;
        Intent A092 = C13680ns.A09();
        A092.setClassName(context.getPackageName(), "com.whatsapp.stickers.store.StickerStoreActivity");
        context.startActivity(A092);
        this.A0T.A06(new AnonymousClass3q9());
    }

    public void A05() {
        AnonymousClass3H7 r3 = this.A0U;
        if (r3 != null) {
            AnonymousClass35D r0 = this.A0C;
            List list = null;
            List list2 = r0 != null ? r0.A06 : null;
            AnonymousClass35C r02 = this.A0D;
            if (r02 != null) {
                list = r02.A03;
            }
            r3.A03(this.A0f.A00(list2, list));
        }
    }

    public final void A06() {
        AnonymousClass3GL[] r1 = (AnonymousClass3GL[]) this.A0I.toArray(new AnonymousClass3GL[0]);
        this.A0e.A00(r1);
        C59212v3 r0 = this.A05;
        if (r0 != null) {
            r0.A0M(r1);
            r0.A06();
            this.A05.A06();
        }
    }

    public void AQw(boolean z2, boolean z3) {
        AnonymousClass35C r0 = this.A0D;
        if (r0 != null) {
            r0.A01();
            if (this.A0K && z2 && !z3) {
                this.A0F = "starred";
                AnonymousClass3GL A012 = A01("starred", this.A0I);
                if (A012 != null) {
                    A01(this.A0I.indexOf(A012), true);
                    this.A0F = null;
                }
            }
        }
    }

    public void AVr() {
        AnonymousClass35D r0 = this.A0C;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void AXp(String str, HashMap hashMap, HashMap hashMap2, HashSet hashSet, List list, int i2) {
        if (!this.A0G.containsKey(str)) {
            Aei((String) null, hashMap, hashMap2, hashSet, list);
            return;
        }
        AnonymousClass35B r0 = (AnonymousClass35B) this.A0G.get(str);
        r0.A00 = i2;
        r0.A04();
    }

    public void AXs(C37771pi r3) {
        AnonymousClass35B r0 = (AnonymousClass35B) this.A0G.get(r3.A0F);
        if (r0 != null) {
            r0.A05(r3);
            r0.A01();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r19v4, types: [X.35B] */
    /* JADX WARNING: type inference failed for: r19v5, types: [X.358] */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03f4, code lost:
        if (r9 == false) goto L_0x03f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0469, code lost:
        if (r30 != null) goto L_0x046b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x042e A[LOOP:10: B:174:0x0428->B:176:0x042e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0499  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Aei(java.lang.String r30, java.util.HashMap r31, java.util.HashMap r32, java.util.HashSet r33, java.util.List r34) {
        /*
            r29 = this;
            r0 = r29
            java.util.List r1 = r0.A0H
            boolean r18 = X.AnonymousClass000.A1V(r1)
            r15 = r34
            r0.A0H = r15
            java.util.Iterator r3 = r15.iterator()
        L_0x0010:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x009e
            java.lang.Object r2 = r3.next()
            X.1pi r2 = (X.C37771pi) r2
            boolean r1 = r2.A01()
            if (r1 == 0) goto L_0x0010
            boolean r1 = r2.A0Q
            if (r1 != 0) goto L_0x0010
            r1 = 1
        L_0x0027:
            r6 = 8
            if (r1 == 0) goto L_0x009b
            X.0rz r1 = r0.A0R
            android.content.SharedPreferences r2 = X.C13680ns.A0B(r1)
            java.lang.String r1 = "sticker_store_update_hidden_time"
            long r1 = X.C13680ns.A08(r2, r1)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            r2 = 604800000(0x240c8400, double:2.988109026E-315)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r2 = X.C13700nu.A0f(r1)
            android.view.View r1 = r0.A04
            if (r2 == 0) goto L_0x004b
            r6 = 0
        L_0x004b:
            r1.setVisibility(r6)
            int r17 = r15.size()
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            java.util.ArrayList r8 = X.AnonymousClass000.A0u()
            java.util.Iterator r9 = r15.iterator()
        L_0x006a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r6 = r9.next()
            X.1pi r6 = (X.C37771pi) r6
            boolean r1 = r6.A0Q
            if (r1 != 0) goto L_0x006a
            java.util.List r1 = r6.A04
            java.util.Iterator r7 = r1.iterator()
        L_0x0080:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x006a
            java.lang.Object r6 = r7.next()
            X.1jm r6 = (X.C34151jm) r6
            X.1XO r1 = r6.A04
            if (r1 == 0) goto L_0x0080
            X.1pj[] r1 = r1.A09
            if (r1 == 0) goto L_0x0080
            int r1 = r1.length
            if (r1 <= 0) goto L_0x0080
            r8.add(r6)
            goto L_0x0080
        L_0x009b:
            android.view.View r1 = r0.A04
            goto L_0x004b
        L_0x009e:
            r1 = 0
            goto L_0x0027
        L_0x00a0:
            int r1 = r8.size()
            r16 = 1
            if (r1 <= 0) goto L_0x010a
            r16 = 0
            java.util.Iterator r14 = r8.iterator()
        L_0x00ae:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00fc
            java.lang.Object r7 = r14.next()
            X.1jm r7 = (X.C34151jm) r7
            X.4ah r11 = r0.A0Z
            X.1XO r1 = r7.A04
            r10 = 0
            if (r1 == 0) goto L_0x00ae
            X.1pj[] r9 = r1.A09
            if (r9 == 0) goto L_0x00ae
            int r8 = r9.length
            r13 = 0
        L_0x00c7:
            if (r10 >= r8) goto L_0x00df
            r12 = r9[r10]
            java.util.HashMap r6 = r11.A00
            boolean r1 = r6.containsKey(r12)
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r1 = r6.get(r12)
            int r1 = X.AnonymousClass000.A0D(r1)
            r13 = r13 | r1
        L_0x00dc:
            int r10 = r10 + 1
            goto L_0x00c7
        L_0x00df:
            r1 = r13 & 1
            if (r1 == 0) goto L_0x00e6
            r5.add(r7)
        L_0x00e6:
            r1 = r13 & 8
            if (r1 == 0) goto L_0x00ed
            r4.add(r7)
        L_0x00ed:
            r1 = r13 & 4
            if (r1 == 0) goto L_0x00f4
            r2.add(r7)
        L_0x00f4:
            r1 = r13 & 2
            if (r1 == 0) goto L_0x00ae
            r3.add(r7)
            goto L_0x00ae
        L_0x00fc:
            r1 = 27
            X.C13690nt.A1P(r5, r1)
            X.C13690nt.A1P(r4, r1)
            X.C13690nt.A1P(r2, r1)
            X.C13690nt.A1P(r3, r1)
        L_0x010a:
            java.util.ArrayList r1 = X.C13690nt.A0i(r17)
            X.1M9 r6 = r0.A0c
            if (r6 == 0) goto L_0x014f
            boolean r6 = r6.A00
            if (r6 == 0) goto L_0x014f
            X.1Mo r13 = r0.A0d
            if (r13 == 0) goto L_0x014f
            X.027 r7 = r13.A03
            java.lang.Object r6 = r7.A01()
            if (r6 == 0) goto L_0x014f
            java.util.List r6 = X.C13690nt.A0k(r7)
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x014f
            X.359 r7 = r0.A07
            if (r7 != 0) goto L_0x0143
            X.0pd r10 = r0.A0S
            android.content.Context r8 = r0.A07
            android.view.LayoutInflater r9 = r0.A0M
            X.1MF r11 = r0.A0X
            X.5QT r12 = r0.A0b
            int r14 = r0.A0L
            X.359 r7 = new X.359
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0.A07 = r7
        L_0x0143:
            androidx.recyclerview.widget.RecyclerView r6 = r7.A04
            if (r6 == 0) goto L_0x014a
            r7.A01()
        L_0x014a:
            X.359 r6 = r0.A07
            r1.add(r6)
        L_0x014f:
            X.35D r14 = r0.A0C
            if (r14 != 0) goto L_0x017e
            X.0pd r13 = r0.A0S
            android.content.Context r12 = r0.A07
            X.0sK r11 = r0.A0P
            android.view.LayoutInflater r10 = r0.A0M
            X.13k r9 = r0.A0V
            X.1MF r8 = r0.A0X
            X.5QT r7 = r0.A0b
            int r6 = r0.A0L
            X.35D r14 = new X.35D
            r19 = r14
            r20 = r12
            r21 = r10
            r22 = r11
            r23 = r13
            r24 = r0
            r25 = r9
            r26 = r8
            r27 = r7
            r28 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0.A0C = r14
        L_0x017e:
            int r6 = r15.size()
            boolean r6 = X.AnonymousClass000.A1Q(r6)
            r14.A07 = r6
            X.35D r6 = r0.A0C
            r1.add(r6)
            X.35C r6 = r0.A0D
            if (r6 != 0) goto L_0x01a7
            X.0pd r9 = r0.A0S
            android.content.Context r7 = r0.A07
            X.1CX r11 = r0.A0a
            android.view.LayoutInflater r8 = r0.A0M
            X.1MF r10 = r0.A0X
            X.5QT r12 = r0.A0b
            int r13 = r0.A0L
            r14 = 0
            X.35C r6 = new X.35C
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.A0D = r6
        L_0x01a7:
            r1.add(r6)
            if (r16 != 0) goto L_0x0211
            X.35A r6 = r0.A08
            if (r6 != 0) goto L_0x01b7
            r6 = 1
            X.35A r6 = A00(r0, r6)
            r0.A08 = r6
        L_0x01b7:
            r6.A01 = r5
            X.2rF r6 = r6.A00()
            r6.A0E(r5)
            X.35A r5 = r0.A08
            r1.add(r5)
            X.35A r5 = r0.A09
            if (r5 != 0) goto L_0x01d0
            r5 = 2
            X.35A r5 = A00(r0, r5)
            r0.A09 = r5
        L_0x01d0:
            r5.A01 = r3
            X.2rF r5 = r5.A00()
            r5.A0E(r3)
            X.35A r3 = r0.A09
            r1.add(r3)
            X.35A r3 = r0.A0A
            if (r3 != 0) goto L_0x01e9
            r3 = 4
            X.35A r3 = A00(r0, r3)
            r0.A0A = r3
        L_0x01e9:
            r3.A01 = r2
            X.2rF r3 = r3.A00()
            r3.A0E(r2)
            X.35A r2 = r0.A0A
            r1.add(r2)
            X.35A r2 = r0.A0B
            if (r2 != 0) goto L_0x0203
            r2 = 8
            X.35A r2 = A00(r0, r2)
            r0.A0B = r2
        L_0x0203:
            r2.A01 = r4
            X.2rF r2 = r2.A00()
            r2.A0E(r4)
            X.35A r2 = r0.A0B
            r1.add(r2)
        L_0x0211:
            int r2 = r15.size()
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>(r2)
            java.util.Iterator r3 = r15.iterator()
        L_0x021e:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0230
            java.lang.Object r2 = r3.next()
            X.1pi r2 = (X.C37771pi) r2
            java.lang.String r2 = r2.A0F
            r13.add(r2)
            goto L_0x021e
        L_0x0230:
            java.util.HashMap r12 = X.AnonymousClass000.A0x()
            r11 = 0
        L_0x0235:
            int r2 = r15.size()
            if (r11 >= r2) goto L_0x02bb
            java.lang.Object r10 = r15.get(r11)
            X.1pi r10 = (X.C37771pi) r10
            java.util.HashMap r3 = r0.A0G
            java.lang.String r2 = r10.A0F
            java.lang.Object r9 = r3.get(r2)
            X.35B r9 = (X.AnonymousClass35B) r9
            boolean r2 = r10.A0Q
            if (r2 != 0) goto L_0x0289
            r14 = r33
            if (r9 != 0) goto L_0x02a4
            boolean r9 = r10.A0R
            X.0pd r8 = r0.A0S
            android.content.Context r7 = r0.A07
            android.view.LayoutInflater r6 = r0.A0M
            X.1CX r5 = r0.A0a
            X.1MF r4 = r0.A0X
            X.5QT r3 = r0.A0b
            int r2 = r0.A0L
            if (r9 == 0) goto L_0x028c
            X.358 r9 = new X.358
            r19 = r9
            r20 = r7
            r21 = r6
            r22 = r8
            r23 = r4
            r24 = r10
            r25 = r5
            r26 = r3
            r27 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r2 = r10.A0F
            boolean r2 = r14.contains(r2)
            r9.A02 = r2
        L_0x0284:
            java.lang.String r2 = r10.A0F
            r12.put(r2, r9)
        L_0x0289:
            int r11 = r11 + 1
            goto L_0x0235
        L_0x028c:
            X.35B r9 = new X.35B
            r19 = r9
            r20 = r7
            r21 = r6
            r22 = r8
            r23 = r4
            r24 = r10
            r25 = r5
            r26 = r3
            r27 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0284
        L_0x02a4:
            r9.A05(r10)
            boolean r2 = r10.A0R
            if (r2 == 0) goto L_0x0284
            boolean r2 = r9 instanceof X.AnonymousClass358
            if (r2 == 0) goto L_0x0284
            r3 = r9
            X.358 r3 = (X.AnonymousClass358) r3
            java.lang.String r2 = r10.A0F
            boolean r2 = r14.contains(r2)
            r3.A02 = r2
            goto L_0x0284
        L_0x02bb:
            r14 = r32
            java.util.Set r2 = r14.keySet()
            java.util.Iterator r16 = r2.iterator()
        L_0x02c5:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x0344
            java.lang.String r11 = X.AnonymousClass000.A0m(r16)
            r2 = r31
            java.lang.Object r10 = r2.get(r11)
            X.1pi r10 = (X.C37771pi) r10
            if (r10 != 0) goto L_0x02fe
            X.1ph r3 = new X.1ph
            r3.<init>()
            r3.A0D = r11
            java.lang.String r2 = ""
            r3.A0F = r2
            r3.A0H = r2
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r3.A0M = r2
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r3.A0L = r2
            r2 = 1
            r3.A0S = r2
            r3.A0R = r2
            X.1pi r10 = new X.1pi
            r10.<init>(r3)
        L_0x02fe:
            boolean r2 = r12.containsKey(r11)
            if (r2 == 0) goto L_0x031b
            java.lang.Object r9 = r12.get(r11)
            X.35B r9 = (X.AnonymousClass35B) r9
            r9.A05(r10)
        L_0x030d:
            java.lang.Object r2 = r14.get(r11)
            int r2 = X.AnonymousClass000.A0D(r2)
            r9.A00 = r2
            r9.A04()
            goto L_0x02c5
        L_0x031b:
            X.0pd r8 = r0.A0S
            android.content.Context r7 = r0.A07
            android.view.LayoutInflater r6 = r0.A0M
            X.1CX r5 = r0.A0a
            X.1MF r4 = r0.A0X
            X.5QT r3 = r0.A0b
            int r2 = r0.A0L
            X.35B r9 = new X.35B
            r27 = r2
            r19 = r9
            r20 = r7
            r21 = r6
            r22 = r8
            r23 = r4
            r24 = r10
            r25 = r5
            r26 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r12.put(r11, r9)
            goto L_0x030d
        L_0x0344:
            java.util.Set r2 = r14.keySet()
            java.util.Iterator r4 = r2.iterator()
        L_0x034c:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0364
            java.lang.Object r3 = r4.next()
            boolean r2 = r13.contains(r3)
            if (r2 != 0) goto L_0x034c
            java.lang.Object r2 = r12.get(r3)
            r1.add(r2)
            goto L_0x034c
        L_0x0364:
            java.util.Iterator r5 = r15.iterator()
        L_0x0368:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0389
            java.lang.Object r4 = r5.next()
            X.1pi r4 = (X.C37771pi) r4
            java.lang.String r2 = r4.A0F
            java.lang.Object r3 = r12.get(r2)
            X.3GL r3 = (X.AnonymousClass3GL) r3
            if (r3 == 0) goto L_0x0368
            boolean r2 = r4.A0Q
            if (r2 != 0) goto L_0x0368
            r3.A01()
            r1.add(r3)
            goto L_0x0368
        L_0x0389:
            r0.A0G = r12
            int r3 = r0.A00()
            if (r3 >= 0) goto L_0x03a6
            java.util.Locale r4 = java.util.Locale.US
            java.lang.Object[] r3 = X.C13680ns.A1b()
            java.util.List r2 = r0.A0I
            int r2 = r2.size()
            X.AnonymousClass000.A1K(r3, r2)
            java.lang.String r2 = "StickerPicker/setStickerPacks/getCurrentPageIndex < 0, stickerPages.size(): %d"
            X.C13700nu.A0Z(r2, r4, r3)
            r3 = 0
        L_0x03a6:
            java.lang.String r11 = r0.A0F
            r6 = 0
            if (r11 != 0) goto L_0x0406
            java.util.List r2 = r0.A0I
            int r2 = r2.size()
            if (r2 > 0) goto L_0x03b5
            if (r30 != 0) goto L_0x046b
        L_0x03b5:
            java.util.List r2 = r0.A0I
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x044e
            java.util.List r2 = r0.A0I
            java.lang.Object r2 = r2.get(r3)
        L_0x03c3:
            X.3GL r2 = (X.AnonymousClass3GL) r2
            java.lang.String r8 = r2.getId()
            X.35D r2 = r0.A0C
            r10 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0449
            X.2rF r2 = r2.A00()
            int r2 = r2.A0C()
        L_0x03d7:
            boolean r9 = X.AnonymousClass000.A1P(r2)
            X.35C r2 = r0.A0D
            if (r2 == 0) goto L_0x0444
            X.2rF r2 = r2.A00()
            int r2 = r2.A0C()
        L_0x03e7:
            boolean r5 = X.AnonymousClass000.A1P(r2)
            java.lang.String r4 = "recents"
            boolean r2 = r4.equals(r8)
            if (r2 == 0) goto L_0x03f6
            r3 = 1
            if (r9 != 0) goto L_0x03f7
        L_0x03f6:
            r3 = 0
        L_0x03f7:
            java.lang.String r11 = "starred"
            boolean r2 = r11.equals(r8)
            if (r2 == 0) goto L_0x0442
            if (r5 == 0) goto L_0x0442
        L_0x0402:
            if (r3 == 0) goto L_0x043c
            if (r5 != 0) goto L_0x043c
        L_0x0406:
            X.3GL r2 = A01(r11, r1)
            if (r2 == 0) goto L_0x0470
            int r4 = r1.indexOf(r2)
            r0.A0F = r6
        L_0x0412:
            r0.A0I = r1
            r2 = 0
            X.3GL[] r2 = new X.AnonymousClass3GL[r2]
            java.lang.Object[] r6 = r1.toArray(r2)
            X.3GL[] r6 = (X.AnonymousClass3GL[]) r6
            X.3GN r1 = r0.A0e
            r1.A00(r6)
            java.util.List r1 = r0.A0I
            java.util.Iterator r5 = r1.iterator()
        L_0x0428:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0472
            java.lang.Object r3 = r5.next()
            X.3GL r3 = (X.AnonymousClass3GL) r3
            int r2 = r0.A01
            int r1 = r0.A00
            r3.A02(r2, r1)
            goto L_0x0428
        L_0x043c:
            if (r10 == 0) goto L_0x0455
            if (r9 != 0) goto L_0x0455
            r11 = r4
            goto L_0x0406
        L_0x0442:
            r10 = 0
            goto L_0x0402
        L_0x0444:
            X.1wf r2 = r0.A0f
            boolean r2 = r2.A06
            goto L_0x03e7
        L_0x0449:
            X.1wf r2 = r0.A0f
            boolean r2 = r2.A05
            goto L_0x03d7
        L_0x044e:
            r2 = 0
            java.lang.Object r2 = r1.get(r2)
            goto L_0x03c3
        L_0x0455:
            if (r3 != 0) goto L_0x0459
            if (r10 == 0) goto L_0x046e
        L_0x0459:
            int r2 = r15.size()
            if (r2 <= 0) goto L_0x046e
            java.lang.Object r2 = r15.get(r7)
            X.1pi r2 = (X.C37771pi) r2
            java.lang.String r11 = r2.A0F
        L_0x0467:
            if (r11 != 0) goto L_0x0406
            if (r30 == 0) goto L_0x0470
        L_0x046b:
            r11 = r30
            goto L_0x0406
        L_0x046e:
            r11 = r8
            goto L_0x0467
        L_0x0470:
            r4 = 0
            goto L_0x0412
        L_0x0472:
            r2 = r6[r4]
            r1 = 1
            r2.A07 = r1
            X.2rF r2 = r2.A06
            if (r2 == 0) goto L_0x0483
            r2.A04 = r1
            r1 = 2
            r2.A00 = r1
            r2.A01()
        L_0x0483:
            X.2v3 r1 = r0.A05
            if (r1 != 0) goto L_0x0499
            X.013 r2 = r0.A0B
            X.2v3 r1 = new X.2v3
            r1.<init>(r2, r6)
            r0.A05 = r1
            r0.A02(r1)
        L_0x0493:
            r1 = r18
            r0.A01(r4, r1)
            return
        L_0x0499:
            r1.A0M(r6)
            r1.A06()
            goto L_0x0493
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33c.Aei(java.lang.String, java.util.HashMap, java.util.HashMap, java.util.HashSet, java.util.List):void");
    }
}
