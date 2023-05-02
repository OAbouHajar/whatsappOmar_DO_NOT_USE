package com.obwhatsapp.gallerypicker;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass04o;
import X.AnonymousClass121;
import X.AnonymousClass2Re;
import X.AnonymousClass2TA;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C16260sj;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;

public class GalleryPickerLauncher extends C001000l implements AnonymousClass006 {
    public C16260sj A00;
    public AnonymousClass013 A01;
    public C14710pd A02;
    public AnonymousClass121 A03;
    public boolean A04;
    public final Object A05;
    public volatile AnonymousClass2Re A06;

    public GalleryPickerLauncher() {
        this(0);
    }

    public GalleryPickerLauncher(int i2) {
        this.A05 = C13690nt.A0Y();
        this.A04 = false;
        C13680ns.A1G(this, 66);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0077, code lost:
        if (getIntent().getIntExtra("photo_type", -1) != 0) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1S() {
        /*
            r19 = this;
            r12 = r19
            X.0sj r0 = r12.A00
            boolean r0 = r0.A0B()
            r10 = 0
            r9 = 1
            if (r0 == 0) goto L_0x005b
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r11 = "max_items"
            int r8 = r0.getIntExtra(r11, r9)
            java.lang.String r7 = "skip_max_items_new_limit"
            boolean r6 = r0.getBooleanExtra(r7, r10)
            java.lang.String r5 = "is_in_multi_select_mode_only"
            boolean r4 = r0.getBooleanExtra(r5, r10)
            X.121 r0 = r12.A03
            X.0sb r1 = r0.A01
            java.lang.String r0 = "tmpi"
            java.io.File r0 = r1.A0N(r0)
            android.net.Uri r3 = android.net.Uri.fromFile(r0)
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r12.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.gallerypicker.GalleryPicker"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "include_media"
            r2.putExtra(r0, r9)
            r2.putExtra(r11, r8)
            r2.putExtra(r7, r6)
            r2.putExtra(r5, r4)
            java.lang.String r0 = "preview"
            r2.putExtra(r0, r10)
            java.lang.String r0 = "output"
            r2.putExtra(r0, r3)
            r12.startActivityForResult(r2, r9)
        L_0x005a:
            return
        L_0x005b:
            boolean r0 = X.C16260sj.A01(r12)
            if (r0 == 0) goto L_0x0096
            r14 = 2131890711(0x7f121217, float:1.9416122E38)
        L_0x0064:
            android.content.Intent r0 = r12.getIntent()
            r2 = -1
            if (r0 == 0) goto L_0x0079
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "photo_type"
            int r0 = r1.getIntExtra(r0, r2)
            r18 = 1
            if (r0 == 0) goto L_0x007b
        L_0x0079:
            r18 = 0
        L_0x007b:
            r13 = 2131890784(0x7f121260, float:1.941627E38)
            r1 = 151(0x97, float:2.12E-43)
            r15 = 2131890808(0x7f121278, float:1.9416318E38)
            r16 = 2131232305(0x7f080631, float:1.8080716E38)
            boolean r0 = r12.isFinishing()
            if (r0 != 0) goto L_0x005a
            r17 = 0
            android.content.Intent r0 = com.obwhatsapp.RequestPermissionActivity.A02(r12, r13, r14, r15, r16, r17, r18)
            r12.startActivityForResult(r0, r1)
            return
        L_0x0096:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 >= r0) goto L_0x00a0
            r14 = 2131890710(0x7f121216, float:1.941612E38)
            goto L_0x0064
        L_0x00a0:
            r0 = 33
            r14 = 2131890786(0x7f121262, float:1.9416274E38)
            if (r1 >= r0) goto L_0x0064
            r14 = 2131890785(0x7f121261, float:1.9416272E38)
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gallerypicker.GalleryPickerLauncher.A1S():void");
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A00(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A06 == null) {
            synchronized (this.A05) {
                if (this.A06 == null) {
                    this.A06 = new AnonymousClass2Re(this);
                }
            }
        }
        return this.A06.generatedComponent();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            if (i2 != 151) {
                super.onActivityResult(i2, i3, intent);
                return;
            } else if (i3 == -1) {
                A1S();
                return;
            }
        } else if (getIntent() == null || !getIntent().getBooleanExtra("should_return_photo_source", false)) {
            setResult(i3, intent);
            if (intent != null) {
                intent.putExtra("chat_jid", getIntent().getStringExtra("chat_jid"));
                intent.putExtra("is_using_global_wallpaper", getIntent().getBooleanExtra("is_using_global_wallpaper", false));
            }
        } else {
            if (intent == null) {
                intent = C13680ns.A09();
            }
            intent.putExtra("photo_source", 2);
            setResult(i3, intent);
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str092d);
        if (bundle == null) {
            A1S();
        }
    }
}
