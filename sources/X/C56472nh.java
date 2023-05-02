package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.obwhatsapp.conversation.waveforms.VoiceVisualizer;

/* renamed from: X.2nh  reason: invalid class name and case insensitive filesystem */
public class C56472nh extends Handler {
    public long A00;
    public final long A01;
    public final AnonymousClass44E A02;
    public final C16760tb A03;
    public final C16440t3 A04;
    public final AnonymousClass1ZL A05;
    public final C109005Qi A06;
    public final C109005Qi A07;
    public final C109005Qi A08;
    public final C109005Qi A09;
    public final C30201bw A0A;
    public final C30221by A0B;
    public final C30221by A0C;

    public C56472nh(AnonymousClass44E r2, C16760tb r3, C16440t3 r4, AnonymousClass1ZL r5, C109005Qi r6, C109005Qi r7, C109005Qi r8, C109005Qi r9, C30201bw r10, C30221by r11, C30221by r12, long j2) {
        super(Looper.getMainLooper());
        this.A04 = r4;
        this.A03 = r3;
        this.A0A = r10;
        this.A05 = r5;
        this.A02 = r2;
        this.A0B = r11;
        this.A0C = r12;
        this.A08 = r6;
        this.A09 = r7;
        this.A07 = r8;
        this.A06 = r9;
        this.A01 = j2;
    }

    public void handleMessage(Message message) {
        C15830rv r2;
        C30811cz r0;
        AnonymousClass1ZK r9 = this.A0A.A00;
        if (r9.A0P != null) {
            long elapsedRealtime = (SystemClock.elapsedRealtime() - r9.A0B) + r9.A0A;
            this.A0C.A5q(Integer.valueOf((int) C13690nt.A09(elapsedRealtime)));
            if (r9.A06 % 2 == 0) {
                AnonymousClass44E r02 = this.A02;
                double longBitsToDouble = Double.longBitsToDouble(r02.A00.getAndSet(Double.doubleToRawLongBits(Double.MIN_VALUE)));
                if (longBitsToDouble == -1.0d) {
                    this.A07.A5p();
                } else if (longBitsToDouble != Double.MIN_VALUE) {
                    float f2 = (float) longBitsToDouble;
                    VoiceVisualizer voiceVisualizer = this.A05.A0F;
                    AnonymousClass00B.A0F(voiceVisualizer.A0K.isEmpty());
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j2 = voiceVisualizer.A06;
                    if (j2 != 0) {
                        voiceVisualizer.A07 = Math.max(elapsedRealtime2 - j2, 0);
                    }
                    voiceVisualizer.A06 = elapsedRealtime2;
                    voiceVisualizer.A0I.add(Float.valueOf(f2));
                    if (!voiceVisualizer.A0A) {
                        voiceVisualizer.A0A = true;
                        voiceVisualizer.invalidate();
                    }
                }
            }
            this.A06.A5p();
            sendEmptyMessageDelayed(0, 50);
            if (r9.A0K == null && elapsedRealtime > 1000 && (r0 = r9.A0P) != null && r0.A08.length() > 0) {
                this.A09.A5p();
                this.A0B.A5q(r9.A0P.A08);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.A00 + 1250 < currentTimeMillis && (r2 = r9.A0J) != null) {
                this.A00 = currentTimeMillis;
                this.A03.A0E(r2, 1);
                C30811cz r03 = r9.A0P;
                if (r03 != null && r03.A08.length() > this.A01) {
                    StringBuilder A0r = AnonymousClass000.A0r("voicenote/filelimit ");
                    A0r.append(r9.A0P.A08.length());
                    C13680ns.A1V(A0r);
                    this.A08.A5p();
                }
            }
        }
    }
}
