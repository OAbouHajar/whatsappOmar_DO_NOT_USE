package com.obwhatsapp.gallerypicker;

import X.AnonymousClass00B;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01D;
import X.AnonymousClass01S;
import X.AnonymousClass1B5;
import X.AnonymousClass1B9;
import X.AnonymousClass2Ao;
import X.AnonymousClass2DE;
import X.AnonymousClass2KC;
import X.AnonymousClass2SR;
import X.C14710pd;
import X.C14870pt;
import X.C15860rz;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
import X.C16260sj;
import X.C16320sq;
import X.C16620tM;
import X.C17200uh;
import X.C19610yi;
import X.C23651Cv;
import X.C27661Sq;
import X.C54412hT;
import X.C93904jx;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;

public class GalleryPicker extends C54412hT {
    public int A00 = 7;
    public long A01;
    public View A02;
    public AnonymousClass01A A03;
    public C23651Cv A04;
    public C16000sG A05;
    public C16080sP A06;
    public AnonymousClass2Ao A07;
    public C17200uh A08;
    public AnonymousClass1B5 A09;
    public C19610yi A0A;
    public C16260sj A0B;
    public C27661Sq A0C;
    public AnonymousClass01D A0D;
    public AnonymousClass01D A0E;

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 90) {
            if (i3 != -1) {
                if (i3 == 2) {
                    setResult(2);
                } else {
                    return;
                }
            }
            setResult(-1, intent);
        } else if (i2 != 91) {
            super.onActivityResult(i2, i3, intent);
            return;
        } else if (i3 == -1) {
            if (getIntent().getBooleanExtra("preview", true)) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                if (parcelableArrayListExtra == null) {
                    Uri data = intent.getData();
                    if (data != null) {
                        parcelableArrayListExtra = new ArrayList();
                        parcelableArrayListExtra.add(data);
                    } else {
                        return;
                    }
                }
                AnonymousClass2KC r6 = new AnonymousClass2KC(this);
                r6.A0E = parcelableArrayListExtra;
                r6.A0A = getIntent().getStringExtra("jid");
                r6.A02 = 1;
                r6.A04 = System.currentTimeMillis() - this.A01;
                r6.A05 = getIntent().getLongExtra("picker_open_time", 0);
                r6.A0I = true;
                r6.A06 = getIntent().getLongExtra("quoted_message_row_id", 0);
                r6.A0B = getIntent().getStringExtra("quoted_group_jid");
                r6.A0F = getIntent().getBooleanExtra("number_from_url", false);
                startActivityForResult(r6.A00(), 90);
                return;
            }
            setResult(-1, intent);
        } else {
            return;
        }
        finish();
    }

    public void onBackPressed() {
        if (this.A0C.A0E(C16620tM.A02, 931)) {
            this.A0D.get();
        }
        super.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01a9, code lost:
        if (r1 == 2) goto L_0x01ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r11.A01 = r0
            r0 = 5
            r11.A1X(r0)
            boolean r0 = X.C455529g.A00
            r3 = 1
            if (r0 == 0) goto L_0x004b
            android.view.Window r5 = r11.getWindow()
            r0 = 13
            r5.requestFeature(r0)
            r0 = 12
            r5.requestFeature(r0)
            android.transition.TransitionInflater r1 = android.transition.TransitionInflater.from(r11)
            r0 = 17760258(0x10f0002, float:2.6264958E-38)
            android.transition.Transition r0 = r1.inflateTransition(r0)
            r4 = 16908335(0x102002f, float:2.387736E-38)
            r0.excludeTarget(r4, r3)
            r2 = 16908336(0x1020030, float:2.3877364E-38)
            r0.excludeTarget(r2, r3)
            r5.setExitTransition(r0)
            android.transition.TransitionInflater r1 = android.transition.TransitionInflater.from(r11)
            r0 = 17760259(0x10f0003, float:2.626496E-38)
            android.transition.Transition r0 = r1.inflateTransition(r0)
            r0.excludeTarget(r4, r3)
            r0.excludeTarget(r2, r3)
            r5.setReenterTransition(r0)
        L_0x004b:
            super.onCreate(r12)
            X.0sj r0 = r11.A0B
            boolean r0 = com.obwhatsapp.RequestPermissionActivity.A0X(r11, r0)
            if (r0 != 0) goto L_0x005a
            r11.finish()
        L_0x0059:
            return
        L_0x005a:
            r0 = 2131559087(0x7f0d02af, float:1.8743508E38)
            r11.setContentView((int) r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r9 = "jid"
            java.lang.String r0 = r0.getStringExtra(r9)
            X.0rv r5 = X.C15830rv.A02(r0)
            r0 = 2131366673(0x7f0a1311, float:1.8353246E38)
            android.view.View r2 = X.AnonymousClass00T.A05(r11, r0)
            androidx.appcompat.widget.Toolbar r2 = (androidx.appcompat.widget.Toolbar) r2
            r11.Aem(r2)
            r0 = 2131100763(0x7f06045b, float:1.7813917E38)
            X.C434920f.A03(r11, r0)
            android.view.Window r1 = r11.getWindow()
            boolean r0 = X.C434920f.A09(r11)
            r0 = r0 ^ 1
            X.C434920f.A08(r1, r0)
            r0 = 8
            r2.setVisibility(r0)
            r8 = 0
            if (r5 == 0) goto L_0x01b0
            X.0sG r0 = r11.A05
            X.0sH r4 = r0.A0A(r5)
            boolean r0 = r4.A0J()
            r2 = 2131891478(0x7f121516, float:1.9417677E38)
            if (r0 == 0) goto L_0x00a7
            r2 = 2131891477(0x7f121515, float:1.9417675E38)
        L_0x00a7:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            X.0sP r0 = r11.A06
            java.lang.String r0 = r0.A08(r4)
            r1[r8] = r0
            java.lang.String r10 = r11.getString(r2, r1)
            r11.A2g(r10)
        L_0x00b8:
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r4 = "include_media"
            r7 = 7
            int r0 = r0.getIntExtra(r4, r7)
            r11.A00 = r0
            if (r12 != 0) goto L_0x00f5
            X.01A r6 = r11.A03
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            int r1 = r11.A00
            java.lang.String r0 = "include"
            if (r1 == r7) goto L_0x01ab
            if (r1 != r3) goto L_0x01a5
            r2.putInt(r0, r3)
        L_0x00d9:
            java.lang.String r0 = "gallery_picker_title"
            r2.putString(r0, r10)
            r6.A0T(r2)
            X.02C r0 = r11.AGM()
            X.050 r2 = new X.050
            r2.<init>(r0)
            r1 = 2131363808(0x7f0a07e0, float:1.8347435E38)
            java.lang.String r0 = "gallery_picker_fragment"
            r2.A0D(r6, r0, r1)
            r2.A01()
        L_0x00f5:
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r7 = "android.intent.extra.STREAM"
            java.util.ArrayList r2 = r0.getParcelableArrayListExtra(r7)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "bucket_uri"
            android.os.Parcelable r1 = r1.getParcelableExtra(r0)
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L_0x0199
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r0, r1)
            int r0 = r11.A00
            r6.putExtra(r4, r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r1 = "preview"
            boolean r0 = r0.getBooleanExtra(r1, r3)
            r6.putExtra(r1, r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r10 = "quoted_message_row_id"
            r3 = 0
            long r0 = r0.getLongExtra(r10, r3)
            r6.putExtra(r10, r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r1 = "quoted_group_jid"
            java.lang.String r0 = r0.getStringExtra(r1)
            r6.putExtra(r1, r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r0 = r0.getStringExtra(r9)
            r6.putExtra(r9, r0)
            android.content.Intent r10 = r11.getIntent()
            X.0pd r9 = r11.A0C
            r1 = 2614(0xa36, float:3.663E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r9.A03(r0, r1)
            java.lang.String r1 = "max_items"
            int r0 = r10.getIntExtra(r1, r0)
            r6.putExtra(r1, r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r1 = "skip_max_items_new_limit"
            boolean r0 = r0.getBooleanExtra(r1, r8)
            r6.putExtra(r1, r0)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r1 = "is_in_multi_select_mode_only"
            boolean r0 = r0.getBooleanExtra(r1, r8)
            r6.putExtra(r1, r0)
            r6.putExtra(r7, r2)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r2 = "picker_open_time"
            long r0 = r0.getLongExtra(r2, r3)
            r6.putExtra(r2, r0)
            java.lang.String r0 = "com.obwhatsapp.gallery.NewMediaPicker"
            r6.setClassName(r11, r0)
            r0 = 90
            r11.startActivityForResult(r6, r0)
        L_0x0199:
            if (r5 == 0) goto L_0x0059
            boolean r0 = r5 instanceof com.whatsapp.jid.UserJid
            if (r0 != 0) goto L_0x0059
            X.1Sq r0 = r11.A0C
            r0.A00(r5)
            return
        L_0x01a5:
            r7 = 4
            if (r1 == r7) goto L_0x01ab
            r7 = 2
            if (r1 != r7) goto L_0x00d9
        L_0x01ab:
            r2.putInt(r0, r7)
            goto L_0x00d9
        L_0x01b0:
            java.lang.String r10 = ""
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gallerypicker.GalleryPicker.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Intent intent;
        String str;
        int i2 = this.A00;
        if (i2 == 4) {
            intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.INTERNAL_CONTENT_URI);
            str = "video/*";
        } else {
            Uri uri = MediaStore.Images.Media.INTERNAL_CONTENT_URI;
            if (i2 == 2) {
                str = "image/gif";
            } else {
                intent = new Intent("android.intent.action.PICK", uri);
                str = "image/*";
            }
        }
        intent.setType(str);
        PackageManager packageManager = getPackageManager();
        int i3 = 0;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        int size = queryIntentActivities.size();
        if (size <= 0) {
            return true;
        }
        getMenuInflater().inflate(R.menu.menu000d, menu);
        SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
        subMenu.clear();
        subMenu.setIcon(AnonymousClass2SR.A02(this, R.drawable.ic_more_teal, R.color.color04ef));
        menu.findItem(R.id.default_item).setVisible(false);
        Drawable A042 = AnonymousClass00T.A04(this, R.mipmap.icon);
        AnonymousClass00B.A06(A042);
        ArrayList arrayList = new ArrayList(size);
        int i4 = Integer.MIN_VALUE;
        int intrinsicHeight = A042.getIntrinsicHeight();
        int i5 = 0;
        do {
            Drawable loadIcon = queryIntentActivities.get(i5).loadIcon(packageManager);
            i4 = Math.max(loadIcon.getIntrinsicHeight(), i4);
            arrayList.add(loadIcon);
            i5++;
        } while (i5 < size);
        int min = Math.min(intrinsicHeight, i4);
        do {
            ResolveInfo resolveInfo = queryIntentActivities.get(i3);
            Drawable drawable = (Drawable) arrayList.get(i3);
            Resources resources = getResources();
            if (drawable instanceof BitmapDrawable) {
                drawable = new BitmapDrawable(resources, Bitmap.createScaledBitmap(((BitmapDrawable) drawable).getBitmap(), min, min, false));
            }
            MenuItem add = subMenu.add(resolveInfo.loadLabel(packageManager));
            add.setIcon(drawable);
            add.setOnMenuItemClickListener(new C93904jx(intent, resolveInfo, this));
            i3++;
        } while (i3 < size);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A04.A02().A02.A05(-1);
        if (this.A0C.A0E(C16620tM.A02, 931)) {
            AnonymousClass2DE.A02(this.A02, this.A0A);
            AnonymousClass2Ao r0 = this.A07;
            if (r0 != null) {
                r0.A00();
                this.A07 = null;
            }
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        if (this.A0C.A0E(C16620tM.A02, 931)) {
            AnonymousClass2DE.A07(this.A0A);
            AnonymousClass1B9 r2 = (AnonymousClass1B9) this.A0D.get();
            boolean z2 = true;
            if (!AnonymousClass1B9.A00(this.A00)) {
                z2 = false;
            }
            r2.A05 = z2;
            r2.A04 = z2;
            r2.A03 = z2;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A0C.A0E(C16620tM.A02, 931)) {
            boolean z2 = ((AnonymousClass1B9) this.A0D.get()).A03;
            View view = this.A00;
            if (z2) {
                C14710pd r15 = this.A0C;
                C14870pt r13 = this.A05;
                C16040sK r12 = this.A01;
                C16320sq r11 = this.A05;
                C17200uh r10 = this.A08;
                C16000sG r9 = this.A05;
                C16080sP r8 = this.A06;
                AnonymousClass013 r7 = this.A01;
                AnonymousClass1B5 r6 = this.A09;
                C19610yi r5 = this.A0A;
                AnonymousClass01D r4 = this.A0D;
                AnonymousClass01D r3 = this.A0E;
                View view2 = this.A02;
                AnonymousClass2Ao r1 = this.A07;
                C15860rz r25 = this.A09;
                C19610yi r24 = r5;
                AnonymousClass1B5 r23 = r6;
                C17200uh r22 = r10;
                AnonymousClass2Ao r21 = r1;
                C16080sP r20 = r8;
                C16000sG r19 = r9;
                C16040sK r18 = r12;
                C14870pt r17 = r13;
                View view3 = view2;
                View view4 = view;
                Pair A002 = AnonymousClass2DE.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, r15, r11, r4, r3, "gallery-picker-activity");
                this.A02 = (View) A002.first;
                this.A07 = (AnonymousClass2Ao) A002.second;
            } else if (AnonymousClass1B9.A00(view)) {
                AnonymousClass2DE.A04(this.A00, this.A0A, this.A0D);
            }
            ((AnonymousClass1B9) this.A0D.get()).A01();
        }
    }
}
