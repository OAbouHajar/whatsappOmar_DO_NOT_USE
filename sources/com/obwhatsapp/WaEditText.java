package com.obwhatsapp;

import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass1ZW;
import X.AnonymousClass2JO;
import X.AnonymousClass3HS;
import X.AnonymousClass5MR;
import X.C14900py;
import X.C26071Mf;
import X.C53072ew;
import X.C803443m;
import X.C99994uv;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Selection;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.obwhatsapp.components.PhoneNumberEntry;

public class WaEditText extends C14900py {
    public Rect A00;
    public AnonymousClass5MR A01;
    public AnonymousClass01V A02;
    public AnonymousClass013 A03;
    public boolean A04;
    public final Runnable A05 = new RunnableRunnableShape2S0100000_I0_1(this, 24);

    public WaEditText(Context context) {
        super(context);
    }

    public WaEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public WaEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && !isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0S);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setContentDescription(this.A03.A09(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(context.getString(resourceId2));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(this.A03.A09(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(this.A03.A09(resourceId4));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void A03() {
        InputMethodManager A0Q = this.A02.A0Q();
        this.A04 = false;
        removeCallbacks(this.A05);
        if (A0Q != null) {
            A0Q.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public void A04(boolean z2) {
        InputMethodManager A0Q = this.A02.A0Q();
        if (A0Q == null) {
            return;
        }
        if (A0Q.isFullscreenMode() && !z2) {
            return;
        }
        if (A0Q.isActive(this)) {
            this.A04 = false;
            removeCallbacks(this.A05);
            A0Q.showSoftInput(this, 0);
            return;
        }
        requestFocus();
        this.A04 = true;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.A04) {
            Runnable runnable = this.A05;
            removeCallbacks(runnable);
            post(runnable);
        }
        return onCreateInputConnection;
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException unused) {
            setText(AnonymousClass1ZW.A02(getText()));
        }
    }

    public boolean onTextContextMenuItem(int i2) {
        ClipboardManager A0B;
        ClipData primaryClip;
        AnonymousClass5MR r0 = this.A01;
        if (r0 != null) {
            PhoneNumberEntry phoneNumberEntry = ((C99994uv) r0).A00;
            if (!((i2 != 16908322 && i2 != 16908337) || (A0B = phoneNumberEntry.A05.A0B()) == null || (primaryClip = A0B.getPrimaryClip()) == null || primaryClip.getItemCount() == 0)) {
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                String charSequence = (itemAt == null || itemAt.getText() == null) ? "" : itemAt.getText().toString();
                if (charSequence.startsWith("+")) {
                    try {
                        AnonymousClass3HS A0E = C26071Mf.A00().A0E(charSequence, (String) null);
                        String num = Integer.toString(A0E.countryCode_);
                        String A012 = C26071Mf.A01(A0E);
                        if (AnonymousClass2JO.A00(phoneNumberEntry.A01, num, A012) == 1) {
                            phoneNumberEntry.A02.setText(num);
                            phoneNumberEntry.A03.setText(A012);
                        }
                    } catch (C803443m unused) {
                    }
                }
            }
        }
        return super.onTextContextMenuItem(i2);
    }

    public void setCursorPosition_internal(int i2, int i3) {
        int length = getText().length();
        Selection.setSelection(getText(), Math.min(i2, length), Math.min(i3, length));
    }

    public void setKeyFilter(String str) {
        if (str != null) {
            setKeyListener(DigitsKeyListener.getInstance(str));
        }
    }

    public void setOnContextMenuListener(AnonymousClass5MR r1) {
        this.A01 = r1;
    }

    public void setSpan_internal(Object obj, int i2, int i3, int i4) {
        getText().setSpan(obj, i2, Math.min(i3, getText().length()), i4);
    }

    public void setVisibleBounds(Rect rect) {
        this.A00 = rect;
    }
}
