package X;

import android.content.SharedPreferences;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.14n  reason: invalid class name and case insensitive filesystem */
public class C215514n {
    public final C18260wP A00;
    public final C16440t3 A01;
    public final C14710pd A02;
    public final AnonymousClass1QY A03;

    public C215514n(C18260wP r1, C16440t3 r2, C14710pd r3, AnonymousClass1QY r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }

    public static int A00(AnonymousClass1UW r4) {
        if (r4 != null) {
            int i2 = r4.A00;
            if (r4.A04) {
                if (Build.VERSION.SDK_INT >= 29 && i2 == 20) {
                    return 3;
                }
                switch (i2) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 0;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                        return 1;
                    case 13:
                    case 15:
                        return 2;
                    default:
                        return 5;
                }
            } else if (r4.A06) {
                return 4;
            }
        }
        return 5;
    }

    public synchronized Float A01(int i2) {
        Float f2;
        int i3;
        int A002 = A00(this.A00.A06());
        int A003 = (int) ((((this.A01.A00() / 1000) / 60) / 60) % 24);
        AnonymousClass1QY r3 = this.A03;
        AnonymousClass1z4 r6 = new AnonymousClass1z4(r3.A00(i2, A003, A002));
        List list = r6.A00;
        boolean z2 = false;
        if (list.size() >= 10) {
            z2 = true;
        }
        if (z2 || !this.A02.A0E(C16620tM.A02, 154)) {
            f2 = Float.valueOf(list.size() >= 10 ? (float) AnonymousClass1z4.A00(list) : -1.0f);
        } else {
            List A004 = r3.A00(i2, (A003 + 23) % 24, A002);
            List A005 = r3.A00(i2, (A003 + 1) % 24, A002);
            Iterator it = A004.iterator();
            Iterator it2 = A005.iterator();
            boolean z3 = false;
            while (true) {
                boolean z4 = false;
                if (list.size() >= 10) {
                    z4 = true;
                }
                if (!z4) {
                    if (z3 || !it.hasNext()) {
                        if (!it2.hasNext()) {
                            if (!it.hasNext()) {
                                f2 = null;
                                break;
                            }
                            i3 = ((Integer) it.next()).intValue();
                        } else {
                            i3 = ((Integer) it2.next()).intValue();
                            z3 = false;
                        }
                    } else {
                        i3 = ((Integer) it.next()).intValue();
                        z3 = true;
                    }
                    r6.A02(i3);
                } else {
                    f2 = Float.valueOf(list.size() >= 10 ? (float) AnonymousClass1z4.A00(list) : -1.0f);
                }
            }
        }
        return f2;
    }

    public synchronized void A02(AnonymousClass1XK r10, int i2, long j2, long j3) {
        SharedPreferences sharedPreferences;
        int A002 = A00(this.A00.A06());
        int A003 = (int) ((((this.A01.A00() / 1000) / 60) / 60) % 24);
        if (!(A002 == 0 || A002 == 5 || ((r10 != AnonymousClass1XK.A0B && r10 != AnonymousClass1XK.A0G && r10 != AnonymousClass1XK.A0Z) || j2 < 51200 || j3 < 100))) {
            AnonymousClass1QY r2 = this.A03;
            AnonymousClass1z4 r1 = new AnonymousClass1z4(r2.A00(i2, A003, A002));
            r1.A02((int) (((float) j2) / ((float) j3)));
            List<Integer> list = r1.A00;
            StringBuilder sb = new StringBuilder();
            for (Integer intValue : list) {
                sb.append(intValue.intValue());
                sb.append(",");
            }
            synchronized (r2) {
                sharedPreferences = r2.A00;
                if (sharedPreferences == null) {
                    sharedPreferences = r2.A01.A00("media_bandwidth_shared_preferences_v2");
                    r2.A00 = sharedPreferences;
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(String.format(Locale.US, "%d_%d_%d_%d_%s", new Object[]{Integer.valueOf(i2), Integer.valueOf(A002), Integer.valueOf(A003), 0, "bandwidths"}), sb.toString());
            edit.apply();
        }
    }
}
