package com.obwhatsapp.support;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass11A;
import X.AnonymousClass12W;
import X.AnonymousClass15W;
import X.AnonymousClass1A9;
import X.AnonymousClass1BY;
import X.AnonymousClass1KO;
import X.AnonymousClass1Y2;
import X.AnonymousClass1Y3;
import X.AnonymousClass1Y4;
import X.AnonymousClass1Y9;
import X.AnonymousClass1YA;
import X.AnonymousClass1YB;
import X.AnonymousClass20M;
import X.AnonymousClass37A;
import X.AnonymousClass37C;
import X.AnonymousClass39V;
import X.C005402i;
import X.C1222969a;
import X.C15910s6;
import X.C16050sL;
import X.C16490t9;
import X.C16620tM;
import X.C17130ua;
import X.C17220uj;
import X.C18160wF;
import X.C18290wS;
import X.C23251Bb;
import X.C26201Ms;
import X.C30671cl;
import X.C53842gO;
import X.C74853rD;
import X.C85364Od;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.facebook.redex.IDxCSpanShape13S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0;
import com.facebook.redex.ViewOnClickCListenerShape4S0200000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.inappsupport.ui.AddScreenshotImageView;
import com.obwhatsapp.text.IDxWAdapterShape22S0200000_2_I0;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DescribeProblemActivity extends AnonymousClass1Y9 implements AnonymousClass1YA, AnonymousClass1Y2 {
    public int A00;
    public Uri A01;
    public EditText A02;
    public AppCompatCheckBox A03;
    public AnonymousClass1KO A04;
    public C17130ua A05;
    public AnonymousClass12W A06;
    public AnonymousClass11A A07;
    public C16490t9 A08;
    public AnonymousClass15W A09;
    public C26201Ms A0A;
    public AnonymousClass37C A0B;
    public WhatsAppLibLoader A0C;
    public AnonymousClass1YB A0D;
    public C18290wS A0E;
    public AnonymousClass1BY A0F;
    public AnonymousClass39V A0G;
    public C17220uj A0H;
    public C23251Bb A0I;
    public C18160wF A0J;
    public AnonymousClass1A9 A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public boolean A0O;
    public final Uri[] A0P = new Uri[3];

    public static final boolean A02(String str, boolean z2) {
        int length;
        int i2;
        if (!z2) {
            length = str.getBytes().length;
            i2 = 10;
        } else if (!str.contains("\n\n")) {
            return false;
        } else {
            length = str.substring(str.indexOf("\n\n", 0) + "\n\n".getBytes().length).getBytes().length;
            i2 = 45;
        }
        return length < i2;
    }

    public final String A35() {
        ArrayList<String> stringArrayListExtra;
        if (!getIntent().hasExtra("com.obwhatsapp.support.DescribeProblemActivity.Description.paymentSupportTopicTitles") || (stringArrayListExtra = getIntent().getStringArrayListExtra("com.obwhatsapp.support.DescribeProblemActivity.Description.paymentSupportTopicTitles")) == null || stringArrayListExtra.isEmpty()) {
            return this.A02.getText().toString().trim();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.str1103));
        sb.append(" ");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        for (int i2 = 0; i2 < stringArrayListExtra.size(); i2++) {
            sb2.append(stringArrayListExtra.get(i2));
            if (i2 < stringArrayListExtra.size() - 1) {
                sb2.append(", ");
            }
        }
        StringBuilder sb3 = new StringBuilder("\n\n");
        sb3.append(this.A02.getText().toString().trim());
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public final void A36() {
        if (A3B()) {
            A38(1);
            Afr(0, R.string.str0c8c);
            this.A05.Acl(new RunnableRunnableShape11S0200000_I0_9(this, 10, this));
            return;
        }
        A37();
    }

    public final void A37() {
        A39(3, A35());
        AnonymousClass1BY r4 = this.A0F;
        String str = this.A0M;
        String str2 = this.A0L;
        String str3 = this.A0N;
        String A35 = A35();
        Uri[] uriArr = this.A0P;
        AnonymousClass1YB r0 = this.A0D;
        List AEN = r0 != null ? r0.AEN() : null;
        ArrayList arrayList = new ArrayList();
        for (Uri uri : uriArr) {
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        r4.A01(this, (AnonymousClass1Y3) null, (C16050sL) null, str, A35, str2, str3, arrayList, AEN, true);
    }

    public final void A38(int i2) {
        if (this.A0E.A03() != null && this.A0E.A03().ACC() != null) {
            C1222969a ACC = this.A0E.A03().ACC();
            C53842gO A7M = ACC.A7M();
            A7M.A08 = Integer.valueOf(i2);
            A7M.A0a = "payments_in_app_support_view";
            ACC.AKR(A7M);
        }
    }

    public final void A39(int i2, String str) {
        C74853rD r1 = new C74853rD();
        r1.A00 = Integer.valueOf(i2);
        r1.A01 = str;
        r1.A02 = this.A01.A06();
        this.A08.A05(r1);
    }

    public final void A3A(Uri uri, int i2) {
        int i3;
        Uri uri2 = uri;
        this.A0P[i2] = uri;
        AddScreenshotImageView addScreenshotImageView = (AddScreenshotImageView) ((ViewGroup) AnonymousClass00T.A05(this, R.id.screenshots)).getChildAt(i2);
        if (uri != null) {
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getSize(point);
            int i4 = point.x / 3;
            try {
                addScreenshotImageView.setScreenshot(this.A0K.A0X(uri2, i4 / 2, i4, this.A0C.A03(), false));
                addScreenshotImageView.setContentDescription(getString(R.string.str06ca));
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder("descprob/screenshot/io-exception ");
                sb.append(uri);
                Log.e(sb.toString(), e2);
                i3 = R.string.str0848;
                Afg(i3);
                addScreenshotImageView.setContentDescription(getString(R.string.str06c3));
            } catch (AnonymousClass20M e3) {
                StringBuilder sb2 = new StringBuilder("descprob/screenshot/not-an-image ");
                sb2.append(uri);
                Log.e(sb2.toString(), e3);
                i3 = R.string.str0840;
                Afg(i3);
                addScreenshotImageView.setContentDescription(getString(R.string.str06c3));
            }
        } else {
            Bitmap bitmap = addScreenshotImageView.A07;
            if (bitmap != null) {
                bitmap.recycle();
                addScreenshotImageView.A07 = null;
            }
            addScreenshotImageView.A04();
            addScreenshotImageView.setContentDescription(getString(R.string.str06c3));
        }
    }

    public final boolean A3B() {
        return getIntent().getStringExtra("com.obwhatsapp.support.DescribeProblemActivity.paymentFBTxnId") != null && this.A0C.A0E(C16620tM.A02, 2237);
    }

    public void AQK() {
        this.A0B = null;
        A36();
    }

    public void AW9(boolean z2) {
        finish();
    }

    public void AWo(C85364Od r14) {
        String str = this.A0M;
        String str2 = r14.A02;
        ArrayList arrayList = r14.A05;
        String str3 = this.A0N;
        int i2 = r14.A00;
        ArrayList arrayList2 = r14.A06;
        ArrayList arrayList3 = r14.A03;
        ArrayList arrayList4 = r14.A07;
        ArrayList arrayList5 = r14.A04;
        List list = r14.A08;
        Intent intent = new Intent();
        intent.setClassName(getPackageName(), "com.obwhatsapp.support.faq.SearchFAQ");
        intent.putExtra("com.obwhatsapp.support.faq.SearchFAQ.from", str);
        intent.putExtra("com.obwhatsapp.support.faq.SearchFAQ.problem", str2);
        intent.putExtra("com.obwhatsapp.support.faq.SearchFAQ.status", str3);
        intent.putExtra("com.obwhatsapp.support.faq.SearchFAQ.count", i2);
        intent.putStringArrayListExtra("com.obwhatsapp.support.faq.SearchFAQ.titles", arrayList2);
        intent.putStringArrayListExtra("com.obwhatsapp.support.faq.SearchFAQ.descriptions", arrayList3);
        intent.putStringArrayListExtra("com.obwhatsapp.support.faq.SearchFAQ.urls", arrayList4);
        intent.putStringArrayListExtra("com.obwhatsapp.support.faq.SearchFAQ.ids", arrayList5);
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        if (list != null) {
            String[] strArr = new String[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                Pair pair = (Pair) list.get(i3);
                StringBuilder sb = new StringBuilder();
                sb.append((String) pair.first);
                sb.append(":");
                sb.append((String) pair.second);
                strArr[i3] = sb.toString();
            }
            intent.putExtra("com.obwhatsapp.support.faq.SearchFAQ.additionalDetails", strArr);
        }
        Ag3(intent, 32);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Uri data;
        int i4;
        if ((i2 & 16) == 16) {
            if (i3 == -1) {
                if (intent.getBooleanExtra("is_removed", false)) {
                    i4 = i2 - 16;
                    data = null;
                } else {
                    data = intent.getData();
                    if (data != null) {
                        try {
                            grantUriPermission("com.whatsapp", data, 1);
                        } catch (SecurityException e2) {
                            Log.w("descprob/permission", e2);
                        }
                        i4 = i2 - 16;
                    } else {
                        Afg(R.string.str0848);
                        return;
                    }
                }
                A3A(data, i4);
            }
        } else if (i2 != 32) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            finish();
        }
    }

    public void onBackPressed() {
        A39(1, (String) null);
        super.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0G.A00();
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        setTitle(R.string.str06c4);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        x2.A0O(true);
        setContentView((int) R.layout.layout0214);
        View findViewById = findViewById(R.id.scroll_view);
        this.A02 = (EditText) findViewById(R.id.describe_problem_description_et);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) findViewById(R.id.send_device_info_checkbox);
        this.A03 = appCompatCheckBox;
        appCompatCheckBox.setChecked(true);
        findViewById(R.id.send_info_row).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 22));
        View findViewById2 = findViewById(R.id.describe_problem_error);
        View findViewById3 = findViewById(R.id.next_btn);
        boolean z2 = false;
        if (this.A02.getText().toString().length() >= 1) {
            z2 = true;
        }
        findViewById3.setEnabled(z2);
        this.A02.addTextChangedListener(new IDxWAdapterShape22S0200000_2_I0(findViewById3, 1, this));
        if (A3B()) {
            A38(0);
            View findViewById4 = findViewById(R.id.send_info_row);
            if (findViewById4 != null) {
                findViewById4.setVisibility(0);
            }
        }
        findViewById3.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I0_1(this, 2, findViewById2));
        Intent intent = getIntent();
        this.A0M = intent.getStringExtra("com.obwhatsapp.support.DescribeProblemActivity.from");
        this.A0N = intent.getStringExtra("com.obwhatsapp.support.DescribeProblemActivity.serverstatus");
        this.A0L = intent.getStringExtra("com.obwhatsapp.support.DescribeProblemActivity.emailAddress");
        this.A01 = this.A0H.A02(this.A0F.A00(), "general", (String) null, (String) null);
        if (AnonymousClass1Y4.A00(this.A0M)) {
            String A032 = this.A06.A03(C15910s6.A2A);
            if (!TextUtils.isEmpty(A032)) {
                this.A0L = A032;
            }
            String A033 = this.A06.A03(C15910s6.A2B);
            if (!TextUtils.isEmpty(A033)) {
                this.A01 = Uri.parse(A033);
            }
        }
        ViewGroup viewGroup = (ViewGroup) AnonymousClass00T.A05(this, R.id.screenshots);
        viewGroup.removeAllViews();
        if (AnonymousClass1Y4.A00(this.A0M)) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.obwhatsapp.support.DescribeProblemActivity.description.paymentSupportTopicIDs");
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("com.obwhatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles");
            this.A0D = this.A0E.A03().AEY();
            String stringExtra = intent.getStringExtra("com.obwhatsapp.support.DescribeProblemActivity.paymentBankPhone");
            C30671cl r1 = (C30671cl) intent.getParcelableExtra("com.obwhatsapp.support.DescribeProblemActivity.paymentMethod");
            String stringExtra2 = intent.getStringExtra("com.obwhatsapp.support.DescribeProblemActivity.paymentFBTxnId");
            String stringExtra3 = intent.getStringExtra("com.obwhatsapp.support.DescribeProblemActivity.paymentBankTxnId");
            String stringExtra4 = intent.getStringExtra("com.obwhatsapp.support.DescribeProblemActivity.paymentErrorCode");
            String stringExtra5 = intent.getStringExtra("com.obwhatsapp.support.DescribeProblemActivity.paymentStatus");
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.payment_information_container);
            AnonymousClass1YB r15 = this.A0D;
            if (r15 != null && !"payments:account-details".equals(this.A0M)) {
                r15.AeI(stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringArrayListExtra);
                viewGroup2.addView(r15.buildPaymentHelpSupportSection(this, r1, stringExtra));
                viewGroup2.setVisibility(0);
            }
            TextView textView = (TextView) findViewById(R.id.optional_title);
            if (stringArrayListExtra2 == null || stringArrayListExtra2.isEmpty()) {
                textView.setVisibility(8);
            } else {
                StringBuilder sb = new StringBuilder(stringArrayListExtra2.get(0));
                int i2 = 1;
                while (i2 < stringArrayListExtra2.size()) {
                    if (i2 == 1) {
                        sb.append(" (");
                    }
                    sb.append(stringArrayListExtra2.get(i2));
                    sb.append(i2 == stringArrayListExtra2.size() - 1 ? ")" : ", ");
                    i2++;
                }
                textView.setText(sb.toString());
                textView.setVisibility(0);
            }
            View findViewById5 = findViewById(R.id.add_screenshots);
            AnonymousClass1YB r0 = this.A0D;
            if (r0 != null && !r0.AHh()) {
                findViewById5.setVisibility(8);
                viewGroup.setVisibility(8);
            }
        }
        int intExtra = intent.getIntExtra("com.obwhatsapp.support.DescribeProblemActivity.type", 0);
        this.A00 = intExtra;
        if (intExtra == 1 || intExtra == 2 || intExtra == 3) {
            x2.A0B(R.string.str06c5);
        } else {
            x2.A0B(R.string.str06c4);
        }
        String stringExtra6 = intent.getStringExtra("com.obwhatsapp.support.DescribeProblemActivity.description");
        if (stringExtra6 != null && stringExtra6.length() > 0) {
            this.A02.setText(stringExtra6);
            this.A0O = true;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0528);
        int i3 = 0;
        do {
            AddScreenshotImageView addScreenshotImageView = new AddScreenshotImageView(this);
            addScreenshotImageView.setOnClickListener(new ViewOnClickCListenerShape1S0101000_I0(this, i3, 12));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.bottomMargin = dimensionPixelSize;
            layoutParams.rightMargin = dimensionPixelSize;
            layoutParams.topMargin = dimensionPixelSize;
            layoutParams.leftMargin = dimensionPixelSize;
            viewGroup.addView(addScreenshotImageView, layoutParams);
            String stringExtra7 = intent.getStringExtra("com.obwhatsapp.support.DescribeProblemActivity.uri");
            if (i3 == 0 && stringExtra7 != null) {
                Uri parse = Uri.parse(stringExtra7);
                this.A0P[0] = parse;
                addScreenshotImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                addScreenshotImageView.setImageURI(parse);
            }
            i3++;
        } while (i3 < 3);
        if (bundle != null) {
            Parcelable[] parcelableArray = bundle2.getParcelableArray("screenshots");
            for (int i4 = 0; i4 < parcelableArray.length; i4++) {
                if (parcelableArray[i4] != null) {
                    A3A((Uri) parcelableArray[i4], i4);
                }
            }
        }
        if (this.A00 == 2) {
            A36();
        }
        AnonymousClass39V r02 = new AnonymousClass39V(findViewById, findViewById(R.id.bottom_button_container), getResources().getDimensionPixelSize(R.dimen.dimen06f3));
        this.A0G = r02;
        r02.A00();
        if (A3B()) {
            ((TextView) this.A00.findViewById(R.id.describe_problem_help)).setText(R.string.str05a2);
        } else {
            this.A0G.A02(this, new IDxCSpanShape13S0100000_2_I0(this, 1), (TextView) findViewById(R.id.describe_problem_help), getString(R.string.str06c9), R.style.style0139);
        }
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 != 2) {
            return super.onCreateDialog(i2);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(R.string.str14b3));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!A3B()) {
            return false;
        }
        menu.add(0, R.id.menuitem_contact_us_email, 0, getString(R.string.str1855)).setShowAsAction(0);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass37C r1 = this.A0B;
        if (r1 != null) {
            r1.A06(false);
        }
        AnonymousClass37A r12 = this.A0F.A00;
        if (r12 != null) {
            r12.A06(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            A39(1, (String) null);
            finish();
            return true;
        } else if (itemId != R.id.menuitem_contact_us_email) {
            return false;
        } else {
            TextView textView = (TextView) findViewById(R.id.describe_problem_error);
            String A35 = A35();
            int length = A35.getBytes().length;
            boolean A002 = AnonymousClass1Y4.A00(this.A0M);
            if (this.A0O || !A02(A35, A002)) {
                this.A02.setBackground(AnonymousClass00T.A04(this, R.drawable.description_field_background_state_list));
                textView.setVisibility(8);
                A37();
                return true;
            }
            this.A02.setBackground(AnonymousClass00T.A04(this, R.drawable.describe_problem_edittext_bg_error));
            int i2 = R.string.str06c7;
            if (length == 0) {
                i2 = R.string.str06c6;
            }
            textView.setText(i2);
            textView.setVisibility(0);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.A02.clearFocus();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray("screenshots", this.A0P);
    }
}
