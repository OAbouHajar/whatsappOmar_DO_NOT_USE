package X;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2bn  reason: invalid class name and case insensitive filesystem */
public class C51512bn extends C51442bg {
    public final C16300so A00;
    public final C54182gw A01;
    public final C207811o A02;
    public final Set A03;

    public C51512bn(C16300so r7, C54182gw r8, C14710pd r9, C16490t9 r10, AnonymousClass2H7 r11, C207811o r12, Map map, Set set) {
        super(r7, r9, r10, r11, map);
        this.A00 = r7;
        this.A02 = r12;
        this.A01 = r8;
        this.A03 = set;
    }

    public void A00(C28371Vv r25) {
        String str;
        String str2;
        C28371Vv A0J;
        int i2;
        C28371Vv r4 = r25;
        if (C28371Vv.A07(r4, "stream:error")) {
            C54182gw r7 = this.A01;
            if (r7.A03.A02()) {
                try {
                    int A0A = r4.A0A("code", 0);
                    if (A0A == 515) {
                        i2 = 244;
                    } else if (A0A == 516) {
                        i2 = 245;
                    }
                    r7.A05.A00(r4, (C30641ci) null, i2);
                    return;
                } catch (AnonymousClass1W9 e2) {
                    Log.e("CompanionConnectionInterceptor/handleStreamError", e2);
                }
            }
            if (r7.A01.A0G() && (A0J = r4.A0J("conflict")) != null && "device_removed".equals(A0J.A0N("type", (String) null))) {
                r7.A02.A00((String) null, false, true);
                return;
            }
            C28371Vv A0J2 = r4.A0J("ack");
            if (A0J2 != null) {
                String A0N = r4.A0N("id", (String) null);
                String A0N2 = A0J2.A0N("id", (String) null);
                if (A0N == null) {
                    A0N = A0N2;
                }
                StringBuilder sb = new StringBuilder("ErrorStanzaHandler/received ack-kick id=");
                sb.append(A0N);
                Log.w(sb.toString());
                C75843so r2 = new C75843so();
                C207811o r6 = this.A02;
                synchronized (r6) {
                    long j2 = Long.MAX_VALUE;
                    C30831d2 r72 = null;
                    long j3 = 0;
                    long j4 = 0;
                    long j5 = 0;
                    for (int A022 : r6.A06) {
                        for (Map.Entry entry : new HashMap(r6.A02(A022)).entrySet()) {
                            Long l2 = (Long) entry.getKey();
                            C30831d2 r1 = (C30831d2) entry.getValue();
                            if (r1 != null) {
                                j3++;
                                Integer num = r1.A0A;
                                if (num != null && num.intValue() > 0) {
                                    j4++;
                                }
                                if (A0N != null && A0N.equals(r1.A0B)) {
                                    j5++;
                                    long longValue = l2.longValue();
                                    if (j2 > longValue) {
                                        j2 = longValue;
                                        r72 = r1;
                                    }
                                }
                            }
                        }
                    }
                    r2.A05 = Long.valueOf(j3);
                    r2.A04 = Long.valueOf(j4);
                    r2.A07 = Long.valueOf(j5);
                    if (r72 != null) {
                        r2.A06 = Long.valueOf((long) r6.A02(r72.A02).size());
                        r2.A09 = Long.valueOf(SystemClock.uptimeMillis() - r72.A04);
                        Integer num2 = r72.A0A;
                        if (num2 != null) {
                            r2.A08 = Long.valueOf((long) num2.intValue());
                        }
                        r72.A04(r2);
                    }
                }
                this.A03.A05(r2);
                if (A0N != null) {
                    Set set = this.A03;
                    if (set.contains(A0N)) {
                        StringBuilder sb2 = new StringBuilder("ErrorStanzaHandler/received multiple ack-kick for id=");
                        sb2.append(A0N);
                        Log.w(sb2.toString());
                        Integer num3 = r2.A03;
                        if (num3 != null) {
                            int intValue = num3.intValue();
                            if (intValue == 1) {
                                str2 = "message";
                            } else if (intValue == 2) {
                                str2 = "receipt";
                            } else if (intValue == 4) {
                                str2 = "notification";
                            } else if (intValue == 3) {
                                str2 = "call";
                            }
                            C16300so r3 = this.A00;
                            StringBuilder sb3 = new StringBuilder("multi-kick-");
                            sb3.append(str2);
                            r3.AcB("unacked-stanza", sb3.toString(), false);
                        }
                        str2 = "unknown";
                        C16300so r32 = this.A00;
                        StringBuilder sb32 = new StringBuilder("multi-kick-");
                        sb32.append(str2);
                        r32.AcB("unacked-stanza", sb32.toString(), false);
                    } else {
                        set.add(A0N);
                    }
                }
            }
            AnonymousClass2H7 r33 = this.A04;
            C28371Vv[] r12 = r4.A03;
            if (r12 == null || r12.length <= 0) {
                str = "xmpp/reader/read/stream/error";
            } else {
                StringBuilder sb4 = new StringBuilder("xmpp/reader/read/stream/error ");
                C28371Vv r13 = r12[0];
                sb4.append(r13.A00);
                sb4.append(" ");
                sb4.append(Arrays.toString(r13.A01));
                str = sb4.toString();
            }
            Log.i(str);
            try {
                int A0A2 = r4.A0A("code", 0);
                AnonymousClass2H8 r34 = r33.A01;
                Message obtain = Message.obtain((Handler) null, 0, 158, 0);
                obtain.getData().putInt("errorCode", A0A2);
                r34.AZq(obtain);
            } catch (AnonymousClass1W9 e3) {
                Log.e((Throwable) e3);
            }
        } else if (C28371Vv.A07(r4, "error") && "479".equalsIgnoreCase(r4.A0N("code", (String) null))) {
            AnonymousClass2H7 r14 = this.A04;
            Log.i("xmpp/reader/read/smax/invalid");
            r14.A01.AZq(Message.obtain((Handler) null, 0, 237, 0));
        }
    }
}
