package X;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.2rJ  reason: invalid class name and case insensitive filesystem */
public class C57522rJ extends AnonymousClass01X {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public C31201dg A03;
    public List A04;
    public final Handler A05;
    public final C14990q7 A06;
    public final AnonymousClass4CH A07;

    public C57522rJ() {
        this.A04 = AnonymousClass000.A0u();
        this.A07 = null;
        A0B(true);
    }

    public C57522rJ(C14990q7 r4, C31201dg r5, int i2) {
        AnonymousClass4CH r2 = new AnonymousClass4CH(i2);
        r4.A01.get(R.id.bk_context_key_rendercore_extensions_creator);
        this.A04 = AnonymousClass000.A0u();
        this.A07 = r2;
        A0B(true);
        this.A06 = r4;
        this.A03 = r5;
        this.A05 = new C63763Lk(Looper.getMainLooper(), this);
    }

    public /* bridge */ /* synthetic */ void A05(C005602k r4) {
        C14930q1 A0H;
        C31201dg A0G = ((C83364Gj) ((C64833Rv) r4).A00).A01.A0G(132);
        if (A0G != null && A0G.A01 == 13366 && (A0H = A0G.A0H(38)) != null) {
            C90154da.A00();
            Handler handler = this.A05;
            handler.sendMessage(handler.obtainMessage(0, A0H));
        }
    }

    public /* bridge */ /* synthetic */ void A06(C005602k r4) {
        C14930q1 A0H;
        C31201dg A0G = ((C83364Gj) ((C64833Rv) r4).A00).A01.A0G(132);
        if (A0G != null && A0G.A01 == 13366 && (A0H = A0G.A0H(40)) != null) {
            C90154da.A00();
            Handler handler = this.A05;
            handler.sendMessage(handler.obtainMessage(0, A0H));
        }
    }

    public /* bridge */ /* synthetic */ void A07(C005602k r3) {
        C64833Rv r32 = (C64833Rv) r3;
        ((C108205Nb) r32.A0H).setRenderTree((AnonymousClass3AI) null);
        r32.A00 = null;
    }

    public void A09(RecyclerView recyclerView) {
        this.A02 = recyclerView;
    }

    public void A0A(RecyclerView recyclerView) {
        this.A02 = null;
    }

    public int A0C() {
        return this.A04.size();
    }

    public long A0D(int i2) {
        return (long) ((C83364Gj) this.A04.get(i2)).A01.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        if (r4 != null) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void ANf(X.C005602k r13, int r14) {
        /*
            r12 = this;
            X.3Rv r13 = (X.C64833Rv) r13
            X.4CH r4 = r12.A07
            int r1 = r12.A01
            r0 = -1
            if (r1 == r0) goto L_0x009b
            java.util.List r0 = r12.A04
            java.lang.Object r0 = r0.get(r14)
            X.4Gj r0 = (X.C83364Gj) r0
            X.1dg r3 = r0.A01
            int r8 = r12.A01
            int r2 = r12.A00
            int r7 = r4.A00
            r1 = -1
            r0 = -2
            r6 = 1
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            if (r7 != r6) goto L_0x004c
            r4.<init>(r1, r0)
        L_0x0023:
            r0 = 132(0x84, float:1.85E-43)
            X.1dg r0 = r3.A0G(r0)
            if (r0 == 0) goto L_0x00a6
            r0 = 132(0x84, float:1.85E-43)
            X.1dg r0 = r3.A0G(r0)
            int r1 = r0.A01
            r0 = 13366(0x3436, float:1.873E-41)
            if (r1 != r0) goto L_0x00a6
            r0 = 132(0x84, float:1.85E-43)
            X.1dg r5 = r3.A0G(r0)
            r0 = 41
            java.lang.String r9 = r5.A0J(r0)
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.String r3 = "CollectionBinderUtils"
            if (r7 != 0) goto L_0x0075
            if (r9 == 0) goto L_0x0075
            goto L_0x0050
        L_0x004c:
            r4.<init>(r0, r1)
            goto L_0x0023
        L_0x0050:
            X.4at r1 = X.C62163Bx.A0B(r9)     // Catch:{ 40K -> 0x006c }
            X.41V r0 = r1.A01     // Catch:{ 40K -> 0x006c }
            int r0 = r0.ordinal()     // Catch:{ 40K -> 0x006c }
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x005e;
                default: goto L_0x005d;
            }     // Catch:{ 40K -> 0x006c }
        L_0x005d:
            goto L_0x0075
        L_0x005e:
            float r1 = r1.A00     // Catch:{ 40K -> 0x006c }
            float r0 = (float) r8     // Catch:{ 40K -> 0x006c }
            float r1 = r1 * r0
            double r0 = (double) r1     // Catch:{ 40K -> 0x006c }
            double r0 = r0 / r10
            int r8 = (int) r0     // Catch:{ 40K -> 0x006c }
            goto L_0x0069
        L_0x0066:
            float r0 = r1.A00     // Catch:{ 40K -> 0x006c }
            int r8 = (int) r0     // Catch:{ 40K -> 0x006c }
        L_0x0069:
            r4.width = r8     // Catch:{ 40K -> 0x006c }
            goto L_0x0075
        L_0x006c:
            java.lang.String r0 = "Error parsing style width: "
            java.lang.String r0 = X.C13680ns.A0h(r0, r9)
            X.C29691b2.A00(r3, r0)
        L_0x0075:
            r0 = 35
            java.lang.String r5 = r5.A0J(r0)
            if (r7 != r6) goto L_0x00a6
            if (r5 == 0) goto L_0x00a6
            X.4at r1 = X.C62163Bx.A0B(r5)     // Catch:{ 40K -> 0x009d }
            X.41V r0 = r1.A01     // Catch:{ 40K -> 0x009d }
            int r0 = r0.ordinal()     // Catch:{ 40K -> 0x009d }
            switch(r0) {
                case 0: goto L_0x0095;
                case 1: goto L_0x008d;
                default: goto L_0x008c;
            }     // Catch:{ 40K -> 0x009d }
        L_0x008c:
            goto L_0x00a6
        L_0x008d:
            float r1 = r1.A00     // Catch:{ 40K -> 0x009d }
            float r0 = (float) r2     // Catch:{ 40K -> 0x009d }
            float r1 = r1 * r0
            double r0 = (double) r1     // Catch:{ 40K -> 0x009d }
            double r0 = r0 / r10
            int r2 = (int) r0     // Catch:{ 40K -> 0x009d }
            goto L_0x0098
        L_0x0095:
            float r0 = r1.A00     // Catch:{ 40K -> 0x009d }
            int r2 = (int) r0     // Catch:{ 40K -> 0x009d }
        L_0x0098:
            r4.height = r2     // Catch:{ 40K -> 0x009d }
            goto L_0x00a6
        L_0x009b:
            r4 = 0
            goto L_0x00ab
        L_0x009d:
            java.lang.String r0 = "Error parsing style height: "
            java.lang.String r0 = X.C13680ns.A0h(r0, r5)
            X.C29691b2.A00(r3, r0)
        L_0x00a6:
            android.view.View r0 = r13.A0H
            r0.setLayoutParams(r4)
        L_0x00ab:
            boolean r0 = r13.A01
            if (r0 == 0) goto L_0x00e3
            if (r4 != 0) goto L_0x00e5
            android.view.View r1 = r13.A0H
            androidx.recyclerview.widget.RecyclerView r0 = r12.A02
            X.02W r0 = r0.getLayoutManager()
            X.0Bp r0 = r0.A0h()
            r1.setLayoutParams(r0)
        L_0x00c0:
            r0 = 0
        L_0x00c1:
            r13.A01 = r0
            java.util.List r0 = r12.A04
            java.lang.Object r0 = r0.get(r14)
            X.4Gj r0 = (X.C83364Gj) r0
            android.view.View r1 = r13.A0H
            X.5Nb r1 = (X.C108205Nb) r1
            X.38o r0 = r0.A00
            X.4dK r0 = r0.A00()
            X.3AI r0 = r0.A02
            r1.setRenderTree(r0)
            java.util.List r0 = r12.A04
            java.lang.Object r0 = r0.get(r14)
            r13.A00 = r0
            return
        L_0x00e3:
            if (r4 == 0) goto L_0x00c0
        L_0x00e5:
            r0 = 1
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57522rJ.ANf(X.02k, int):void");
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new C64833Rv(new C57842s0(viewGroup.getContext()));
    }
}
