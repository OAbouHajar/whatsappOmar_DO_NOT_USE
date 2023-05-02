package X;

import android.widget.SeekBar;
import com.obwhatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity;

/* renamed from: X.4lW  reason: invalid class name and case insensitive filesystem */
public class C94814lW implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ WallpaperCurrentPreviewActivity A00;

    public C94814lW(WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity) {
        this.A00 = wallpaperCurrentPreviewActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r3.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onProgressChanged(android.widget.SeekBar r4, int r5, boolean r6) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x001a
            if (r6 == 0) goto L_0x001a
            com.obwhatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity r2 = r3.A00
            X.4Ul r0 = r2.A09
            if (r0 == 0) goto L_0x001a
            android.graphics.drawable.Drawable r1 = r0.A00
            if (r1 == 0) goto L_0x001a
            int r0 = r4.getProgress()
            X.C62063Bm.A04(r2, r1, r0)
            com.obwhatsapp.settings.chat.wallpaper.WallpaperImagePreview r0 = r2.A0A
            r0.setImageDrawable(r1)
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94814lW.onProgressChanged(android.widget.SeekBar, int, boolean):void");
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (seekBar != null) {
            int progress = seekBar.getProgress();
            WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity = this.A00;
            wallpaperCurrentPreviewActivity.A08.A09(wallpaperCurrentPreviewActivity, C62063Bm.A03(wallpaperCurrentPreviewActivity.getIntent()), progress);
        }
    }
}
