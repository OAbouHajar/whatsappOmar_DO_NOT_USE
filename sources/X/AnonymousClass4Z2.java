package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.4Z2  reason: invalid class name */
public class AnonymousClass4Z2 {
    public static AnonymousClass2V1[] A00 = {new AnonymousClass3G9(6), new AnonymousClass3G9(7), new AnonymousClass3G9(8)};
    public static AnonymousClass2V1[] A01 = {new AnonymousClass3G9(0), new AnonymousClass3G9(1), new AnonymousClass3G9(2), new AnonymousClass3G9(3), new AnonymousClass3G9(4), new AnonymousClass3G9(5)};

    public static List A00() {
        ArrayList A0u = AnonymousClass000.A0u();
        for (AnonymousClass410 r0 : AnonymousClass410.values()) {
            A0u.addAll(Arrays.asList(r0.shapeData));
        }
        return A0u;
    }
}
