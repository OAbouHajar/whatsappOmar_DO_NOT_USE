package X;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import com.facebook.redex.IDxCListenerShape42S0000000_2_I0;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1PA  reason: invalid class name */
public class AnonymousClass1PA {
    public AudioFocusRequest A00;
    public AudioManager.OnAudioFocusChangeListener A01;
    public Handler A02;
    public Object A03;
    public List A04;
    public boolean A05;
    public final AnonymousClass01V A06;
    public final Runnable A07 = new RunnableRunnableShape15S0100000_I0_14(this, 6);

    public AnonymousClass1PA(AnonymousClass01V r3) {
        this.A06 = r3;
    }

    public final AudioFocusRequest A00() {
        AudioFocusRequest audioFocusRequest = this.A00;
        if (audioFocusRequest != null) {
            return audioFocusRequest;
        }
        AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build()).build();
        this.A00 = build;
        return build;
    }

    public final void A01() {
        if (this.A03 != null) {
            Log.i("AudioManager/audio-focus-abandoned");
            this.A03 = null;
            AudioManager A0G = this.A06.A0G();
            if (A0G == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                A0G.abandonAudioFocusRequest(A00());
                return;
            }
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new IDxCListenerShape42S0000000_2_I0(1);
                this.A01 = onAudioFocusChangeListener;
            }
            A0G.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    public void A02(Object obj) {
        Log.i("AudioManager/on-abandon-audio-focus");
        if (this.A03 == obj) {
            Handler handler = this.A02;
            Runnable runnable = this.A07;
            handler.removeCallbacks(runnable);
            this.A02.postDelayed(runnable, 1000);
        }
    }

    public void A03(Object obj) {
        Log.i("AudioManager/on-request-audio-focus");
        this.A02.removeCallbacks(this.A07);
        if (this.A03 == null) {
            Log.i("AudioManager/request-audio-focus");
            AudioManager A0G = this.A06.A0G();
            if (A0G != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    A0G.requestAudioFocus(A00());
                } else {
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
                    if (onAudioFocusChangeListener == null) {
                        onAudioFocusChangeListener = new IDxCListenerShape42S0000000_2_I0(1);
                        this.A01 = onAudioFocusChangeListener;
                    }
                    A0G.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
                }
            }
        }
        this.A03 = obj;
    }
}
