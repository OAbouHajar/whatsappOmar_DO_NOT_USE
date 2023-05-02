package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.0hM  reason: invalid class name and case insensitive filesystem */
public class C10580hM implements Runnable {
    public static final String A03 = C06530Wm.A01("StopWorkRunnable");
    public final AnonymousClass0NV A00;
    public final AnonymousClass022 A01;
    public final boolean A02;

    public C10580hM(AnonymousClass0NV r1, AnonymousClass022 r2, boolean z2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z2;
    }

    public void run() {
        boolean z2;
        C10630hR r1;
        boolean z3 = this.A02;
        C08080d0 r8 = this.A01.A03;
        AnonymousClass0NV r12 = this.A00;
        String str = r12.A00.A01;
        if (z3) {
            synchronized (r8.A0A) {
                C06530Wm A002 = C06530Wm.A00();
                String str2 = C08080d0.A0C;
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("Processor stopping foreground work ");
                A002.A02(str2, AnonymousClass000.A0h(str, A0o));
                r1 = (C10630hR) r8.A07.remove(str);
                if (r1 != null) {
                    r8.A08.remove(str);
                }
            }
            z2 = C08080d0.A00(r1, str);
        } else {
            synchronized (r8.A0A) {
                C10630hR r7 = (C10630hR) r8.A06.remove(str);
                if (r7 == null) {
                    C06530Wm A003 = C06530Wm.A00();
                    String str3 = C08080d0.A0C;
                    StringBuilder A0o2 = AnonymousClass000.A0o();
                    A0o2.append("WorkerWrapper could not be found for ");
                    A003.A02(str3, AnonymousClass000.A0h(str, A0o2));
                } else {
                    Map map = r8.A08;
                    Set set = (Set) map.get(str);
                    if (set != null && set.contains(r12)) {
                        C06530Wm A004 = C06530Wm.A00();
                        String str4 = C08080d0.A0C;
                        StringBuilder A0o3 = AnonymousClass000.A0o();
                        A0o3.append("Processor stopping background work ");
                        A004.A02(str4, AnonymousClass000.A0h(str, A0o3));
                        map.remove(str);
                        z2 = C08080d0.A00(r7, str);
                    }
                }
                z2 = false;
            }
        }
        C06530Wm A005 = C06530Wm.A00();
        String str5 = A03;
        StringBuilder A0r = AnonymousClass000.A0r("StopWorkRunnable for ");
        A0r.append(str);
        A0r.append("; Processor.stopWork = ");
        A0r.append(z2);
        A005.A02(str5, A0r.toString());
    }
}
