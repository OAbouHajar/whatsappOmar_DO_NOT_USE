package X;

import android.animation.Animator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Vm  reason: invalid class name and case insensitive filesystem */
public final class C06380Vm {
    public static final long A00 = TimeUnit.SECONDS.toMillis(1);

    public static final void A00(Animator animator, C14990q7 r2, C14960q4 r3, C14930q1 r4) {
        C18450wi.A0H(r3, 0);
        C18450wi.A0H(r2, 3);
        animator.addListener(new C020809q(animator, r2, r3, r4));
    }

    public static final void A01(Animator animator, C14960q4 r4, String str) {
        C18450wi.A0H(r4, 0);
        C18450wi.A0H(animator, 1);
        C14990q7 r2 = r4.A00;
        AnonymousClass44n.A00(r2);
        if (str == null) {
            str = AnonymousClass000.A0f(UUID.randomUUID(), AnonymousClass000.A0r("NO_ID"));
        }
        animator.addListener(new C020909r(r2, str));
        animator.start();
        C62183Bz.A06(animator, r2, str);
    }
}
