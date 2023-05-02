package X;

import java.util.HashMap;

/* renamed from: X.14W  reason: invalid class name */
public class AnonymousClass14W extends C16580tI {
    public final C20080zT A00;

    public AnonymousClass14W(C20080zT r1) {
        this.A00 = r1;
    }

    /* renamed from: A04 */
    public void A02(C41781we r7) {
        super.A02(r7);
        HashMap hashMap = new HashMap(this.A00.A01);
        for (String str : hashMap.keySet()) {
            int intValue = ((Number) hashMap.get(str)).intValue();
            for (C41781we r0 : A01()) {
                r0.toString();
                r0.A06(str, intValue);
            }
        }
    }
}
