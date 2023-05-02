package com.facebook.redex;

import X.AnonymousClass09P;
import X.AnonymousClass1ZK;
import X.AnonymousClass26F;
import X.AnonymousClass2VA;
import X.AnonymousClass39Y;
import X.C100384vY;
import X.C29251aI;
import X.C42821yj;
import X.C46202Cw;
import X.C53742gD;
import X.C57542rL;
import android.graphics.PointF;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import com.obwhatsapp.biz.catalog.view.activity.ProductListActivity;
import com.obwhatsapp.calling.views.VoipCallControlBottomSheetDragIndicator;
import com.obwhatsapp.notification.PopupNotification;
import com.obwhatsapp.quickcontact.QuickContactActivity;
import com.obwhatsapp.status.playback.MessageReplyActivity;
import com.obwhatsapp.status.playback.StatusPlaybackActivity;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackFragment;

public class IDxTListenerShape167S0100000_2_I0 implements View.OnTouchListener {
    public Object A00;
    public final int A01;

    public IDxTListenerShape167S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int maxZoom;
        boolean z2;
        AnonymousClass1ZK r2;
        ImageButton imageButton;
        StatusPlaybackFragment A35;
        switch (this.A01) {
            case 0:
                ProductListActivity productListActivity = (ProductListActivity) this.A00;
                int action = motionEvent.getAction();
                if (action != 1) {
                    if (action != 2 || productListActivity.A03.canScrollVertically(-1) || !productListActivity.A0O) {
                        return false;
                    }
                    C57542rL r22 = productListActivity.A0D;
                    if (r22.A0E()) {
                        return false;
                    }
                    r22.A09.add(0, new C100384vY());
                    r22.A03(0);
                    return false;
                } else if (!productListActivity.A0O || !productListActivity.A0D.A0E()) {
                    return false;
                } else {
                    C57542rL r1 = productListActivity.A0D;
                    if (r1.A0E()) {
                        r1.A09.remove(0);
                        r1.A04(0);
                    }
                    if (!productListActivity.A07.A0A()) {
                        return false;
                    }
                    productListActivity.A0E.A06();
                    productListActivity.A0O = false;
                    return false;
                }
            case 1:
                AnonymousClass26F r12 = (AnonymousClass26F) this.A00;
                r12.A0B(motionEvent, r12.A0A);
                return false;
            case 2:
                ((VoipCallControlBottomSheetDragIndicator) this.A00).A02(motionEvent.getAction());
                return true;
            case 3:
                AnonymousClass2VA r13 = ((C29251aI) this.A00).A0B;
                r13.A03.A00(motionEvent);
                r13.A02.onTouchEvent(motionEvent);
                return true;
            case 4:
                C29251aI r4 = (C29251aI) this.A00;
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = false;
                if (!r4.A0C.AJZ()) {
                    r4.A0Y = false;
                    return false;
                } else if (actionMasked == 1) {
                    if (!r4.A0X() || r4.A0D.A00 == 2) {
                        return false;
                    }
                    r4.A0W(r4.A0J.A02());
                    return false;
                } else if (actionMasked == 2 && motionEvent.getPointerCount() == 1) {
                    if (r4.A0D.A00 == 2) {
                        return false;
                    }
                    r4.A0Y = false;
                    if (motionEvent.getY() >= 0.0f || (maxZoom = r4.A0C.getMaxZoom()) <= 0) {
                        return false;
                    }
                    float height = (float) (r4.A08.getHeight() / 2);
                    int min = (int) (((float) maxZoom) * (Math.min(height, -motionEvent.getY()) / height));
                    if (min > 0) {
                        z3 = true;
                    }
                    r4.A0Y = z3;
                    r4.A0C.Af4(min);
                    return false;
                } else if (motionEvent.getPointerCount() <= 1 || r4.A0Y) {
                    return false;
                } else {
                    r4.A08.onTouchEvent(motionEvent);
                    return false;
                }
            case 5:
                AnonymousClass09P r0 = (AnonymousClass09P) this.A00;
                if (motionEvent == null) {
                    return true;
                }
                r0.A00(motionEvent);
                return true;
            case 6:
                C42821yj r3 = (C42821yj) this.A00;
                if (r3.A2w.A01()) {
                    return false;
                }
                r3.A0L();
                r3.A0E();
                r3.A4F.A0H(motionEvent, r3.A0T, r3.A4Y);
                return false;
            case 7:
                ((PointF) this.A00).set(motionEvent.getX(), motionEvent.getY());
                return false;
            case 8:
                AnonymousClass39Y r42 = ((C53742gD) this.A00).A0G;
                r42.A08.A00.invalidate();
                r42.A09.A00(motionEvent, (float) r42.A02, r42.A01, r42.A04);
                return true;
            case 9:
                motionEvent.getX();
                motionEvent.getY();
                view.performClick();
                return false;
            case 10:
                return ((PopupNotification) this.A00).A2w();
            case 11:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                z2 = false;
                if (!popupNotification.A0s.A01()) {
                    r2 = popupNotification.A1I;
                    imageButton = popupNotification.A0C;
                    break;
                } else {
                    return false;
                }
            case 12:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                if (quickContactActivity.A0j.A03 != 2) {
                    return true;
                }
                quickContactActivity.A37(true);
                return true;
            case 13:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                z2 = false;
                if (!messageReplyActivity.A0g.A01() && (r2 = messageReplyActivity.A16) != null) {
                    imageButton = messageReplyActivity.A0B;
                    break;
                } else {
                    return false;
                }
                break;
            case 14:
                StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A00;
                int action2 = motionEvent.getAction() & MotionEventCompat.ACTION_MASK;
                if ((action2 != 1 && action2 != 3) || motionEvent.getPointerCount() != 1 || (A35 = statusPlaybackActivity.A35()) == null || A35.A1F()) {
                    return false;
                }
                A35.A1A();
                return false;
            default:
                return C46202Cw.A0J(motionEvent, (C46202Cw) this.A00);
        }
        r2.A0H(motionEvent, imageButton, z2);
        return false;
    }
}
