package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.56L  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56L implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ C40111ta A03;
    public final /* synthetic */ C49042Qm A04;
    public final /* synthetic */ byte[] A05;

    public /* synthetic */ AnonymousClass56L(UserJid userJid, C40111ta r2, C49042Qm r3, byte[] bArr, int i2, long j2) {
        this.A04 = r3;
        this.A02 = userJid;
        this.A05 = bArr;
        this.A00 = i2;
        this.A03 = r2;
        this.A01 = j2;
    }

    public final void run() {
        C49042Qm r2 = this.A04;
        UserJid userJid = this.A02;
        byte[] bArr = this.A05;
        int i2 = this.A00;
        C40111ta r4 = this.A03;
        long j2 = this.A01;
        StringBuilder A0r = AnonymousClass000.A0r("recvmessagelistener/on-get-biz-vname-cert jid=");
        A0r.append(userJid);
        A0r.append(" certBlob=[");
        A0r.append(bArr != null ? Integer.valueOf(bArr.length) : "null");
        A0r.append("] vlevel=");
        A0r.append(i2);
        A0r.append(". privactMode=");
        A0r.append(r4);
        C13680ns.A1V(A0r);
        ((AnonymousClass13W) r2.A02.get()).A00(userJid, r4, bArr, i2, j2);
    }
}
