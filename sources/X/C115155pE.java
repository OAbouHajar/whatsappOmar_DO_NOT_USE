package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.5pE  reason: invalid class name and case insensitive filesystem */
public class C115155pE {
    public static C111905hc A00(String str, List list, Map map, int i2, int i3) {
        AnonymousClass00B.A0C(AnonymousClass000.A0l(AnonymousClass000.A0r("BloksFieldStatParser/parseFieldStat/invalid serialization/length="), list.size()), AnonymousClass000.A1P(list.size() % 4));
        int size = list.size() >> 2;
        ArrayList A0u = AnonymousClass000.A0u();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = i4 << 2;
            int A0D = AnonymousClass000.A0D(list.get(i5 + 2));
            Object obj = list.get(i5 + 3);
            Object A00 = C115165pF.A00(obj, A0D, false);
            if (A00 != null) {
                A0u.add(new C117195sb(A00, AnonymousClass000.A0n(list, i5 + 1), C115165pF.A00(obj, A0D, true), AnonymousClass000.A0D(list.get(i5))));
            }
        }
        return new C111905hc(new AnonymousClass00F("1".equals(map.get("log_all_for_debug")), C29501aj.A00(C13690nt.A0e("sample_rate_debug", map), 1), C29501aj.A00(C13690nt.A0e("sample_rate_beta", map), 20), C29501aj.A00(C13690nt.A0e("sample_rate_beta", map), 20), C29501aj.A00(C13690nt.A0e("sample_rate_release", map), 20)), str, (C117195sb[]) A0u.toArray(new C117195sb[0]), i2, i3);
    }
}
