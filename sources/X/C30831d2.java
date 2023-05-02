package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1d2  reason: invalid class name and case insensitive filesystem */
public abstract class C30831d2 {
    public int A00 = -1;
    public long A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final C16300so A05;
    public final C16440t3 A06;
    public final C16490t9 A07;
    public final C207811o A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final Map A0C = new LinkedHashMap();

    public C30831d2(C16300so r4, C16440t3 r5, C16490t9 r6, C207811o r7, Integer num, String str, int i2, long j2, long j3) {
        this.A06 = r5;
        this.A05 = r4;
        this.A07 = r6;
        this.A08 = r7;
        this.A0B = str;
        this.A03 = j2;
        this.A02 = i2;
        this.A00 = 1;
        this.A01 = j3;
        this.A04 = j3;
        C16470t7 A022 = A02(-1, 0);
        this.A09 = r6.A00(A022.samplingRate, A022.code, false);
        this.A0A = num;
    }

    public synchronized void A00(int i2) {
        int i3 = this.A00;
        if (i2 == i3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid stage ");
            sb.append(i3);
            sb.append(" ");
            sb.append(this.A0B);
            String obj = sb.toString();
            C16300so r2 = this.A05;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A03());
            sb2.append("/failed new stage check");
            r2.AcB(sb2.toString(), obj, true);
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            A01(i3, uptimeMillis - this.A01);
            this.A00 = i2;
            this.A01 = uptimeMillis;
        }
    }

    public final void A01(int i2, long j2) {
        Integer num = this.A09;
        if (num != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(A03());
            sb.append("/onStageComplete stage = ");
            sb.append(i2);
            sb.append("; duration = ");
            sb.append(j2);
            sb.append("; ");
            sb.append(this);
            Log.i(sb.toString());
            Map map = this.A0C;
            map.put(Integer.valueOf(i2), Long.valueOf(j2));
            if (i2 == 0) {
                for (Map.Entry entry : map.entrySet()) {
                    this.A07.A07(A02(((Number) entry.getKey()).intValue(), ((Number) entry.getValue()).longValue()), num.intValue());
                }
            }
        }
    }

    public C16470t7 A02(int i2, long j2) {
        if (this instanceof C52982em) {
            C52982em r4 = (C52982em) this;
            C75753sf r3 = new C75753sf();
            r3.A03 = Long.valueOf(j2);
            r3.A00 = Boolean.valueOf(r4.A02);
            Integer num = r4.A0A;
            if (num != null) {
                r3.A04 = Long.valueOf((long) num.intValue());
            }
            r3.A05 = Long.valueOf(r4.A00);
            r3.A06 = Long.valueOf(C29501aj.A01(r4.A04, 0));
            r3.A02 = Integer.valueOf(i2);
            r3.A07 = Long.valueOf(r4.A01);
            r3.A08 = r4.A05;
            r3.A01 = Integer.valueOf(r4.A03);
            return r3;
        } else if (this instanceof C52282dU) {
            C52282dU r32 = (C52282dU) this;
            C75293rv r2 = new C75293rv();
            r2.A01 = Long.valueOf(j2);
            Integer num2 = r32.A0A;
            if (num2 != null) {
                r2.A02 = Long.valueOf((long) num2.intValue());
            }
            r2.A00 = Integer.valueOf(i2);
            r2.A04 = r32.A01;
            r2.A03 = r32.A00;
            return r2;
        } else {
            C30841d3 r33 = (C30841d3) this;
            C75783si r22 = new C75783si();
            r22.A00 = Boolean.valueOf(r33.A05);
            r22.A04 = Integer.valueOf(r33.A00);
            r22.A08 = Long.valueOf(j2);
            r22.A01 = Boolean.valueOf(r33.A02);
            r22.A02 = Boolean.valueOf(r33.A04);
            Integer num3 = r33.A0A;
            if (num3 != null) {
                r22.A09 = Long.valueOf((long) num3.intValue());
            }
            r22.A03 = Boolean.valueOf(r33.A06);
            r22.A05 = Integer.valueOf(i2);
            r22.A06 = Integer.valueOf(r33.A03);
            r22.A07 = Long.valueOf(r33.A01);
            return r22;
        }
    }

    public String A03() {
        return this instanceof C52982em ? "ReceiptStanza" : this instanceof C52282dU ? "NotificationStanza" : "MessageStanza";
    }

    public void A04(C75843so r4) {
        if (this instanceof C52982em) {
            C52982em r1 = (C52982em) this;
            r4.A03 = 2;
            r4.A02 = Integer.valueOf(r1.A03);
            r4.A0B = r1.A05;
        } else if (this instanceof C52282dU) {
            C52282dU r2 = (C52282dU) this;
            r4.A03 = 4;
            StringBuilder sb = new StringBuilder();
            sb.append(r2.A01);
            sb.append("/");
            sb.append(r2.A00);
            r4.A0A = sb.toString();
        } else {
            C30841d3 r12 = (C30841d3) this;
            r4.A03 = 1;
            r4.A01 = Integer.valueOf(r12.A00);
            r4.A02 = Integer.valueOf(r12.A03);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("stanzaId = ");
        sb.append(this.A0B);
        sb.append("; loggableStanzaType = ");
        sb.append(this.A02);
        sb.append("; currentStage = ");
        sb.append(this.A00);
        sb.append("; offlineCount = ");
        sb.append(this.A0A);
        return sb.toString();
    }
}
