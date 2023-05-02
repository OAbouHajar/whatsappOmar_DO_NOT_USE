package z;

/* compiled from: XFMFile */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f2841a;

    /* renamed from: b  reason: collision with root package name */
    public int f2842b;

    /* renamed from: c  reason: collision with root package name */
    public int f2843c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2844d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2845e;

    /* renamed from: f  reason: collision with root package name */
    public i f2846f;

    /* renamed from: g  reason: collision with root package name */
    public i f2847g;

    public i() {
        this.f2841a = new byte[8192];
        this.f2845e = true;
        this.f2844d = false;
    }

    public i(byte[] bArr, int i2, int i3, boolean z2, boolean z3) {
        this.f2841a = bArr;
        this.f2842b = i2;
        this.f2843c = i3;
        this.f2844d = z2;
        this.f2845e = z3;
    }

    public final i a() {
        i iVar = this.f2846f;
        i iVar2 = iVar != this ? iVar : null;
        i iVar3 = this.f2847g;
        iVar3.f2846f = iVar;
        this.f2846f.f2847g = iVar3;
        this.f2846f = null;
        this.f2847g = null;
        return iVar2;
    }

    public final void b(i iVar) {
        iVar.f2847g = this;
        iVar.f2846f = this.f2846f;
        this.f2846f.f2847g = iVar;
        this.f2846f = iVar;
    }

    public final i c() {
        this.f2844d = true;
        return new i(this.f2841a, this.f2842b, this.f2843c, true, false);
    }

    public final void d(i iVar, int i2) {
        if (iVar.f2845e) {
            int i3 = iVar.f2843c;
            int i4 = i3 + i2;
            byte[] bArr = iVar.f2841a;
            if (i4 > 8192) {
                if (!iVar.f2844d) {
                    int i5 = iVar.f2842b;
                    if ((i3 + i2) - i5 <= 8192) {
                        System.arraycopy(bArr, i5, bArr, 0, i3 - i5);
                        iVar.f2843c -= iVar.f2842b;
                        iVar.f2842b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f2841a, this.f2842b, bArr, iVar.f2843c, i2);
            iVar.f2843c += i2;
            this.f2842b += i2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
