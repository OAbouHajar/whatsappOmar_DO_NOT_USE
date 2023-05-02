package com.obwhatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass12L;
import X.AnonymousClass1KQ;
import X.AnonymousClass1ZW;
import X.AnonymousClass2JN;
import X.AnonymousClass39H;
import X.AnonymousClass47O;
import X.AnonymousClass5S5;
import X.C005402i;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14750ph;
import X.C16150sX;
import X.C16260sj;
import X.C16320sq;
import X.C16980tz;
import X.C17130ua;
import X.C17220uj;
import X.C19760yx;
import X.C45922Bq;
import X.C49132Rg;
import X.C59142uk;
import X.C99924uo;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickCListenerShape19S0100000_I1_4;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.HashMap;

public class PrimaryFlashCallEducationScreen extends C14530pL implements AnonymousClass5S5 {
    public long A00;
    public long A01;
    public C17130ua A02;
    public C16980tz A03;
    public C16260sj A04;
    public AnonymousClass1KQ A05;
    public AnonymousClass39H A06;
    public C19760yx A07;
    public AnonymousClass12L A08;
    public C17220uj A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;

    public PrimaryFlashCallEducationScreen() {
        this(0);
        this.A00 = 0;
        this.A01 = 0;
    }

    public PrimaryFlashCallEducationScreen(int i2) {
        this.A0B = false;
        C13680ns.A1G(this, 109);
    }

    public void A1q() {
        if (!this.A0B) {
            this.A0B = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A03 = C16150sX.A0V(r1);
            this.A02 = C16150sX.A05(r1);
            this.A09 = C16150sX.A18(r1);
            this.A05 = (AnonymousClass1KQ) r1.AAL.get();
            this.A07 = (C19760yx) r1.AKx.get();
            this.A04 = C16150sX.A0X(r1);
            this.A08 = (AnonymousClass12L) r1.APo.get();
        }
    }

    public final SpannableString A35(Typeface typeface, String str) {
        Spanned A012 = AnonymousClass1ZW.A01(str, new Object[0]);
        String obj = A012.toString();
        SpannableString spannableString = new SpannableString(obj);
        for (Object obj2 : A012.getSpans(0, obj.length(), Object.class)) {
            int spanStart = A012.getSpanStart(obj2);
            int spanEnd = A012.getSpanEnd(obj2);
            int spanFlags = A012.getSpanFlags(obj2);
            spannableString.setSpan(Build.VERSION.SDK_INT >= 28 ? new TypefaceSpan(typeface) : new TypefaceSpan("sans-serif-medium"), spanStart, spanEnd, spanFlags);
            spannableString.setSpan(C13690nt.A0G(this, R.color.color044a), spanStart, spanEnd, spanFlags);
        }
        return spannableString;
    }

    public final void A36() {
        Log.i("primaryflashcalleducationscreen/attempt-flash-call");
        this.A07.A0A(8);
        startActivity(C14750ph.A0h(this, (String) null, -1, this.A00, this.A01, 0, this.A0C, false, this.A0A, true, false));
        finish();
    }

    public final void A37() {
        if (Build.VERSION.SDK_INT >= 28) {
            C13680ns.A0w(C13680ns.A0B(this.A09).edit(), "pref_flash_call_manage_call_permission_granted", this.A04.A09() ? 1 : 0);
            C13680ns.A0w(C13680ns.A0B(this.A09).edit(), "pref_flash_call_call_log_permission_granted", this.A04.A08() ? 1 : 0);
        }
    }

    public final void A38(boolean z2) {
        StringBuilder A0r = AnonymousClass000.A0r("primaryflashcalleducationscreen/startverifysms/usesmsretriever=");
        boolean z3 = z2;
        A0r.append(z3);
        C13680ns.A1V(A0r);
        this.A07.A0A(4);
        startActivity(C14750ph.A0h(this, (String) null, -1, this.A00, this.A01, 0, z3, true, this.A0A, false, false));
        finish();
    }

    public void Aao() {
        this.A0C = false;
        if (this.A0D) {
            if (!this.A04.A0A()) {
                Log.i("primaryflashcalleducationscreen/request-flash-call-permissions");
                RequestPermissionActivity.A0N(this, this.A04, 2, true);
                return;
            }
            A36();
        } else if (this.A04.A03("android.permission.RECEIVE_SMS") == 0) {
            A38(false);
        } else {
            AnonymousClass2JN.A0J(this, 1);
        }
    }

    public void Ag9() {
        this.A0C = true;
        if (!this.A0D) {
            A38(true);
        } else if (!this.A04.A0A()) {
            Log.i("primaryflashcalleducationscreen/request-flash-call-permissions");
            RequestPermissionActivity.A0N(this, this.A04, 2, true);
        } else {
            A36();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1) {
            Log.i(AnonymousClass000.A0h(i3 == -1 ? "granted" : "denied", AnonymousClass000.A0r("primaryflashcalleducationscreen/activity-result/request-sms-permissions/")));
            A38(false);
        } else if (i2 != 2) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            Log.i("primaryflashcalleducationscreen/activity-result/request-flash-call-permissions/granted");
            A37();
            A36();
        } else {
            Log.i("primaryflashcalleducationscreen/activity-result/request-flash-call-permissions/denied");
            this.A09.A0t("primary_eligible");
            A37();
            this.A0D = false;
            AnonymousClass47O.A00(this.A03, this);
        }
    }

    public void onBackPressed() {
        Intent intent;
        if (this.A0A) {
            Log.i("primaryflashcalleducationscreen/back-pressed/go-to-change-number-screen");
            this.A07.A0A(3);
            if (!this.A07.A0E()) {
                finish();
                return;
            } else {
                intent = C13680ns.A09();
                intent.setClassName(getPackageName(), "com.obwhatsapp.registration.ChangeNumber");
            }
        } else {
            Log.i("primaryflashcalleducationscreen/back-pressed/go-to-register-phone-screen");
            this.A07.A0A(1);
            intent = C14750ph.A06(this);
            intent.putExtra("com.obwhatsapp.registration.RegisterPhone.clear_phone_number", true);
        }
        A2X(intent, true);
    }

    public void onCreate(Bundle bundle) {
        Log.i("primaryflashcalleducationscreen/oncreate");
        super.onCreate(bundle);
        setContentView((int) R.layout.layout04cd);
        this.A09.A1G(true);
        Toolbar toolbar = (Toolbar) AnonymousClass00T.A05(this, R.id.verify_flash_call_title_toolbar);
        C14530pL.A0W(this, toolbar, this.A01);
        Aem(toolbar);
        toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape19S0100000_I1_4(this, 30));
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0Q(false);
        }
        Typeface createFromAsset = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Medium.ttf");
        C13700nu.A09(this, R.id.flash_call_education_screen_headline).setTypeface(createFromAsset, 0);
        C13700nu.A09(this, R.id.make_and_manage_calls).setText(A35(createFromAsset, getString(R.string.str0ca4)));
        C13700nu.A09(this, R.id.access_phone_call_logs).setText(A35(createFromAsset, getString(R.string.str0010)));
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass00T.A05(this, R.id.flash_call_learn_more);
        String string = getString(R.string.str0c14);
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put("flash-call-faq-link", this.A02.A00("https://faq.whatsapp.com/android/verification/how-to-register-your-account-with-a-missed-call"));
        C45922Bq.A09(this, this.A00, this.A05, textEmojiLabel, this.A08, string, A0x);
        SpannableString spannableString = new SpannableString(textEmojiLabel.getText());
        ((C59142uk[]) spannableString.getSpans(0, spannableString.length(), C59142uk.class))[0].A02 = new C99924uo(this);
        C16320sq r14 = this.A05;
        this.A06 = new AnonymousClass39H(this.A02, this.A01, this.A05, this.A0D, this.A09, r14);
        if (C13690nt.A0E(this) != null) {
            this.A00 = getIntent().getLongExtra("sms_retry_time", 0);
            this.A01 = getIntent().getLongExtra("voice_retry_time", 0);
            this.A0A = getIntent().getBooleanExtra("change_number", false);
        }
        C13680ns.A15(AnonymousClass00T.A05(this, R.id.verify_with_sms_button), this, 29);
        C13680ns.A15(AnonymousClass00T.A05(this, R.id.continue_button), this, 28);
        if (C13680ns.A0B(this.A09).getInt("pref_flash_call_education_link_clicked", -1) == -1) {
            C13680ns.A0w(C13680ns.A0B(this.A09).edit(), "pref_flash_call_education_link_clicked", 0);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.str13df);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            Log.i("primaryflashcalleducationscreen/select-menu-option/help");
            this.A06.A01(this, this.A08, "verify-flash-call");
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            Log.i("primaryflashcalleducationscreen/select-menu-option/reset");
            this.A07.A08();
            startActivity(C14750ph.A01(this));
            finishAffinity();
            return true;
        }
    }
}
