package X;

/* renamed from: X.02e  reason: invalid class name and case insensitive filesystem */
public class C005002e extends C005102f {
    public long blkIoTicks;
    public long cancelledWriteBytes;
    public long majorFaults;
    public long rcharBytes;
    public long readBytes;
    public long syscrCount;
    public long syscwCount;
    public long wcharBytes;
    public long writeBytes;

    public /* bridge */ /* synthetic */ C005102f A01(C005102f r1) {
        A03((C005002e) r1);
        return this;
    }

    public /* bridge */ /* synthetic */ C005102f A02(C005102f r5, C005102f r6) {
        C005002e r52 = (C005002e) r5;
        C005002e r62 = (C005002e) r6;
        if (r62 == null) {
            r62 = new C005002e();
        }
        if (r52 == null) {
            r62.A03(this);
            return r62;
        }
        r62.rcharBytes = this.rcharBytes - r52.rcharBytes;
        r62.wcharBytes = this.wcharBytes - r52.wcharBytes;
        r62.syscrCount = this.syscrCount - r52.syscrCount;
        r62.syscwCount = this.syscwCount - r52.syscwCount;
        r62.readBytes = this.readBytes - r52.readBytes;
        r62.writeBytes = this.writeBytes - r52.writeBytes;
        r62.cancelledWriteBytes = this.cancelledWriteBytes - r52.cancelledWriteBytes;
        r62.majorFaults = this.majorFaults - r52.majorFaults;
        r62.blkIoTicks = this.blkIoTicks - r52.blkIoTicks;
        return r62;
    }

    public void A03(C005002e r3) {
        this.rcharBytes = r3.rcharBytes;
        this.wcharBytes = r3.wcharBytes;
        this.syscrCount = r3.syscrCount;
        this.syscwCount = r3.syscwCount;
        this.readBytes = r3.readBytes;
        this.writeBytes = r3.writeBytes;
        this.cancelledWriteBytes = r3.cancelledWriteBytes;
        this.majorFaults = r3.majorFaults;
        this.blkIoTicks = r3.blkIoTicks;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C005002e r7 = (C005002e) obj;
            if (!(r7.rcharBytes == this.rcharBytes && r7.wcharBytes == this.wcharBytes && r7.syscrCount == this.syscrCount && r7.syscwCount == this.syscwCount && r7.readBytes == this.readBytes && r7.writeBytes == this.writeBytes && r7.cancelledWriteBytes == this.cancelledWriteBytes && r7.majorFaults == this.majorFaults && r7.blkIoTicks == this.blkIoTicks)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.rcharBytes;
        long j3 = this.wcharBytes;
        long j4 = this.syscrCount;
        long j5 = this.syscwCount;
        long j6 = this.readBytes;
        long j7 = this.writeBytes;
        long j8 = this.cancelledWriteBytes;
        long j9 = this.majorFaults;
        long j10 = this.blkIoTicks;
        return (((((((((((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DiskMetrics{rcharBytes=");
        sb.append(this.rcharBytes);
        sb.append(", wcharBytes=");
        sb.append(this.wcharBytes);
        sb.append(", syscrCount=");
        sb.append(this.syscrCount);
        sb.append(", syscwCount=");
        sb.append(this.syscwCount);
        sb.append(", readBytes=");
        sb.append(this.readBytes);
        sb.append(", writeBytes=");
        sb.append(this.writeBytes);
        sb.append(", cancelledWriteBytes=");
        sb.append(this.cancelledWriteBytes);
        sb.append(", majorFaults=");
        sb.append(this.majorFaults);
        sb.append(", blkIoTicks=");
        sb.append(this.blkIoTicks);
        sb.append("}");
        return sb.toString();
    }
}
