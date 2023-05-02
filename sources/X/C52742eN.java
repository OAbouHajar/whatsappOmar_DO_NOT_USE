package X;

import com.obwhatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.2eN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52742eN implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ DeviceJid A02;
    public final /* synthetic */ C27571Sg A03;
    public final /* synthetic */ C28381Vw A04;
    public final /* synthetic */ C30971dG A05;
    public final /* synthetic */ C30971dG A06;
    public final /* synthetic */ C30641ci A07;
    public final /* synthetic */ C29861bL A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ byte[] A0A;
    public final /* synthetic */ byte[] A0B;
    public final /* synthetic */ byte[] A0C;

    public /* synthetic */ C52742eN(DeviceJid deviceJid, C27571Sg r2, C28381Vw r3, C30971dG r4, C30971dG r5, C30641ci r6, C29861bL r7, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, int i3, boolean z2) {
        this.A03 = r2;
        this.A0A = bArr;
        this.A05 = r4;
        this.A06 = r5;
        this.A02 = deviceJid;
        this.A0B = bArr2;
        this.A04 = r3;
        this.A0C = bArr3;
        this.A01 = i2;
        this.A09 = z2;
        this.A00 = i3;
        this.A08 = r7;
        this.A07 = r6;
    }

    public final void run() {
        C27571Sg r2 = this.A03;
        byte[] bArr = this.A0A;
        C30971dG r9 = this.A05;
        C30971dG r8 = this.A06;
        DeviceJid deviceJid = this.A02;
        byte[] bArr2 = this.A0B;
        C28381Vw r7 = this.A04;
        byte[] bArr3 = this.A0C;
        int i2 = this.A01;
        boolean z2 = this.A09;
        int i3 = this.A00;
        C29861bL r0 = this.A08;
        C30641ci r1 = this.A07;
        if (bArr == null || r9 == null || r8 == null || r2.A05.A0C(deviceJid, bArr2, bArr, (byte) 5, 3)) {
            byte[] A002 = r2.A09.A00(deviceJid, r7, r8, r9, bArr3, bArr, i2, i3, z2);
            StringBuilder sb = new StringBuilder("PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/sending retry for msg = ");
            sb.append(r0);
            sb.append(" device = ");
            sb.append(deviceJid);
            Log.i(sb.toString());
            r2.A01.A00(new SendPeerMessageJob(deviceJid, r0, A002, i2));
        } else {
            StringBuilder sb2 = new StringBuilder("PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/adv validation fails, key=");
            sb2.append(r1);
            Log.e(sb2.toString());
        }
        r2.A08.A02(r1);
    }
}
