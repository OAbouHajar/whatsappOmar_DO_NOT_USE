package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass29T;
import X.AnonymousClass2RY;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.AnonymousClass3K4;
import X.C001000l;
import X.C14550pN;
import X.C14600pS;
import X.C14730pf;
import X.C32301g2;
import android.app.Activity;
import android.os.Build;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.profile.ViewProfilePhoto;
import com.whatsapp.util.Log;

public class IDxSCallbackShape221S0100000_2_I0 implements C32301g2 {
    public Object A00;
    public final int A01;

    public IDxSCallbackShape221S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void A00() {
        Activity activity = (Activity) this.A00;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = R.string.str1220;
        if (i2 >= 30) {
            i3 = R.string.str1223;
            if (i2 < 33) {
                i3 = R.string.str1222;
            }
        }
        RequestPermissionActivity.A0K(activity, R.string.str1221, i3);
    }

    public final void A01() {
        Activity activity = (Activity) this.A00;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = R.string.str1220;
        if (i2 >= 30) {
            i3 = R.string.str1223;
            if (i2 < 33) {
                i3 = R.string.str1222;
            }
        }
        RequestPermissionActivity.A0K(activity, R.string.str1221, i3);
    }

    public void AVg(String str) {
        String str2;
        switch (this.A01) {
            case 1:
                throw AnonymousClass000.A0V("must not be called");
            case 2:
                str2 = "settings-gdrive/readonly-external-storage-readonly";
                break;
            case 3:
                ViewProfilePhoto viewProfilePhoto = (ViewProfilePhoto) this.A00;
                viewProfilePhoto.A0J.A01(viewProfilePhoto);
                return;
            case 4:
                str2 = "settings-chat/readonly-external-storage-readonly";
                break;
            case 5:
                int A06 = AnonymousClass3K3.A06();
                int A05 = AnonymousClass3K3.A05();
                C001000l A0C = ((AnonymousClass01A) this.A00).A0C();
                AnonymousClass00B.A06(A0C);
                ((C14600pS) A0C).Afj(new Object[0], A06, A05);
                return;
            default:
                AnonymousClass3K4.A0r((C14550pN) this.A00, AnonymousClass3K3.A06(), AnonymousClass3K3.A05());
                return;
        }
        Log.i(str2);
        C14550pN r3 = (C14550pN) this.A00;
        boolean A002 = C14730pf.A00();
        int i2 = R.string.str1350;
        if (A002) {
            i2 = R.string.str134f;
        }
        AnonymousClass3K4.A0r(r3, R.string.str0d89, i2);
    }

    public void AVh() {
        switch (this.A01) {
            case 1:
                throw AnonymousClass000.A0V("must not be called");
            case 2:
                Log.i("settings-gdrive/readonly-external-storage-readonly-permission");
                A00();
                return;
            case 3:
                Activity activity = (Activity) this.A00;
                int i2 = Build.VERSION.SDK_INT;
                int i3 = R.string.str1234;
                if (i2 >= 30) {
                    i3 = R.string.str1237;
                    if (i2 < 33) {
                        i3 = R.string.str1236;
                    }
                }
                RequestPermissionActivity.A0K(activity, R.string.str1235, i3);
                return;
            case 4:
                Log.i("settings-chat/readonly-external-storage-readonly-permission");
                A01();
                return;
            case 5:
                C001000l A0C = ((AnonymousClass01A) this.A00).A0C();
                AnonymousClass00B.A06(A0C);
                ((C14600pS) A0C).Afj(new Object[0], R.string.str00d4, R.string.str1211);
                return;
            default:
                AnonymousClass3K2.A14(this);
                return;
        }
    }

    public void AZJ(String str) {
        Activity activity;
        int i2;
        String str2;
        switch (this.A01) {
            case 1:
                activity = ((AnonymousClass2RY) this.A00).A01;
                i2 = 107;
                break;
            case 2:
                str2 = "settings-gdrive/external-storage-unavailable";
                break;
            case 3:
                ViewProfilePhoto viewProfilePhoto = (ViewProfilePhoto) this.A00;
                viewProfilePhoto.A0J.A01(viewProfilePhoto);
                return;
            case 4:
                str2 = "settings-chat/external-storage-unavailable";
                break;
            case 5:
                int A06 = AnonymousClass3K3.A06();
                int A05 = AnonymousClass3K3.A05();
                C001000l A0C = ((AnonymousClass01A) this.A00).A0C();
                AnonymousClass00B.A06(A0C);
                ((C14600pS) A0C).Afj(new Object[0], A06, A05);
                return;
            default:
                AnonymousClass3K4.A0r((C14550pN) this.A00, AnonymousClass3K3.A06(), AnonymousClass3K3.A05());
                return;
        }
        Log.i(str2);
        activity = (Activity) this.A00;
        i2 = 602;
        AnonymousClass29T.A01(activity, i2);
    }

    public void AZK() {
        int i2;
        switch (this.A01) {
            case 1:
                Activity activity = ((AnonymousClass2RY) this.A00).A01;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 30) {
                    i2 = R.string.str123f;
                } else {
                    i2 = R.string.str1242;
                    if (i3 < 33) {
                        i2 = R.string.str1241;
                    }
                }
                RequestPermissionActivity.A0L(activity, R.string.str1240, i2, 200);
                return;
            case 2:
                Log.i("settings-gdrive/external-storage-unavailable-permission");
                A00();
                return;
            case 3:
                Activity activity2 = (Activity) this.A00;
                int i4 = Build.VERSION.SDK_INT;
                int i5 = R.string.str1216;
                if (i4 >= 30) {
                    i5 = R.string.str1262;
                    if (i4 < 33) {
                        i5 = R.string.str1261;
                    }
                }
                RequestPermissionActivity.A0K(activity2, R.string.str1260, i5);
                return;
            case 4:
                Log.i("settings-chat/external-storage-unavailable-permission");
                A01();
                return;
            case 5:
                C001000l A0C = ((AnonymousClass01A) this.A00).A0C();
                AnonymousClass00B.A06(A0C);
                ((C14600pS) A0C).Afj(new Object[0], R.string.str00d4, R.string.str1211);
                return;
            default:
                AnonymousClass3K2.A14(this);
                return;
        }
    }
}
