package com.obwhatsapp.contact.picker;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass1BQ;
import X.AnonymousClass1L1;
import X.AnonymousClass1ZR;
import X.AnonymousClass29I;
import X.AnonymousClass2JH;
import X.AnonymousClass2Sy;
import X.AnonymousClass5RN;
import X.C001000l;
import X.C101374xD;
import X.C102564zA;
import X.C14710pd;
import X.C14750ph;
import X.C14870pt;
import X.C15860rz;
import X.C16030sJ;
import X.C16300so;
import X.C16320sq;
import X.C17020u3;
import X.C17130ua;
import X.C17230uk;
import X.C17250um;
import X.C17980vx;
import X.C19980zJ;
import X.C206711d;
import X.C23061Ai;
import X.C30931dC;
import X.C40651uT;
import X.C51292bO;
import X.C55642k5;
import X.C59122ui;
import X.C78533yE;
import X.C87664Ya;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape236S0100000_2_I0;
import com.facebook.redex.IDxEListenerShape200S0100000_2_I0;
import com.facebook.redex.IDxKListenerShape223S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class SharedTextPreviewDialogFragment extends Hilt_SharedTextPreviewDialogFragment {
    public View A00;
    public ImageButton A01;
    public C19980zJ A02;
    public C16300so A03;
    public C17130ua A04;
    public AnonymousClass1ZR A05;
    public C17230uk A06;
    public SharedTextPreviewScrollView A07;
    public C15860rz A08;
    public AnonymousClass2JH A09;
    public C206711d A0A;
    public C17250um A0B;
    public AnonymousClass1BQ A0C;
    public MentionableEntry A0D;
    public C17020u3 A0E;
    public C17980vx A0F;
    public AnonymousClass1L1 A0G;
    public C23061Ai A0H;
    public C16320sq A0I;
    public Runnable A0J = null;
    public String A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O = false;
    public boolean A0P = true;
    public final Handler A0Q = new Handler(Looper.getMainLooper());
    public final AnonymousClass5RN A0R = new IDxCListenerShape203S0100000_2_I0(this, 1);

    public static SharedTextPreviewDialogFragment A01(String str, List list, boolean z2) {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = new SharedTextPreviewDialogFragment();
        BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = new BaseSharedPreviewDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("jids", C16030sJ.A06(list));
        baseSharedPreviewDialogFragment.A0T(bundle);
        Bundle A042 = baseSharedPreviewDialogFragment.A04();
        A042.putString("message", str);
        A042.putBoolean("has_text_from_url", z2);
        sharedTextPreviewDialogFragment.A0T(A042);
        return sharedTextPreviewDialogFragment;
    }

    public static /* synthetic */ void A02(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        String trim = C40651uT.A05(sharedTextPreviewDialogFragment.A0D.getText().toString()).trim();
        boolean z2 = false;
        if (trim.length() <= 0) {
            sharedTextPreviewDialogFragment.A08.A09(R.string.str0dec, 0);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("has_text_from_url", sharedTextPreviewDialogFragment.A0N);
        WebPagePreviewView webPagePreviewView = sharedTextPreviewDialogFragment.A0F;
        if (webPagePreviewView != null && webPagePreviewView.getVisibility() == 0) {
            z2 = true;
        }
        bundle.putBoolean("load_preview", z2);
        List list = sharedTextPreviewDialogFragment.A0G;
        if (sharedTextPreviewDialogFragment.A0F.A00()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C16030sJ.A0Q((Jid) it.next())) {
                        sharedTextPreviewDialogFragment.A0G.A0B((Byte) null, 12, 2);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        sharedTextPreviewDialogFragment.A0B.AdS(bundle, trim, sharedTextPreviewDialogFragment.A0G);
        sharedTextPreviewDialogFragment.A1C();
    }

    public void A0x(int i2, int i3, Intent intent) {
        super.A0x(i2, i3, intent);
        if (i2 == 27 && i3 == -1) {
            C001000l A0C2 = A0C();
            if (A0C2 != null) {
                this.A02.A06(A0C(), C14750ph.A02(A0C2));
                A0C().finish();
            }
            A1C();
        }
    }

    public boolean A10(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (this.A09.isShowing()) {
                this.A09.dismiss();
            }
            A0D().getWindow().setSoftInputMode(2);
        }
        return super.A10(menuItem);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z2;
        String replaceFirst;
        super.A11(bundle, layoutInflater, viewGroup);
        this.A05.addView(A0D().getLayoutInflater().inflate(R.layout.layout055b, (ViewGroup) null, false));
        this.A07 = (SharedTextPreviewScrollView) this.A05.findViewById(R.id.subject_layout);
        this.A0D = (MentionableEntry) this.A05.findViewById(R.id.mentionable_entry);
        this.A00 = this.A05.findViewById(R.id.stub);
        AnonymousClass013 r0 = this.A02;
        MentionableEntry mentionableEntry = this.A0D;
        if (r0.A0T()) {
            mentionableEntry.setPadding(2, mentionableEntry.getPaddingTop(), mentionableEntry.getPaddingRight(), mentionableEntry.getPaddingBottom());
        } else {
            mentionableEntry.setPadding(mentionableEntry.getPaddingLeft(), mentionableEntry.getPaddingTop(), 2, mentionableEntry.getPaddingBottom());
        }
        this.A0D.addTextChangedListener(new C78533yE(this));
        this.A0D.setInputType(131073);
        ImageButton imageButton = (ImageButton) this.A05.findViewById(R.id.emoji_btn);
        this.A01 = imageButton;
        C001000l A0C2 = A0C();
        C14710pd r14 = this.A04;
        C23061Ai r11 = this.A0H;
        C16300so r8 = this.A03;
        C17250um r7 = this.A0B;
        C206711d r6 = this.A0A;
        AnonymousClass01V r5 = this.A0C;
        AnonymousClass013 r4 = this.A02;
        AnonymousClass1BQ r3 = this.A0C;
        AnonymousClass013 r23 = r4;
        C15860rz r22 = this.A08;
        AnonymousClass01V r21 = r5;
        MentionableEntry mentionableEntry2 = this.A0D;
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) this.A00.findViewById(R.id.emoji_edit_text_layout);
        C16300so r18 = r8;
        ImageButton imageButton2 = imageButton;
        AnonymousClass2JH r15 = new AnonymousClass2JH(A0C2, imageButton2, r18, keyboardPopupLayout, mentionableEntry2, r21, r22, r23, r6, r7, r3, r14, this.A0E, r11);
        this.A09 = r15;
        EmojiSearchContainer emojiSearchContainer = this.A0D;
        AnonymousClass29I r112 = new AnonymousClass29I(A0C(), this.A02, r15, this.A0A, this.A0B, emojiSearchContainer, this.A0E);
        r112.A00 = new IDxEListenerShape200S0100000_2_I0(this, 1);
        AnonymousClass2JH r2 = this.A09;
        r2.A0C(this.A0R);
        r2.A0E = new RunnableRunnableShape4S0200000_I0_2(this, 48, r112);
        String A012 = C30931dC.A01(this.A0M);
        if (A012 == null || (replaceFirst = this.A0M.replaceFirst(Pattern.quote(A012), "")) == null || !replaceFirst.trim().isEmpty()) {
            z2 = true;
        } else {
            StringBuilder sb = new StringBuilder("\n\n");
            sb.append(this.A0M);
            this.A0M = sb.toString();
            z2 = false;
        }
        A1N();
        this.A0D.setText(AnonymousClass2Sy.A05(A0C(), this.A0B, this.A0M));
        A1Q(this.A0D.getText(), true);
        this.A0D.requestFocus();
        Window window = this.A03.getWindow();
        AnonymousClass00B.A06(window);
        window.setSoftInputMode(5);
        MentionableEntry mentionableEntry3 = this.A0D;
        mentionableEntry3.setSelection(z2 ? mentionableEntry3.getText().length() : 0);
        SharedTextPreviewScrollView sharedTextPreviewScrollView = this.A07;
        sharedTextPreviewScrollView.A00 = new C101374xD(this);
        sharedTextPreviewScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 10));
        this.A07.getViewTreeObserver().addOnScrollChangedListener(new IDxCListenerShape236S0100000_2_I0(this, 1));
        this.A07.setOverScrollMode(2);
        this.A03.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 27));
        this.A03.setOnKeyListener(new IDxKListenerShape223S0100000_2_I0(this, 1));
        A1O();
        return this.A00;
    }

    public Dialog A1B(Bundle bundle) {
        Bundle A042 = A04();
        String string = A042.getString("message");
        AnonymousClass00B.A07(string, "null message");
        this.A0M = string;
        boolean z2 = A042.getBoolean("has_text_from_url");
        AnonymousClass00B.A07(Boolean.valueOf(z2), "null hasTextFromUrl");
        this.A0N = z2;
        return super.A1B(bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 != 0) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1O() {
        /*
            r5 = this;
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r5.A0F
            if (r0 == 0) goto L_0x000d
            int r0 = r0.getVisibility()
            r1 = 2131167038(0x7f07073e, float:1.7948338E38)
            if (r0 == 0) goto L_0x0010
        L_0x000d:
            r1 = 2131167039(0x7f07073f, float:1.794834E38)
        L_0x0010:
            X.00l r0 = r5.A0D()
            android.content.res.Resources r0 = r0.getResources()
            int r3 = r0.getDimensionPixelSize(r1)
            com.obwhatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A07
            int r0 = r0.getPaddingBottom()
            if (r0 == r3) goto L_0x0039
            com.obwhatsapp.contact.picker.SharedTextPreviewScrollView r4 = r5.A07
            int r2 = r4.getPaddingLeft()
            com.obwhatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A07
            int r1 = r0.getPaddingTop()
            com.obwhatsapp.contact.picker.SharedTextPreviewScrollView r0 = r5.A07
            int r0 = r0.getPaddingRight()
            r4.setPadding(r2, r1, r0, r3)
        L_0x0039:
            r0 = 2
            int[] r2 = new int[r0]
            int[] r1 = new int[r0]
            android.view.View r0 = r5.A00
            r0.getLocationOnScreen(r2)
            android.widget.RelativeLayout r0 = r5.A06
            r0.getLocationOnScreen(r1)
            r0 = 1
            r1 = r1[r0]
            r0 = r2[r0]
            int r1 = r1 - r0
            if (r1 >= r3) goto L_0x0055
            r0 = 0
            int r3 = java.lang.Math.max(r0, r1)
        L_0x0055:
            android.widget.ImageButton r0 = r5.A01
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r0)
            r2.bottomMargin = r3
            r0 = 9
            r2.addRule(r0)
            r1 = 8
            r0 = 2131366500(0x7f0a1264, float:1.8352895E38)
            r2.addRule(r1, r0)
            android.widget.ImageButton r0 = r5.A01
            r0.setLayoutParams(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment.A1O():void");
    }

    public final void A1P() {
        ViewGroup viewGroup;
        if (this.A0F != null && (viewGroup = this.A02) != null && viewGroup.getVisibility() == 0 && !this.A0O) {
            this.A0O = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) this.A02.getHeight());
            translateAnimation.setDuration(150);
            translateAnimation.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 7));
            this.A0F.startAnimation(translateAnimation);
        }
    }

    public final void A1Q(Editable editable, boolean z2) {
        String A012 = C30931dC.A01(editable.toString());
        this.A0L = A012;
        if (A012 == null || A012.equals(this.A0K)) {
            A1R((AnonymousClass1ZR) null);
            return;
        }
        this.A0K = null;
        AnonymousClass1ZR r0 = this.A05;
        if (r0 == null || !TextUtils.equals(r0.A0W, A012)) {
            A1R(C87664Ya.A00(A012));
            if (this.A05 == null) {
                Runnable runnable = this.A0J;
                if (runnable != null) {
                    this.A0Q.removeCallbacks(runnable);
                    this.A0J = null;
                }
                if (z2) {
                    C14870pt r1 = this.A08;
                    C16320sq r5 = this.A0I;
                    C51292bO.A00(r1, new AnonymousClass1ZR(this.A04, A012), this.A02, new C102564zA(this), r5, A012, false);
                    return;
                }
                RunnableRunnableShape0S1100000_I0 runnableRunnableShape0S1100000_I0 = new RunnableRunnableShape0S1100000_I0(29, A012, this);
                this.A0J = runnableRunnableShape0S1100000_I0;
                this.A0Q.postDelayed(runnableRunnableShape0S1100000_I0, 700);
            }
        }
    }

    public final void A1R(AnonymousClass1ZR r11) {
        C55642k5 r1;
        if (A0C() != null) {
            if (r11 != null) {
                if (!TextUtils.equals(this.A0L, r11.A0W)) {
                    return;
                }
                if (r11.A0F()) {
                    this.A05 = r11;
                    if (this.A0F == null) {
                        WebPagePreviewView webPagePreviewView = new WebPagePreviewView(A0D());
                        this.A0F = webPagePreviewView;
                        webPagePreviewView.setForeground((Drawable) null);
                        this.A0F.setMinimumHeight(A03().getDimensionPixelSize(R.dimen.dimen0740));
                        this.A0F.setImageContentBackgroundResource(0);
                        this.A0F.setImageContentEnabled(false);
                        this.A02.addView(this.A0F);
                        this.A0F.A01();
                        this.A0F.setImageProgressBarVisibility(false);
                        this.A0F.setImageContentMinimumHeight(A03().getDimensionPixelSize(R.dimen.dimen04c6));
                        this.A0F.setImageCancelClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 13));
                        AnonymousClass1ZR r0 = this.A05;
                        if (!(r0 == null || (r1 = r0.A09) == null || r1.A02 == null)) {
                            String str = r1.A01;
                            if ("video/mp4".equals(str) || "image/gif".equals(str)) {
                                this.A0F.setImageContentEnabled(true);
                            }
                        }
                        this.A0F.setImageContentClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 14));
                    }
                    A1O();
                    if (!(this.A02.getVisibility() == 0 || this.A0F == null || this.A0O)) {
                        this.A0O = true;
                        int[] iArr = {0, 0};
                        this.A0D.getLocationOnScreen(iArr);
                        int height = iArr[1] + this.A0D.getHeight();
                        int[] iArr2 = {0, 0};
                        this.A00.findViewById(R.id.recipients_container).getLocationOnScreen(iArr2);
                        int i2 = iArr2[1];
                        int abs = Math.abs(height - i2);
                        int dimensionPixelSize = A03().getDimensionPixelSize(R.dimen.dimen0740) - A03().getDimensionPixelSize(R.dimen.dimen0741);
                        if (abs > dimensionPixelSize || (i2 == 0 && height == 0)) {
                            A1N();
                            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) this.A02.getHeight(), 0.0f);
                            translateAnimation.setDuration(150);
                            translateAnimation.setDuration(150);
                            this.A02.setVisibility(0);
                            this.A01.setVisibility(0);
                            this.A0F.startAnimation(translateAnimation);
                        } else {
                            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-dimensionPixelSize));
                            translateAnimation2.setDuration(150);
                            translateAnimation2.setAnimationListener(new C59122ui(this));
                            this.A07.startAnimation(translateAnimation2);
                        }
                        this.A0O = false;
                    }
                    this.A0D.requestFocus();
                    WebPagePreviewView webPagePreviewView2 = this.A0F;
                    AnonymousClass00B.A04(webPagePreviewView2);
                    webPagePreviewView2.A08(r11, (List) null, false, this.A06.A0A());
                    return;
                }
            }
            this.A05 = null;
            A1P();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C001000l A0C2 = A0C();
        if (A0C2 != null) {
            A0C2.getWindow().setSoftInputMode(3);
        }
        super.onDismiss(dialogInterface);
    }
}
