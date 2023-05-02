package X;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.54s  reason: invalid class name and case insensitive filesystem */
public final class C1042854s implements Cloneable {
    public Object A00;
    public List A01 = AnonymousClass000.A0u();

    public final int A00() {
        if (this.A00 == null) {
            Iterator it = this.A01.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    public final void A01() {
        if (this.A00 == null) {
            Iterator it = this.A01.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final /* synthetic */ Object clone() {
        Object clone;
        C1042854s r3 = new C1042854s();
        try {
            List list = this.A01;
            if (list == null) {
                r3.A01 = null;
            } else {
                r3.A01.addAll(list);
            }
            Object obj = this.A00;
            if (obj != null) {
                if (obj instanceof C90124dX) {
                    clone = ((C90124dX) obj).clone();
                } else if (obj instanceof byte[]) {
                    clone = ((byte[]) obj).clone();
                } else {
                    int i2 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        Object[] objArr = new byte[bArr.length][];
                        r3.A00 = objArr;
                        while (i2 < bArr.length) {
                            objArr[i2] = bArr[i2].clone();
                            i2++;
                        }
                    } else if (obj instanceof boolean[]) {
                        clone = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        clone = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        clone = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        clone = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        clone = ((double[]) obj).clone();
                    } else if (obj instanceof C90124dX[]) {
                        C90124dX[] r4 = (C90124dX[]) obj;
                        Object[] objArr2 = new C90124dX[r4.length];
                        r3.A00 = objArr2;
                        while (i2 < r4.length) {
                            objArr2[i2] = r4[i2].clone();
                            i2++;
                        }
                    }
                }
                r3.A00 = clone;
                return r3;
            }
            return r3;
        } catch (CloneNotSupportedException e2) {
            throw AnonymousClass3K4.A0T(e2);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1042854s)) {
            return false;
        }
        C1042854s r5 = (C1042854s) obj;
        if (this.A00 == null || r5.A00 == null) {
            List list2 = this.A01;
            if (list2 != null && (list = r5.A01) != null) {
                return list2.equals(list);
            }
            try {
                int A002 = A00();
                byte[] bArr = new byte[A002];
                new C90704ef(bArr, A002);
                A01();
                int A003 = r5.A00();
                byte[] bArr2 = new byte[A003];
                new C90704ef(bArr2, A003);
                r5.A01();
                return Arrays.equals(bArr, bArr2);
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            throw AnonymousClass000.A0W("zzrk");
        }
    }

    public final int hashCode() {
        try {
            int A002 = A00();
            byte[] bArr = new byte[A002];
            new C90704ef(bArr, A002);
            A01();
            return Arrays.hashCode(bArr) + 527;
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
