package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0S1  reason: invalid class name */
public class AnonymousClass0S1 {
    public int A00 = -1;
    public int A01 = 0;
    public AnonymousClass0SA A02;
    public AnonymousClass0S1 A03;
    public HashSet A04 = null;
    public final AnonymousClass0KD A05;
    public final AnonymousClass0SN A06;

    public AnonymousClass0S1(AnonymousClass0KD r2, AnonymousClass0SN r3) {
        this.A06 = r3;
        this.A05 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        r0 = r3.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00() {
        /*
            r3 = this;
            X.0SN r0 = r3.A06
            int r0 = r0.A0N
            r2 = 8
            if (r0 != r2) goto L_0x000a
            r1 = 0
            return r1
        L_0x000a:
            int r1 = r3.A00
            r0 = -1
            if (r1 <= r0) goto L_0x001a
            X.0S1 r0 = r3.A03
            if (r0 == 0) goto L_0x001a
            X.0SN r0 = r0.A06
            int r0 = r0.A0N
            if (r0 != r2) goto L_0x001a
            return r1
        L_0x001a:
            int r1 = r3.A01
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0S1.A00():int");
    }

    public void A01() {
        HashSet hashSet;
        AnonymousClass0S1 r0 = this.A03;
        if (!(r0 == null || (hashSet = r0.A04) == null)) {
            hashSet.remove(this);
        }
        this.A03 = null;
        this.A01 = 0;
        this.A00 = -1;
    }

    public void A02() {
        AnonymousClass0SA r0 = this.A02;
        if (r0 == null) {
            this.A02 = new AnonymousClass0SA(C03800Jx.UNRESTRICTED);
        } else {
            r0.A00();
        }
    }

    public boolean A03() {
        AnonymousClass0S1 r0;
        HashSet hashSet = this.A04;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AnonymousClass0S1 r1 = (AnonymousClass0S1) it.next();
                switch (r1.A05.ordinal()) {
                    case 1:
                        r0 = r1.A06.A0X;
                        break;
                    case 2:
                        r0 = r1.A06.A0S;
                        break;
                    case 3:
                        r0 = r1.A06.A0W;
                        break;
                    case 4:
                        r0 = r1.A06.A0Y;
                        break;
                    default:
                        r0 = null;
                        break;
                }
                if (r0.A03 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A06.A0f);
        A0o.append(":");
        return AnonymousClass000.A0h(this.A05.toString(), A0o);
    }
}
