package com.facebook.redex;

import X.C56202n3;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzd;

public class RunnableRunnableShape1S1200000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public RunnableRunnableShape1S1200000_I1(LifecycleCallback lifecycleCallback, C56202n3 r3) {
        this.A03 = 0;
        this.A01 = r3;
        this.A00 = lifecycleCallback;
        this.A02 = "ConnectionlessLifecycleHelper";
    }

    public RunnableRunnableShape1S1200000_I1(LifecycleCallback lifecycleCallback, zzd zzd) {
        this.A03 = 1;
        this.A01 = zzd;
        this.A00 = lifecycleCallback;
        this.A02 = "ConnectionlessLifecycleHelper";
    }

    public RunnableRunnableShape1S1200000_I1(Object obj, String str, Object obj2, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.A03
            switch(r0) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x01c2;
                case 2: goto L_0x00dc;
                case 3: goto L_0x00f4;
                case 4: goto L_0x0142;
                case 5: goto L_0x0168;
                case 6: goto L_0x0187;
                case 7: goto L_0x019c;
                case 8: goto L_0x0202;
                case 9: goto L_0x0283;
                case 10: goto L_0x0314;
                case 11: goto L_0x033c;
                case 12: goto L_0x035a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A00
            X.3Dt r0 = (X.C62493Dt) r0
            java.lang.String r1 = r15.A02
            java.lang.Object r8 = r15.A01
            byte[] r8 = (byte[]) r8
            X.1z9 r0 = r0.A00
            java.util.Map r0 = r0.A07
            java.lang.Object r4 = r0.get(r1)
            X.39L r4 = (X.AnonymousClass39L) r4
            if (r4 == 0) goto L_0x01ff
            r3 = 0
            int r7 = r8.length     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            long r5 = r4.A00     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            long r0 = (long) r7     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            long r5 = r5 + r0
            r4.A00 = r5     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            r5 = 0
        L_0x0024:
            if (r5 >= r7) goto L_0x0036
            java.io.BufferedOutputStream r2 = r4.A06     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            int r1 = r7 - r5
            r0 = 10240(0x2800, float:1.4349E-41)
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            r2.write(r8, r5, r0)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            int r5 = r5 + 10240
            goto L_0x0024
        L_0x0036:
            com.facebook.msys.mci.NetworkSession r9 = r4.A03     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            X.3Tm r0 = new X.3Tm     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            r0.<init>(r4, r7)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            r8 = 3
            r7 = 0
            com.facebook.msys.mci.Execution.executeAsyncWithPriority(r0, r8, r7)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            long r5 = r4.A00     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            long r0 = r4.A01     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0053
            X.3Tl r0 = new X.3Tl     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            r0.<init>(r4)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            com.facebook.msys.mci.Execution.executeAsyncWithPriority(r0, r8, r7)     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
            return
        L_0x0053:
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008d }
            r10.<init>()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008d }
            r4.A00()     // Catch:{ all -> 0x0088 }
            X.1z9 r8 = r4.A08     // Catch:{ all -> 0x0088 }
            com.facebook.msys.mci.DataTask r0 = r4.A02     // Catch:{ all -> 0x0088 }
            java.lang.String r11 = r0.mTaskIdentifier     // Catch:{ all -> 0x0088 }
            java.net.HttpURLConnection r12 = r4.A07     // Catch:{ all -> 0x0088 }
            r13 = 1
            r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0088 }
            com.facebook.msys.mci.UrlRequest r5 = r4.A04     // Catch:{ all -> 0x0088 }
            int r2 = r12.getResponseCode()     // Catch:{ all -> 0x0088 }
            java.util.Map r0 = r12.getHeaderFields()     // Catch:{ all -> 0x0088 }
            java.util.Map r0 = com.facebook.msys.mci.NetworkUtils.flattenHeaders((java.util.Map) r0)     // Catch:{ all -> 0x0088 }
            com.facebook.msys.mci.UrlResponse r1 = new com.facebook.msys.mci.UrlResponse     // Catch:{ all -> 0x0088 }
            r1.<init>(r5, r2, r0)     // Catch:{ all -> 0x0088 }
            r12.getResponseCode()     // Catch:{ all -> 0x0088 }
            byte[] r0 = r10.toByteArray()     // Catch:{ all -> 0x0088 }
            r4.A01(r1, r3, r0)     // Catch:{ all -> 0x0088 }
            r10.close()     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008d }
            return
        L_0x0088:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x008c }
        L_0x008c:
            throw r0     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008d }
        L_0x008d:
            r0 = move-exception
            throw r0     // Catch:{ IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x008f }
        L_0x008f:
            r2 = move-exception
            java.lang.String r0 = "wa-msys/NetworkSession: Exception while executing handleUpdateStreamingTask"
            com.whatsapp.util.Log.e(r0, r2)
            com.facebook.msys.mci.UrlRequest r0 = r4.A04
            com.facebook.msys.mci.UrlResponse r1 = com.facebook.msys.mci.NetworkUtils.newErrorURLResponse(r0)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            r4.A01(r1, r0, r3)
            return
        L_0x00a5:
            java.lang.Object r3 = r15.A01
            X.2n3 r3 = (X.C56202n3) r3
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x00be
            java.lang.Object r2 = r15.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r2 = (com.google.android.gms.common.api.internal.LifecycleCallback) r2
            android.os.Bundle r1 = r3.A01
            if (r1 == 0) goto L_0x00da
            java.lang.String r0 = "ConnectionlessLifecycleHelper"
            android.os.Bundle r0 = r1.getBundle(r0)
        L_0x00bb:
            r2.A04(r0)
        L_0x00be:
            int r1 = r3.A00
            r0 = 2
            if (r1 < r0) goto L_0x00ca
            java.lang.Object r0 = r15.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.A01()
        L_0x00ca:
            int r1 = r3.A00
            r0 = 3
            if (r1 < r0) goto L_0x00d6
            java.lang.Object r0 = r15.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.A00()
        L_0x00d6:
            int r1 = r3.A00
            goto L_0x01f5
        L_0x00da:
            r0 = 0
            goto L_0x00bb
        L_0x00dc:
            java.lang.Object r1 = r15.A00
            com.obwhatsapp.VoiceMessagingService r1 = (com.obwhatsapp.VoiceMessagingService) r1
            java.lang.Object r0 = r15.A01
            java.lang.String r5 = r15.A02
            X.0tb r1 = r1.A01
            java.util.List r6 = java.util.Collections.singletonList(r0)
            r2 = 0
            r8 = 0
            r4 = r2
            r7 = r2
            r9 = 0
            r3 = r2
            r1.A0A(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x00f4:
            java.lang.Object r0 = r15.A00
            X.3Fs r0 = (X.C62993Fs) r0
            java.lang.Object r6 = r15.A01
            X.4Ov r6 = (X.C85534Ov) r6
            java.lang.String r5 = r15.A02
            com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity r4 = r0.A00
            X.2Op r2 = r4.A0H
            r0 = 0
            r2.A01(r6, r0)
            X.0sG r1 = r4.A02
            X.0sL r0 = r6.A05
            X.0sH r3 = r1.A0A(r0)
            X.0sL r2 = X.C16050sL.A05(r5)
            r0 = 2
            X.1l4 r1 = new X.1l4
            r1.<init>(r2, r0)
            X.0so r0 = r4.A03
            r3.A0E(r0, r1)
            X.2Op r0 = r4.A0H
            X.2Ao r1 = r0.A0E
            android.widget.ImageView r0 = r0.A06
            r1.A06(r0, r3)
            java.lang.String r2 = r6.A09
            r0 = 2131364161(0x7f0a0941, float:1.8348151E38)
            android.widget.TextView r1 = X.C13700nu.A09(r4, r0)
            r0 = 2131889918(0x7f120efe, float:1.9414513E38)
            r1.setText(r0)
            X.3yT r0 = new X.3yT
            r0.<init>(r4, r2, r5)
            r1.setOnClickListener(r0)
            r4.A35()
            return
        L_0x0142:
            java.lang.Object r0 = r15.A00
            X.4Q4 r0 = (X.AnonymousClass4Q4) r0
            java.lang.Object r3 = r15.A01
            X.26S r3 = (X.AnonymousClass26S) r3
            java.lang.String r2 = r15.A02
            X.1KA r0 = r0.A00
            java.util.List r0 = r0.A0M
            java.util.ArrayList r0 = X.C13680ns.A0n(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0158:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ff
            java.lang.Object r0 = r1.next()
            X.26n r0 = (X.C449926n) r0
            r0.ARB(r3, r2)
            goto L_0x0158
        L_0x0168:
            java.lang.Object r1 = r15.A00
            X.028 r1 = (X.AnonymousClass028) r1
            java.lang.Object r0 = r15.A01
            android.location.Location r0 = (android.location.Location) r0
            java.lang.String r3 = r15.A02
            double r4 = r0.getLatitude()
            double r6 = r0.getLongitude()
            float r8 = r0.getAccuracy()
            X.4KG r2 = new X.4KG
            r2.<init>(r3, r4, r6, r8)
            r1.A0B(r2)
            return
        L_0x0187:
            java.lang.Object r4 = r15.A00
            com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel r4 = (com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel) r4
            java.lang.String r3 = r15.A02
            java.lang.Object r2 = r15.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.39A r1 = r4.A05
            X.5FW r0 = new X.5FW
            r0.<init>(r4, r2)
            r1.A00(r2, r3, r0)
            return
        L_0x019c:
            java.lang.Object r5 = r15.A00
            com.obwhatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel r5 = (com.obwhatsapp.conversation.conversationrow.messagerating.MessageRatingViewModel) r5
            java.lang.Object r4 = r15.A01
            X.0rv r4 = (X.C15830rv) r4
            java.lang.String r3 = r15.A02
            X.0t6 r2 = r5.A03
            r1 = 0
            X.1Vw r0 = new X.1Vw
            r0.<init>(r4, r3, r1)
            X.0tZ r0 = X.C16460t6.A00(r2, r0)
            if (r0 == 0) goto L_0x01ff
            X.1Oi r2 = r5.A04
            long r0 = r0.A13
            java.lang.Integer r1 = r2.A00(r0)
            X.027 r0 = r5.A01
            r0.A09(r1)
            return
        L_0x01c2:
            java.lang.Object r3 = r15.A01
            com.google.android.gms.common.api.internal.zzd r3 = (com.google.android.gms.common.api.internal.zzd) r3
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x01db
            java.lang.Object r2 = r15.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r2 = (com.google.android.gms.common.api.internal.LifecycleCallback) r2
            android.os.Bundle r1 = r3.A01
            if (r1 == 0) goto L_0x0200
            java.lang.String r0 = "ConnectionlessLifecycleHelper"
            android.os.Bundle r0 = r1.getBundle(r0)
        L_0x01d8:
            r2.A04(r0)
        L_0x01db:
            int r1 = r3.A00
            r0 = 2
            if (r1 < r0) goto L_0x01e7
            java.lang.Object r0 = r15.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.A01()
        L_0x01e7:
            int r1 = r3.A00
            r0 = 3
            if (r1 < r0) goto L_0x01f3
            java.lang.Object r0 = r15.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.A00()
        L_0x01f3:
            int r1 = r3.A00
        L_0x01f5:
            r0 = 4
            if (r1 < r0) goto L_0x01ff
            java.lang.Object r0 = r15.A00
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.A02()
        L_0x01ff:
            return
        L_0x0200:
            r0 = 0
            goto L_0x01d8
        L_0x0202:
            java.lang.Object r4 = r15.A00
            X.3Hc r4 = (X.C63333Hc) r4
            java.lang.Object r3 = r15.A01
            android.location.Address r3 = (android.location.Address) r3
            java.lang.String r2 = r15.A02
            r6 = 0
            if (r3 == 0) goto L_0x023b
            int r0 = r3.getMaxAddressLineIndex()
            if (r0 < 0) goto L_0x021f
            X.29S r0 = r4.A02
            com.obwhatsapp.location.PlaceInfo r1 = r0.A1O
            java.lang.String r0 = r3.getAddressLine(r6)
            r1.A06 = r0
        L_0x021f:
            X.29S r1 = r4.A02
            com.obwhatsapp.location.PlaceInfo r0 = r1.A1O
            r0.A04 = r2
            java.lang.String r0 = r3.getLocality()
            if (r0 == 0) goto L_0x023b
            java.lang.String r0 = r3.getLocality()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x023b
            java.lang.String r0 = r3.getLocality()
            r1.A0l = r0
        L_0x023b:
            X.29S r5 = r4.A02
            X.00k r1 = r5.A0Y
            r0 = 2131364449(0x7f0a0a61, float:1.8348735E38)
            android.widget.TextView r4 = X.C13680ns.A0N(r1, r0)
            android.view.View r1 = r5.A0G
            r0 = 2131364399(0x7f0a0a2f, float:1.8348634E38)
            android.widget.TextView r3 = X.C13680ns.A0M(r1, r0)
            boolean r0 = r5.A0x
            if (r0 == 0) goto L_0x027a
            java.lang.String r2 = r5.A0l
        L_0x0255:
            if (r4 == 0) goto L_0x0266
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            r0 = 0
            if (r1 == 0) goto L_0x0260
            r0 = 8
        L_0x0260:
            r4.setVisibility(r0)
            r4.setText(r2)
        L_0x0266:
            if (r3 == 0) goto L_0x0276
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0270
            r6 = 8
        L_0x0270:
            r3.setVisibility(r6)
            r3.setText(r2)
        L_0x0276:
            r5.A0A()
            return
        L_0x027a:
            com.obwhatsapp.location.PlaceInfo r0 = r5.A1O
            java.lang.String r2 = r0.A06
            if (r2 != 0) goto L_0x0255
            java.lang.String r2 = r0.A04
            goto L_0x0255
        L_0x0283:
            java.lang.Object r4 = r15.A00
            X.4Rx r4 = (X.C86264Rx) r4
            java.lang.String r11 = r15.A02
            java.lang.Object r6 = r15.A01
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            X.0uk r0 = r4.A01
            X.0sL r5 = r4.A03
            X.28n r0 = r0.A03
            java.util.List r1 = r0.A00(r5)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x030b
            r3 = 0
        L_0x029e:
            X.0ug r8 = r4.A04
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()
            java.lang.String r7 = "type"
            java.lang.String r1 = "sub_group"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r7, (java.lang.String) r1)
            r2.add(r0)
            java.lang.String r1 = "jid"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r6, (java.lang.String) r1)
            r2.add(r0)
            if (r3 == 0) goto L_0x02c9
            java.lang.String r1 = "sub_group_jid"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)
            r2.add(r0)
        L_0x02c9:
            int r0 = r2.size()
            X.1lL[] r0 = new X.C35081lL[r0]
            java.lang.Object[] r1 = r2.toArray(r0)
            X.1lL[] r1 = (X.C35081lL[]) r1
            java.lang.String r0 = "query_linked"
            X.1Vv r6 = new X.1Vv
            r6.<init>(r0, r1)
            r0 = 4
            X.1lL[] r3 = new X.C35081lL[r0]
            r1 = 0
            java.lang.String r0 = "id"
            X.C35081lL.A02(r0, r11, r3, r1)
            r2 = 1
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "w:g2"
            X.C35081lL.A02(r1, r0, r3, r2)
            r1 = 2
            java.lang.String r0 = "get"
            X.C35081lL.A02(r7, r0, r3, r1)
            r0 = 3
            X.1Vv r10 = X.C28371Vv.A03(r5, r6, r3, r0)
            X.5Rp r1 = r4.A02
            X.0so r0 = r4.A00
            X.3GR r9 = new X.3GR
            r9.<init>(r0, r1)
            r12 = 298(0x12a, float:4.18E-43)
            r13 = 32000(0x7d00, double:1.581E-319)
            r8.A0A(r9, r10, r11, r12, r13)
            return
        L_0x030b:
            java.lang.Object r0 = X.C13690nt.A0Z(r1)
            X.1sW r0 = (X.C39461sW) r0
            com.whatsapp.jid.GroupJid r3 = r0.A02
            goto L_0x029e
        L_0x0314:
            java.lang.Object r0 = r15.A00
            X.51G r0 = (X.AnonymousClass51G) r0
            java.lang.Object r8 = r15.A01
            byte[] r8 = (byte[]) r8
            java.lang.String r7 = r15.A02
            X.2Fc r1 = r0.A00     // Catch:{ IOException -> 0x0335 }
            X.0t3 r3 = r1.A00     // Catch:{ IOException -> 0x0335 }
            X.0pd r6 = r1.A04     // Catch:{ IOException -> 0x0335 }
            X.0tz r0 = r1.A01     // Catch:{ IOException -> 0x0335 }
            android.content.Context r2 = r0.A00     // Catch:{ IOException -> 0x0335 }
            X.10J r5 = r1.A03     // Catch:{ IOException -> 0x0335 }
            X.0rz r4 = r1.A02     // Catch:{ IOException -> 0x0335 }
            X.AnonymousClass2FR.A01(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ IOException -> 0x0335 }
            java.lang.String r0 = "BackupTokenProtocolHelper/sendBackupTokenRequest/IQ success/encryptAndSaveToken"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0335 }
            return
        L_0x0335:
            r1 = move-exception
            java.lang.String r0 = "BackupTokenProtocolHelper/sendBackupTokenRequest/IQ success/encryptAndSaveToken/failed with IOException:"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x033c:
            java.lang.Object r6 = r15.A00
            X.3Et r6 = (X.C62743Et) r6
            java.lang.Object r5 = r15.A01
            java.lang.String r4 = r15.A02
            X.1Jn r3 = r6.A01
            java.lang.String r2 = r6.A0B
            java.lang.String r1 = r6.A0A
            java.lang.String r0 = r6.A09
            X.32O r2 = r3.A00(r2, r1, r0, r4)
            r1 = 1
            com.facebook.redex.IDxRCallbacksShape74S0200000_1_I1 r0 = new com.facebook.redex.IDxRCallbacksShape74S0200000_1_I1
            r0.<init>(r5, r1, r6)
            r2.Aah(r0)
            return
        L_0x035a:
            java.lang.Object r6 = r15.A00
            X.3Eu r6 = (X.C62753Eu) r6
            java.lang.Object r5 = r15.A01
            java.lang.String r4 = r15.A02
            X.1Jn r3 = r6.A01
            java.lang.String r2 = r6.A0C
            java.lang.String r1 = r6.A0B
            java.lang.String r0 = r6.A0A
            X.32O r2 = r3.A00(r2, r1, r0, r4)
            r1 = 2
            com.facebook.redex.IDxRCallbacksShape74S0200000_1_I1 r0 = new com.facebook.redex.IDxRCallbacksShape74S0200000_1_I1
            r0.<init>(r5, r1, r6)
            r2.Aah(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape1S1200000_I1.run():void");
    }
}
