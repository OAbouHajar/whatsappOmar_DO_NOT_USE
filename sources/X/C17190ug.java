package X;

import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0ug  reason: invalid class name and case insensitive filesystem */
public class C17190ug {
    public C34511kO A00;
    public C34521kP A01;
    public final C16600tK A02;
    public final C14710pd A03;
    public final C222717h A04;
    public final AnonymousClass1CO A05;
    public final AnonymousClass1CM A06;
    public final AnonymousClass1CP A07;
    public final AnonymousClass1CN A08;
    public final C207811o A09;
    public final Set A0A = new HashSet();
    public final AtomicInteger A0B = new AtomicInteger();

    public C17190ug(C16600tK r2, C14710pd r3, C222717h r4, AnonymousClass1CO r5, AnonymousClass1CM r6, AnonymousClass1CP r7, AnonymousClass1CN r8, C207811o r9) {
        this.A03 = r3;
        this.A06 = r6;
        this.A04 = r4;
        this.A02 = r2;
        this.A09 = r9;
        this.A08 = r8;
        this.A05 = r5;
        this.A07 = r7;
    }

    public static Message A00(C28371Vv r3, String str, int i2, boolean z2, boolean z3, boolean z4) {
        int i3 = 233;
        if (z2) {
            i3 = 356;
        }
        Message obtain = Message.obtain((Handler) null, 0, i3, i2, r3);
        obtain.getData().putString("messageClient:iqId", str);
        obtain.getData().putBoolean("messageClient:dropIfOffline", z3);
        obtain.getData().putBoolean("messageClient:checkCallback", z4);
        return obtain;
    }

    public static C30641ci A01(C30641ci r3) {
        C34481kL r2;
        Jid jid = r3.A01;
        if (!(jid instanceof DeviceJid) || jid.getDevice() != 0) {
            r2 = null;
        } else {
            r2 = r3.A02();
            r2.A01 = ((DeviceJid) jid).getUserJid();
        }
        DeviceJid of = DeviceJid.of(r3.A02);
        if (of != null && of.device == 0) {
            if (r2 == null) {
                r2 = r3.A02();
            }
            r2.A02 = of.getUserJid();
        } else if (r2 == null) {
            return r3;
        }
        return r2.A00();
    }

    public String A02() {
        String obj;
        AnonymousClass1CP r6 = this.A07;
        synchronized (r6.A0B) {
            StringBuilder sb = new StringBuilder();
            sb.append("0");
            int i2 = r6.A00;
            r6.A00 = i2 + 1;
            sb.append(Integer.toHexString(i2));
            obj = sb.toString();
            boolean z2 = false;
            if (r6.A0E.put(obj, r6.A0A) == null) {
                z2 = true;
            }
            AnonymousClass00B.A0G(z2);
            if (r6.A00 == 65536) {
                r6.A05.AcB("iqId too large", (String) null, false);
                r6.A00 = 0;
            }
        }
        return obj;
    }

    public String A03() {
        StringBuilder sb = new StringBuilder("n");
        sb.append(Integer.toHexString(this.A0B.getAndIncrement()));
        return sb.toString();
    }

    @Deprecated
    public Future A04(Message message, C30641ci r5) {
        AnonymousClass00B.A07(r5, "MessageClient/sendAckableMessage: stanzaKey is null");
        C30641ci A012 = A01(r5);
        C34421kE r1 = new C34421kE();
        this.A05.A00(A012, r1);
        A09(message, false);
        return r1;
    }

    @Deprecated
    public Future A05(Message message, String str) {
        AnonymousClass00B.A07(str, "MessageClient/sendIq: id is null");
        C34421kE r2 = new C34421kE();
        Map map = this.A05.A03;
        synchronized (map) {
            map.put(str, r2);
        }
        A09(message, false);
        this.A07.A03(str);
        return r2;
    }

    public Future A06(C28371Vv r5, C30641ci r6, int i2) {
        C30641ci A012 = A01(r6);
        C34421kE r3 = new C34421kE();
        C16600tK r1 = this.A02;
        if (!r1.A05 || !r1.A08()) {
            r3.A01(new IOException("MessageClient not ready, user not registered likely"));
            return r3;
        }
        this.A05.A00(A012, r3);
        A09(Message.obtain((Handler) null, 0, 6, i2, r5), false);
        return r3;
    }

    public void A07(long j2) {
        AnonymousClass00B.A00();
        C16600tK r3 = this.A02;
        if (!r3.A08()) {
            if (this.A01 != null) {
                Log.i("app/msghandler-not-connected/connecting-now");
                C19090xk r2 = this.A01.A00;
                r2.A0s.A01();
                r2.A0q.A02();
                r2.A0G(true, false, false);
            } else {
                Log.i("app/msghandler-not-connected/too-early-to-connect");
            }
            Log.i("app/waiting-for-msghandler-to-be-connected");
            AnonymousClass00B.A00();
            if (!r3.A02.block(j2)) {
                Log.i("gdrive-service/backup-map/timeout-while-waiting-for-msghandler-to-be-connected/abort");
                throw new C34541kR();
            }
        }
        Log.i("app/msghandler-connected/true");
    }

    public final void A08(Message message, String str, boolean z2) {
        int A002 = C34501kN.A00(message);
        if (this.A02.A05) {
            if (z2) {
                AnonymousClass1CM r2 = this.A06;
                AnonymousClass00B.A06(str);
                StringBuilder sb = new StringBuilder("Ackable message with null id not allowed:");
                sb.append(message);
                AnonymousClass00B.A07(str, sb.toString());
                LinkedHashMap linkedHashMap = r2.A00;
                synchronized (linkedHashMap) {
                    int i2 = 1;
                    if (linkedHashMap.containsKey(str)) {
                        i2 = 1 + ((Integer) ((Pair) linkedHashMap.get(str)).second).intValue();
                    }
                    linkedHashMap.put(str, Pair.create(message, Integer.valueOf(i2)));
                }
            }
            A09(message, false);
            return;
        }
        StringBuilder sb2 = new StringBuilder("MessageClient/sendMessageWhenReady/add-to-pending type: ");
        sb2.append(A002);
        sb2.append(" id: ");
        sb2.append(str);
        Log.i(sb2.toString());
        List list = this.A04.A00;
        synchronized (list) {
            list.add(new C34441kG(message, str, z2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0024, code lost:
        if (r5 != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(android.os.Message r4, boolean r5) {
        /*
            r3 = this;
            X.1kO r1 = r3.A00
            java.lang.String r0 = "sendXmpp called before sending channel is ready"
            X.AnonymousClass00B.A07(r1, r0)
            java.lang.String r0 = "MessageClient/sendXmpp; type="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = X.C34501kN.A00(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = X.C34501kN.A00(r4)
            switch(r0) {
                case 4: goto L_0x0026;
                case 8: goto L_0x0026;
                case 12: goto L_0x0026;
                case 25: goto L_0x0026;
                case 27: goto L_0x0026;
                case 35: goto L_0x0026;
                case 38: goto L_0x0026;
                case 59: goto L_0x0026;
                case 60: goto L_0x0026;
                case 71: goto L_0x0026;
                case 72: goto L_0x0026;
                case 73: goto L_0x0026;
                case 77: goto L_0x0026;
                case 89: goto L_0x0026;
                case 118: goto L_0x0026;
                case 119: goto L_0x0026;
                case 157: goto L_0x0026;
                case 194: goto L_0x0026;
                case 206: goto L_0x0026;
                case 220: goto L_0x0026;
                case 255: goto L_0x0026;
                case 273: goto L_0x0026;
                case 327: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            if (r5 == 0) goto L_0x003c
        L_0x0026:
            X.1kP r0 = r3.A01
            X.AnonymousClass00B.A06(r0)
            X.0xk r2 = r0.A00
            X.1S3 r0 = r2.A0s
            r0.A01()
            X.1kQ r0 = r2.A0q
            r0.A02()
            r1 = 1
            r0 = 0
            r2.A0G(r1, r0, r0)
        L_0x003c:
            X.1kO r2 = r3.A00
            android.os.Message r1 = android.os.Message.obtain(r4)
            android.os.Handler r2 = (android.os.Handler) r2
            r0 = 4
            r1.what = r0
            r2.sendMessage(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17190ug.A09(android.os.Message, boolean):void");
    }

    public void A0A(C19550yc r9, C28371Vv r10, String str, int i2, long j2) {
        A0C(r9, r10, str, i2, j2, false);
    }

    public void A0B(C19550yc r16, C28371Vv r17, String str, int i2, long j2) {
        C19550yc r3 = r16;
        C28371Vv r4 = r17;
        String str2 = str;
        int i3 = i2;
        long j3 = j2;
        if (!A0G(r3, r4, str2, i3, j3)) {
            StringBuilder sb = new StringBuilder("MessageClient/sendIqWithCallback/add-to-pending type: ");
            sb.append(i3);
            sb.append(" id: ");
            sb.append(str2);
            Log.i(sb.toString());
            this.A07.A01(r3, str2, j3, true);
            A0F(new C34491kM(str2, i3));
            C222717h r32 = this.A04;
            boolean z2 = false;
            if (j2 > 0) {
                z2 = true;
            }
            Message A002 = A00(r4, str2, i3, false, false, z2);
            List list = r32.A00;
            synchronized (list) {
                list.add(new C34441kG(A002, str2, false));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2.A08() == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.C19550yc r18, X.C28371Vv r19, java.lang.String r20, int r21, long r22, boolean r24) {
        /*
            r17 = this;
            r4 = r17
            X.0tK r2 = r4.A02
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x000f
            boolean r1 = r2.A08()
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            X.1CP r11 = r4.A07
            r12 = r18
            r6 = r20
            if (r0 == 0) goto L_0x0040
            r10 = 0
            r3 = 0
            r16 = 0
            r14 = r22
            r13 = r6
            r11.A01(r12, r13, r14, r16)
            X.1kM r0 = new X.1kM
            r7 = r21
            r0.<init>(r6, r7)
            r4.A0F(r0)
            r9 = 1
            r1 = 0
            int r0 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0034
            r10 = 1
        L_0x0034:
            r5 = r19
            r8 = r24
            android.os.Message r0 = A00(r5, r6, r7, r8, r9, r10)
            r4.A09(r0, r3)
            return
        L_0x0040:
            r11.A03(r6)
            java.lang.String r0 = "MessageClient/sendIqWithCallback ready:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            boolean r0 = r2.A05
            r1.append(r0)
            java.lang.String r0 = " connected:"
            r1.append(r0)
            boolean r0 = r2.A08()
            r1.append(r0)
            java.lang.String r0 = " iqId="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r12.APb(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17190ug.A0C(X.0yc, X.1Vv, java.lang.String, int, long, boolean):void");
    }

    public void A0D(C28371Vv r4, int i2) {
        if (this.A02.A05) {
            A09(Message.obtain((Handler) null, 0, 6, i2, r4), false);
        }
    }

    public void A0E(C30641ci r4) {
        this.A09.A03(r4.A00);
        A09(Message.obtain((Handler) null, 0, 76, 0, r4), false);
    }

    public final void A0F(AnonymousClass1WE r4) {
        if (this.A03.A0E(C16620tM.A02, 1740)) {
            Set<AnonymousClass1S5> set = this.A0A;
            synchronized (set) {
                for (AnonymousClass1S5 accept : set) {
                    r4.accept(accept);
                }
            }
        }
    }

    public boolean A0G(C19550yc r9, C28371Vv r10, String str, int i2, long j2) {
        return A0H(r9, r10, str, i2, j2, false);
    }

    public final boolean A0H(C19550yc r15, C28371Vv r16, String str, int i2, long j2, boolean z2) {
        String str2 = str;
        if (this.A02.A05) {
            this.A07.A01(r15, str2, j2, false);
            int i3 = i2;
            A0F(new C34491kM(str2, i3));
            boolean z3 = false;
            if (j2 > 0) {
                z3 = true;
            }
            A09(A00(r16, str2, i3, z2, false, z3), true);
            return true;
        }
        this.A07.A03(str2);
        StringBuilder sb = new StringBuilder("MessageClient/sendIqWithCallback not ready, iqId=");
        sb.append(str2);
        Log.i(sb.toString());
        return false;
    }
}
