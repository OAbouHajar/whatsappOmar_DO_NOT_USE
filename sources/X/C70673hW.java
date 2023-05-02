package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.settings.chat.wallpaper.WallPaperView;
import com.obwhatsapp.yo.Conversation;

/* renamed from: X.3hW  reason: invalid class name and case insensitive filesystem */
public final class C70673hW extends C19530ya {
    public final Activity A00;
    public final ViewGroup A01;
    public final C62653Ek A02;
    public final C15830rv A03;
    public final C16210se A04;
    public final WallPaperView A05;
    public final C16320sq A06;

    public C70673hW(Activity activity, ViewGroup viewGroup, C14600pS r12, C14870pt r13, C809146b r14, AnonymousClass01V r15, C15830rv r16, C16210se r17, WallPaperView wallPaperView, C16320sq r19, Runnable runnable) {
        this.A03 = r16;
        this.A00 = activity;
        this.A06 = r19;
        C16210se r8 = r17;
        this.A04 = r8;
        this.A01 = viewGroup;
        WallPaperView wallPaperView2 = wallPaperView;
        this.A05 = wallPaperView2;
        this.A02 = new C62653Ek(activity, r12, r13, new C101604xa(this, wallPaperView2, runnable), r14, r15, r8);
    }

    public final void A00(Drawable drawable) {
        Conversation.convoBackground(drawable);
    }

    public void byousef(Drawable drawable) {
        ViewGroup viewGroup;
        int i2;
        if (drawable != null) {
            this.A05.setDrawable(drawable);
            viewGroup = this.A01;
            i2 = 0;
        } else {
            WallPaperView wallPaperView = this.A05;
            wallPaperView.A04 = false;
            wallPaperView.setImageDrawable((Drawable) null);
            wallPaperView.invalidate();
            viewGroup = this.A01;
            i2 = R.color.color018f;
        }
        viewGroup.setBackgroundResource(i2);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        A00((Drawable) null);
        C16320sq r5 = this.A06;
        C15830rv r4 = this.A03;
        C13680ns.A1U(new C78933yv(this.A00, new AnonymousClass4EB(this), r4, this.A04), r5);
    }

    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        C16210se r5 = this.A04;
        if (r5.A00) {
            C13680ns.A1U(new C78933yv(this.A00, new AnonymousClass4EB(this), this.A03, r5), this.A06);
            r5.A00 = false;
        }
    }
}
