package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0oL  reason: invalid class name and case insensitive filesystem */
public class C13940oL {
    public C13810o7 A00;
    public Set A01;
    public final Set A02 = new HashSet();
    public final Set A03;

    public C13940oL(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.A03 = hashSet;
        this.A01 = new HashSet();
        hashSet.add(cls);
        for (Class A022 : clsArr) {
            C13710nw.A02(A022, "Null interface");
        }
        Collections.addAll(this.A03, clsArr);
    }
}
