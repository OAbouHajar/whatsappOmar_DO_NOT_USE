package com.whatsapp.media.transcode;

import X.AnonymousClass006;
import X.AnonymousClass1HE;
import X.AnonymousClass54H;
import X.AnonymousClass54I;
import X.C007503l;
import X.C16000sG;
import X.C16080sP;
import X.C16150sX;
import X.C18940xV;
import X.C19150xq;
import X.C218415q;
import X.C28311Vk;
import X.C59132uj;
import X.C74023pc;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.HashMap;

public class MediaTranscodeService extends C28311Vk implements AnonymousClass006 {
    public static final HashMap A0B = new HashMap();
    public int A00;
    public C16000sG A01;
    public C16080sP A02;
    public C18940xV A03;
    public C19150xq A04;
    public AnonymousClass1HE A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final Object A09;
    public volatile AnonymousClass54I A0A;

    public MediaTranscodeService() {
        this(0);
        this.A08 = false;
        this.A00 = -1;
    }

    public MediaTranscodeService(int i2) {
        this.A09 = new Object();
        this.A07 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c3, code lost:
        if (r1 != 13) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0181, code lost:
        if (r0 != 13) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f8, code lost:
        if (r0 != 13) goto L_0x01fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r17 = this;
            r9 = r17
            boolean r8 = r9.A08
            r7 = 1
            r9.A08 = r7
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.HashMap r16 = A0B
            int r0 = r16.size()
            r13 = 134217728(0x8000000, float:3.85186E-34)
            java.lang.String r12 = "MediaTranscodeService"
            r15 = 5
            r2 = 13
            r5 = 0
            r1 = 3
            r4 = 2
            if (r0 != r7) goto L_0x0126
            java.util.Collection r0 = r16.values()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r14 = r0.next()
            X.0tY r14 = (X.C16730tY) r14
            X.0sG r2 = r9.A01
            X.1Vw r0 = r14.A11
            X.0rv r0 = r0.A00
            X.0sH r11 = r2.A0A(r0)
            byte r10 = r14.A10
            if (r10 == r4) goto L_0x0121
            if (r10 == r1) goto L_0x011c
            r1 = 13
            r2 = 2131891465(0x7f121509, float:1.941765E38)
            if (r10 == r1) goto L_0x0046
            r2 = 2131891464(0x7f121508, float:1.9417649E38)
        L_0x0046:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x0114
            r0 = 2131889580(0x7f120dac, float:1.9413828E38)
            java.lang.String r0 = r9.getString(r0)
        L_0x0055:
            java.lang.String r0 = X.C40651uT.A03(r0)
            r1[r5] = r0
            java.lang.String r3 = r9.getString(r2, r1)
            X.0ta r0 = r14.A02
            if (r0 == 0) goto L_0x0111
            long r0 = r0.A0C
            int r2 = (int) r0
            X.1HE r0 = r9.A05
            boolean r0 = r0.A05(r14)
            if (r0 == 0) goto L_0x007a
            X.1HE r0 = r9.A05
            boolean r0 = r0.A06(r14)
            int r2 = r2 >> 1
            if (r0 == 0) goto L_0x007a
            int r2 = r2 + 50
        L_0x007a:
            X.0ph r0 = new X.0ph
            r0.<init>()
            android.content.Intent r0 = r0.A0v(r9, r11)
            X.AnonymousClass22U.A01(r0, r12)
            android.app.PendingIntent r12 = X.C42341xd.A00(r9, r15, r0, r13)
            java.lang.Byte r0 = java.lang.Byte.valueOf(r10)
            r6.add(r0)
        L_0x0091:
            X.03l r10 = X.C218415q.A00(r9)
            java.lang.String r11 = "sending_media@1"
            r10.A0J = r11
            r10.A09 = r12
            r9.A01(r10, r3, r2, r8)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x00ee
            int r0 = r6.size()
            if (r0 != r7) goto L_0x00c5
            java.util.Iterator r0 = r6.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.Number r0 = (java.lang.Number) r0
            byte r1 = r0.byteValue()
            if (r1 == r4) goto L_0x010d
            r0 = 3
            if (r1 == r0) goto L_0x0109
            r0 = 13
            r13 = 2131755314(0x7f100132, float:1.9141504E38)
            if (r1 == r0) goto L_0x00c8
        L_0x00c5:
            r13 = 2131755312(0x7f100130, float:1.91415E38)
        L_0x00c8:
            X.013 r12 = r9.A01
            int r0 = r16.size()
            long r0 = (long) r0
            java.lang.Object[] r6 = new java.lang.Object[r7]
            int r4 = r16.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6[r5] = r4
            java.lang.String r1 = r12.A0J(r6, r13, r0)
            X.03l r0 = X.C218415q.A00(r9)
            r0.A0J = r11
            r9.A01(r0, r1, r2, r8)
            android.app.Notification r0 = r0.A01()
            r10.A08 = r0
        L_0x00ee:
            android.app.Notification r1 = r10.A01()
            if (r8 == 0) goto L_0x0100
            int r0 = r9.A00
            if (r0 != r2) goto L_0x0100
            java.lang.String r0 = r9.A06
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 != 0) goto L_0x0104
        L_0x0100:
            r0 = 3
            r9.startForeground(r0, r1)
        L_0x0104:
            r9.A00 = r2
            r9.A06 = r3
            return
        L_0x0109:
            r13 = 2131755317(0x7f100135, float:1.914151E38)
            goto L_0x00c8
        L_0x010d:
            r13 = 2131755310(0x7f10012e, float:1.9141496E38)
            goto L_0x00c8
        L_0x0111:
            r2 = -1
            goto L_0x007a
        L_0x0114:
            X.0sP r0 = r9.A02
            java.lang.String r0 = r0.A08(r11)
            goto L_0x0055
        L_0x011c:
            r2 = 2131891475(0x7f121513, float:1.9417671E38)
            goto L_0x0046
        L_0x0121:
            r2 = 2131891463(0x7f121507, float:1.9417647E38)
            goto L_0x0046
        L_0x0126:
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            java.util.Collection r0 = r16.values()
            java.util.Iterator r10 = r0.iterator()
        L_0x0133:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0150
            java.lang.Object r3 = r10.next()
            X.0tZ r3 = (X.C16740tZ) r3
            X.1Vw r0 = r3.A11
            X.0rv r0 = r0.A00
            r14.add(r0)
            byte r0 = r3.A10
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r6.add(r0)
            goto L_0x0133
        L_0x0150:
            int r0 = r14.size()
            if (r0 != r7) goto L_0x01dd
            X.0sG r3 = r9.A01
            java.util.Iterator r0 = r14.iterator()
            java.lang.Object r0 = r0.next()
            X.0rv r0 = (X.C15830rv) r0
            X.0sH r10 = r3.A0A(r0)
            int r0 = r6.size()
            if (r0 != r7) goto L_0x0183
            java.util.Iterator r0 = r6.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.Number r0 = (java.lang.Number) r0
            byte r0 = r0.byteValue()
            if (r0 == r4) goto L_0x01d9
            if (r0 == r1) goto L_0x01d5
            r11 = 2131755313(0x7f100131, float:1.9141502E38)
            if (r0 == r2) goto L_0x0186
        L_0x0183:
            r11 = 2131755311(0x7f10012f, float:1.9141498E38)
        L_0x0186:
            X.013 r15 = r9.A01
            int r0 = r16.size()
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r4]
            int r2 = r16.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r5] = r2
            java.util.Iterator r2 = r14.iterator()
            java.lang.Object r2 = r2.next()
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            boolean r2 = X.C16030sJ.A0Q(r2)
            if (r2 == 0) goto L_0x01ce
            r2 = 2131889580(0x7f120dac, float:1.9413828E38)
            java.lang.String r2 = r9.getString(r2)
        L_0x01b0:
            java.lang.String r2 = X.C40651uT.A03(r2)
            r3[r7] = r2
            java.lang.String r3 = r15.A0J(r3, r11, r0)
            X.0ph r0 = new X.0ph
            r0.<init>()
            android.content.Intent r1 = r0.A0v(r9, r10)
            X.AnonymousClass22U.A01(r1, r12)
            r0 = 5
            android.app.PendingIntent r12 = X.C42341xd.A00(r9, r0, r1, r13)
        L_0x01cb:
            r2 = -1
            goto L_0x0091
        L_0x01ce:
            X.0sP r2 = r9.A02
            java.lang.String r2 = r2.A08(r10)
            goto L_0x01b0
        L_0x01d5:
            r11 = 2131755316(0x7f100134, float:1.9141508E38)
            goto L_0x0186
        L_0x01d9:
            r11 = 2131755309(0x7f10012d, float:1.9141494E38)
            goto L_0x0186
        L_0x01dd:
            int r0 = r6.size()
            if (r0 != r7) goto L_0x01fa
            java.util.Iterator r0 = r6.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.Number r0 = (java.lang.Number) r0
            byte r0 = r0.byteValue()
            if (r0 == r4) goto L_0x0221
            if (r0 == r1) goto L_0x021d
            r11 = 2131755314(0x7f100132, float:1.9141504E38)
            if (r0 == r2) goto L_0x01fd
        L_0x01fa:
            r11 = 2131755312(0x7f100130, float:1.91415E38)
        L_0x01fd:
            android.content.Intent r0 = X.C14750ph.A02(r9)
            android.app.PendingIntent r12 = X.C42341xd.A00(r9, r7, r0, r5)
            X.013 r10 = r9.A01
            int r0 = r16.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r0 = r16.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r5] = r0
            java.lang.String r3 = r10.A0J(r1, r11, r2)
            goto L_0x01cb
        L_0x021d:
            r11 = 2131755317(0x7f100135, float:1.914151E38)
            goto L_0x01fd
        L_0x0221:
            r11 = 2131755310(0x7f10012e, float:1.9141496E38)
            goto L_0x01fd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.media.transcode.MediaTranscodeService.A00():void");
    }

    public final void A01(C007503l r3, String str, int i2, boolean z2) {
        r3.A0I = "progress";
        r3.A05(System.currentTimeMillis());
        r3.A0A(getString(R.string.str1bd4));
        r3.A09(str);
        if (i2 >= 0) {
            boolean z3 = false;
            if (i2 == 0) {
                z3 = true;
            }
            r3.A03(100, i2, z3);
        }
        if (!z2) {
            r3.A0B(str);
        }
        r3.A07.icon = 17301640;
    }

    public final Object generatedComponent() {
        if (this.A0A == null) {
            synchronized (this.A09) {
                if (this.A0A == null) {
                    this.A0A = new AnonymousClass54I(this);
                }
            }
        }
        return this.A0A.generatedComponent();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        Log.i("MediaTranscodeService/onCreate");
        if (!this.A07) {
            this.A07 = true;
            C16150sX r1 = ((C59132uj) ((AnonymousClass54H) generatedComponent())).A04;
            this.A01 = (C16000sG) r1.A4x.get();
            this.A02 = (C16080sP) r1.AQ9.get();
            this.A04 = (C19150xq) r1.AFC.get();
            this.A05 = (AnonymousClass1HE) r1.ALb.get();
        }
        super.onCreate();
        C74023pc r12 = new C74023pc(this);
        this.A03 = r12;
        this.A04.A02(r12);
    }

    public void onDestroy() {
        A0B.size();
        this.A08 = false;
        stopForeground(true);
        this.A04.A03(this.A03);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        if (intent == null || !"com.obwhatsapp.media.transcode.MediaTranscodeService.STOP".equals(intent.getAction())) {
            A00();
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            C007503l A002 = C218415q.A00(this);
            A002.A0J = "sending_media@1";
            A002.A0A(getString(R.string.str1bd4));
            A002.A09(getString(R.string.str150a));
            A002.A03 = -1;
            A002.A07.icon = 17301640;
            startForeground(3, A002.A01());
        }
        this.A08 = false;
        boolean stopSelfResult = stopSelfResult(i3);
        StringBuilder sb = new StringBuilder("MediaTranscodeService/stopService success:");
        sb.append(stopSelfResult);
        Log.i(sb.toString());
        return 2;
    }
}
