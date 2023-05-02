package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.18E  reason: invalid class name */
public class AnonymousClass18E {
    public final AnonymousClass18D A00;
    public final C31081dR A01;

    public AnonymousClass18E(C16440t3 r12, C14710pd r13, C16490t9 r14, AnonymousClass18D r15, AnonymousClass17S r16, C19500yX r17) {
        C31081dR r4 = new C31081dR(r12, r14, r16, r17, "MessageSendPerfQplTracker", 154474694);
        C31091dS r3 = r4.A06;
        char c2 = !r13.A0E(C16620tM.A02, 1191) ? (char) 1 : 3;
        boolean z2 = r3.A03;
        if (c2 != 1) {
            z2 = false;
            if (c2 != 2) {
                z2 = true;
            }
        }
        r3.A03 = z2;
        this.A01 = r4;
        this.A00 = r15;
    }

    public static String A00(int i2) {
        switch (i2) {
            case 1:
                return "client_rendered";
            case 2:
                return "client_saved";
            case 3:
                return "client_written_wire";
            case 4:
                return "client_queued";
            case 5:
                return "client_waiting_to_encrypt";
            case 6:
                return "client_ready_to_send";
            case 7:
                return "client_encrypt";
            case 8:
                return "client_prekeys_fetch";
            default:
                return "unknown";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r0 = (java.lang.Integer) r1.get(java.lang.Integer.valueOf(r6));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(java.lang.String r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            if (r7 != 0) goto L_0x0029
            X.18D r2 = r3.A00
            monitor-enter(r2)
            java.util.Map r1 = r2.A00     // Catch:{ all -> 0x0024 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0024 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0024 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0027
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0024 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0024 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0027
            int r7 = r0.intValue()     // Catch:{ all -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0027:
            r7 = 0
        L_0x0028:
            monitor-exit(r2)
        L_0x0029:
            if (r7 <= 0) goto L_0x0040
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "_"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0040:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass18E.A01(java.lang.String, int, int, int):java.lang.String");
    }

    public void A02(int i2, int i3) {
        this.A01.A01(i2, A01(A00(i3), i2, i3, 0));
        AnonymousClass18D r3 = this.A00;
        synchronized (r3) {
            Map map = (Map) r3.A00.get(Integer.valueOf(i2));
            if (map != null) {
                Integer valueOf = Integer.valueOf(i3);
                Integer num = (Integer) map.get(valueOf);
                if (num != null) {
                    map.put(valueOf, Integer.valueOf(num.intValue() + 1));
                }
            }
        }
    }

    public void A03(int i2, int i3) {
        this.A01.A02(i2, A01(A00(i3), i2, i3, 0));
        AnonymousClass18D r1 = this.A00;
        synchronized (r1) {
            r1.A00(i2, i3, 0);
        }
    }

    public void A04(int i2, int i3) {
        boolean z2;
        if (i3 != 8 && i3 != 7) {
            AnonymousClass18D r2 = this.A00;
            synchronized (r2) {
                Map map = (Map) r2.A00.get(Integer.valueOf(i2));
                if (map != null) {
                    z2 = true;
                    if (((Integer) map.get(Integer.valueOf(i3))) == null) {
                    }
                }
                z2 = false;
            }
            if (z2) {
                A02(i2, i3);
            }
            int i4 = 2;
            switch (i3) {
                case 1:
                    break;
                case 2:
                    i4 = 5;
                    break;
                case 3:
                    A06(i2, 2);
                    return;
                case 4:
                    i4 = 1;
                    break;
                case 5:
                    i4 = 6;
                    break;
                case 6:
                    i4 = 3;
                    break;
                default:
                    return;
            }
            A03(i2, i4);
        }
    }

    public void A05(int i2, int i3, int i4, int i5) {
        int i6 = i2;
        if (A07(i2)) {
            A03(i2, i3);
        } else if (i5 != 7 && i5 != 10 && i5 != 11 && i5 != 12) {
            C31081dR r3 = this.A01;
            r3.A04(i2, "message_send", false);
            AnonymousClass18D r4 = this.A00;
            synchronized (r4) {
                r4.A00.put(Integer.valueOf(i2), new HashMap());
            }
            if (i4 >= 0) {
                int i7 = i4 + 1;
                r3.A02(i2, A01(A00(i3), i2, i3, i7));
                r4.A00(i2, i3, i7);
            } else {
                A03(i2, i3);
            }
            r3.A07.AKo("wa_type", r3.A06.A05, i6, (long) i5);
        }
    }

    public void A06(int i2, short s2) {
        this.A01.A05(i2, s2);
        AnonymousClass18D r2 = this.A00;
        synchronized (r2) {
            r2.A00.remove(Integer.valueOf(i2));
        }
    }

    public boolean A07(int i2) {
        boolean containsKey;
        AnonymousClass18D r2 = this.A00;
        synchronized (r2) {
            containsKey = r2.A00.containsKey(Integer.valueOf(i2));
        }
        return containsKey;
    }
}
