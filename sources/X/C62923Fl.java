package X;

import com.facebook.redex.IDxRCallbackShape41S0300000_2_I1;
import com.facebook.redex.RunnableRunnableShape0S1101000_I0;
import com.facebook.redex.RunnableRunnableShape0S1300000_I0;
import com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Fl  reason: invalid class name and case insensitive filesystem */
public class C62923Fl implements C16710tV {
    public C85444Ol A00;
    public Set A01 = C13680ns.A0o();
    public final int A02;
    public final int A03;
    public final AnonymousClass26B A04;
    public final String A05;
    public volatile int A06 = 0;
    public final /* synthetic */ AnonymousClass2Z2 A07;

    public C62923Fl(AnonymousClass26B r12, AnonymousClass2Z2 r13, String str, int i2, int i3) {
        this.A07 = r13;
        this.A05 = str;
        this.A03 = i2;
        this.A04 = r12;
        this.A02 = i3;
        this.A00 = new C85444Ol(new C87124Vm((List) null, (List) null), (Double) null, (String) null, (String) null, (String) null, AnonymousClass000.A0u(), AnonymousClass000.A0u(), AnonymousClass000.A0u(), AnonymousClass000.A0u(), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a7, code lost:
        if (r1.isEmpty() == false) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(boolean r21) {
        /*
            r20 = this;
            r1 = r20
            X.2Z2 r0 = r1.A07
            com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r15 = r0.A0D
            if (r15 == 0) goto L_0x0194
            java.lang.String r6 = r1.A05
            X.4Ol r5 = r1.A00
            java.util.List r2 = r5.A07
            int r0 = r2.size()
            r1 = 3
            int r0 = java.lang.Math.min(r0, r1)
            r4 = 0
            java.util.List r18 = r2.subList(r4, r0)
            java.util.List r2 = r5.A09
            int r0 = r2.size()
            int r0 = java.lang.Math.min(r0, r1)
            java.util.List r9 = r2.subList(r4, r0)
            java.util.List r3 = r5.A06
            int r0 = r3.size()
            r8 = 1
            int r0 = java.lang.Math.min(r0, r8)
            java.util.List r1 = r3.subList(r4, r0)
            X.4Vm r7 = r5.A01
            r13 = r21 ^ 1
            int r2 = r2.size()
            int r0 = r3.size()
            int r2 = r2 + r0
            r0 = 3
            boolean r12 = X.C13700nu.A0g(r2, r0)
            int r0 = r3.size()
            boolean r11 = X.C13700nu.A0g(r0, r8)
            java.util.LinkedList r2 = r15.A0e
            monitor-enter(r2)
            android.os.Handler r3 = r15.A0C     // Catch:{ all -> 0x0191 }
            java.lang.Runnable r0 = r15.A06     // Catch:{ all -> 0x0191 }
            r3.removeCallbacks(r0)     // Catch:{ all -> 0x0191 }
            boolean r0 = r2.contains(r6)     // Catch:{ all -> 0x0191 }
            if (r0 != 0) goto L_0x0066
        L_0x0063:
            monitor-exit(r2)     // Catch:{ all -> 0x0191 }
            goto L_0x0190
        L_0x0066:
            java.lang.Object r0 = r2.peek()     // Catch:{ all -> 0x0191 }
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0191 }
            if (r0 != 0) goto L_0x0074
            r2.poll()     // Catch:{ all -> 0x0191 }
            goto L_0x0066
        L_0x0074:
            if (r13 != 0) goto L_0x00a9
            java.lang.Object r5 = r2.poll()     // Catch:{ all -> 0x0191 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0191 }
            java.util.LinkedList r3 = r15.A08     // Catch:{ all -> 0x0191 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0191 }
            if (r0 != 0) goto L_0x0093
            java.lang.Object r0 = r3.peekLast()     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0191 }
            boolean r0 = r5.startsWith(r0)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0093
            r3.removeLast()     // Catch:{ all -> 0x0191 }
        L_0x0093:
            r3.add(r5)     // Catch:{ all -> 0x0191 }
            boolean r0 = r18.isEmpty()     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x00a9
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x0191 }
            r0 = 0
            if (r3 != 0) goto L_0x00aa
        L_0x00a9:
            r0 = 1
        L_0x00aa:
            java.util.List r3 = r15.A09()     // Catch:{ all -> 0x0191 }
            if (r0 != 0) goto L_0x00da
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0191 }
            if (r0 != 0) goto L_0x00da
            int r0 = r15.A01     // Catch:{ all -> 0x0191 }
            int r0 = r0 + 1
            r15.A01 = r0     // Catch:{ all -> 0x0191 }
            r5 = 2131886546(0x7f1201d2, float:1.9407674E38)
            X.26B r4 = r15.A06()     // Catch:{ all -> 0x0191 }
            X.1DU r1 = r15.A0f     // Catch:{ all -> 0x0191 }
            X.3lk r0 = new X.3lk     // Catch:{ all -> 0x0191 }
            r0.<init>(r4, r1, r5)     // Catch:{ all -> 0x0191 }
            r3.add(r0)     // Catch:{ all -> 0x0191 }
            java.util.List r0 = r15.A0A(r7, r6)     // Catch:{ all -> 0x0191 }
            r3.addAll(r0)     // Catch:{ all -> 0x0191 }
        L_0x00d4:
            X.026 r0 = r15.A0G     // Catch:{ all -> 0x0191 }
            r0.A09(r3)     // Catch:{ all -> 0x0191 }
            goto L_0x0063
        L_0x00da:
            int r0 = r15.A02     // Catch:{ all -> 0x0191 }
            int r0 = r0 + 1
            r15.A02 = r0     // Catch:{ all -> 0x0191 }
            boolean r0 = r18.isEmpty()     // Catch:{ all -> 0x0191 }
            if (r0 != 0) goto L_0x0115
            int r19 = r9.size()     // Catch:{ all -> 0x0191 }
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0191 }
            java.util.Iterator r10 = r18.iterator()     // Catch:{ all -> 0x0191 }
        L_0x00f2:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x0112
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x0191 }
            X.1dn r0 = (X.C31241dn) r0     // Catch:{ all -> 0x0191 }
            java.lang.String r5 = r0.A01     // Catch:{ all -> 0x0191 }
            X.35i r14 = new X.35i     // Catch:{ all -> 0x0191 }
            r17 = r6
            r16 = r0
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0191 }
            X.3lW r0 = new X.3lW     // Catch:{ all -> 0x0191 }
            r0.<init>(r14, r5, r6)     // Catch:{ all -> 0x0191 }
            r7.add(r0)     // Catch:{ all -> 0x0191 }
            goto L_0x00f2
        L_0x0112:
            r3.addAll(r7)     // Catch:{ all -> 0x0191 }
        L_0x0115:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0191 }
            r7 = 2
            if (r0 != 0) goto L_0x0148
            X.3lh r0 = new X.3lh     // Catch:{ all -> 0x0191 }
            r0.<init>(r7)     // Catch:{ all -> 0x0191 }
            r3.add(r0)     // Catch:{ all -> 0x0191 }
            int r0 = r18.size()     // Catch:{ all -> 0x0191 }
            java.util.List r0 = r15.A0B(r6, r1, r0, r4)     // Catch:{ all -> 0x0191 }
            r3.addAll(r0)     // Catch:{ all -> 0x0191 }
            if (r11 == 0) goto L_0x0148
            X.3lD r0 = new X.3lD     // Catch:{ all -> 0x0191 }
            r0.<init>()     // Catch:{ all -> 0x0191 }
            r3.add(r0)     // Catch:{ all -> 0x0191 }
            r0 = 11
            com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1 r1 = new com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1     // Catch:{ all -> 0x0191 }
            r1.<init>(r15, r0)     // Catch:{ all -> 0x0191 }
            X.3lN r0 = new X.3lN     // Catch:{ all -> 0x0191 }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0191 }
            r3.add(r0)     // Catch:{ all -> 0x0191 }
        L_0x0148:
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x0191 }
            if (r0 != 0) goto L_0x017c
            r5 = 2131886546(0x7f1201d2, float:1.9407674E38)
            X.26B r4 = r15.A06()     // Catch:{ all -> 0x0191 }
            X.1DU r1 = r15.A0f     // Catch:{ all -> 0x0191 }
            X.3lk r0 = new X.3lk     // Catch:{ all -> 0x0191 }
            r0.<init>(r4, r1, r5)     // Catch:{ all -> 0x0191 }
            r3.add(r0)     // Catch:{ all -> 0x0191 }
            int r0 = r18.size()     // Catch:{ all -> 0x0191 }
            java.util.List r0 = r15.A0B(r6, r9, r0, r8)     // Catch:{ all -> 0x0191 }
            r3.addAll(r0)     // Catch:{ all -> 0x0191 }
            if (r12 == 0) goto L_0x00d4
            r0 = 3
            com.facebook.redex.ViewOnClickCListenerShape2S1100000_I0 r1 = new com.facebook.redex.ViewOnClickCListenerShape2S1100000_I0     // Catch:{ all -> 0x0191 }
            r1.<init>(r0, r6, r15)     // Catch:{ all -> 0x0191 }
            X.3lN r0 = new X.3lN     // Catch:{ all -> 0x0191 }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0191 }
            r3.add(r0)     // Catch:{ all -> 0x0191 }
            goto L_0x00d4
        L_0x017c:
            if (r13 != 0) goto L_0x0186
            int r0 = r15.A03     // Catch:{ all -> 0x0191 }
            int r0 = r0 + 1
            r15.A03 = r0     // Catch:{ all -> 0x0191 }
            goto L_0x00d4
        L_0x0186:
            X.2jC r0 = new X.2jC     // Catch:{ all -> 0x0191 }
            r0.<init>(r8)     // Catch:{ all -> 0x0191 }
            r3.add(r0)     // Catch:{ all -> 0x0191 }
            goto L_0x00d4
        L_0x0190:
            return
        L_0x0191:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0191 }
            throw r0
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62923Fl.A00(boolean):void");
    }

    public final boolean A01() {
        Set set;
        int i2;
        int i3 = this.A02;
        if (i3 != 1) {
            set = this.A01;
            if (i3 != 2) {
                return C13690nt.A1V(set, 2) && C13690nt.A1V(set, 4);
            }
            i2 = 4;
        } else {
            set = this.A01;
            i2 = 2;
        }
        return set.contains(i2);
    }

    public void AQR(int i2) {
        synchronized (this) {
            AnonymousClass2Z2 r1 = this.A07;
            if (r1.A0D != null) {
                this.A06 = i2;
                BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = r1.A0D;
                businessDirectoryContextualSearchViewModel.A0K.A0K(new RunnableRunnableShape0S1101000_I0(businessDirectoryContextualSearchViewModel, this.A05, i2, 1));
            }
        }
    }

    public /* bridge */ /* synthetic */ void AYB(Object obj) {
        Set set;
        C85444Ol r3;
        int i2;
        C85444Ol r4 = (C85444Ol) obj;
        AnonymousClass2Z2 r6 = this.A07;
        if (r6.A0D != null) {
            synchronized (this) {
                if (this.A06 != 0) {
                    this.A01.add(Integer.valueOf(r4.A00));
                    AQR(this.A06);
                } else {
                    int i3 = r4.A00;
                    if (i3 == 1) {
                        this.A01.add(Integer.valueOf(i3));
                        C85444Ol r2 = this.A00;
                        r2.A07 = r4.A07;
                        C87124Vm r1 = r4.A01;
                        if (r1 != null) {
                            r2.A01 = r1;
                        }
                        A00(A01());
                    } else if (i3 != 2) {
                        if (i3 == 3) {
                            set = this.A01;
                            set.add(Integer.valueOf(i3));
                            List list = r4.A09;
                            C61853Aq.A02(this.A04, list);
                            r3 = this.A00;
                            r3.A09.addAll(list);
                            r3.A08 = r4.A08;
                            r3.A03 = r4.A03;
                            r3.A05 = r4.A05;
                            r3.A02 = r4.A02;
                            r3.A04 = r4.A04;
                            r3.A01 = r4.A01;
                        } else if (i3 == 4) {
                            set = this.A01;
                            Integer valueOf = Integer.valueOf(i3);
                            set.add(valueOf);
                            r3 = this.A00;
                            r3.A06.addAll(r4.A06);
                            int i4 = this.A03;
                            if (i4 != 0) {
                                if (i4 != 1) {
                                    set.add(valueOf);
                                    throw AnonymousClass000.A0a(C13680ns.A0i("SearchQueryResultHandler/onSuccess searchState not recognized: ", AnonymousClass000.A0o(), i4));
                                }
                            } else if (A01()) {
                                A00(C13690nt.A1V(set, 1));
                            }
                        }
                        int i5 = this.A02;
                        if (i5 == 1) {
                            i2 = 3;
                        } else if (i5 == 2 || C13690nt.A1V(set, 3)) {
                            i2 = 4;
                        }
                        if (set.contains(i2)) {
                            BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = r6.A0D;
                            String str = this.A05;
                            ArrayList A0u = AnonymousClass000.A0u();
                            List list2 = r3.A06;
                            List list3 = r3.A09;
                            List list4 = r3.A08;
                            businessDirectoryContextualSearchViewModel.A0K.A0K(new RunnableRunnableShape0S1300000_I0(4, str, businessDirectoryContextualSearchViewModel, new C87314Wg(r3.A02, r3.A03, r3.A05, r3.A04, A0u, list2, list3, list4), r3.A01));
                        }
                    } else {
                        List list5 = r4.A09;
                        AnonymousClass26B r5 = this.A04;
                        C61853Aq.A02(r5, list5);
                        ArrayList A0n = C13680ns.A0n(list5);
                        r6.A0M.AbJ(new AnonymousClass260(r5, new IDxRCallbackShape41S0300000_2_I1(A0n, this, r4, 0), this.A00.A02, A0n, 1));
                    }
                }
            }
        }
    }
}
