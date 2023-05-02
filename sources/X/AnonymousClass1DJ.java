package X;

import java.util.List;

/* renamed from: X.1DJ  reason: invalid class name */
public class AnonymousClass1DJ {
    public final C16040sK A00;
    public final C16980tz A01;
    public final AnonymousClass013 A02;
    public final AnonymousClass12P A03;

    public AnonymousClass1DJ(C16040sK r1, C16980tz r2, AnonymousClass013 r3, AnonymousClass12P r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public static final String A00(List list) {
        if (list.size() == 0) {
            return "";
        }
        String obj = list.get(0).toString();
        for (int i2 = 1; i2 < list.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(",");
            sb.append(list.get(i2).toString());
            obj = sb.toString();
        }
        return obj;
    }
}
