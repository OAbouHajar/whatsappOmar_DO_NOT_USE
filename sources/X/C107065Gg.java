package X;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.5Gg  reason: invalid class name and case insensitive filesystem */
public class C107065Gg extends C11540iw {
    public int A00;
    public Object[] A01;
    public final ReentrantLock A02 = new ReentrantLock();
    public volatile /* synthetic */ int size;

    public C107065Gg() {
        int min = Math.min(10, 8);
        Object[] objArr = new Object[min];
        Arrays.fill(objArr, 0, min, AnonymousClass4B9.A00);
        this.A01 = objArr;
        this.size = 0;
    }

    /* JADX INFO: finally extract failed */
    public Object A00(Object obj) {
        C107135Gn A03;
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            this.A00.A04();
            if (i2 < 10) {
                this.size = i2 + 1;
                if (i2 == 0) {
                    do {
                        A03 = A03();
                        if (A03 != null) {
                        }
                    } while (A03.A0A() == null);
                    this.size = i2;
                    reentrantLock.unlock();
                    C107075Gh r1 = (C107075Gh) A03;
                    r1.A01.A00 = obj;
                    AnonymousClass5GN r12 = r1.A00;
                    r12.A08(r12.A00);
                    return AnonymousClass4B9.A02;
                }
                Object[] objArr = this.A01;
                int length = objArr.length;
                if (i2 >= length) {
                    int min = Math.min(length << 1, 10);
                    Object[] objArr2 = new Object[min];
                    for (int i3 = 0; i3 < i2; i3++) {
                        objArr2[i3] = objArr[(this.A00 + i3) % length];
                    }
                    Arrays.fill(objArr2, i2, min, AnonymousClass4B9.A00);
                    this.A01 = objArr2;
                    objArr = objArr2;
                    this.A00 = 0;
                }
                objArr[(this.A00 + i2) % objArr.length] = obj;
            } else {
                Object[] objArr3 = this.A01;
                int i4 = this.A00;
                int length2 = objArr3.length;
                objArr3[i4 % length2] = null;
                objArr3[(i2 + i4) % length2] = obj;
                this.A00 = (i4 + 1) % length2;
            }
            AnonymousClass4QY r0 = AnonymousClass4B9.A02;
            reentrantLock.unlock();
            return r0;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public String A01() {
        StringBuilder A0r = AnonymousClass000.A0r("(buffer:capacity=");
        A0r.append(10);
        A0r.append(",size=");
        A0r.append(this.size);
        return AnonymousClass000.A0j(A0r);
    }

    public Object A04() {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                this.A00.A04();
                return AnonymousClass4B9.A03;
            }
            Object[] objArr = this.A01;
            int i3 = this.A00;
            Object obj = objArr[i3];
            objArr[i3] = null;
            this.size = i2 - 1;
            AnonymousClass4QY r3 = AnonymousClass4B9.A03;
            if (i2 == 10) {
                this.A00.A01();
            }
            if (r3 != r3) {
                this.size = i2;
                Object[] objArr2 = this.A01;
                objArr2[(this.A00 + i2) % objArr2.length] = r3;
            }
            this.A00 = (this.A00 + 1) % this.A01.length;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean A06(C107135Gn r3) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            return super.A06(r3);
        } finally {
            reentrantLock.unlock();
        }
    }
}
