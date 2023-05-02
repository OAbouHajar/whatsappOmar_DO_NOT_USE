package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass39V;
import X.AnonymousClass3K2;
import X.AnonymousClass3T3;
import X.C88244aB;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.obwhatsapp.account.delete.DeleteAccountConfirmation;
import com.obwhatsapp.account.delete.DeleteAccountFeedback;
import com.obwhatsapp.registration.ChangeNumberNotifyContacts;
import com.obwhatsapp.status.StatusesFragment;

public class IDxDListenerShape191S0100000_2_I1 implements ViewTreeObserver.OnPreDrawListener {
    public Object A00;
    public final int A01;

    public IDxDListenerShape191S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public boolean onPreDraw() {
        int i2;
        switch (this.A01) {
            case 0:
                DeleteAccountConfirmation deleteAccountConfirmation = (DeleteAccountConfirmation) this.A00;
                AnonymousClass3K2.A10(deleteAccountConfirmation.A03, this);
                deleteAccountConfirmation.A35();
                return false;
            case 1:
                DeleteAccountFeedback deleteAccountFeedback = (DeleteAccountFeedback) this.A00;
                AnonymousClass3K2.A10(deleteAccountFeedback.A04, this);
                deleteAccountFeedback.A35();
                return false;
            case 2:
                C88244aB r4 = (C88244aB) this.A00;
                AnonymousClass3T3 r3 = r4.A04;
                View view = r3.A05;
                AnonymousClass3K2.A10(view, this);
                r4.A00 = view.getMeasuredHeight();
                int A002 = C88244aB.A00((View) r3.A07.getParent());
                r4.A01 = A002;
                ViewGroup viewGroup = r3.A06;
                int A003 = A002 + C88244aB.A00(viewGroup.getChildAt(0));
                r4.A01 = A003;
                int i3 = 0;
                if (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    i3 = 0 + AnonymousClass000.A0O(viewGroup).topMargin + AnonymousClass000.A0O(viewGroup).bottomMargin;
                }
                if (viewGroup.getParent() instanceof View) {
                    ViewParent parent = viewGroup.getParent();
                    do {
                        View view2 = (View) parent;
                        if (view2 != view) {
                            i2 = i2 + view2.getPaddingTop() + view2.getPaddingTop();
                            if (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                                i2 = i2 + AnonymousClass000.A0O(view2).topMargin + AnonymousClass000.A0O(view2).bottomMargin;
                            }
                            parent = view2.getParent();
                        }
                        i2 = i2 + view.getPaddingTop() + view.getPaddingTop();
                    } while (parent instanceof View);
                    i2 = i2 + view.getPaddingTop() + view.getPaddingTop();
                }
                r4.A01 = A003 + i2;
                r3.requestLayout();
                return false;
            case 3:
                ChangeNumberNotifyContacts changeNumberNotifyContacts = (ChangeNumberNotifyContacts) this.A00;
                AnonymousClass3K2.A10(changeNumberNotifyContacts.A08, this);
                changeNumberNotifyContacts.A35();
                return false;
            case 4:
                StatusesFragment statusesFragment = (StatusesFragment) this.A00;
                statusesFragment.A19();
                AnonymousClass3K2.A10(statusesFragment.A04, this);
                statusesFragment.A1K(new IDxLAdapterShape4S0100000_2_I1(this, 12), true);
                return false;
            default:
                AnonymousClass39V r1 = (AnonymousClass39V) this.A00;
                AnonymousClass3K2.A10(r1.A02, this);
                r1.A01();
                return false;
        }
    }
}
