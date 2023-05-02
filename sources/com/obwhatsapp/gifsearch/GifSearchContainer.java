package com.obwhatsapp.gifsearch;

import X.AnonymousClass006;
import X.AnonymousClass01V;
import X.AnonymousClass071;
import X.AnonymousClass07D;
import X.AnonymousClass29I;
import X.AnonymousClass3R7;
import X.C004601z;
import X.C108015Mi;
import X.C108745Pe;
import X.C15860rz;
import X.C16490t9;
import X.C17020u3;
import X.C23061Ai;
import X.C25841Li;
import X.C25851Lj;
import X.C25861Lk;
import X.C25921Lq;
import X.C34331k5;
import X.C41651wK;
import X.C47562Jm;
import X.C52662eE;
import X.C74353qP;
import X.C76283tf;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxAListenerShape211S0100000_2_I0;
import com.facebook.redex.IDxIDecorationShape4S0101000_2_I0;
import com.facebook.redex.IDxSListenerShape34S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.text.IDxWAdapterShape102S0100000_2_I0;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;

public class GifSearchContainer extends FrameLayout implements AnonymousClass006 {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public RecyclerView A06;
    public WaEditText A07;
    public AnonymousClass01V A08;
    public C15860rz A09;
    public AnonymousClass29I A0A;
    public C16490t9 A0B;
    public C25841Li A0C;
    public AnonymousClass3R7 A0D;
    public C108015Mi A0E;
    public C25861Lk A0F;
    public C108745Pe A0G;
    public C17020u3 A0H;
    public C23061Ai A0I;
    public C52662eE A0J;
    public CharSequence A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public final AnonymousClass07D A0O;
    public final AnonymousClass071 A0P;
    public final C41651wK A0Q;
    public final C34331k5 A0R;
    public final C34331k5 A0S;
    public final C34331k5 A0T;
    public final Runnable A0U;

    public GifSearchContainer(Context context) {
        super(context);
        if (!this.A0M) {
            this.A0M = true;
            generatedComponent();
        }
        this.A0N = false;
        this.A0U = new RunnableRunnableShape9S0100000_I0_8(this, 20);
        this.A0Q = new IDxWAdapterShape102S0100000_2_I0(this, 1);
        this.A0R = new ViewOnClickCListenerShape1S0100000_I0_1(this, 41);
        this.A0T = new ViewOnClickCListenerShape1S0100000_I0_1(this, 42);
        this.A0S = new ViewOnClickCListenerShape1S0100000_I0_1(this, 43);
        this.A0P = new IDxSListenerShape34S0100000_2_I0(this, 8);
        this.A0O = new IDxIDecorationShape4S0101000_2_I0(this);
    }

    public GifSearchContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0);
        this.A0N = false;
        this.A0U = new RunnableRunnableShape9S0100000_I0_8(this, 20);
        this.A0Q = new IDxWAdapterShape102S0100000_2_I0(this, 1);
        this.A0R = new ViewOnClickCListenerShape1S0100000_I0_1(this, 41);
        this.A0T = new ViewOnClickCListenerShape1S0100000_I0_1(this, 42);
        this.A0S = new ViewOnClickCListenerShape1S0100000_I0_1(this, 43);
        this.A0P = new IDxSListenerShape34S0100000_2_I0(this, 8);
        this.A0O = new IDxIDecorationShape4S0101000_2_I0(this);
    }

    public GifSearchContainer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0M) {
            this.A0M = true;
            generatedComponent();
        }
        this.A0N = false;
        this.A0U = new RunnableRunnableShape9S0100000_I0_8(this, 20);
        this.A0Q = new IDxWAdapterShape102S0100000_2_I0(this, 1);
        this.A0R = new ViewOnClickCListenerShape1S0100000_I0_1(this, 41);
        this.A0T = new ViewOnClickCListenerShape1S0100000_I0_1(this, 42);
        this.A0S = new ViewOnClickCListenerShape1S0100000_I0_1(this, 43);
        this.A0P = new IDxSListenerShape34S0100000_2_I0(this, 8);
        this.A0O = new IDxIDecorationShape4S0101000_2_I0(this);
    }

    public GifSearchContainer(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A0M) {
            this.A0M = true;
            generatedComponent();
        }
        this.A0N = false;
        this.A0U = new RunnableRunnableShape9S0100000_I0_8(this, 20);
        this.A0Q = new IDxWAdapterShape102S0100000_2_I0(this, 1);
        this.A0R = new ViewOnClickCListenerShape1S0100000_I0_1(this, 41);
        this.A0T = new ViewOnClickCListenerShape1S0100000_I0_1(this, 42);
        this.A0S = new ViewOnClickCListenerShape1S0100000_I0_1(this, 43);
        this.A0P = new IDxSListenerShape34S0100000_2_I0(this, 8);
        this.A0O = new IDxIDecorationShape4S0101000_2_I0(this);
    }

    public GifSearchContainer(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        if (!this.A0M) {
            this.A0M = true;
            generatedComponent();
        }
    }

    private void setupRecyclerView(ViewGroup viewGroup) {
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(viewGroup, R.id.search_result);
        this.A06 = recyclerView;
        recyclerView.A0o(this.A0P);
        this.A06.A0m(this.A0O);
        C25841Li r4 = this.A0C;
        C16490t9 r3 = this.A0B;
        C76283tf r1 = new C76283tf(this.A08, r3, r4, this, this.A0G, this.A0H);
        this.A0D = r1;
        this.A06.setAdapter(r1);
    }

    private void setupSearchContainer(ViewGroup viewGroup) {
        this.A04 = C004601z.A0E(viewGroup, R.id.no_results);
        this.A05 = C004601z.A0E(viewGroup, R.id.retry_panel);
        this.A02 = C004601z.A0E(viewGroup, R.id.search_container);
        WaEditText waEditText = (WaEditText) C004601z.A0E(viewGroup, R.id.search_bar);
        this.A07 = waEditText;
        waEditText.addTextChangedListener(this.A0Q);
        this.A07.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 6));
        if (this.A0F != null) {
            WaEditText waEditText2 = this.A07;
            Resources resources = getResources();
            Object[] objArr = new Object[1];
            objArr[0] = this.A0F instanceof C25921Lq ? "Tenor" : "Giphy";
            waEditText2.setHint(resources.getString(R.string.str09c2, objArr));
        }
        this.A07.setOnEditorActionListener(new IDxAListenerShape211S0100000_2_I0(this, 0));
        View A0E2 = C004601z.A0E(viewGroup, R.id.clear_search_btn);
        this.A01 = A0E2;
        A0E2.setOnClickListener(this.A0S);
        this.A03 = C004601z.A0E(viewGroup, R.id.progress_container);
        C004601z.A0E(viewGroup, R.id.back).setOnClickListener(this.A0R);
        C004601z.A0E(viewGroup, R.id.retry_button).setOnClickListener(this.A0T);
    }

    private void setupViews(Activity activity) {
        if (getChildCount() <= 0) {
            ViewGroup viewGroup = (ViewGroup) activity.getLayoutInflater().inflate(R.layout.layout02bb, this, false);
            setupRecyclerView(viewGroup);
            setupSearchContainer(viewGroup);
            View view = this.A02;
            if (view != null) {
                viewGroup.removeView(view);
                if (this.A00 == 48) {
                    viewGroup.addView(this.A02, 0);
                } else {
                    viewGroup.addView(this.A02, viewGroup.getChildCount());
                }
            }
            addView(viewGroup);
        }
    }

    public void A00(Activity activity, AnonymousClass01V r5, C15860rz r6, C16490t9 r7, C47562Jm r8, C25841Li r9, C25861Lk r10, C108745Pe r11, C17020u3 r12, C23061Ai r13) {
        this.A0F = r10;
        this.A0C = r9;
        this.A0I = r13;
        this.A0B = r7;
        this.A08 = r5;
        this.A09 = r6;
        this.A0H = r12;
        this.A0G = r11;
        this.A0A = r8;
        setupViews(activity);
        setVisibility(0);
        this.A03.setVisibility(8);
        this.A04.setVisibility(8);
        this.A05.setVisibility(8);
        this.A03.setVisibility(0);
        C25861Lk r0 = this.A0F;
        if (r0 != null) {
            this.A0D.A0F(r0.A01());
        }
        this.A0L = "";
        this.A07.setText("");
        this.A07.requestFocus();
        this.A07.A04(false);
        C16490t9 r2 = this.A0B;
        C25861Lk r02 = this.A0F;
        C74353qP r1 = new C74353qP();
        r1.A00 = Integer.valueOf(r02.A00());
        r2.A06(r1);
    }

    public final void A01(CharSequence charSequence) {
        if (this.A0F != null) {
            this.A04.setVisibility(8);
            this.A05.setVisibility(8);
            this.A03.setVisibility(0);
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            AnonymousClass3R7 r2 = this.A0D;
            C25861Lk r1 = this.A0F;
            r2.A0F(isEmpty ? r1.A01() : r1 instanceof C25921Lq ? new IDxResultShape16S0200000_2_I0((C25921Lq) r1, charSequence) : new IDxResultShape16S0200000_2_I0((C25851Lj) r1, charSequence));
            this.A0L = charSequence.toString();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0J;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0J = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (getMeasuredHeight() != i5 - i3) {
            if (!this.A0N) {
                post(new RunnableRunnableShape9S0100000_I0_8(this, 19));
            }
            this.A0N = !this.A0N;
        }
        super.onLayout(z2, i2, i3, i4, i5);
    }

    public void onMeasure(int i2, int i3) {
        SharedPreferences sharedPreferences;
        String str;
        if (!isInEditMode()) {
            int size = View.MeasureSpec.getSize(i3);
            if (View.MeasureSpec.getMode(i3) != 1073741824 && !C23061Ai.A00(this)) {
                int i4 = getResources().getConfiguration().orientation;
                if (i4 == 1) {
                    sharedPreferences = (SharedPreferences) this.A09.A01.get();
                    str = "keyboard_height_portrait";
                } else if (i4 == 2) {
                    sharedPreferences = (SharedPreferences) this.A09.A01.get();
                    str = "keyboard_height_landscape";
                }
                int i5 = sharedPreferences.getInt(str, 0);
                if (i5 > 0) {
                    i3 = View.MeasureSpec.makeMeasureSpec(Math.min(size, i5), 1073741824);
                }
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setOnActionListener(C108015Mi r1) {
        this.A0E = r1;
    }

    public void setSearchContainerGravity(int i2) {
        this.A00 = i2;
    }
}
