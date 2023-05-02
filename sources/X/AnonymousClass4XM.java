package X;

/* renamed from: X.4XM  reason: invalid class name */
public abstract class AnonymousClass4XM {
    public int flags;

    public static boolean A00(AnonymousClass4XM r1) {
        return r1.getFlag(4);
    }

    public final void addFlag(int i2) {
        this.flags = i2 | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int i2) {
        this.flags = (i2 ^ -1) & this.flags;
    }

    public final boolean getFlag(int i2) {
        return AnonymousClass000.A1R(this.flags & i2, i2);
    }

    public final boolean hasSupplementalData() {
        return AnonymousClass000.A1R(this.flags & 268435456, 268435456);
    }

    public final boolean isDecodeOnly() {
        return AnonymousClass000.A1R(this.flags & Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final boolean isEndOfStream() {
        return A00(this);
    }

    public final boolean isKeyFrame() {
        return AnonymousClass000.A1R(this.flags & 1, 1);
    }

    public final void setFlags(int i2) {
        this.flags = i2;
    }
}
