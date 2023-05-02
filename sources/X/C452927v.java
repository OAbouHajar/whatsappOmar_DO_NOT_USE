package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.27v  reason: invalid class name and case insensitive filesystem */
public class C452927v {
    public C453027w A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C34861kz A05;
    public final List A06 = new ArrayList();
    public final Set A07 = new HashSet();

    public C452927v(C34861kz r2) {
        this.A05 = r2;
    }

    public static /* synthetic */ void A00(C452927v r2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r2.A02((byte[]) it.next());
        }
    }

    public C452727t A01() {
        if (this.A00.A00()) {
            return new C452727t(this);
        }
        throw new IllegalArgumentException("none of the syncs protocols enabled");
    }

    public void A02(byte[] bArr) {
        List<byte[]> list = this.A06;
        for (byte[] equals : list) {
            if (Arrays.equals(equals, bArr)) {
                return;
            }
        }
        list.add(bArr);
    }
}
