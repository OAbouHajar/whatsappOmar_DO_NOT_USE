package X;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape0S0301000_I0;
import com.facebook.redex.RunnableRunnableShape16S0100000_I0_15;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.15O  reason: invalid class name */
public class AnonymousClass15O {
    public static final Uri A09 = Uri.parse("");
    public C30211bx A00;
    public ExecutorService A01;
    public final Handler A02 = new AnonymousClass2IT(Looper.getMainLooper(), this);
    public final C14870pt A03;
    public final C19610yi A04;
    public final AnonymousClass01V A05;
    public final C16980tz A06;
    public final AnonymousClass15N A07;
    public final AnonymousClass15M A08;

    public AnonymousClass15O(C14870pt r9, C19610yi r10, AnonymousClass01V r11, C16980tz r12, AnonymousClass15N r13, AnonymousClass15M r14, C16320sq r15) {
        this.A06 = r12;
        this.A03 = r9;
        this.A05 = r11;
        this.A07 = r13;
        this.A04 = r10;
        this.A08 = r14;
        this.A01 = r15.A7d("AsyncAudioPlayer", new LinkedBlockingQueue(), 0, 1, 0, 60);
    }

    public void A00() {
        this.A01.submit(new RunnableRunnableShape16S0100000_I0_15(this, 5));
    }

    public void A01(Uri uri) {
        Uri uri2 = uri;
        if (uri.compareTo(A09) != 0) {
            Handler handler = this.A02;
            handler.removeMessages(99);
            handler.sendEmptyMessageDelayed(99, 10000);
            A00();
            if (!this.A07.A00) {
                Context context = this.A06.A00;
                if (this.A08.A00) {
                    AudioManager A0G = this.A05.A0G();
                    if (A0G == null || A0G.getStreamVolume(5) > 0) {
                        this.A01.submit(new RunnableRunnableShape0S0301000_I0(this, context, uri2, 3, 11));
                        return;
                    }
                    return;
                }
                this.A03.A0K(new RunnableRunnableShape2S0300000_I0_2(this, context, uri, 22));
            }
        }
    }
}
