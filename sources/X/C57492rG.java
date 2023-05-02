package X;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.2rG  reason: invalid class name and case insensitive filesystem */
public class C57492rG extends AnonymousClass01X {
    public ArrayList A00;
    public AnonymousClass3GL[] A01;
    public final /* synthetic */ AnonymousClass3GN A02;

    public C57492rG(AnonymousClass3GN r2, ArrayList arrayList, AnonymousClass3GL[] r4) {
        this.A02 = r2;
        this.A00 = arrayList;
        this.A01 = r4;
        A0B(true);
    }

    public void A07(C005602k r2) {
        if (r2 instanceof C65113Sx) {
            ((C65113Sx) r2).A07();
        }
    }

    public int A0C() {
        return this.A00.size();
    }

    public long A0D(int i2) {
        if (!this.A00) {
            return -1;
        }
        String str = ((C88634aq) this.A00.get(i2)).A01;
        AnonymousClass3GN r5 = this.A02;
        HashMap hashMap = r5.A0C;
        Number number = (Number) hashMap.get(str);
        if (number == null) {
            long j2 = r5.A03;
            r5.A03 = 1 + j2;
            number = Long.valueOf(j2);
            hashMap.put(str, number);
        }
        return number.longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01b0, code lost:
        if (r3 != 3) goto L_0x01b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ANf(X.C005602k r22, int r23) {
        /*
            r21 = this;
            r14 = r22
            r2 = r21
            r1 = r23
            int r0 = r2.getItemViewType(r1)
            if (r0 != 0) goto L_0x00bf
            X.3SM r14 = (X.AnonymousClass3SM) r14
            java.util.ArrayList r0 = r2.A00
            java.lang.Object r5 = r0.get(r1)
            X.4aq r5 = (X.C88634aq) r5
            X.3GN r0 = r2.A02
            int r0 = r0.A00
            boolean r6 = r5.A00(r0)
            android.view.View r3 = r14.A01
            if (r6 == 0) goto L_0x00bc
            android.content.Context r1 = r3.getContext()
            r0 = 2131101213(0x7f06061d, float:1.781483E38)
            int r0 = X.AnonymousClass00T.A00(r1, r0)
        L_0x002d:
            r3.setBackgroundColor(r0)
            X.3GL[] r1 = r2.A01
            int r0 = r5.A00
            r4 = r1[r0]
            android.widget.ImageView r3 = r14.A02
            boolean r0 = r4 instanceof X.AnonymousClass35B
            if (r0 == 0) goto L_0x0089
            r11 = r4
            X.35B r11 = (X.AnonymousClass35B) r11
            r0 = 0
            X.C018808t.A00(r0, r3)
            X.1pi r0 = r11.A04
            java.lang.String r0 = r0.A0F
            r3.setTag(r0)
            X.527 r10 = new X.527
            r10.<init>(r3, r11, r0)
            android.content.Context r9 = r11.A0A
            r8 = 2131891873(0x7f1216a1, float:1.9418478E38)
            java.lang.Object[] r7 = X.C13680ns.A1b()
            X.1pi r0 = r11.A04
            java.lang.String r1 = r0.A0H
            r0 = 0
            java.lang.String r0 = X.C13680ns.A0d(r9, r1, r7, r0, r8)
            r3.setContentDescription(r0)
            r3.setSelected(r6)
            X.1CX r1 = r11.A06
            X.1pi r0 = r11.A04
            r1.A0D(r0, r10)
        L_0x006e:
            boolean r0 = r4 instanceof X.AnonymousClass35B
            if (r0 == 0) goto L_0x0087
            X.35B r4 = (X.AnonymousClass35B) r4
            X.1pi r0 = r4.A04
            boolean r0 = r0.A07
        L_0x0078:
            android.view.View r1 = r14.A00
            int r0 = X.C13680ns.A02(r0)
            r1.setVisibility(r0)
            r0 = 16
            X.C13690nt.A1A(r3, r2, r5, r0)
        L_0x0086:
            return
        L_0x0087:
            r0 = 0
            goto L_0x0078
        L_0x0089:
            boolean r0 = r4 instanceof X.AnonymousClass35C
            if (r0 == 0) goto L_0x009c
            r0 = 2131232492(0x7f0806ec, float:1.8081095E38)
            X.C13680ns.A1D(r3, r0, r6)
            android.content.Context r1 = r4.A0A
            r0 = 2131891868(0x7f12169c, float:1.9418468E38)
        L_0x0098:
            X.C13680ns.A0t(r1, r3, r0)
            goto L_0x006e
        L_0x009c:
            boolean r0 = r4 instanceof X.AnonymousClass35D
            if (r0 == 0) goto L_0x00ac
            r0 = 2131231197(0x7f0801dd, float:1.8078468E38)
            X.C13680ns.A1D(r3, r0, r6)
            android.content.Context r1 = r4.A0A
            r0 = 2131891898(0x7f1216ba, float:1.941853E38)
            goto L_0x0098
        L_0x00ac:
            boolean r0 = r4 instanceof X.AnonymousClass35A
            if (r0 != 0) goto L_0x006e
            r0 = 2131232486(0x7f0806e6, float:1.8081083E38)
            X.C13680ns.A1D(r3, r0, r6)
            android.content.Context r1 = r4.A0A
            r0 = 2131891861(0x7f121695, float:1.9418454E38)
            goto L_0x0098
        L_0x00bc:
            r0 = 0
            goto L_0x002d
        L_0x00bf:
            X.3Sx r14 = (X.C65113Sx) r14
            java.util.ArrayList r0 = r2.A00
            java.lang.Object r13 = r0.get(r1)
            X.4aq r13 = (X.C88634aq) r13
            android.view.View r0 = r14.A02
            r20 = r0
            r1 = 14
            X.C13690nt.A1A(r0, r2, r13, r1)
            android.view.View r12 = r14.A03
            r0 = 13
            X.C13690nt.A1A(r12, r2, r13, r0)
            android.view.View r11 = r14.A04
            r0 = 15
            X.C13690nt.A1A(r11, r2, r13, r0)
            android.view.View r10 = r14.A05
            r0 = 12
            X.C13690nt.A1A(r10, r2, r13, r0)
            X.3GN r0 = r2.A02
            r19 = r0
            int r0 = r0.A00
            boolean r0 = r13.A00(r0)
            if (r0 == 0) goto L_0x01d5
            boolean r0 = r14.A00
            if (r0 == 0) goto L_0x0197
            X.07m r9 = new X.07m
            r9.<init>()
            r9.A06(r12)
            android.view.View r0 = r14.A01
            r18 = r0
            r9.A06(r0)
            r6 = 300(0x12c, double:1.48E-321)
            r9.A04(r6)
            X.0GD r8 = new X.0GD
            r8.<init>()
            X.0GU r1 = new X.0GU
            r1.<init>()
            X.013 r0 = r14.A08
            r17 = r0
            boolean r2 = X.C13680ns.A1Z(r17)
            r16 = 5
            r0 = 3
            if (r2 == 0) goto L_0x0123
            r0 = 5
        L_0x0123:
            r1.A0Z(r0)
            r4 = 400(0x190, double:1.976E-321)
            r1.A04(r4)
            X.0GT r15 = new X.0GT
            r15.<init>()
            r2 = 100
            r15.A02 = r2
            r15.A04(r4)
            r0 = r20
            r8.A0Z(r0)
            r8.A0a(r1)
            r8.A0a(r15)
            X.0GD r1 = new X.0GD
            r1.<init>()
            X.0GU r0 = new X.0GU
            r0.<init>()
            boolean r15 = X.C13680ns.A1Z(r17)
            if (r15 == 0) goto L_0x0154
            r16 = 3
        L_0x0154:
            r15 = r16
            r0.A0Z(r15)
            r0.A04(r4)
            r0.A02 = r2
            X.0GT r4 = new X.0GT
            r4.<init>()
            r2 = 200(0xc8, double:9.9E-322)
            r4.A02 = r2
            r4.A04(r6)
            r1.A0Z(r10)
            r1.A0Z(r11)
            r1.A0a(r0)
            r1.A0a(r4)
            android.view.View r0 = r14.A0H
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C015807o.A02(r0, r9)
            android.view.ViewGroup r0 = r14.A07
            X.C015807o.A02(r0, r1)
            android.view.ViewGroup r0 = r14.A06
            X.C015807o.A02(r0, r8)
            r1 = 2131232496(0x7f0806f0, float:1.8081103E38)
            r0 = r18
            r0.setBackgroundResource(r1)
            r1 = 0
            r0 = r20
            X.C13690nt.A14(r11, r10, r0, r1)
            r14.A00 = r1
        L_0x0197:
            r0 = r19
            int r3 = r0.A00
            int r1 = r13.A00
            if (r3 < r1) goto L_0x01b2
            int r0 = r1 + 4
            if (r3 >= r0) goto L_0x01b2
            int r3 = r3 - r1
            r0 = 1
            r2 = 1
            if (r3 == 0) goto L_0x01b3
            r2 = 2
            if (r3 == r0) goto L_0x01b3
            if (r3 == r2) goto L_0x01d3
            r0 = 3
            r2 = 8
            if (r3 == r0) goto L_0x01b3
        L_0x01b2:
            r2 = 0
        L_0x01b3:
            r1 = 0
            r0 = r20
            r0.setSelected(r1)
            r11.setSelected(r1)
            r12.setSelected(r1)
            r10.setSelected(r1)
            r1 = 1
            if (r2 == r1) goto L_0x01e1
            r0 = 2
            if (r2 == r0) goto L_0x01dd
            r0 = 4
            if (r2 == r0) goto L_0x01d9
            r0 = 8
            if (r2 != r0) goto L_0x0086
            r10.setSelected(r1)
            return
        L_0x01d3:
            r2 = 4
            goto L_0x01b3
        L_0x01d5:
            r14.A07()
            goto L_0x0197
        L_0x01d9:
            r11.setSelected(r1)
            return
        L_0x01dd:
            r12.setSelected(r1)
            return
        L_0x01e1:
            r0.setSelected(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57492rG.ANf(X.02k, int):void");
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        AnonymousClass3GN r0 = this.A02;
        return i2 == 1 ? new C65113Sx(r0.A07, viewGroup, r0.A0B) : new AnonymousClass3SM(r0.A07, viewGroup);
    }

    public int getItemViewType(int i2) {
        return this.A00.get(i2) instanceof C78413y0 ? 1 : 0;
    }
}
