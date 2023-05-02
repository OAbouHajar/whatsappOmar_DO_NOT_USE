package X;

/* renamed from: X.16u  reason: invalid class name and case insensitive filesystem */
public class C221416u {
    public final C16040sK A00;
    public final C18020w1 A01;
    public final C16000sG A02;
    public final C17030uP A03;
    public final C16440t3 A04;
    public final C208211s A05;
    public final AnonymousClass16P A06;
    public final C16900tq A07;
    public final C17310us A08;
    public final AnonymousClass11G A09;
    public final C19810z2 A0A;

    public C221416u(C16040sK r1, C18020w1 r2, C16000sG r3, C17030uP r4, C16440t3 r5, C208211s r6, AnonymousClass16P r7, C16900tq r8, C17310us r9, AnonymousClass11G r10, C19810z2 r11) {
        this.A04 = r5;
        this.A00 = r1;
        this.A09 = r10;
        this.A06 = r7;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A0A = r11;
        this.A03 = r4;
        this.A07 = r8;
        this.A08 = r9;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x023b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C16740tZ r21, boolean r22) {
        /*
            r20 = this;
            r5 = r21
            if (r21 == 0) goto L_0x002a
            java.lang.String r1 = "status-participant-user-manager/updateParticipantsTableForNewStatus/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            X.1Vw r1 = r5.A11
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0rv r8 = r1.A00
        L_0x001a:
            boolean r0 = X.C16030sJ.A0Q(r8)
            X.AnonymousClass00B.A0F(r0)
            r9 = r20
            X.0tq r0 = r9.A07
            X.0tf r19 = r0.A02()
            goto L_0x0033
        L_0x002a:
            java.lang.String r0 = "status-participant-user-manager/updateParticipantsTableForNewStatus"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1kq r8 = X.C34771kq.A00
            goto L_0x001a
        L_0x0033:
            X.1cj r18 = r19.A00()     // Catch:{ all -> 0x023c }
            if (r22 == 0) goto L_0x003c
            if (r21 == 0) goto L_0x003c
            goto L_0x004b
        L_0x003c:
            X.11G r0 = r9.A09     // Catch:{ all -> 0x0237 }
            int r6 = r0.A02()     // Catch:{ all -> 0x0237 }
            java.util.List r3 = r0.A08()     // Catch:{ all -> 0x0237 }
            java.util.List r1 = r0.A09()     // Catch:{ all -> 0x0237 }
            goto L_0x005e
        L_0x004b:
            X.0sK r0 = r9.A00     // Catch:{ all -> 0x0237 }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x0237 }
            if (r0 != 0) goto L_0x003c
            X.1m6 r0 = r5.A0K     // Catch:{ all -> 0x0237 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0237 }
            int r6 = r0.A00     // Catch:{ all -> 0x0237 }
            java.util.List r3 = r0.A01     // Catch:{ all -> 0x0237 }
            java.util.List r1 = r0.A02     // Catch:{ all -> 0x0237 }
        L_0x005e:
            X.0us r7 = r9.A08     // Catch:{ all -> 0x0237 }
            X.1kq r10 = X.C34771kq.A00     // Catch:{ all -> 0x0237 }
            java.util.Set r11 = r7.A06(r10)     // Catch:{ all -> 0x0237 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0237 }
            r2.<init>()     // Catch:{ all -> 0x0237 }
            r0 = 2
            if (r6 == r0) goto L_0x00b2
            if (r6 == 0) goto L_0x00b2
            r0 = 1
            if (r6 != r0) goto L_0x00a9
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x0237 }
            r6.<init>()     // Catch:{ all -> 0x0237 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0237 }
        L_0x007c:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0237 }
            if (r0 == 0) goto L_0x0115
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0237 }
            X.0rv r1 = (X.C15830rv) r1     // Catch:{ all -> 0x0237 }
            com.whatsapp.jid.UserJid r3 = com.whatsapp.jid.UserJid.of(r1)     // Catch:{ all -> 0x0237 }
            X.0sG r0 = r9.A02     // Catch:{ all -> 0x0237 }
            X.0sH r1 = r0.A08(r1)     // Catch:{ all -> 0x0237 }
            if (r3 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x007c
            X.1ko r0 = r1.A0D     // Catch:{ all -> 0x0237 }
            if (r0 == 0) goto L_0x007c
            X.0uP r0 = r9.A03     // Catch:{ all -> 0x0237 }
            boolean r0 = r0.A02(r3)     // Catch:{ all -> 0x0237 }
            if (r0 != 0) goto L_0x007c
            r6.add(r3)     // Catch:{ all -> 0x0237 }
            r2.add(r1)     // Catch:{ all -> 0x0237 }
            goto L_0x007c
        L_0x00a9:
            java.lang.String r1 = "unknown status distribution mode"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0237 }
            r0.<init>(r1)     // Catch:{ all -> 0x0237 }
            throw r0     // Catch:{ all -> 0x0237 }
        L_0x00b2:
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0237 }
            r4.<init>()     // Catch:{ all -> 0x0237 }
            if (r6 == 0) goto L_0x00d1
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0237 }
        L_0x00bd:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0237 }
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0237 }
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0     // Catch:{ all -> 0x0237 }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x0237 }
            r4.add(r0)     // Catch:{ all -> 0x0237 }
            goto L_0x00bd
        L_0x00d1:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0237 }
            r3.<init>()     // Catch:{ all -> 0x0237 }
            X.0sG r0 = r9.A02     // Catch:{ all -> 0x0237 }
            r0.A0U(r3)     // Catch:{ all -> 0x0237 }
            int r1 = r3.size()     // Catch:{ all -> 0x0237 }
            r0 = 1065353216(0x3f800000, float:1.0)
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x0237 }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x0237 }
            java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x0237 }
        L_0x00ea:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0237 }
            if (r0 == 0) goto L_0x0115
            java.lang.Object r3 = r12.next()     // Catch:{ all -> 0x0237 }
            X.0sH r3 = (X.C16010sH) r3     // Catch:{ all -> 0x0237 }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r3.A08(r0)     // Catch:{ all -> 0x0237 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0237 }
            if (r1 == 0) goto L_0x00ea
            boolean r0 = r4.contains(r1)     // Catch:{ all -> 0x0237 }
            if (r0 != 0) goto L_0x00ea
            X.0uP r0 = r9.A03     // Catch:{ all -> 0x0237 }
            boolean r0 = r0.A02(r1)     // Catch:{ all -> 0x0237 }
            if (r0 != 0) goto L_0x00ea
            r6.add(r1)     // Catch:{ all -> 0x0237 }
            r2.add(r3)     // Catch:{ all -> 0x0237 }
            goto L_0x00ea
        L_0x0115:
            X.0t3 r13 = r9.A04     // Catch:{ all -> 0x0237 }
            long r15 = r13.A00()     // Catch:{ all -> 0x0237 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r15 = r15 + r0
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0237 }
            r12.<init>()     // Catch:{ all -> 0x0237 }
            java.util.Iterator r14 = r2.iterator()     // Catch:{ all -> 0x0237 }
        L_0x0128:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0237 }
            if (r0 == 0) goto L_0x0148
            java.lang.Object r4 = r14.next()     // Catch:{ all -> 0x0237 }
            X.0sH r4 = (X.C16010sH) r4     // Catch:{ all -> 0x0237 }
            long r0 = r4.A09     // Catch:{ all -> 0x0237 }
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 >= 0) goto L_0x0128
            long r0 = r13.A00()     // Catch:{ all -> 0x0237 }
            r2 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 + r2
            r4.A09 = r0     // Catch:{ all -> 0x0237 }
            r12.add(r4)     // Catch:{ all -> 0x0237 }
            goto L_0x0128
        L_0x0148:
            X.0sG r0 = r9.A02     // Catch:{ all -> 0x0237 }
            r0.A0W(r12)     // Catch:{ all -> 0x0237 }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0237 }
            r4.<init>(r11)     // Catch:{ all -> 0x0237 }
            r4.removeAll(r6)     // Catch:{ all -> 0x0237 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0237 }
            r3.<init>(r6)     // Catch:{ all -> 0x0237 }
            r3.removeAll(r11)     // Catch:{ all -> 0x0237 }
            X.0sK r15 = r9.A00     // Catch:{ all -> 0x0237 }
            r15.A0B()     // Catch:{ all -> 0x0237 }
            X.1ZT r11 = r15.A05     // Catch:{ all -> 0x0237 }
            X.AnonymousClass00B.A06(r11)     // Catch:{ all -> 0x0237 }
            r4.remove(r11)     // Catch:{ all -> 0x0237 }
            r3.add(r11)     // Catch:{ all -> 0x0237 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x0237 }
            X.0sN r8 = (X.C16060sN) r8     // Catch:{ all -> 0x0237 }
            int r0 = r3.size()     // Catch:{ all -> 0x0237 }
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ all -> 0x0237 }
            r13.<init>(r0)     // Catch:{ all -> 0x0237 }
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0237 }
            if (r0 != 0) goto L_0x01d8
            java.util.Iterator r17 = r3.iterator()     // Catch:{ all -> 0x0237 }
        L_0x0185:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0237 }
            if (r0 == 0) goto L_0x01d8
            java.lang.Object r14 = r17.next()     // Catch:{ all -> 0x0237 }
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14     // Catch:{ all -> 0x0237 }
            X.0z2 r0 = r9.A0A     // Catch:{ all -> 0x0237 }
            java.util.Set r1 = r0.A0D(r14)     // Catch:{ all -> 0x0237 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0237 }
            r0 = r0 ^ 1
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0237 }
            int r0 = r1.size()     // Catch:{ all -> 0x0237 }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x0237 }
            r12.<init>(r0)     // Catch:{ all -> 0x0237 }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ all -> 0x0237 }
        L_0x01ad:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0237 }
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r2 = r16.next()     // Catch:{ all -> 0x0237 }
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2     // Catch:{ all -> 0x0237 }
            r1 = 0
            X.1sh r0 = new X.1sh     // Catch:{ all -> 0x0237 }
            r0.<init>(r2, r1, r1)     // Catch:{ all -> 0x0237 }
            r12.add(r0)     // Catch:{ all -> 0x0237 }
            goto L_0x01ad
        L_0x01c3:
            boolean r0 = r15.A0I(r14)     // Catch:{ all -> 0x0237 }
            r2 = 0
            r1 = 0
            if (r0 == 0) goto L_0x01cc
            r1 = 2
        L_0x01cc:
            X.1ck r0 = new X.1ck     // Catch:{ all -> 0x0237 }
            r0.<init>(r14, r12, r1, r2)     // Catch:{ all -> 0x0237 }
            r7.A08(r0, r8)     // Catch:{ all -> 0x0237 }
            r13.add(r0)     // Catch:{ all -> 0x0237 }
            goto L_0x0185
        L_0x01d8:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0237 }
            if (r0 != 0) goto L_0x01e6
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0237 }
            r0.<init>(r4)     // Catch:{ all -> 0x0237 }
            r7.A0D(r8, r0)     // Catch:{ all -> 0x0237 }
        L_0x01e6:
            X.1cE r12 = r7.A04(r10)     // Catch:{ all -> 0x0237 }
            r12.A0J(r13)     // Catch:{ all -> 0x0237 }
            r12.A0K(r4)     // Catch:{ all -> 0x0237 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0237 }
            if (r0 != 0) goto L_0x0204
            X.16P r2 = r9.A06     // Catch:{ all -> 0x0237 }
            r0 = 9
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r1 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1     // Catch:{ all -> 0x0237 }
            r1.<init>(r9, r12, r10, r0)     // Catch:{ all -> 0x0237 }
            java.util.concurrent.ThreadPoolExecutor r0 = r2.A00     // Catch:{ all -> 0x0237 }
            r0.submit(r1)     // Catch:{ all -> 0x0237 }
        L_0x0204:
            if (r21 == 0) goto L_0x021e
            java.util.Set r0 = r7.A06(r8)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = X.C30361cE.A00(r0)     // Catch:{ all -> 0x0237 }
            r5.A0m = r0     // Catch:{ all -> 0x0237 }
            boolean r0 = r6.contains(r11)     // Catch:{ all -> 0x0237 }
            if (r0 == 0) goto L_0x022b
            int r0 = r6.size()     // Catch:{ all -> 0x0237 }
            int r0 = r0 + -1
        L_0x021c:
            r5.A0A = r0     // Catch:{ all -> 0x0237 }
        L_0x021e:
            r3.size()     // Catch:{ all -> 0x0237 }
            r4.size()     // Catch:{ all -> 0x0237 }
            r6.size()     // Catch:{ all -> 0x0237 }
            r18.A00()     // Catch:{ all -> 0x0237 }
            goto L_0x0230
        L_0x022b:
            int r0 = r6.size()     // Catch:{ all -> 0x0237 }
            goto L_0x021c
        L_0x0230:
            r18.close()     // Catch:{ all -> 0x023c }
            r19.close()
            return
        L_0x0237:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x023b }
        L_0x023b:
            throw r0     // Catch:{ all -> 0x023c }
        L_0x023c:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x0240 }
        L_0x0240:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C221416u.A00(X.0tZ, boolean):void");
    }
}
