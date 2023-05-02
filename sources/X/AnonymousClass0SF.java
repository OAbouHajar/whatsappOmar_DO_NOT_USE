package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.redex.IDxCListenerShape317S0100000_I1;
import com.instagram.common.thread.ThreadUtil;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: X.0SF  reason: invalid class name */
public class AnonymousClass0SF {
    public AnonymousClass0C9 A00;
    public AnonymousClass0CA A01;
    public AnonymousClass0Q0 A02;
    public AnonymousClass0QZ A03;
    public C03880Kf A04;
    public AnonymousClass0A2 A05;
    public C31201dg A06;
    public Integer A07;
    public boolean A08 = false;
    public final Deque A09 = new ArrayDeque();
    public final Deque A0A = new ArrayDeque();
    public final Deque A0B = new ArrayDeque();
    public final Deque A0C = new ArrayDeque();

    public final int A00() {
        Number number = (Number) this.A0B.peek();
        if (number != null) {
            return number.intValue();
        }
        C29691b2.A00("CDSBloksBottomSheetDelegate", "Attempting to check the current keyboard soft input mode but found null.");
        return 32;
    }

    public void A01(int i2) {
        AnonymousClass0CA r2;
        AnonymousClass0QZ r22;
        if (this.A01 != null) {
            this.A0C.peek();
            AnonymousClass0KQ r1 = AnonymousClass0KQ.DEFAULT;
            if (this.A01.A03 != null) {
                AnonymousClass0XA.A06(r1, AnonymousClass0JS.A01);
            }
        }
        if (i2 == 0) {
            AnonymousClass0QZ r3 = this.A03;
            if (r3 != null && (r2 = this.A01) != null) {
                r3.A02.post(new C10100ga(r2, r3));
            }
        } else if (i2 != 5) {
            if (i2 == 6 && (r22 = this.A03) != null) {
                r22.A02.post(new C09640fq(r22));
            }
        } else if (this.A02 != null && this.A01 != null) {
            AnonymousClass0QZ r23 = this.A03;
            if (r23 != null) {
                r23.A02.post(new C09640fq(r23));
            }
            ThreadUtil.runOnUiThread(new C09620fo(this));
            AnonymousClass0Q0 r32 = this.A02;
            r32.A02.post(new C10090gZ(this.A01, r32));
        }
    }

    public final void A02(int i2) {
        C14990q7 r0 = (C14990q7) this.A0A.peek();
        if (r0 != null) {
            Context A002 = r0.A00();
            if (A002 instanceof Activity) {
                Activity activity = (Activity) A002;
                if (activity.getWindow() != null) {
                    Window window = activity.getWindow();
                    window.setSoftInputMode(i2);
                }
                return;
            }
        }
        AnonymousClass0A2 r02 = this.A05;
        if (r02 == null || (window = r02.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(i2);
    }

    public void A03(Context context) {
        C14930q1 A012;
        C31201dg A002;
        AnonymousClass0QM r1 = (AnonymousClass0QM) this.A09.peek();
        C14990q7 r4 = (C14990q7) this.A0A.peek();
        AnonymousClass0C9 r0 = this.A00;
        if (!(r0 == null || r0.getVisibility() == 0)) {
            this.A00.setVisibility(0);
        }
        if (r1 != null && (A012 = r1.A01()) != null && (A002 = r1.A00()) != null && r4 != null) {
            C14940q2 r02 = new C14940q2();
            r02.A02(r4, 0);
            C29701b3.A01(r4, A002, r02.A01(), A012);
        } else if (this.A0C.size() > 1) {
            A04(context);
        } else {
            AnonymousClass0A2 r03 = this.A05;
            if (r03 != null) {
                r03.dismiss();
            }
        }
    }

    public final void A04(Context context) {
        String str;
        C05070Pd r3 = (C05070Pd) this.A0C.pop();
        this.A0B.pop();
        A02(A00());
        Deque deque = this.A0A;
        if (!deque.isEmpty()) {
            deque.pop();
            this.A09.pop();
        }
        AnonymousClass0C9 r0 = this.A00;
        if (r0 != null) {
            View primaryChild = r0.A01.getPrimaryChild();
            if (primaryChild != null) {
                r3.A00.A08();
                primaryChild.addOnAttachStateChangeListener(new IDxCListenerShape317S0100000_I1(r3, 2));
                A05(context);
                return;
            }
            str = "Bottom sheet layout pager must have a non-null view.";
        } else {
            str = "Cannot pop Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().";
        }
        throw AnonymousClass000.A0V(str);
    }

    public final void A05(Context context) {
        String str;
        C05070Pd r3 = (C05070Pd) this.A0C.peek();
        if (r3 == null) {
            str = "Cannot pop Screen content with an empty CDS bottom sheet or full screen.";
        } else if (this.A00 != null) {
            AnonymousClass0QZ r2 = this.A03;
            if (r2 != null) {
                r2.A02.post(new C09640fq(r2));
            }
            AnonymousClass0Q0 r22 = this.A02;
            if (r22 != null) {
                r22.A02.post(new C09630fp(r22));
            }
            this.A00.A01.A03((View) r3.A00.A04(context).first, (AnonymousClass0KW) null, false);
            C57842s0 A002 = r3.A00();
            AnonymousClass0C9 r0 = this.A00;
            if (r0 != null) {
                ViewGroup viewGroup = r0.A00;
                viewGroup.removeAllViews();
                viewGroup.addView(A002);
                return;
            }
            return;
        } else {
            str = "Cannot pop Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().";
        }
        throw AnonymousClass000.A0V(str);
    }

    public final void A06(Context context, C05070Pd r5, AnonymousClass0KW r6, C14990q7 r7, C31201dg r8, C14930q1 r9, int i2) {
        if (this.A00 != null) {
            this.A00.A01.A03((View) r5.A00.A04(context).first, r6, true);
            C57842s0 A002 = r5.A00();
            AnonymousClass0C9 r0 = this.A00;
            if (r0 != null) {
                ViewGroup viewGroup = r0.A00;
                viewGroup.removeAllViews();
                viewGroup.addView(A002);
            }
            this.A0C.push(r5);
            this.A0B.push(Integer.valueOf(i2));
            this.A0A.push(r7);
            this.A09.push(new AnonymousClass0QM(r8, r9));
            A02(A00());
            return;
        }
        throw AnonymousClass000.A0V("Cannot push Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
    }

    public void A07(Context context, String str) {
        String str2;
        Deque deque = this.A0C;
        if (deque.isEmpty() || this.A00 == null) {
            str2 = "Cannot pop from an empty bottom sheet.";
        } else if (deque.size() == 1) {
            str2 = "Attempting to pop to the root screen in the CDS bottom sheet or full screen, so no pop action was performed. This is a no-op.";
        } else if (str == null) {
            A04(context);
            return;
        } else {
            A08(context, str);
            return;
        }
        C29691b2.A00("CDSBloksBottomSheetDelegate", str2);
    }

    public void A08(Context context, String str) {
        String str2;
        Deque<C05070Pd> deque = this.A0C;
        C05070Pd r0 = (C05070Pd) deque.peekFirst();
        if (r0 == null || str.equals(r0.A02)) {
            str2 = "Attempting to pop to the current screen in the CDS bottom sheet, so no pop action was performed. This is a no-op.";
        } else {
            int i2 = 0;
            for (C05070Pd r02 : deque) {
                if (!str.equals(r02.A02)) {
                    i2++;
                } else {
                    for (int i3 = 0; i3 < i2; i3++) {
                        A04(context);
                    }
                    return;
                }
            }
            str2 = "No screen found with target ID, so no screens were popped.";
        }
        C29691b2.A00("CDSBloksBottomSheetDelegate", str2);
    }
}
