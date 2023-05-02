package X;

import android.graphics.drawable.Drawable;
import com.obwhatsapp.settings.chat.wallpaper.WallPaperView;

/* renamed from: X.4xa  reason: invalid class name and case insensitive filesystem */
public class C101604xa implements AnonymousClass5SW {
    public final /* synthetic */ C70673hW A00;
    public final /* synthetic */ WallPaperView A01;
    public final /* synthetic */ Runnable A02;

    public C101604xa(C70673hW r1, WallPaperView wallPaperView, Runnable runnable) {
        this.A00 = r1;
        this.A02 = runnable;
        this.A01 = wallPaperView;
    }

    public void A6G() {
        WallPaperView wallPaperView = this.A01;
        wallPaperView.A04 = false;
        wallPaperView.setImageDrawable((Drawable) null);
        wallPaperView.invalidate();
    }

    public void Af0(Drawable drawable) {
        this.A00.A00(drawable);
    }

    public void Ai5() {
        this.A02.run();
    }
}
