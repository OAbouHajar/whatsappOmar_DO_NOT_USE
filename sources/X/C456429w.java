package X;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.MediaComposerActivity;
import com.obwhatsapp.mediacomposer.bottombar.BottomBarView;
import com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView;
import com.obwhatsapp.mentions.MentionableEntry;
import java.util.List;

/* renamed from: X.29w  reason: invalid class name and case insensitive filesystem */
public final class C456429w implements AnonymousClass29G, C456129o, AnonymousClass1w8, C456529x {
    public AnonymousClass29L A00;
    public AnonymousClass29N A01;
    public final AnonymousClass29P A02;
    public final BottomBarView A03;
    public final AnonymousClass2X6 A04;
    public final AnonymousClass4IF A05;
    public final C613938s A06;
    public final AnonymousClass4UK A07;
    public final C456029n A08;
    public final boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x005b, code lost:
        if (r6.A00 == 35) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C456429w(X.AnonymousClass29P r6, com.obwhatsapp.mediacomposer.bottombar.BottomBarView r7, X.AnonymousClass2X6 r8, X.AnonymousClass4IF r9, X.C613938s r10, X.AnonymousClass4UK r11, X.C456029n r12, boolean r13) {
        /*
            r5 = this;
            r5.<init>()
            r5.A03 = r7
            r5.A02 = r6
            r5.A04 = r8
            r5.A06 = r10
            r5.A05 = r9
            r5.A08 = r12
            r5.A07 = r11
            r5.A09 = r13
            X.027 r4 = r6.A01
            java.lang.Object r2 = r4.A01()
            java.util.List r2 = (java.util.List) r2
            X.027 r0 = r6.A04
            java.lang.Object r1 = r0.A01()
            X.1m6 r1 = (X.C35541m6) r1
            r0 = 1
            r10.A00(r1, r2, r0)
            com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView r3 = r8.A04
            com.obwhatsapp.mentions.MentionableEntry r2 = r3.A0B
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r2.setScrollBarStyle(r0)
            r1 = 0
            r2.setClickable(r1)
            r2.setCursorVisible(r1)
            r2.setFocusable(r1)
            r2.setFocusableInTouchMode(r1)
            r0 = 2
            r2.setImportantForAccessibility(r0)
            com.obwhatsapp.WaImageButton r0 = r3.A09
            r0.setVisibility(r1)
            boolean r0 = r6.A0C
            if (r0 == 0) goto L_0x0056
            java.lang.Object r0 = r4.A01()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x005d
        L_0x0056:
            int r2 = r6.A00
            r1 = 35
            r0 = 0
            if (r2 != r1) goto L_0x005e
        L_0x005d:
            r0 = 1
        L_0x005e:
            r3 = 0
            r11.A00(r0)
            androidx.recyclerview.widget.RecyclerView r2 = r12.A06
            X.013 r1 = r12.A07
            X.3RC r0 = new X.3RC
            r0.<init>(r1)
            r2.A0m(r0)
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>()
            r0.A1P(r3)
            r2.setLayoutManager(r0)
            if (r13 == 0) goto L_0x009a
            java.lang.Object r0 = r4.A01()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r2 = r0 ^ 1
            X.2X6 r0 = r5.A04
            com.obwhatsapp.mediacomposer.bottombar.caption.CaptionView r1 = r0.A04
            r1.getContext()
            X.013 r0 = r1.A00
            if (r2 == 0) goto L_0x009b
            X.AnonymousClass4Xy.A00(r1, r0)
        L_0x0095:
            X.4UK r0 = r5.A07
            r0.A01(r2)
        L_0x009a:
            return
        L_0x009b:
            X.AnonymousClass4Xy.A01(r1, r0)
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C456429w.<init>(X.29P, com.obwhatsapp.mediacomposer.bottombar.BottomBarView, X.2X6, X.4IF, X.38s, X.4UK, X.29n, boolean):void");
    }

    public void A00(CharSequence charSequence, boolean z2) {
        CharSequence charSequence2;
        AnonymousClass2X6 r5 = this.A04;
        if (TextUtils.isEmpty(charSequence)) {
            CaptionView captionView = r5.A04;
            captionView.setCaptionText((CharSequence) null);
            captionView.setContentDescription(r5.A00.getString(R.string.str00a4));
            return;
        }
        if (z2) {
            AnonymousClass01V r4 = r5.A01;
            C17020u3 r3 = r5.A05;
            MentionableEntry mentionableEntry = r5.A04.A0B;
            charSequence2 = AnonymousClass2Sy.A03(r5.A00, mentionableEntry.getPaint(), r5.A03, C45922Bq.A04(r4, r3, charSequence, mentionableEntry.getCurrentTextColor(), true));
        } else {
            charSequence2 = charSequence;
        }
        CaptionView captionView2 = r5.A04;
        captionView2.setCaptionText(charSequence2);
        captionView2.setContentDescription(charSequence);
    }

    public void A01(boolean z2) {
        if (z2) {
            C456029n r3 = this.A08;
            r3.A06.animate().alpha(1.0f).withStartAction(new RunnableRunnableShape10S0100000_I0_9((Object) r3, 47));
        }
        BottomBarView bottomBarView = this.A03;
        bottomBarView.animate().alpha(1.0f).withStartAction(new RunnableRunnableShape10S0100000_I0_9((Object) bottomBarView, 43));
    }

    public void A02(boolean z2) {
        if (z2) {
            C456029n r3 = this.A08;
            r3.A06.animate().alpha(0.0f).withEndAction(new RunnableRunnableShape10S0100000_I0_9((Object) r3, 46));
        }
        BottomBarView bottomBarView = this.A03;
        bottomBarView.animate().alpha(0.0f).withEndAction(new RunnableRunnableShape10S0100000_I0_9((Object) bottomBarView, 44));
    }

    public void A03(boolean z2) {
        this.A07.A01.setClickable(z2);
        CaptionView captionView = this.A04.A04;
        captionView.setClickable(z2);
        captionView.setAddButtonClickable(z2);
        captionView.setViewOnceButtonClickable(z2);
    }

    public void A04(boolean z2) {
        this.A03.setVisibility(0);
        C456029n r0 = this.A08;
        int i2 = 8;
        if (z2) {
            i2 = 0;
        }
        r0.A06.setVisibility(i2);
    }

    public void AM7() {
        this.A00.AM7();
    }

    public void AVs(boolean z2) {
        AnonymousClass29L r1 = this.A00;
        if (r1 != null) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) r1;
            mediaComposerActivity.A1F = true;
            mediaComposerActivity.A3N(z2);
        }
    }

    public void AWy() {
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
        if (C16030sJ.A0S((List) mediaComposerActivity.A0l.A01.A01())) {
            int i2 = 10;
            if (mediaComposerActivity.A3O()) {
                i2 = 12;
            }
            Integer valueOf = Integer.valueOf(i2);
            mediaComposerActivity.A13.A0B((Byte) null, valueOf, AnonymousClass1L1.A02(valueOf.intValue()));
        }
        mediaComposerActivity.A17.get();
        mediaComposerActivity.A3F();
    }

    public void AYq(int i2) {
        Uri A022;
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A01;
        if (mediaComposerActivity.A35() != i2 || !mediaComposerActivity.A1I) {
            mediaComposerActivity.A0f.setCurrentItem(mediaComposerActivity.A0n.A0L(i2));
            if (mediaComposerActivity.A1I) {
                C456629y r1 = mediaComposerActivity.A0o.A08.A02;
                r1.A00 = false;
                r1.A01();
                Handler handler = mediaComposerActivity.A1R;
                handler.removeCallbacksAndMessages((Object) null);
                RunnableRunnableShape10S0100000_I0_9 runnableRunnableShape10S0100000_I0_9 = new RunnableRunnableShape10S0100000_I0_9((Object) mediaComposerActivity, 39);
                mediaComposerActivity.A19 = runnableRunnableShape10S0100000_I0_9;
                handler.postDelayed(runnableRunnableShape10S0100000_I0_9, 500);
            }
        } else if (mediaComposerActivity.A19 == null && (A022 = mediaComposerActivity.A0l.A02()) != null) {
            mediaComposerActivity.A3J(A022);
        }
    }

    public void AZg() {
        AnonymousClass29P r3 = this.A02;
        int intValue = ((Number) r3.A06.A01()).intValue();
        if (intValue == 2) {
            r3.A06(3);
        } else if (intValue == 3) {
            r3.A06(2);
        }
    }

    public /* synthetic */ void onDismiss() {
    }
}
