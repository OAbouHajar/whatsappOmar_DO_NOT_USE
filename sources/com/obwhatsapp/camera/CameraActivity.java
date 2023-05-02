package com.obwhatsapp.camera;

import X.AnonymousClass00F;
import X.AnonymousClass01A;
import X.AnonymousClass01D;
import X.AnonymousClass01S;
import X.AnonymousClass1DX;
import X.AnonymousClass2ZM;
import X.C14640pW;
import X.C14650pX;
import X.C16260sj;
import X.C16900tq;
import X.C23651Cv;
import X.C27661Sq;
import X.C29251aI;
import X.C50412Zj;
import X.C54402hR;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

public class CameraActivity extends C54402hR implements C14640pW, C14650pX {
    public AnonymousClass01A A00;
    public C23651Cv A01;
    public C29251aI A02;
    public C50412Zj A03;
    public C16260sj A04;
    public C16900tq A05;
    public C27661Sq A06;
    public WhatsAppLibLoader A07;
    public AnonymousClass1DX A08;
    public AnonymousClass2ZM A09;
    public AnonymousClass01D A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Rect A0E = new Rect();

    public C29251aI AAQ() {
        return this.A02;
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    public void AVW() {
        this.A02.A0L.A0a = false;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 30) {
            if (i2 != 90) {
                super.onActivityResult(i2, i3, intent);
            } else {
                this.A02.A0I(i2, i3, intent);
            }
        } else if (i3 == -1) {
            this.A02.A0A();
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        if (!this.A02.A0Y()) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02.A0K(configuration);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        if (r0 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x021c, code lost:
        if ((r11 instanceof com.obwhatsapp.camera.LauncherCameraActivity ? r11.A06.A05(r3) : false) != false) goto L_0x021e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r25) {
        /*
            r24 = this;
            r11 = r24
            r4 = r25
            super.onCreate(r4)
            X.0pd r2 = r11.A0C
            X.0tM r1 = X.C16620tM.A01
            r0 = 815(0x32f, float:1.142E-42)
            boolean r0 = r2.A0E(r1, r0)
            r11.A0B = r0
            X.0pd r1 = r11.A0C
            r0 = 2182(0x886, float:3.058E-42)
            X.0tM r5 = X.C16620tM.A02
            boolean r0 = r1.A0E(r5, r0)
            r11.A0C = r0
            X.4wr r6 = new X.4wr
            r6.<init>(r11)
            if (r25 == 0) goto L_0x0034
            X.02C r1 = r11.AGM()
            java.lang.String r0 = "cameraMediaPickerFragment"
            X.01A r0 = r1.A09(r4, r0)
            r11.A00 = r0
            if (r0 != 0) goto L_0x003e
        L_0x0034:
            X.01D r0 = r11.A0A
            java.lang.Object r0 = r0.get()
            X.01A r0 = (X.AnonymousClass01A) r0
            r11.A00 = r0
        L_0x003e:
            X.2ZM r2 = r11.A09
            X.0pd r1 = r11.A0C
            r0 = 611(0x263, float:8.56E-43)
            boolean r1 = r1.A0E(r5, r0)
            X.0s5 r0 = r11.A06
            X.0s8 r3 = X.C15910s6.A0u
            boolean r0 = r0.A05(r3)
            r15 = 0
            X.2bB r2 = r2.A00(r11, r1, r0)
            X.2Zj r1 = r11.A03
            X.01A r0 = r11.A00
            X.1aI r0 = r1.A00(r0, r6, r2)
            r11.A02 = r0
            r0 = 2131893272(0x7f121c18, float:1.9421316E38)
            r11.setTitle(r0)
            X.0sK r0 = r11.A01
            r0.A0B()
            com.obwhatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x02cb
            X.0tq r0 = r11.A05
            r0.A04()
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x02cb
            X.0sC r0 = r11.A09
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x02cb
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r11.A07
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = "aborting due to native libraries missing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x008c:
            r11.finish()
        L_0x008f:
            return
        L_0x0090:
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r1 = r0.getAction()
            java.lang.String r0 = "android.intent.action.CREATE_SHORTCUT"
            boolean r0 = r0.equals(r1)
            r7 = -1
            if (r0 == 0) goto L_0x00ce
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.camera.LauncherCameraActivity"
            r3.setClassName(r1, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r0 = "android.intent.extra.shortcut.INTENT"
            r2.putExtra(r0, r3)
            r0 = 2131893272(0x7f121c18, float:1.9421316E38)
            java.lang.String r1 = r11.getString(r0)
            java.lang.String r0 = "android.intent.extra.shortcut.NAME"
            r2.putExtra(r0, r1)
            r11.setResult(r7, r2)
            goto L_0x008c
        L_0x00ce:
            X.0pf r0 = r11.A06
            long r9 = r0.A01()
            X.0s5 r1 = r11.A06
            X.0tC r0 = X.C15910s6.A1f
            int r0 = r1.A02(r0)
            r2 = 1024(0x400, float:1.435E-42)
            int r0 = r0 << 10
            int r0 = r0 << 10
            long r0 = (long) r0
            r6 = 1
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            goto L_0x00f0
            X.0pt r1 = r11.A05
            r0 = 2131888210(0x7f120852, float:1.9411049E38)
            r1.A07(r0, r6)
            goto L_0x008c
        L_0x00f0:
            android.content.Intent r0 = r11.getIntent()
            int r1 = r0.getFlags()
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x011f
            java.lang.String r0 = "cameraactivity/create/restart-old-shortcut"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r11.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.camera.LauncherCameraActivity"
            r2.setClassName(r1, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            java.lang.String r0 = "camera_origin"
            r2.putExtra(r0, r6)
            r11.startActivity(r2)
            goto L_0x008c
        L_0x011f:
            android.view.Window r8 = r11.getWindow()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r8.setBackgroundDrawable(r0)
            android.view.Window r0 = r11.getWindow()
            X.C19980zJ.A05(r0)
            r0 = 2131558457(0x7f0d0039, float:1.874223E38)
            r11.setContentView((int) r0)
            r0 = 2131362559(0x7f0a02ff, float:1.8344902E38)
            android.view.View r10 = r11.findViewById(r0)
            android.view.Window r0 = r11.getWindow()
            r0.addFlags(r2)
            boolean r0 = r11.A0C
            if (r0 == 0) goto L_0x02ad
            android.view.Window r0 = r11.getWindow()
            android.view.View r1 = r0.getDecorView()
            r0 = 1284(0x504, float:1.799E-42)
            r1.setSystemUiVisibility(r0)
        L_0x0159:
            android.content.Intent r0 = r11.getIntent()
            if (r0 == 0) goto L_0x02aa
            android.content.Intent r0 = r11.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x02aa
            android.content.Intent r0 = r11.getIntent()
            android.os.Bundle r1 = r0.getExtras()
            java.lang.String r0 = "media_preview_params"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x02aa
            X.29Q r12 = new X.29Q
            r12.<init>()
            android.content.Intent r0 = r11.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r12.A01(r0)
        L_0x0189:
            boolean r0 = r11.A0B
            if (r0 == 0) goto L_0x02a7
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "jids"
            java.util.ArrayList r1 = r1.getStringArrayListExtra(r0)
        L_0x0197:
            boolean r0 = r11.A0B
            if (r0 == 0) goto L_0x028b
            if (r1 == 0) goto L_0x028b
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            java.util.List r2 = X.C16030sJ.A08(r0, r1)
        L_0x01a3:
            X.0pd r1 = r11.A0C
            r0 = 2182(0x886, float:3.058E-42)
            boolean r0 = r1.A0E(r5, r0)
            if (r0 == 0) goto L_0x026f
            boolean r0 = r11.A0D
            if (r0 != 0) goto L_0x026f
            r11.setRequestedOrientation(r6)
        L_0x01b4:
            X.1aI r9 = r11.A02
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            android.content.Intent r6 = r11.getIntent()
            r0 = 0
            java.lang.String r5 = "quoted_message_row_id"
            long r18 = r6.getLongExtra(r5, r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "quoted_group_jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.0sL r13 = X.C16050sL.A05(r0)
            android.content.Intent r5 = r11.getIntent()
            java.lang.String r1 = "chat_opened_from_url"
            r0 = 0
            boolean r20 = r5.getBooleanExtra(r1, r0)
            android.content.Intent r5 = r11.getIntent()
            java.lang.String r1 = "android.intent.extra.TEXT"
            java.lang.String r14 = r5.getStringExtra(r1)
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            android.content.Intent r5 = r11.getIntent()
            java.lang.String r1 = "mentions"
            java.util.ArrayList r1 = r5.getStringArrayListExtra(r1)
            java.util.List r17 = X.C16030sJ.A08(r6, r1)
            if (r25 != 0) goto L_0x026d
            android.content.Intent r4 = r11.getIntent()
            java.lang.String r1 = "uris"
            java.util.ArrayList r15 = r4.getParcelableArrayListExtra(r1)
        L_0x0204:
            android.content.Intent r4 = r11.getIntent()
            java.lang.String r1 = "enable_qr_scan"
            boolean r1 = r4.getBooleanExtra(r1, r0)
            if (r1 != 0) goto L_0x021e
            boolean r1 = r11 instanceof com.obwhatsapp.camera.LauncherCameraActivity
            if (r1 == 0) goto L_0x026b
            X.0s5 r1 = r11.A06
            boolean r1 = r1.A05(r3)
        L_0x021a:
            r21 = 0
            if (r1 == 0) goto L_0x0220
        L_0x021e:
            r21 = 1
        L_0x0220:
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r1 = "add_more_image"
            boolean r22 = r3.getBooleanExtra(r1, r0)
            boolean r0 = r11.A0B
            r23 = r0
            r16 = r2
            r9.A0O(r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23)
            X.0sj r1 = r11.A04
            r0 = 30
            boolean r1 = com.obwhatsapp.RequestPermissionActivity.A0T(r11, r1, r0)
            X.1aI r0 = r11.A02
            if (r1 == 0) goto L_0x0267
            r0.A0A()
        L_0x0242:
            int r0 = r2.size()
            r1 = 1
            if (r0 > r1) goto L_0x0258
            int r0 = r2.size()
            if (r0 != r1) goto L_0x008f
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x008f
        L_0x0258:
            X.1Sq r4 = r11.A06
            X.0sq r3 = r4.A05
            r1 = 42
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r0.<init>(r4, r1, r2)
            r3.Acl(r0)
            return
        L_0x0267:
            r0.A04()
            goto L_0x0242
        L_0x026b:
            r1 = 0
            goto L_0x021a
        L_0x026d:
            r12 = r15
            goto L_0x0204
        L_0x026f:
            boolean r0 = r11.A0D
            if (r0 == 0) goto L_0x01b4
            r11.setRequestedOrientation(r7)
            boolean r0 = X.C15450qv.A01()
            if (r0 == 0) goto L_0x01b4
            android.view.Window r1 = r11.getWindow()
            android.view.WindowManager$LayoutParams r0 = r1.getAttributes()
            r0.rotationAnimation = r6
            r1.setAttributes(r0)
            goto L_0x01b4
        L_0x028b:
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.0rv r0 = X.C15830rv.A02(r0)
            if (r0 != 0) goto L_0x02a1
            java.util.List r2 = java.util.Collections.emptyList()
            goto L_0x01a3
        L_0x02a1:
            java.util.List r2 = java.util.Collections.singletonList(r0)
            goto L_0x01a3
        L_0x02a7:
            r1 = r15
            goto L_0x0197
        L_0x02aa:
            r12 = r15
            goto L_0x0189
        L_0x02ad:
            r0 = 4
            r10.setSystemUiVisibility(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0159
            android.view.Window r1 = r11.getWindow()
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1.addFlags(r0)
            r1 = 2
            com.facebook.redex.IDxIListenerShape217S0100000_2_I0 r0 = new com.facebook.redex.IDxIListenerShape217S0100000_2_I0
            r0.<init>(r11, r1)
            X.C004601z.A0k(r10, r0)
            goto L_0x0159
        L_0x02cb:
            java.lang.String r0 = "cameraactivity/create/no-me-or-msgstore-db"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = X.C14750ph.A04(r11)
            r11.startActivity(r0)
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.camera.CameraActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A02.A05();
        this.A01.A02().A02.A05(-1);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return this.A02.A0b(i2, keyEvent) || super.onKeyDown(i2, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        return this.A02.A0a(i2) || super.onKeyUp(i2, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.A08.A00();
        this.A02.A06();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A02.A0M(bundle);
    }

    public void onResume() {
        super.onResume();
        this.A02.A07();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass01A A0B2 = AGM().A0B("cameraMediaPickerFragment");
        if (A0B2 != null) {
            AGM().A0Q(bundle, A0B2, "cameraMediaPickerFragment");
        }
        this.A02.A0N(bundle);
    }
}
