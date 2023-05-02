package com.obwhatsapp.profile;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass04o;
import X.AnonymousClass2Re;
import X.AnonymousClass2TA;
import X.C001000l;
import X.C14710pd;
import X.C14870pt;
import X.C15960sC;
import X.C16260sj;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.obwhatsapp.R;

public class CapturePhoto extends C001000l implements AnonymousClass006 {
    public C14870pt A00;
    public C16260sj A01;
    public AnonymousClass013 A02;
    public C14710pd A03;
    public C15960sC A04;
    public boolean A05;
    public final Object A06;
    public volatile AnonymousClass2Re A07;

    public CapturePhoto() {
        this(0);
    }

    public CapturePhoto(int i2) {
        this.A06 = new Object();
        this.A05 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 67));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r13.A03.A0E(X.C16620tM.A02, 2683) == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1S() {
        /*
            r13 = this;
            r5 = r13
            X.0sC r0 = r13.A04
            boolean r1 = r0.A01()
            r3 = 1
            r2 = 0
            X.0sj r0 = r13.A01
            if (r1 != 0) goto L_0x006e
            boolean r10 = r0.A0E()
        L_0x0011:
            X.0sj r1 = r13.A01
            java.lang.String r0 = "android.permission.CAMERA"
            int r0 = r1.A03(r0)
            r11 = 0
            if (r0 == 0) goto L_0x001d
            r11 = 1
        L_0x001d:
            android.content.Intent r0 = r13.getIntent()
            r4 = -1
            if (r0 == 0) goto L_0x0047
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "photo_type"
            int r0 = r1.getIntExtra(r0, r4)
            if (r0 != 0) goto L_0x0047
            android.content.Context r0 = r13.getApplicationContext()
            boolean r0 = X.C16260sj.A01(r0)
            if (r0 == 0) goto L_0x0047
            X.0pd r4 = r13.A03
            r1 = 2683(0xa7b, float:3.76E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r4.A0E(r0, r1)
            r12 = 1
            if (r0 != 0) goto L_0x0048
        L_0x0047:
            r12 = 0
        L_0x0048:
            r7 = 30
            r8 = 2131890808(0x7f121278, float:1.9416318E38)
            r9 = 2131232305(0x7f080631, float:1.8080716E38)
            java.util.Map r1 = com.obwhatsapp.RequestPermissionActivity.A0B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object r6 = r1.get(r0)
            int[] r6 = (int[]) r6
            android.content.Intent r0 = com.obwhatsapp.RequestPermissionActivity.A0A(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != 0) goto L_0x009c
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "target_file_uri"
            android.os.Parcelable r4 = r1.getParcelableExtra(r0)
            goto L_0x0077
        L_0x006e:
            boolean r0 = r0.A0B()
            r10 = 0
            if (r0 != 0) goto L_0x0011
            r10 = 1
            goto L_0x0011
        L_0x0077:
            java.lang.String r0 = "android.media.action.IMAGE_CAPTURE"
            android.content.Intent r1 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x008d }
            r1.<init>(r0)     // Catch:{ ActivityNotFoundException -> 0x008d }
            java.lang.String r0 = "output"
            android.content.Intent r1 = r1.putExtra(r0, r4)     // Catch:{ ActivityNotFoundException -> 0x008d }
            r0 = 2
            android.content.Intent r0 = r1.setFlags(r0)     // Catch:{ ActivityNotFoundException -> 0x008d }
            r13.startActivityForResult(r0, r3)     // Catch:{ ActivityNotFoundException -> 0x008d }
            return
        L_0x008d:
            r1 = move-exception
            java.lang.String r0 = "capturephoto/start-activity "
            com.whatsapp.util.Log.e(r0, r1)
            X.0pt r1 = r13.A00
            r0 = 2131886240(0x7f1200a0, float:1.9407053E38)
            r1.A09(r0, r2)
            return
        L_0x009c:
            r13.startActivityForResult(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.profile.CapturePhoto.A1S():void");
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A00(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A07 == null) {
            synchronized (this.A06) {
                if (this.A07 == null) {
                    this.A07 = new AnonymousClass2Re(this);
                }
            }
        }
        return this.A07.generatedComponent();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1) {
            if (getIntent() != null && getIntent().getBooleanExtra("should_return_photo_source", false)) {
                if (intent == null) {
                    intent = new Intent();
                }
                intent.putExtra("photo_source", 1);
            }
            setResult(i3, intent);
        } else if (i2 != 30) {
            super.onActivityResult(i2, i3, intent);
            return;
        } else if (i3 == -1) {
            A1S();
            return;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str03af);
        if (getCallingPackage() == null || !getCallingPackage().equals(getPackageName())) {
            finish();
        } else if (bundle == null) {
            A1S();
        }
    }
}
