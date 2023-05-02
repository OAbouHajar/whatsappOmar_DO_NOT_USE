package X;

import java.util.AbstractCollection;

/* renamed from: X.3kR  reason: invalid class name and case insensitive filesystem */
public class C71473kR extends AnonymousClass4D9 {
    public final int A00;
    public final String A01;

    public C71473kR(int i2, String str, int i3) {
        super(i2);
        this.A01 = str;
        this.A00 = i3;
    }

    public static void A00(String str, AbstractCollection abstractCollection, int i2, int i3) {
        abstractCollection.add(new C71473kR(i2, str, i3));
    }
}
