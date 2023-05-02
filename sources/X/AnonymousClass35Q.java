package X;

import android.os.PowerManager;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.TextView;
import com.obwhatsapp.status.playback.widget.StatusEditText;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;
import com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView;
import com.obwhatsapp.textstatuscomposer.voice.VoiceStatusRecordingVisualizer;

/* renamed from: X.35Q  reason: invalid class name */
public class AnonymousClass35Q extends AnonymousClass3Tu {
    public boolean A00 = false;
    public final /* synthetic */ CreationModeBottomBar A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass35Q(CreationModeBottomBar creationModeBottomBar) {
        super(creationModeBottomBar, 1.0f, 2.0f);
        this.A01 = creationModeBottomBar;
    }

    public void AXO(AnonymousClass4X6 r12) {
        super.AXO(r12);
        C41581wC r2 = this.A01.A0E;
        if (r2 != null && r12.A07.A00 >= ((double) this.A00) && !this.A00) {
            C41571wB r22 = (C41571wB) r2;
            CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) r22.A0L;
            AnonymousClass0GT r3 = new AnonymousClass0GT(3);
            r3.A04(300);
            r3.A06(creationModeBottomBar.A03);
            r3.A06(creationModeBottomBar.A0D);
            r3.A06(creationModeBottomBar.A0A);
            r3.A05(new DecelerateInterpolator());
            r3.A08(new AnonymousClass3TB(creationModeBottomBar));
            C015807o.A02(creationModeBottomBar, r3);
            creationModeBottomBar.A0D.setVisibility(8);
            creationModeBottomBar.A03.setVisibility(8);
            creationModeBottomBar.A0A.setVisibility(0);
            r22.A00 = 0.0f;
            r22.A0B = false;
            r22.A0C = false;
            C78563yI r0 = new C78563yI(r22);
            r22.A06 = r0;
            r0.A00();
            C41561wA r5 = r22.A07;
            if (r5 != null) {
                r22.A04 = SystemClock.elapsedRealtime();
                TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) r5;
                if (!(textStatusComposerActivity.A0d == null || textStatusComposerActivity.A0e == null)) {
                    C015807o.A01((ViewGroup) textStatusComposerActivity.A00);
                    C015807o.A01(textStatusComposerActivity.A08);
                    textStatusComposerActivity.A0d.setScaleX(1.0f);
                    textStatusComposerActivity.A0d.setScaleY(1.0f);
                    VoiceRecordingView voiceRecordingView = textStatusComposerActivity.A0d;
                    StatusEditText statusEditText = textStatusComposerActivity.A0a;
                    AnonymousClass0GD r6 = new AnonymousClass0GD();
                    r6.A02 = 200;
                    r6.A03 = true;
                    AnonymousClass0GT r02 = new AnonymousClass0GT(3);
                    r02.A06(statusEditText);
                    r02.A06(voiceRecordingView);
                    r02.A02 = 0;
                    r6.A0a(r02);
                    r6.A0Y(new DecelerateInterpolator());
                    r6.A0X(300);
                    C015807o.A02((ViewGroup) textStatusComposerActivity.A00, r6);
                    ViewGroup viewGroup = textStatusComposerActivity.A08;
                    ImageButton imageButton = textStatusComposerActivity.A0A;
                    TextView textView = textStatusComposerActivity.A0C;
                    AnonymousClass0GD r62 = new AnonymousClass0GD();
                    r62.A03 = true;
                    r62.A02 = 200;
                    AnonymousClass0GU r10 = new AnonymousClass0GU();
                    r10.A0Z(5);
                    r10.A06(imageButton);
                    r10.A06(textView);
                    r10.A02 = 0;
                    AnonymousClass0GM r32 = new AnonymousClass0GM();
                    r32.A00 = Float.POSITIVE_INFINITY;
                    r10.A0P(r32);
                    r10.A04(1500);
                    r62.A0a(r10);
                    AnonymousClass0GT r03 = new AnonymousClass0GT(2);
                    r03.A06(imageButton);
                    r03.A06(textView);
                    r03.A02 = 0;
                    r03.A04(300);
                    r62.A0a(r03);
                    r62.A0Y(new DecelerateInterpolator());
                    C015807o.A02(viewGroup, r62);
                    textStatusComposerActivity.A0a.setVisibility(8);
                    textStatusComposerActivity.A0d.setVisibility(0);
                    textStatusComposerActivity.A0A.setVisibility(8);
                    textStatusComposerActivity.A0C.setVisibility(8);
                    C41521w4 r7 = textStatusComposerActivity.A0e;
                    r7.A0J.A01();
                    PowerManager.WakeLock wakeLock = r7.A03;
                    if (wakeLock != null) {
                        wakeLock.acquire(C41521w4.A0N);
                    }
                    AnonymousClass2U4 r8 = r7.A0H;
                    r8.AHF();
                    VoiceRecordingView voiceRecordingView2 = (VoiceRecordingView) r8;
                    VoiceStatusRecordingVisualizer voiceStatusRecordingVisualizer = voiceRecordingView2.A0C;
                    voiceStatusRecordingVisualizer.A0B.clear();
                    voiceStatusRecordingVisualizer.A00 = 0;
                    voiceStatusRecordingVisualizer.A01 = 750;
                    voiceStatusRecordingVisualizer.A06 = false;
                    voiceStatusRecordingVisualizer.invalidate();
                    long j2 = r7.A02;
                    if (j2 != -1) {
                        C41501w2 A002 = r7.A0D.A00(r7, j2);
                        r7.A07 = A002;
                        A002.A00();
                        AnonymousClass2ZQ.A00(C19980zJ.A02(voiceRecordingView2));
                    }
                    r7.A02(0);
                    r7.A0B = true;
                }
            }
            this.A00 = true;
        }
    }
}
