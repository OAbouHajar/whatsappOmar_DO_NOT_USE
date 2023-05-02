package X;

/* renamed from: X.04Z  reason: invalid class name */
public class AnonymousClass04Z extends C005102f {
    public long mobileBytesRx;
    public long mobileBytesTx;
    public long wifiBytesRx;
    public long wifiBytesTx;

    public /* bridge */ /* synthetic */ C005102f A01(C005102f r3) {
        AnonymousClass04Z r32 = (AnonymousClass04Z) r3;
        this.mobileBytesRx = r32.mobileBytesRx;
        this.mobileBytesTx = r32.mobileBytesTx;
        this.wifiBytesRx = r32.wifiBytesRx;
        this.wifiBytesTx = r32.wifiBytesTx;
        return this;
    }

    public /* bridge */ /* synthetic */ C005102f A02(C005102f r5, C005102f r6) {
        AnonymousClass04Z r52 = (AnonymousClass04Z) r5;
        AnonymousClass04Z r62 = (AnonymousClass04Z) r6;
        if (r62 == null) {
            r62 = new AnonymousClass04Z();
        }
        if (r52 == null) {
            r62.mobileBytesRx = this.mobileBytesRx;
            r62.mobileBytesTx = this.mobileBytesTx;
            r62.wifiBytesRx = this.wifiBytesRx;
            r62.wifiBytesTx = this.wifiBytesTx;
            return r62;
        }
        r62.mobileBytesTx = this.mobileBytesTx - r52.mobileBytesTx;
        r62.mobileBytesRx = this.mobileBytesRx - r52.mobileBytesRx;
        r62.wifiBytesTx = this.wifiBytesTx - r52.wifiBytesTx;
        r62.wifiBytesRx = this.wifiBytesRx - r52.wifiBytesRx;
        return r62;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass04Z r7 = (AnonymousClass04Z) obj;
            if (!(this.mobileBytesTx == r7.mobileBytesTx && this.mobileBytesRx == r7.mobileBytesRx && this.wifiBytesTx == r7.wifiBytesTx && this.wifiBytesRx == r7.wifiBytesRx)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.mobileBytesTx;
        long j3 = this.mobileBytesRx;
        long j4 = this.wifiBytesTx;
        long j5 = this.wifiBytesRx;
        return (((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetworkMetrics{mobileBytesTx=");
        sb.append(this.mobileBytesTx);
        sb.append(", mobileBytesRx=");
        sb.append(this.mobileBytesRx);
        sb.append(", wifiBytesTx=");
        sb.append(this.wifiBytesTx);
        sb.append(", wifiBytesRx=");
        sb.append(this.wifiBytesRx);
        sb.append('}');
        return sb.toString();
    }
}
