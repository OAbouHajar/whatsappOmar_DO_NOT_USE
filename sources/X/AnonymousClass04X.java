package X;

/* renamed from: X.04X  reason: invalid class name */
public class AnonymousClass04X extends C005102f {
    public long realtimeMs;
    public long uptimeMs;

    public /* bridge */ /* synthetic */ C005102f A01(C005102f r3) {
        AnonymousClass04X r32 = (AnonymousClass04X) r3;
        this.uptimeMs = r32.uptimeMs;
        this.realtimeMs = r32.realtimeMs;
        return this;
    }

    public /* bridge */ /* synthetic */ C005102f A02(C005102f r5, C005102f r6) {
        AnonymousClass04X r52 = (AnonymousClass04X) r5;
        AnonymousClass04X r62 = (AnonymousClass04X) r6;
        if (r62 == null) {
            r62 = new AnonymousClass04X();
        }
        if (r52 == null) {
            r62.uptimeMs = this.uptimeMs;
            r62.realtimeMs = this.realtimeMs;
            return r62;
        }
        r62.uptimeMs = this.uptimeMs - r52.uptimeMs;
        r62.realtimeMs = this.realtimeMs - r52.realtimeMs;
        return r62;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass04X r7 = (AnonymousClass04X) obj;
            if (!(this.uptimeMs == r7.uptimeMs && this.realtimeMs == r7.realtimeMs)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.uptimeMs;
        long j3 = this.realtimeMs;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TimeMetrics{uptimeMs=");
        sb.append(this.uptimeMs);
        sb.append(", realtimeMs=");
        sb.append(this.realtimeMs);
        sb.append('}');
        return sb.toString();
    }
}
