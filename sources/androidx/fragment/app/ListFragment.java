package androidx.fragment.app;

import X.AnonymousClass01A;
import X.C09460fY;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape192S0100000_I0;

public class ListFragment extends AnonymousClass01A {
    public View A00;
    public View A01;
    public View A02;
    public ListAdapter A03;
    public ListView A04;
    public TextView A05;
    public boolean A06;
    public final Handler A07 = new Handler();
    public final AdapterView.OnItemClickListener A08 = new IDxCListenerShape192S0100000_I0(this, 1);
    public final Runnable A09 = new C09460fY(this);

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context A022 = A02();
        FrameLayout frameLayout = new FrameLayout(A022);
        LinearLayout linearLayout = new LinearLayout(A022);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(A022, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(A022);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(A022);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(A022);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void A13() {
        this.A07.removeCallbacks(this.A09);
        this.A04 = null;
        this.A06 = false;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A0V = true;
    }

    public void A18(Bundle bundle, View view) {
        A19();
    }

    public final void A19() {
        if (this.A04 == null) {
            View view = this.A0A;
            if (view != null) {
                if (view instanceof ListView) {
                    this.A04 = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    this.A05 = textView;
                    if (textView == null) {
                        this.A00 = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.A02 = view.findViewById(16711682);
                    this.A01 = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.A04 = listView;
                        View view2 = this.A00;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.A06 = true;
                this.A04.setOnItemClickListener(this.A08);
                ListAdapter listAdapter = this.A03;
                if (listAdapter != null) {
                    this.A03 = null;
                    A1A(listAdapter);
                } else if (this.A02 != null) {
                    A19();
                    View view3 = this.A02;
                    if (view3 == null) {
                        throw new IllegalStateException("Can't be used with a custom content view");
                    } else if (this.A06) {
                        this.A06 = false;
                        view3.clearAnimation();
                        this.A01.clearAnimation();
                        this.A02.setVisibility(0);
                        this.A01.setVisibility(8);
                    }
                }
                this.A07.post(this.A09);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    public void A1A(ListAdapter listAdapter) {
        boolean z2 = false;
        boolean z3 = false;
        if (this.A03 != null) {
            z3 = true;
        }
        this.A03 = listAdapter;
        ListView listView = this.A04;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.A06 && !z3) {
                if (A06().getWindowToken() != null) {
                    z2 = true;
                }
                A19();
                View view = this.A02;
                if (view == null) {
                    throw new IllegalStateException("Can't be used with a custom content view");
                } else if (!this.A06) {
                    this.A06 = true;
                    if (z2) {
                        view.startAnimation(AnimationUtils.loadAnimation(A0u(), 17432577));
                        this.A01.startAnimation(AnimationUtils.loadAnimation(A0u(), 17432576));
                    } else {
                        view.clearAnimation();
                        this.A01.clearAnimation();
                    }
                    this.A02.setVisibility(8);
                    this.A01.setVisibility(0);
                }
            }
        }
    }
}
