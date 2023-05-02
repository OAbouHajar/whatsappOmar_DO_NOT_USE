package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.4Re  reason: invalid class name and case insensitive filesystem */
public class C86094Re {
    public final /* synthetic */ C16740tZ A00;
    public final /* synthetic */ C55842kV A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C86094Re(C16740tZ r1, C55842kV r2, boolean z2, boolean z3) {
        this.A02 = z2;
        this.A00 = r1;
        this.A03 = z3;
        this.A01 = r2;
    }

    public static long A00(WebPagePreviewView webPagePreviewView, float f2, float f3) {
        long j2 = (long) 150;
        webPagePreviewView.A0G.animate().setDuration(j2).alpha(f2);
        webPagePreviewView.A05.animate().setDuration(j2).alpha(f3);
        webPagePreviewView.A0C.animate().setDuration(j2).alpha(f3);
        return j2;
    }

    public static ViewPropertyAnimator A01(Object obj, float f2) {
        WebPagePreviewView webPagePreviewView = (WebPagePreviewView) obj;
        long j2 = (long) 150;
        webPagePreviewView.A0F.animate().setDuration(j2).alpha(f2);
        return webPagePreviewView.A04.animate().setDuration(j2);
    }

    public static void A02(View view, float f2, long j2) {
        view.animate().setDuration(j2).alpha(f2);
    }

    public void A03(C28381Vw r8, int i2) {
        float f2;
        WebPagePreviewView webPagePreviewView;
        long A002;
        float f3;
        ViewPropertyAnimator A012;
        boolean z2 = this.A02;
        if (z2 && (r8 == null || !r8.equals(this.A00.A11))) {
            return;
        }
        if (this.A03) {
            if (i2 == 1) {
                f3 = 0.0f;
                A012 = A01(this.A01, 1.0f);
            } else if (i2 != 2) {
                f3 = 1.0f;
                A012 = A01(this.A01, 0.0f);
            } else {
                f3 = 0.0f;
                A012 = A01(this.A01, 0.0f);
            }
            A012.alpha(f3);
            return;
        }
        if (i2 == 1) {
            f2 = 0.0f;
            webPagePreviewView = (WebPagePreviewView) this.A01;
            A002 = A00(webPagePreviewView, 1.0f, 0.0f);
        } else if (i2 != 2) {
            f2 = 0.0f;
            webPagePreviewView = (WebPagePreviewView) this.A01;
            A002 = A00(webPagePreviewView, 0.0f, 1.0f);
        } else if (z2) {
            f2 = 0.67f;
            webPagePreviewView = (WebPagePreviewView) this.A01;
            A002 = (long) 150;
            webPagePreviewView.A0G.animate().setDuration(A002).alpha(0.0f);
            A02(webPagePreviewView.A05, 0.0f, A002);
            A02(webPagePreviewView.A0C, 0.0f, A002);
            A02(webPagePreviewView.A06, 1.0f, A002);
            A02(webPagePreviewView.A07, f2, A002);
        } else {
            return;
        }
        A02(webPagePreviewView.A06, f2, A002);
        A02(webPagePreviewView.A07, f2, A002);
    }
}
