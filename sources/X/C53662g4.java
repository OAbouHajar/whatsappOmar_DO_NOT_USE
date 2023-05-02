package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.2g4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C53662g4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C30881d7 A02;
    public final /* synthetic */ C15830rv A03;
    public final /* synthetic */ DeviceJid A04;
    public final /* synthetic */ C30821d1 A05;
    public final /* synthetic */ C28001Ty A06;
    public final /* synthetic */ C30641ci A07;
    public final /* synthetic */ String A08;

    public /* synthetic */ C53662g4(C30881d7 r1, C15830rv r2, DeviceJid deviceJid, C30821d1 r4, C28001Ty r5, C30641ci r6, String str, int i2, long j2) {
        this.A06 = r5;
        this.A03 = r2;
        this.A04 = deviceJid;
        this.A00 = i2;
        this.A05 = r4;
        this.A02 = r1;
        this.A01 = j2;
        this.A07 = r6;
        this.A08 = str;
    }

    public final void run() {
        C208211s r2;
        String str;
        C30891d8 A062;
        C28001Ty r12 = this.A06;
        C15830rv r10 = this.A03;
        DeviceJid deviceJid = this.A04;
        int i2 = this.A00;
        C30821d1 r8 = this.A05;
        C30881d7 r7 = this.A02;
        long j2 = this.A01;
        C30641ci r13 = this.A07;
        String str2 = this.A08;
        StringBuilder sb = new StringBuilder("LocationNotificationHandler/onFinalLocationNotification/axolotl received a location notification; jid=");
        sb.append(r10);
        sb.append("senderJid=");
        sb.append(deviceJid);
        sb.append("; retryCount=");
        sb.append(i2);
        Log.i(sb.toString());
        C28861Yb A022 = C28851Ya.A02(deviceJid);
        int i3 = r8.A00;
        if (i3 == 3) {
            C30981dH r6 = new C30981dH(A022, C34941l7.A00.getRawString());
            r2 = r12.A03;
            int i4 = r2.A08(r7, r6, r8.A02).A00;
            if (i4 != 0) {
                StringBuilder sb2 = new StringBuilder("axolotl error while decrypt-group-using-fast-fatchet; status=");
                sb2.append(i4);
                Log.w(sb2.toString());
                if (i4 == -1001) {
                    if (j2 != 0) {
                        return;
                    }
                } else if (i4 == -1005 || i4 == -1008) {
                    str = "axolotl|should try to send retry";
                    Log.w(str);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (i3 == 0) {
                r2 = r12.A03;
                A062 = r2.A05(r7, A022, r8.A02);
            } else if (i3 == 1) {
                r2 = r12.A03;
                A062 = r2.A06(r7, A022, r8.A02);
            } else {
                StringBuilder sb3 = new StringBuilder("LocationNotificationHandler/onFinalLocationNotification/axolotl unrecognized ciphertext type; stanzaKey=");
                sb3.append(r13);
                sb3.append("; type=");
                sb3.append(i3);
                Log.w(sb3.toString());
                return;
            }
            int i5 = A062.A00;
            if (i5 != 0) {
                StringBuilder sb4 = new StringBuilder("axolotl error; status=");
                sb4.append(i5);
                Log.w(sb4.toString());
                if (i5 == -1005 || i5 == -1008 || i5 == -1003 || i5 == -1002) {
                    StringBuilder sb5 = new StringBuilder("axolotl|should try to send retry; status=");
                    sb5.append(i5);
                    str = sb5.toString();
                    Log.w(str);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        r12.A00.A0K(new AnonymousClass3I0(r10, deviceJid, r12, r13, str2, i2, r2.A07.A01()));
    }
}
