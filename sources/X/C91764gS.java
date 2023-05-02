package X;

import android.media.AudioManager;
import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape1S0101000_I1;

/* renamed from: X.4gS  reason: invalid class name and case insensitive filesystem */
public class C91764gS implements AudioManager.OnAudioFocusChangeListener {
    public final Handler A00;
    public final /* synthetic */ AnonymousClass4WT A01;

    public C91764gS(Handler handler, AnonymousClass4WT r2) {
        this.A01 = r2;
        this.A00 = handler;
    }

    public void onAudioFocusChange(int i2) {
        this.A00.post(new RunnableRunnableShape1S0101000_I1((Object) this, i2, 0));
    }
}
