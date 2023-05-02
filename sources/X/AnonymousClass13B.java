package X;

/* renamed from: X.13B  reason: invalid class name */
public class AnonymousClass13B {
    public final C215314l A00;
    public final C16040sK A01;
    public final C215414m A02;

    public AnonymousClass13B(C215314l r1, C16040sK r2, C215414m r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public static final void A00(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("expected media key of length 32 bytes.");
        } else if (bArr2.length != 12) {
            throw new IllegalArgumentException("expected iv of length 12 bytes.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C15830rv r13, com.whatsapp.jid.Jid r14, com.whatsapp.jid.UserJid r15, X.C16730tY r16, java.lang.String r17, java.lang.String r18, int r19, boolean r20) {
        /*
            r12 = this;
            r4 = 1
            r8 = r19
            if (r8 == r4) goto L_0x0012
            X.0sK r1 = r12.A01
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r14)
            boolean r0 = r1.A0J(r0)
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            r9 = 0
            r1 = r16
            if (r16 == 0) goto L_0x0113
            X.0ta r0 = r1.A02
            X.AnonymousClass00B.A06(r0)
            byte[] r3 = r0.A0U
            X.AnonymousClass00B.A06(r3)
            X.1Vw r0 = r1.A11
            java.lang.String r2 = r0.A01
            if (r8 != r4) goto L_0x0029
            r9 = r18
        L_0x0029:
            X.2C2 r1 = new X.2C2
            r1.<init>(r2, r9, r8)
            r0 = 12
            byte[] r9 = X.C004101u.A0E(r0)
            A00(r3, r9)
            com.facebook.simplejni.NativeHolder r1 = r1.A00
            r0 = 2
            java.lang.Object r11 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOO(r0, r2, r1, r3, r9)
            byte[] r11 = (byte[]) r11
        L_0x0040:
            X.14m r4 = r12.A02
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r2 = r17
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r3.add(r0)
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r14, (java.lang.String) r1)
            r3.add(r0)
            java.lang.String r2 = "type"
            java.lang.String r1 = "mediaretry"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r3.add(r0)
            java.lang.String r7 = "participant"
            if (r15 == 0) goto L_0x0077
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r15, (java.lang.String) r7)
            r3.add(r0)
        L_0x0077:
            r0 = 2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            r5 = 0
            r10 = 1
            if (r11 == 0) goto L_0x00fe
            if (r9 == 0) goto L_0x00fe
            X.1Vv[] r8 = new X.C28371Vv[r0]
            java.lang.String r1 = "enc_p"
            r2 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (byte[]) r11, (X.C35081lL[]) r2)
            r8[r5] = r0
            java.lang.String r1 = "enc_iv"
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (byte[]) r9, (X.C35081lL[]) r2)
            r8[r10] = r0
            java.lang.String r0 = "encrypt"
            X.1Vv r1 = new X.1Vv
            r1.<init>((java.lang.String) r0, (X.C35081lL[]) r2, (X.C28371Vv[]) r8)
        L_0x009f:
            r6.add(r1)
        L_0x00a2:
            if (r13 == 0) goto L_0x00df
            r0 = 3
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.lang.String r1 = "jid"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r13, (java.lang.String) r1)
            r8.add(r0)
            java.lang.String r2 = java.lang.String.valueOf(r20)
            java.lang.String r1 = "from_me"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            r8.add(r0)
            if (r15 == 0) goto L_0x00cc
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r15, (java.lang.String) r7)
            r8.add(r0)
        L_0x00cc:
            X.1lL[] r0 = X.C215414m.A02
            java.lang.Object[] r2 = r8.toArray(r0)
            X.1lL[] r2 = (X.C35081lL[]) r2
            java.lang.String r1 = "rmr"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r2)
            r6.add(r0)
        L_0x00df:
            X.1lL[] r0 = X.C215414m.A02
            java.lang.Object[] r3 = r3.toArray(r0)
            X.1lL[] r3 = (X.C35081lL[]) r3
            X.1Vv[] r0 = new X.C28371Vv[r5]
            java.lang.Object[] r1 = r6.toArray(r0)
            X.1Vv[] r1 = (X.C28371Vv[]) r1
            java.lang.String r0 = "notification"
            X.1Vv r2 = new X.1Vv
            r2.<init>((java.lang.String) r0, (X.C35081lL[]) r3, (X.C28371Vv[]) r1)
            X.0ug r1 = r4.A01
            r0 = 34
            r1.A0D(r2, r0)
            return
        L_0x00fe:
            if (r8 == r10) goto L_0x00a2
            X.1lL[] r2 = new X.C35081lL[r10]
            java.lang.String r1 = "code"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (int) r8)
            r2[r5] = r0
            java.lang.String r0 = "error"
            X.1Vv r1 = new X.1Vv
            r1.<init>(r0, r2)
            goto L_0x009f
        L_0x0113:
            r11 = r9
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13B.A01(X.0rv, com.whatsapp.jid.Jid, com.whatsapp.jid.UserJid, X.0tY, java.lang.String, java.lang.String, int, boolean):void");
    }
}
