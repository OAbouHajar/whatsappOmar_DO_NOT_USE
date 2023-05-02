package X;

import android.view.LayoutInflater;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.2Jq  reason: invalid class name and case insensitive filesystem */
public class C47602Jq extends C009904t implements C41801wg {
    public static final String[] A0K = {"recents", "starred", "id_all", "id_love", "id_haha", "id_sad", "id_angry", "id_reaction", "id_lifestyle"};
    public C59212v3 A00;
    public AnonymousClass5QT A01;
    public List A02 = new ArrayList();
    public boolean A03 = false;
    public boolean A04 = false;
    public final int A05;
    public final int A06;
    public final LayoutInflater A07;
    public final C14870pt A08;
    public final C14710pd A09;
    public final C88564ai A0A;
    public final AnonymousClass1MK A0B;
    public final AnonymousClass1MF A0C;
    public final AnonymousClass1CX A0D;
    public final AnonymousClass5QT A0E;
    public final C41791wf A0F;
    public final AnonymousClass3GM A0G;
    public final AnonymousClass35D A0H;
    public final AnonymousClass35C A0I;
    public final C16320sq A0J;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C47602Jq(android.app.Activity r28, android.view.ViewGroup r29, X.AnonymousClass071 r30, X.C14870pt r31, X.C16040sK r32, X.AnonymousClass013 r33, X.C14710pd r34, X.AnonymousClass1ML r35, X.C211613a r36, X.AnonymousClass1MK r37, X.C212613k r38, X.AnonymousClass1MF r39, X.AnonymousClass1CX r40, X.C41791wf r41, X.C16320sq r42) {
        /*
            r27 = this;
            r5 = 2131362136(0x7f0a0158, float:1.8344044E38)
            r9 = r27
            r13 = r29
            r26 = r28
            r3 = r30
            r15 = r33
            r0 = r9
            r1 = r26
            r2 = r13
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String[] r8 = A0K
            int r0 = r8.length
            r9.A05 = r0
            r7 = 0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.A02 = r0
            r9.A04 = r7
            r9.A03 = r7
            r6 = 2
            com.facebook.redex.IDxSListenerShape276S0100000_2_I0 r5 = new com.facebook.redex.IDxSListenerShape276S0100000_2_I0
            r5.<init>(r9, r6)
            r9.A0E = r5
            r14 = r34
            r9.A09 = r14
            r0 = r31
            r9.A08 = r0
            r0 = r42
            r9.A0J = r0
            r10 = r41
            r9.A0F = r10
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r26)
            r9.A07 = r4
            r11 = r40
            r9.A0D = r11
            r0 = r37
            r9.A0B = r0
            r12 = r39
            r9.A0C = r12
            X.4ai r0 = new X.4ai
            r0.<init>()
            r9.A0A = r0
            androidx.viewpager.widget.ViewPager r0 = r9.A0A
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131167155(0x7f0707b3, float:1.7948576E38)
            int r3 = r1.getDimensionPixelSize(r0)
            r9.A06 = r3
            android.content.Context r2 = r9.A07
            X.35D r0 = new X.35D
            r19 = r32
            r22 = r38
            r24 = r5
            r25 = r3
            r20 = r14
            r21 = r9
            r23 = r12
            r17 = r2
            r18 = r4
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r9.A0H = r0
            r1 = 1
            X.35C r0 = new X.35C
            r24 = 1
            r16 = r0
            r19 = r14
            r20 = r12
            r21 = r11
            r22 = r5
            r23 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r9.A0I = r0
            X.5S4[] r3 = new X.AnonymousClass5S4[r7]
            X.2v3 r0 = new X.2v3
            r0.<init>(r15, r3)
            r9.A00 = r0
            r9.A02(r0)
            X.3GM r4 = new X.3GM
            r4.<init>(r13)
            r9.A0G = r4
            X.5Se r3 = r9.A04
            if (r3 == 0) goto L_0x00b8
            r0 = 0
            r3.Adj(r0)
        L_0x00b8:
            r9.A04 = r4
            r4.Adj(r9)
            r0 = 2131362112(0x7f0a0140, float:1.8343995E38)
            android.view.View r4 = X.C004601z.A0E(r13, r0)
            com.whatsapp.util.ViewOnClickCListenerShape0S0400000_I0 r0 = new com.whatsapp.util.ViewOnClickCListenerShape0S0400000_I0
            r16 = 1
            r14 = r35
            r15 = r36
            r11 = r0
            r12 = r9
            r13 = r26
            r11.<init>(r12, r13, r14, r15, r16)
            r4.setOnClickListener(r0)
            r3 = 2131886394(0x7f12013a, float:1.9407366E38)
            java.lang.String r0 = r13.getString(r3)
            r4.setContentDescription(r0)
            X.14W r3 = r10.A0A
            X.1we r0 = r10.A09
            r3.A02(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r10 = 2131231197(0x7f0801dd, float:1.8078468E38)
            r0 = 2131886396(0x7f12013c, float:1.940737E38)
            java.lang.String r5 = r2.getString(r0)
            java.lang.String r3 = "1"
            X.3y2 r0 = new X.3y2
            r0.<init>(r3, r5, r7, r10)
            r4.add(r0)
            r7 = 2131232492(0x7f0806ec, float:1.8081095E38)
            r0 = 2131886395(0x7f12013b, float:1.9407368E38)
            java.lang.String r5 = r2.getString(r0)
            java.lang.String r3 = "2"
            X.3y2 r0 = new X.3y2
            r0.<init>(r3, r5, r1, r7)
            r4.add(r0)
            r0 = 2131886397(0x7f12013d, float:1.9407372E38)
            java.lang.String r3 = r2.getString(r0)
            java.lang.String r1 = "3"
            X.3y1 r0 = new X.3y1
            r0.<init>(r6, r1, r3)
            r4.add(r0)
            r0 = 2131886402(0x7f120142, float:1.9407382E38)
            java.lang.String r5 = r2.getString(r0)
            r3 = 3
            java.lang.String r1 = "4"
            X.3y1 r0 = new X.3y1
            r0.<init>(r3, r1, r5)
            r4.add(r0)
            r0 = 2131886400(0x7f120140, float:1.9407378E38)
            java.lang.String r5 = r2.getString(r0)
            r3 = 4
            java.lang.String r1 = "5"
            X.3y1 r0 = new X.3y1
            r0.<init>(r3, r1, r5)
            r4.add(r0)
            r0 = 2131886404(0x7f120144, float:1.9407386E38)
            java.lang.String r5 = r2.getString(r0)
            r3 = 5
            java.lang.String r1 = "6"
            X.3y1 r0 = new X.3y1
            r0.<init>(r3, r1, r5)
            r4.add(r0)
            r0 = 2131886398(0x7f12013e, float:1.9407374E38)
            java.lang.String r5 = r2.getString(r0)
            r3 = 6
            java.lang.String r1 = "7"
            X.3y1 r0 = new X.3y1
            r0.<init>(r3, r1, r5)
            r4.add(r0)
            r0 = 2131886403(0x7f120143, float:1.9407384E38)
            java.lang.String r5 = r2.getString(r0)
            r3 = 7
            java.lang.String r1 = "8"
            X.3y1 r0 = new X.3y1
            r0.<init>(r3, r1, r5)
            r4.add(r0)
            r0 = 2131886401(0x7f120141, float:1.940738E38)
            java.lang.String r5 = r2.getString(r0)
            r3 = 8
            java.lang.String r1 = "9"
            X.3y1 r0 = new X.3y1
            r0.<init>(r3, r1, r5)
            r4.add(r0)
            X.3GM r1 = r9.A0G
            java.util.ArrayList r0 = r1.A05
            r0.clear()
            r0.addAll(r4)
            X.2rC r3 = r1.A04
            java.util.List r1 = r3.A00
            X.3QS r0 = new X.3QS
            r0.<init>(r1, r4)
            X.07C r0 = X.AnonymousClass07B.A00(r0)
            r1.clear()
            r1.addAll(r4)
            r0.A02(r3)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            X.35D r0 = r9.A0H
            r10.add(r0)
            X.35C r0 = r9.A0I
            r10.add(r0)
            r11 = 2
        L_0x01c2:
            int r0 = r9.A05
            if (r11 >= r0) goto L_0x01ee
            r7 = r8[r11]
            X.0pd r6 = r9.A09
            android.view.LayoutInflater r5 = r9.A07
            X.1CX r4 = r9.A0D
            X.1MF r3 = r9.A0C
            X.5QT r1 = r9.A0E
            int r0 = r9.A06
            X.1pi r17 = r9.A04(r7)
            X.35B r12 = new X.35B
            r13 = r2
            r14 = r5
            r15 = r6
            r16 = r3
            r18 = r4
            r19 = r1
            r20 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r10.add(r12)
            int r11 = r11 + 1
            goto L_0x01c2
        L_0x01ee:
            r9.A02 = r10
            int r0 = r10.size()
            X.5S4[] r0 = new X.AnonymousClass5S4[r0]
            java.lang.Object[] r2 = r10.toArray(r0)
            X.5S4[] r2 = (X.AnonymousClass5S4[]) r2
            X.2v3 r0 = r9.A00
            if (r0 != 0) goto L_0x020d
            X.013 r1 = r9.A0B
            X.2v3 r0 = new X.2v3
            r0.<init>(r1, r2)
            r9.A00 = r0
            r9.A02(r0)
            return
        L_0x020d:
            r0.A0M(r2)
            r0.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47602Jq.<init>(android.app.Activity, android.view.ViewGroup, X.071, X.0pt, X.0sK, X.013, X.0pd, X.1ML, X.13a, X.1MK, X.13k, X.1MF, X.1CX, X.1wf, X.0sq):void");
    }

    public static final C37771pi A00(C37771pi r2, String str, String str2, List list) {
        C37761ph r1 = new C37761ph();
        r1.A0M = list;
        r1.A0D = str;
        r1.A0F = str2;
        r1.A0H = r2.A0J;
        r1.A0L = new LinkedList();
        r1.A0O = r2.A0O;
        r1.A0S = r2.A0R;
        r1.A0R = r2.A05;
        return new C37771pi(r1);
    }

    public static final List A01(int i2) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            C34151jm r1 = new C34151jm();
            r1.A0D = "loading-hash";
            arrayList.add(r1);
        }
        return arrayList;
    }

    public final C37771pi A04(String str) {
        C37761ph r1 = new C37761ph();
        r1.A0D = str;
        r1.A0F = "";
        r1.A0H = "";
        r1.A0M = A01(16);
        r1.A0L = new LinkedList();
        r1.A0S = false;
        r1.A0Q = true;
        r1.A0R = false;
        return new C37771pi(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r6.A0H.A00().A0C() != 0) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r6 = this;
            int r2 = r6.A00()
            java.lang.String r4 = "recents"
            if (r2 < 0) goto L_0x006f
            java.util.List r1 = r6.A02
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x006f
            java.lang.Object r0 = r1.get(r2)
            X.5S4 r0 = (X.AnonymousClass5S4) r0
            java.lang.String r3 = r0.getId()
            boolean r0 = r4.equals(r3)
            r5 = 1
            if (r0 == 0) goto L_0x002e
            X.35D r0 = r6.A0H
            X.2rF r0 = r0.A00()
            int r0 = r0.A0C()
            r2 = 1
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            java.lang.String r1 = "starred"
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x006d
            X.35C r0 = r6.A0I
            X.2rF r0 = r0.A00()
            int r0 = r0.A0C()
            if (r0 != 0) goto L_0x006d
        L_0x0044:
            if (r2 == 0) goto L_0x0057
            X.35C r0 = r6.A0I
            X.2rF r0 = r0.A00()
            int r0 = r0.A0C()
            if (r0 == 0) goto L_0x0057
            r4 = r1
        L_0x0053:
            r6.A06(r4)
            return
        L_0x0057:
            if (r5 == 0) goto L_0x0065
            X.35D r0 = r6.A0H
            X.2rF r0 = r0.A00()
            int r0 = r0.A0C()
            if (r0 != 0) goto L_0x0053
        L_0x0065:
            if (r2 != 0) goto L_0x0069
            if (r5 == 0) goto L_0x006b
        L_0x0069:
            java.lang.String r3 = "id_all"
        L_0x006b:
            r4 = r3
            goto L_0x0053
        L_0x006d:
            r5 = 0
            goto L_0x0044
        L_0x006f:
            java.lang.String r0 = "AvatarStickerPicker/getDesiredPageId/pagePos out of bounds, pages.size()="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.util.List r0 = r6.A02
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = ", index="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47602Jq.A05():void");
    }

    public void A06(String str) {
        List<AnonymousClass5S4> list = this.A02;
        for (AnonymousClass5S4 r1 : list) {
            if (str.equals(r1.getId())) {
                A01(list.indexOf(r1), true);
                return;
            }
        }
    }

    public void AQw(boolean z2, boolean z3) {
        this.A0I.A01();
        if (this.A04 && z2 && !z3) {
            A06("starred");
        }
    }

    public void AVr() {
        this.A0H.A01();
    }

    public void AXp(String str, HashMap hashMap, HashMap hashMap2, HashSet hashSet, List list, int i2) {
    }

    public void AXs(C37771pi r4) {
        if (r4.A0Q) {
            this.A0J.Aco(new RunnableRunnableShape11S0200000_I0_9(this, 0, r4));
        }
    }

    public void Aei(String str, HashMap hashMap, HashMap hashMap2, HashSet hashSet, List list) {
        String obj;
        if (list.size() == 0) {
            obj = "AvatarStickerPicker/setStickerPacks Avatar sticker pack is empty";
        } else {
            for (C37771pi r0 : hashMap.values()) {
                if (r0.A0Q) {
                    this.A03 = true;
                    for (int i2 = 2; i2 < this.A05; i2++) {
                        AnonymousClass35B r1 = (AnonymousClass35B) this.A02.get(i2);
                        r1.A05(A04(A0K[i2]));
                        r1.A01();
                    }
                    AnonymousClass35D r3 = this.A0H;
                    r3.A04((C34151jm) null);
                    AnonymousClass35C r2 = this.A0I;
                    r2.A04((C34151jm) null);
                    List list2 = r3.A06;
                    if (list2 != null && list2.size() > 0) {
                        r3.A05(A01(list2.size()));
                    }
                    List list3 = r2.A03;
                    if (list3 != null && list3.size() > 0) {
                        r2.A05(A01(list3.size()));
                    }
                    A05();
                    return;
                }
            }
            if (this.A03) {
                this.A03 = false;
                AnonymousClass35D r12 = this.A0H;
                List list4 = r12.A06;
                if (list4 == null ? r12.A00().A0C() != 0 : !list4.isEmpty()) {
                    r12.A06 = null;
                    r12.A01();
                }
                AnonymousClass35C r13 = this.A0I;
                List list5 = r13.A03;
                if (list5 == null ? r13.A00().A0C() != 0 : !list5.isEmpty()) {
                    r13.A03 = null;
                    r13.A01();
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C37771pi r32 = (C37771pi) it.next();
                if (r32.A0Q) {
                    if (str != null) {
                        A05();
                    }
                    this.A0J.Aco(new RunnableRunnableShape11S0200000_I0_9(this, 0, r32));
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("AvatarStickerPicker/setStickerPacks got ");
            sb.append(list.size());
            sb.append(" sticker packs, but no Avatar sticker pack");
            obj = sb.toString();
        }
        Log.e(obj);
    }
}
