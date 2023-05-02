package com.obwhatsapp.community;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass04o;
import X.AnonymousClass1UP;
import X.AnonymousClass2Ao;
import X.AnonymousClass2XN;
import X.AnonymousClass4CZ;
import X.C001500q;
import X.C004601z;
import X.C006602z;
import X.C107935Ma;
import X.C14870pt;
import X.C15860rz;
import X.C16050sL;
import X.C16440t3;
import X.C17160ud;
import X.C17200uh;
import X.C18890xQ;
import X.C19980zJ;
import X.C217415g;
import X.C218115n;
import X.C49642Uo;
import X.C62373Dh;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.text.ReadMoreTextView;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;
import java.util.ArrayList;
import java.util.List;

public class JoinGroupBottomSheetFragment extends Hilt_JoinGroupBottomSheetFragment {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public Button A05;
    public Button A06;
    public FrameLayout A07;
    public ImageButton A08;
    public ImageView A09;
    public ImageView A0A;
    public ImageView A0B;
    public ImageView A0C;
    public ImageView A0D;
    public ImageView A0E;
    public ProgressBar A0F;
    public ScrollView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public C19980zJ A0N;
    public AnonymousClass4CZ A0O;
    public C14870pt A0P;
    public TextEmojiLabel A0Q;
    public C18890xQ A0R;
    public C107935Ma A0S;
    public C49642Uo A0T;
    public C17160ud A0U;
    public AnonymousClass2Ao A0V;
    public C17200uh A0W;
    public C16440t3 A0X;
    public C15860rz A0Y;
    public AnonymousClass013 A0Z;
    public C218115n A0a;
    public C217415g A0b;
    public C16050sL A0c;
    public ReadMoreTextView A0d;
    public List A0e;

    public static JoinGroupBottomSheetFragment A01(GroupJid groupJid, GroupJid groupJid2, int i2) {
        JoinGroupBottomSheetFragment joinGroupBottomSheetFragment = new JoinGroupBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_parent_group_jid", groupJid.getRawString());
        bundle.putString("arg_group_jid", groupJid2.getRawString());
        int i3 = 3;
        if (i2 != 3) {
            i3 = 4;
        }
        bundle.putInt("use_case", i3);
        joinGroupBottomSheetFragment.A0T(bundle);
        return joinGroupBottomSheetFragment;
    }

    public static JoinGroupBottomSheetFragment A02(String str, int i2, boolean z2) {
        JoinGroupBottomSheetFragment joinGroupBottomSheetFragment = new JoinGroupBottomSheetFragment();
        Bundle bundle = new Bundle();
        int i3 = 2;
        if (i2 != 1) {
            if (i2 != 2) {
                i3 = 5;
                if (i2 != 3) {
                    i3 = 0;
                }
            } else {
                i3 = 1;
            }
        }
        bundle.putInt("use_case", i3);
        bundle.putString("invite_link_code", str);
        bundle.putBoolean("invite_from_referrer", z2);
        joinGroupBottomSheetFragment.A0T(bundle);
        return joinGroupBottomSheetFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout0112, viewGroup, true);
        this.A0G = (ScrollView) C004601z.A0E(inflate, R.id.join_group_bottom_sheet_content_scrollview);
        this.A07 = (FrameLayout) C004601z.A0E(inflate, R.id.join_group_bottom_sheet_content_body);
        this.A02 = C004601z.A0E(inflate, R.id.join_group_bottom_sheet_join_button_container);
        this.A04 = C004601z.A0E(inflate, R.id.subgroup_info_container_loading);
        this.A03 = C004601z.A0E(inflate, R.id.subgroup_info_container_loaded);
        this.A00 = C004601z.A0E(inflate, R.id.subgroup_info_container_error);
        this.A0I = (TextView) C004601z.A0E(inflate, R.id.subgroup_info_container_error_message);
        this.A0J = (TextView) C004601z.A0E(inflate, R.id.join_group_bottom_sheet_retry_button);
        TextView textView = (TextView) C004601z.A0E(inflate, R.id.join_group_bottom_sheet_group_title);
        this.A0L = textView;
        AnonymousClass1UP.A06(textView);
        this.A09 = (ImageView) C004601z.A0E(inflate, R.id.join_group_bottom_sheet_group_icon);
        this.A0K = (TextView) C004601z.A0E(inflate, R.id.join_group_bottom_sheet_group_subtitle);
        this.A0H = (TextView) C004601z.A0E(inflate, R.id.join_group_bottom_sheet_group_participant_count);
        this.A0d = (ReadMoreTextView) C004601z.A0E(inflate, R.id.join_group_bottom_sheet_description_text);
        this.A0Q = (TextEmojiLabel) C004601z.A0E(inflate, R.id.join_group_bottom_sheet_disclaimer);
        this.A05 = (Button) C004601z.A0E(inflate, R.id.join_group_bottom_sheet_join_button);
        this.A0F = (ProgressBar) C004601z.A0E(inflate, R.id.join_group_bottom_sheet_join_button_spinner);
        this.A06 = (Button) C004601z.A0E(inflate, R.id.join_group_bottom_sheet_view_group);
        this.A08 = (ImageButton) C004601z.A0E(inflate, R.id.join_group_bottom_sheet_close_button);
        this.A01 = C004601z.A0E(inflate, R.id.join_group_contact_preview);
        this.A0A = (ImageView) C004601z.A0E(inflate, R.id.join_group_contact_preview_icon_1);
        this.A0B = (ImageView) C004601z.A0E(inflate, R.id.join_group_contact_preview_icon_2);
        this.A0C = (ImageView) C004601z.A0E(inflate, R.id.join_group_contact_preview_icon_3);
        this.A0D = (ImageView) C004601z.A0E(inflate, R.id.join_group_contact_preview_icon_4);
        this.A0E = (ImageView) C004601z.A0E(inflate, R.id.join_group_contact_preview_icon_5);
        ArrayList arrayList = new ArrayList();
        this.A0e = arrayList;
        arrayList.add(this.A0A);
        arrayList.add(this.A0B);
        arrayList.add(this.A0C);
        arrayList.add(this.A0D);
        this.A0e.add(this.A0E);
        this.A0M = (TextView) C004601z.A0E(inflate, R.id.join_group_contact_count_view);
        return inflate;
    }

    public void A16(Context context) {
        super.A16(context);
        if (context instanceof C107935Ma) {
            this.A0S = (C107935Ma) context;
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A0c = C16050sL.A05(A04().getString("arg_parent_group_jid"));
        C49642Uo r1 = (C49642Uo) new C006602z((AnonymousClass04o) new C62373Dh(this.A0O, this.A0c, C16050sL.A05(A04().getString("arg_group_jid")), A04().getString("invite_link_code"), A04().getInt("use_case"), A04().getBoolean("invite_from_referrer")), (C001500q) this).A01(C49642Uo.class);
        r1.A0A(false);
        this.A0T = r1;
        r1.A0V.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 36));
        this.A0T.A0Q.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 125));
        this.A0T.A0R.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 123));
        this.A0T.A0P.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 121));
        this.A0T.A0W.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 37));
        this.A0T.A0S.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 35));
        this.A0T.A0O.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 122));
        this.A0V = this.A0W.A04(A02(), "join-group-bottom-sheet");
    }

    public void A18(Bundle bundle, View view) {
        this.A0d.A09.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 124));
        this.A08.setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 49));
    }

    public final void A1N(int i2) {
        int i3;
        Button button;
        int i4;
        this.A06.setVisibility(8);
        this.A0F.setVisibility(8);
        this.A02.setVisibility(0);
        this.A05.setEnabled(false);
        this.A05.setClickable(false);
        this.A05.setOnClickListener((View.OnClickListener) null);
        this.A05.setVisibility(0);
        Button button2 = this.A05;
        if (i2 != 0) {
            switch (i2) {
                case 2:
                case 4:
                    i3 = R.string.str1447;
                    break;
                case 3:
                    i3 = R.string.str1445;
                    break;
                case 5:
                    i3 = R.string.str08c7;
                    break;
                case 6:
                    i3 = R.string.str146a;
                    break;
                case 7:
                    i3 = R.string.str0e87;
                    break;
                default:
                    i3 = R.string.str0bd6;
                    break;
            }
        } else {
            i3 = R.string.str0bda;
        }
        button2.setText(i3);
        if (i2 != 3) {
            if (i2 != 7) {
                Button button3 = this.A05;
                if (i2 != 8) {
                    button3.setEnabled(true);
                    this.A05.setClickable(true);
                    button = this.A05;
                    i4 = 4;
                } else {
                    button3.setText("");
                    this.A0F.setVisibility(0);
                    return;
                }
            } else {
                this.A05.setEnabled(true);
                this.A05.setClickable(true);
                button = this.A05;
                i4 = 3;
            }
            button.setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, i4));
        }
    }

    public final void A1O(int i2) {
        if (i2 > 0) {
            TextView textView = this.A0M;
            textView.setText(textView.getContext().getString(R.string.str00cb, new Object[]{Integer.valueOf(i2)}));
            this.A0M.setVisibility(0);
            return;
        }
        this.A0M.setVisibility(8);
    }

    public final void A1P(AnonymousClass2XN r5) {
        if (r5 == null) {
            A1Q(false);
            return;
        }
        A1Q(true);
        TextEmojiLabel textEmojiLabel = this.A0Q;
        textEmojiLabel.setTextColor(AnonymousClass00T.A00(textEmojiLabel.getContext(), r5.A00));
        this.A0Q.setText(A03().getString(r5.A01, r5.A02));
    }

    public final void A1Q(boolean z2) {
        TextEmojiLabel textEmojiLabel = this.A0Q;
        int i2 = 8;
        if (z2) {
            i2 = 0;
        }
        textEmojiLabel.setVisibility(i2);
        FrameLayout frameLayout = this.A07;
        int paddingLeft = frameLayout.getPaddingLeft();
        int paddingTop = this.A07.getPaddingTop();
        int paddingRight = this.A07.getPaddingRight();
        Resources A032 = A03();
        int i3 = R.dimen.dimen0765;
        if (z2) {
            i3 = R.dimen.dimen0762;
        }
        frameLayout.setPadding(paddingLeft, paddingTop, paddingRight, A032.getDimensionPixelOffset(i3));
    }
}
