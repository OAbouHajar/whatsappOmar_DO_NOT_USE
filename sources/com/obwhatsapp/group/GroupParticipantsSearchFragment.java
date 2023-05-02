package com.obwhatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass04h;
import X.AnonymousClass04o;
import X.AnonymousClass1UP;
import X.AnonymousClass1VA;
import X.AnonymousClass267;
import X.AnonymousClass2J7;
import X.AnonymousClass2J8;
import X.AnonymousClass2O9;
import X.AnonymousClass2OB;
import X.AnonymousClass2SR;
import X.AnonymousClass4EJ;
import X.C001500q;
import X.C004601z;
import X.C006602z;
import X.C13680ns;
import X.C14710pd;
import X.C16620tM;
import X.C23061Ai;
import X.C30531cW;
import X.C30551cZ;
import X.C34331k5;
import X.C447725m;
import X.C49662Uu;
import X.C56772oU;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.facebook.redex.IDxCListenerShape195S0100000_2_I1;
import com.facebook.redex.IDxIDrawableShape12S0100000_2_I1;
import com.facebook.redex.IDxSListenerShape15S0101000_2_I1;
import com.facebook.redex.IDxTListenerShape171S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape0S0000000_I0;
import com.obwhatsapp.IDxLAdapterShape12S0200000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.status.viewmodels.StatusesViewModel;

public class GroupParticipantsSearchFragment extends Hilt_GroupParticipantsSearchFragment {
    public int A00 = 0;
    public AnonymousClass2J7 A01;
    public C49662Uu A02;
    public AnonymousClass01V A03;
    public AnonymousClass013 A04;
    public C14710pd A05;
    public C56772oU A06;
    public AnonymousClass2O9 A07;
    public C23061Ai A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public void A0n(Bundle bundle) {
        AnonymousClass2OB r7;
        String string;
        this.A0V = true;
        Bundle bundle2 = bundle;
        if (bundle != null) {
            this.A00 = bundle2.getInt("search_view_startup_mode");
            this.A09 = bundle2.getBoolean("enter_animated");
            this.A0B = bundle2.getBoolean("exit_animated");
            this.A0A = bundle2.getBoolean("enter_ime");
        }
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) A0D();
        View A062 = A06();
        ListView listView = (ListView) C004601z.A0E(A062, 16908298);
        if (this.A06 == null) {
            this.A06 = new C56772oU(new AnonymousClass4EJ(groupChatInfoActivity), groupChatInfoActivity);
        }
        AnonymousClass2O9 r2 = (AnonymousClass2O9) new C006602z(groupChatInfoActivity).A01(AnonymousClass2O9.class);
        this.A07 = r2;
        int i2 = this.A00;
        if (i2 == 0) {
            r7 = r2.A0F;
        } else if (i2 == 1) {
            r7 = r2.A0G;
        } else {
            throw new AssertionError("Unreachable");
        }
        C13680ns.A1N(A0H(), r7, this.A06, 94);
        if (this.A05.A0E(C16620tM.A01, 1533)) {
            C13680ns.A1N(A0H(), ((StatusesViewModel) new C006602z((AnonymousClass04o) new AnonymousClass2J8(this.A01, true), (C001500q) A0D()).A01(StatusesViewModel.class)).A05, this, 95);
        }
        groupChatInfoActivity.registerForContextMenu(listView);
        listView.setOnItemClickListener(new IDxCListenerShape195S0100000_2_I1(groupChatInfoActivity, 2));
        listView.setOnScrollListener(new IDxSListenerShape15S0101000_2_I1(this));
        View findViewById = A062.findViewById(R.id.search_holder);
        AnonymousClass267.A00(findViewById);
        SearchView searchView = (SearchView) findViewById.findViewById(R.id.search_view);
        C13680ns.A0v(A0u(), C13680ns.A0M(searchView, R.id.search_src_text), R.color.color06bd);
        searchView.setIconifiedByDefault(false);
        View A1B = this.A09 ? A1B() : null;
        if (A1B != null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (A1B.getTop() - listView.getPaddingTop()), 0.0f);
            translateAnimation.setDuration(240);
            translateAnimation.setAnimationListener(new IDxLAdapterShape12S0200000_2_I1(searchView, 7, this));
            listView.startAnimation(translateAnimation);
        } else if (this.A0A) {
            searchView.setIconified(false);
            this.A0A = false;
        } else {
            this.A08.A01(searchView);
        }
        searchView.setQueryHint(A0J(R.string.str14a4));
        searchView.A0B = new IDxTListenerShape171S0100000_2_I1(this, 6);
        C13680ns.A0K(searchView, R.id.search_mag_icon).setImageDrawable(new IDxIDrawableShape12S0100000_2_I1(AnonymousClass00T.A04(A0u(), R.drawable.ic_back), this, 2));
        if (this.A09) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
            translateAnimation2.setDuration(240);
            findViewById.startAnimation(translateAnimation2);
        }
        this.A09 = false;
        ImageView A0K = C13680ns.A0K(findViewById, R.id.search_back);
        A0K.setImageDrawable(new C447725m(AnonymousClass2SR.A06(A03().getDrawable(R.drawable.ic_back), A03().getColor(R.color.color04ef)), this.A04));
        C34331k5.A03(A0K, this, 29);
        Context A022 = A02();
        if (this.A00 == 1 && (string = A022.getString(R.string.str0f2e)) != null) {
            View inflate = View.inflate(A0u(), R.layout.layout02ee, (ViewGroup) null);
            TextView A0L = C13680ns.A0L(inflate, R.id.text);
            AnonymousClass1UP.A06(A0L);
            A0L.setText(string);
            listView.addHeaderView(inflate, (Object) null, false);
        }
        AnonymousClass2O9 r8 = this.A07;
        Context A023 = A02();
        if (this.A00 == 1) {
            Resources resources = A023.getResources();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, 60, 0);
            SpannableString A052 = r8.A0I.A05(resources.getQuantityString(R.plurals.plurals0101, 60, objArr), new Runnable[]{new RunnableRunnableShape0S0000000_I0(12)}, new String[]{"learn-more"}, new String[]{"https://faq.whatsapp.com/android/chats/how-to-exit-and-delete-groups"});
            View inflate2 = View.inflate(A0u(), R.layout.layout02ed, (ViewGroup) null);
            C30531cW.A04(C13680ns.A0Q(inflate2, R.id.text), this.A03, A052);
            listView.addFooterView(inflate2, (Object) null, false);
        }
        if (this.A00 == 0) {
            AnonymousClass2O9 r0 = this.A07;
            if (r0.A05.A03(r0.A0C) == 3) {
                AnonymousClass2O9 r02 = this.A07;
                if (!r02.A07.A0A(r02.A0C)) {
                    View inflate3 = View.inflate(A0u(), R.layout.layout02ed, (ViewGroup) null);
                    TextEmojiLabel A0Q = C13680ns.A0Q(inflate3, R.id.text);
                    C30531cW.A03(A0Q, this.A03);
                    C30531cW.A02(A0Q);
                    A0Q.setText(R.string.str00ed);
                    AnonymousClass04h.A08(A0Q, R.style.style0450);
                    listView.addFooterView(inflate3, (Object) null, false);
                }
            }
        }
        listView.setAdapter(this.A06);
    }

    public void A0s(Bundle bundle) {
        bundle.putInt("search_view_startup_mode", this.A00);
        bundle.putBoolean("enter_animated", this.A09);
        bundle.putBoolean("exit_animated", this.A0B);
        bundle.putBoolean("enter_ime", this.A0A);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout02dd);
    }

    public final View A1B() {
        AnonymousClass1VA r5 = (AnonymousClass1VA) A0C();
        View view = null;
        if (r5 != null) {
            int childCount = r5.ADA().getChildCount();
            for (int i2 = 0; i2 < childCount && view == null; i2++) {
                View childAt = r5.ADA().getChildAt(i2);
                if (childAt.getTag() != null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public void A1C() {
        View view = this.A0A;
        if (view != null) {
            boolean A1R = AnonymousClass000.A1R(A0G().A04(), 1);
            View A1B = this.A0B ? A1B() : null;
            View findViewById = view.findViewById(R.id.search_holder);
            findViewById.setVisibility(8);
            this.A08.A01(C004601z.A0E(findViewById, R.id.search_view));
            if (A1B != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(240);
                findViewById.startAnimation(alphaAnimation);
                View findViewById2 = view.findViewById(16908298);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (A1B.getTop() - findViewById2.getPaddingTop()));
                translateAnimation.setDuration(240);
                C30551cZ.A00(translateAnimation, this, 4);
                findViewById2.startAnimation(translateAnimation);
            } else {
                A0G().A0p();
            }
            C49662Uu r0 = this.A02;
            if (r0 != null && A1R) {
                C004601z.A0d(r0, 1);
            }
        }
    }
}
