package com.obwhatsapp.profile;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass00F;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass120;
import X.AnonymousClass121;
import X.AnonymousClass127;
import X.AnonymousClass12B;
import X.AnonymousClass12W;
import X.AnonymousClass152;
import X.AnonymousClass15P;
import X.AnonymousClass18O;
import X.AnonymousClass18R;
import X.AnonymousClass1PD;
import X.AnonymousClass1VD;
import X.AnonymousClass1XI;
import X.AnonymousClass28S;
import X.AnonymousClass2Re;
import X.AnonymousClass2Rf;
import X.AnonymousClass2TA;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17140ub;
import X.C17240ul;
import X.C17250um;
import X.C17970vw;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C20260zl;
import X.C217915l;
import X.C23061Ai;
import X.C23071Aj;
import X.C23651Cv;
import X.C33481ie;
import X.C40781ug;
import X.C49132Rg;
import X.C63823Lq;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape227S0100000_2_I0;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.R;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape66S0100000_1_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ViewProfilePhoto extends C14530pL {
    public C23651Cv A00;
    public AnonymousClass127 A01;
    public C16000sG A02;
    public C17140ub A03;
    public C16080sP A04;
    public AnonymousClass120 A05;
    public AnonymousClass152 A06;
    public AnonymousClass12W A07;
    public C16260sj A08;
    public C16070sO A09;
    public C16010sH A0A;
    public C20260zl A0B;
    public C17240ul A0C;
    public AnonymousClass28S A0D;
    public AnonymousClass18O A0E;
    public AnonymousClass18R A0F;
    public C217915l A0G;
    public AnonymousClass12B A0H;
    public AnonymousClass121 A0I;
    public AnonymousClass1PD A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final Handler A0O;
    public final C40781ug A0P;
    public final C33481ie A0Q;
    public final AnonymousClass1VD A0R;

    public class SavePhoto extends C001000l implements AnonymousClass006 {
        public C16180sb A00;
        public C14870pt A01;
        public boolean A02;
        public final Object A03;
        public volatile AnonymousClass2Re A04;

        public SavePhoto() {
            this(0);
        }

        public SavePhoto(int i2) {
            this.A03 = C13690nt.A0Y();
            this.A02 = false;
            C13680ns.A1G(this, 99);
        }

        public AnonymousClass04o ABj() {
            return AnonymousClass2TA.A00(this, super.ABj());
        }

        public final Object generatedComponent() {
            if (this.A04 == null) {
                synchronized (this.A03) {
                    if (this.A04 == null) {
                        this.A04 = new AnonymousClass2Re(this);
                    }
                }
            }
            return this.A04.generatedComponent();
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setTitle(R.string.str1483);
            Uri uri = (Uri) getIntent().getParcelableExtra("android.intent.extra.STREAM");
            String replaceAll = getIntent().getStringExtra(FacebookFacade.RequestParameter.NAME).replaceAll("[?:\\\\/*\"<>|]", "");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US);
            File file = this.A00.A05().A0G;
            C16180sb.A04(file, false);
            StringBuilder A0q = AnonymousClass000.A0q(replaceAll);
            A0q.append(" ");
            A0q.append(simpleDateFormat.format(new Date()));
            File A0C = C13700nu.A0C(file, AnonymousClass000.A0h(".jpg", A0q));
            try {
                C16180sb r2 = this.A00;
                AnonymousClass1XI.A0B(r2.A04, C13700nu.A0D(uri.getPath()), A0C);
                C17970vw.A0K(this, Uri.fromFile(A0C));
                this.A01.A09(R.string.str12a0, 0);
            } catch (IOException e2) {
                Log.e("viewprofilephoto/save/failed", e2);
                this.A01.A09(R.string.str129a, 1);
            }
            finish();
        }
    }

    public ViewProfilePhoto() {
        this(0);
        this.A0N = false;
        this.A0M = false;
        this.A0O = new C63823Lq(Looper.getMainLooper(), this);
        this.A0Q = new IDxCObserverShape66S0100000_1_I0(this, 7);
        this.A0P = new IDxSObserverShape63S0100000_2_I0(this, 20);
        this.A0R = new IDxPObserverShape81S0100000_2_I0(this, 22);
        this.A0D = new IDxCListenerShape227S0100000_2_I0(this, 7);
    }

    public ViewProfilePhoto(int i2) {
        this.A0L = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 70));
    }

    public static /* synthetic */ void A02(ViewProfilePhoto viewProfilePhoto) {
        C16000sG r2 = viewProfilePhoto.A02;
        Jid A082 = viewProfilePhoto.A0A.A08(C15830rv.class);
        AnonymousClass00B.A06(A082);
        C16010sH A0A2 = r2.A0A((C15830rv) A082);
        viewProfilePhoto.A0A = A0A2;
        if (A0A2.A0J()) {
            viewProfilePhoto.setTitle(R.string.str0af1);
        } else {
            viewProfilePhoto.A2g(viewProfilePhoto.A04.A08(viewProfilePhoto.A0A));
        }
    }

    public void A1q() {
        if (!this.A0L) {
            this.A0L = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A00 = (C23651Cv) r1.A1k.get();
            this.A0J = (AnonymousClass1PD) r1.AEP.get();
            this.A0B = r2.A0I();
            this.A02 = (C16000sG) r1.A4x.get();
            this.A04 = (C16080sP) r1.AQ9.get();
            this.A03 = (C17140ub) r1.A4y.get();
            this.A0C = (C17240ul) r1.ABK.get();
            this.A07 = (AnonymousClass12W) r1.AEM.get();
            this.A0G = (C217915l) r1.AOG.get();
            this.A01 = (AnonymousClass127) r1.A3z.get();
            this.A05 = (AnonymousClass120) r1.A4z.get();
            this.A0H = (AnonymousClass12B) r1.AJX.get();
            this.A0I = (AnonymousClass121) r1.AJY.get();
            this.A08 = (C16260sj) r1.AQe.get();
            this.A0E = (AnonymousClass18O) r1.ABN.get();
            this.A09 = (C16070sO) r1.ABY.get();
            this.A06 = (AnonymousClass152) r1.A51.get();
            this.A0F = (AnonymousClass18R) r1.ABZ.get();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A35() {
        /*
            r9 = this;
            r0 = 2131365555(0x7f0a0eb3, float:1.8350979E38)
            android.view.View r8 = r9.findViewById(r0)
            r0 = 2131365325(0x7f0a0dcd, float:1.8350512E38)
            android.view.View r6 = r9.findViewById(r0)
            com.obwhatsapp.mediaview.PhotoView r6 = (com.obwhatsapp.mediaview.PhotoView) r6
            r0 = 2131364694(0x7f0a0b56, float:1.8349232E38)
            android.view.View r7 = r9.findViewById(r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2131365330(0x7f0a0dd2, float:1.8350522E38)
            android.view.View r5 = r9.findViewById(r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            X.0sH r1 = r9.A0A
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            X.0rv r0 = (X.C15830rv) r0
            boolean r0 = X.AnonymousClass27A.A00(r0)
            r4 = 0
            r3 = 8
            if (r0 == 0) goto L_0x003f
            r8.setVisibility(r4)
            r6.setVisibility(r3)
            r7.setVisibility(r3)
        L_0x003e:
            return
        L_0x003f:
            X.0zl r1 = r9.A0B
            X.0sH r0 = r9.A0A
            boolean r0 = X.C40561uK.A00(r0, r1)
            if (r0 == 0) goto L_0x0059
            r8.setVisibility(r3)
            r6.setVisibility(r3)
            r7.setVisibility(r3)
            r0 = 2131230918(0x7f0800c6, float:1.8077902E38)
            r5.setImageResource(r0)
            return
        L_0x0059:
            X.152 r2 = r9.A06     // Catch:{ IOException -> 0x003e }
            X.0sH r0 = r9.A0A     // Catch:{ IOException -> 0x003e }
            r1 = 1
            java.io.InputStream r2 = r2.A02(r0, r1)     // Catch:{ IOException -> 0x003e }
            if (r2 != 0) goto L_0x0082
            r6.setVisibility(r3)     // Catch:{ all -> 0x00ab }
            r8.setVisibility(r3)     // Catch:{ all -> 0x00ab }
            r7.setVisibility(r4)     // Catch:{ all -> 0x00ab }
            r5.setVisibility(r3)     // Catch:{ all -> 0x00ab }
            X.0sH r0 = r9.A0A     // Catch:{ all -> 0x00ab }
            boolean r1 = r0.A0J()     // Catch:{ all -> 0x00ab }
            r0 = 2131889674(0x7f120e0a, float:1.9414018E38)
            if (r1 == 0) goto L_0x007e
            r0 = 2131889649(0x7f120df1, float:1.9413968E38)
        L_0x007e:
            r7.setText(r0)     // Catch:{ all -> 0x00ab }
            goto L_0x00b2
        L_0x0082:
            r6.setVisibility(r4)     // Catch:{ all -> 0x00ab }
            r7.setVisibility(r3)     // Catch:{ all -> 0x00ab }
            X.0sH r0 = r9.A0A     // Catch:{ all -> 0x00ab }
            int r0 = r0.A04     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x00a3
            r8.setVisibility(r4)     // Catch:{ all -> 0x00ab }
        L_0x0091:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00ab }
            r0.<init>()     // Catch:{ all -> 0x00ab }
            r0.inDither = r1     // Catch:{ all -> 0x00ab }
            android.graphics.Bitmap r0 = X.C37741pe.A02(r0, r2)     // Catch:{ all -> 0x00ab }
            r6.A06(r0)     // Catch:{ all -> 0x00ab }
            r5.setImageBitmap(r0)     // Catch:{ all -> 0x00ab }
            goto L_0x00a7
        L_0x00a3:
            r8.setVisibility(r3)     // Catch:{ all -> 0x00ab }
            goto L_0x0091
        L_0x00a7:
            r2.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x00b3
        L_0x00ab:
            r0 = move-exception
            if (r2 == 0) goto L_0x00b1
            r2.close()     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            throw r0     // Catch:{ IOException -> 0x003e }
        L_0x00b2:
            return
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.profile.ViewProfilePhoto.A35():void");
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008b, code lost:
        if (r8.getBooleanExtra("skip_cropping", false) != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            r0 = 12
            r4 = 1
            r3 = -1
            r2 = 13
            if (r6 == r0) goto L_0x005b
            if (r6 == r2) goto L_0x000e
            super.onActivityResult(r6, r7, r8)
        L_0x000d:
            return
        L_0x000e:
            X.121 r0 = r5.A0I
            X.0sb r0 = r0.A01
            java.lang.String r2 = "tmpi"
            java.io.File r0 = r0.A0N(r2)
            boolean r0 = r0.delete()
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "viewprofilephoto/failed-delete-file"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.121 r0 = r5.A0I
            X.0sb r0 = r0.A01
            java.io.File r0 = r0.A0N(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x003d:
            if (r7 != r3) goto L_0x0051
            r5.A0M = r4
            X.0ub r2 = r5.A03
            X.0sH r1 = r5.A0A
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            X.0rv r0 = (X.C15830rv) r0
            r2.A05(r0)
            goto L_0x008d
        L_0x0051:
            if (r7 != 0) goto L_0x000d
            if (r8 == 0) goto L_0x000d
            X.121 r0 = r5.A0I
            r0.A03(r8, r5)
            return
        L_0x005b:
            if (r7 != r3) goto L_0x000d
            r1 = 0
            if (r8 == 0) goto L_0x009b
            java.lang.String r0 = "is_reset"
            boolean r0 = r8.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x0084
            r5.A0M = r4
            X.0ub r2 = r5.A03
            X.0sH r1 = r5.A0A
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            X.0rv r0 = (X.C15830rv) r0
            r2.A05(r0)
            X.121 r1 = r5.A0I
            X.0sH r0 = r5.A0A
            r1.A08(r0)
            r5.A0Z()
            return
        L_0x0084:
            java.lang.String r0 = "skip_cropping"
            boolean r0 = r8.getBooleanExtra(r0, r1)
            if (r0 == 0) goto L_0x009b
        L_0x008d:
            X.121 r1 = r5.A0I
            X.0sH r0 = r5.A0A
            boolean r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x000d
            r5.A35()
            return
        L_0x009b:
            X.121 r0 = r5.A0I
            r0.A04(r8, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.profile.ViewProfilePhoto.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x02ae, code lost:
        if (X.C40561uK.A01(r13.A0B, r7.A0E) == false) goto L_0x01bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r9 = r13
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "start_transition_status_bar_color"
            r4 = 0
            int r8 = r1.getIntExtra(r0, r4)
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "return_transition_status_bar_color"
            int r10 = r1.getIntExtra(r0, r8)
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "start_transition_navigation_bar_color"
            int r7 = r1.getIntExtra(r0, r4)
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "return_transition_navigation_bar_color"
            int r11 = r1.getIntExtra(r0, r7)
            boolean r12 = X.C455529g.A00
            java.lang.String r3 = "circular_return_name"
            r2 = 1
            if (r12 == 0) goto L_0x00be
            android.view.Window r1 = r13.getWindow()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r0)
            android.view.Window r1 = r13.getWindow()
            r0 = 12
            r1.requestFeature(r0)
            android.view.Window r1 = r13.getWindow()
            r0 = 13
            r1.requestFeature(r0)
            android.content.Intent r5 = r13.getIntent()
            r1 = 0
            java.lang.String r0 = "start_transition_alpha"
            float r0 = r5.getFloatExtra(r0, r1)
            X.3MW r6 = new X.3MW
            r6.<init>(r13, r0, r8, r7)
            X.3MV r1 = new X.3MV
            r1.<init>(r13, r10, r11)
            r0 = 16908335(0x102002f, float:2.387736E-38)
            r6.excludeTarget(r0, r2)
            r0 = 16908336(0x1020030, float:2.3877364E-38)
            r6.excludeTarget(r0, r2)
            android.view.Window r5 = r13.getWindow()
            r5.setEnterTransition(r6)
            r5.setReturnTransition(r1)
            X.3hd r0 = new X.3hd
            r0.<init>(r13)
            r6.addListener(r0)
            X.3he r0 = new X.3he
            r0.<init>(r13)
            r1.addListener(r0)
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "circular_transition"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            if (r0 == 0) goto L_0x014f
            X.2hp r7 = new X.2hp
            r7.<init>(r13)
            X.3MX r1 = new X.3MX
            r1.<init>(r2, r4)
            r6 = 2131893719(0x7f121dd7, float:1.9422222E38)
            java.lang.String r0 = r7.A00(r6)
            r1.addTarget(r0)
            r5.setSharedElementEnterTransition(r1)
            X.3MX r1 = new X.3MX
            r1.<init>(r4, r2)
            java.lang.String r0 = r7.A00(r6)
        L_0x00b8:
            r1.addTarget(r0)
            r5.setSharedElementReturnTransition(r1)
        L_0x00be:
            super.onCreate(r14)
            r0 = 2131559897(0x7f0d05d9, float:1.8745151E38)
            r13.setContentView((int) r0)
            r0 = 2131366673(0x7f0a1311, float:1.8353246E38)
            android.view.View r8 = r13.findViewById(r0)
            com.obwhatsapp.BidiToolbar r8 = (com.obwhatsapp.BidiToolbar) r8
            r13.Aem(r8)
            X.02i r0 = r13.AGK()
            X.AnonymousClass00B.A06(r0)
            r0.A0N(r2)
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            X.0rv r5 = X.C15830rv.A02(r0)
            X.AnonymousClass00B.A06(r5)
            X.0sG r0 = r13.A02
            X.0sH r0 = r0.A0A(r5)
            r13.A0A = r0
            java.lang.String r0 = "viewprofilephoto/create "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = " photo_full_id:"
            r1.append(r0)
            X.0sH r0 = r13.A0A
            int r0 = r0.A04
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "can_user_remove_photo"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            r13.A0K = r0
            X.0ub r1 = r13.A03
            X.1ie r0 = r13.A0Q
            r1.A02(r0)
            X.127 r1 = r13.A01
            X.1ug r0 = r13.A0P
            r1.A02(r0)
            X.18R r1 = r13.A0F
            X.1VD r0 = r13.A0R
            r1.A02(r0)
            X.0sK r0 = r13.A01
            r0.A0B()
            X.1Zb r6 = r0.A01
            if (r6 != 0) goto L_0x017b
            java.lang.String r0 = "viewprofilephoto/create/no-me"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r0 = X.C14750ph.A04(r13)
            r13.startActivity(r0)
            r13.finish()
            return
        L_0x014f:
            android.content.Intent r0 = r13.getIntent()
            boolean r0 = r0.hasExtra(r3)
            if (r0 == 0) goto L_0x00be
            X.3MX r1 = new X.3MX
            r1.<init>(r4, r4)
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r0 = r0.getStringExtra(r3)
            r1.addTarget(r0)
            r5.setSharedElementEnterTransition(r1)
            X.3MX r1 = new X.3MX
            r1.<init>(r4, r2)
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r0 = r0.getStringExtra(r3)
            goto L_0x00b8
        L_0x017b:
            X.0sH r0 = r13.A0A
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x02b2
            r0 = 2131888881(0x7f120af1, float:1.941241E38)
        L_0x0186:
            r13.setTitle(r0)
        L_0x0189:
            X.0rv r0 = r6.A0E
            boolean r5 = r5.equals(r0)
            r0 = 32000(0x7d00, double:1.581E-319)
            if (r5 == 0) goto L_0x0267
            X.0sH r6 = r13.A0A
            int r5 = r6.A04
            if (r5 <= 0) goto L_0x01c1
            X.120 r5 = r13.A05
            java.io.File r5 = r5.A00(r6)
            if (r5 == 0) goto L_0x01c1
            boolean r5 = r5.exists()
            if (r5 != 0) goto L_0x01c1
            X.0sH r6 = r13.A0A
            r6.A04 = r4
            X.12B r7 = r13.A0H
            java.lang.Class<X.0rv> r5 = X.C15830rv.class
            com.whatsapp.jid.Jid r6 = r6.A08(r5)
            X.0rv r6 = (X.C15830rv) r6
            X.0sH r5 = r13.A0A
            int r5 = r5.A04
            r7.A01(r6, r5, r2)
        L_0x01bc:
            android.os.Handler r5 = r13.A0O
            r5.sendEmptyMessageDelayed(r4, r0)
        L_0x01c1:
            X.152 r7 = r13.A06
            X.0sH r6 = r13.A0A
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131167050(0x7f07074a, float:1.7948363E38)
            int r5 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131167048(0x7f070748, float:1.7948359E38)
            float r0 = r1.getDimension(r0)
            android.graphics.Bitmap r1 = r7.A01(r13, r6, r0, r5)
            r0 = 2131365325(0x7f0a0dcd, float:1.8350512E38)
            android.view.View r5 = r13.findViewById(r0)
            com.obwhatsapp.mediaview.PhotoView r5 = (com.obwhatsapp.mediaview.PhotoView) r5
            r5.A0Y = r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.A08 = r0
            r5.A06(r1)
            r0 = 2131365330(0x7f0a0dd2, float:1.8350522E38)
            android.view.View r6 = r13.findViewById(r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r6.setImageBitmap(r1)
            r13.A35()
            if (r12 == 0) goto L_0x0261
            r0 = 4
            r5.setVisibility(r0)
            r6.setVisibility(r4)
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r0 = r0.getStringExtra(r3)
            if (r0 != 0) goto L_0x021f
            X.2hp r1 = new X.2hp
            r1.<init>(r13)
            r0 = 2131893719(0x7f121dd7, float:1.9422222E38)
            java.lang.String r0 = r1.A00(r0)
        L_0x021f:
            X.C004601z.A0n(r6, r0)
        L_0x0222:
            r0 = 2131365864(0x7f0a0fe8, float:1.8351605E38)
            android.view.View r3 = r13.findViewById(r0)
            com.obwhatsapp.profile.ViewProfilePhoto$10 r1 = new com.obwhatsapp.profile.ViewProfilePhoto$10
            r1.<init>(r13, r5, r13)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>(r0)
            r3.setBackground(r7)
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.A01 = r0
            r1.A0A = r2
            r1.A07 = r12
            X.4ya r6 = new X.4ya
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r1.A05 = r6
            r0 = 2131362933(0x7f0a0475, float:1.834566E38)
            android.view.View r0 = r13.findViewById(r0)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0Bo r0 = (X.AnonymousClass0Bo) r0
            r0.A01(r1)
            X.18O r0 = r13.A0E
            X.28S r1 = r13.A0D
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
            return
        L_0x0261:
            r0 = 8
            r6.setVisibility(r0)
            goto L_0x0222
        L_0x0267:
            X.12W r7 = r13.A07
            r6 = 3
            com.facebook.redex.IDxSCallbackShape221S0100000_2_I0 r5 = new com.facebook.redex.IDxSCallbackShape221S0100000_2_I0
            r5.<init>(r13, r6)
            boolean r5 = r7.A04(r5)
            if (r5 == 0) goto L_0x01c1
            X.0sH r6 = r13.A0A
            int r5 = r6.A04
            if (r5 <= 0) goto L_0x028d
            X.120 r5 = r13.A05
            java.io.File r5 = r5.A00(r6)
            if (r5 == 0) goto L_0x028d
            boolean r5 = r5.exists()
            if (r5 != 0) goto L_0x028d
            X.0sH r5 = r13.A0A
            r5.A04 = r4
        L_0x028d:
            X.12B r7 = r13.A0H
            X.0sH r6 = r13.A0A
            java.lang.Class<X.0rv> r5 = X.C15830rv.class
            com.whatsapp.jid.Jid r6 = r6.A08(r5)
            X.0rv r6 = (X.C15830rv) r6
            X.0sH r5 = r13.A0A
            int r5 = r5.A04
            r7.A01(r6, r5, r2)
            X.0sH r7 = r13.A0A
            int r5 = r7.A04
            if (r5 != 0) goto L_0x01c1
            X.0zl r6 = r13.A0B
            X.0rv r5 = r7.A0E
            boolean r5 = X.C40561uK.A01(r6, r5)
            if (r5 != 0) goto L_0x01c1
            goto L_0x01bc
        L_0x02b2:
            X.0rv r0 = r6.A0E
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x02bf
            r0 = 2131893610(0x7f121d6a, float:1.9422001E38)
            goto L_0x0186
        L_0x02bf:
            X.0sP r1 = r13.A04
            X.0sH r0 = r13.A0A
            java.lang.String r0 = r1.A08(r0)
            r13.A2g(r0)
            goto L_0x0189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.profile.ViewProfilePhoto.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        com.obwhatsapp.yo.SavePhoto.A0k(this, menu);
        C16010sH r1 = this.A0A;
        C16040sK r0 = this.A01;
        r0.A0B();
        if (r1.equals(r0.A01) || this.A0A.A0J()) {
            menu.add(0, R.id.menuitem_edit, 0, R.string.str076c).setIcon(R.drawable.ic_action_edit).setShowAsAction(2);
        }
        menu.add(0, 1, 0, R.string.str15f0).setIcon(R.drawable.ic_action_share).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0O.removeMessages(0);
        this.A03.A03(this.A0Q);
        this.A01.A03(this.A0P);
        AnonymousClass18O r0 = this.A0E;
        r0.A00.remove(this.A0D);
        this.A0F.A03(this.A0R);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00b6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r16) {
        /*
            r15 = this;
            java.lang.String r3 = "android.intent.extra.STREAM"
            r2 = r16
            int r1 = r2.getItemId()
            r0 = 2131364628(0x7f0a0b14, float:1.8349098E38)
            r12 = 1
            r9 = r15
            if (r1 != r0) goto L_0x001c
            X.121 r8 = r15.A0I
            X.0sH r10 = r15.A0A
            boolean r13 = r15.A0K
            r11 = 12
            r14 = 0
            r8.A07(r9, r10, r11, r12, r13, r14)
            return r12
        L_0x001c:
            if (r1 != r12) goto L_0x00c4
            X.0sb r2 = r15.A04
            X.0sH r1 = r15.A0A
            X.0sK r0 = r15.A01
            r0.A0B()
            X.1Zb r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "me.jpg"
        L_0x0031:
            java.io.File r7 = r2.A0N(r0)
            goto L_0x0039
        L_0x0036:
            java.lang.String r0 = "photo.jpg"
            goto L_0x0031
        L_0x0039:
            X.120 r1 = r15.A05     // Catch:{ IOException -> 0x00b7 }
            X.0sH r0 = r15.A0A     // Catch:{ IOException -> 0x00b7 }
            java.io.File r0 = r1.A00(r0)     // Catch:{ IOException -> 0x00b7 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ IOException -> 0x00b7 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00b7 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00b7 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x00b2 }
            r5.<init>(r7)     // Catch:{ all -> 0x00b2 }
            X.AnonymousClass1XI.A0H(r4, r5)     // Catch:{ all -> 0x00ad }
            android.net.Uri r8 = X.AnonymousClass1XI.A01(r15, r7)     // Catch:{ all -> 0x00ad }
            X.1Cv r0 = r15.A00     // Catch:{ all -> 0x00ad }
            X.1kk r0 = r0.A02()     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x00ad }
            X.1km r0 = r0.A02     // Catch:{ all -> 0x00ad }
            r0.A03(r1)     // Catch:{ all -> 0x00ad }
            r0 = 2
            android.content.Intent[] r6 = new android.content.Intent[r0]     // Catch:{ all -> 0x00ad }
            r2 = 0
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x00ad }
            r1.<init>(r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "image/*"
            android.content.Intent r0 = r1.setType(r0)     // Catch:{ all -> 0x00ad }
            android.content.Intent r0 = r0.putExtra(r3, r8)     // Catch:{ all -> 0x00ad }
            r6[r2] = r0     // Catch:{ all -> 0x00ad }
            java.lang.Class<com.obwhatsapp.profile.ViewProfilePhoto$SavePhoto> r0 = com.obwhatsapp.profile.ViewProfilePhoto.SavePhoto.class
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x00ad }
            r1.<init>(r15, r0)     // Catch:{ all -> 0x00ad }
            android.net.Uri r0 = android.net.Uri.fromFile(r7)     // Catch:{ all -> 0x00ad }
            android.content.Intent r3 = r1.putExtra(r3, r0)     // Catch:{ all -> 0x00ad }
            java.lang.String r2 = "name"
            X.0sP r1 = r15.A04     // Catch:{ all -> 0x00ad }
            X.0sH r0 = r15.A0A     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = r1.A08(r0)     // Catch:{ all -> 0x00ad }
            android.content.Intent r0 = r3.putExtra(r2, r0)     // Catch:{ all -> 0x00ad }
            r6[r12] = r0     // Catch:{ all -> 0x00ad }
            java.util.List r1 = java.util.Arrays.asList(r6)     // Catch:{ all -> 0x00ad }
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1yL.A01(r0, r0, r1)     // Catch:{ all -> 0x00ad }
            r15.startActivity(r0)     // Catch:{ all -> 0x00ad }
            r5.close()     // Catch:{ all -> 0x00b2 }
            r4.close()     // Catch:{ IOException -> 0x00b7 }
            return r12
        L_0x00ad:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            throw r0     // Catch:{ IOException -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0pt r1 = r15.A05
            r0 = 2131890842(0x7f12129a, float:1.9416387E38)
            r1.A09(r0, r12)
            return r12
        L_0x00c4:
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r1 != r0) goto L_0x00cd
            X.AnonymousClass00T.A09(r15)
            return r12
        L_0x00cd:
            boolean r0 = super.onOptionsItemSelected(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.profile.ViewProfilePhoto.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        if (r5.A0A.A0l != false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r6) {
        /*
            r5 = this;
            int r0 = r6.size()
            if (r0 == 0) goto L_0x0071
            X.0sH r1 = r5.A0A
            X.0sK r0 = r5.A01
            r0.A0B()
            X.1Zb r0 = r0.A01
            boolean r4 = r1.equals(r0)
            r2 = 0
            r1 = 1
            if (r4 != 0) goto L_0x001f
            X.0sH r0 = r5.A0A
            boolean r0 = r0.A0J()
            if (r0 == 0) goto L_0x0071
        L_0x001f:
            android.view.MenuItem r3 = r6.findItem(r1)
            X.120 r1 = r5.A05
            X.0sH r0 = r5.A0A
            java.io.File r0 = r1.A00(r0)
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r0.exists()
            r3.setVisible(r0)
            r0 = 2131364628(0x7f0a0b14, float:1.8349098E38)
            android.view.MenuItem r3 = r6.findItem(r0)
            if (r4 != 0) goto L_0x0059
            X.0sO r4 = r5.A09
            X.0sH r1 = r5.A0A
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            X.AnonymousClass00B.A06(r0)
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r4.A0A(r0)
            if (r0 != 0) goto L_0x0059
            X.0sH r0 = r5.A0A
            boolean r0 = r0.A0l
            if (r0 != 0) goto L_0x006e
        L_0x0059:
            X.0ul r1 = r5.A0C
            X.0sH r0 = r5.A0A
            boolean r0 = r1.A0f(r0)
            if (r0 != 0) goto L_0x006e
            X.15l r1 = r5.A0G
            X.0sH r0 = r5.A0A
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x006e
            r2 = 1
        L_0x006e:
            r3.setVisible(r2)
        L_0x0071:
            boolean r0 = super.onPrepareOptionsMenu(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.profile.ViewProfilePhoto.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0N = bundle.getBoolean("photo_change_requested_externally");
        this.A0M = bundle.getBoolean("photo_change_requested_by_phone");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("photo_change_requested_externally", this.A0N);
        bundle.putBoolean("photo_change_requested_by_phone", this.A0M);
    }

    public void savePhoto() {
        try {
            C16180sb r3 = this.A04;
            C16010sH r1 = this.A0A;
            C16040sK r0 = this.A01;
            r0.A0B();
            File A0N2 = r3.A0N(r1.equals(r0.A01) ? "me.jpg" : "photo.jpg");
            File A002 = this.A05.A00(this.A0A);
            AnonymousClass00B.A06(A002);
            FileInputStream fileInputStream = new FileInputStream(A002);
            FileOutputStream fileOutputStream = new FileOutputStream(A0N2);
            AnonymousClass1XI.A0H(fileInputStream, fileOutputStream);
            Uri A012 = AnonymousClass1XI.A01(this, A0N2);
            this.A00.A02().A02.A03(A012.toString());
            Uri fromFile = Uri.fromFile(A0N2);
            String replaceAll = this.A04.A08(this.A0A).replaceAll("[?:\\\\/*\"<>|]", "");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US);
            File file = this.A04.A05().A0G;
            C16180sb.A04(file, false);
            StringBuilder sb = new StringBuilder();
            sb.append(replaceAll);
            sb.append(" ");
            sb.append(simpleDateFormat.format(new Date()));
            sb.append(".jpg");
            File file2 = new File(file, sb.toString());
            AnonymousClass1XI.A0B(this.A04.A04, C13700nu.A0D(fromFile.getPath()), file2);
            C17970vw.A0K(this, Uri.fromFile(file2));
            this.A05.A09(R.string.str12a0, 0);
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e2) {
            Log.e("viewprofilephoto/save/failed", e2);
            this.A05.A09(R.string.str129a, 1);
        }
    }
}
