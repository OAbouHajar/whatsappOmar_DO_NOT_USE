package com.obwhatsapp.settings;

import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass01J;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass1B5;
import X.AnonymousClass1B9;
import X.AnonymousClass1BI;
import X.AnonymousClass1BJ;
import X.AnonymousClass1D2;
import X.AnonymousClass1DN;
import X.AnonymousClass1NZ;
import X.AnonymousClass1SS;
import X.AnonymousClass2Ao;
import X.AnonymousClass2DE;
import X.AnonymousClass2O1;
import X.AnonymousClass2SR;
import X.AnonymousClass3BW;
import X.C005402i;
import X.C101734xn;
import X.C108825Pq;
import X.C109345Rt;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14710pd;
import X.C14750ph;
import X.C14870pt;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16320sq;
import X.C16490t9;
import X.C16620tM;
import X.C17140ub;
import X.C17160ud;
import X.C17200uh;
import X.C17270uo;
import X.C19610yi;
import X.C19980zJ;
import X.C206210w;
import X.C211212w;
import X.C226918x;
import X.C23101Am;
import X.C24961Hy;
import X.C28881Zb;
import X.C33481ie;
import X.C33601iq;
import X.C34331k5;
import X.C449126f;
import X.C455529g;
import X.C45922Bq;
import X.C47132Hs;
import X.C49132Rg;
import X.C70443gh;
import X.C74203q2;
import X.C74223q5;
import X.C74453qZ;
import X.C74463qa;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.obwhatsapp.Me;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.contact.IDxCObserverShape69S0100000_2_I1;
import com.obwhatsapp.languageselector.LanguageSelectorBottomSheet;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1;
import java.util.List;
import java.util.Locale;

public class Settings extends C14530pL implements C109345Rt, AnonymousClass2O1, C108825Pq {
    public static boolean reset;
    public int A00;
    public long A01;
    public View A02;
    public ImageView A03;
    public C23101Am A04;
    public C211212w A05;
    public AnonymousClass1BJ A06;
    public TextEmojiLabel A07;
    public TextEmojiLabel A08;
    public C24961Hy A09;
    public C17160ud A0A;
    public C16000sG A0B;
    public C17140ub A0C;
    public C16080sP A0D;
    public AnonymousClass2Ao A0E;
    public AnonymousClass2Ao A0F;
    public C17200uh A0G;
    public AnonymousClass1BI A0H;
    public C206210w A0I;
    public AnonymousClass1B5 A0J;
    public C19610yi A0K;
    public C449126f A0L;
    public C16010sH A0M;
    public C16490t9 A0N;
    public AnonymousClass1DN A0O;
    public SettingsRowIconText A0P;
    public AnonymousClass1NZ A0Q;
    public C226918x A0R;
    public C16320sq A0S;
    public AnonymousClass01D A0T;
    public AnonymousClass01D A0U;
    public AnonymousClass01D A0V;
    public AnonymousClass01D A0W;
    public AnonymousClass01D A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final C33481ie A0b;
    public final AnonymousClass1D2 A0c;

    public Settings() {
        this(0);
        this.A01 = 0;
        this.A0b = new IDxCObserverShape69S0100000_2_I1(this, 2);
        this.A0c = new C101734xn(this);
    }

    public Settings(int i2) {
        this.A0Y = false;
        C13680ns.A1G(this, 115);
    }

    public static /* synthetic */ void A02(Settings settings, Integer num) {
        C74453qZ r1 = new C74453qZ();
        r1.A00 = num;
        settings.A0N.A04(r1);
    }

    public void A1q() {
        if (!this.A0Y) {
            this.A0Y = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            AnonymousClass01J r3 = r1.ARB;
            this.A05 = (C16320sq) r3.get();
            C14530pL.A0b(A1T, r1, this, C14550pN.A0w(r1, this, r1.A05));
            this.A05 = (C211212w) r1.AG4.get();
            this.A0S = (C16320sq) r3.get();
            this.A04 = (C23101Am) r1.A0N.get();
            this.A0N = C16150sX.A0m(r1);
            this.A06 = (AnonymousClass1BJ) r1.AOm.get();
            this.A0G = C16150sX.A0R(r1);
            this.A0A = C16150sX.A0L(r1);
            this.A0B = C16150sX.A0M(r1);
            this.A0L = A1T.A0E();
            this.A0D = C16150sX.A0Q(r1);
            this.A0H = (AnonymousClass1BI) r1.ACt.get();
            this.A0O = (AnonymousClass1DN) r1.AGL.get();
            this.A0R = (C226918x) r1.AO5.get();
            this.A0W = C17270uo.A00(r1.AJ2);
            this.A0J = (AnonymousClass1B5) r1.AEp.get();
            this.A0I = (C206210w) r1.A4v.get();
            this.A0K = (C19610yi) r1.AEq.get();
            this.A0Q = (AnonymousClass1NZ) r1.AO6.get();
            this.A0T = C17270uo.A00(r1.A0J);
            this.A0V = C17270uo.A00(r1.AGp);
            this.A0X = C17270uo.A00(r1.ALh);
            this.A09 = (C24961Hy) r1.A2l.get();
            this.A0U = C17270uo.A00(r1.A4S);
            this.A0C = C16150sX.A0N(r1);
        }
    }

    public final void A35() {
        this.A0N.A06(new C74203q2());
        this.A0N.A06(new C74223q5());
        LanguageSelectorBottomSheet languageSelectorBottomSheet = new LanguageSelectorBottomSheet();
        languageSelectorBottomSheet.A04 = this;
        languageSelectorBottomSheet.A05 = this;
        Afc(languageSelectorBottomSheet);
    }

    public final void A36() {
        C16010sH r2 = this.A0M;
        if (r2 != null) {
            this.A0E.A06(this.A03, r2);
            return;
        }
        this.A03.setImageBitmap(C17160ud.A00(this, -1.0f, R.drawable.avatar_contact, this.A00));
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    public void APh(DialogInterface dialogInterface, int i2, int i3) {
        dialogInterface.dismiss();
    }

    public void ASY() {
        long j2 = this.A01;
        if (j2 > 0) {
            C74463qa r2 = new C74463qa();
            r2.A00 = Long.valueOf(System.currentTimeMillis() - j2);
            this.A0N.A06(r2);
            this.A01 = 0;
        }
    }

    public void ASZ() {
        if (this.A0a) {
            this.A0a = false;
            finish();
            startActivity(getIntent());
        }
    }

    public void ASa() {
        this.A01 = System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    public final void a(Class cls) {
        startActivity(new Intent(this, cls));
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 200 && i3 == -1) {
            throw C13680ns.A0m();
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onBackPressed() {
        if (isTaskRoot()) {
            Intent A022 = C14750ph.A02(this);
            if (Build.VERSION.SDK_INT >= 21) {
                finishAndRemoveTask();
                startActivity(A022);
                return;
            }
            startActivity(A022);
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        String stringExtra;
        String A012;
        if (C455529g.A00) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        setTitle(R.string.str1d94);
        setContentView((int) R.layout.layout04c0);
        Aem((Toolbar) AnonymousClass00T.A05(this, R.id.toolbar));
        C005402i A0N2 = C13690nt.A0N(this);
        A0N2.A0B(R.string.str1d94);
        A0N2.A0N(true);
        C16040sK r0 = this.A01;
        r0.A0B();
        C28881Zb r02 = r0.A01;
        this.A0M = r02;
        if (r02 == null) {
            Log.i("settings/create/no-me");
            startActivity(C14750ph.A04(this));
            finish();
            return;
        }
        View findViewById = findViewById(R.id.vcf_profile_info);
        View findViewById2 = findViewById(R.id.profile_info);
        findViewById(R.id.settings_top_divider);
        findViewById2.setVisibility(0);
        findViewById.setVisibility(8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen062b);
        this.A00 = dimensionPixelSize;
        this.A0E = this.A0G.A05("settings-activity-contact-photo", -1.0f, dimensionPixelSize);
        ImageView imageView = (ImageView) findViewById(R.id.profile_info_photo);
        this.A03 = imageView;
        imageView.setVisibility(0);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.profile_info_name);
        this.A07 = textEmojiLabel;
        textEmojiLabel.setVisibility(0);
        this.A07.A0I((List) null, this.A01.A07());
        this.A08 = (TextEmojiLabel) findViewById(R.id.profile_info_status);
        findViewById2.setOnClickListener(new ViewOnClickCListenerShape5S0100000_I1_1(this));
        A36();
        this.A0C.A02(this.A0b);
        ImageView imageView2 = (ImageView) findViewById(R.id.profile_info_qr_code);
        if (!this.A01.A0G()) {
            C13680ns.A15(imageView2, this, 47);
            imageView2.setVisibility(0);
            C13680ns.A0t(this, imageView2, R.string.str15b8);
            AnonymousClass2SR.A07(this, imageView2, R.color.color04d1);
        } else {
            imageView2.setVisibility(8);
        }
        SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(R.id.settings_help);
        C34331k5.A03(settingsRowIconText, this, 44);
        settingsRowIconText.setIcon(new C70443gh(AnonymousClass00T.A04(this, R.drawable.ic_settings_help), this.A01));
        C13680ns.A15(findViewById(R.id.setting_tell_a_friend), this, 45);
        findViewById(R.id.profile_info_qr_code);
        C13690nt.A14(findViewById(R.id.business_tools), findViewById(R.id.premium_tools), findViewById(R.id.business_tools_divider), 8);
        View findViewById3 = findViewById(R.id.privacy_preference);
        View findViewById4 = findViewById(R.id.vcf_myprivacy_button);
        C14710pd r03 = this.A0C;
        C16620tM r3 = C16620tM.A02;
        if (r03.A0E(r3, 2261)) {
            findViewById3.setVisibility(0);
            C34331k5.A03(findViewById3, this, 48);
        } else {
            findViewById3.setVisibility(8);
        }
        findViewById4.setVisibility(8);
        SettingsRowIconText settingsRowIconText2 = (SettingsRowIconText) findViewById(R.id.settings_chat);
        C34331k5.A03(settingsRowIconText2, this, 45);
        settingsRowIconText2.setSubText(getString(R.string.str0443));
        SettingsRowIconText settingsRowIconText3 = (SettingsRowIconText) AnonymousClass00T.A05(this, R.id.settings_data_usage);
        settingsRowIconText3.setText(getString(R.string.str15c9));
        C34331k5.A03(settingsRowIconText3, this, 46);
        C34331k5.A03(findViewById(R.id.settings_notifications), this, 47);
        if (this.A01.A0G()) {
            SettingsRowIconText settingsRowIconText4 = (SettingsRowIconText) findViewById(R.id.companion_settings_account_info);
            settingsRowIconText4.setVisibility(0);
            boolean A0E2 = this.A0C.A0E(r3, 2261);
            int i2 = R.string.str050c;
            if (A0E2) {
                i2 = R.string.str050d;
            }
            settingsRowIconText4.setSubText(getString(i2));
            C13680ns.A15(settingsRowIconText4, this, 48);
            C13680ns.A1I(this, R.id.settings_account_info, 8);
            if (((AnonymousClass1SS) this.A0U.get()).A00() == C47132Hs.PHONE) {
                C13680ns.A1I(this, R.id.linked_device_banner, 0);
                C14870pt r12 = this.A05;
                C19980zJ r11 = this.A00;
                AnonymousClass01V r14 = this.A08;
                String A0d = C13680ns.A0d(this, "learn-more", new Object[1], 0, R.string.str158c);
                C45922Bq.A08(this, Uri.parse("https://faq.whatsapp.com/378279804439436"), r11, r12, (TextEmojiLabel) findViewById(R.id.linked_device_banner_subtitle), r14, A0d);
            }
        } else {
            SettingsRowIconText settingsRowIconText5 = (SettingsRowIconText) findViewById(R.id.settings_account_info);
            boolean A0E3 = this.A0C.A0E(r3, 2261);
            int i3 = R.string.str0085;
            if (A0E3) {
                i3 = R.string.str0086;
            }
            settingsRowIconText5.setSubText(getString(i3));
            C13680ns.A15(settingsRowIconText5, this, 46);
        }
        if (!this.A01.A0G() && this.A0C.A0E(r3, 1396)) {
            SettingsRowIconText settingsRowIconText6 = (SettingsRowIconText) findViewById(R.id.settings_avatar);
            settingsRowIconText6.setText(getString(R.string.str1527));
            settingsRowIconText6.setSubText(getString(R.string.str1528));
            settingsRowIconText6.setIcon(AnonymousClass00T.A04(this, R.drawable.ic_settings_avatar));
            C34331k5.A03(settingsRowIconText6, this, 42);
            settingsRowIconText6.setVisibility(0);
        }
        if (this.A0C.A0E(r3, 2090)) {
            View findViewById5 = findViewById(R.id.settings_report_bug);
            findViewById5.setVisibility(0);
            C34331k5.A03(findViewById5, this, 43);
        }
        this.A0P = (SettingsRowIconText) findViewById(R.id.settings_language);
        C16040sK r04 = this.A01;
        r04.A0B();
        Me me = r04.A00;
        if (me == null || this.A01.A0G()) {
            this.A0P.setVisibility(8);
        } else {
            this.A0P.setVisibility(0);
            if (AnonymousClass3BW.A02()) {
                A012 = C13680ns.A0d(this, C33601iq.A01(C13690nt.A0m(this.A01)), new Object[1], 0, R.string.device_default_language_with_placeholder_when_language_selector_enabled);
            } else {
                A012 = C33601iq.A01(Locale.getDefault());
            }
            this.A0P.setSubText(A012);
            C13690nt.A1A(this.A0P, this, me, 9);
        }
        this.A0a = false;
        AnonymousClass013 r05 = this.A01;
        r05.A0B.add(this.A0c);
        this.A0Z = true;
        this.A01.A0G();
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("page")) != null && stringExtra.equals("language")) {
            A35();
            intent.removeExtra("page");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.A0Z) {
            this.A0C.A03(this.A0b);
            this.A0E.A00();
            AnonymousClass013 r0 = this.A01;
            r0.A0B.remove(this.A0c);
        }
        if (C14550pN.A1Q(this)) {
            AnonymousClass2DE.A02(this.A02, this.A0K);
            AnonymousClass2Ao r02 = this.A0F;
            if (r02 != null) {
                r02.A00();
                this.A0F = null;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onPause() {
        super.onPause();
        if (C14550pN.A1Q(this)) {
            AnonymousClass2DE.A07(this.A0K);
            C14530pL.A0i(this, this.A0V);
        }
    }

    public void onResume() {
        if (this.A0a) {
            this.A0a = false;
            finish();
            startActivity(getIntent());
        }
        super.onResume();
        C16040sK r0 = this.A01;
        r0.A0B();
        this.A0M = r0.A01;
        this.A07.A0I((List) null, this.A01.A07());
        this.A08.A0I((List) null, this.A05.A00());
        if (C14550pN.A1Q(this)) {
            boolean z2 = ((AnonymousClass1B9) this.A0V.get()).A03;
            View view = this.A00;
            if (z2) {
                C14710pd r16 = this.A0C;
                C14870pt r15 = this.A05;
                C16040sK r12 = this.A01;
                C16320sq r11 = this.A0S;
                C17200uh r10 = this.A0G;
                C16000sG r9 = this.A0B;
                C16080sP r8 = this.A0D;
                AnonymousClass013 r7 = this.A01;
                AnonymousClass1B5 r6 = this.A0J;
                C19610yi r5 = this.A0K;
                AnonymousClass01D r4 = this.A0V;
                AnonymousClass01D r3 = this.A0X;
                View view2 = this.A02;
                AnonymousClass2Ao r1 = this.A0F;
                C17200uh r22 = r10;
                AnonymousClass1B5 r23 = r6;
                C16080sP r20 = r8;
                AnonymousClass2Ao r21 = r1;
                C16040sK r18 = r12;
                C16000sG r19 = r9;
                View view3 = view2;
                C14870pt r17 = r15;
                View view4 = view;
                Pair A002 = AnonymousClass2DE.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r5, this.A09, r7, r16, r11, r4, r3, "settings-activity");
                this.A02 = (View) A002.first;
                this.A0F = (AnonymousClass2Ao) A002.second;
            } else if (AnonymousClass1B9.A00(view)) {
                AnonymousClass2DE.A04(this.A00, this.A0K, this.A0V);
            }
            ((AnonymousClass1B9) this.A0V.get()).A01();
        }
        if (this.A0O.A06()) {
            SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(R.id.settings_help);
            if (settingsRowIconText != null) {
                settingsRowIconText.setBadgeIcon(AnonymousClass00T.A04(this, R.drawable.ic_settings_row_badge));
            } else {
                Log.e("settings/showbadge cannot find help view");
            }
            AnonymousClass1DN r2 = this.A0O;
            if (r2.A0C) {
                r2.A05(new RunnableRunnableShape12S0100000_I0_11((Object) r2, 21));
                return;
            }
            return;
        }
        SettingsRowIconText settingsRowIconText2 = (SettingsRowIconText) findViewById(R.id.settings_help);
        if (settingsRowIconText2 != null) {
            settingsRowIconText2.setBadgeIcon((Drawable) null);
        } else {
            Log.e("settings/showbadge cannot find help view");
        }
    }
}
