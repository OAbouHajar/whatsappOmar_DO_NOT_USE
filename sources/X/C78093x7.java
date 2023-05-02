package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;

/* renamed from: X.3x7  reason: invalid class name and case insensitive filesystem */
public class C78093x7 extends C51742cC {
    public final long A00;
    public final long A01;
    public final long A02;
    public final DeviceJid A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C78093x7(DeviceJid deviceJid, Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, String str3, String str4, long j2, long j3, long j4, boolean z2) {
        super(jid, str, str2, voipStanzaChildNode);
        this.A03 = deviceJid;
        this.A05 = str3;
        this.A04 = str4;
        this.A01 = j2;
        this.A00 = j3;
        this.A06 = z2;
        this.A02 = j4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0009 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r2 = 1
            r1 = 0
            switch(r0) {
                case -1423461112: goto L_0x000a;
                case -934710369: goto L_0x000d;
                case 105650780: goto L_0x0010;
                case 1063018407: goto L_0x0013;
                case 2035990113: goto L_0x0016;
                default: goto L_0x0009;
            }
        L_0x0009:
            return r2
        L_0x000a:
            java.lang.String r0 = "accept"
            goto L_0x0018
        L_0x000d:
            java.lang.String r0 = "reject"
            goto L_0x0018
        L_0x0010:
            java.lang.String r0 = "offer"
            goto L_0x0018
        L_0x0013:
            java.lang.String r0 = "enc_rekey"
            goto L_0x0018
        L_0x0016:
            java.lang.String r0 = "terminate"
        L_0x0018:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78093x7.A00(java.lang.String):boolean");
    }
}
