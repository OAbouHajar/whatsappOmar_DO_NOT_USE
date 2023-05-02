package X;

import android.text.Editable;
import android.text.TextUtils;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import com.obwhatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.35P  reason: invalid class name */
public class AnonymousClass35P extends C41651wK {
    public final /* synthetic */ C16010sH A00;
    public final /* synthetic */ MessageReplyActivity A01;

    public AnonymousClass35P(C16010sH r1, MessageReplyActivity messageReplyActivity) {
        this.A01 = messageReplyActivity;
        this.A00 = r1;
    }

    public static Animation A01(boolean z2, boolean z3) {
        AlphaAnimation alphaAnimation;
        ScaleAnimation scaleAnimation;
        AnimationSet animationSet = new AnimationSet(true);
        if (!z3) {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setDuration(100);
        animationSet.addAnimation(alphaAnimation);
        float f2 = 0.0f;
        if (z3) {
            if (z2) {
                f2 = 1.0f;
            }
            scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, f2, 1, 0.5f);
        } else {
            if (z2) {
                f2 = 1.0f;
            }
            scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f, 1, f2, 1, 0.5f);
        }
        scaleAnimation.setDuration(100);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setDuration(100);
        return animationSet;
    }

    public void afterTextChanged(Editable editable) {
        boolean z2;
        C86084Rd r1;
        Editable editable2 = editable;
        String obj = editable.toString();
        boolean isEmpty = TextUtils.isEmpty(obj);
        MessageReplyActivity messageReplyActivity = this.A01;
        C16760tb r3 = messageReplyActivity.A0D;
        C15830rv A02 = C16010sH.A02(this.A00);
        if (!isEmpty) {
            r3.A0E(A02, 0);
        } else {
            r3.A0B(A02);
        }
        C17250um r11 = messageReplyActivity.A0B;
        C45922Bq.A06(messageReplyActivity, messageReplyActivity.A0m.getPaint(), editable2, messageReplyActivity.A08, r11, messageReplyActivity.A0r);
        if (TextUtils.getTrimmedLength(obj) > 0) {
            z2 = true;
            messageReplyActivity.A06.setVisibility(8);
        } else {
            z2 = false;
            if (messageReplyActivity.A19) {
                messageReplyActivity.A06.setVisibility(0);
            }
        }
        messageReplyActivity.A0A.setEnabled(z2);
        if (messageReplyActivity.A0B.getVisibility() == 8 && !z2) {
            C41651wK.A00(messageReplyActivity.A0B, true);
            messageReplyActivity.A0B.setVisibility(0);
            messageReplyActivity.A08.startAnimation(AnonymousClass22O.A00(C13680ns.A1Z(messageReplyActivity.A01), true, false));
            messageReplyActivity.A07.startAnimation(A01(C13680ns.A1Z(messageReplyActivity.A01), true));
            messageReplyActivity.A07.setVisibility(0);
            C41651wK.A00(messageReplyActivity.A0A, false);
            messageReplyActivity.A0A.setVisibility(8);
        } else if (messageReplyActivity.A0B.getVisibility() == 0 && z2) {
            C41651wK.A00(messageReplyActivity.A0B, false);
            messageReplyActivity.A0B.setVisibility(8);
            messageReplyActivity.A08.startAnimation(AnonymousClass22O.A00(C13680ns.A1Z(messageReplyActivity.A01), false, false));
            messageReplyActivity.A07.startAnimation(A01(C13680ns.A1Z(messageReplyActivity.A01), false));
            messageReplyActivity.A07.setVisibility(8);
            C41651wK.A00(messageReplyActivity.A0A, true);
            messageReplyActivity.A0A.setVisibility(0);
        }
        if (messageReplyActivity.A0x.A00 && (r1 = messageReplyActivity.A0z) != null && messageReplyActivity.A0c.A02) {
            r1.A00(obj, 200);
        }
    }
}
