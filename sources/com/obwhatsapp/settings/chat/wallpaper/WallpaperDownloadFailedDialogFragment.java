package com.obwhatsapp.settings.chat.wallpaper;

import X.AnonymousClass3K3;
import X.C13690nt;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import com.obwhatsapp.R;

public class WallpaperDownloadFailedDialogFragment extends Hilt_WallpaperDownloadFailedDialogFragment {
    public static WallpaperDownloadFailedDialogFragment A01(int i2) {
        WallpaperDownloadFailedDialogFragment wallpaperDownloadFailedDialogFragment = new WallpaperDownloadFailedDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("ERROR_STATE_KEY", i2);
        wallpaperDownloadFailedDialogFragment.A0T(A0D);
        return wallpaperDownloadFailedDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        int i2 = A04().getInt("ERROR_STATE_KEY");
        C32241fu A0c = AnonymousClass3K3.A0c(this);
        A0c.A02(R.string.str1b6e);
        int i3 = R.string.str1b6c;
        if (i2 == 5) {
            i3 = R.string.str1b6d;
        }
        A0c.A01(i3);
        C13690nt.A1F(A0c);
        A0c.A07(false);
        return A0c.create();
    }
}
