package X;

import com.obwhatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.1Gq  reason: invalid class name and case insensitive filesystem */
public class C24621Gq {
    public final C16040sK A00;
    public final C19000xb A01;
    public final AnonymousClass1RL A02;
    public final C16440t3 A03;
    public final AnonymousClass19M A04;
    public final C14710pd A05;
    public final C224718b A06;

    public C24621Gq(C16040sK r1, C19000xb r2, AnonymousClass1RL r3, C16440t3 r4, AnonymousClass19M r5, C14710pd r6, C224718b r7) {
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
    }

    public void A00(DeviceJid deviceJid, Set set) {
        StringBuilder sb = new StringBuilder("NonMessageDataRequestSendMethod/sendDataRequestMessage type=");
        sb.append(0);
        sb.append("; size=");
        sb.append(set.size());
        Log.i(sb.toString());
        if (!set.isEmpty()) {
            C14710pd r1 = this.A05;
            C16620tM r7 = C16620tM.A02;
            if (!r1.A0E(r7, 2155)) {
                Log.w("NonMessageDataRequestSendMethod/sendDataRequestMessage gate is not enabled");
                return;
            }
            C16040sK r0 = this.A00;
            r0.A0B();
            AnonymousClass1ZT r4 = r0.A05;
            C224718b r3 = this.A06;
            C37471pD r32 = new C37471pD(r3.A02(r4, true), this.A03.A00());
            r32.A00 = deviceJid;
            r32.A00 = 0;
            r32.A01 = set;
            if (this.A04.A01(r32) < 0) {
                Log.e("NonMessageDataRequestSendMethod/sendDataRequestMessage unable to add peer message");
                return;
            }
            this.A01.A00(new SendPeerMessageJob(deviceJid, r32, (byte[]) null, 0));
            AnonymousClass1RL r5 = this.A02;
            int size = set.size();
            String str = r32.A11.A01;
            if (r5.A00.A0E(r7, 2573)) {
                AnonymousClass25A r2 = new AnonymousClass25A();
                r2.A00 = 0;
                r2.A01 = Long.valueOf((long) size);
                r2.A02 = str;
                r5.A01.A06(r2);
            }
        }
    }
}
