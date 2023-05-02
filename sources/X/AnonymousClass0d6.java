package X;

import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.0d6  reason: invalid class name */
public final class AnonymousClass0d6 implements C13120lV, C12070jn {
    public final C13110lU A00;
    public final Object A01 = new Object();
    public final C08110d4[] A02;

    public AnonymousClass0d6(C13110lU r5, AnonymousClass0U8 r6) {
        AnonymousClass0V4 r2 = r6.A02;
        C08110d4[] r3 = {new C02960Gr(r6.A01), new C02970Gs(r6.A00), new C02980Gt(r6.A03), new C02990Gu(r2), new C03000Gv(r2), new C03020Gx(r2), new C03010Gw(r2)};
        this.A00 = r5;
        this.A02 = r3;
    }

    public final boolean A00(String str) {
        boolean z2;
        synchronized (this.A01) {
            C08110d4[] r3 = this.A02;
            int length = r3.length;
            z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    C08110d4 r4 = r3[i2];
                    Object obj = r4.A01;
                    if (obj != null && r4.A02(obj) && r4.A03.contains(str)) {
                        C06530Wm A002 = C06530Wm.A00();
                        String str2 = C04470Mr.A00;
                        StringBuilder A0o = AnonymousClass000.A0o();
                        A0o.append("Work ");
                        A0o.append(str);
                        A0o.append(" constrained by ");
                        A002.A02(str2, AnonymousClass000.A0h(AnonymousClass000.A0c(r4), A0o));
                        break;
                    }
                    i2++;
                } else {
                    z2 = true;
                    break;
                }
            }
        }
        return z2;
    }

    public void Ac9(Iterable iterable) {
        C18450wi.A0H(iterable, 0);
        synchronized (this.A01) {
            C08110d4[] r6 = this.A02;
            for (C08110d4 r2 : r6) {
                if (r2.A00 != null) {
                    r2.A00 = null;
                    r2.A04.isEmpty();
                }
            }
            for (C08110d4 r8 : r6) {
                List<C007303i> list = r8.A04;
                list.clear();
                List list2 = r8.A03;
                list2.clear();
                for (Object next : iterable) {
                    if (r8.A01((C007303i) next)) {
                        list.add(next);
                    }
                }
                for (C007303i r0 : list) {
                    list2.add(r0.A0J);
                }
                boolean isEmpty = list.isEmpty();
                AnonymousClass0V4 r11 = r8.A02;
                if (isEmpty) {
                    r11.A05(r8);
                } else {
                    synchronized (r11.A03) {
                        LinkedHashSet linkedHashSet = r11.A04;
                        if (linkedHashSet.add(r8)) {
                            if (linkedHashSet.size() == 1) {
                                r11.A00 = r11.A02();
                                C06530Wm A002 = C06530Wm.A00();
                                String str = C04510Mv.A00;
                                StringBuilder A0p = AnonymousClass000.A0p(r11);
                                A0p.append(": initial state = ");
                                A002.A02(str, AnonymousClass000.A0f(r11.A00, A0p));
                                r11.A03();
                            }
                            Object obj = r11.A00;
                            r8.A01 = obj;
                            r8.A00(r8.A00, obj);
                        }
                    }
                }
                r8.A00(r8.A00, r8.A01);
            }
            for (C08110d4 r1 : r6) {
                if (r1.A00 != this) {
                    r1.A00 = this;
                    r1.A00(this, r1.A01);
                }
            }
        }
    }

    public void reset() {
        synchronized (this.A01) {
            for (C08110d4 r2 : this.A02) {
                List list = r2.A04;
                if (!list.isEmpty()) {
                    list.clear();
                    r2.A02.A05(r2);
                }
            }
        }
    }
}
