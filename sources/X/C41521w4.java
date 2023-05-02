package X;

import android.os.PowerManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1w4  reason: invalid class name and case insensitive filesystem */
public class C41521w4 implements C41531w5 {
    public static final long A0L;
    public static final long A0M;
    public static final long A0N;
    public int A00 = -1;
    public long A01;
    public long A02 = -1;
    public PowerManager.WakeLock A03;
    public C78713yZ A04;
    public C78713yZ A05;
    public C41541w6 A06 = null;
    public C41501w2 A07;
    public C41481w0 A08;
    public File A09;
    public File A0A;
    public boolean A0B = false;
    public byte[] A0C;
    public final C51122b0 A0D;
    public final AnonymousClass2b1 A0E;
    public final C14600pS A0F;
    public final AnonymousClass1L1 A0G;
    public final AnonymousClass2U4 A0H;
    public final AnonymousClass2U2 A0I;
    public final C23231Az A0J;
    public final C16320sq A0K;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long millis = timeUnit.toMillis(30);
        A0M = millis;
        A0N = millis + timeUnit.toMillis(5);
        A0L = timeUnit.toMillis(27);
    }

    public C41521w4(C51122b0 r4, AnonymousClass2b1 r5, C14600pS r6, AnonymousClass01V r7, AnonymousClass1L1 r8, VoiceRecordingView voiceRecordingView, C23231Az r10, C16320sq r11) {
        this.A0J = r10;
        this.A0K = r11;
        this.A0H = voiceRecordingView;
        this.A0I = voiceRecordingView;
        this.A0F = r6;
        this.A0G = r8;
        this.A0D = r4;
        this.A0E = r5;
        PowerManager A0I2 = r7.A0I();
        if (A0I2 != null) {
            this.A03 = C43421zy.A00(A0I2, "voice-status-recording", 6);
        }
        voiceRecordingView.A0B = this;
    }

    public void A00() {
        C41541w6 r3 = this.A06;
        if (r3 != null) {
            TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) r3;
            C41571wB r2 = textStatusComposerActivity.A0b;
            if (r2 != null && r2.A06.A00 == C41601wE.SEND_VOICE) {
                r2.A06 = new C41611wF(r2);
                r2.A0A = false;
                r2.A0L.A4q(300);
            }
            textStatusComposerActivity.A37();
        }
        this.A08.A00 = null;
        this.A08 = null;
        A03(this.A09);
        this.A09 = null;
        A03(this.A0A);
        this.A0A = null;
        C27701Su r22 = this.A0G.A0D;
        if (r22.A04.A00()) {
            C47462Jb A012 = r22.A01();
            A012.A03 = 32;
            r22.A02.A05(A012);
        }
    }

    public final void A01() {
        VoiceRecordingView voiceRecordingView = (VoiceRecordingView) this.A0H;
        voiceRecordingView.A00.setVisibility(8);
        Animation animation = voiceRecordingView.A02;
        if (animation != null) {
            animation.cancel();
            voiceRecordingView.A02 = null;
        }
        AnonymousClass0GT r3 = new AnonymousClass0GT(3);
        r3.A04(200);
        r3.A02 = 0;
        r3.A05(new DecelerateInterpolator());
        C015807o.A02(voiceRecordingView, r3);
        voiceRecordingView.A03.setVisibility(4);
        voiceRecordingView.A0C.setVisibility(4);
        voiceRecordingView.A01.setVisibility(0);
        voiceRecordingView.A05.setVisibility(0);
        voiceRecordingView.A08.setVisibility(0);
        voiceRecordingView.A0E.setVisibility(0);
        voiceRecordingView.setSeekbarContentDescription(0);
        AnonymousClass1L1 r0 = this.A0G;
        long j2 = this.A01;
        C27701Su r5 = r0.A0D;
        if (r5.A04.A00()) {
            C47462Jb A012 = r5.A01();
            A012.A03 = 30;
            A012.A07 = Long.valueOf((j2 / 1000) * 1000);
            r5.A02.A05(A012);
        }
    }

    public void A02(long j2) {
        TextView textView;
        int i2;
        this.A01 = j2;
        long j3 = A0M;
        if (j2 < j3) {
            long millis = TimeUnit.SECONDS.toMillis(1);
            long j4 = (((j3 - j2) + millis) - 1) / millis;
            AnonymousClass2U4 r5 = this.A0H;
            r5.setRemainingSeconds((int) j4);
            if (j2 < A0L || j2 % TimeUnit.SECONDS.toMillis(1) <= 500) {
                textView = ((VoiceRecordingView) r5).A03;
                i2 = 0;
            } else {
                textView = ((VoiceRecordingView) r5).A03;
                i2 = 4;
            }
            textView.setVisibility(i2);
            return;
        }
        C41501w2 r3 = this.A07;
        if (r3 != null) {
            r3.A03.post(new RunnableRunnableShape15S0100000_I0_14(r3, 38));
            A04(false);
        }
        A01();
        C27701Su r2 = this.A0G.A0D;
        if (r2.A04.A00()) {
            C47462Jb A012 = r2.A01();
            A012.A03 = 29;
            r2.A02.A05(A012);
        }
        C41541w6 r4 = this.A06;
        if (r4 != null) {
            TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) r4;
            C41571wB r32 = textStatusComposerActivity.A0b;
            if (r32 != null && r32.A06.A00 == C41601wE.RECORDING) {
                r32.A06 = new C78583yK(r32);
                C41621wG r22 = r32.A0L;
                r22.AHo();
                r22.A4p(r32.A03, r32.A08);
            }
            textStatusComposerActivity.A35();
        }
    }

    public final void A03(File file) {
        if (file != null) {
            this.A0K.Acl(new RunnableRunnableShape15S0100000_I0_14(file, 35));
        }
    }

    public final void A04(boolean z2) {
        C41501w2 r3 = this.A07;
        if (r3 != null) {
            r3.A03.post(new RunnableRunnableShape0S0110000_I0(r3, 28, z2));
            this.A07 = null;
            this.A0J.A00();
            PowerManager.WakeLock wakeLock = this.A03;
            if (wakeLock != null) {
                wakeLock.release();
            }
            this.A0B = false;
            C19980zJ.A00(((View) this.A0H).getContext()).setRequestedOrientation(-1);
        }
    }
}
