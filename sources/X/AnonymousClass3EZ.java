package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.3EZ  reason: invalid class name */
public class AnonymousClass3EZ implements C25261Jc {
    public final C25261Jc A00;

    public AnonymousClass3EZ(C25261Jc r1) {
        this.A00 = r1;
    }

    public Object A8l(C14950q3 r9, C99354tt r10, C14970q5 r11) {
        String str = r10.A00;
        int i2 = 0;
        switch (str.hashCode()) {
            case -1882328740:
                if (str.equals("bk.action.f32.Sqrt")) {
                    return C89554cQ.A00(Math.sqrt(((Number) C14950q3.A00(r9)).doubleValue()));
                }
                break;
            case -1666855539:
                if (str.equals("bk.action.string.ToUpperCase")) {
                    return AnonymousClass000.A0n(r9.A00, 0).toUpperCase(Locale.ROOT);
                }
                break;
            case -1225336055:
                if (str.equals("bk.action.string.Contains")) {
                    List list = r9.A00;
                    return Boolean.valueOf(AnonymousClass000.A0n(list, 0).contains(AnonymousClass000.A0n(list, 1)));
                }
                break;
            case -965327084:
                if (str.equals("bk.action.string.Join")) {
                    List list2 = r9.A00;
                    String A0n = AnonymousClass000.A0n(list2, 0);
                    r9.A01(1);
                    List A0l = C13690nt.A0l(list2, 1);
                    if (A0n != null) {
                        StringBuilder A0o = AnonymousClass000.A0o();
                        while (i2 < A0l.size()) {
                            String A0n2 = AnonymousClass000.A0n(A0l, i2);
                            if (A0n2 != null) {
                                A0o.append(A0n2);
                                if (i2 < C13700nu.A00(A0l, 1)) {
                                    A0o.append(A0n);
                                }
                                i2++;
                            } else {
                                throw AnonymousClass000.A0T("element must not be null");
                            }
                        }
                        return A0o.toString();
                    }
                    throw AnonymousClass000.A0T("delimeter must not be null");
                }
                break;
            case 944474301:
                if (str.equals("bk.action.map.Filter")) {
                    List list3 = r9.A00;
                    C31411e8 r3 = (C31411e8) list3.get(1);
                    HashMap A0x = AnonymousClass000.A0x();
                    Iterator A0y = AnonymousClass000.A0y((Map) list3.get(0));
                    while (A0y.hasNext()) {
                        Map.Entry A0z = AnonymousClass000.A0z(A0y);
                        C14940q2 r1 = new C14940q2();
                        r1.A03(A0z.getKey(), 0);
                        r1.A03(A0z.getValue(), 1);
                        try {
                            if (C89554cQ.A02(C807345g.A00(new C14950q3(r1.A00), r3.A00, r11))) {
                                A0x.put(A0z.getKey(), A0z.getValue());
                            }
                        } catch (AnonymousClass43P e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                    return A0x;
                }
                break;
            case 975567453:
                if (str.equals("bk.action.string.ValueOfNumberInBase")) {
                    List list4 = r9.A00;
                    long A0A = C13690nt.A0A(list4, 0);
                    long A0D = (long) AnonymousClass000.A0D(list4.get(1));
                    if (A0D >= 2 && A0D <= 36) {
                        return Long.toString(A0A, (int) A0D);
                    }
                    throw AnonymousClass000.A0T("radix parameter of string.ValueOfNumberInBase must be between 2 and 36");
                }
                break;
            case 1377663097:
                if (str.equals("bk.action.map.Keys")) {
                    return C13680ns.A0n(((Map) C14950q3.A00(r9)).keySet());
                }
                break;
            case 1395153511:
                if (str.equals("bk.action.map.Values")) {
                    return C13680ns.A0n(((Map) C14950q3.A00(r9)).values());
                }
                break;
            case 1740388232:
                if (str.equals("bk.action.f32.Log")) {
                    return C89554cQ.A00(Math.log(((Number) C14950q3.A00(r9)).doubleValue()));
                }
                break;
            case 1740392092:
                if (str.equals("bk.action.f32.Pow")) {
                    List list5 = r9.A00;
                    return C89554cQ.A00(Math.pow(((Number) list5.get(0)).doubleValue(), ((Number) list5.get(1)).doubleValue()));
                }
                break;
            case 1867263777:
                if (str.equals("bk.action.string.StartsWith")) {
                    List list6 = r9.A00;
                    return Boolean.valueOf(AnonymousClass000.A0n(list6, 0).startsWith(AnonymousClass000.A0n(list6, 1)));
                }
                break;
            case 1890080876:
                if (str.equals("bk.action.string.ToLowerCase")) {
                    return AnonymousClass000.A0n(r9.A00, 0).toLowerCase(Locale.ROOT);
                }
                break;
        }
        C25261Jc r0 = this.A00;
        if (r0 != null) {
            return r0.A8l(r9, r10, r11);
        }
        throw new AnonymousClass5An(C13680ns.A0h("unknown function ", str));
    }
}
