package com.obwhatsapp.profile;

import X.AnonymousClass00F;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass121;
import X.AnonymousClass152;
import X.AnonymousClass15P;
import X.AnonymousClass1A8;
import X.AnonymousClass1NO;
import X.AnonymousClass27A;
import X.AnonymousClass2AD;
import X.AnonymousClass2Rf;
import X.AnonymousClass55O;
import X.C005402i;
import X.C018508q;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14870pt;
import X.C15450qv;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16010sH;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C17140ub;
import X.C17160ud;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C211212w;
import X.C211613a;
import X.C23061Ai;
import X.C23071Aj;
import X.C24561Gk;
import X.C28881Zb;
import X.C33481ie;
import X.C455529g;
import X.C45902Bo;
import X.C49132Rg;
import X.C70703ha;
import X.C70713hb;
import X.C70723hc;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxLAdapterShape0S0210000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.obwhatsapp.PushnameEmojiBlacklistDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;

public class ProfileInfoActivity extends C14530pL implements AnonymousClass2AD {
    public Handler A00;
    public View A01;
    public View A02;
    public ImageView A03;
    public C211212w A04;
    public C17160ud A05;
    public C17140ub A06;
    public AnonymousClass152 A07;
    public C16010sH A08;
    public C16490t9 A09;
    public WhatsAppLibLoader A0A;
    public C211613a A0B;
    public AnonymousClass121 A0C;
    public ProfileSettingsRowIconText A0D;
    public ProfileSettingsRowIconText A0E;
    public AnonymousClass1A8 A0F;
    public Runnable A0G;
    public boolean A0H;
    public boolean A0I;
    public final C33481ie A0J;

    public ProfileInfoActivity() {
        this(0);
        this.A0J = new IDxCObserverShape68S0100000_2_I0(this, 24);
    }

    public ProfileInfoActivity(int i2) {
        this.A0I = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 68));
    }

    public static /* synthetic */ void A03(ProfileInfoActivity profileInfoActivity) {
        ProfileInfoActivity profileInfoActivity2 = profileInfoActivity;
        if (profileInfoActivity.A0H) {
            int statusBarColor = C15450qv.A03() ? profileInfoActivity.getWindow().getStatusBarColor() : 0;
            int navigationBarColor = C15450qv.A07() ? profileInfoActivity.getWindow().getNavigationBarColor() : 0;
            C16040sK r0 = profileInfoActivity.A01;
            r0.A0B();
            profileInfoActivity2.startActivity(C14750ph.A0U(profileInfoActivity2, r0.A05, (String) null, 0.0f, statusBarColor, 0, navigationBarColor, 0, true), C455529g.A05(profileInfoActivity2, profileInfoActivity2.A03, profileInfoActivity2.getApplicationContext().getResources().getString(R.string.str1dd7)));
            return;
        }
        profileInfoActivity.A0C.A06(profileInfoActivity, profileInfoActivity.A08, 12);
    }

    public void A1q() {
        if (!this.A0I) {
            this.A0I = true;
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
            this.A04 = (C211212w) r1.AG4.get();
            this.A09 = (C16490t9) r1.AQz.get();
            this.A0B = (C211613a) r1.A1E.get();
            this.A05 = (C17160ud) r1.A4t.get();
            this.A0F = (AnonymousClass1A8) r1.AKL.get();
            this.A06 = (C17140ub) r1.A4y.get();
            this.A0A = (WhatsAppLibLoader) r1.AR7.get();
            this.A0C = (AnonymousClass121) r1.AJY.get();
            this.A07 = (AnonymousClass152) r1.A51.get();
        }
    }

    public final void A35() {
        this.A02.setVisibility(8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0629);
        C16040sK r0 = this.A01;
        r0.A0B();
        boolean A002 = AnonymousClass27A.A00(r0.A05);
        ImageView imageView = this.A03;
        if (A002) {
            imageView.setEnabled(false);
            this.A02.setVisibility(0);
        } else {
            imageView.setEnabled(true);
            this.A02.setVisibility(4);
        }
        Bitmap A003 = this.A07.A00(this, this.A08, -1.0f, dimensionPixelSize);
        if (A003 == null) {
            C16010sH r1 = this.A08;
            if (r1.A05 == 0 && r1.A04 == 0) {
                this.A02.setVisibility(0);
                Handler handler = this.A00;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    this.A00 = handler;
                    this.A0G = new RunnableRunnableShape12S0100000_I0_11((Object) this, 26);
                }
                handler.removeCallbacks(this.A0G);
                this.A00.postDelayed(this.A0G, AnonymousClass1NO.A0L);
            } else {
                this.A02.setVisibility(4);
            }
            A003 = C17160ud.A00(this, -1.0f, R.drawable.avatar_contact, dimensionPixelSize);
            this.A0H = false;
        } else {
            this.A0H = true;
        }
        this.A03.setImageBitmap(A003);
    }

    public final void A36(Runnable runnable) {
        View view = this.A01;
        if (view == null) {
            runnable.run();
        } else {
            view.animate().scaleX(0.0f).scaleY(0.0f).setDuration(125).setListener(new IDxLAdapterShape0S0210000_2_I0(this, runnable));
        }
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    public void ANi(String str) {
        Afc(PushnameEmojiBlacklistDialogFragment.A01(str));
    }

    public void AQG(int i2, String str) {
        if (i2 == 0 && str.length() != 0) {
            this.A05.Acl(new RunnableRunnableShape0S1100000_I0(35, str, this));
            this.A0D.setSubText(str);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        switch (i2) {
            case 12:
                if (i3 == -1) {
                    if (intent != null) {
                        if (intent.getBooleanExtra("is_reset", false)) {
                            this.A02.setVisibility(0);
                            this.A0C.A08(this.A08);
                        } else if (intent.getBooleanExtra("skip_cropping", false)) {
                            this.A0C.A01.A0N("tmpi").delete();
                            if (this.A0C.A0A(this.A08)) {
                                A35();
                            }
                        }
                    }
                    this.A0C.A04(intent, this, 13);
                }
                if (((double) this.A01.getScaleX()) == 0.0d && ((double) this.A01.getScaleY()) == 0.0d) {
                    this.A01.animate().scaleX(1.0f).scaleY(1.0f).setDuration(125);
                    return;
                }
                return;
            case 13:
                this.A0C.A01.A0N("tmpi").delete();
                if (i3 == -1) {
                    if (this.A0C.A0A(this.A08)) {
                        A35();
                        return;
                    }
                    return;
                } else if (i3 == 0 && intent != null) {
                    this.A0C.A03(intent, this);
                    return;
                } else {
                    return;
                }
            case 14:
                if (i3 == -1) {
                    this.A0D.setSubText(this.A01.A07());
                    return;
                }
                return;
            default:
                super.onActivityResult(i2, i3, intent);
                return;
        }
    }

    public void onBackPressed() {
        RunnableRunnableShape12S0100000_I0_11 runnableRunnableShape12S0100000_I0_11 = new RunnableRunnableShape12S0100000_I0_11((Object) this, 27);
        if (C455529g.A00) {
            A36(runnableRunnableShape12S0100000_I0_11);
        } else {
            runnableRunnableShape12S0100000_I0_11.run();
        }
    }

    public void onCreate(Bundle bundle) {
        if (C455529g.A00) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(200);
            changeBounds.setInterpolator(new C018508q());
            changeBounds.excludeTarget(16908335, true);
            changeBounds.excludeTarget(16908336, true);
            changeBounds.excludeTarget(R.id.action_bar_container, true);
            window.setSharedElementEnterTransition(changeBounds);
            window.setSharedElementExitTransition(changeBounds);
            Fade fade = new Fade();
            Fade fade2 = new Fade();
            fade.setDuration(220);
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            fade.excludeTarget(R.id.action_bar_container, true);
            fade.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade2.setDuration(240);
            fade2.excludeTarget(16908335, true);
            fade2.excludeTarget(16908336, true);
            fade2.excludeTarget(R.id.action_bar_container, true);
            fade2.excludeTarget(R.id.catalog_image_list_toolbar, true);
            window.setEnterTransition(fade);
            window.setReturnTransition(fade2);
        }
        super.onCreate(bundle);
        if (!this.A0A.A03()) {
            Log.i("aborting due to native libraries missing");
        } else {
            setContentView((int) R.layout.layout04db);
            C005402i x2 = x();
            if (x2 != null) {
                x2.A0N(true);
            }
            C16040sK r0 = this.A01;
            r0.A0B();
            C28881Zb r02 = r0.A01;
            this.A08 = r02;
            if (r02 == null) {
                Log.i("profileinfo/create/no-me");
                startActivity(C14750ph.A04(this));
            } else {
                ProfileSettingsRowIconText profileSettingsRowIconText = (ProfileSettingsRowIconText) findViewById(R.id.profile_info_name_card);
                this.A0D = profileSettingsRowIconText;
                profileSettingsRowIconText.setSubText(this.A01.A07());
                this.A0D.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 25));
                ImageView imageView = (ImageView) findViewById(R.id.photo_btn);
                this.A03 = imageView;
                imageView.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 26));
                View findViewById = findViewById(R.id.change_photo_btn);
                this.A01 = findViewById;
                findViewById.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 24));
                if (Build.VERSION.SDK_INT >= 21 && bundle == null) {
                    Transition sharedElementEnterTransition = getWindow().getSharedElementEnterTransition();
                    getWindow().setSharedElementExitTransition(sharedElementEnterTransition.clone());
                    getWindow().setSharedElementReenterTransition(sharedElementEnterTransition.clone());
                    getWindow().setSharedElementReturnTransition(sharedElementEnterTransition.clone());
                    this.A01.setScaleX(0.0f);
                    this.A01.setScaleY(0.0f);
                    this.A01.setVisibility(0);
                    getWindow().getSharedElementEnterTransition().addListener(new C70703ha(this));
                    getWindow().getSharedElementExitTransition().addListener(new C70713hb(this));
                    getWindow().getSharedElementReenterTransition().addListener(new C70723hc(this));
                }
                this.A02 = findViewById(R.id.change_photo_progress);
                A35();
                ProfileSettingsRowIconText profileSettingsRowIconText2 = (ProfileSettingsRowIconText) findViewById(R.id.profile_phone_info);
                C45902Bo.A03(profileSettingsRowIconText2.A00);
                profileSettingsRowIconText2.setSubText(C24561Gk.A01(this.A08));
                if (!this.A01.A0G()) {
                    profileSettingsRowIconText2.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 25));
                }
                ProfileSettingsRowIconText profileSettingsRowIconText3 = (ProfileSettingsRowIconText) findViewById(R.id.profile_info_status_card);
                this.A0E = profileSettingsRowIconText3;
                profileSettingsRowIconText3.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 26));
                this.A0E.setSubText(this.A04.A00());
                this.A06.A02(this.A0J);
                if ("android.intent.action.ATTACH_DATA".equals(getIntent().getAction())) {
                    setTitle(R.string.str1d89);
                    this.A0C.A04(getIntent(), this, 13);
                } else {
                    setTitle(R.string.str15b6);
                }
                this.A0B.A01(4);
                return;
            }
        }
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0B.A00(4);
        this.A06.A03(this.A0J);
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(this.A0G);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (C455529g.A00) {
            A36(new AnonymousClass55O(this));
            return true;
        }
        finish();
        return true;
    }
}
