package X;

/* renamed from: X.0PX  reason: invalid class name */
public class AnonymousClass0PX {
    public long A00 = -1;
    public final C13240lh A01;

    public AnonymousClass0PX(C13240lh r3) {
        this.A01 = r3;
    }

    public long A00() {
        long j2 = this.A00;
        if (j2 != -1) {
            return j2;
        }
        this.A00 = 0;
        C13240lh r6 = this.A01;
        int frameCount = r6.getFrameCount();
        for (int i2 = 0; i2 < frameCount; i2++) {
            this.A00 += (long) r6.ACR(i2);
        }
        return this.A00;
    }
}
