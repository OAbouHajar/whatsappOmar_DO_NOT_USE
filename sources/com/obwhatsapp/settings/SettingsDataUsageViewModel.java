package com.obwhatsapp.settings;

import X.AnonymousClass027;
import X.C003401n;
import X.C14710pd;
import X.C16190sc;
import X.C16320sq;
import android.os.Build;
import android.os.Environment;
import java.io.File;

public class SettingsDataUsageViewModel extends C003401n {
    public final AnonymousClass027 A00 = new AnonymousClass027(Boolean.FALSE);
    public final C16190sc A01;
    public final C14710pd A02;
    public final C16320sq A03;

    public SettingsDataUsageViewModel(C16190sc r3, C14710pd r4, C16320sq r5) {
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
    }

    public static /* synthetic */ void A01(SettingsDataUsageViewModel settingsDataUsageViewModel) {
        AnonymousClass027 r1;
        Boolean bool;
        if (Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageLegacy() || !settingsDataUsageViewModel.A02.A0C(1235)) {
            r1 = settingsDataUsageViewModel.A00;
            bool = Boolean.FALSE;
        } else {
            File file = new File(Environment.getExternalStorageDirectory(), "OBWhatsApp");
            r1 = settingsDataUsageViewModel.A00;
            bool = Boolean.valueOf(file.exists());
        }
        r1.A09(bool);
    }
}
