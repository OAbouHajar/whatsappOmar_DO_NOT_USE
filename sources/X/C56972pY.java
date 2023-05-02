package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.obwhatsapp.R;

/* renamed from: X.2pY  reason: invalid class name and case insensitive filesystem */
public class C56972pY extends PopupWindow {
    public View A00;
    public int[] A01 = new int[2];
    public final View A02;
    public final C108715Pb A03;
    public final int[][] A04;

    public C56972pY(View view, C108715Pb r12, C17250um r13, int[] iArr) {
        super(new LinearLayout(view.getContext()), -2, -2);
        this.A02 = view;
        this.A03 = r12;
        LinearLayout linearLayout = (LinearLayout) getContentView();
        linearLayout.setId(R.id.single_skin_tone_selector);
        linearLayout.setOrientation(0);
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setFocusable(true);
        int dimensionPixelSize = C13680ns.A0D(view).getDimensionPixelSize(R.dimen.dimen035b);
        int dimensionPixelSize2 = (dimensionPixelSize - C13680ns.A0D(view).getDimensionPixelSize(R.dimen.dimen0359)) / 2;
        this.A04 = C62153Bw.A0A(iArr);
        int i2 = 0;
        while (true) {
            int[][] iArr2 = this.A04;
            if (i2 < iArr2.length) {
                int[] iArr3 = iArr2[i2];
                ImageView imageView = new ImageView(view.getContext());
                imageView.setId(R.id.single_skin_tone_selector_item);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                imageView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                C17250um.A00(view.getResources(), imageView, r13, iArr3);
                imageView.setTag(Integer.valueOf(i2));
                C13680ns.A16(imageView, this, 0);
                imageView.setBackgroundResource(R.drawable.selector_orange_gradient);
                imageView.setContentDescription(C37781pj.A00(iArr3));
                linearLayout.addView(imageView);
                i2++;
            } else {
                C13680ns.A12(linearLayout);
                setTouchable(true);
                setFocusable(true);
                setOutsideTouchable(true);
                setInputMethodMode(2);
                setBackgroundDrawable(AnonymousClass2SR.A02(view.getContext(), R.drawable.panel, R.color.color0727));
                linearLayout.requestFocus();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
        }
    }
}
