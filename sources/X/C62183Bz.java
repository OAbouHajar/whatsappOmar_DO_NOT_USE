package X;

import android.animation.Animator;
import android.content.Context;
import android.util.SparseArray;
import com.obwhatsapp.R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.3Bz  reason: invalid class name and case insensitive filesystem */
public class C62183Bz {
    public static final AnonymousClass5OK A00 = new AnonymousClass3EW();

    public static Animator A00(C14990q7 r1, String str) {
        return (Animator) ((AbstractMap) r1.A02(R.id.bk_context_key_animations)).get(str);
    }

    public static C14990q7 A01(Context context, SparseArray sparseArray, C14910pz r8, AnonymousClass22A r9, String str) {
        SparseArray clone = r9.A00().clone();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            clone.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
        }
        clone.put(R.id.bk_context_key_states, AnonymousClass000.A0x());
        if (r8 == null) {
            AnonymousClass2Wa A01 = AnonymousClass2Wa.A01(new C31201dg(-1));
            C99324tq r4 = C99324tq.A00;
            AnonymousClass228 r3 = AnonymousClass228.A00;
            r8 = new C14910pz(A01.A00, A01.A01, r3, r4);
        }
        clone.put(R.id.bk_context_key_tree, r8);
        clone.put(R.id.bk_context_key_scoped_client_id_mapper, new C85844Qf());
        clone.put(R.id.bk_context_key_animations, AnonymousClass000.A0x());
        clone.put(R.id.bk_context_key_timers, AnonymousClass000.A0x());
        clone.put(R.id.bk_context_key_logging_id, str);
        if (clone.get(R.id.bk_context_key_performance_logger) == null) {
            clone.put(R.id.bk_context_key_performance_logger, AnonymousClass4YY.A00);
        }
        clone.put(R.id.bk_context_key_controller_by_server_id, Collections.synchronizedMap(AnonymousClass000.A0x()));
        C14990q7 r1 = new C14990q7(context, clone, r9);
        clone.get(R.id.bk_context_key_bloks_context_creation_listener);
        return r1;
    }

    public static C14920q0 A02(C14990q7 r1, String str) {
        return (C14920q0) ((AbstractMap) r1.A02(R.id.bk_context_key_timers)).get(str);
    }

    public static C14910pz A03(C14990q7 r1) {
        return (C14910pz) r1.A02(R.id.bk_context_key_tree);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = (X.C25261Jc) r2.A01.get(com.obwhatsapp.R.id.bk_context_key_interpreter_extensions);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C25261Jc A04(X.C14990q7 r2) {
        /*
            if (r2 == 0) goto L_0x0010
            r1 = 2131362234(0x7f0a01ba, float:1.8344243E38)
            android.util.SparseArray r0 = r2.A01
            java.lang.Object r0 = r0.get(r1)
            X.1Jc r0 = (X.C25261Jc) r0
            if (r0 == 0) goto L_0x0010
            return r0
        L_0x0010:
            X.4da r0 = X.C90154da.A00()
            X.1Jc r0 = r0.A0A
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62183Bz.A04(X.0q7):X.1Jc");
    }

    public static Object A05(C14990q7 r3, C31201dg r4) {
        Object A03 = r3.A03(A00, r4, R.id.bk_context_key_controller_associated_object);
        String A0I = r4.A0I();
        if (A0I != null) {
            ((Map) r3.A02(R.id.bk_context_key_controller_by_server_id)).put(A0I, A03);
        }
        return A03;
    }

    public static void A06(Animator animator, C14990q7 r2, String str) {
        Animator animator2 = (Animator) ((AbstractMap) r2.A02(R.id.bk_context_key_animations)).put(str, animator);
        if (animator2 != null) {
            animator2.cancel();
            C29691b2.A00("BloksAnimation", String.format("Found previously started animator with key %s. Canceling it.", AnonymousClass000.A1a(str)));
        }
    }

    public static void A07(C14990q7 r1) {
        C14910pz A03 = A03(r1);
        if (A03 != null) {
            C62003Bg.A02("Tree operations are only supported from the UI Thread");
            int i2 = A03.A00;
            if (i2 > 0) {
                int i3 = i2 - 1;
                A03.A00 = i3;
                if (i3 == 0 && A03.A0I.size() > 0) {
                    A03.A04();
                    return;
                }
                return;
            }
            throw AnonymousClass000.A0V("Negative recursion level.");
        }
    }

    public static void A08(C14990q7 r2, C14920q0 r3, String str) {
        AbstractMap abstractMap = (AbstractMap) r2.A02(R.id.bk_context_key_timers);
        C14920q0 r0 = (C14920q0) abstractMap.get(str);
        if (r0 != null) {
            r0.A01();
            StringBuilder A0r = AnonymousClass000.A0r("Timer with id ");
            A0r.append(str);
            C29691b2.A00("BloksTimer", AnonymousClass000.A0h(" already exists. Overwriting previous timer.", A0r));
        }
        abstractMap.put(str, r3);
    }

    public static void A09(C14990q7 r1, String str) {
        ((AbstractMap) r1.A02(R.id.bk_context_key_animations)).remove(str);
    }

    public static boolean A0A(C14990q7 r2) {
        Boolean bool = (Boolean) r2.A01.get(R.id.bk_context_key_clip_children_bool);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }
}
