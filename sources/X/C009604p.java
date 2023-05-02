package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.04p  reason: invalid class name and case insensitive filesystem */
public class C009604p extends C009704q {
    public int A00 = 0;
    public C011305k A01 = new C011305k();
    public C011005f A02;
    public ArrayList A03 = new ArrayList();
    public boolean A04 = false;
    public boolean A05 = false;
    public final WeakReference A06;

    public C009604p(C001300o r2) {
        this.A06 = new WeakReference(r2);
        this.A02 = C011005f.INITIALIZED;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r7.A04 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C003501o r8) {
        /*
            r7 = this;
            java.lang.String r0 = "addObserver"
            r7.A07(r0)
            X.05f r1 = r7.A02
            X.05f r0 = X.C011005f.DESTROYED
            if (r1 == r0) goto L_0x000d
            X.05f r0 = X.C011005f.INITIALIZED
        L_0x000d:
            X.05y r4 = new X.05y
            r4.<init>(r0, r8)
            X.05k r0 = r7.A01
            java.lang.Object r0 = r0.A02(r8, r4)
            if (r0 != 0) goto L_0x0087
            java.lang.ref.WeakReference r0 = r7.A06
            java.lang.Object r3 = r0.get()
            X.00o r3 = (X.C001300o) r3
            if (r3 == 0) goto L_0x0087
            int r0 = r7.A00
            r6 = 1
            if (r0 != 0) goto L_0x002e
            boolean r0 = r7.A04
            r5 = 0
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r5 = 1
        L_0x002f:
            X.05f r1 = r7.A02(r8)
            int r0 = r7.A00
            int r0 = r0 + 1
            r7.A00 = r0
        L_0x0039:
            X.05f r0 = r4.A00
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L_0x007d
            X.05k r0 = r7.A01
            java.util.HashMap r0 = r0.A00
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L_0x007d
            X.05f r2 = r4.A00
            java.util.ArrayList r1 = r7.A03
            r1.add(r2)
            X.05n r0 = X.C011405n.A00(r2)
            if (r0 == 0) goto L_0x0069
            r4.A00(r0, r3)
            int r0 = r1.size()
            int r0 = r0 + -1
            r1.remove(r0)
            X.05f r1 = r7.A02(r8)
            goto L_0x0039
        L_0x0069:
            java.lang.String r1 = "no event up from "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x007d:
            if (r5 != 0) goto L_0x0082
            r7.A03()
        L_0x0082:
            int r0 = r7.A00
            int r0 = r0 - r6
            r7.A00 = r0
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C009604p.A00(X.01o):void");
    }

    public void A01(C003501o r2) {
        A07("removeObserver");
        this.A01.A01(r2);
    }

    public final C011005f A02(C003501o r5) {
        C011305k r1 = this.A01;
        AnonymousClass060 r0 = r1.A00.containsKey(r5) ? ((AnonymousClass060) r1.A00.get(r5)).A01 : null;
        C011005f r2 = null;
        C011005f r3 = r0 != null ? ((C012105y) r0.getValue()).A00 : null;
        ArrayList arrayList = this.A03;
        if (!arrayList.isEmpty()) {
            r2 = (C011005f) arrayList.get(arrayList.size() - 1);
        }
        C011005f r12 = this.A02;
        if (r3 != null && r3.compareTo(r12) < 0) {
            r12 = r3;
        }
        return (r2 == null || r2.compareTo(r12) >= 0) ? r12 : r2;
    }

    public final void A03() {
        C011405n r2;
        C011005f r1;
        C001300o r3 = (C001300o) this.A06.get();
        if (r3 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C011305k r5 = this.A01;
            boolean z2 = true;
            if (!(r5.A00 == 0 || (((C012105y) r5.A02.getValue()).A00 == (r1 = ((C012105y) r5.A01.getValue()).A00) && this.A02 == r1))) {
                z2 = false;
            }
            this.A05 = false;
            if (!z2) {
                if (this.A02.compareTo(((C012105y) r5.A02.getValue()).A00) < 0) {
                    C011305k r22 = this.A01;
                    AnonymousClass0DG r6 = new AnonymousClass0DG(r22.A01, r22.A02);
                    r22.A03.put(r6, Boolean.FALSE);
                    while (r6.hasNext() && !this.A05) {
                        Map.Entry entry = (Map.Entry) r6.next();
                        C012105y r4 = (C012105y) entry.getValue();
                        while (r4.A00.compareTo(this.A02) > 0 && !this.A05) {
                            C011305k r0 = this.A01;
                            if (r0.A00.containsKey(entry.getKey())) {
                                C011005f r23 = r4.A00;
                                switch (r23.ordinal()) {
                                    case 2:
                                        r2 = C011405n.ON_DESTROY;
                                        break;
                                    case 3:
                                        r2 = C011405n.ON_STOP;
                                        break;
                                    case 4:
                                        r2 = C011405n.ON_PAUSE;
                                        break;
                                    default:
                                        StringBuilder sb = new StringBuilder("no event down from ");
                                        sb.append(r23);
                                        throw new IllegalStateException(sb.toString());
                                }
                                C011005f A012 = r2.A01();
                                ArrayList arrayList = this.A03;
                                arrayList.add(A012);
                                r4.A00(r2, r3);
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                continue;
                            }
                        }
                    }
                }
                AnonymousClass060 r24 = this.A01.A01;
                if (!this.A05 && r24 != null && this.A02.compareTo(((C012105y) r24.getValue()).A00) > 0) {
                    C011305k r02 = this.A01;
                    C011505o r62 = new C011505o(r02);
                    r02.A03.put(r62, Boolean.FALSE);
                    while (r62.hasNext() && !this.A05) {
                        Map.Entry entry2 = (Map.Entry) r62.next();
                        C012105y r42 = (C012105y) entry2.getValue();
                        while (r42.A00.compareTo(this.A02) < 0 && !this.A05) {
                            C011305k r03 = this.A01;
                            if (r03.A00.containsKey(entry2.getKey())) {
                                C011005f r25 = r42.A00;
                                ArrayList arrayList2 = this.A03;
                                arrayList2.add(r25);
                                C011405n A002 = C011405n.A00(r25);
                                if (A002 != null) {
                                    r42.A00(A002, r3);
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    StringBuilder sb2 = new StringBuilder("no event up from ");
                                    sb2.append(r25);
                                    throw new IllegalStateException(sb2.toString());
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public void A04(C011405n r2) {
        A07("handleLifecycleEvent");
        A06(r2.A01());
    }

    public void A05(C011005f r2) {
        A07("setCurrentState");
        A06(r2);
    }

    public final void A06(C011005f r4) {
        C011005f r2 = this.A02;
        if (r2 == r4) {
            return;
        }
        if (r2 == C011005f.INITIALIZED && r4 == C011005f.DESTROYED) {
            StringBuilder sb = new StringBuilder("no event down from ");
            sb.append(r2);
            throw new IllegalStateException(sb.toString());
        }
        this.A02 = r4;
        if (this.A04 || this.A00 != 0) {
            this.A05 = true;
            return;
        }
        this.A04 = true;
        A03();
        this.A04 = false;
        if (this.A02 == C011005f.DESTROYED) {
            this.A01 = new C011305k();
        }
    }

    public final void A07(String str) {
        if (!C011905t.A00().A03()) {
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(str);
            sb.append(" must be called on the main thread");
            throw new IllegalStateException(sb.toString());
        }
    }
}
