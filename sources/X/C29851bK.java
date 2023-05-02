package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Arrays;

/* renamed from: X.1bK  reason: invalid class name and case insensitive filesystem */
public class C29851bK {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final AnonymousClass1WM A0C;
    public final DeviceJid A0D;

    public C29851bK(AnonymousClass1WM r3, DeviceJid deviceJid, int i2, int i3, int i4, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.A06 = j2;
        this.A0D = deviceJid;
        this.A02 = i2;
        this.A04 = j3;
        this.A0A = j4;
        this.A0B = j5;
        this.A08 = j6;
        this.A00 = i3;
        this.A07 = j7;
        this.A03 = j8;
        this.A01 = i4;
        this.A05 = j9;
        this.A0C = r3;
        this.A09 = j10;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C29851bK r7 = (C29851bK) obj;
            if (!(this.A02 == r7.A02 && this.A04 == r7.A04 && this.A0A == r7.A0A && this.A0B == r7.A0B && this.A08 == r7.A08 && this.A00 == r7.A00 && this.A07 == r7.A07 && this.A03 == r7.A03 && this.A0D.equals(r7.A0D) && this.A01 == r7.A01 && this.A05 == r7.A05 && this.A09 == r7.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0D, Integer.valueOf(this.A02), Long.valueOf(this.A04), Long.valueOf(this.A0A), Long.valueOf(this.A0B), Long.valueOf(this.A08), Integer.valueOf(this.A00), Long.valueOf(this.A07), Long.valueOf(this.A03), Integer.valueOf(this.A01), Long.valueOf(this.A05), Long.valueOf(this.A09)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SyncDatum{deviceJid=");
        sb.append(this.A0D);
        sb.append(", syncType=");
        sb.append(this.A02);
        sb.append(", latestMsgId=");
        sb.append(this.A04);
        sb.append(", stageOldestMsgId=");
        sb.append(this.A0A);
        sb.append(", syncOldestMsgId=");
        sb.append(this.A0B);
        sb.append(", sendMsgsCount=");
        sb.append(this.A08);
        sb.append(", chunkOrder=");
        sb.append(this.A00);
        sb.append(", sentBytes=");
        sb.append(this.A07);
        sb.append(", lastChunkTimestamp=");
        sb.append(this.A03);
        sb.append(", status=");
        sb.append(this.A01);
        sb.append(", peerMsgRowId=");
        sb.append(this.A05);
        sb.append(", bootstrapId=");
        sb.append(this.A0C);
        sb.append(", sizeLimitBytes=");
        sb.append(this.A09);
        sb.append('}');
        return sb.toString();
    }
}
