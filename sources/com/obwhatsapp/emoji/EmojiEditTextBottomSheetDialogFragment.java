package com.obwhatsapp.emoji;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass1BQ;
import X.AnonymousClass29I;
import X.AnonymousClass2AD;
import X.AnonymousClass2JH;
import X.AnonymousClass2Sy;
import X.AnonymousClass35O;
import X.AnonymousClass5RN;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C14870pt;
import X.C15860rz;
import X.C16300so;
import X.C17020u3;
import X.C17250um;
import X.C206711d;
import X.C23061Ai;
import X.C45902Bo;
import X.C93744jh;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape204S0100000_2_I1;
import com.facebook.redex.IDxEListenerShape201S0100000_2_I1;
import com.facebook.redex.IDxSListenerShape247S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import java.util.ArrayList;

public class EmojiEditTextBottomSheetDialogFragment extends Hilt_EmojiEditTextBottomSheetDialogFragment {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ImageButton A06;
    public C16300so A07;
    public C14870pt A08;
    public WaButton A09;
    public WaEditText A0A;
    public AnonymousClass01V A0B;
    public C15860rz A0C;
    public AnonymousClass013 A0D;
    public AnonymousClass2AD A0E;
    public AnonymousClass2JH A0F;
    public C206711d A0G;
    public C17250um A0H;
    public AnonymousClass1BQ A0I;
    public C14710pd A0J;
    public C17020u3 A0K;
    public C23061Ai A0L;
    public String A0M;
    public String A0N;
    public boolean A0O;
    public boolean A0P;
    public String[] A0Q;
    public final AnonymousClass5RN A0R = new IDxCListenerShape204S0100000_2_I1(this, 1);

    public static EmojiEditTextBottomSheetDialogFragment A01(String str, String[] strArr, int i2, int i3, int i4, int i5, int i6) {
        EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment = new EmojiEditTextBottomSheetDialogFragment();
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putInt("dialogId", i2);
        A0D2.putInt("titleResId", i3);
        A0D2.putInt("hintResId", 0);
        A0D2.putInt("emptyErrorResId", i4);
        A0D2.putString("defaultStr", str);
        A0D2.putInt("maxLength", i5);
        A0D2.putInt("inputType", i6);
        A0D2.putStringArray("codepointBlacklist", strArr);
        A0D2.putBoolean("shouldHideEmojiBtn", false);
        A0D2.putString("supportedDigits", (String) null);
        emojiEditTextBottomSheetDialogFragment.A0T(A0D2);
        return emojiEditTextBottomSheetDialogFragment;
    }

    public void A0k() {
        super.A0k();
        this.A0E = null;
    }

    public void A0s(Bundle bundle) {
        super.A0s(bundle);
        boolean A002 = C23061Ai.A00(this.A0A);
        this.A0O = A002;
        bundle.putBoolean("is_keyboard_showing", A002);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = A0D().getLayoutInflater().inflate(R.layout.layout024e, (ViewGroup) null, false);
        TextView A0M2 = C13680ns.A0M(inflate, R.id.dialog_title_tv);
        int i2 = this.A05;
        if (i2 != 0) {
            A0M2.setText(i2);
        }
        this.A0A = (WaEditText) inflate.findViewById(R.id.edit_text);
        TextView A0M3 = C13680ns.A0M(inflate, R.id.counter_tv);
        C45902Bo.A0C(this.A0A, this.A0D);
        if (this.A04 > 0) {
            A0M3.setVisibility(0);
        }
        ArrayList A0u = AnonymousClass000.A0u();
        int i3 = this.A04;
        if (i3 > 0) {
            A0u.add(new C93744jh(i3));
        }
        if (!A0u.isEmpty()) {
            this.A0A.setFilters((InputFilter[]) A0u.toArray(new InputFilter[0]));
        }
        WaEditText waEditText = this.A0A;
        waEditText.addTextChangedListener(new AnonymousClass35O(waEditText, A0M3, this.A0B, this.A0D, this.A0H, this.A0K, this.A04, 0, false));
        this.A09 = (WaButton) inflate.findViewById(R.id.save_button);
        this.A0A.setInputType(this.A03);
        if (!TextUtils.isEmpty(this.A0N)) {
            this.A0A.setKeyFilter(this.A0N);
        }
        this.A0A.A04(true);
        Window window = this.A03.getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.getDecorView().setSystemUiVisibility(1280);
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        this.A03.getWindow().setAttributes(attributes);
        C13680ns.A17(this.A09, this, 47);
        C13680ns.A17(inflate.findViewById(R.id.cancel_button), this, 46);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) inflate.findViewById(R.id.emoji_edit_text_layout);
        keyboardPopupLayout.A07 = true;
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.emoji_btn);
        this.A06 = imageButton;
        C001000l A0C2 = A0C();
        C14710pd r14 = this.A0J;
        C23061Ai r11 = this.A0L;
        C16300so r10 = this.A07;
        C17250um r9 = this.A0H;
        C206711d r8 = this.A0G;
        AnonymousClass01V r7 = this.A0B;
        AnonymousClass013 r6 = this.A0D;
        AnonymousClass1BQ r5 = this.A0I;
        AnonymousClass1BQ r26 = r5;
        C17250um r25 = r9;
        C206711d r24 = r8;
        AnonymousClass013 r23 = r6;
        C15860rz r22 = this.A0C;
        AnonymousClass01V r21 = r7;
        WaEditText waEditText2 = this.A0A;
        KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
        C16300so r18 = r10;
        ImageButton imageButton2 = imageButton;
        this.A0F = new AnonymousClass2JH(A0C2, imageButton2, r18, keyboardPopupLayout2, waEditText2, r21, r22, r23, r24, r25, r26, r14, this.A0K, r11);
        AnonymousClass2JH r62 = this.A0F;
        C001000l A0C3 = A0C();
        C17250um r82 = this.A0H;
        new AnonymousClass29I(A0C3, this.A0D, r62, this.A0G, r82, (EmojiSearchContainer) inflate.findViewById(R.id.emoji_search_container), this.A0K).A00 = new IDxEListenerShape201S0100000_2_I1(this, 1);
        AnonymousClass2JH r4 = this.A0F;
        r4.A0C(this.A0R);
        r4.A0E = new RunnableRunnableShape18S0100000_I1_1((Object) this, 31);
        int i4 = this.A02;
        if (i4 != 0) {
            this.A0A.setHint(A0J(i4));
        }
        this.A0A.setText(AnonymousClass2Sy.A05(A0C(), this.A0H, this.A0M));
        if (!TextUtils.isEmpty(this.A0M)) {
            this.A0A.selectAll();
        }
        this.A03.setOnShowListener(new IDxSListenerShape247S0100000_2_I1(this, 1));
        this.A0O = bundle == null ? true : bundle.getBoolean("is_keyboard_showing");
        if (this.A0P) {
            ImageButton imageButton3 = this.A06;
            AnonymousClass00B.A04(imageButton3);
            imageButton3.setVisibility(8);
        }
        return inflate;
    }

    public void A14() {
        super.A14();
        this.A0A.requestFocus();
        if (this.A0O) {
            this.A0A.A04(false);
        }
    }

    public void A16(Context context) {
        super.A16(context);
        AnonymousClass01A r1 = this.A0D;
        if (r1 instanceof AnonymousClass2AD) {
            this.A0E = (AnonymousClass2AD) r1;
        } else if (context instanceof AnonymousClass2AD) {
            this.A0E = (AnonymousClass2AD) context;
        } else {
            throw AnonymousClass000.A0V(AnonymousClass000.A0h("EmojiEditTextDialogListener", AnonymousClass000.A0r("Activity/Fragment must implement ")));
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        A1E(0, R.style.style02f0);
        Bundle A042 = A04();
        this.A00 = A042.getInt("dialogId");
        this.A05 = A042.getInt("titleResId");
        this.A02 = A042.getInt("hintResId");
        this.A01 = A042.getInt("emptyErrorResId");
        this.A0M = A042.getString("defaultStr");
        this.A04 = A042.getInt("maxLength");
        this.A03 = A042.getInt("inputType");
        this.A0Q = A042.getStringArray("codepointBlacklist");
        this.A0P = A042.getBoolean("shouldHideEmojiBtn");
        this.A0N = A042.getString("supportedDigits");
    }
}
