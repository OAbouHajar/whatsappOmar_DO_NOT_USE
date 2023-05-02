package com.obwhatsapp.text;

import X.AnonymousClass000;
import X.AnonymousClass1ZW;
import X.AnonymousClass1yV;
import X.AnonymousClass22O;
import X.C008603x;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C15830rv;
import X.C16010sH;
import X.C16760tb;
import X.C18450wi;
import X.C30551cZ;
import X.C33741j5;
import X.C34621kZ;
import X.C40661uU;
import X.C41651wK;
import X.C41681wN;
import X.C42821yj;
import X.C45922Bq;
import X.C50262Yq;
import X.C76563uG;
import X.C86084Rd;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.animation.Animation;
import com.obwhatsapp.R;
import com.obwhatsapp.components.Button;
import com.obwhatsapp.inappbugreporting.InAppBugReportingActivity;
import com.obwhatsapp.inappbugreporting.InAppBugReportingViewModel;
import com.obwhatsapp.notification.PopupNotification;
import java.util.regex.Pattern;

public class IDxWAdapterShape101S0100000_1_I0 extends C41651wK {
    public Object A00;
    public final int A01;

    public IDxWAdapterShape101S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        C86084Rd r3;
        Editable editable2 = editable;
        switch (this.A01) {
            case 0:
                String obj = editable.toString();
                boolean z2 = !AnonymousClass1ZW.A0E(obj);
                C42821yj r1 = (C42821yj) this.A00;
                r1.A0S.setEnabled(z2);
                r1.A0L();
                if (r1.A0T.getVisibility() == 8 && !z2) {
                    C41651wK.A00(r1.A0T, true);
                    r1.A0T.setVisibility(0);
                    r1.A0R.startAnimation(AnonymousClass22O.A00(C13680ns.A1Z(r1.A2L), true, false));
                    r1.A0Q.startAnimation(AnonymousClass22O.A00(C13680ns.A1Z(r1.A2L), true, true));
                    r1.A0Q.setVisibility(0);
                    C41651wK.A00(r1.A0S, false);
                    r1.A0S.setVisibility(8);
                    int A0B = r1.A3P.A0B(r1.A33);
                    if (r1.A0u(A0B) && r1.A46.A01() != 0) {
                        r1.A46.A03(0);
                        r1.A46.A02().startAnimation(AnonymousClass22O.A00(C13680ns.A1Z(r1.A2L), true, true));
                        r1.A0T(A0B);
                    }
                } else if (r1.A0T.getVisibility() == 0 && z2) {
                    C41651wK.A00(r1.A0T, false);
                    r1.A0T.setVisibility(8);
                    r1.A0R.startAnimation(AnonymousClass22O.A00(C13680ns.A1Z(r1.A2L), false, false));
                    Animation A002 = AnonymousClass22O.A00(C13680ns.A1Z(r1.A2L), false, true);
                    C30551cZ.A00(A002, r1.A0Q, 0);
                    r1.A0Q.startAnimation(A002);
                    if (r1.A0u(r1.A3P.A0B(r1.A33)) && r1.A46.A01() != 8) {
                        Animation A003 = AnonymousClass22O.A00(C13680ns.A1Z(r1.A2L), false, true);
                        C30551cZ.A00(A003, r1.A46.A02(), 0);
                        r1.A46.A02().startAnimation(A003);
                        ObjectAnimator objectAnimator = r1.A03;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                    }
                    C41651wK.A00(r1.A0S, true);
                    r1.A0S.setVisibility(0);
                }
                C41681wN r6 = r1.A2D;
                C50262Yq r5 = r1.A1N;
                if (r5 == null) {
                    r5 = new C50262Yq(r1.A1M, r1.A3Y);
                    r1.A1N = r5;
                }
                r6.A05(editable, r5, false);
                AnonymousClass1yV r0 = r1.A22;
                C14550pN r02 = (C14550pN) r0;
                C45922Bq.A06((Context) r0, r1.A37.getPaint(), editable2, r02.A08, r02.A0B, r1.A3W);
                if (r1.A3k.A00 && (r3 = r1.A3m) != null && C14530pL.A0K(r1).A0V.A02) {
                    r3.A00(obj, 200);
                    return;
                }
                return;
            case 1:
                if (editable.length() > 0) {
                    C42821yj r32 = (C42821yj) this.A00;
                    if (!r32.A2f.A0P() && r32.A2K.A04() == 512) {
                        C33741j5 r12 = r32.A45;
                        if (r12 == null) {
                            r12 = new C33741j5(r32.A22.findViewById(R.id.conversation_fts_not_ready_view_stub));
                            r32.A45 = r12;
                        }
                        r12.A03(0);
                        return;
                    }
                }
                C42821yj r33 = (C42821yj) this.A00;
                C33741j5 r13 = r33.A45;
                if (r13 == null) {
                    r13 = new C33741j5(r33.A22.findViewById(R.id.conversation_fts_not_ready_view_stub));
                    r33.A45 = r13;
                }
                r13.A03(8);
                r33.A2C.A0E = editable.toString();
                C34621kZ r2 = r33.A2C;
                r2.A0G = C40661uU.A02(r33.A2L, r2.A0E);
                C34621kZ r14 = r33.A2C;
                r14.A0F = r14.A0E;
                r33.A1n.getConversationCursorAdapter().A02++;
                r33.A1n.A02();
                return;
            case 3:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                popupNotification.A15.A01(true);
                String obj2 = editable.toString();
                C16010sH r03 = popupNotification.A0q;
                if (r03 != null) {
                    int length = obj2.length();
                    C16760tb r22 = popupNotification.A0O;
                    C15830rv A02 = C16010sH.A02(r03);
                    if (length != 0) {
                        r22.A0E(A02, 0);
                    } else {
                        r22.A0B(A02);
                    }
                }
                C45922Bq.A06(popupNotification, popupNotification.A0d.getPaint(), editable2, popupNotification.A08, popupNotification.A0B, popupNotification.A14);
                boolean z3 = !AnonymousClass1ZW.A0E(obj2);
                popupNotification.A0B.setEnabled(z3);
                if (popupNotification.A0C.getVisibility() == 8 && !z3) {
                    C41651wK.A00(popupNotification.A0C, true);
                    popupNotification.A0C.setVisibility(0);
                    C41651wK.A00(popupNotification.A0B, false);
                    popupNotification.A0B.setVisibility(8);
                    return;
                } else if (popupNotification.A0C.getVisibility() == 0 && z3) {
                    C41651wK.A00(popupNotification.A0C, false);
                    popupNotification.A0C.setVisibility(8);
                    C41651wK.A00(popupNotification.A0B, true);
                    popupNotification.A0B.setVisibility(0);
                    return;
                } else {
                    return;
                }
            default:
                super.afterTextChanged(editable);
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int codePointCount;
        switch (this.A01) {
            case 0:
                C41681wN r3 = ((C42821yj) this.A00).A2D;
                boolean z2 = false;
                if (i4 > i3 && ((codePointCount = Character.codePointCount(charSequence, i2, i4 + i2)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i2))))) {
                    z2 = true;
                }
                r3.A07 = z2;
                return;
            case 2:
                C18450wi.A0H(charSequence, 0);
                InAppBugReportingActivity inAppBugReportingActivity = (InAppBugReportingActivity) this.A00;
                Button button = inAppBugReportingActivity.A09;
                if (button == null) {
                    throw C18450wi.A03("submitButton");
                }
                button.setEnabled(AnonymousClass000.A1Q(charSequence.length()));
                InAppBugReportingViewModel inAppBugReportingViewModel = (InAppBugReportingViewModel) inAppBugReportingActivity.A0I.getValue();
                String replaceAll = Pattern.compile("[^\\p{L}\\p{N}\\p{P}\\p{Z}]").matcher(C008603x.A04(charSequence.toString()).toString()).replaceAll("");
                C18450wi.A0B(replaceAll);
                if (replaceAll.length() >= 10) {
                    inAppBugReportingViewModel.A03.A0B(C76563uG.A00);
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i2, i3, i4);
                return;
        }
    }
}
