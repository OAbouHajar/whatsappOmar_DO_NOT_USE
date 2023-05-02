package X;

import android.graphics.Bitmap;
import com.obwhatsapp.settings.chat.wallpaper.WallpaperDownloadFailedDialogFragment;
import com.obwhatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;

/* renamed from: X.38g  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C612738g {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C605834i A01;
    public final /* synthetic */ C606234m A02;

    public /* synthetic */ C612738g(C605834i r1, C606234m r2, int i2) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i2;
    }

    public final void A00(C83884Ik r6) {
        C606234m r1 = this.A02;
        C605834i r3 = this.A01;
        int i2 = this.A00;
        Bitmap bitmap = r6.A01;
        if (bitmap != null) {
            r3.setWallpaper(bitmap);
        }
        int i3 = r6.A00;
        if (i3 == 2) {
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = r1.A02.A01;
            downloadableWallpaperPreviewActivity.A08.add(Integer.valueOf(i2));
            if (downloadableWallpaperPreviewActivity.A01.getCurrentItem() == i2) {
                downloadableWallpaperPreviewActivity.A00.setEnabled(true);
            }
            r3.A02.setVisibility(8);
        } else if (i3 == 1) {
            r3.A02.setVisibility(0);
            r3.A03.setVisibility(0);
            r3.A01.setVisibility(8);
        } else {
            C83924Io r12 = r1.A02;
            if (!r12.A00) {
                r12.A00 = true;
                r12.A01.Afc(WallpaperDownloadFailedDialogFragment.A01(i3));
            }
            r3.A02.setVisibility(0);
            r3.A03.setVisibility(8);
            r3.A01.setVisibility(0);
        }
    }
}
