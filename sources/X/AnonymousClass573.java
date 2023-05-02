package X;

import java.util.Comparator;

/* renamed from: X.573  reason: invalid class name */
public final /* synthetic */ class AnonymousClass573 implements Comparator {
    public final /* synthetic */ String A00;

    public /* synthetic */ AnonymousClass573(String str) {
        this.A00 = str;
    }

    public final int compare(Object obj, Object obj2) {
        String str = this.A00;
        Integer A01 = AnonymousClass1W0.A01(str, (String) obj);
        Integer A012 = AnonymousClass1W0.A01(str, (String) obj2);
        int i2 = 1;
        Integer valueOf = Integer.valueOf(A01 != null ? A01.intValue() : 1);
        if (A012 != null) {
            i2 = A012.intValue();
        }
        Integer valueOf2 = Integer.valueOf(i2);
        if (valueOf.intValue() <= valueOf2.intValue()) {
            valueOf = valueOf2;
        }
        return valueOf.intValue();
    }
}
