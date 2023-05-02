package com.obwhatsapp.phonematching;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass1G1;
import X.AnonymousClass1VA;
import X.AnonymousClass267;
import X.AnonymousClass2SR;
import X.AnonymousClass2SX;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C18160wF;
import X.C30551cZ;
import X.C447725m;
import X.C49132Rg;
import X.C56632oF;
import android.animation.Animator;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxIDrawableShape12S0100000_2_I1;
import com.facebook.redex.IDxTListenerShape171S0100000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class CountryPicker extends AnonymousClass1VA {
    public static final int A07;
    public static final int A08;
    public View A00;
    public SearchView A01;
    public Toolbar A02;
    public AnonymousClass1G1 A03;
    public C56632oF A04;
    public C18160wF A05;
    public boolean A06;

    static {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 250;
        int i4 = 220;
        if (i2 >= 21) {
            i4 = 250;
        }
        A07 = i4;
        if (i2 < 21) {
            i3 = 220;
        }
        A08 = i3;
    }

    public CountryPicker() {
        this(0);
    }

    public CountryPicker(int i2) {
        this.A06 = false;
        C13680ns.A1G(this, 89);
    }

    public void A1q() {
        if (!this.A06) {
            this.A06 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = new AnonymousClass2SX();
            this.A05 = (C18160wF) r1.A5o.get();
            this.A03 = (AnonymousClass1G1) r1.AJl.get();
        }
    }

    public final void A36() {
        if (A37()) {
            this.A01.A0F("");
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            long j2 = (long) A08;
            alphaAnimation.setDuration(j2);
            this.A02.startAnimation(alphaAnimation);
            if (Build.VERSION.SDK_INT >= 21) {
                int width = (this.A00.getWidth() - getResources().getDimensionPixelSize(R.dimen.dimen000f)) - ((getResources().getDimensionPixelSize(R.dimen.dimen000e) * 3) >> 1);
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.A00, C13680ns.A1Z(this.A01) ? width : this.A00.getWidth() - width, this.A00.getHeight() >> 1, (float) width, 0.0f);
                createCircularReveal.setDuration(j2);
                C13690nt.A0o(createCircularReveal, this, 8);
                createCircularReveal.start();
                return;
            }
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-this.A00.getHeight()));
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.addAnimation(translateAnimation);
            animationSet.setDuration(j2);
            C30551cZ.A00(animationSet, this, 7);
            this.A00.startAnimation(animationSet);
        }
    }

    public final boolean A37() {
        StringBuilder A0r = AnonymousClass000.A0r("Visible");
        A0r.append(AnonymousClass000.A1P(this.A00.getVisibility()));
        C13680ns.A1V(A0r);
        return this.A00.getVisibility() == 0;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onBackPressed() {
        if (A37()) {
            A36();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d6, code lost:
        if (X.C88944bL.A05.A00(r1 <= 65535 ? java.lang.Character.toString((char) r1) : new java.lang.String(java.lang.Character.toChars(r1))) == false) goto L_0x00d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r10 = r15
            r0 = r16
            super.onCreate(r0)
            r0 = 2131100913(0x7f0604f1, float:1.781422E38)
            X.C434920f.A04(r15, r0)
            r2 = 2131890850(0x7f1212a2, float:1.9416403E38)
            r15.setTitle(r2)
            r0 = 2131558905(0x7f0d01f9, float:1.874314E38)
            r15.setContentView((int) r0)
            r0 = 2131366661(0x7f0a1305, float:1.8353222E38)
            android.view.View r0 = r15.findViewById(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r15.A02 = r0
            android.content.Context r0 = r15.getApplicationContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r1 = r0.hasPermanentMenuKey()
            androidx.appcompat.widget.Toolbar r0 = r15.A02
            r15.Aem(r0)
            r5 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0042
            X.02i r0 = X.C13690nt.A0N(r15)
            r0.A0N(r3)
            r0.A0Q(r5)
        L_0x0042:
            X.013 r1 = r15.A01
            r0 = 2131231482(0x7f0802fa, float:1.8079046E38)
            X.25m r1 = X.C447725m.A00(r15, r1, r0)
            r0 = 2131100911(0x7f0604ef, float:1.7814217E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass2SR.A04(r15, r1, r0)
            androidx.appcompat.widget.Toolbar r0 = r15.A02
            r0.setNavigationIcon((android.graphics.drawable.Drawable) r1)
            androidx.appcompat.widget.Toolbar r0 = r15.A02
            r0.setTitle((int) r2)
            X.0wF r1 = r15.A05
            X.013 r0 = r15.A01
            java.util.Locale r0 = X.C13690nt.A0m(r0)
            java.lang.String r0 = X.AnonymousClass1WH.A04(r0)
            java.util.List r1 = r1.A03(r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x007e
            X.0wF r1 = r15.A05
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = X.AnonymousClass1WH.A04(r0)
            java.util.List r1 = r1.A03(r0)
        L_0x007e:
            java.util.ArrayList r14 = X.AnonymousClass000.A0w(r1)
            java.util.Iterator r9 = r1.iterator()
        L_0x0086:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r2 = r9.next()
            X.1aG r2 = (X.C29231aG) r2
            X.1G1 r0 = r15.A03
            java.lang.String r7 = r2.A00
            X.1aE r8 = r0.A01(r7)
            if (r8 != 0) goto L_0x00b4
            java.lang.String r0 = "countrypicker/oncreate saw unknown country "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r7)
            java.lang.String r0 = "="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0086
        L_0x00b4:
            java.lang.String r6 = r2.A01
            java.lang.String r4 = r8.A03
            boolean r0 = r6.equals(r4)
            if (r0 != 0) goto L_0x00d8
            int r1 = r4.codePointAt(r5)
            r0 = 255(0xff, float:3.57E-43)
            if (r1 <= r0) goto L_0x00d9
            X.4bL r2 = X.C88944bL.A05
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r0) goto L_0x00e8
            char r0 = (char) r1
            java.lang.String r1 = java.lang.Character.toString(r0)
        L_0x00d2:
            boolean r0 = r2.A00(r1)
            if (r0 != 0) goto L_0x00d9
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            int r0 = r8.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.4Rp r0 = new X.4Rp
            r0.<init>(r6, r4, r1, r7)
            r14.add(r0)
            goto L_0x0086
        L_0x00e8:
            char[] r0 = java.lang.Character.toChars(r1)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            goto L_0x00d2
        L_0x00f2:
            X.013 r0 = r15.A01
            java.util.Locale r1 = X.C13690nt.A0m(r0)
            X.578 r0 = new X.578
            r0.<init>(r15, r1)
            java.util.Collections.sort(r14, r0)
            X.01V r0 = r15.A08
            android.telephony.TelephonyManager r0 = r0.A0N()
            if (r0 == 0) goto L_0x012c
            java.lang.String r4 = r0.getSimCountryIso()
            if (r4 == 0) goto L_0x012c
            java.util.Iterator r2 = r14.iterator()
        L_0x0112:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x012c
            java.lang.Object r1 = r2.next()
            X.4Rp r1 = (X.AnonymousClass4Rp) r1
            java.lang.String r0 = r1.A03
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0112
            r2.remove()
            r14.add(r5, r1)
        L_0x012c:
            android.widget.ListView r2 = r15.ADA()
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "country_iso"
            java.lang.String r12 = r1.getStringExtra(r0)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "country_display_name"
            java.lang.String r13 = r1.getStringExtra(r0)
            X.2oF r9 = new X.2oF
            r11 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            r15.A04 = r9
            r15.A35(r9)
            r1 = 3
            com.facebook.redex.IDxCListenerShape195S0100000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape195S0100000_2_I1
            r0.<init>(r15, r1)
            r2.setOnItemClickListener(r0)
            r2.setFastScrollEnabled(r3)
            r2.setScrollbarFadingEnabled(r3)
            r2.setFastScrollAlwaysVisible(r3)
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r2.setScrollBarStyle(r0)
            X.013 r0 = r15.A01
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x017b
            r2.setVerticalScrollbarPosition(r3)
        L_0x0171:
            r0 = 2131365943(0x7f0a1037, float:1.8351766E38)
            android.view.View r0 = r15.findViewById(r0)
            r15.A00 = r0
            return
        L_0x017b:
            r0 = 2
            r2.setVerticalScrollbarPosition(r0)
            goto L_0x0171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.phonematching.CountryPicker.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, R.id.menuitem_search, 0, R.string.str1d7c).setIcon(AnonymousClass2SR.A04(this, C13690nt.A0C(this, R.drawable.ic_action_search_teal), R.color.color04ef)).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder A0r = AnonymousClass000.A0r("item.getItemId()");
        A0r.append(menuItem.getItemId());
        A0r.append(AnonymousClass000.A1R(menuItem.getItemId(), R.id.menuitem_search));
        C13680ns.A1V(A0r);
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            super.onBackPressed();
        } else if (itemId == R.id.menuitem_search) {
            if (!A37()) {
                if (this.A01 == null) {
                    AnonymousClass267.A00(this.A00);
                    getLayoutInflater().inflate(R.layout.layout02f3, (ViewGroup) this.A00, true);
                    SearchView searchView = (SearchView) this.A00.findViewById(R.id.search_view);
                    this.A01 = searchView;
                    TextView A0M = C13680ns.A0M(searchView, R.id.search_src_text);
                    C13680ns.A0v(this, A0M, R.color.color00ad);
                    A0M.setHintTextColor(AnonymousClass00T.A00(this, R.color.color00ae));
                    this.A01.setIconifiedByDefault(false);
                    this.A01.setQueryHint(getString(R.string.str149d));
                    SearchView searchView2 = this.A01;
                    searchView2.A0B = new IDxTListenerShape171S0100000_2_I1(this, 7);
                    C13680ns.A0K(searchView2, R.id.search_mag_icon).setImageDrawable(new IDxIDrawableShape12S0100000_2_I1(AnonymousClass00T.A04(this, R.drawable.ic_back), this, 3));
                    ImageView A0K = C13680ns.A0K(this.A01, R.id.search_close_btn);
                    if (A0K != null) {
                        A0K.setImageResource(R.drawable.ic_backup_cancel);
                    }
                    ImageView A0K2 = C13680ns.A0K(this.A00, R.id.search_back);
                    A0K2.setImageDrawable(new C447725m(AnonymousClass2SR.A02(this, R.drawable.ic_back, R.color.color04ef), this.A01));
                    C13680ns.A15(A0K2, this, 2);
                    this.A01.setMaxWidth(Integer.MAX_VALUE);
                }
                this.A02.setVisibility(8);
                this.A00.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration((long) A08);
                C30551cZ.A00(alphaAnimation, this, 6);
                this.A02.startAnimation(alphaAnimation);
                if (Build.VERSION.SDK_INT < 21) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-this.A02.getHeight()), 0.0f);
                    translateAnimation.setDuration((long) A07);
                    this.A00.clearAnimation();
                    this.A00.startAnimation(translateAnimation);
                    return true;
                } else if (this.A00.isAttachedToWindow()) {
                    int width = (this.A02.getWidth() - getResources().getDimensionPixelSize(R.dimen.dimen000f)) - ((getResources().getDimensionPixelSize(R.dimen.dimen000e) * 3) >> 1);
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.A00, C13680ns.A1Z(this.A01) ? width : this.A02.getWidth() - width, this.A02.getHeight() >> 1, 0.0f, (float) width);
                    createCircularReveal.setDuration((long) A07);
                    createCircularReveal.start();
                    Log.i("Detach");
                }
            }
            return true;
        }
        return false;
    }
}
