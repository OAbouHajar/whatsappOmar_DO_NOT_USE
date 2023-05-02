package androidx.car.app.model;

import X.AnonymousClass000;

public final class DurationSpan extends CarSpan {
    public final long mDurationSeconds = 0;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DurationSpan) && this.mDurationSeconds == ((DurationSpan) obj).mDurationSeconds;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.mDurationSeconds;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[seconds: ");
        A0r.append(this.mDurationSeconds);
        return AnonymousClass000.A0h("]", A0r);
    }
}
