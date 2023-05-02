package X;

import android.graphics.Rect;
import com.obwhatsapp.status.playback.StatusPlaybackActivity;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackFragment;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.3Dk  reason: invalid class name and case insensitive filesystem */
public class C62403Dk implements C015507l {
    public int A00 = -1;
    public StatusPlaybackFragment A01 = null;
    public boolean A02 = false;
    public final Rect A03 = AnonymousClass000.A0J();
    public final Rect A04 = AnonymousClass000.A0J();
    public final /* synthetic */ StatusPlaybackActivity A05;

    public C62403Dk(StatusPlaybackActivity statusPlaybackActivity) {
        this.A05 = statusPlaybackActivity;
    }

    public void AUN(int i2) {
        char c2;
        C41821wi A1J;
        StatusPlaybackActivity statusPlaybackActivity = this.A05;
        if (i2 != 0) {
            if (!statusPlaybackActivity.A0K) {
                statusPlaybackActivity.A0K = true;
                this.A00 = statusPlaybackActivity.A07.getCurrentItem();
            }
            c2 = 1;
            if (i2 != 1) {
                c2 = 2;
                if (i2 != 2) {
                    throw AnonymousClass000.A0V("Invalid scrollState value from ViewPager");
                }
            }
        } else {
            statusPlaybackActivity.A0K = false;
            this.A00 = -1;
            this.A02 = false;
            this.A01 = null;
            for (AnonymousClass01A r1 : statusPlaybackActivity.A2E()) {
                if (r1 instanceof StatusPlaybackFragment) {
                    StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) r1;
                    if (!statusPlaybackFragment.A00 && (A1J = ((StatusPlaybackContactFragment) statusPlaybackFragment).A1J()) != null && A1J.A05) {
                        A1J.A06(0);
                    }
                }
            }
            this.A02 = false;
            Runnable runnable = statusPlaybackActivity.A0H;
            if (runnable != null) {
                runnable.run();
                statusPlaybackActivity.A0H = null;
            }
            c2 = 0;
        }
        for (AnonymousClass01A r12 : statusPlaybackActivity.A2E()) {
            if (r12 instanceof StatusPlaybackFragment) {
                StatusPlaybackFragment statusPlaybackFragment2 = (StatusPlaybackFragment) r12;
                if (statusPlaybackFragment2 instanceof StatusPlaybackBaseFragment) {
                    ((StatusPlaybackBaseFragment) statusPlaybackFragment2).A1I(c2 != 0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r4 = r7.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AUO(int r8, float r9, int r10) {
        /*
            r7 = this;
            boolean r0 = java.lang.Float.isNaN(r9)
            if (r0 != 0) goto L_0x007f
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x007f
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x007f
            int r0 = r7.A00
            r3 = 1
            boolean r6 = X.AnonymousClass000.A1R(r8, r0)
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x007f
            com.obwhatsapp.status.playback.fragment.StatusPlaybackFragment r2 = r7.A01
            if (r2 != 0) goto L_0x0047
            com.obwhatsapp.status.playback.StatusPlaybackActivity r1 = r7.A05
            if (r6 == 0) goto L_0x0026
            int r8 = r8 + 1
        L_0x0026:
            X.398 r0 = r1.A0D
            r2 = 0
            if (r0 == 0) goto L_0x0043
            if (r8 < 0) goto L_0x0043
            java.util.List r0 = r0.A00
            int r0 = r0.size()
            if (r8 >= r0) goto L_0x0043
            X.398 r0 = r1.A0D
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r8)
            X.4FE r0 = (X.AnonymousClass4FE) r0
            com.obwhatsapp.status.playback.fragment.StatusPlaybackFragment r2 = r1.A36(r0)
        L_0x0043:
            r7.A01 = r2
            if (r2 == 0) goto L_0x007f
        L_0x0047:
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x007f
            android.view.View r5 = r2.A0A
            if (r5 == 0) goto L_0x007f
            com.obwhatsapp.status.playback.StatusPlaybackActivity r4 = r7.A05
            androidx.viewpager.widget.ViewPager r2 = r4.A07
            if (r2 == 0) goto L_0x007f
            boolean r0 = r2.isShown()
            if (r0 == 0) goto L_0x007f
            boolean r0 = r5.isShown()
            if (r0 == 0) goto L_0x007f
            android.graphics.Rect r1 = r7.A04
            r2.getGlobalVisibleRect(r1)
            android.graphics.Rect r0 = r7.A03
            r5.getGlobalVisibleRect(r0)
            boolean r0 = r1.intersect(r0)
            if (r0 == 0) goto L_0x007f
            com.obwhatsapp.status.playback.fragment.StatusPlaybackFragment r2 = r7.A01
            int r1 = r4.A02
            if (r1 == 0) goto L_0x0080
            r0 = 0
            r4.A02 = r0
        L_0x007a:
            r2.A1D(r1)
            r7.A02 = r3
        L_0x007f:
            return
        L_0x0080:
            r1 = 2
            if (r6 == 0) goto L_0x007a
            r1 = 3
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62403Dk.AUO(int, float, int):void");
    }

    public void AUP(int i2) {
        boolean z2;
        StatusPlaybackActivity statusPlaybackActivity = this.A05;
        if (i2 != statusPlaybackActivity.A01) {
            statusPlaybackActivity.A0I = false;
            AnonymousClass4FE r5 = (AnonymousClass4FE) statusPlaybackActivity.A0D.A00.get(i2);
            if (r5 != null) {
                Iterator it = statusPlaybackActivity.A2E().iterator();
                while (true) {
                    z2 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass01A r4 = (AnonymousClass01A) it.next();
                    if (r4 instanceof StatusPlaybackFragment) {
                        StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) r4;
                        String rawString = r5.A00.A0B.getRawString();
                        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) statusPlaybackFragment;
                        UserJid userJid = statusPlaybackContactFragment.A0S;
                        AnonymousClass00B.A06(userJid);
                        if (!rawString.equals(userJid.getRawString()) && statusPlaybackFragment.A00) {
                            if (i2 <= statusPlaybackActivity.A01) {
                                z2 = false;
                            }
                            int i3 = statusPlaybackActivity.A03;
                            if (i3 != 0) {
                                statusPlaybackActivity.A03 = 0;
                            } else {
                                i3 = 6;
                                if (z2) {
                                    i3 = 7;
                                }
                            }
                            C41821wi A1J = statusPlaybackContactFragment.A1J();
                            if (A1J != null && A1J.A05) {
                                A1J.A06(i3);
                            }
                            statusPlaybackFragment.A1C();
                        }
                    }
                }
                StatusPlaybackFragment A36 = statusPlaybackActivity.A36(r5);
                if (A36 != null && !A36.A00) {
                    A36.A1B();
                    if (i2 <= statusPlaybackActivity.A01) {
                        z2 = false;
                    }
                    int i4 = statusPlaybackActivity.A02;
                    if (i4 != 0) {
                        statusPlaybackActivity.A02 = 0;
                    } else {
                        i4 = 2;
                        if (z2) {
                            i4 = 3;
                        }
                    }
                    A36.A1D(i4);
                }
            }
            statusPlaybackActivity.A01 = i2;
        }
    }
}
