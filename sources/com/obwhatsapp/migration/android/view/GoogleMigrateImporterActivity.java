package com.obwhatsapp.migration.android.view;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01T;
import X.AnonymousClass01V;
import X.AnonymousClass07V;
import X.AnonymousClass116;
import X.AnonymousClass15P;
import X.AnonymousClass2Rf;
import X.C006602z;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C28251Uz;
import X.C45902Bo;
import X.C49132Rg;
import X.C54932iV;
import X.C55862kX;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.RoundCornerProgressBar;
import com.obwhatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;

public class GoogleMigrateImporterActivity extends C14530pL implements C28251Uz {
    public static final int A0C = 11;
    public static final int A0D = -1;
    public static final String A0E = "GoogleMigrateImporterActivity/";
    public static final String A0F = "com.obwhatsapp.migration.ACTION_OPENED_VIA_NOTIFICATION";
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public WaImageView A01;
    public WaTextView A02;
    public WaTextView A03;
    public GoogleMigrateImporterViewModel A04;
    public View A05;
    public WaButton A06;
    public WaButton A07;
    public WaTextView A08;
    public WaTextView A09;
    public RoundCornerProgressBar A0A;
    public boolean A0B;

    public GoogleMigrateImporterActivity() {
        this(0);
        this.A00 = new IDxLListenerShape144S0100000_2_I0(this, 22);
    }

    public GoogleMigrateImporterActivity(int i2) {
        this.A0B = false;
        A0T();
    }

    /* access modifiers changed from: private */
    public AnonymousClass07V A0A(int i2) {
        AnonymousClass07V A012 = AnonymousClass07V.A01((Resources.Theme) null, getResources(), i2);
        StringBuilder sb = new StringBuilder("GoogleMigrateImporterActivity/getVectorDrawable/drawableId is invalid/drawableId = ");
        sb.append(i2);
        AnonymousClass00B.A07(A012, sb.toString());
        return A012;
    }

    private void A0T() {
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 62));
    }

    public static /* synthetic */ void A0p() {
    }

    public static /* synthetic */ void A0r() {
    }

    public static /* synthetic */ void A0u() {
    }

    public static /* synthetic */ void A0x() {
    }

    private void A1R(int i2, int i3) {
        A1X(i2, R.string.str09fa, i3, R.string.str146a, R.string.str09fc);
    }

    private void A1X(int i2, int i3, int i4, int i5, int i6) {
        String num = Integer.toString(i2);
        if (AGM().A0B(num) != null) {
            StringBuilder sb = new StringBuilder("GoogleMigrateImporterActivity/showDialog/dialog is already shown/dialogId = ");
            sb.append(num);
            Log.i(sb.toString());
            return;
        }
        C55862kX r3 = new C55862kX(i2);
        String str = null;
        r3.A06(i3 == -1 ? null : getString(i3));
        r3.A02(getString(i4));
        r3.A07(false);
        r3.A05(i5 == -1 ? null : getString(i5));
        if (i6 != -1) {
            str = getString(i6);
        }
        r3.A03(str);
        Afb(r3.A00(), num);
    }

    public static void A1b(Context context) {
        new Intent(context, GoogleMigrateImporterActivity.class).addFlags(335544320);
    }

    public static void A1f(GoogleMigrateImporterActivity googleMigrateImporterActivity, int i2) {
        String str;
        googleMigrateImporterActivity.setResult(i2);
        if (googleMigrateImporterActivity.getIntent() != null && A0F.equals(googleMigrateImporterActivity.getIntent().getAction())) {
            Intent className = new Intent().setClassName(googleMigrateImporterActivity.getPackageName(), "com.obwhatsapp.registration.RegisterName");
            if (i2 == 2) {
                str = "google_migrate_import_canceled";
            } else {
                if (i2 == 1) {
                    str = "google_migrate_import_success";
                }
                googleMigrateImporterActivity.startActivity(className);
            }
            className.putExtra(str, true);
            googleMigrateImporterActivity.startActivity(className);
        }
        googleMigrateImporterActivity.finish();
    }

    public static void A1g(GoogleMigrateImporterActivity googleMigrateImporterActivity, int i2) {
        if (i2 == 100) {
            googleMigrateImporterActivity.A08.setVisibility(8);
            googleMigrateImporterActivity.A0A.setVisibility(8);
            return;
        }
        RoundCornerProgressBar roundCornerProgressBar = googleMigrateImporterActivity.A0A;
        if (i2 == -1) {
            roundCornerProgressBar.setVisibility(0);
            googleMigrateImporterActivity.A0A.setProgress(0);
            googleMigrateImporterActivity.A08.setVisibility(0);
            googleMigrateImporterActivity.A08.setText(R.string.str0c8c);
        } else if (i2 >= 0) {
            roundCornerProgressBar.setVisibility(0);
            googleMigrateImporterActivity.A0A.setProgress(i2);
            googleMigrateImporterActivity.A08.setVisibility(0);
            googleMigrateImporterActivity.A08.setText(googleMigrateImporterActivity.getString(R.string.str09f1, new Object[]{googleMigrateImporterActivity.A01.A0L().format(((double) i2) / 100.0d)}));
        } else {
            roundCornerProgressBar.setVisibility(8);
            googleMigrateImporterActivity.A08.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008c, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0122, code lost:
        r12 = com.obwhatsapp.R.string.str09e9;
        r13 = com.obwhatsapp.R.string.str09fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0128, code lost:
        r3.A1X(r9, r10, r11, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0137, code lost:
        r12.A1R(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        r6 = null;
        r8 = null;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        r3.A1p(r4, r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1j(com.obwhatsapp.migration.android.view.GoogleMigrateImporterActivity r12, java.lang.Integer r13) {
        /*
            if (r13 != 0) goto L_0x0008
            java.lang.String r0 = "GoogleMigrateImporterActivity/currentScreen is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0008:
            r0 = 2131888619(0x7f1209eb, float:1.9411878E38)
            r3 = r12
            java.lang.String r5 = r12.getString(r0)
            r1 = 37
            com.facebook.redex.IDxProviderShape156S0100000_2_I0 r0 = new com.facebook.redex.IDxProviderShape156S0100000_2_I0
            r0.<init>(r12, r1)
            r7 = 0
            X.01T r4 = new X.01T
            r4.<init>(r7, r0)
            com.obwhatsapp.components.RoundCornerProgressBar r0 = r12.A0A
            r1 = 8
            r0.setVisibility(r1)
            com.obwhatsapp.WaTextView r0 = r12.A08
            r0.setVisibility(r1)
            int r0 = r13.intValue()
            switch(r0) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0056;
                case 2: goto L_0x0030;
                case 3: goto L_0x008e;
                case 4: goto L_0x0030;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00d3;
                case 7: goto L_0x00df;
                case 8: goto L_0x0030;
                case 9: goto L_0x00d3;
                case 10: goto L_0x00f6;
                case 11: goto L_0x0104;
                case 12: goto L_0x010c;
                case 13: goto L_0x0111;
                case 14: goto L_0x011a;
                case 15: goto L_0x012e;
                case 16: goto L_0x0133;
                case 17: goto L_0x013c;
                default: goto L_0x0030;
            }
        L_0x0030:
            r6 = r7
            r8 = r7
            r9 = r7
        L_0x0033:
            r10 = r7
        L_0x0034:
            r3.A1p(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0038:
            r0 = 2131888621(0x7f1209ed, float:1.9411882E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131888624(0x7f1209f0, float:1.9411889E38)
            java.lang.String r2 = r12.getString(r0)
            r0 = 2131888640(0x7f120a00, float:1.9411921E38)
            java.lang.String r8 = r12.getString(r0)
            r0 = 2131886127(0x7f12002f, float:1.9406824E38)
            java.lang.String r10 = r12.getString(r0)
            r9 = r7
            goto L_0x008c
        L_0x0056:
            r0 = 2131888633(0x7f1209f9, float:1.9411907E38)
            java.lang.String r5 = r12.getString(r0)
            r0 = 2131888621(0x7f1209ed, float:1.9411882E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131888624(0x7f1209f0, float:1.9411889E38)
            java.lang.String r2 = r12.getString(r0)
            r0 = 2131888640(0x7f120a00, float:1.9411921E38)
            java.lang.String r8 = r12.getString(r0)
            r0 = 2131888618(0x7f1209ea, float:1.9411876E38)
            java.lang.String r9 = r12.getString(r0)
            r1 = 36
            com.facebook.redex.IDxProviderShape156S0100000_2_I0 r0 = new com.facebook.redex.IDxProviderShape156S0100000_2_I0
            r0.<init>(r12, r1)
            X.01T r4 = new X.01T
            r4.<init>(r7, r0)
            r0 = 2131886126(0x7f12002e, float:1.9406822E38)
            java.lang.String r10 = r12.getString(r0)
        L_0x008c:
            r7 = r2
            goto L_0x0034
        L_0x008e:
            r0 = 2131888620(0x7f1209ec, float:1.941188E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            java.lang.String r9 = r12.getString(r0)
            com.obwhatsapp.components.RoundCornerProgressBar r1 = r12.A0A
            r0 = 0
            r1.setVisibility(r0)
            r12.Ac1()
            r0 = 2131886125(0x7f12002d, float:1.940682E38)
            java.lang.String r10 = r12.getString(r0)
            r8 = r7
            goto L_0x0034
        L_0x00ae:
            r0 = 2131888623(0x7f1209ef, float:1.9411887E38)
            java.lang.String r5 = r12.getString(r0)
            r0 = 2131889632(0x7f120de0, float:1.9413933E38)
            java.lang.String r8 = r12.getString(r0)
            r1 = 35
            com.facebook.redex.IDxProviderShape156S0100000_2_I0 r0 = new com.facebook.redex.IDxProviderShape156S0100000_2_I0
            r0.<init>(r12, r1)
            X.01T r4 = new X.01T
            r4.<init>(r7, r0)
            r0 = 2131886124(0x7f12002c, float:1.9406818E38)
            java.lang.String r10 = r12.getString(r0)
            r6 = r7
            r9 = r7
            goto L_0x0034
        L_0x00d3:
            r9 = 1
            r10 = 2131888642(0x7f120a02, float:1.9411925E38)
            r11 = 2131888641(0x7f120a01, float:1.9411923E38)
            r12 = 2131888636(0x7f1209fc, float:1.9411913E38)
            r13 = -1
            goto L_0x0128
        L_0x00df:
            r0 = 2131888620(0x7f1209ec, float:1.941188E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131886996(0x7f120394, float:1.9408587E38)
            java.lang.String r9 = r12.getString(r0)
            r0 = 2131888612(0x7f1209e4, float:1.9411864E38)
            r12.Afq(r0)
            r8 = r7
            goto L_0x0033
        L_0x00f6:
            r9 = 3
            r10 = 2131888961(0x7f120b41, float:1.9412572E38)
            r11 = 2131888960(0x7f120b40, float:1.941257E38)
            r12 = 2131888959(0x7f120b3f, float:1.9412568E38)
            r13 = 2131888635(0x7f1209fb, float:1.941191E38)
            goto L_0x0128
        L_0x0104:
            com.obwhatsapp.migration.android.view.GoogleMigrateImporterViewModel r1 = r12.A04
            r0 = 1
            r1.A09(r0)
            goto L_0x0030
        L_0x010c:
            r1 = 2
            r0 = 2131893475(0x7f121ce3, float:1.9421728E38)
            goto L_0x0137
        L_0x0111:
            r9 = 8
            r10 = 2131888616(0x7f1209e8, float:1.9411872E38)
            r11 = 2131888615(0x7f1209e7, float:1.941187E38)
            goto L_0x0122
        L_0x011a:
            r9 = 9
            r10 = 2131888634(0x7f1209fa, float:1.9411909E38)
            r11 = 2131888613(0x7f1209e5, float:1.9411866E38)
        L_0x0122:
            r12 = 2131888617(0x7f1209e9, float:1.9411874E38)
            r13 = 2131888636(0x7f1209fc, float:1.9411913E38)
        L_0x0128:
            r8 = r3
            r8.A1X(r9, r10, r11, r12, r13)
            goto L_0x0030
        L_0x012e:
            r1 = 6
            r0 = 2131888614(0x7f1209e6, float:1.9411868E38)
            goto L_0x0137
        L_0x0133:
            r1 = 7
            r0 = 2131887184(0x7f120450, float:1.9408968E38)
        L_0x0137:
            r12.A1R(r1, r0)
            goto L_0x0030
        L_0x013c:
            r0 = 2131889292(0x7f120c8c, float:1.9413243E38)
            r12.Afq(r0)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.migration.android.view.GoogleMigrateImporterActivity.A1j(com.obwhatsapp.migration.android.view.GoogleMigrateImporterActivity, java.lang.Integer):void");
    }

    public static void A1l(GoogleMigrateImporterActivity googleMigrateImporterActivity, boolean z2) {
        if (!z2) {
            googleMigrateImporterActivity.A1X(5, R.string.str0451, R.string.str0d69, R.string.str0e87, -1);
        }
    }

    public static void A1m(GoogleMigrateImporterActivity googleMigrateImporterActivity, boolean z2) {
        int i2;
        if (z2) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 30) {
                i2 = R.string.str1208;
            } else {
                i2 = R.string.str120a;
                if (i3 < 33) {
                    i2 = R.string.str1209;
                }
            }
            if (!googleMigrateImporterActivity.isFinishing()) {
                C54932iV r3 = new C54932iV(googleMigrateImporterActivity);
                r3.A0H = new int[]{R.drawable.permission_contacts, R.drawable.permission_plus, R.drawable.permission_storage};
                r3.A0K = RequestPermissionActivity.A0a(googleMigrateImporterActivity);
                r3.A06 = R.string.str1207;
                r3.A0I = null;
                r3.A09 = i2;
                r3.A0G = null;
                r3.A0D = false;
                googleMigrateImporterActivity.startActivityForResult(r3.A00(), 11);
            }
        }
    }

    private void A1p(AnonymousClass01T r8, String str, String str2, String str3, String str4, String str5, String str6) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str5)) {
            this.A01.setImageDrawable((Drawable) r8.get());
            if (str6 != null) {
                this.A01.setFocusable(true);
            }
            this.A01.setContentDescription(str6);
            WaTextView waTextView = this.A02;
            int i2 = 0;
            int i3 = 8;
            if (str2 != null) {
                i3 = 0;
            }
            waTextView.setVisibility(i3);
            WaTextView waTextView2 = this.A09;
            int i4 = 8;
            if (str3 != null) {
                i4 = 0;
            }
            waTextView2.setVisibility(i4);
            WaButton waButton = this.A06;
            int i5 = 8;
            if (str4 != null) {
                i5 = 0;
            }
            waButton.setVisibility(i5);
            WaButton waButton2 = this.A07;
            if (str5 == null) {
                i2 = 8;
            }
            waButton2.setVisibility(i2);
            boolean isEmpty = TextUtils.isEmpty(str5);
            Resources resources = getResources();
            int i6 = R.dimen.dimen08b2;
            if (isEmpty) {
                i6 = R.dimen.dimen08c6;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i6);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A06.getLayoutParams();
            C45902Bo.A09(this.A06, this.A01, marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, dimensionPixelSize);
            this.A03.setText(str);
            this.A02.setText(str2);
            this.A09.setText(str3);
            this.A06.setText(str4);
            this.A07.setText(str5);
        }
    }

    public void A1q() {
        if (!this.A0B) {
            this.A0B = true;
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
        }
    }

    public void APk(int i2) {
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel;
        boolean z2;
        switch (i2) {
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
                this.A04.A0D.A03("google_migrate_recoverable_error", "google_migrate_attempt_to_skip_import");
                A1X(4, R.string.str0b41, R.string.str0b40, R.string.str0b3f, R.string.str09fb);
                return;
            case 3:
                googleMigrateImporterViewModel = this.A04;
                z2 = false;
                break;
            case 4:
                googleMigrateImporterViewModel = this.A04;
                z2 = true;
                break;
            default:
                return;
        }
        googleMigrateImporterViewModel.A09(z2);
    }

    public void APl(int i2) {
    }

    public void APm(int i2) {
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel;
        boolean z2 = true;
        switch (i2) {
            case 1:
                googleMigrateImporterViewModel = this.A04;
                z2 = false;
                break;
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
                this.A04.A09(true);
                return;
            case 3:
            case 4:
                googleMigrateImporterViewModel = this.A04;
                break;
            default:
                return;
        }
        googleMigrateImporterViewModel.A0D.A04(z2 ? "google_migrate_cancel_import_dialog" : "google_migrate_unrecoverable_error", "google_migrate_confirm_skip_import");
        Context context = googleMigrateImporterViewModel.A07.A00;
        AnonymousClass116 r2 = googleMigrateImporterViewModel.A0F;
        Log.i("GoogleMigrateService/cancelImport()");
        r2.A03(context, new Intent("com.obwhatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_CANCEL_IMPORT"), GoogleMigrateService.class);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 11 && i3 == -1) {
            GoogleMigrateImporterViewModel googleMigrateImporterViewModel = this.A04;
            if (googleMigrateImporterViewModel.A09.A0G()) {
                Log.i("GoogleMigrateImporterViewModel/onPermissionGranted/import already successfully finished, skipping import again");
                return;
            }
            googleMigrateImporterViewModel.A0D.A04("google_migrate_permission", "google_migrate_accepted_permission");
            googleMigrateImporterViewModel.A06();
            return;
        }
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel2 = this.A04;
        boolean A0B2 = googleMigrateImporterViewModel2.A08.A0B();
        boolean A002 = googleMigrateImporterViewModel2.A06.A00();
        googleMigrateImporterViewModel2.A0D.A04("google_migrate_permission", !A0B2 ? !A002 ? "google_migrate_rejected_contact_and_storage_permission" : "google_migrate_rejected_storage_permission" : !A002 ? "google_migrate_rejected_contact_permission" : "unknown");
        googleMigrateImporterViewModel2.A07(1);
    }

    public void onBackPressed() {
        C19980zJ.A03(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout02c2);
        this.A03 = (WaTextView) AnonymousClass00T.A05(this, R.id.google_migrate_title);
        this.A02 = (WaTextView) AnonymousClass00T.A05(this, R.id.google_migrate_sub_title);
        this.A09 = (WaTextView) AnonymousClass00T.A05(this, R.id.google_migrate_warning);
        this.A06 = (WaButton) AnonymousClass00T.A05(this, R.id.google_migrate_main_action);
        this.A07 = (WaButton) AnonymousClass00T.A05(this, R.id.google_migrate_sub_action);
        this.A01 = (WaImageView) AnonymousClass00T.A05(this, R.id.google_migrate_image_view);
        this.A0A = (RoundCornerProgressBar) AnonymousClass00T.A05(this, R.id.google_migrate_progress_bar);
        this.A08 = (WaTextView) AnonymousClass00T.A05(this, R.id.google_migrate_progress_description);
        View findViewById = findViewById(R.id.google_migrate_importer_view_layout);
        this.A05 = findViewById;
        if (findViewById != null) {
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.A00);
        }
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel = (GoogleMigrateImporterViewModel) new C006602z(this).A01(GoogleMigrateImporterViewModel.class);
        this.A04 = googleMigrateImporterViewModel;
        googleMigrateImporterViewModel.A01.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 207));
        this.A04.A03.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 206));
        this.A04.A00.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 205));
        this.A04.A04.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 203));
        this.A04.A02.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 204));
        this.A06.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 21));
        this.A07.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 22));
    }

    public void onDestroy() {
        super.onDestroy();
        Ac1();
    }
}
