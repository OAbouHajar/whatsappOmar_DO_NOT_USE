package X;

import android.media.AudioAttributes;

/* renamed from: X.4bh  reason: invalid class name and case insensitive filesystem */
public final class C89164bh {
    public static final C89164bh A02 = new C89164bh(1);
    public AudioAttributes A00;
    public final int A01;

    public C89164bh(int i2) {
        this.A01 = i2;
    }

    public AudioAttributes A00() {
        AudioAttributes audioAttributes = this.A00;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(this.A01);
        if (AnonymousClass3C1.A01 >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        AudioAttributes build = usage.build();
        this.A00 = build;
        return build;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && C89164bh.class == obj.getClass() && this.A01 == ((C89164bh) obj).A01;
        }
        return true;
    }

    public int hashCode() {
        return ((506447 + this.A01) * 31) + 1;
    }
}
