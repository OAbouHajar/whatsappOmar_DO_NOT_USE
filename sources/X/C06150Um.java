package X;

/* renamed from: X.0Um  reason: invalid class name and case insensitive filesystem */
public final class C06150Um {
    public final Object A00;
    public final Throwable A01;

    public C06150Um(Object obj) {
        this.A00 = obj;
        this.A01 = null;
    }

    public C06150Um(Throwable th) {
        this.A01 = th;
        this.A00 = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C06150Um) {
                C06150Um r5 = (C06150Um) obj;
                Object obj2 = this.A00;
                if (obj2 == null || !obj2.equals(r5.A00)) {
                    Throwable th = this.A01;
                    if (!(th == null || r5.A01 == null)) {
                        return th.toString().equals(th.toString());
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.A00;
        return AnonymousClass000.A0F(this.A01, objArr, 1);
    }
}
