package com.obwhatsapp.group.ui;

import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass38A;
import X.C1051058f;
import X.C106635Ep;
import X.C106645Eq;
import X.C106655Er;
import X.C13680ns;
import X.C13690nt;
import X.C15220qW;
import X.C15830rv;
import X.C16000sG;
import X.C16010sH;
import X.C16080sP;
import X.C16760tb;
import X.C17020u3;
import X.C17250um;
import X.C18450wi;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.text.IDxWAdapterShape103S0100000_2_I1;

public final class GroupJoinRequestReasonBottomSheetFragment extends Hilt_GroupJoinRequestReasonBottomSheetFragment {
    public C16760tb A00;
    public WaButton A01;
    public C16000sG A02;
    public C16080sP A03;
    public AnonymousClass01V A04;
    public AnonymousClass013 A05;
    public C17250um A06;
    public C17020u3 A07;
    public String A08 = "";
    public final C15220qW A09 = new C1051058f(new C106645Eq(this));
    public final C15220qW A0A = new C1051058f(new C106655Er(this));
    public final C15220qW A0B = new C1051058f(new C106635Ep(this, "group_subject"));
    public final C15220qW A0C = new C1051058f(new C106635Ep(this, "raw_parent_jid"));
    public final C15220qW A0D = new C1051058f(new C106635Ep(this, "message"));

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout02d8, viewGroup);
        C18450wi.A0B(inflate);
        return inflate;
    }

    public void A18(Bundle bundle, View view) {
        String str;
        String A0c;
        View view2 = view;
        C18450wi.A0H(view2, 0);
        TextView A0M = C13680ns.A0M(view2, R.id.request_counter);
        ScrollView scrollView = (ScrollView) view2.findViewById(R.id.scrollView);
        WaEditText waEditText = (WaEditText) view2.findViewById(R.id.join_request_input);
        TextView A0M2 = C13680ns.A0M(view2, R.id.title);
        TextView A0M3 = C13680ns.A0M(view2, R.id.request_disclaimer);
        TextView A0M4 = C13680ns.A0M(view2, R.id.request_hint);
        this.A01 = (WaButton) view2.findViewById(R.id.request_btn);
        Context A022 = A02();
        C17250um r12 = this.A06;
        if (r12 != null) {
            AnonymousClass01V r10 = this.A04;
            if (r10 != null) {
                AnonymousClass013 r11 = this.A05;
                if (r11 != null) {
                    C17020u3 r13 = this.A07;
                    if (r13 != null) {
                        AnonymousClass38A.A00(A022, scrollView, A0M, A0M4, waEditText, r10, r11, r12, r13, AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED);
                        waEditText.addTextChangedListener(new IDxWAdapterShape103S0100000_2_I1(this, 2));
                        waEditText.setText((String) this.A0D.getValue());
                        WaButton waButton = this.A01;
                        if (waButton != null) {
                            C13680ns.A1C(waButton, this, view2, 33);
                        }
                        A0M2.setText((String) this.A0B.getValue());
                        C16000sG r3 = this.A02;
                        if (r3 != null) {
                            C16010sH A082 = r3.A08((C15830rv) this.A09.getValue());
                            if (A082 == null) {
                                A0c = A0J(R.string.str0bdf);
                            } else {
                                Object[] A1b = C13680ns.A1b();
                                C16080sP r0 = this.A03;
                                if (r0 != null) {
                                    A0c = C13690nt.A0c(this, r0.A08(A082), A1b, 0, R.string.str0bde);
                                } else {
                                    str = "waContactNames";
                                }
                            }
                            A0M3.setText(A0c);
                            return;
                        }
                        str = "contactManager";
                    } else {
                        str = "sharedPreferencesFactory";
                    }
                } else {
                    str = "whatsAppLocale";
                }
            } else {
                str = "systemServices";
            }
        } else {
            str = "emojiLoader";
        }
        throw C18450wi.A03(str);
    }
}
