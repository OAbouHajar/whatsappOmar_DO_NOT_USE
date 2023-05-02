package X;

import android.app.Application;
import android.os.Handler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2qa  reason: invalid class name and case insensitive filesystem */
public class C57262qa extends AnonymousClass02H implements C108645Ou {
    public int A00;
    public AnonymousClass4DJ A01 = new AnonymousClass4DJ(this);
    public Runnable A02;
    public final Handler A03;
    public final AnonymousClass026 A04;
    public final C016407u A05;
    public final C14870pt A06;
    public final C25501Ka A07;
    public final C18150wE A08;
    public final C84774Lv A09;
    public final C613438n A0A;
    public final C14710pd A0B;
    public final C30801cy A0C;
    public final LinkedList A0D;

    public C57262qa(Application application, C016407u r5, C14870pt r6, C25501Ka r7, C18150wE r8, C84774Lv r9, C613438n r10, C14710pd r11, int i2) {
        super(application);
        AnonymousClass026 r2 = new AnonymousClass026();
        this.A04 = r2;
        this.A0B = r11;
        this.A06 = r6;
        this.A05 = r5;
        this.A08 = r8;
        this.A0A = r10;
        this.A03 = new Handler();
        this.A0D = new LinkedList();
        this.A0C = C30801cy.A01();
        this.A07 = r7;
        this.A09 = r9;
        C13700nu.A0U(r9.A00, r2, this, 5);
        r8.A02 = this;
        r8.A01 = r9;
        if (!this.A0B.A0E(C16620tM.A02, 2806)) {
            i2 = 2;
        } else {
            Map map = this.A05.A03;
            if (map.containsKey("arg_home_view_state")) {
                i2 = AnonymousClass000.A0D(map.get("arg_home_view_state"));
            }
        }
        this.A00 = i2;
        A05();
    }

    public void A04() {
        C18150wE r1 = this.A08;
        r1.A02 = null;
        r1.A01 = null;
        r1.A00();
    }

    public final void A05() {
        LinkedList linkedList = new LinkedList();
        if (C13690nt.A1S(Boolean.TRUE, this.A0B.A0E(C16620tM.A02, 2270))) {
            ArrayList A0u = AnonymousClass000.A0u();
            A0u.add(new C71763l0());
            A07(A0u);
            C18150wE r1 = this.A08;
            r1.A00();
            C18130wC r2 = r1.A04;
            C25551Kf r9 = r1.A06.A00;
            C62863Ff r8 = new C62863Ff(r1);
            C16150sX r0 = r2.A00.A01;
            C16300so A002 = C16150sX.A00(r0);
            C16320sq A1B = C16150sX.A1B(r0);
            AnonymousClass013 A0Z = C16150sX.A0Z(r0);
            AnonymousClass33I r22 = new AnonymousClass33I(A002, C16150sX.A07(r0), C16150sX.A0V(r0), C16150sX.A0W(r0), A0Z, r8, r9, (C25631Kn) r0.A5m.get(), A1B);
            r22.A04();
            r1.A03 = r22;
            return;
        }
        C25501Ka r23 = this.A07;
        C75883ss r12 = new C75883ss();
        r12.A01 = C13680ns.A0Y();
        r23.A01(r12);
        linkedList.add(new C71743ky());
        linkedList.add(new C71753kz());
        this.A04.A09(linkedList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r3 = r7.A07;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(java.lang.String r8) {
        /*
            r7 = this;
            java.util.LinkedList r5 = r7.A0D
            monitor-enter(r5)
            java.lang.String r6 = r8.trim()     // Catch:{ all -> 0x0077 }
            boolean r4 = r6.isEmpty()     // Catch:{ all -> 0x0077 }
            if (r4 != 0) goto L_0x001a
            X.1Ka r3 = r7.A07     // Catch:{ all -> 0x0077 }
            java.lang.Integer r0 = r3.A00     // Catch:{ all -> 0x0077 }
            r2 = 3
            if (r0 == 0) goto L_0x001e
            int r0 = r0.intValue()     // Catch:{ all -> 0x0077 }
            if (r0 != r2) goto L_0x001e
        L_0x001a:
            r5.add(r6)     // Catch:{ all -> 0x0077 }
            goto L_0x002d
        L_0x001e:
            X.3ss r1 = new X.3ss     // Catch:{ all -> 0x0077 }
            r1.<init>()     // Catch:{ all -> 0x0077 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0077 }
            r1.A01 = r0     // Catch:{ all -> 0x0077 }
            r3.A01(r1)     // Catch:{ all -> 0x0077 }
            goto L_0x001a
        L_0x002d:
            if (r4 == 0) goto L_0x003f
            r5.clear()     // Catch:{ all -> 0x003d }
            android.os.Handler r1 = r7.A03     // Catch:{ all -> 0x003d }
            java.lang.Runnable r0 = r7.A02     // Catch:{ all -> 0x003d }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x003d }
            r7.A05()     // Catch:{ all -> 0x003d }
            goto L_0x0075
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x003f:
            int r1 = r6.length()     // Catch:{ all -> 0x0077 }
            r0 = 2
            if (r1 < r0) goto L_0x0075
            android.os.Handler r4 = r7.A03     // Catch:{ all -> 0x0077 }
            java.lang.Runnable r0 = r7.A02     // Catch:{ all -> 0x0077 }
            r2 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r0, r2)     // Catch:{ all -> 0x0077 }
            java.lang.Runnable r0 = r7.A02     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0056
            r4.removeCallbacks(r0)     // Catch:{ all -> 0x0077 }
        L_0x0056:
            r1 = 3
            com.facebook.redex.RunnableRunnableShape1S1100000_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S1100000_I1     // Catch:{ all -> 0x0077 }
            r0.<init>(r1, r6, r7)     // Catch:{ all -> 0x0077 }
            r7.A02 = r0     // Catch:{ all -> 0x0077 }
            r4.postDelayed(r0, r2)     // Catch:{ all -> 0x0077 }
            X.026 r3 = r7.A04     // Catch:{ all -> 0x0077 }
            r0 = 1
            X.4Sg[] r2 = new X.C86344Sg[r0]     // Catch:{ all -> 0x0077 }
            X.3l0 r1 = new X.3l0     // Catch:{ all -> 0x0077 }
            r1.<init>()     // Catch:{ all -> 0x0077 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0077 }
            java.util.ArrayList r0 = X.AnonymousClass3Bv.newArrayList((java.lang.Object[]) r2)     // Catch:{ all -> 0x0077 }
            r3.A09(r0)     // Catch:{ all -> 0x0077 }
        L_0x0075:
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            return
        L_0x0077:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0077 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57262qa.A06(java.lang.String):void");
    }

    public final void A07(List list) {
        if (this.A00 == 1 && this.A0B.A0E(C16620tM.A02, 2806)) {
            list.add(0, new C71833l7(this.A01));
        }
        this.A04.A09(list);
    }

    public void AWZ(C71823l6 r2) {
        if (r2 instanceof C71813l5) {
            A06(((C71813l5) r2).A00);
        } else if (r2 instanceof C71803l4) {
            A05();
        }
    }
}
