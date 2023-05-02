package X;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: X.1qi  reason: invalid class name and case insensitive filesystem */
public class C38391qi implements Comparator {
    public final /* synthetic */ AnonymousClass1CX A00;
    public final /* synthetic */ HashMap A01;

    public C38391qi(AnonymousClass1CX r1, HashMap hashMap) {
        this.A00 = r1;
        this.A01 = hashMap;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        String A012 = C27031Qe.A01((String) pair.first, (String) pair.second);
        String A013 = C27031Qe.A01((String) pair2.first, (String) pair2.second);
        HashMap hashMap = this.A01;
        Object obj3 = hashMap.get(A012);
        AnonymousClass00B.A06(obj3);
        int intValue = ((Number) obj3).intValue();
        Object obj4 = hashMap.get(A013);
        AnonymousClass00B.A06(obj4);
        return ((Number) obj4).intValue() - intValue;
    }
}
