package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.10r  reason: invalid class name and case insensitive filesystem */
public class C205710r {
    public final C16980tz A00;
    public final C17080uV A01;
    public final C205610q A02;
    public final C16490t9 A03;

    public C205710r(C16980tz r1, C17080uV r2, C205610q r3, C16490t9 r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void A00(File file, Map map) {
        int indexOf;
        String substring;
        String substring2;
        String name = file.getName();
        C75373s3 r3 = new C75373s3();
        r3.A00 = 0;
        r3.A01 = 1L;
        r3.A05 = "native";
        int indexOf2 = name.indexOf("_");
        if (indexOf2 > 0 && (substring2 = name.substring(0, indexOf2)) != null) {
            r3.A03 = substring2;
        }
        int i2 = indexOf2 + 1;
        if (i2 > 1 && (indexOf = name.indexOf("_", i2)) >= 0 && (substring = name.substring(i2, indexOf)) != null && map.containsKey(substring)) {
            r3.A02 = C17080uV.A00((File) map.get(substring));
        }
        this.A03.A04(r3);
    }
}
