package com.obwhatsapp.audiopicker;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass04A;
import X.AnonymousClass0SB;
import X.AnonymousClass1B5;
import X.AnonymousClass1B9;
import X.AnonymousClass1PD;
import X.AnonymousClass1VA;
import X.AnonymousClass267;
import X.AnonymousClass2Ao;
import X.AnonymousClass2DE;
import X.AnonymousClass2DT;
import X.AnonymousClass2OM;
import X.AnonymousClass2SX;
import X.AnonymousClass38M;
import X.AnonymousClass4Y7;
import X.C005402i;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14710pd;
import X.C14870pt;
import X.C15860rz;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16320sq;
import X.C17200uh;
import X.C17270uo;
import X.C19610yi;
import X.C23651Cv;
import X.C49132Rg;
import X.C57332qv;
import X.C64303Np;
import android.content.ContentUris;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxTListenerShape171S0100000_2_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class AudioPickerActivity extends AnonymousClass1VA implements AnonymousClass04A {
    public AudioManager A00;
    public Menu A01;
    public View A02;
    public ImageButton A03;
    public ListView A04;
    public RelativeLayout A05;
    public RelativeLayout A06;
    public TextView A07;
    public AnonymousClass267 A08;
    public C64303Np A09;
    public C23651Cv A0A;
    public C16000sG A0B;
    public C16080sP A0C;
    public AnonymousClass2Ao A0D;
    public C17200uh A0E;
    public AnonymousClass1B5 A0F;
    public C19610yi A0G;
    public C16010sH A0H;
    public AnonymousClass2OM A0I;
    public AnonymousClass1PD A0J;
    public AnonymousClass01D A0K;
    public AnonymousClass01D A0L;
    public String A0M;
    public ArrayList A0N;
    public LinkedHashMap A0O;
    public boolean A0P;

    public AudioPickerActivity() {
        this(0);
    }

    public AudioPickerActivity(int i2) {
        this.A0P = false;
        C13680ns.A1G(this, 11);
    }

    public static /* synthetic */ void A02(AudioPickerActivity audioPickerActivity) {
        ArrayList A0u = AnonymousClass000.A0u();
        for (AnonymousClass38M r0 : audioPickerActivity.A0O.values()) {
            A0u.add(ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, (long) r0.A00));
        }
        Intent A092 = C13680ns.A09();
        A092.putParcelableArrayListExtra("result_uris", A0u);
        C13680ns.A0r(audioPickerActivity, A092);
    }

    public void A1q() {
        if (!this.A0P) {
            this.A0P = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = new AnonymousClass2SX();
            this.A0A = (C23651Cv) r1.A1k.get();
            this.A0J = (AnonymousClass1PD) r1.AEP.get();
            this.A0E = C16150sX.A0R(r1);
            this.A0B = C16150sX.A0M(r1);
            this.A0C = C16150sX.A0Q(r1);
            this.A0F = (AnonymousClass1B5) r1.AEp.get();
            this.A0G = (C19610yi) r1.AEq.get();
            this.A0K = C17270uo.A00(r1.AGp);
            this.A0L = C17270uo.A00(r1.ALh);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A36() {
        /*
            r10 = this;
            X.02i r9 = r10.x()
            java.lang.String r0 = "supportActionBar is null"
            X.AnonymousClass00B.A07(r9, r0)
            java.util.LinkedHashMap r0 = r10.A0O
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0014:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r1.next()
            X.38M r0 = (X.AnonymousClass38M) r0
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x002e
            java.io.File r0 = X.C13700nu.A0D(r0)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0014
        L_0x002e:
            r1.remove()
            goto L_0x0014
        L_0x0032:
            X.3Np r0 = r10.A09
            android.database.Cursor r0 = r0.getCursor()
            java.lang.String r4 = ""
            r7 = 1
            r2 = 8
            r6 = 0
            if (r0 != 0) goto L_0x0091
            android.widget.ListView r0 = r10.A04
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r10.A06
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r10.A05
            r0.setVisibility(r6)
            android.widget.TextView r0 = r10.A07
            r0.setVisibility(r2)
            boolean r0 = X.C14550pN.A1Q(r10)
            if (r0 == 0) goto L_0x0062
            X.0yi r0 = r10.A0G
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x0067
        L_0x0062:
            X.0yi r0 = r10.A0G
            r0.A06()
        L_0x0067:
            r9.A0I(r4)
        L_0x006a:
            android.view.Menu r1 = r10.A01
            if (r1 == 0) goto L_0x008e
            r0 = 2131364661(0x7f0a0b35, float:1.8349165E38)
            android.view.MenuItem r1 = r1.findItem(r0)
            if (r1 == 0) goto L_0x008e
            X.3Np r0 = r10.A09
            android.database.Cursor r0 = r0.getCursor()
            if (r0 == 0) goto L_0x008f
            X.3Np r0 = r10.A09
            android.database.Cursor r0 = r0.getCursor()
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x008f
        L_0x008b:
            r1.setVisible(r7)
        L_0x008e:
            return
        L_0x008f:
            r7 = 0
            goto L_0x008b
        L_0x0091:
            android.widget.RelativeLayout r0 = r10.A05
            r0.setVisibility(r2)
            X.3Np r0 = r10.A09
            android.database.Cursor r0 = r0.getCursor()
            int r1 = r0.getCount()
            android.widget.ListView r0 = r10.A04
            if (r1 != 0) goto L_0x00dd
            r0.setVisibility(r2)
            android.widget.ImageButton r0 = r10.A03
            X.AnonymousClass4Y7.A01(r0, r6, r6)
            X.267 r0 = r10.A08
            boolean r1 = r0.A06()
            android.widget.RelativeLayout r0 = r10.A06
            if (r1 == 0) goto L_0x00cf
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.A07
            r0.setVisibility(r6)
            android.widget.TextView r3 = r10.A07
            r2 = 2131886378(0x7f12012a, float:1.9407333E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r10.A0M
            java.lang.String r0 = X.C13680ns.A0d(r10, r0, r1, r6, r2)
            r3.setText(r0)
            goto L_0x0067
        L_0x00cf:
            r0.setVisibility(r6)
            android.widget.TextView r0 = r10.A07
            r0.setVisibility(r2)
            java.util.LinkedHashMap r0 = r10.A0O
            r0.clear()
            goto L_0x0067
        L_0x00dd:
            r0.setVisibility(r6)
            android.widget.RelativeLayout r0 = r10.A06
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.A07
            r0.setVisibility(r2)
            java.util.LinkedHashMap r8 = r10.A0O
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0107
            r0 = 2131892106(0x7f12178a, float:1.941895E38)
            r9.A0A(r0)
        L_0x00f8:
            java.util.LinkedHashMap r0 = r10.A0O
            boolean r0 = r0.isEmpty()
            r1 = r0 ^ 1
            android.widget.ImageButton r0 = r10.A03
            X.AnonymousClass4Y7.A01(r0, r1, r6)
            goto L_0x006a
        L_0x0107:
            X.013 r5 = r10.A01
            r4 = 2131755234(0x7f1000e2, float:1.9141342E38)
            int r0 = r8.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r0 = r8.size()
            X.AnonymousClass000.A1M(r1, r0, r6)
            java.lang.String r0 = r5.A0J(r1, r4, r2)
            r9.A0I(r0)
            goto L_0x00f8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.audiopicker.AudioPickerActivity.A36():void");
    }

    public AnonymousClass0SB APC(Bundle bundle, int i2) {
        return new C57332qv(getContentResolver(), this, this.A0N);
    }

    public /* bridge */ /* synthetic */ void ASs(AnonymousClass0SB r2, Object obj) {
        this.A09.swapCursor((Cursor) obj);
        A36();
    }

    public void ASy(AnonymousClass0SB r3) {
        this.A09.swapCursor((Cursor) null);
        A36();
    }

    public void onBackPressed() {
        if (C14550pN.A1Q(this)) {
            this.A0K.get();
        }
        if (this.A08.A06()) {
            if (!this.A0O.isEmpty()) {
                AnonymousClass4Y7.A01(this.A03, true, true);
            }
            this.A08.A05(true);
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0031);
        this.A0O = new LinkedHashMap();
        this.A0I = new AnonymousClass2OM(getContentResolver(), new Handler(), this.A0A, "audio-picker");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Aem(toolbar);
        this.A08 = new AnonymousClass267(this, findViewById(R.id.search_holder), new IDxTListenerShape171S0100000_2_I1(this, 0), toolbar, this.A01);
        this.A0H = C16000sG.A00(this.A0B, C14530pL.A0M(this));
        C005402i x2 = x();
        AnonymousClass00B.A07(x2, "supportActionBar is null");
        x2.A0N(true);
        x2.A0J(C13680ns.A0d(this, this.A0C.A08(this.A0H), new Object[1], 0, R.string.str1501));
        this.A06 = (RelativeLayout) findViewById(R.id.no_audio_layout);
        this.A05 = (RelativeLayout) findViewById(R.id.loading_audio_layout);
        this.A07 = C13680ns.A0N(this, R.id.empty);
        ListView ADA = ADA();
        this.A04 = ADA;
        ADA.setBackground((Drawable) null);
        ImageButton imageButton = (ImageButton) findViewById(R.id.fab);
        this.A03 = imageButton;
        AnonymousClass4Y7.A01(imageButton, false, false);
        C13680ns.A1A(this.A03, this, 15);
        C13680ns.A0t(this, this.A03, R.string.str14e6);
        C64303Np r0 = new C64303Np(this, this);
        this.A09 = r0;
        A35(r0);
        this.A00 = this.A08.A0G();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z2 = false;
        menu.add(0, R.id.menuitem_search, 0, R.string.str1d7c).setIcon(R.drawable.ic_action_search).setShowAsAction(10);
        this.A01 = menu;
        MenuItem findItem = menu.findItem(R.id.menuitem_search);
        if (findItem != null) {
            if (this.A04.getCount() > 0) {
                z2 = true;
            }
            findItem.setVisible(z2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0I.A00();
        this.A0I = null;
        if (C14550pN.A1Q(this)) {
            AnonymousClass2DE.A02(this.A02, this.A0G);
            AnonymousClass2Ao r0 = this.A0D;
            if (r0 != null) {
                r0.A00();
                this.A0D = null;
            }
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        AudioManager audioManager = this.A00;
        if (audioManager != null) {
            if (i2 == 24) {
                audioManager.adjustStreamVolume(3, 1, 1);
                return true;
            } else if (i2 == 25) {
                audioManager.adjustStreamVolume(3, -1, 1);
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        if (C14550pN.A1Q(this)) {
            AnonymousClass2DE.A07(this.A0G);
            C14530pL.A0i(this, this.A0K);
        }
    }

    public void onResume() {
        super.onResume();
        if (C14550pN.A1Q(this)) {
            boolean z2 = ((AnonymousClass1B9) this.A0K.get()).A03;
            View view = this.A00;
            if (z2) {
                C14710pd r15 = this.A0C;
                C14870pt r13 = this.A05;
                C16040sK r12 = this.A01;
                C16320sq r11 = this.A05;
                C17200uh r10 = this.A0E;
                C16000sG r9 = this.A0B;
                C16080sP r8 = this.A0C;
                AnonymousClass013 r7 = this.A01;
                AnonymousClass1B5 r6 = this.A0F;
                C19610yi r5 = this.A0G;
                AnonymousClass01D r4 = this.A0K;
                AnonymousClass01D r3 = this.A0L;
                View view2 = this.A02;
                AnonymousClass2Ao r1 = this.A0D;
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
                Pair A002 = AnonymousClass2DE.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r25, r7, r15, r11, r4, r3, "audio-picker-activity");
                this.A02 = (View) A002.first;
                this.A0D = (AnonymousClass2Ao) A002.second;
            } else if (AnonymousClass1B9.A00(view)) {
                AnonymousClass2DE.A04(this.A00, this.A0G, this.A0K);
            }
            ((AnonymousClass1B9) this.A0K.get()).A01();
        }
    }

    public boolean onSearchRequested() {
        AnonymousClass4Y7.A01(this.A03, false, true);
        this.A08.A02();
        C13680ns.A1A(findViewById(R.id.search_back), this, 14);
        return false;
    }

    public void onStart() {
        A36();
        A0W().A00((Bundle) null, this);
        super.onStart();
    }

    public void onStop() {
        AnonymousClass2DT A002;
        super.onStop();
        if ((!C14550pN.A1Q(this) || !this.A0G.A0C()) && (A002 = this.A0G.A00()) != null) {
            A002.A0I(true, false);
            this.A0G.A08((AnonymousClass2DT) null);
        }
    }
}
