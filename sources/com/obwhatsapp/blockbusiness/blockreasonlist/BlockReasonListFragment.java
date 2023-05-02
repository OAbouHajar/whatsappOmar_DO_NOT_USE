package com.obwhatsapp.blockbusiness.blockreasonlist;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass0Fg;
import X.AnonymousClass1DV;
import X.AnonymousClass377;
import X.AnonymousClass3R3;
import X.AnonymousClass4VY;
import X.AnonymousClass5DR;
import X.AnonymousClass5FC;
import X.C003101j;
import X.C004601z;
import X.C008703y;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14550pN;
import X.C15220qW;
import X.C16000sG;
import X.C16010sH;
import X.C16080sP;
import X.C17020u3;
import X.C17250um;
import X.C18450wi;
import X.C20260zl;
import X.C34811ku;
import X.C40561uK;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCCallbackShape293S0100000_2_I1;
import com.facebook.redex.IDxObserverShape37S0200000_2_I1;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;
import com.facebook.redex.ViewOnClickCListenerShape3S1100000_I1;
import com.obwhatsapp.FAQTextView;
import com.obwhatsapp.R;
import com.obwhatsapp.components.Button;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class BlockReasonListFragment extends Hilt_BlockReasonListFragment {
    public CheckBox A00;
    public RecyclerView A01;
    public AnonymousClass3R3 A02;
    public Button A03;
    public C16000sG A04;
    public C16080sP A05;
    public AnonymousClass01V A06;
    public C17250um A07;
    public C20260zl A08;
    public C17020u3 A09;
    public final C15220qW A0A = new AnonymousClass1DV(new AnonymousClass5DR(this));

    public static final void A01(Bundle bundle, BlockReasonListFragment blockReasonListFragment, List list) {
        String str;
        List list2 = list;
        C18450wi.A0H(list, 2);
        C17250um r3 = blockReasonListFragment.A07;
        if (r3 != null) {
            AnonymousClass01V r1 = blockReasonListFragment.A06;
            if (r1 != null) {
                AnonymousClass013 r2 = blockReasonListFragment.A02;
                C18450wi.A0A(r2);
                C17020u3 r4 = blockReasonListFragment.A09;
                if (r4 != null) {
                    blockReasonListFragment.A02 = new AnonymousClass3R3(r1, r2, r3, r4, list2, new AnonymousClass5FC(blockReasonListFragment));
                    if (bundle != null) {
                        int i2 = bundle.getInt("selectedItem");
                        String string = bundle.getString("text", "");
                        C18450wi.A0B(string);
                        AnonymousClass3R3 r22 = blockReasonListFragment.A02;
                        if (r22 != null) {
                            r22.A00 = i2;
                            r22.A01 = string;
                            Object A062 = C003101j.A06(r22.A06, i2);
                            if (A062 != null) {
                                r22.A07.AIU(A062);
                            }
                            r22.A01();
                        }
                        str = "adapter";
                    }
                    RecyclerView recyclerView = blockReasonListFragment.A01;
                    if (recyclerView == null) {
                        str = "recyclerView";
                    } else {
                        AnonymousClass3R3 r0 = blockReasonListFragment.A02;
                        if (r0 != null) {
                            recyclerView.setAdapter(r0);
                            return;
                        }
                        str = "adapter";
                    }
                } else {
                    str = "sharedPreferencesFactory";
                }
            } else {
                str = "systemServices";
            }
        } else {
            str = "emojiLoader";
        }
        throw C18450wi.A03(str);
    }

    public static final void A02(BlockReasonListFragment blockReasonListFragment, String str) {
        BlockReasonListFragment blockReasonListFragment2 = blockReasonListFragment;
        boolean z2 = blockReasonListFragment2.A04().getBoolean("show_success_toast");
        boolean z3 = blockReasonListFragment2.A04().getBoolean("from_spam_panel");
        CheckBox checkBox = blockReasonListFragment2.A00;
        String str2 = null;
        if (checkBox == null) {
            throw C18450wi.A03("reportCheckbox");
        }
        boolean isChecked = checkBox.isChecked();
        String string = blockReasonListFragment2.A04().getString("entry_point");
        if (string != null) {
            C14550pN r6 = (C14550pN) blockReasonListFragment2.A0D();
            BlockReasonListViewModel blockReasonListViewModel = (BlockReasonListViewModel) blockReasonListFragment2.A0A.getValue();
            AnonymousClass3R3 r0 = blockReasonListFragment2.A02;
            if (r0 != null) {
                AnonymousClass4VY r02 = (AnonymousClass4VY) C003101j.A06(r0.A06, r0.A00);
                if (r02 != null) {
                    str2 = r02.A00;
                }
                AnonymousClass3R3 r03 = blockReasonListFragment2.A02;
                if (r03 != null) {
                    String obj = r03.A01.toString();
                    C18450wi.A0H(r6, 0);
                    UserJid userJid = UserJid.get(str);
                    C18450wi.A0B(userJid);
                    C16010sH A0A2 = blockReasonListViewModel.A05.A0A(userJid);
                    String str3 = null;
                    if (obj != null && !C008703y.A0L(obj)) {
                        str3 = obj;
                    }
                    if (z3) {
                        C14550pN r7 = r6;
                        C13700nu.A0W(new AnonymousClass377(r6, r7, blockReasonListViewModel.A03, new IDxCCallbackShape293S0100000_2_I1(blockReasonListViewModel, 0), blockReasonListViewModel.A06, A0A2, str2, str3, string, false, isChecked), blockReasonListViewModel.A0D);
                        return;
                    }
                    blockReasonListViewModel.A04.A0G(r6, new IDxCCallbackShape293S0100000_2_I1(blockReasonListViewModel, 1), A0A2, str2, str3, string, true, z2);
                    return;
                }
            }
            throw C18450wi.A03("adapter");
        }
        throw AnonymousClass000.A0T("Required value was null.");
    }

    public void A0s(Bundle bundle) {
        C18450wi.A0H(bundle, 0);
        super.A0s(bundle);
        AnonymousClass3R3 r0 = this.A02;
        if (r0 != null) {
            bundle.putInt("selectedItem", r0.A00);
            AnonymousClass3R3 r02 = this.A02;
            if (r02 != null) {
                bundle.putString("text", r02.A01.toString());
                return;
            }
        }
        throw C18450wi.A03("adapter");
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        String A0c;
        C18450wi.A0H(layoutInflater, 0);
        String string = A04().getString("jid");
        if (string != null) {
            View inflate = layoutInflater.inflate(R.layout.layout009b, viewGroup, false);
            C18450wi.A0B(inflate);
            View findViewById = inflate.findViewById(R.id.block_reason_list);
            RecyclerView recyclerView = (RecyclerView) findViewById;
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            AnonymousClass0Fg r2 = new AnonymousClass0Fg(recyclerView.getContext());
            Drawable A042 = AnonymousClass00T.A04(recyclerView.getContext(), R.drawable.block_business_divider_gray);
            if (A042 != null) {
                r2.A00 = A042;
            }
            recyclerView.A0m(r2);
            recyclerView.A0h = true;
            C18450wi.A0B(findViewById);
            this.A01 = recyclerView;
            C004601z.A0o(inflate.findViewById(R.id.reason_for_blocking), true);
            UserJid userJid = UserJid.get(string);
            C18450wi.A0B(userJid);
            C16000sG r0 = this.A04;
            if (r0 != null) {
                C16010sH A0A2 = r0.A0A(userJid);
                C20260zl r02 = this.A08;
                if (r02 != null) {
                    if (C40561uK.A01(r02, userJid)) {
                        Context A022 = A02();
                        String str2 = C34811ku.A02;
                        if (str2 == null) {
                            str2 = A022.getString(R.string.str1b3c);
                            C34811ku.A02 = str2;
                        }
                        Object[] A1Z = C13690nt.A1Z();
                        A1Z[0] = str2;
                        A0c = C13690nt.A0c(this, str2, A1Z, 1, R.string.str1b26);
                    } else {
                        Object[] objArr = new Object[1];
                        C16080sP r1 = this.A05;
                        if (r1 != null) {
                            A0c = C13690nt.A0c(this, r1.A0G(A0A2, -1, true), objArr, 0, R.string.str1c14);
                        } else {
                            str = "waContactNames";
                        }
                    }
                    C18450wi.A0E(A0c);
                    ((FAQTextView) inflate.findViewById(R.id.blocking_info)).setEducationTextFromNamedArticle(new SpannableString(A0c), "chats", "controls-when-messaging-businesses");
                    View findViewById2 = inflate.findViewById(R.id.report_biz_checkbox);
                    C18450wi.A0B(findViewById2);
                    this.A00 = (CheckBox) findViewById2;
                    if (A04().getBoolean("show_report_upsell")) {
                        C13690nt.A13(inflate, R.id.report_biz_setting, 0);
                    }
                    View findViewById3 = inflate.findViewById(R.id.block_button);
                    C18450wi.A0B(findViewById3);
                    Button button = (Button) findViewById3;
                    this.A03 = button;
                    if (button != null) {
                        button.setOnClickListener(new ViewOnClickCListenerShape3S1100000_I1(0, string, this));
                        Button button2 = this.A03;
                        if (button2 != null) {
                            C20260zl r12 = this.A08;
                            if (r12 != null) {
                                button2.setEnabled(C40561uK.A01(r12, UserJid.get(string)));
                                return inflate;
                            }
                        }
                    }
                    throw C18450wi.A03("blockButton");
                }
                str = "infraABProps";
            } else {
                str = "contactManager";
            }
            throw C18450wi.A03(str);
        }
        throw AnonymousClass000.A0T("Required value was null.");
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        String string = A04().getString("jid");
        if (string != null) {
            BlockReasonListViewModel blockReasonListViewModel = (BlockReasonListViewModel) this.A0A.getValue();
            UserJid userJid = UserJid.get(string);
            C18450wi.A0B(userJid);
            blockReasonListViewModel.A0D.Acl(new RunnableRunnableShape13S0200000_I1_1(blockReasonListViewModel, 3, userJid));
            return;
        }
        throw AnonymousClass000.A0T("Required value was null.");
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        C15220qW r4 = this.A0A;
        ((BlockReasonListViewModel) r4.getValue()).A01.A0A(A0H(), new IDxObserverShape37S0200000_2_I1(bundle, 1, this));
        C13680ns.A1N(A0H(), ((BlockReasonListViewModel) r4.getValue()).A0C, this, 16);
    }
}
