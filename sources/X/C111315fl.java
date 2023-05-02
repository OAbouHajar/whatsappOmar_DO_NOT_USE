package X;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.facebook.redex.IDxLListenerShape146S0100000_3_I1;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.numberkeyboard.NumberEntryKeyboard;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5fl  reason: invalid class name and case insensitive filesystem */
public class C111315fl extends AnonymousClass2JI {
    public int A00 = this.A01.getMeasuredHeight();
    public NumberEntryKeyboard A01;
    public AnonymousClass1VR A02;
    public List A03;

    public C111315fl(Activity activity, C16300so r13, C15430qs r14, AnonymousClass01V r15, C15860rz r16, C109375Rw r17, AnonymousClass1VR r18, C23061Ai r19, List list) {
        super(activity, r13, r14, r15, r16, r19);
        AnonymousClass1VR r1 = r18;
        this.A02 = r1;
        List list2 = list;
        this.A03 = list2;
        NumberEntryKeyboard numberEntryKeyboard = new NumberEntryKeyboard(activity);
        this.A01 = numberEntryKeyboard;
        numberEntryKeyboard.A06 = r1;
        numberEntryKeyboard.setCustomKey(r17);
        this.A02.setCustomCursorEnabled(true);
        setContentView(this.A01);
        setTouchable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setAnimationStyle(0);
        setBackgroundDrawable(new ColorDrawable(-1));
        setTouchInterceptor(new C119685ys(this, list2));
        this.A01.measure(View.MeasureSpec.makeMeasureSpec(activity.getWindowManager().getDefaultDisplay().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public int A03(int i2) {
        return this.A00;
    }

    public void A06() {
        if (!isShowing()) {
            super.A06();
            Iterator it = this.A03.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View view = (View) it.next();
                if (C23061Ai.A00(view)) {
                    if (view != null) {
                        C15430qs r8 = this.A05;
                        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r8;
                        keyboardPopupLayout.A06 = true;
                        if (!this.A06.A0Q().hideSoftInputFromWindow(view.getWindowToken(), 0, new AnonymousClass3M6(AnonymousClass000.A0L(), new C1208063b(this), this.A0A))) {
                            keyboardPopupLayout.A06 = false;
                            ((View) r8).requestLayout();
                            return;
                        }
                        return;
                    }
                }
            }
            A0A();
        }
    }

    public final void A0A() {
        if (!isShowing()) {
            Activity activity = this.A03;
            if (activity.getCurrentFocus() != null) {
                activity.getCurrentFocus().clearFocus();
            }
            setHeight(this.A00);
            setWidth(-1);
            C15430qs r4 = this.A05;
            r4.setKeyboardPopup(this);
            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r4;
            if (keyboardPopupLayout.A06) {
                View view = (View) r4;
                view.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape146S0100000_3_I1(this, 0));
                keyboardPopupLayout.A06 = false;
                view.requestLayout();
            } else if (!isShowing()) {
                showAtLocation((View) r4, 48, 0, 1000000);
            }
            this.A02.setHasFocus(true);
        }
    }

    public void dismiss() {
        this.A02.setHasFocus(false);
        super.dismiss();
    }
}
