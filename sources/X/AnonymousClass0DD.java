package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatSpinner;
import com.facebook.redex.IDxLListenerShape143S0100000_I1;

/* renamed from: X.0DD  reason: invalid class name */
public class AnonymousClass0DD extends AnonymousClass0ZW implements C13400ly {
    public int A00;
    public ListAdapter A01;
    public CharSequence A02;
    public final Rect A03 = AnonymousClass000.A0J();
    public final /* synthetic */ AppCompatSpinner A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0DD(Context context, AttributeSet attributeSet, AppCompatSpinner appCompatSpinner, int i2) {
        super(context, attributeSet, i2, 0);
        this.A04 = appCompatSpinner;
        this.A07 = appCompatSpinner;
        this.A0E = true;
        this.A0A.setFocusable(true);
        this.A08 = new AnonymousClass0Z3(this, appCompatSpinner);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r9 = this;
            android.widget.PopupWindow r2 = r9.A0A
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            r3 = 0
            androidx.appcompat.widget.AppCompatSpinner r4 = r9.A04
            android.graphics.Rect r7 = r4.A05
            if (r0 == 0) goto L_0x0079
            r0.getPadding(r7)
            int r1 = X.C004601z.A06(r4)
            r0 = 1
            if (r1 != r0) goto L_0x0075
            int r3 = r7.right
        L_0x0019:
            int r8 = r4.getPaddingLeft()
            int r6 = r4.getPaddingRight()
            int r5 = r4.getWidth()
            int r1 = r4.A00
            r0 = -2
            if (r1 != r0) goto L_0x006a
            android.widget.ListAdapter r1 = r9.A01
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            int r2 = r4.A00(r0, r1)
            android.content.Context r0 = r4.getContext()
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0M(r0)
            int r1 = r0.widthPixels
            int r0 = r7.left
            int r1 = r1 - r0
            int r0 = r7.right
            int r1 = r1 - r0
            if (r2 <= r1) goto L_0x0049
            r2 = r1
        L_0x0049:
            int r0 = r5 - r8
            int r0 = r0 - r6
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0050:
            r9.A01(r0)
        L_0x0053:
            int r1 = X.C004601z.A06(r4)
            r0 = 1
            if (r1 != r0) goto L_0x0065
            int r5 = r5 - r6
            int r0 = r9.A03
            int r5 = r5 - r0
            int r0 = r9.A00
            int r5 = r5 - r0
            int r3 = r3 + r5
        L_0x0062:
            r9.A01 = r3
            return
        L_0x0065:
            int r0 = r9.A00
            int r8 = r8 + r0
            int r3 = r3 + r8
            goto L_0x0062
        L_0x006a:
            r0 = -1
            if (r1 != r0) goto L_0x0071
            int r0 = r5 - r8
            int r0 = r0 - r6
            goto L_0x0050
        L_0x0071:
            r9.A01(r1)
            goto L_0x0053
        L_0x0075:
            int r0 = r7.left
            int r3 = -r0
            goto L_0x0019
        L_0x0079:
            r7.right = r3
            r7.left = r3
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DD.A02():void");
    }

    public CharSequence ACd() {
        return this.A02;
    }

    public void AdW(ListAdapter listAdapter) {
        super.AdW(listAdapter);
        this.A01 = listAdapter;
    }

    public void Ae2(int i2) {
        this.A00 = i2;
    }

    public void AeQ(CharSequence charSequence) {
        this.A02 = charSequence;
    }

    public void AfU(int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.A0A;
        boolean isShowing = popupWindow.isShowing();
        A02();
        popupWindow.setInputMethodMode(2);
        super.AfT();
        AnonymousClass0CV r2 = this.A0B;
        r2.setChoiceMode(1);
        if (Build.VERSION.SDK_INT >= 17) {
            r2.setTextDirection(i2);
            r2.setTextAlignment(i3);
        }
        AppCompatSpinner appCompatSpinner = this.A04;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        AnonymousClass0CV r1 = this.A0B;
        if (popupWindow.isShowing() && r1 != null) {
            r1.A0B = false;
            r1.setSelection(selectedItemPosition);
            if (r1.getChoiceMode() != 0) {
                r1.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) != null) {
            IDxLListenerShape143S0100000_I1 iDxLListenerShape143S0100000_I1 = new IDxLListenerShape143S0100000_I1(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(iDxLListenerShape143S0100000_I1);
            popupWindow.setOnDismissListener(new AnonymousClass0ZB(iDxLListenerShape143S0100000_I1, this));
        }
    }
}
