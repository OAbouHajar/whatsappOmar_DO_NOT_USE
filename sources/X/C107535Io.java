package X;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.5Io  reason: invalid class name and case insensitive filesystem */
public class C107535Io extends C32411gJ {
    public byte[] A00;

    public C107535Io(byte[] bArr) {
        this.A00 = bArr;
    }

    public synchronized int A03() {
        int i2;
        byte[] bArr = this.A00;
        if (bArr != null) {
            int length = bArr.length;
            i2 = C32551gZ.A00(length) + 1 + length;
        } else {
            i2 = super.A06().A03();
        }
        return i2;
    }

    public synchronized C32051fZ A05() {
        A0E();
        return super.A05();
    }

    public synchronized C32051fZ A06() {
        A0E();
        return super.A06();
    }

    public synchronized void A07(C33061hs r3, boolean z2) {
        byte[] bArr = this.A00;
        if (bArr != null) {
            r3.A06(bArr, 48, z2);
        } else {
            super.A06().A07(r3, z2);
        }
    }

    public synchronized int A0A() {
        A0E();
        return this.A00.length;
    }

    public synchronized Enumeration A0B() {
        byte[] bArr = this.A00;
        if (bArr != null) {
            return new AnonymousClass57P(bArr);
        }
        return new AnonymousClass57N(this);
    }

    public synchronized C32071fb A0C(int i2) {
        A0E();
        return this.A00[i2];
    }

    public C32071fb[] A0D() {
        A0E();
        return this.A00;
    }

    public final void A0E() {
        byte[] bArr = this.A00;
        if (bArr != null) {
            C32391gH r2 = new C32391gH();
            AnonymousClass57P r1 = new AnonymousClass57P(bArr);
            while (r1.hasMoreElements()) {
                r2.A02((C32061fa) r1.nextElement());
            }
            this.A00 = r2.A03();
            this.A00 = null;
        }
    }

    public synchronized int hashCode() {
        A0E();
        return super.hashCode();
    }

    public synchronized Iterator iterator() {
        A0E();
        return super.iterator();
    }
}
