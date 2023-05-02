package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.obwhatsapp.audioRecording.AudioRecordFactory;
import com.obwhatsapp.audioRecording.OpusRecorderFactory;
import com.whatsapp.util.OpusRecorder;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;

/* renamed from: X.1w2  reason: invalid class name and case insensitive filesystem */
public class C41501w2 extends HandlerThread {
    public float A00 = 0.0f;
    public int A01 = 0;
    public long A02 = 0;
    public Handler A03;
    public C30811cz A04;
    public final long A05;
    public final Handler A06;
    public final C16180sb A07;
    public final AudioRecordFactory A08;
    public final OpusRecorderFactory A09;
    public final C16440t3 A0A;
    public final C14710pd A0B;
    public final WeakReference A0C;

    public C41501w2(C16180sb r3, AudioRecordFactory audioRecordFactory, OpusRecorderFactory opusRecorderFactory, C16440t3 r6, C14710pd r7, C41521w4 r8, long j2) {
        super("VoiceStatusRecorderThread");
        this.A07 = r3;
        this.A0B = r7;
        this.A08 = audioRecordFactory;
        this.A09 = opusRecorderFactory;
        this.A0A = r6;
        this.A05 = j2;
        this.A0C = new WeakReference(r8);
        this.A06 = new Handler(Looper.getMainLooper());
    }

    public void A00() {
        if (this.A03 == null) {
            start();
            Handler handler = new Handler(getLooper());
            this.A03 = handler;
            handler.post(new RunnableRunnableShape15S0100000_I0_14(this, 41));
            this.A03.postDelayed(new RunnableRunnableShape15S0100000_I0_14(this, 39), 16);
            this.A03.post(new RunnableRunnableShape15S0100000_I0_14(this, 40));
            this.A03.postDelayed(new RunnableRunnableShape15S0100000_I0_14(this, 37), this.A05);
        }
    }

    public final void A01(boolean z2) {
        C30811cz r0;
        C30811cz r2 = this.A04;
        if (r2 != null) {
            try {
                OpusRecorder opusRecorder = r2.A06;
                opusRecorder.stop();
                r2.A01 = opusRecorder.getPageNumber();
                this.A04.A01();
                FileOutputStream fileOutputStream = this.A04.A02;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (z2 && (r0 = this.A04) != null) {
                    File file = r0.A09;
                    r0.A08.delete();
                    file.delete();
                }
                C30811cz r1 = this.A04;
                r1.A06.close();
                r1.A04.release();
            } catch (Exception unused) {
            }
            this.A04 = null;
            quit();
            interrupt();
        }
    }
}
