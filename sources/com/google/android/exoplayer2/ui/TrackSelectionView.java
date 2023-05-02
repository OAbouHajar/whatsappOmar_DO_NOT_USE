package com.google.android.exoplayer2.ui;

import X.AnonymousClass5LV;
import X.C13680ns;
import X.C13690nt;
import X.C93604jT;
import X.C97564qC;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.facebook.redex.ViewOnClickCListenerShape15S0100000_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;

public class TrackSelectionView extends LinearLayout {
    public C93604jT A00;
    public AnonymousClass5LV A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray A05;
    public final LayoutInflater A06;
    public final CheckedTextView A07;
    public final CheckedTextView A08;
    public final ViewOnClickCListenerShape15S0100000_I1 A09;

    public TrackSelectionView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setOrientation(1);
        this.A05 = new SparseArray();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.A06 = from;
        ViewOnClickCListenerShape15S0100000_I1 viewOnClickCListenerShape15S0100000_I1 = new ViewOnClickCListenerShape15S0100000_I1((Object) this, 0);
        this.A09 = viewOnClickCListenerShape15S0100000_I1;
        this.A01 = new C97564qC(getResources());
        this.A00 = C93604jT.A03;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.A08 = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.str1caf);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickCListenerShape15S0100000_I1);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(R.layout.layout026b, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.A07 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.str1cae);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickCListenerShape15S0100000_I1);
        addView(checkedTextView2);
    }

    public final void A00() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        this.A08.setEnabled(false);
        this.A07.setEnabled(false);
    }

    public boolean getIsDisabled() {
        return this.A04;
    }

    public List getOverrides() {
        SparseArray sparseArray = this.A05;
        ArrayList A0i = C13690nt.A0i(sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            A0i.add(sparseArray.valueAt(i2));
        }
        return A0i;
    }

    public void setAllowAdaptiveSelections(boolean z2) {
        if (this.A02 != z2) {
            this.A02 = z2;
            A00();
        }
    }

    public void setAllowMultipleOverrides(boolean z2) {
        if (this.A03 != z2) {
            this.A03 = z2;
            if (!z2) {
                SparseArray sparseArray = this.A05;
                if (sparseArray.size() > 1) {
                    for (int size = sparseArray.size() - 1; size > 0; size--) {
                        sparseArray.remove(size);
                    }
                }
            }
            A00();
        }
    }

    public void setShowDisableOption(boolean z2) {
        this.A08.setVisibility(C13680ns.A02(z2 ? 1 : 0));
    }

    public void setTrackNameProvider(AnonymousClass5LV r1) {
        this.A01 = r1;
        A00();
    }
}
