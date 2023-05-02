package com.obwhatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass01J;
import X.AnonymousClass027;
import X.AnonymousClass1OL;
import X.C003401n;
import X.C13680ns;
import X.C13690nt;
import X.C16980tz;
import X.C34901l3;
import X.C63933Mc;
import X.C91724gO;
import android.app.Activity;
import android.hardware.display.DisplayManager;
import android.os.Build;
import com.whatsapp.util.Log;

public class OrientationViewModel extends C003401n {
    public DisplayManager.DisplayListener A00;
    public C63933Mc A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass027 A06 = C13690nt.A0O();
    public final C16980tz A07;
    public final AnonymousClass01J A08;

    public OrientationViewModel(AnonymousClass1OL r5, C16980tz r6, AnonymousClass01J r7) {
        this.A07 = r6;
        this.A08 = r7;
        this.A02 = AnonymousClass000.A1X(r7.get());
        int i2 = r5.A01().getInt("portrait_mode_threshold", 30);
        this.A05 = i2;
        int i3 = r5.A01().getInt("landscape_mode_threshold", 30);
        this.A04 = i3;
        StringBuilder A0r = AnonymousClass000.A0r("OrientationViewModel/ctor portraitModeThreshold = ");
        A0r.append(i2);
        Log.i(C13680ns.A0i(" landscapeModeThreshold = ", A0r, i3));
        if (this.A02 && Build.VERSION.SDK_INT >= 17) {
            A07(A05());
        }
    }

    public static /* synthetic */ void A01(OrientationViewModel orientationViewModel) {
        if (orientationViewModel.A02 && Build.VERSION.SDK_INT >= 17) {
            orientationViewModel.A07(orientationViewModel.A05());
        }
    }

    public static /* synthetic */ void A02(OrientationViewModel orientationViewModel, int i2) {
        if (!orientationViewModel.A02 || Build.VERSION.SDK_INT < 17) {
            orientationViewModel.A07(i2);
        }
    }

    public final int A05() {
        return (4 - A06().getDisplay(0).getRotation()) % 4;
    }

    public final DisplayManager A06() {
        return (DisplayManager) this.A07.A00.getSystemService("display");
    }

    public final void A07(int i2) {
        AnonymousClass027 r2 = this.A06;
        Object A012 = r2.A01();
        Integer valueOf = Integer.valueOf(i2);
        if (!C34901l3.A00(A012, valueOf)) {
            Log.i(C13680ns.A0c(i2, "voip/OrientationViewModel/setOrientation "));
            r2.A0B(valueOf);
        }
    }

    public void A08(Activity activity) {
        C63933Mc r1 = this.A01;
        if (r1 == null) {
            r1 = new C63933Mc(activity, this);
            this.A01 = r1;
        }
        if (!this.A03 && r1.canDetectOrientation()) {
            Log.i("voip/OrientationViewModel/enableOrientationListener");
            this.A01.enable();
            this.A03 = true;
        }
        if (Build.VERSION.SDK_INT >= 17 && this.A00 == null) {
            this.A00 = new C91724gO(this);
            A06().registerDisplayListener(this.A00, AnonymousClass000.A0L());
        }
    }

    public boolean A09() {
        boolean z2;
        if (!this.A03 || this.A01 == null) {
            z2 = false;
        } else {
            z2 = true;
            Log.i("voip/OrientationViewModel/disableOrientationListener");
            this.A01.disable();
            this.A03 = false;
        }
        if (Build.VERSION.SDK_INT >= 17 && this.A00 != null) {
            A06().unregisterDisplayListener(this.A00);
            this.A00 = null;
        }
        return z2;
    }
}
