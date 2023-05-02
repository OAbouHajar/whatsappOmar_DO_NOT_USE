package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.obwhatsapp.status.playback.widget.VoiceStatusContentView;
import java.lang.ref.WeakReference;

/* renamed from: X.4x7  reason: invalid class name and case insensitive filesystem */
public class C101334x7 implements AnonymousClass2OY {
    public final AnonymousClass2OY A00;
    public final WeakReference A01;

    public C101334x7(C55912ke r2, VoiceStatusContentView voiceStatusContentView) {
        this.A01 = C13690nt.A0h(voiceStatusContentView);
        this.A00 = r2;
    }

    public void AfW(Bitmap bitmap, ImageView imageView, boolean z2) {
        this.A00.AfW(bitmap, imageView, z2);
        VoiceStatusContentView voiceStatusContentView = (VoiceStatusContentView) this.A01.get();
        if (voiceStatusContentView != null) {
            voiceStatusContentView.A03();
        }
    }

    public void Afn(ImageView imageView) {
        this.A00.Afn(imageView);
        VoiceStatusContentView voiceStatusContentView = (VoiceStatusContentView) this.A01.get();
        if (voiceStatusContentView != null) {
            voiceStatusContentView.A03();
        }
    }
}
