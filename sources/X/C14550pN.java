package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape22S0000000_2_I0;
import com.facebook.redex.IDxDCompatShape22S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.dialogs.ProgressDialogFragment;
import com.obwhatsapp.youbasha.others;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0pN  reason: invalid class name and case insensitive filesystem */
public class C14550pN extends C14560pO implements C14600pS, C14610pT {
    public static final long A0P = 500;
    public static final String A0Q = "screenshot.jpg";
    public View A00;
    public ViewGroup A01;
    public Toolbar A02;
    public C16300so A03;
    public C16180sb A04;
    public C14870pt A05;
    public C15900s5 A06;
    public C18260wP A07;
    public AnonymousClass01V A08;
    public C15860rz A09;
    public C16290sm A0A;
    public C17250um A0B;
    public C14710pd A0C;
    public C19950zG A0D;
    public boolean A0E = true;
    public int A0F;
    public long A0G;
    public Intent A0H;
    public View A0I;
    public ViewGroup A0J;
    public C49392Sx A0K;
    public Integer A0L;
    public List A0M = new ArrayList();
    public boolean A0N;
    public final C33871jK A0O = new C33871jK(this);

    public static C005402i A0s(C000900k r1, int i2) {
        r1.Aem((Toolbar) r1.findViewById(i2));
        C005402i AGK = r1.AGK();
        AnonymousClass00B.A06(AGK);
        return AGK;
    }

    public static C14550pN A0t(Context context) {
        Activity A002 = AnonymousClass22N.A00(context);
        if (A002 instanceof C14550pN) {
            return (C14550pN) A002;
        }
        return null;
    }

    private C49392Sx A0u() {
        return (C49392Sx) new C006602z((AnonymousClass04o) new AnonymousClass2Sw(this), (C001500q) this).A01(C49392Sx.class);
    }

    public static C16290sm A0v(C16150sX r0) {
        return (C16290sm) r0.AQk.get();
    }

    public static C16290sm A0w(C16150sX r1, C14550pN r2, AnonymousClass01J r3) {
        r2.A0C = (C14710pd) r3.get();
        r2.A05 = (C14870pt) r1.AB3.get();
        r2.A03 = (C16300so) r1.A5p.get();
        r2.A04 = (C16180sb) r1.A8b.get();
        r2.A0B = (C17250um) r1.A7e.get();
        r2.A06 = (C15900s5) r1.ALm.get();
        r2.A08 = (AnonymousClass01V) r1.AOi.get();
        r2.A0D = (C19950zG) r1.AQV.get();
        r2.A09 = (C15860rz) r1.AQh.get();
        r2.A07 = (C18260wP) r1.A4p.get();
        return (C16290sm) r1.AQk.get();
    }

    private void A0x() {
        Intent intent = this.A0H;
        if (intent != null) {
            Integer num = this.A0L;
            if (num != null) {
                startActivityForResult(intent, num.intValue());
            } else {
                startActivity(intent);
            }
            if (this.A0N) {
                finish();
            }
            this.A0H = null;
            this.A0L = null;
            this.A0N = false;
        }
    }

    public static void A0y(long j2, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
        if (elapsedRealtime < j3) {
            SystemClock.sleep(j3 - elapsedRealtime);
        }
    }

    public static void A15(C16150sX r1, C14550pN r2) {
        r2.A05 = (C16320sq) r1.ARB.get();
        r2.A0C = (C14710pd) r1.A05.get();
        r2.A05 = (C14870pt) r1.AB3.get();
        r2.A03 = (C16300so) r1.A5p.get();
        r2.A04 = (C16180sb) r1.A8b.get();
        r2.A0B = (C17250um) r1.A7e.get();
        r2.A06 = (C15900s5) r1.ALm.get();
        r2.A08 = (AnonymousClass01V) r1.AOi.get();
        r2.A0D = (C19950zG) r1.AQV.get();
        r2.A09 = (C15860rz) r1.AQh.get();
        r2.A07 = (C18260wP) r1.A4p.get();
    }

    public static /* synthetic */ void A19(C14550pN r2, Integer num) {
        if (num.intValue() == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(r2.getClass().getCanonicalName());
            sb.append(" ActivityLifecycleCallbacks: Recreating");
            Log.i(sb.toString());
            r2.recreate();
        }
    }

    public static boolean A1Q(C14550pN r2) {
        return r2.A0C.A0E(C16620tM.A02, 931);
    }

    public void A1R(AnonymousClass01A r3) {
        this.A0M.add(new WeakReference(r3));
    }

    public void A1b(boolean z2) {
        C005402i AGK;
        if (z2 || this.A0I != null) {
            int i2 = 0;
            if (this.A0I == null) {
                View inflate = getLayoutInflater().inflate(R.layout.layout0028, (ViewGroup) null, false);
                View findViewById = inflate.findViewById(R.id.progress_bar);
                this.A0I = findViewById;
                if (!(findViewById == null || (AGK = AGK()) == null)) {
                    AGK.A0O(true);
                    AGK.A0H(inflate, new AnonymousClass05K());
                }
            }
            View view = this.A0I;
            if (view != null) {
                if (!z2) {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri A2B() {
        /*
            r5 = this;
            android.view.Window r0 = r5.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.View r1 = r0.getRootView()
            r0 = 1
            r1.setDrawingCacheEnabled(r0)
            android.graphics.Bitmap r0 = r1.getDrawingCache()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r0)
            X.0sb r1 = r5.A04
            java.lang.String r0 = "screenshot.jpg"
            java.io.File r3 = r1.A0N(r0)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0042 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0042 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0034 }
            r0 = 75
            r4.compress(r1, r0, r2)     // Catch:{ all -> 0x0034 }
            r2.flush()     // Catch:{ all -> 0x0034 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0042 }
            goto L_0x005b
        L_0x0034:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0     // Catch:{ FileNotFoundException -> 0x0039, IOException -> 0x0042 }
        L_0x0039:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "File not found: "
            goto L_0x004a
        L_0x0042:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "IOException: "
        L_0x004a:
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x005b:
            android.net.Uri r0 = X.AnonymousClass1XI.A01(r5, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14550pN.A2B():android.net.Uri");
    }

    public DialogFragment A2C(Class cls) {
        if (AIm()) {
            return null;
        }
        AnonymousClass01A A0B2 = AGM().A0B(cls.getName());
        if (A0B2 instanceof DialogFragment) {
            return (DialogFragment) A0B2;
        }
        return null;
    }

    public C14710pd A2D() {
        return this.A0C;
    }

    public List A2E() {
        ArrayList arrayList = new ArrayList();
        for (Reference reference : this.A0M) {
            AnonymousClass01A r1 = (AnonymousClass01A) reference.get();
            if (r1 != null && r1.A0c()) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public void A2F() {
    }

    public void A2G() {
    }

    public void A2H() {
    }

    public void A2I() {
    }

    public void A2J() {
    }

    public void A2K() {
    }

    public void A2L() {
    }

    public void A2M() {
    }

    public void A2N() {
    }

    public void A2O() {
    }

    public void A2P() {
    }

    public void A2Q() {
        View view;
        if (!isFinishing() && (view = this.A00) != null) {
            view.postDelayed(new RunnableRunnableShape1S0100000_I0((Object) this, 29), 300);
        }
    }

    public void A2R() {
        A2T(R.layout.layout05b7);
    }

    public void A2S(int i2) {
    }

    /* JADX INFO: finally extract failed */
    public void A2T(int i2) {
        boolean z2 = false;
        Toolbar toolbar = (Toolbar) getLayoutInflater().inflate(i2, (ViewGroup) null, false);
        toolbar.setFitsSystemWindows(true);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(R.attr.attr0009, typedValue, true);
            TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(typedValue.resourceId, AnonymousClass05L.A00);
            try {
                float dimension = obtainStyledAttributes.getDimension(12, 0.0f);
                obtainStyledAttributes.recycle();
                toolbar.setElevation(dimension);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(R.attr.attr0598, typedValue2, true);
        if (typedValue2.type == 18 && typedValue2.data != 0) {
            z2 = true;
        }
        if (z2) {
            this.A01 = new FrameLayout(this);
            FrameLayout frameLayout = new FrameLayout(this);
            this.A0J = frameLayout;
            this.A01.addView(frameLayout, -1, -1);
        } else {
            LinearLayout linearLayout = new LinearLayout(this);
            this.A01 = linearLayout;
            this.A0J = linearLayout;
            linearLayout.setOrientation(1);
        }
        this.A01.addView(toolbar, -1, getResources().getDimensionPixelSize(R.dimen.dimen005e));
        Aem(toolbar);
        toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 1));
    }

    public void A2U(int i2, int i3) {
        View view;
        if (!AIm()) {
            C33871jK r3 = this.A0O;
            if (r3.A00 == null) {
                ProgressDialogFragment A012 = ProgressDialogFragment.A01(0, i2);
                r3.A00 = A012;
                A012.A1G(r3.A01.AGM(), C33871jK.A03);
            }
            C33871jK.A02 = true;
            if (!isFinishing() && (view = this.A00) != null) {
                view.postDelayed(new RunnableRunnableShape1S0100000_I0((Object) this, 29), (long) i3);
            }
        }
    }

    public void A2V(Intent intent) {
        A2X(intent, false);
    }

    public void A2W(Intent intent, int i2, boolean z2) {
        if (!this.A0E) {
            this.A0H = intent;
            this.A0L = Integer.valueOf(i2);
            this.A0N = z2;
            return;
        }
        startActivityForResult(intent, i2);
        if (z2) {
            finish();
        }
    }

    public void A2X(Intent intent, boolean z2) {
        boolean z3;
        if (!this.A0E) {
            this.A0H = intent;
            z3 = false;
        } else {
            startActivity(intent);
            z3 = true;
        }
        if (!z2) {
            return;
        }
        if (z3) {
            finish();
        } else {
            this.A0N = z2;
        }
    }

    public void A2Y(Configuration configuration) {
        this.A0K.A05(configuration);
    }

    public void A2Z(AnonymousClass2Sv r4, int i2, int i3, int i4) {
        if (!AIm()) {
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], i3);
            A012.A05 = i2;
            A012.A0B = new Object[0];
            A012.A00 = i3;
            A012.A01(new IDxCListenerShape127S0100000_2_I0(r4, 0), i4);
            A012.A00().A1G(AGM(), (String) null);
        }
    }

    public void A2a(AnonymousClass2Sv r4, int i2, int i3, int i4) {
        if (!AIm()) {
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], i2);
            A012.A00 = i2;
            A012.A01(new IDxCListenerShape22S0000000_2_I0(1), i3);
            IDxCListenerShape127S0100000_2_I0 iDxCListenerShape127S0100000_2_I0 = new IDxCListenerShape127S0100000_2_I0(r4, 5);
            A012.A04 = i4;
            A012.A07 = iDxCListenerShape127S0100000_2_I0;
            A012.A00().A1G(AGM(), (String) null);
        }
    }

    public void A2b(AnonymousClass2Sv r4, int i2, int i3, int i4, int i5) {
        if (!AIm()) {
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], i3);
            A012.A05 = i2;
            A012.A0B = new Object[0];
            A012.A00 = i3;
            A012.A01(new IDxCListenerShape127S0100000_2_I0(r4, 6), i4);
            IDxCListenerShape22S0000000_2_I0 iDxCListenerShape22S0000000_2_I0 = new IDxCListenerShape22S0000000_2_I0(2);
            A012.A04 = i5;
            A012.A07 = iDxCListenerShape22S0000000_2_I0;
            A012.A00().A1G(AGM(), (String) null);
        }
    }

    public void A2c(AnonymousClass2Sv r4, AnonymousClass2Sv r5, int i2, int i3, int i4) {
        if (!AIm()) {
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], i2);
            A012.A00 = i2;
            A012.A01(new IDxCListenerShape127S0100000_2_I0(r4, 2), i3);
            IDxCListenerShape127S0100000_2_I0 iDxCListenerShape127S0100000_2_I0 = new IDxCListenerShape127S0100000_2_I0(r5, 1);
            A012.A04 = i4;
            A012.A07 = iDxCListenerShape127S0100000_2_I0;
            A012.A00().A1G(AGM(), (String) null);
        }
    }

    public void A2d(AnonymousClass2Sv r4, AnonymousClass2Sv r5, int i2, int i3, int i4, int i5) {
        if (!AIm()) {
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], i3);
            A012.A05 = i2;
            A012.A0B = new Object[0];
            A012.A00 = i3;
            A012.A01(new IDxCListenerShape127S0100000_2_I0(r4, 4), i4);
            IDxCListenerShape127S0100000_2_I0 iDxCListenerShape127S0100000_2_I0 = new IDxCListenerShape127S0100000_2_I0(r5, 7);
            A012.A04 = i5;
            A012.A07 = iDxCListenerShape127S0100000_2_I0;
            A012.A00().A1G(AGM(), (String) null);
        }
    }

    public void A2e(String str) {
        if (!AIm()) {
            AnonymousClass02C AGM = AGM();
            AnonymousClass050 r1 = new AnonymousClass050(AGM);
            AnonymousClass01A A0B2 = AGM.A0B(str);
            if (A0B2 != null) {
                r1.A07(A0B2);
                r1.A02();
            }
        }
    }

    public void A2f(String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(R.dimen.dimen07c8));
        C005402i AGK = AGK();
        AnonymousClass00B.A06(AGK);
        AGK.A0I(AnonymousClass2Sy.A03(this, textPaint, this.A0B, str));
    }

    public void A2g(String str) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(R.dimen.dimen07de));
        setTitle(AnonymousClass2Sy.A03(this, textPaint, this.A0B, str));
    }

    public void A2h(String str) {
        if (!AIm()) {
            C33871jK r3 = this.A0O;
            if (r3.A00 == null) {
                ProgressDialogFragment A022 = ProgressDialogFragment.A02((String) null, str);
                r3.A00 = A022;
                A022.A1G(r3.A01.AGM(), C33871jK.A03);
            }
            C33871jK.A02 = true;
        }
    }

    public void A2i(String str, String str2) {
        if (!AIm()) {
            AnonymousClass2T3 r0 = new AnonymousClass2T3();
            r0.A08 = str2;
            r0.A09 = str;
            r0.A00().A1G(AGM(), (String) null);
        }
    }

    public void A2j(String str, String str2) {
        if (!AIm()) {
            C33871jK r1 = this.A0O;
            if (r1.A00 == null) {
                ProgressDialogFragment A022 = ProgressDialogFragment.A02(str, str2);
                r1.A00 = A022;
                A022.A1G(r1.A01.AGM(), C33871jK.A03);
            }
            C33871jK.A02 = true;
        }
    }

    public boolean A2k() {
        if (this.A07.A0A()) {
            return false;
        }
        boolean A022 = C18260wP.A02(this);
        int i2 = R.string.str0dc2;
        if (A022) {
            i2 = R.string.str0dc3;
        }
        Afg(i2);
        return true;
    }

    public boolean A2l(int i2) {
        if (this.A07.A0A()) {
            return false;
        }
        Afg(i2);
        return true;
    }

    public boolean AIm() {
        return AnonymousClass29T.A03(this);
    }

    public void AYX(AnonymousClass05J r3) {
        Toolbar toolbar = this.A02;
        if (toolbar != null) {
            C004601z.A0d(toolbar, 0);
        }
    }

    public void AYY(AnonymousClass05J r3) {
        Toolbar toolbar = this.A02;
        if (toolbar != null) {
            C004601z.A0d(toolbar, 4);
        }
    }

    public void Ac1() {
        C33871jK r1 = this.A0O;
        C33871jK.A02 = false;
        if (!AnonymousClass29T.A03(r1.A01)) {
            DialogFragment dialogFragment = r1.A00;
            if (dialogFragment != null) {
                dialogFragment.A1D();
            }
            r1.A00 = null;
        }
    }

    public void Aem(Toolbar toolbar) {
        super.Aem(toolbar);
        this.A02 = toolbar;
    }

    public void Afb(DialogFragment dialogFragment, String str) {
        if (!AIm()) {
            AnonymousClass050 r0 = new AnonymousClass050(AGM());
            r0.A0C(dialogFragment, str);
            r0.A02();
        }
    }

    public void Afc(DialogFragment dialogFragment) {
        if (!AIm()) {
            C453428a.A00(dialogFragment, AGM());
        }
    }

    public void Afg(int i2) {
        if (!AIm()) {
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], i2);
            A012.A00 = i2;
            A012.A00().A1G(AGM(), (String) null);
        }
    }

    @Deprecated
    public void Afh(String str) {
        if (!AIm()) {
            AnonymousClass2T3 r0 = new AnonymousClass2T3();
            r0.A08 = str;
            r0.A00().A1G(AGM(), (String) null);
        }
    }

    public void Afi(AnonymousClass2Sv r4, Object[] objArr, int i2, int i3, int i4) {
        if (!AIm()) {
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(objArr, i3);
            A012.A05 = i2;
            A012.A0B = new Object[0];
            A012.A00 = i3;
            A012.A01(new IDxCListenerShape127S0100000_2_I0(r4, 3), i4);
            IDxCListenerShape22S0000000_2_I0 iDxCListenerShape22S0000000_2_I0 = new IDxCListenerShape22S0000000_2_I0(0);
            A012.A04 = R.string.str0394;
            A012.A07 = iDxCListenerShape22S0000000_2_I0;
            A012.A00().A1G(AGM(), (String) null);
        }
    }

    public void Afj(Object[] objArr, int i2, int i3) {
        if (!AIm()) {
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(objArr, i3);
            A012.A05 = i2;
            A012.A0B = new Object[0];
            A012.A00 = i3;
            A012.A00().A1G(AGM(), (String) null);
        }
    }

    public void Afq(int i2) {
        if (!AIm()) {
            Afr(0, i2);
        }
    }

    public void Afr(int i2, int i3) {
        if (!AIm()) {
            C33871jK r1 = this.A0O;
            if (r1.A00 == null) {
                ProgressDialogFragment A012 = ProgressDialogFragment.A01(i2, i3);
                r1.A00 = A012;
                A012.A1G(r1.A01.AGM(), C33871jK.A03);
            }
            C33871jK.A02 = true;
        }
    }

    public void Ag3(Intent intent, int i2) {
        A2W(intent, i2, false);
    }

    public AnonymousClass05J AgA(C009804r r5) {
        AnonymousClass05J AgA = super.AgA(r5);
        if (AgA != null) {
            AgA.A06();
        }
        View findViewById = findViewById(R.id.action_mode_close_button);
        if (findViewById != null) {
            C004601z.A0j(findViewById, new IDxDCompatShape22S0100000_2_I0(this, 1));
        }
        return AgA;
    }

    public void AhY(String str) {
        StringBuilder sb;
        String str2;
        if (!AIm()) {
            DialogFragment dialogFragment = this.A0O.A00;
            if (dialogFragment == null) {
                sb = new StringBuilder();
                str2 = "dialogtoast/update-progress-message/progress-spinner-not-shown \"";
            } else {
                Dialog dialog = dialogFragment.A03;
                if (dialog == null) {
                    sb = new StringBuilder();
                    str2 = "dialogtoast/update-progress-message/null-dialog/ \"";
                } else if (!(dialog instanceof ProgressDialog)) {
                    sb = new StringBuilder();
                    str2 = "dialogtoast/update-progress-message/dialog-type-not-progress-dialog/ \"";
                } else {
                    ((AlertDialog) dialog).setMessage(str);
                    return;
                }
            }
            sb.append(str2);
            sb.append(str);
            sb.append("\"");
            Log.w(sb.toString());
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return (this.A0E || SystemClock.elapsedRealtime() - this.A0G > 500 || !(motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 2)) && super.dispatchTouchEvent(motionEvent);
    }

    public void onBackPressed() {
        if (Build.VERSION.SDK_INT < 29) {
            onStateNotSaved();
        }
        if (this.A0E) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A2Y(configuration);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006a, code lost:
        if (r2.data != 0) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            int r0 = X.C004301w.A00
            r5.A0F = r0
            X.013 r1 = r5.A01
            android.view.Window r0 = r5.getWindow()
            X.C45902Bo.A0B(r0, r1)
            X.2Sx r1 = r5.A0u()
            r5.A0K = r1
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1.A00 = r0
            X.2Sx r0 = r5.A0K
            X.027 r2 = r0.A01
            r1 = 0
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r0 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.A0A(r5, r0)
            super.onCreate(r6)
            X.013 r0 = r5.A01
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0078
            android.content.res.Resources$Theme r4 = r5.getTheme()
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0 = 2130969638(0x7f040426, float:1.7547964E38)
            r3 = 1
            r4.resolveAttribute(r0, r1, r3)
            int r0 = r1.type
            if (r0 != r3) goto L_0x0079
            int r0 = r1.data
        L_0x004f:
            r4.applyStyle(r0, r3)
            boolean r0 = X.C45902Bo.A01
            if (r0 != 0) goto L_0x0078
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r0 = 2130970007(0x7f040597, float:1.7548712E38)
            r4.resolveAttribute(r0, r2, r3)
            int r1 = r2.type
            r0 = 18
            if (r1 != r0) goto L_0x006c
            int r0 = r2.data
            r1 = 1
            if (r0 == 0) goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            r0 = 2131952081(0x7f1301d1, float:1.9540595E38)
            r4.applyStyle(r0, r3)
            if (r1 != 0) goto L_0x0078
            r5.A2R()
        L_0x0078:
            return
        L_0x0079:
            r0 = 2131952180(0x7f130234, float:1.9540795E38)
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14550pN.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C33871jK r1 = this.A0O;
        DialogFragment dialogFragment = r1.A00;
        if (dialogFragment != null) {
            dialogFragment.A1D();
        }
        r1.A00 = null;
        this.A0H = null;
        this.A0N = false;
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onPause() {
        this.A05.A0B(this);
        super.onPause();
        this.A0E = false;
        this.A0G = SystemClock.elapsedRealtime();
    }

    public void onRestart() {
        super.onRestart();
        if (C004301w.A00 != this.A0F) {
            recreate();
        }
    }

    public void onResume() {
        super.onResume();
        others.setStatusNavBar(this);
        this.A05.A0D(this);
        this.A0E = true;
        A0x();
    }

    public void onStart() {
        super.onStart();
        this.A0K.A05(getResources().getConfiguration());
    }

    public void setContentView(int i2) {
        setContentView(getLayoutInflater().inflate(i2, (ViewGroup) null, false));
    }

    public void setContentView(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            C004601z.A0U(view);
        }
        if (this.A01 != null) {
            this.A0J.addView(view, -1, -1);
            ViewGroup viewGroup = this.A01;
            this.A00 = viewGroup;
            super.setContentView((View) viewGroup);
            return;
        }
        this.A00 = view;
        super.setContentView(view);
    }
}
