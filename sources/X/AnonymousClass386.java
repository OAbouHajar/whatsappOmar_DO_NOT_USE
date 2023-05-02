package X;

import android.text.Spannable;
import com.facebook.redex.IDxConsumerShape81S0200000_2_I1;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.386  reason: invalid class name */
public final class AnonymousClass386 {
    public static void A00(AnonymousClass02Z r12, C14990q7 r13, C31201dg r14, AnonymousClass1JW r15) {
        try {
            String A0J = r14.A0J(43);
            List A0N = r14.A0N(42);
            List A0N2 = r14.A0N(35);
            List A0N3 = r14.A0N(38);
            List A0N4 = r14.A0N(41);
            AnonymousClass1JW r3 = r15;
            Spannable ACP = r3.ACP(r12.getContext(), r13.A00, new IDxConsumerShape81S0200000_2_I1(r13, r14, 0), A0J, A0N, A0N2, A0N3, A0N4);
            if (ACP != null) {
                r12.setText(ACP);
            }
        } catch (JSONException e2) {
            C29691b2.A00("WaTextWithEntitiesComponentBinder", AnonymousClass000.A0g("bind/exception parsing formatted string: ", e2));
        }
        String A0J2 = r14.A0J(44);
        if (A0J2 != null) {
            try {
                r12.setGravity(C62163Bx.A07(A0J2));
            } catch (AnonymousClass40K e3) {
                C29691b2.A01("WaTextWithEntitiesComponentBinder", "Failed to parse textAlign", e3);
            }
        }
        String A0J3 = r14.A0J(45);
        if (A0J3 != null) {
            try {
                r12.setTextSize(C62163Bx.A02(A0J3));
            } catch (AnonymousClass40K e4) {
                C29691b2.A01("WaTextWithEntitiesComponentBinder", "Failed to parse text size", e4);
            }
        }
        String A0J4 = r14.A0J(36);
        if (A0J4 != null) {
            try {
                r12.setLineHeight((int) C62163Bx.A01(A0J4));
            } catch (AnonymousClass40K e5) {
                C29691b2.A01("WaTextWithEntitiesComponentBinder", "Failed to parse line height pixel value", e5);
            }
        }
    }
}
