package X;

import android.content.Context;
import android.net.Uri;
import com.obwhatsapp.R;
import com.obwhatsapp.search.views.itemviews.AudioPlayerView;
import java.io.File;

/* renamed from: X.3Bl  reason: invalid class name and case insensitive filesystem */
public class C62053Bl {
    public static String A00(AnonymousClass013 r2, C38701rH r3) {
        int i2 = r3.A00;
        return i2 != 0 ? C28961Zl.A04(r2, (long) i2) : AnonymousClass2GQ.A03(r2, r3.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r1.A0F == null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.view.View.OnClickListener r4, android.view.View.OnClickListener r5, android.view.View.OnClickListener r6, android.view.View.OnClickListener r7, X.C38701rH r8, X.AnonymousClass5QI r9, com.obwhatsapp.search.views.itemviews.AudioPlayerView r10) {
        /*
            X.0ta r1 = X.C16730tY.A00(r8)
            boolean r0 = X.C38621r6.A10(r8)
            r3 = 0
            if (r0 == 0) goto L_0x001a
            r0 = 4
            r10.setPlayButtonState(r0)
            r10.setOnControlButtonClickListener(r4)
            r10.setSeekbarProgress(r3)
            r0 = 1
            r9.AXZ(r0)
            return
        L_0x001a:
            boolean r0 = X.C38621r6.A11(r8)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r8.A14()
            boolean r0 = X.AnonymousClass1ZW.A0E(r0)
            if (r0 == 0) goto L_0x0034
            java.io.File r0 = r1.A0F
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.getName()
            r8.A07 = r0
        L_0x0034:
            android.content.Context r1 = r10.getContext()
            r0 = 2131101049(0x7f060579, float:1.7814497E38)
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            r10.setSeekbarColor(r0)
            r10.setOnControlButtonClickListener(r7)
        L_0x0045:
            r9.AXZ(r3)
            return
        L_0x0049:
            X.0ta r1 = r8.A02
            X.1Vw r0 = r8.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0058
            if (r1 == 0) goto L_0x0058
            java.io.File r1 = r1.A0F
            r0 = 1
            if (r1 != 0) goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            r2 = 2
            r3 = 3
            if (r0 == 0) goto L_0x0072
            r10.setPlayButtonState(r2)
            r10.setOnControlButtonClickListener(r5)
            android.content.Context r1 = r10.getContext()
            r0 = 2131101049(0x7f060579, float:1.7814497E38)
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            r10.setSeekbarColor(r0)
            goto L_0x0045
        L_0x0072:
            r10.setPlayButtonState(r3)
            r10.setOnControlButtonClickListener(r6)
            android.content.Context r1 = r10.getContext()
            r0 = 2131101049(0x7f060579, float:1.7814497E38)
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            r10.setSeekbarColor(r0)
            r9.AXZ(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62053Bl.A01(android.view.View$OnClickListener, android.view.View$OnClickListener, android.view.View$OnClickListener, android.view.View$OnClickListener, X.1rH, X.5QI, com.obwhatsapp.search.views.itemviews.AudioPlayerView):void");
    }

    public static void A02(C52032cr r4, C19610yi r5, AnonymousClass013 r6, C14710pd r7, C38701rH r8, AnonymousClass5QG r9, AudioPlayerView audioPlayerView) {
        if (!r5.A0D(r8) || (r7.A0E(C16620tM.A02, 931) && r5.A0C())) {
            A03(r6, r8, r9, audioPlayerView);
            return;
        }
        AnonymousClass2DT A00 = r5.A00();
        if (A00 != null) {
            if (!A00.A0J()) {
                A03(r6, r8, r9, audioPlayerView);
            } else {
                audioPlayerView.setPlayButtonState(1);
                r9.AUp(0, C28961Zl.A04(r6, (long) (A00.A03() / 1000)));
            }
            audioPlayerView.setSeekbarContentDescription((long) A00.A03());
            A00.A0K = r4;
        }
    }

    public static void A03(AnonymousClass013 r3, C38701rH r4, AnonymousClass5QG r5, AudioPlayerView audioPlayerView) {
        Number number = (Number) AnonymousClass2DT.A0y.get(r4.A11);
        int intValue = number == null ? 0 : number.intValue();
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(r4.A00 * 1000);
        audioPlayerView.setSeekbarProgress(intValue);
        audioPlayerView.setSeekbarContentDescription((long) intValue);
        r5.AUp(1, C28961Zl.A04(r3, (long) r4.A00));
    }

    public static boolean A04(Context context, C14870pt r6, C38701rH r7, AnonymousClass5QH r8, AnonymousClass1PD r9, C25791Ld r10) {
        char c2;
        File file;
        C16750ta r0;
        C16750ta A00 = C16730tY.A00(r7);
        AnonymousClass00B.A06(A00);
        if (A00.A0Z) {
            c2 = 0;
        } else {
            c2 = 1;
            if (A00.A07 != 1) {
                if (A00.A0P && (file = A00.A0F) != null) {
                    File A0D = C13700nu.A0D(Uri.fromFile(file).getPath());
                    if (!A0D.exists() || !A0D.canRead()) {
                        c2 = 2;
                    }
                }
                c2 = 3;
            }
        }
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 == 2) {
                    File A0D2 = C13700nu.A0D(Uri.fromFile(A00.A0F).getPath());
                    if (!A0D2.exists() || !A0D2.canRead()) {
                        if (r7.A11.A02 || (r0 = r7.A02) == null) {
                            C14550pN r02 = (C14550pN) AnonymousClass22N.A01(context, C14550pN.class);
                            if (r02 != null) {
                                r9.A01(r02);
                                return false;
                            }
                        } else {
                            r0.A0W = true;
                            r10.A0D(r7);
                            r8.ARI();
                        }
                    }
                }
                return true;
            }
            r6.A07(R.string.str0939, 1);
            return false;
        }
        return false;
    }
}
