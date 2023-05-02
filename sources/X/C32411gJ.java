package X;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.1gJ  reason: invalid class name and case insensitive filesystem */
public abstract class C32411gJ extends C32051fZ implements C32421gK {
    public C32071fb[] A00;

    public C32411gJ() {
        this.A00 = C32391gH.A03;
    }

    public C32411gJ(C32071fb r3) {
        if (r3 != null) {
            this.A00 = new C32071fb[]{r3};
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    public C32411gJ(C32391gH r2) {
        this.A00 = r2.A03();
    }

    public C32411gJ(C32071fb[] r4) {
        if (r4 != null) {
            int length = r4.length;
            int i2 = 0;
            while (i2 < length) {
                if (r4[i2] != null) {
                    i2++;
                }
            }
            this.A00 = C32391gH.A00(r4);
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }

    public C32411gJ(C32071fb[] r2, boolean z2) {
        this.A00 = r2;
    }

    public static C32411gJ A00(Object obj) {
        if (obj == null || (obj instanceof C32411gJ)) {
            return (C32411gJ) obj;
        }
        if (obj instanceof AnonymousClass5VK) {
            return A00(((C32071fb) obj).Agm());
        }
        if (obj instanceof byte[]) {
            try {
                return A00(C32051fZ.A02((byte[]) obj));
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder("failed to construct sequence from byte[]: ");
                sb.append(e2.getMessage());
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            if (obj instanceof C32071fb) {
                C32051fZ Agm = ((C32071fb) obj).Agm();
                if (Agm instanceof C32411gJ) {
                    return (C32411gJ) Agm;
                }
            }
            StringBuilder sb2 = new StringBuilder("unknown object in getInstance: ");
            sb2.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public static C32411gJ A01(C107525In r2, boolean z2) {
        if (!z2) {
            C32051fZ Agm = r2.A01.Agm();
            if (r2.A02) {
                return r2 instanceof C107605Iv ? new C107545Ip((C32071fb) Agm) : new C107555Iq((C32071fb) Agm);
            }
            if (Agm instanceof C32411gJ) {
                C32411gJ r1 = (C32411gJ) Agm;
                return r2 instanceof C107605Iv ? r1 : (C32411gJ) r1.A06();
            }
            StringBuilder sb = new StringBuilder("unknown object in getInstance: ");
            sb.append(r2.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
        } else if (r2.A02) {
            return A00(r2.A01.Agm());
        } else {
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
    }

    public C32051fZ A05() {
        return new C32401gI(this.A00, false);
    }

    public C32051fZ A06() {
        return new C107555Iq(this.A00);
    }

    public void A07(C33061hs r10, boolean z2) {
        C32401gI r5 = (C32401gI) this;
        if (z2) {
            r10.A00.write(48);
        }
        C33071ht A01 = r10.A01();
        int length = r5.A00.length;
        int i2 = r5.A00;
        int i3 = 0;
        if (i2 < 0) {
            if (length > 16) {
                int i4 = 0;
                i2 = 0;
                do {
                    i2 += r5.A00[i4].Agm().A05().A03();
                    i4++;
                } while (i4 < length);
                r5.A00 = i2;
            } else {
                C32051fZ[] r8 = new C32051fZ[length];
                int i5 = 0;
                for (int i6 = 0; i6 < length; i6++) {
                    C32051fZ A05 = r5.A00[i6].Agm().A05();
                    r8[i6] = A05;
                    i5 += A05.A03();
                }
                r5.A00 = i5;
                r10.A02(i5);
                while (i3 < length) {
                    r8[i3].A07(A01, true);
                    i3++;
                }
                return;
            }
        }
        r10.A02(i2);
        while (i3 < length) {
            r5.A00[i3].Agm().A05().A07(A01, true);
            i3++;
        }
    }

    public int A0A() {
        return this.A00.length;
    }

    public Enumeration A0B() {
        return new AnonymousClass57N(this);
    }

    public C32071fb A0C(int i2) {
        return this.A00[i2];
    }

    public C32071fb[] A0D() {
        return this.A00;
    }

    public int hashCode() {
        int length = this.A00.length;
        int i2 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ this.A00[length].Agm().hashCode();
        }
    }

    public Iterator iterator() {
        return new AnonymousClass57T(this.A00);
    }

    public String toString() {
        int A0A = A0A();
        if (A0A == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i2 = 0;
        while (true) {
            stringBuffer.append(this.A00[i2]);
            i2++;
            if (i2 >= A0A) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }
}
