package X;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape162S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape204S0100000_2_I1;
import com.facebook.redex.IDxEListenerShape201S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.text.IDxWAdapterShape23S0200000_2_I1;
import java.util.ArrayList;

/* renamed from: X.2uz  reason: invalid class name and case insensitive filesystem */
public class C59182uz extends AnonymousClass2S7 {
    public int A00;
    public WaEditText A01;
    public AnonymousClass2JH A02;
    public CharSequence A03;
    public boolean A04 = true;
    public boolean A05;
    public boolean A06 = true;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final C16300so A0D;
    public final AnonymousClass5RN A0E = new IDxCListenerShape204S0100000_2_I1(this, 2);
    public final C14870pt A0F;
    public final AnonymousClass01V A0G;
    public final C15860rz A0H;
    public final AnonymousClass5PZ A0I;
    public final C206711d A0J;
    public final C17250um A0K;
    public final AnonymousClass1BQ A0L;
    public final C14710pd A0M;
    public final C17020u3 A0N;
    public final C23061Ai A0O;
    public final String A0P;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59182uz(android.app.Activity r9, X.C16300so r10, X.C14870pt r11, X.AnonymousClass01V r12, X.C16440t3 r13, X.C15860rz r14, X.AnonymousClass013 r15, X.AnonymousClass5PZ r16, X.C206711d r17, X.C17250um r18, X.AnonymousClass1BQ r19, X.C14710pd r20, X.C17020u3 r21, X.C23061Ai r22, java.lang.String r23, int r24, int r25, int r26, int r27, int r28, int r29) {
        /*
            r8 = this;
            r7 = 2131558991(0x7f0d024f, float:1.8743313E38)
            r0 = 1
            r2 = r8
            r6 = r15
            r5 = r13
            r4 = r12
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A04 = r0
            r8.A06 = r0
            r1 = 2
            com.facebook.redex.IDxCListenerShape204S0100000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape204S0100000_2_I1
            r0.<init>(r8, r1)
            r8.A0E = r0
            r0 = r20
            r8.A0M = r0
            r8.A0F = r11
            r0 = r22
            r8.A0O = r0
            r8.A0D = r10
            r0 = r18
            r8.A0K = r0
            r0 = r17
            r8.A0J = r0
            r8.A0G = r12
            r0 = r19
            r8.A0L = r0
            r8.A0H = r14
            r0 = r21
            r8.A0N = r0
            r0 = r24
            r8.A07 = r0
            r0 = r29
            r8.A0A = r0
            r0 = r16
            r8.A0I = r0
            r0 = r25
            r8.A0C = r0
            r0 = r26
            r8.A0B = r0
            r0 = r27
            r8.A09 = r0
            r0 = r28
            r8.A08 = r0
            r0 = r23
            r8.A0P = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59182uz.<init>(android.app.Activity, X.0so, X.0pt, X.01V, X.0t3, X.0rz, X.013, X.5PZ, X.11d, X.0um, X.1BQ, X.0pd, X.0u3, X.1Ai, java.lang.String, int, int, int, int, int, int):void");
    }

    public void onBackPressed() {
        if (this.A02.isShowing()) {
            this.A02.dismiss();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        int i2 = this.A0C;
        ((TextView) findViewById(R.id.dialog_title)).setText(i2);
        setTitle(i2);
        View findViewById = findViewById(R.id.ok_btn);
        C13680ns.A17(findViewById, this, 48);
        C13680ns.A17(findViewById(R.id.cancel_btn), this, 49);
        ArrayList A0u = AnonymousClass000.A0u();
        TextView textView = (TextView) findViewById(R.id.counter_tv);
        WaEditText waEditText = (WaEditText) findViewById(R.id.edit_text);
        this.A01 = waEditText;
        AnonymousClass013 r8 = this.A04;
        C45902Bo.A0C(waEditText, r8);
        int i3 = this.A0B;
        if (i3 > 0) {
            if (this.A00 == 0) {
                textView.setVisibility(0);
            }
            A0u.add(new C93744jh(i3));
        }
        if (!this.A06) {
            A0u.add(new C93734jg());
        }
        if (!A0u.isEmpty()) {
            this.A01.setFilters((InputFilter[]) A0u.toArray(new InputFilter[0]));
        }
        WaEditText waEditText2 = this.A01;
        C17250um r5 = this.A0K;
        AnonymousClass01V r16 = this.A0G;
        C17020u3 r9 = this.A0N;
        waEditText2.addTextChangedListener(new AnonymousClass35O(waEditText2, textView, r16, r8, r5, r9, i3, this.A00, this.A05));
        if (!this.A04) {
            this.A01.addTextChangedListener(new IDxWAdapterShape23S0200000_2_I1(findViewById, 0, this));
        }
        this.A01.setInputType(this.A0A);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        getWindow().setAttributes(attributes);
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            int A002 = AnonymousClass00T.A00(getContext(), R.color.color064b);
        }
        Activity activity = this.A01;
        C14710pd r13 = this.A0M;
        C23061Ai r12 = this.A0O;
        C16300so r11 = this.A0D;
        C206711d r10 = this.A0J;
        AnonymousClass1BQ r7 = this.A0L;
        C206711d r21 = r10;
        AnonymousClass013 r20 = r8;
        C15860rz r19 = this.A0H;
        AnonymousClass01V r18 = r16;
        WaEditText waEditText3 = this.A01;
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) findViewById(R.id.emoji_edit_text_layout);
        C16300so r15 = r11;
        Activity activity2 = activity;
        this.A02 = new AnonymousClass2JH(activity2, (ImageButton) findViewById(R.id.emoji_btn), r15, keyboardPopupLayout, waEditText3, r18, r19, r20, r21, r5, r7, r13, r9, r12);
        AnonymousClass29I r112 = new AnonymousClass29I(activity, r8, this.A02, r10, r5, (EmojiSearchContainer) findViewById(R.id.emoji_search_container), r9);
        r112.A00 = new IDxEListenerShape201S0100000_2_I1(this, 2);
        AnonymousClass2JH r2 = this.A02;
        r2.A0C(this.A0E);
        r2.A0E = new RunnableRunnableShape14S0200000_I1_2(this, 17, r112);
        setOnCancelListener(new IDxCListenerShape162S0100000_2_I1(this, 10));
        TextView textView2 = (TextView) findViewById(R.id.dialog_subtitle);
        if (TextUtils.isEmpty((CharSequence) null)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText((CharSequence) null);
        }
        TextView textView3 = (TextView) findViewById(R.id.dialog_footer);
        if (TextUtils.isEmpty(this.A03)) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(this.A03);
        }
        int i4 = this.A09;
        if (i4 != 0) {
            this.A01.setHint(getContext().getString(i4));
        }
        WaEditText waEditText4 = this.A01;
        String str = this.A0P;
        waEditText4.setText(AnonymousClass2Sy.A05(activity, r5, str));
        if (!TextUtils.isEmpty(str)) {
            this.A01.selectAll();
        }
        this.A01.A04(false);
        getWindow().setSoftInputMode(5);
    }
}
