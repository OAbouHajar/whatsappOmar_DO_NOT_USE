package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1sV  reason: invalid class name and case insensitive filesystem */
public class C39451sV extends C39291sE {
    public int A00;
    public C16050sL A01;
    public String A02 = "";
    public final Set A03 = new LinkedHashSet();

    public C39451sV(C28381Vw r2, C30641ci r3, int i2, long j2) {
        super(r2, r3, i2, j2);
    }

    public void A0k(String str) {
        synchronized (this.A12) {
            this.A02 = str;
        }
    }
}
