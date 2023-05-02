package X;

import android.widget.Button;
import com.obwhatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;

/* renamed from: X.4m8  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95124m8 implements AnonymousClass023 {
    public final /* synthetic */ Button A00;
    public final /* synthetic */ DownloadableWallpaperPickerActivity A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C95124m8(Button button, DownloadableWallpaperPickerActivity downloadableWallpaperPickerActivity, boolean z2) {
        this.A01 = downloadableWallpaperPickerActivity;
        this.A02 = z2;
        this.A00 = button;
    }

    public final void AOH(Object obj) {
        DownloadableWallpaperPickerActivity downloadableWallpaperPickerActivity = this.A01;
        boolean z2 = this.A02;
        Button button = this.A00;
        C83904Im r9 = (C83904Im) obj;
        int i2 = r9.A00;
        int i3 = 1;
        if (i2 == 2) {
            C83894Il r0 = r9.A01;
            AnonymousClass00B.A06(r0);
            downloadableWallpaperPickerActivity.A07 = z2 ? r0.A01 : r0.A00;
            downloadableWallpaperPickerActivity.A01.setVisibility(8);
            downloadableWallpaperPickerActivity.A00.setVisibility(8);
            downloadableWallpaperPickerActivity.A03.setVisibility(0);
            button.setEnabled(false);
            AnonymousClass01Q r2 = downloadableWallpaperPickerActivity.A02;
            if (r2 == null) {
                i3 = 0;
            }
            downloadableWallpaperPickerActivity.A06.A0E(r2, downloadableWallpaperPickerActivity.A07, i3);
        } else if (i2 == 1) {
            button.setEnabled(false);
            downloadableWallpaperPickerActivity.A01.setVisibility(0);
            downloadableWallpaperPickerActivity.A00.setVisibility(8);
            downloadableWallpaperPickerActivity.A03.setVisibility(8);
        } else {
            downloadableWallpaperPickerActivity.A01.setVisibility(8);
            downloadableWallpaperPickerActivity.A00.setVisibility(0);
            downloadableWallpaperPickerActivity.A03.setVisibility(8);
            button.setEnabled(true);
        }
    }
}
