package X;

import android.os.Message;
import android.os.Parcelable;
import com.facebook.redex.RunnableRunnableShape0S0301000_I0;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.11r  reason: invalid class name and case insensitive filesystem */
public abstract class C208111r implements C19420yP {
    public final C16300so A00;
    public final C17190ug A01;
    public final C207811o A02;
    public final AnonymousClass1WA A03;
    public final Set A04 = new HashSet();
    public final AtomicReference A05 = new AtomicReference();
    public final boolean A06;
    public final int[] A07;

    public C208111r(C16300so r3, C17190ug r4, C207811o r5, C16320sq r6, int[] iArr, boolean z2) {
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A07 = iArr;
        this.A06 = z2;
        this.A03 = z2 ? new AnonymousClass1WA(r6, false) : null;
    }

    public final C30641ci A00() {
        Object andSet = this.A05.getAndSet((Object) null);
        AnonymousClass00B.A06(andSet);
        C30641ci r1 = (C30641ci) andSet;
        this.A04.add(r1);
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04ca, code lost:
        if ("true".equals(r6.A0M("from_me")) == false) goto L_0x04cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x050d  */
    /* JADX WARNING: Removed duplicated region for block: B:480:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C28371Vv r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            boolean r1 = r0 instanceof X.AnonymousClass1SE
            r5 = r20
            r2 = r21
            if (r1 == 0) goto L_0x005d
            X.1SE r0 = (X.AnonymousClass1SE) r0
            r1 = 251(0xfb, float:3.52E-43)
            if (r2 != r1) goto L_0x005c
            X.1Vv r5 = r5.A0H()
            java.lang.String r1 = "device_logout"
            boolean r1 = X.C28371Vv.A07(r5, r1)
            if (r1 == 0) goto L_0x093b
            java.lang.String r2 = "t"
            java.lang.String r1 = r5.A0M(r2)
            long r2 = r5.A0E(r1, r2)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            java.lang.String r1 = "id"
            java.lang.String r7 = r5.A0M(r1)
            java.lang.String r4 = "device"
            r1 = 0
            java.lang.String r6 = r5.A0N(r4, r1)
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x0925
            X.1Zk r4 = new X.1Zk
            r4.<init>(r6, r7, r2)
            X.0yx r3 = r0.A02
            X.0pd r2 = r3.A0Y
            r1 = 2466(0x9a2, float:3.456E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x005c
            X.0pt r2 = r3.A04
            r1 = 18
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r0.<init>(r3, r1, r4)
            r2.Acq(r0)
        L_0x005c:
            return
        L_0x005d:
            boolean r1 = r0 instanceof X.AnonymousClass123
            if (r1 == 0) goto L_0x020e
            X.123 r0 = (X.AnonymousClass123) r0
            r1 = 189(0xbd, float:2.65E-43)
            if (r2 != r1) goto L_0x005c
            r1 = 0
            X.1Vv r6 = r5.A0I(r1)
            if (r6 == 0) goto L_0x005c
            java.lang.Class<X.0rv> r1 = X.C15830rv.class
            X.0so r8 = r0.A00
            java.lang.String r4 = "jid"
            com.whatsapp.jid.Jid r3 = r6.A0F(r8, r1, r4)
            X.0rv r3 = (X.C15830rv) r3
            if (r3 == 0) goto L_0x01db
            java.lang.String r1 = "t"
            r9 = 0
            java.lang.String r4 = r5.A0N(r1, r9)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = X.C29501aj.A01(r4, r1)
            java.lang.Class<com.whatsapp.jid.UserJid> r7 = com.whatsapp.jid.UserJid.class
            java.lang.String r4 = "author"
            com.whatsapp.jid.Jid r7 = r6.A0F(r8, r7, r4)
            X.0rv r7 = (X.C15830rv) r7
            java.lang.String r8 = "id"
            java.lang.String r10 = r5.A0M(r8)
            java.lang.String r4 = "set"
            boolean r4 = X.C28371Vv.A07(r6, r4)
            if (r4 == 0) goto L_0x00fa
            java.lang.String r5 = r6.A0N(r8, r9)
            r4 = -1
            int r9 = X.C29501aj.A00(r5, r4)
        L_0x00ae:
            java.lang.String r4 = r3.getRawString()
            r5 = 2
            java.lang.Object r5 = com.obwhatsapp.yo.yo.A00(r5)
            X.0sK r5 = (X.C16040sK) r5
            com.obwhatsapp.Me r5 = r5.A00
            java.lang.String r5 = r5.jabber_id
            com.OM7753.GOLD.A0C(r4, r5)
            java.lang.String r4 = "ProfilePictureNotificationHandler/onProfilePhotoChange "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            r5.append(r3)
            java.lang.String r4 = " author:"
            r5.append(r4)
            r5.append(r7)
            java.lang.String r4 = " photoId:"
            r5.append(r4)
            r5.append(r9)
            java.lang.String r4 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r4)
            X.0sG r4 = r0.A02
            X.0sH r8 = r4.A0A(r3)
            X.0sK r4 = r0.A01
            r4.A0B()
            X.1ZT r4 = r4.A05
            if (r4 == 0) goto L_0x0a04
            int r4 = r8.A04
            if (r4 != r9) goto L_0x0104
            int r4 = r8.A05
            if (r4 != r9) goto L_0x0104
            return
        L_0x00fa:
            java.lang.String r4 = "delete"
            boolean r4 = X.C28371Vv.A07(r6, r4)
            if (r4 == 0) goto L_0x01a7
            r9 = -1
            goto L_0x00ae
        L_0x0104:
            X.121 r12 = r0.A07
            r6 = 1
            X.0sG r4 = r12.A06
            X.0sH r11 = r4.A0A(r3)
            int r4 = r11.A04
            if (r4 != r9) goto L_0x0115
            int r4 = r11.A05
            if (r4 == r9) goto L_0x011d
        L_0x0115:
            r4 = -1
            if (r9 != r4) goto L_0x0139
            X.12A r4 = r12.A0A
            r4.A03(r3)
        L_0x011d:
            boolean r4 = r8.A0J()
            if (r4 == 0) goto L_0x005c
            X.120 r4 = r0.A03
            java.io.File r5 = r4.A01(r8)
            if (r5 == 0) goto L_0x0152
            boolean r4 = r5.exists()
            if (r4 == 0) goto L_0x0152
            com.obwhatsapp.data.ProfilePhotoChange r8 = new com.obwhatsapp.data.ProfilePhotoChange
            r8.<init>()
            r8.newPhotoId = r9
            goto L_0x0144
        L_0x0139:
            X.11y r5 = r12.A00
            com.facebook.redex.RunnableRunnableShape0S0311000_I0 r4 = new com.facebook.redex.RunnableRunnableShape0S0311000_I0
            r4.<init>(r11, r3, r12, r9)
            r5.A01(r4)
            goto L_0x011d
        L_0x0144:
            byte[] r4 = X.C29301aP.A00(r5)     // Catch:{ IOException -> 0x014b }
            r8.oldPhoto = r4     // Catch:{ IOException -> 0x014b }
            goto L_0x0153
        L_0x014b:
            r5 = move-exception
            java.lang.String r4 = "app/xmpp/recv/handle_profile_photo_changed/"
            com.whatsapp.util.Log.w(r4, r5)
            goto L_0x0153
        L_0x0152:
            r8 = 0
        L_0x0153:
            r4 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r4
            X.1Vw r4 = new X.1Vw
            r4.<init>(r3, r10, r6)
            X.1sH r5 = new X.1sH
            r5.<init>(r4, r1)
            r1 = -1
            if (r9 != r1) goto L_0x01a2
            r1 = 0
        L_0x0164:
            r5.A0k(r1)
            r5.A0b(r7)
            r5.A00 = r8
            X.0yz r1 = r0.A06
            X.0tZ r4 = r1.A01(r3)
            boolean r1 = r4 instanceof X.AnonymousClass1WU
            if (r1 == 0) goto L_0x019a
            X.1WU r4 = (X.AnonymousClass1WU) r4
            int r3 = r4.A00
            r1 = 11
            r2 = 0
            if (r3 != r1) goto L_0x0180
            r2 = 1
        L_0x0180:
            X.0rv r1 = r5.A0B()
            if (r1 == 0) goto L_0x01a0
            boolean r1 = r4.A12()
            if (r1 == 0) goto L_0x01a0
            X.0rv r1 = r4.A0B()
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x01a0
        L_0x0196:
            if (r2 == 0) goto L_0x019a
            if (r6 != 0) goto L_0x005c
        L_0x019a:
            X.0t6 r0 = r0.A05
            r0.A0W(r5)
            return
        L_0x01a0:
            r6 = 0
            goto L_0x0196
        L_0x01a2:
            java.lang.String r1 = java.lang.Integer.toString(r9)
            goto L_0x0164
        L_0x01a7:
            java.lang.String r1 = "request"
            boolean r1 = X.C28371Vv.A07(r6, r1)
            if (r1 == 0) goto L_0x005c
            java.lang.String r2 = "ProfilePictureNotificationHandler/onProfilePhotoLost "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r1 = X.AnonymousClass27A.A00(r3)
            if (r1 != 0) goto L_0x005c
            X.0sK r1 = r0.A01
            r1.A0B()
            X.1Zb r2 = r1.A01
            if (r2 == 0) goto L_0x005c
            boolean r1 = r1.A0I(r3)
            if (r1 == 0) goto L_0x005c
            X.121 r0 = r0.A07
            r0.A09(r2)
            return
        L_0x01db:
            java.lang.String r1 = "hash"
            r3 = 0
            java.lang.String r2 = r6.A0N(r1, r3)
            if (r2 == 0) goto L_0x0a0c
            X.27w r4 = X.C453027w.A0I
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x005c
            byte[] r2 = r2.getBytes()
            r1 = 0
            byte[] r3 = android.util.Base64.decode(r2, r1)
            java.util.Arrays.toString(r3)
            X.1kz r2 = X.C34861kz.A0H
            X.27v r1 = new X.27v
            r1.<init>(r2)
            r2 = 1
            r1.A02 = r2
            r1.A00 = r4
            r1.A02(r3)
            X.27t r1 = r1.A01()
            X.0xz r0 = r0.A04
            goto L_0x0264
        L_0x020e:
            boolean r1 = r0 instanceof X.C27801Te
            if (r1 == 0) goto L_0x02b0
            X.1Te r0 = (X.C27801Te) r0
            r1 = 236(0xec, float:3.31E-43)
            if (r2 != r1) goto L_0x005c
            r1 = 0
            X.1Vv r4 = r5.A0I(r1)
            if (r4 == 0) goto L_0x005c
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            X.0so r2 = r0.A00
            java.lang.String r1 = "from"
            com.whatsapp.jid.Jid r7 = r5.A0F(r2, r3, r1)
            java.lang.String r1 = "set"
            boolean r1 = X.C28371Vv.A07(r4, r1)
            if (r1 == 0) goto L_0x0286
            java.lang.String r1 = "hash"
            r3 = 0
            java.lang.String r2 = r4.A0N(r1, r3)
            if (r2 == 0) goto L_0x0268
            X.27w r4 = X.C453027w.A0J
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x005c
            byte[] r2 = r2.getBytes()
            r1 = 0
            byte[] r3 = android.util.Base64.decode(r2, r1)
            java.util.Arrays.toString(r3)
            X.1kz r2 = X.C34861kz.A0H
            X.27v r1 = new X.27v
            r1.<init>(r2)
            r2 = 1
            r1.A02 = r2
            r1.A00 = r4
            r1.A02(r3)
            X.27t r1 = r1.A01()
            X.0xz r0 = r0.A01
        L_0x0264:
            r0.A03(r1, r2)
            return
        L_0x0268:
            java.lang.String r6 = r4.A0L()
            java.lang.String r1 = "t"
            java.lang.String r1 = r5.A0N(r1, r3)
            if (r1 == 0) goto L_0x005c
            long r3 = java.lang.Long.parseLong(r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r7)
            X.0sG r0 = r0.A00
            r0.A0T(r1, r6, r3)
            return
        L_0x0286:
            java.lang.String r1 = "delete"
            boolean r1 = X.C28371Vv.A07(r4, r1)
            if (r1 == 0) goto L_0x005c
            com.whatsapp.jid.UserJid r5 = com.whatsapp.jid.UserJid.of(r7)
            X.0sG r4 = r0.A00
            X.18c r3 = r4.A06
            r1 = 0
            r0 = 0
            r3.A0N(r5, r0, r1)
            X.1kv r0 = r4.A04
            java.util.Map r0 = r0.A01
            r0.remove(r5)
            android.os.Handler r2 = r4.A00
            r1 = 32
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r4, r1, r5)
            r2.post(r0)
            return
        L_0x02b0:
            boolean r1 = r0 instanceof X.C27811Tf
            if (r1 == 0) goto L_0x0350
            X.1Tf r0 = (X.C27811Tf) r0
            r1 = 235(0xeb, float:3.3E-43)
            if (r2 != r1) goto L_0x005c
            r1 = 0
            X.1Vv r3 = r5.A0I(r1)
            if (r3 == 0) goto L_0x005c
            java.lang.String r1 = "log"
            boolean r1 = X.C28371Vv.A07(r3, r1)
            if (r1 == 0) goto L_0x02f4
            X.1Bb r3 = r0.A03
            r3.A06()
            X.0tz r1 = r0.A00
            android.content.Context r4 = r1.A00
            java.lang.String r7 = ""
            r5 = 0
            r2 = 1
            r13 = -1
            java.lang.String r10 = "NotCalculated"
            r18 = 0
            r8 = r5
            r9 = r5
            r11 = r5
            r12 = r5
            r15 = -1
            r17 = 1
            r6 = r5
            java.lang.String r1 = r3.A03(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0so r1 = r0.A00
            java.lang.String r0 = "AppMessagingXmppHandler/onLogNotification"
            r1.AcB(r0, r5, r2)
            return
        L_0x02f4:
            java.lang.String r1 = "props"
            boolean r1 = X.C28371Vv.A07(r3, r1)
            if (r1 == 0) goto L_0x0303
            X.124 r1 = r0.A02
            r0 = 1
            r1.A06(r0)
            return
        L_0x0303:
            java.lang.String r1 = "abprops"
            boolean r1 = X.C28371Vv.A07(r3, r1)
            if (r1 == 0) goto L_0x0326
            X.1Hh r2 = r0.A01
            r1 = 1
            X.0tK r0 = r2.A00
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = "sendmethods/sendGetABProps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01J r0 = r2.A01
            java.lang.Object r0 = r0.get()
            X.1Tt r0 = (X.C27951Tt) r0
            r0.A00(r1)
            return
        L_0x0326:
            java.lang.String r1 = "push-config"
            boolean r1 = X.C28371Vv.A07(r3, r1)
            if (r1 == 0) goto L_0x005c
            java.lang.String r2 = "type"
            r1 = 0
            java.lang.String r2 = r3.A0N(r2, r1)
            if (r2 == 0) goto L_0x0a1f
            java.lang.String r1 = "gcm"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0a1f
            java.lang.String r1 = "push-config notification: unknown type "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x05eb
        L_0x0350:
            boolean r1 = r0 instanceof X.AnonymousClass1TW
            if (r1 == 0) goto L_0x04a5
            X.1TW r0 = (X.AnonymousClass1TW) r0
            java.lang.String r1 = "from"
            r10 = 0
            java.lang.String r2 = r5.A0N(r1, r10)
            if (r2 == 0) goto L_0x03bf
            java.lang.String r1 = "0@s.whatsapp.net"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x03bf
            java.lang.String r1 = "banner"
            java.util.List r1 = r5.A0O(r1)
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0382
            java.lang.String r1 = "PSANotificationHandler/InAppBanner Notification"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0pd r1 = r0.A0F
            r0 = 2871(0xb37, float:4.023E-42)
            r1.A0C(r0)
            return
        L_0x0382:
            X.0pd r3 = r0.A0F
            r2 = 1844(0x734, float:2.584E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r1 = r3.A0E(r1, r2)
            if (r1 == 0) goto L_0x005c
            r1 = 0
            X.1Vv r1 = r5.A0I(r1)
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = "revoke"
            java.util.List r7 = r5.A0O(r1)
            X.1ci r6 = r0.A00()
            r4 = 27
            if (r7 == 0) goto L_0x03b6
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x03b6
            X.126 r3 = r0.A09
            r1 = 2
            com.facebook.redex.RunnableRunnableShape2S0300000_I0_2 r2 = new com.facebook.redex.RunnableRunnableShape2S0300000_I0_2
            r2.<init>(r0, r6, r7, r1)
        L_0x03b2:
            r3.A01(r2, r4)
            return
        L_0x03b6:
            X.126 r3 = r0.A09
            r1 = 1
            com.facebook.redex.RunnableRunnableShape2S0300000_I0_2 r2 = new com.facebook.redex.RunnableRunnableShape2S0300000_I0_2
            r2.<init>(r0, r6, r5, r1)
            goto L_0x03b2
        L_0x03bf:
            java.lang.String r1 = "campaign"
            X.1Vv r4 = r5.A0J(r1)
            r3 = 0
            if (r4 == 0) goto L_0x03ce
            java.lang.String r1 = "id"
            java.lang.String r10 = r4.A0N(r1, r10)
        L_0x03ce:
            java.lang.String r2 = "PSANotificationHandler/handleStatusPSANotification/campaignID "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            if (r4 == 0) goto L_0x03e8
            java.lang.String r1 = "revoke"
            java.util.List r3 = r4.A0O(r1)
        L_0x03e8:
            r8 = 27
            if (r3 == 0) goto L_0x0401
            int r1 = r3.size()
            if (r1 <= 0) goto L_0x0401
            X.1ci r3 = r0.A00()
            X.126 r2 = r0.A09
            com.facebook.redex.RunnableRunnableShape0S1200000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S1200000_I0
            r1.<init>(r3, r10, r0, r8)
            r2.A01(r1, r8)
            return
        L_0x0401:
            r2 = 0
            if (r4 == 0) goto L_0x040b
            java.lang.String r1 = "duration"
            long r2 = r4.A0D(r1, r2)
        L_0x040b:
            java.lang.String r1 = "message"
            if (r4 == 0) goto L_0x048a
            java.util.List r4 = r4.A0O(r1)
        L_0x0413:
            if (r4 == 0) goto L_0x005c
            X.0t3 r1 = r0.A05
            long r15 = r1.A00()
            int r1 = r4.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r1)
            java.util.Iterator r14 = r4.iterator()
        L_0x0428:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x048f
            java.lang.Object r11 = r14.next()
            X.1Vv r11 = (X.C28371Vv) r11
            r4 = 0
            java.lang.String r1 = "order"
            long r4 = r11.A0D(r1, r4)     // Catch:{ 1W9 -> 0x043d }
            goto L_0x044f
        L_0x043d:
            r7 = move-exception
            java.lang.String r6 = "connection/getMessagesPsaFromProtocolTree: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x044f:
            java.lang.String r6 = "id"
            r1 = 0
            java.lang.String r7 = r11.A0N(r6, r1)
            r13 = 0
            X.1Vv r12 = r11.A0I(r13)
            if (r12 == 0) goto L_0x0428
            X.17g r11 = r0.A0I
            X.1kq r6 = X.C34771kq.A00
            X.1Vw r1 = new X.1Vw
            r1.<init>(r6, r7, r13)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            X.0tZ r11 = r11.A01(r1, r13, r4)
            byte[] r1 = r12.A01
            r11.A0v(r1)
            long r4 = r2 * r6
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0488
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x047f:
            X.1kX r1 = new X.1kX
            r1.<init>(r11, r10, r4)
            r9.add(r1)
            goto L_0x0428
        L_0x0488:
            long r4 = r4 + r15
            goto L_0x047f
        L_0x048a:
            java.util.List r4 = r5.A0O(r1)
            goto L_0x0413
        L_0x048f:
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x005c
            X.1ci r4 = r0.A00()
            X.126 r3 = r0.A09
            r2 = 3
            com.facebook.redex.RunnableRunnableShape2S0300000_I0_2 r1 = new com.facebook.redex.RunnableRunnableShape2S0300000_I0_2
            r1.<init>(r0, r4, r9, r2)
            r3.A01(r1, r8)
            return
        L_0x04a5:
            boolean r1 = r0 instanceof X.AnonymousClass13C
            if (r1 == 0) goto L_0x0622
            X.13C r0 = (X.AnonymousClass13C) r0
            r1 = 97
            if (r2 != r1) goto L_0x005c
            java.lang.String r1 = "rmr"
            X.1Vv r6 = r5.A0J(r1)
            r9 = 0
            r8 = 1
            r13 = 0
            if (r6 == 0) goto L_0x04cc
            r13 = 1
            java.lang.String r1 = "from_me"
            java.lang.String r2 = r6.A0M(r1)
            java.lang.String r1 = "true"
            boolean r1 = r1.equals(r2)
            r4 = 1
            if (r1 != 0) goto L_0x054c
        L_0x04cc:
            r4 = 0
            if (r13 != 0) goto L_0x054c
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            X.0so r2 = r0.A00
            java.lang.String r1 = "from"
            com.whatsapp.jid.Jid r1 = r5.A0G(r2, r3, r1)
        L_0x04d9:
            X.0rv r3 = X.C16030sJ.A00(r1)
            java.lang.String r1 = "id"
            java.lang.String r11 = r5.A0M(r1)
            X.1Vw r2 = new X.1Vw
            r2.<init>(r3, r11, r4)
            java.lang.String r3 = "media retry notification received; stanzaKeyId="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r10 = "; key="
            r1.append(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0t6 r7 = r0.A00
            X.0th r1 = r7.A0K
            X.0tZ r6 = r1.A03(r2)
            boolean r1 = r6 instanceof X.C16730tY
            if (r1 == 0) goto L_0x005c
            X.0tY r6 = (X.C16730tY) r6
            X.0ta r4 = r6.A02
            if (r4 == 0) goto L_0x0a3e
            java.lang.String r3 = "media auto download re-enabled; stanzaKeyId="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = "encrypt"
            X.1Vv r3 = r5.A0J(r1)
            java.lang.String r1 = "enc_p"
            r10 = 0
            if (r3 == 0) goto L_0x054a
            X.1Vv r1 = r3.A0J(r1)
            if (r1 == 0) goto L_0x054a
            byte[] r12 = r1.A01
        L_0x053d:
            java.lang.String r1 = "enc_iv"
            if (r3 == 0) goto L_0x0557
            X.1Vv r1 = r3.A0J(r1)
            if (r1 == 0) goto L_0x0557
            byte[] r11 = r1.A01
            goto L_0x0558
        L_0x054a:
            r12 = r10
            goto L_0x053d
        L_0x054c:
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            X.0so r2 = r0.A00
            java.lang.String r1 = "jid"
            com.whatsapp.jid.Jid r1 = r6.A0G(r2, r3, r1)
            goto L_0x04d9
        L_0x0557:
            r11 = r10
        L_0x0558:
            java.lang.String r3 = r2.A01     // Catch:{ 1bD -> 0x0a37 }
            byte[] r2 = r4.A0U     // Catch:{ 1bD -> 0x0a37 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ 1bD -> 0x0a37 }
            if (r12 == 0) goto L_0x0575
            if (r11 == 0) goto L_0x0575
            X.AnonymousClass13B.A00(r2, r11)     // Catch:{ 1bD -> 0x0a37 }
            r1 = 3
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOO(r1, r3, r12, r2, r11)     // Catch:{ 1bD -> 0x0a37 }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ 1bD -> 0x0a37 }
            if (r1 == 0) goto L_0x0a2c
            X.2C2 r10 = new X.2C2     // Catch:{ 1bD -> 0x0a37 }
            r10.<init>(r1)     // Catch:{ 1bD -> 0x0a37 }
            goto L_0x0577
        L_0x0575:
            r1 = 0
            goto L_0x0585
        L_0x0577:
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r3 = r10.A00
            r1 = 36
            long r1 = (long) r1
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r8, r1, r3)
            java.lang.String r1 = (java.lang.String) r1
        L_0x0585:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x058d
            r4.A0G = r1
        L_0x058d:
            if (r10 == 0) goto L_0x061f
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r10 = r10.A00
            r2 = 37
            long r2 = (long) r2
            long r2 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r8, r2, r10)
            int r10 = (int) r2
        L_0x059c:
            java.lang.String r2 = "error"
            X.1Vv r3 = r5.A0J(r2)
            if (r3 == 0) goto L_0x05aa
            java.lang.String r2 = "code"
            int r10 = r3.A0A(r2, r9)
        L_0x05aa:
            if (r13 == 0) goto L_0x061b
            r2 = 2
            if (r10 == r2) goto L_0x05b2
            r2 = 3
            if (r10 != r2) goto L_0x061b
        L_0x05b2:
            r7.A0a(r6)
            X.0xv r2 = r0.A01
            X.12c r5 = r2.A07
            X.0ta r4 = r6.A02
            java.lang.String r3 = ", message.mediaHash="
            if (r4 != 0) goto L_0x05ef
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download due to missing media data; message.key = "
        L_0x05c6:
            r1.append(r0)
            X.1Vw r0 = r6.A11
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r6.A05
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r9 == 0) goto L_0x005c
            X.0wP r0 = r2.A03
            int r1 = r0.A04(r8)
            r0 = 0
            r2.A01(r6, r1, r0)
            java.lang.String r0 = "media retry notification; queue auto download"
        L_0x05eb:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x05ef:
            boolean r0 = r4.A0Z
            if (r0 != 0) goto L_0x05fb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download; not transferring; message.key = "
            goto L_0x05c6
        L_0x05fb:
            X.1P8 r0 = r5.A0W
            X.1co r0 = r0.A00(r4)
            if (r0 == 0) goto L_0x0613
            if (r1 == 0) goto L_0x060b
            X.1cu r2 = r0.A0Z
            monitor-enter(r2)
            r2.A0G = r1     // Catch:{ all -> 0x0a34 }
            monitor-exit(r2)
        L_0x060b:
            java.util.concurrent.CountDownLatch r0 = r0.A0r
            r0.countDown()
            java.lang.String r0 = "media retry notification; resume reuploading download"
            goto L_0x05eb
        L_0x0613:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download; downloader not found; message.key = "
            goto L_0x05c6
        L_0x061b:
            r9 = 1
            r4.A0L = r8
            goto L_0x05b2
        L_0x061f:
            r10 = 1
            goto L_0x059c
        L_0x0622:
            boolean r1 = r0 instanceof X.AnonymousClass1TX
            if (r1 == 0) goto L_0x06d4
            X.1TX r0 = (X.AnonymousClass1TX) r0
            r1 = 238(0xee, float:3.34E-43)
            if (r2 != r1) goto L_0x005c
            r1 = 0
            X.1Vv r8 = r5.A0I(r1)
            if (r8 == 0) goto L_0x005c
            r2 = 0
            java.lang.String r1 = "creation"
            long r10 = r8.A0D(r1, r2)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r6
            byte[] r9 = r8.A01
            X.0t3 r1 = r0.A01
            long r2 = r1.A00()
            r4 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r2 = r2 + r4
            long r2 = r2 / r6
            java.lang.String r1 = "expiration"
            long r12 = r8.A0D(r1, r2)
            long r12 = r12 * r6
            X.12x r8 = r0.A03
            r8.A06(r9, r10, r12)
            X.0pt r4 = r0.A00
            X.0pS r1 = r4.A00
            boolean r1 = r1 instanceof com.obwhatsapp.report.ReportActivity
            if (r1 != 0) goto L_0x06c3
            java.lang.String r1 = "gdpr/notify-report-available"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0tz r1 = r8.A0B
            android.content.Context r6 = r1.A00
            r1 = 2131888446(0x7f12093e, float:1.9411528E38)
            java.lang.String r3 = r6.getString(r1)
            X.03l r5 = X.C218415q.A00(r6)
            java.lang.String r1 = "other_notifications@1"
            r5.A0J = r1
            r5.A0B(r3)
            long r1 = java.lang.System.currentTimeMillis()
            r5.A05(r1)
            r1 = 3
            r5.A02(r1)
            r1 = 1
            r5.A0D(r1)
            r1 = 2131893204(0x7f121bd4, float:1.9421178E38)
            java.lang.String r1 = r6.getString(r1)
            r5.A0A(r1)
            r5.A09(r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r1 = "com.obwhatsapp.report.ReportActivity"
            r3.setClassName(r2, r1)
            r1 = 0
            android.app.PendingIntent r1 = X.C42341xd.A00(r6, r1, r3, r1)
            r5.A09 = r1
            r2 = 2131232243(0x7f0805f3, float:1.808059E38)
            int r2 = com.obwhatsapp.yo.yo.getNIcon(r2)
            android.app.Notification r1 = r5.A07
            r1.icon = r2
            X.0yL r3 = r8.A0C
            android.app.Notification r2 = r5.A01()
            r1 = 16
            r3.A02(r1, r2)
        L_0x06c3:
            X.1rA r3 = r8.A03()
            if (r3 == 0) goto L_0x005c
            r2 = 44
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r1 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r1.<init>(r0, r2, r3)
            r4.A0K(r1)
            return
        L_0x06d4:
            boolean r1 = r0 instanceof X.C27961Tu
            if (r1 == 0) goto L_0x072f
            X.1Tu r0 = (X.C27961Tu) r0
            r9 = 0
            r8 = 0
            r1 = 241(0xf1, float:3.38E-43)
            if (r2 != r1) goto L_0x005c
            r1 = 0
            X.1Vv r7 = r5.A0I(r1)
            if (r7 == 0) goto L_0x005c
            X.1ci r6 = r0.A00()
            X.11o r4 = r0.A07
            long r1 = r6.A00
            r3 = 2
            X.1d2 r2 = r4.A00(r3, r1)
            X.2dU r2 = (X.C52282dU) r2
            if (r2 == 0) goto L_0x06fc
            java.lang.String r1 = r7.A00
            r2.A00 = r1
        L_0x06fc:
            java.lang.String r1 = "count"
            boolean r1 = X.C28371Vv.A07(r7, r1)
            if (r1 == 0) goto L_0x0a56
            java.lang.String r2 = "value"
            java.lang.String r1 = r7.A0M(r2)
            int r3 = r7.A0B(r1, r2)
            java.lang.String r2 = "prekey count running low; remainingPreKeys="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.16P r3 = r0.A04
            r2 = 43
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r1 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r1.<init>(r0, r2, r6)
            java.util.concurrent.ThreadPoolExecutor r0 = r3.A00
            r0.execute(r1)
            return
        L_0x072f:
            boolean r1 = r0 instanceof X.C208911z
            if (r1 == 0) goto L_0x0774
            X.11z r0 = (X.C208911z) r0
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            X.0so r2 = r0.A00
            java.lang.String r1 = "from"
            com.whatsapp.jid.Jid r6 = r5.A0G(r2, r3, r1)
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.String r3 = "t"
            r1 = 0
            long r12 = r5.A0D(r3, r1)
            java.lang.String r1 = "disappearing_mode"
            X.1Vv r3 = r5.A0J(r1)
            X.AnonymousClass00B.A06(r3)
            java.lang.String r2 = "duration"
            r1 = 0
            int r4 = r3.A0A(r2, r1)
            X.0sG r1 = r0.A02
            X.0sH r3 = r1.A0A(r6)
            int r1 = r3.A00
            if (r1 == r4) goto L_0x005c
            X.11y r2 = r0.A01
            X.2dV r1 = new X.2dV
            r7 = r1
            r8 = r3
            r9 = r6
            r10 = r0
            r11 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            r2.A01(r1)
            return
        L_0x0774:
            boolean r1 = r0 instanceof X.AnonymousClass12H
            if (r1 == 0) goto L_0x082a
            X.12H r0 = (X.AnonymousClass12H) r0
            r1 = 234(0xea, float:3.28E-43)
            if (r2 != r1) goto L_0x005c
            java.lang.String r1 = "tokens"
            X.1Vv r2 = r5.A0K(r1)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.lang.String r1 = "token"
            java.util.List r1 = r2.A0O(r1)
            java.util.Iterator r9 = r1.iterator()
        L_0x0795:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x080f
            java.lang.Object r4 = r9.next()
            X.1Vv r4 = (X.C28371Vv) r4
            java.lang.String r1 = "type"
            java.lang.String r2 = r4.A0M(r1)
            java.lang.String r1 = "trusted_contact"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x07e1
            java.lang.Class<X.0rv> r3 = X.C15830rv.class
            X.0so r2 = r0.A00
            java.lang.String r1 = "from"
            com.whatsapp.jid.Jid r1 = r5.A0G(r2, r3, r1)
            com.whatsapp.jid.UserJid r8 = com.whatsapp.jid.UserJid.of(r1)
            if (r8 == 0) goto L_0x0795
            byte[] r6 = r4.A01
            if (r6 == 0) goto L_0x0afa
            java.lang.String r3 = "t"
            java.lang.String r1 = r5.A0M(r3)
            long r1 = r5.A0E(r1, r3)
            long r2 = r4.A0D(r3, r1)
            X.12G r1 = r0.A02
            int r2 = r1.A00(r8, r6, r2)
            r1 = 2
            if (r2 == r1) goto L_0x0795
            r7.add(r8)
            goto L_0x0795
        L_0x07e1:
            java.lang.String r1 = "trusted_contact_outgoing"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0795
            java.lang.Class<X.0rv> r3 = X.C15830rv.class
            X.0so r2 = r0.A00
            java.lang.String r1 = "jid"
            com.whatsapp.jid.Jid r1 = r4.A0G(r2, r3, r1)
            com.whatsapp.jid.UserJid r6 = com.whatsapp.jid.UserJid.of(r1)
            if (r6 == 0) goto L_0x0795
            java.lang.String r2 = "t"
            java.lang.String r1 = r4.A0M(r2)
            long r3 = r4.A0E(r1, r2)
            X.12G r2 = r0.A02
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.A07(r6, r1)
            goto L_0x0795
        L_0x080f:
            java.util.Iterator r5 = r7.iterator()
        L_0x0813:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x005c
            java.lang.Object r4 = r5.next()
            X.0pt r3 = r0.A01
            r2 = 31
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r1 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r1.<init>(r0, r2, r4)
            r3.A0K(r1)
            goto L_0x0813
        L_0x082a:
            boolean r1 = r0 instanceof X.AnonymousClass1CV
            if (r1 == 0) goto L_0x08d9
            X.1CV r0 = (X.AnonymousClass1CV) r0
            r1 = 210(0xd2, float:2.94E-43)
            if (r2 != r1) goto L_0x005c
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.String r1 = "collection"
            java.util.List r1 = r5.A0O(r1)
            java.util.Iterator r9 = r1.iterator()
        L_0x0843:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0897
            java.lang.Object r2 = r9.next()
            X.1Vv r2 = (X.C28371Vv) r2
            java.lang.String r1 = "name"
            r6 = 0
            java.lang.String r8 = r2.A0N(r1, r6)
            java.lang.String r1 = "version"
            java.lang.String r2 = r2.A0N(r1, r6)
            r1 = 0
            int r1 = X.C29501aj.A00(r2, r1)
            long r2 = (long) r1
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L_0x0843
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r4.put(r8, r1)
            java.lang.String r1 = "offline"
            java.lang.String r1 = r5.A0N(r1, r6)
            if (r1 == 0) goto L_0x0843
            r6 = 0
            java.util.Map r3 = r0.A02
            boolean r1 = r3.containsKey(r8)
            if (r1 == 0) goto L_0x088c
            java.lang.Object r1 = r3.get(r8)
            java.lang.Number r1 = (java.lang.Number) r1
            long r6 = r1.longValue()
        L_0x088c:
            r1 = 1
            long r6 = r6 + r1
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r3.put(r8, r1)
            goto L_0x0843
        L_0x0897:
            X.0xU r5 = r0.A00
            boolean r0 = r5.A0X()
            if (r0 != 0) goto L_0x08af
            X.11R r0 = r5.A0Y
            android.content.SharedPreferences r2 = r0.A00()
            java.lang.String r1 = "companion_syncd_critical_bootstrap_state"
            r0 = 0
            int r1 = r2.getInt(r1, r0)
            r0 = 1
            if (r1 != r0) goto L_0x005c
        L_0x08af:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x08b7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0b02
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            X.11P r3 = r5.A0e
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r3.A04(r2, r0)
            goto L_0x08b7
        L_0x08d9:
            boolean r1 = r0 instanceof X.C208611w
            if (r1 != 0) goto L_0x005c
            boolean r1 = r0 instanceof X.C208011q
            if (r1 == 0) goto L_0x0907
            X.11q r0 = (X.C208011q) r0
            r1 = 228(0xe4, float:3.2E-43)
            if (r2 != r1) goto L_0x005c
            java.lang.String r1 = "migrate"
            X.1Vv r3 = r5.A0J(r1)
            if (r3 == 0) goto L_0x0b06
            r2 = 0
            java.lang.String r1 = "urgency"
            int r2 = r3.A0A(r1, r2)
            X.0rz r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "encrypted_backup_fleet_migration_state"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
            r0.apply()
            return
        L_0x0907:
            X.1SF r0 = (X.AnonymousClass1SF) r0
            r1 = 248(0xf8, float:3.48E-43)
            if (r2 != r1) goto L_0x005c
            X.1CG r2 = r0.A00
            r1 = 5
            r2.A09(r1)
            X.0pd r3 = r0.A02
            r2 = 1689(0x699, float:2.367E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r1 = r3.A0E(r1, r2)
            if (r1 == 0) goto L_0x005c
            X.1CQ r0 = r0.A01
            r0.A00()
            return
        L_0x0925:
            java.lang.String r0 = "Logout ID is empty for tag: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.A00
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x093b:
            java.lang.String r1 = "wa_old_registration"
            boolean r1 = X.C28371Vv.A07(r5, r1)
            if (r1 == 0) goto L_0x09f2
            java.lang.String r2 = "code"
            r1 = 0
            java.lang.String r7 = r5.A0N(r2, r1)
            java.lang.String r2 = "expiry_t"
            r1 = 0
            int r4 = r5.A0A(r2, r1)
            X.0rz r6 = r0.A01
            java.lang.String r1 = r6.A0N()
            byte[] r2 = X.AnonymousClass2JN.A0M(r1)
            r1 = 11
            java.lang.String r10 = android.util.Base64.encodeToString(r2, r1)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = (long) r4
            long r3 = r3.toMillis(r1)
            if (r7 == 0) goto L_0x09b1
            X.0t3 r1 = r0.A00
            long r8 = r1.A00()
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x09b1
            if (r10 == 0) goto L_0x09b1
            java.lang.String r2 = "device_id"
            java.lang.String r1 = ""
            java.lang.String r1 = r5.A0N(r2, r1)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x09b1
            android.content.SharedPreferences$Editor r2 = r6.A0K()
            java.lang.String r1 = "device_switching_code"
            android.content.SharedPreferences$Editor r1 = r2.putString(r1, r7)
            r1.apply()
            android.content.SharedPreferences$Editor r2 = r6.A0K()
            java.lang.String r1 = "device_switching_code_expiry"
            android.content.SharedPreferences$Editor r1 = r2.putLong(r1, r3)
            r1.apply()
            X.0yx r5 = r0.A02
            X.0tz r1 = r5.A0M
            android.content.Context r4 = r1.A00
            X.0pt r3 = r5.A04
            r2 = 28
            com.facebook.redex.RunnableRunnableShape0S1200000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S1200000_I0
            r1.<init>(r4, r7, r5, r2)
            r3.Acq(r1)
        L_0x09b1:
            X.1ci r5 = r0.A00()
            java.lang.String r1 = r6.A0N()
            byte[] r2 = X.AnonymousClass2JN.A0M(r1)
            r1 = 11
            java.lang.String r4 = android.util.Base64.encodeToString(r2, r1)
            if (r4 != 0) goto L_0x09c7
            java.lang.String r4 = ""
        L_0x09c7:
            X.1kL r3 = new X.1kL
            r3.<init>()
            java.lang.String r1 = "s.whatsapp.net"
            com.whatsapp.jid.Jid r1 = com.whatsapp.jid.Jid.getNullable(r1)
            r3.A01 = r1
            java.lang.String r1 = r5.A07
            r3.A07 = r1
            java.lang.String r1 = r5.A05
            r3.A05 = r1
            java.lang.String r1 = r5.A08
            r3.A08 = r1
            long r1 = r5.A00
            r3.A00 = r1
            java.lang.String r1 = "device_id"
            r3.A01(r1, r4)
            X.1ci r1 = r3.A00()
            r0.A03(r1)
            return
        L_0x09f2:
            java.lang.String r0 = "RegistrationNotificationHandler/handleXmppMessage: unknown tag="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0b08
        L_0x0a04:
            java.lang.String r1 = "local JID unknown"
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x0a0c:
            java.lang.String r0 = "ProfilePictureNotificationHandler/handleNotification/ignoring notification for invalid jid: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r6.A0N(r4, r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0a52
        L_0x0a1f:
            java.lang.String r1 = "push-config notification: force replacing GCM token"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0tz r0 = r0.A00
            android.content.Context r0 = r0.A00
            com.obwhatsapp.push.RegistrationIntentService.A01(r0)
            return
        L_0x0a2c:
            java.lang.String r1 = "encrypted message id is different from the expected one"
            X.1bD r0 = new X.1bD     // Catch:{ 1bD -> 0x0a37 }
            r0.<init>(r1)     // Catch:{ 1bD -> 0x0a37 }
            throw r0     // Catch:{ 1bD -> 0x0a37 }
        L_0x0a34:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0a37:
            r1 = move-exception
            java.lang.String r0 = "malformed encrypted data"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x0a3e:
            java.lang.String r1 = "missing media data for media message; stanzaKeyId="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L_0x0a52:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0a56:
            java.lang.String r1 = "identity"
            boolean r1 = X.C28371Vv.A07(r7, r1)
            if (r1 == 0) goto L_0x0ad1
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            X.0so r3 = r0.A00
            java.lang.String r1 = "from"
            com.whatsapp.jid.Jid r11 = r5.A0F(r3, r4, r1)
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            if (r11 == 0) goto L_0x0aaf
            java.lang.String r2 = "type"
            java.lang.String r1 = ""
            java.lang.String r10 = r5.A0N(r2, r1)
            java.lang.String r1 = "lid"
            com.whatsapp.jid.Jid r1 = r5.A0F(r3, r4, r1)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x0a80
            r8 = r1
        L_0x0a80:
            java.lang.String r1 = "display_name"
            java.lang.String r2 = r5.A0N(r1, r9)
            boolean r1 = X.AnonymousClass1ZW.A0E(r2)
            if (r1 != 0) goto L_0x0a8d
            r9 = r2
        L_0x0a8d:
            X.0vL r4 = r0.A08
            X.AnonymousClass00B.A06(r11)
            X.AnonymousClass00B.A06(r10)
            if (r8 == 0) goto L_0x0acf
            boolean r1 = r8 instanceof X.AnonymousClass1ZX
            if (r1 == 0) goto L_0x0acf
            X.1ZX r8 = (X.AnonymousClass1ZX) r8
        L_0x0a9d:
            X.2Bb r3 = new X.2Bb
            r3.<init>(r8, r11, r10, r9)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.whatsapp.jid.UserJid r1 = r3.A01
            r2.put(r1, r3)
            r4.A00(r2)
        L_0x0aaf:
            java.lang.String r2 = "identity changed notification received; stanzaKey="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.16P r3 = r0.A04
            r2 = 48
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r1 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r1.<init>(r0, r6, r7, r2)
            java.util.concurrent.ThreadPoolExecutor r0 = r3.A00
            r0.submit(r1)
            return
        L_0x0acf:
            r8 = 0
            goto L_0x0a9d
        L_0x0ad1:
            java.lang.String r1 = "digest"
            boolean r1 = X.C28371Vv.A07(r7, r1)
            if (r1 == 0) goto L_0x0af6
            java.lang.String r2 = "server asked us to run an e2e key digest check; stanzaKey="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0rz r2 = r0.A02
            r1 = 1
            r2.A1S(r1)
            X.12z r1 = r0.A00
            r1.A02()
        L_0x0af6:
            r0.A03(r6)
            return
        L_0x0afa:
            java.lang.String r1 = "required token element to contain data"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0b02:
            r5.A0N()
            return
        L_0x0b06:
            java.lang.String r0 = "EncBackupNotificationHandler/migrate child node missing"
        L_0x0b08:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208111r.A01(X.1Vv, int):void");
    }

    public final void A02(C28371Vv r7, C30641ci r8, int i2) {
        AtomicReference atomicReference = this.A05;
        boolean z2 = false;
        if (atomicReference.getAndSet(r8) == null) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        try {
            A01(r7, i2);
        } catch (AnonymousClass1W9 e2) {
            StringBuilder sb = new StringBuilder("BaseNotificationHandler/handleAndAckNotification/corrupt-stream-error/stanza ");
            sb.append(e2.bufString);
            sb.append(" node:");
            sb.append(r7);
            Log.w(sb.toString());
            this.A00.AcB("CorruptStreamException", e2.getMessage(), false);
        }
        C30641ci r1 = (C30641ci) atomicReference.getAndSet((Object) null);
        if (r1 != null && !this.A04.contains(r1)) {
            this.A01.A0E(r1);
        }
    }

    public final void A03(C30641ci r2) {
        this.A04.remove(r2);
        this.A01.A0E(r2);
    }

    public final int[] ACW() {
        return this.A07;
    }

    public final boolean AHS(Message message, int i2) {
        int i3;
        boolean z2;
        int[] iArr = this.A07;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            i3 = i2;
            if (i4 >= length) {
                z2 = false;
                break;
            } else if (i2 == iArr[i4]) {
                z2 = true;
                break;
            } else {
                i4++;
            }
        }
        if (!z2) {
            return false;
        }
        Object obj = message.obj;
        AnonymousClass00B.A06(obj);
        C28371Vv r6 = (C28371Vv) obj;
        Parcelable parcelable = message.getData().getParcelable("stanzaKey");
        AnonymousClass00B.A06(parcelable);
        C30641ci r7 = (C30641ci) parcelable;
        C52282dU r1 = (C52282dU) this.A02.A00(2, r7.A00);
        if (r1 != null) {
            C28371Vv A0I = r6.A0I(0);
            if (A0I != null) {
                r1.A00 = A0I.A00;
            }
            r1.A00(3);
        }
        if (this.A06) {
            AnonymousClass1WA r0 = this.A03;
            AnonymousClass00B.A06(r0);
            r0.execute(new RunnableRunnableShape0S0301000_I0(this, r6, r7, i3, 10));
            return true;
        }
        A02(r6, r7, i2);
        return true;
    }
}
