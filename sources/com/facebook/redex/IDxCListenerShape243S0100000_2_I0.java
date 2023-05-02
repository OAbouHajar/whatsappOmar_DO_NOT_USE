package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass2Ut;
import X.AnonymousClass2X5;
import X.C53742gD;
import X.C57502rH;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.search.SearchFragment;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;
import com.whatsapp.voipcalling.VoipActivityV2;

public class IDxCListenerShape243S0100000_2_I0 implements View.OnLayoutChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape243S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i4;
        int i11 = i8;
        int i12 = i2;
        int i13 = i3;
        int i14 = i5;
        int i15 = i6;
        switch (this.A01) {
            case 0:
                C53742gD r6 = (C53742gD) this.A00;
                Window window = r6.getWindow();
                if (window != null) {
                    int[] iArr = new int[2];
                    r6.A04.getLocationOnScreen(iArr);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) r6.A04.getLayoutParams();
                    ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(r6.A02);
                    int rotation = window.getWindowManager().getDefaultDisplay().getRotation();
                    if (r6.A00 != rotation) {
                        r6.A00 = rotation;
                        layoutParams.rightMargin = 0;
                        layoutParams.leftMargin = 0;
                        layoutParams.topMargin = 0;
                        int i16 = 0;
                        layoutParams.bottomMargin = 0;
                        if (rotation == 0) {
                            i16 = r6.A0J[1] - iArr[1];
                            layoutParams.topMargin = i16;
                        } else if (rotation == 1) {
                            layoutParams.leftMargin = r6.A0J[0] - iArr[0];
                        } else if (rotation == 2) {
                            layoutParams.bottomMargin = r6.A0J[1] - iArr[1];
                        } else if (rotation == 3) {
                            layoutParams.rightMargin = r6.A0J[0] - iArr[0];
                        }
                        if (r6.A0I) {
                            A0O.setMargins(0, i16, 0, 0);
                            AnonymousClass000.A0O(r6.A08).setMargins(0, layoutParams.topMargin, 0, 0);
                        }
                        r6.A02.setLayoutParams(A0O);
                        r6.A04.setLayoutParams(layoutParams);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                AnonymousClass2Ut r62 = (AnonymousClass2Ut) this.A00;
                TextView textView = r62.A09;
                int width = textView.getWidth();
                TextView textView2 = r62.A08;
                int width2 = textView2.getWidth();
                if (width <= width2) {
                    textView2 = textView;
                }
                int max = Math.max(width, width2);
                ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                if (max != layoutParams2.width) {
                    layoutParams2.width = max;
                    textView2.post(new RunnableRunnableShape8S0200000_I0_6(textView2, 30, layoutParams2));
                }
                if (AnonymousClass000.A1X(r62.A0F.A01())) {
                    View view2 = r62.A03;
                    ViewGroup.MarginLayoutParams A0O2 = AnonymousClass000.A0O(view2);
                    int dimensionPixelSize = view2.getResources().getDimensionPixelSize(R.dimen.dimen0728) + view2.getResources().getDimensionPixelSize(R.dimen.dimen0721) + (max << 1);
                    if (A0O2.width != dimensionPixelSize) {
                        A0O2.width = dimensionPixelSize;
                        view2.post(new RunnableRunnableShape8S0200000_I0_6(r62, 31, A0O2));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                AnonymousClass2X5 r0 = (AnonymousClass2X5) this.A00;
                int i17 = i4 - i2;
                if (i8 - i6 != i17) {
                    C57502rH r2 = r0.A09;
                    AnonymousClass2X5 r1 = r2.A03;
                    r2.A01 = r1.A00(i17, r1.A00);
                    return;
                }
                return;
            case 3:
                view.removeOnLayoutChangeListener(this);
                SearchFragment searchFragment = (SearchFragment) this.A00;
                searchFragment.A1E(new RunnableRunnableShape19S0100000_I1_2(searchFragment, 42), i2, i3, i10, i14, true);
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) this.A00;
                Editable text = textStatusComposerActivity.A0a.getText();
                if (text != null) {
                    textStatusComposerActivity.A0a.setCursorPosition(text.length());
                    return;
                }
                return;
            default:
                VoipActivityV2.A0p((VoipActivityV2) this.A00, i12, i13, i10, i14, i15, i7, i11, i9);
                return;
        }
    }
}
