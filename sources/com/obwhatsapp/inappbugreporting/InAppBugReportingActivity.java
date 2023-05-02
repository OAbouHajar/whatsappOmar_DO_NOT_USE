package com.obwhatsapp.inappbugreporting;

import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass1BZ;
import X.AnonymousClass1DV;
import X.AnonymousClass1yL;
import X.AnonymousClass20M;
import X.AnonymousClass2O1;
import X.AnonymousClass2Rf;
import X.AnonymousClass3MF;
import X.AnonymousClass5ET;
import X.C005402i;
import X.C008603x;
import X.C102554z8;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15220qW;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C17110uY;
import X.C17250um;
import X.C18260wP;
import X.C18450wi;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C221516v;
import X.C23061Ai;
import X.C23071Aj;
import X.C49132Rg;
import X.C56992pb;
import X.C74283qE;
import X.C76573uH;
import X.C807645k;
import X.C86204Rr;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.Button;
import com.obwhatsapp.text.IDxWAdapterShape101S0100000_1_I0;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;

public final class InAppBugReportingActivity extends C14530pL implements AnonymousClass2O1 {
    public ProgressDialog A00;
    public ViewStub A01;
    public LinearLayout A02;
    public TextView A03;
    public ConstraintLayout A04;
    public ConstraintLayout A05;
    public TextEmojiLabel A06;
    public WaEditText A07;
    public WaTextView A08;
    public Button A09;
    public AnonymousClass1BZ A0A;
    public C16260sj A0B;
    public C16490t9 A0C;
    public C221516v A0D;
    public WhatsAppLibLoader A0E;
    public C17110uY A0F;
    public boolean A0G;
    public Uri[] A0H;
    public final C15220qW A0I;

    public InAppBugReportingActivity() {
        this(0);
        this.A0H = new Uri[3];
        this.A0I = new AnonymousClass1DV(new AnonymousClass5ET(this));
    }

    public InAppBugReportingActivity(int i2) {
        this.A0G = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 55));
    }

    public void A1q() {
        if (!this.A0G) {
            this.A0G = true;
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
            this.A0E = (WhatsAppLibLoader) r1.AR7.get();
            this.A0D = (C221516v) r1.AEU.get();
            this.A0B = (C16260sj) r1.AQe.get();
            this.A0C = (C16490t9) r1.AQz.get();
            this.A0F = (C17110uY) r1.ADT.get();
            this.A0A = (AnonymousClass1BZ) r1.A5N.get();
        }
    }

    public final void A35(int i2) {
        C74283qE r1 = new C74283qE();
        r1.A00 = Integer.valueOf(i2);
        C16490t9 r0 = this.A0C;
        if (r0 != null) {
            r0.A04(r1);
        } else {
            C18450wi.A0O("wamRuntime");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public final void A36(int i2) {
        C16260sj r0 = this.A0B;
        if (r0 == null) {
            C18450wi.A0O("waPermissionsHelper");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (r0.A0B()) {
            ArrayList arrayList = new ArrayList();
            Intent type = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI).setType("image/*");
            C18450wi.A0B(type);
            arrayList.add(type);
            Intent A012 = AnonymousClass1yL.A01((IntentSender) null, (CharSequence) null, arrayList);
            C18450wi.A0B(A012);
            startActivityForResult(A012, i2 | 16);
        } else {
            int i3 = Build.VERSION.SDK_INT;
            int i4 = R.string.str1261;
            if (i3 < 30) {
                i4 = R.string.str1216;
            }
            RequestPermissionActivity.A0L(this, R.string.str1260, i4, i2 | 32);
        }
    }

    public final void A37(Uri uri, int i2) {
        int i3;
        RuntimeException runtimeException;
        Uri uri2 = uri;
        this.A0H[i2] = uri;
        LinearLayout linearLayout = this.A02;
        if (linearLayout == null) {
            C18450wi.A0O("screenshotsGroup");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        View childAt = linearLayout.getChildAt(i2);
        if (childAt != null) {
            C56992pb r2 = (C56992pb) childAt;
            if (uri != null) {
                Point point = new Point();
                getWindowManager().getDefaultDisplay().getSize(point);
                int i4 = point.x / 3;
                try {
                    C221516v r3 = this.A0D;
                    if (r3 != null) {
                        int i5 = i4 / 2;
                        WhatsAppLibLoader whatsAppLibLoader = this.A0E;
                        if (whatsAppLibLoader != null) {
                            r2.setScreenshot(r3.A03(uri2, i5, i4, whatsAppLibLoader.A03(), false));
                            return;
                        } else {
                            C18450wi.A0O("whatsAppLibLoader");
                            runtimeException = new RuntimeException("Redex: Unreachable code after no-return invoke");
                        }
                    } else {
                        C18450wi.A0O("mediaUtils");
                        runtimeException = new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                    throw runtimeException;
                } catch (IOException e2) {
                    Log.e(C18450wi.A06("InAppBugReporting/screenshot/io-exception ", uri), e2);
                    i3 = R.string.str0848;
                    Afg(i3);
                } catch (AnonymousClass20M e3) {
                    Log.e(C18450wi.A06("InAppBugReporting/screenshot/not-an-image ", uri), e3);
                    i3 = R.string.str0840;
                    Afg(i3);
                }
            } else {
                r2.A00();
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.obwhatsapp.inappbugreporting.view.AddScreenshotImageViewWithRemoveButton");
        }
    }

    public void APh(DialogInterface dialogInterface, int i2, int i3) {
        if (i3 == -3 || i3 == -2) {
            dialogInterface.dismiss();
        } else if (i3 == -1) {
            A35(3);
            dialogInterface.dismiss();
            finish();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if ((i2 & 16) == 16) {
            if (i3 == -1 && intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    try {
                        grantUriPermission("com.obwhatsapp", data, 1);
                    } catch (SecurityException e2) {
                        Log.w("InAppBugReporting/permission", e2);
                    }
                    A37(data, i2 - 16);
                    return;
                }
                Afg(R.string.str0848);
            }
        } else if ((i3 & 32) == 32 && i3 == -1) {
            A36(i2 - 32);
        }
    }

    public void onBackPressed() {
        if (!(((InAppBugReportingViewModel) this.A0I.getValue()).A04.A01() instanceof C76573uH)) {
            WaEditText waEditText = this.A07;
            if (waEditText == null) {
                C18450wi.A0O("describeBugField");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else if (C008603x.A04(String.valueOf(waEditText.getText())).toString().length() > 0) {
                C86204Rr A002 = C807645k.A00(new Object[0], R.string.str02b3);
                A002.A01 = R.string.str02b5;
                A002.A03 = R.string.str02b6;
                A002.A00().A1G(AGM(), (String) null);
                return;
            }
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        A35(2);
        setContentView((int) R.layout.layout004d);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            x2.A0J(getString(R.string.str140f));
        }
        View A052 = AnonymousClass00T.A05(this, R.id.screenshots_group);
        C18450wi.A0B(A052);
        LinearLayout linearLayout = (LinearLayout) A052;
        this.A02 = linearLayout;
        if (linearLayout == null) {
            C18450wi.A0O("screenshotsGroup");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        linearLayout.removeAllViews();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0528);
        int i3 = 0;
        do {
            i2 = i3 + 1;
            C56992pb r2 = new C56992pb(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int i4 = dimensionPixelSize;
            if (i3 == 0) {
                i4 = 0;
            }
            layoutParams.leftMargin = i4;
            layoutParams.rightMargin = dimensionPixelSize;
            layoutParams.topMargin = dimensionPixelSize;
            layoutParams.bottomMargin = dimensionPixelSize;
            LinearLayout linearLayout2 = this.A02;
            if (linearLayout2 == null) {
                C18450wi.A0O("screenshotsGroup");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            linearLayout2.addView(r2, layoutParams);
            r2.setOnClickListener(new ViewOnClickCListenerShape1S0101000_I0(this, i3, 8));
            r2.A02 = new C102554z8(this, i3);
            i3 = i2;
        } while (i2 < 3);
        View A053 = AnonymousClass00T.A05(this, R.id.submit_bug_info_text);
        C18450wi.A0B(A053);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) A053;
        this.A06 = textEmojiLabel;
        C17110uY r5 = this.A0F;
        if (r5 == null) {
            C18450wi.A0O("linkifier");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (textEmojiLabel == null) {
            C18450wi.A0O("submitBugInfoTextView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            SpannableStringBuilder A072 = r5.A07(new RunnableRunnableShape10S0100000_I0_9((Object) this, 0), textEmojiLabel.getText().toString(), "learn-more", R.color.color04ee);
            TextEmojiLabel textEmojiLabel2 = this.A06;
            if (textEmojiLabel2 == null) {
                C18450wi.A0O("submitBugInfoTextView");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            textEmojiLabel2.A07 = new AnonymousClass3MF();
            TextEmojiLabel textEmojiLabel3 = this.A06;
            if (textEmojiLabel3 == null) {
                C18450wi.A0O("submitBugInfoTextView");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            textEmojiLabel3.setText(A072);
            View A054 = AnonymousClass00T.A05(this, R.id.describe_problem_field);
            C18450wi.A0B(A054);
            this.A07 = (WaEditText) A054;
            View A055 = AnonymousClass00T.A05(this, R.id.describe_problem_field_error);
            C18450wi.A0B(A055);
            this.A08 = (WaTextView) A055;
            WaEditText waEditText = this.A07;
            if (waEditText == null) {
                C18450wi.A0O("describeBugField");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            waEditText.addTextChangedListener(new IDxWAdapterShape101S0100000_1_I0(this, 2));
            View A056 = AnonymousClass00T.A05(this, R.id.submit_btn);
            C18450wi.A0B(A056);
            Button button = (Button) A056;
            this.A09 = button;
            if (button == null) {
                C18450wi.A0O("submitButton");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            WaEditText waEditText2 = this.A07;
            if (waEditText2 == null) {
                C18450wi.A0O("describeBugField");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            Editable text = waEditText2.getText();
            boolean z2 = false;
            if (text != null && text.length() > 0) {
                z2 = true;
            }
            button.setEnabled(z2);
            Button button2 = this.A09;
            if (button2 == null) {
                C18450wi.A0O("submitButton");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            button2.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 26));
            C15220qW r3 = this.A0I;
            ((InAppBugReportingViewModel) r3.getValue()).A03.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 47));
            ((InAppBugReportingViewModel) r3.getValue()).A04.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 48));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18450wi.A0H(menuItem, 0);
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C18450wi.A0H(bundle, 0);
        super.onRestoreInstanceState(bundle);
        Parcelable[] parcelableArray = bundle.getParcelableArray("save_state_screenshots");
        if (parcelableArray != null) {
            int length = parcelableArray.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                Parcelable parcelable = parcelableArray[i2];
                i2++;
                int i4 = i3 + 1;
                if (parcelable != null) {
                    A37((Uri) parcelable, i3);
                }
                i3 = i4;
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18450wi.A0H(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray("save_state_screenshots", this.A0H);
    }
}
