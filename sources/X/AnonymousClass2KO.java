package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape322S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape338S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape381S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaPreferenceFragment;
import com.obwhatsapp.dialogs.FAQLearnMoreDialogFragment;
import com.obwhatsapp.settings.SettingsChatHistoryFragment;
import com.obwhatsapp.settings.SettingsJidNotificationFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2KO  reason: invalid class name */
public class AnonymousClass2KO extends AnonymousClass2KP implements C14600pS {
    public int A00;
    public int A01;
    public long A02;
    public ProgressDialog A03;
    public Intent A04;
    public C14870pt A05;
    public WaPreferenceFragment A06;
    public Integer A07;
    @Deprecated
    public String A08;
    public boolean A09 = true;
    public boolean A0A;
    public final AnonymousClass1D2 A0B = new IDxCListenerShape322S0100000_2_I0(this, 0);

    public boolean AIm() {
        return AnonymousClass29T.A03(this);
    }

    public void Ac1() {
        this.A03 = null;
        AnonymousClass29T.A00(this, 501);
    }

    public void Afb(DialogFragment dialogFragment, String str) {
        throw new IllegalStateException("Unsupported operation");
    }

    public void Afc(DialogFragment dialogFragment) {
        throw new IllegalStateException("Unsupported operation");
    }

    public void Afg(int i2) {
        this.A00 = i2;
        AnonymousClass29T.A01(this, 500);
    }

    @Deprecated
    public void Afh(String str) {
        this.A08 = str;
        AnonymousClass29T.A01(this, 500);
    }

    public void Afi(AnonymousClass2Sv r2, Object[] objArr, int i2, int i3, int i4) {
        Afj(objArr, i2, i3);
    }

    public void Afj(Object[] objArr, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        AnonymousClass29T.A01(this, 500);
    }

    public void Afr(int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
        AnonymousClass29T.A01(this, 501);
    }

    public void AhY(String str) {
        ProgressDialog progressDialog = this.A03;
        if (progressDialog != null) {
            progressDialog.setMessage(str);
        }
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A1S().A0F(view, layoutParams);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return (this.A09 || SystemClock.elapsedRealtime() - this.A02 > 500 || !(motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 2)) && super.dispatchTouchEvent(motionEvent);
    }

    public void onBackPressed() {
        if (this.A09) {
            super.onBackPressed();
        } else {
            Log.e("dialogtoasttreferenceactivity/onbackpressed/activity no active");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.A01.A0M();
        super.onConfigurationChanged(configuration);
        A1S().A0C(configuration);
    }

    public void onCreate(Bundle bundle) {
        this.A0A = false;
        C45902Bo.A0B(getWindow(), this.A01);
        getTheme().applyStyle(R.style.style01d1, true);
        getLayoutInflater().setFactory2(new C93864jt(A1S()));
        A1S().A0D(bundle);
        super.onCreate(bundle);
        View findViewById = findViewById(16908298);
        if (findViewById != null) {
            int paddingLeft = findViewById.getPaddingLeft();
            int paddingLeft2 = findViewById.getPaddingLeft();
            ViewParent parent = findViewById.getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                paddingLeft += view.getPaddingLeft();
                paddingLeft2 += view.getPaddingRight();
                view.setPadding(0, 0, 0, 0);
            }
            findViewById.setPadding(paddingLeft, 0, paddingLeft2, 0);
            findViewById.setScrollBarStyle(33554432);
        }
        AnonymousClass013 r0 = this.A01;
        r0.A0B.add(this.A0B);
    }

    public Dialog onCreateDialog(int i2) {
        SettingsChatHistoryFragment settingsChatHistoryFragment;
        AnonymousClass2KO r8;
        C005302h r2;
        C15830rv r1;
        if (i2 == 500) {
            C32241fu r4 = new C32241fu(this);
            r4.A06(TextUtils.isEmpty(this.A08) ? getString(this.A00) : this.A08);
            r4.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 8));
            int i3 = this.A01;
            if (i3 != 0) {
                r4.A02(i3);
            }
            return r4.create();
        } else if (i2 != 501) {
            WaPreferenceFragment waPreferenceFragment = this.A06;
            if (waPreferenceFragment instanceof SettingsJidNotificationFragment) {
                SettingsJidNotificationFragment settingsJidNotificationFragment = (SettingsJidNotificationFragment) waPreferenceFragment;
                if (i2 == 0) {
                    return FAQLearnMoreDialogFragment.A02(settingsJidNotificationFragment.A00, settingsJidNotificationFragment.A00, settingsJidNotificationFragment.A03, settingsJidNotificationFragment.A06, settingsJidNotificationFragment.A0J(R.string.str12ea), "26000003", (String) null, (String) null);
                }
            } else if ((waPreferenceFragment instanceof SettingsChatHistoryFragment) && (r8 = settingsChatHistoryFragment.A00) != null) {
                boolean z2 = false;
                if (i2 != 3) {
                    if (i2 == 4) {
                        IDxCListenerShape338S0100000_2_I0 iDxCListenerShape338S0100000_2_I0 = new IDxCListenerShape338S0100000_2_I0(settingsChatHistoryFragment, 1);
                        C25721Kw r3 = settingsChatHistoryFragment.A0A;
                        Context A0u = settingsChatHistoryFragment.A0u();
                        r2 = r3.A09() ? r3.A05(A0u, new IDxCListenerShape381S0100000_2_I0(iDxCListenerShape338S0100000_2_I0, 1), -1, 0, 0, false) : r3.A04(A0u, iDxCListenerShape338S0100000_2_I0, A0u.getString(R.string.str0685), -1, false);
                    } else if (i2 == 5) {
                        if (settingsChatHistoryFragment.A05.A02() > 0) {
                            z2 = true;
                        }
                        C91234fa r12 = new C91234fa(settingsChatHistoryFragment, z2);
                        r2 = new C32241fu(settingsChatHistoryFragment.A0u());
                        int i4 = R.string.str1869;
                        if (z2) {
                            i4 = R.string.str00fa;
                        }
                        r2.A01(i4);
                        r2.setPositiveButton(R.string.str0e87, r12);
                        r2.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
                    } else if (i2 == 10 && (r1 = settingsChatHistoryFragment.A09) != null) {
                        C16010sH A0A2 = settingsChatHistoryFragment.A04.A0A(r1);
                        AnonymousClass1M1 r13 = settingsChatHistoryFragment.A06;
                        AnonymousClass2KO r0 = settingsChatHistoryFragment.A00;
                        return r13.A00(r0, r0, A0A2);
                    }
                    return r2.create();
                }
                IDxCListenerShape381S0100000_2_I0 iDxCListenerShape381S0100000_2_I0 = new IDxCListenerShape381S0100000_2_I0(settingsChatHistoryFragment, 0);
                C25721Kw r7 = (settingsChatHistoryFragment = (SettingsChatHistoryFragment) waPreferenceFragment).A0A;
                C005702l create = (r7.A09() ? r7.A05(r8, iDxCListenerShape381S0100000_2_I0, -1, 3, 1, true) : r7.A06(r8, iDxCListenerShape381S0100000_2_I0, r8.getString(R.string.str0461), -1, false)).create();
                create.show();
                return create;
            }
            return super.onCreateDialog(i2);
        } else {
            ProgressDialog progressDialog = new ProgressDialog(this);
            int i5 = this.A01;
            if (i5 != 0) {
                progressDialog.setTitle(i5);
            }
            progressDialog.setMessage(getString(this.A00));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            this.A03 = progressDialog;
            return progressDialog;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        A1S().A08();
        AnonymousClass013 r0 = this.A01;
        r0.A0B.remove(this.A0B);
        this.A04 = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        this.A05.A0B(this);
        super.onPause();
        this.A09 = false;
        this.A02 = SystemClock.elapsedRealtime();
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((AnonymousClass06G) A1S()).A0M();
    }

    public void onPostResume() {
        super.onPostResume();
        AnonymousClass06G r0 = (AnonymousClass06G) A1S();
        r0.A0O();
        C005402i r1 = r0.A0B;
        if (r1 != null) {
            r1.A0R(true);
        }
    }

    public void onPrepareDialog(int i2, Dialog dialog) {
        if (i2 != 500) {
            super.onPrepareDialog(i2, dialog);
            return;
        }
        C005702l r4 = (C005702l) dialog;
        String string = TextUtils.isEmpty(this.A08) ? getString(this.A00) : this.A08;
        C06490Wi r0 = r4.A00;
        r0.A0Q = string;
        TextView textView = r0.A0K;
        if (textView != null) {
            textView.setText(string);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A08 = bundle.getString("dialogToastMessage");
        this.A00 = bundle.getInt("dialogToastMessageId", 0);
        this.A01 = bundle.getInt("dialogToastTitleId", 0);
    }

    public void onResume() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(".onResume");
        Log.i(sb.toString());
        if (this.A0A) {
            this.A0A = false;
            finish();
            startActivity(getIntent());
        }
        super.onResume();
        this.A05.A0D(this);
        this.A09 = true;
        Intent intent = this.A04;
        if (intent != null) {
            Integer num = this.A07;
            if (num != null) {
                startActivityForResult(intent, num.intValue());
            } else {
                startActivity(intent);
            }
            this.A04 = null;
            this.A07 = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(".onSaveInstanceState");
        Log.i(sb.toString());
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("dialogToastMessage", this.A08);
        bundle.putInt("dialogToastMessageId", this.A00);
        bundle.putInt("dialogToastTitleId", this.A01);
    }

    public void onStop() {
        super.onStop();
        A1S().A09();
    }

    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        A1S().A0H(charSequence);
    }

    public void setContentView(int i2) {
        Toolbar toolbar = (Toolbar) getLayoutInflater().inflate(R.layout.layout05b7, (ViewGroup) null, false);
        toolbar.setTitle(getTitle());
        if (Build.VERSION.SDK_INT >= 21) {
            toolbar.setElevation(getResources().getDimension(R.dimen.dimen005d));
        }
        boolean A0T = this.A01.A0T();
        int i3 = R.drawable.abc_ic_ab_back_material;
        if (A0T) {
            i3 = R.drawable.ic_back_rtl;
        }
        toolbar.setNavigationIcon(i3);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.addView(toolbar, -1, getResources().getDimensionPixelSize(R.dimen.dimen0002));
        FrameLayout frameLayout = new FrameLayout(this);
        getLayoutInflater().inflate(i2, frameLayout, true);
        linearLayout.addView(frameLayout, -1, -1);
        setContentView((View) linearLayout);
        Aem(toolbar);
        toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 2));
    }

    public void setContentView(View view) {
        A1S().A0E(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A1S().A0G(view, layoutParams);
    }
}
