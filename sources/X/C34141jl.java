package X;

import com.whatsapp.util.Log;

/* renamed from: X.1jl  reason: invalid class name and case insensitive filesystem */
public class C34141jl {
    public final int A00;
    public final long A01;

    public C34141jl(int i2, long j2) {
        this.A00 = i2;
        if (i2 != 0 || j2 == 0) {
            this.A01 = j2;
        } else {
            Log.e("GrowthLock Nonzero expiration for unlocked GrowthLock");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C34141jl r7 = (C34141jl) obj;
            return this.A00 == r7.A00 && this.A01 == r7.A01;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.A01;
        return (this.A00 * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
