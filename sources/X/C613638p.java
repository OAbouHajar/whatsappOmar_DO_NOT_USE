package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import java.util.Map;

/* renamed from: X.38p  reason: invalid class name and case insensitive filesystem */
public class C613638p {
    public final byte A00;
    public final Jid A01;
    public final VoipStanzaChildNode A02;
    public final VoipStanzaChildNode A03;
    public final String A04;
    public final Map A05;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        r1 = com.whatsapp.jid.DeviceJid.of(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r1 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r0 = X.C32601gl.A01(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r0 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        r0 = r0.getDataCopy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r6.put(r1, r0);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C613638p(com.whatsapp.jid.Jid r14, java.lang.String r15, com.whatsapp.protocol.VoipStanzaChildNode r16) {
        /*
            r13 = this;
            r13.<init>()
            boolean r0 = X.C16030sJ.A0J(r14)
            if (r0 == 0) goto L_0x00b5
            r13.A01 = r14
            r13.A04 = r15
            r1 = r16
            r13.A03 = r1
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C32601gl.A00(r1)
            r13.A02 = r0
            r7 = 0
            if (r0 == 0) goto L_0x0083
            com.whatsapp.protocol.VoipStanzaChildNode[] r9 = r0.getChildrenCopy()
            r8 = 0
            if (r9 != 0) goto L_0x0032
            java.lang.String r0 = "voip/voipUtil/getRawKeysFromDestination no children under destination"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "no <dest> node"
        L_0x0029:
            X.AnonymousClass00B.A0B(r0, r7)
        L_0x002c:
            X.AnonymousClass00B.A06(r8)
            r13.A05 = r8
            return
        L_0x0032:
            java.util.HashMap r6 = X.AnonymousClass000.A0x()
            int r5 = r9.length
            r4 = 0
        L_0x0038:
            if (r4 >= r5) goto L_0x0081
            r12 = r9[r4]
            X.1lL[] r11 = r12.getAttributesCopy()
            if (r11 != 0) goto L_0x004b
            java.lang.String r0 = "voip/voipUtil/getRawKeysFromDestination no attribute in <to>"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "no attr in <to>"
            goto L_0x0029
        L_0x004b:
            int r10 = r11.length
            r3 = 0
        L_0x004d:
            if (r3 >= r10) goto L_0x0078
            r2 = r11[r3]
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "jid"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0075
            com.whatsapp.jid.Jid r0 = r2.A01
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r0)
            if (r1 == 0) goto L_0x0078
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C32601gl.A01(r12)
            if (r0 == 0) goto L_0x0073
            byte[] r0 = r0.getDataCopy()
        L_0x006d:
            r6.put(r1, r0)
            int r4 = r4 + 1
            goto L_0x0038
        L_0x0073:
            r0 = r8
            goto L_0x006d
        L_0x0075:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0078:
            java.lang.String r0 = "voip/voipUtil/getRawKeysFromDestination no deviceJid in <to>"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "no deviceJid in <to>"
            goto L_0x0029
        L_0x0081:
            r8 = r6
            goto L_0x002c
        L_0x0083:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r7)
            r4 = r0
            java.util.HashMap r3 = X.AnonymousClass000.A0x()
            com.whatsapp.protocol.VoipStanzaChildNode r2 = X.C32601gl.A01(r1)
            if (r2 == 0) goto L_0x00ac
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r14)
            X.AnonymousClass00B.A06(r1)
            byte[] r0 = r2.getDataCopy()
            r3.put(r1, r0)
            java.lang.Byte r0 = X.C32601gl.A03(r2)
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = "invalid retry count!"
            X.AnonymousClass00B.A08(r0)
            r0 = r4
        L_0x00ac:
            byte r0 = r0.byteValue()
            r13.A00 = r0
            r13.A05 = r3
            return
        L_0x00b5:
            java.lang.String r0 = "CallOfferStanza: Wrong jid type: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r14)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613638p.<init>(com.whatsapp.jid.Jid, java.lang.String, com.whatsapp.protocol.VoipStanzaChildNode):void");
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("jid=");
        A0r.append(this.A01);
        A0r.append(" callId=");
        A0r.append(this.A04);
        A0r.append(" payload=");
        A0r.append(this.A03);
        A0r.append(" format=");
        return AnonymousClass000.A0h(this.A02 != null ? "fan-out" : "legacy", A0r);
    }
}
