package okhttp3.internal.http2;

/* compiled from: XFMFile */
public final class Settings {

    /* renamed from: a  reason: collision with root package name */
    public int f2280a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f2281b = new int[10];

    public final int a() {
        if ((this.f2280a & 128) != 0) {
            return this.f2281b[7];
        }
        return 65535;
    }

    public final void b(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f2281b;
            if (i2 < iArr.length) {
                this.f2280a = (1 << i2) | this.f2280a;
                iArr[i2] = i3;
            }
        }
    }
}
