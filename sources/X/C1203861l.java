package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.61l  reason: invalid class name and case insensitive filesystem */
public final class C1203861l implements AnonymousClass5S0 {
    public final Map A00 = new LinkedHashMap();

    public AnonymousClass4RI AD6(String str) {
        return (AnonymousClass4RI) this.A00.get(str);
    }

    public void AXb() {
        for (AnonymousClass4RI r1 : this.A00.values()) {
            if (r1.A00) {
                AnonymousClass1IC A002 = r1.A00();
                if (A002.A00) {
                    A002.A02();
                }
            }
        }
    }
}
