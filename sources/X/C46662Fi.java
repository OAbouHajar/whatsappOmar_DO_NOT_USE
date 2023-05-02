package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.2Fi  reason: invalid class name and case insensitive filesystem */
public class C46662Fi {
    public final long A00;
    public final long A01;
    public final long A02;
    public final DeviceJid A03;
    public final UserJid A04;
    public final C16740tZ A05;
    public final C34421kE A06;
    public final Runnable A07;
    public final Set A08;
    public final boolean A09;
    public final boolean A0A;

    public C46662Fi(DeviceJid deviceJid, UserJid userJid, C16740tZ r3, C34421kE r4, Runnable runnable, Set set, long j2, long j3, long j4, boolean z2, boolean z3) {
        this.A05 = r3;
        this.A03 = deviceJid;
        this.A04 = userJid;
        this.A08 = set;
        this.A0A = z2;
        this.A09 = z3;
        this.A01 = j2;
        this.A02 = j3;
        this.A00 = j4;
        this.A07 = runnable;
        this.A06 = r4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SendMessageParams{message=");
        sb.append(this.A05);
        sb.append(", remoteJidForRetry=");
        sb.append(this.A03);
        sb.append(", recipientJid=");
        sb.append(this.A04);
        sb.append(", targetDevices=");
        sb.append(this.A08);
        sb.append(", resend=");
        sb.append(this.A0A);
        sb.append(", offline=");
        sb.append(this.A09);
        sb.append(", originalTimestamp=");
        sb.append(this.A01);
        sb.append(", sendExpirationMs=");
        sb.append(this.A02);
        sb.append(", messageSendStartTime=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
