package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.gallery.LinksGalleryFragment;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;
import java.util.Set;

/* renamed from: X.2re  reason: invalid class name and case insensitive filesystem */
public class C57722re extends C005602k {
    public C73963pP A00;
    public C16740tZ A01;
    public String A02;
    public Set A03;
    public final View A04;
    public final View A05;
    public final LinearLayout A06;
    public final TextView A07;
    public final TextView A08;
    public final WebPagePreviewView A09;
    public final /* synthetic */ LinksGalleryFragment A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57722re(View view, LinksGalleryFragment linksGalleryFragment) {
        super(view);
        this.A0A = linksGalleryFragment;
        this.A07 = C13680ns.A0M(view, R.id.message_text);
        View findViewById = view.findViewById(R.id.message_text_holder);
        this.A05 = view.findViewById(R.id.starred_status);
        this.A04 = view.findViewById(R.id.kept_status);
        this.A06 = (LinearLayout) view.findViewById(R.id.message_badge_container);
        this.A08 = C13680ns.A0M(view, R.id.suspicious_link_indicator);
        this.A09 = (WebPagePreviewView) C004601z.A0E(view, R.id.link_preview_frame);
        C13680ns.A16(findViewById, this, 17);
        C13680ns.A16(view, this, 18);
        C13700nu.A0S(view, this, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0080, code lost:
        if (1 != r14.A06()) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C16740tZ r18, int r19) {
        /*
            r17 = this;
            r2 = r17
            r14 = r18
            r2.A01 = r14
            X.3pP r0 = r2.A00
            if (r0 == 0) goto L_0x000d
            r0.A00()
        L_0x000d:
            com.obwhatsapp.webpagepreview.WebPagePreviewView r4 = r2.A09
            r4.A02()
            android.widget.TextView r10 = r2.A07
            X.C13700nu.A0T(r10)
            r3 = 0
            r4.setLinkTitle(r3)
            com.obwhatsapp.components.button.ThumbnailButton r0 = r4.A0N
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r7 = r2.A05
            r7.setVisibility(r1)
            android.view.View r6 = r2.A04
            r6.setVisibility(r1)
            r4.setLinkHostname(r3)
            r0 = 0
            r4.setLinkGifSize(r0)
            android.widget.TextView r3 = r2.A08
            r3.setVisibility(r1)
            com.obwhatsapp.gallery.LinksGalleryFragment r4 = r2.A0A
            X.00l r0 = r4.A0C()
            X.AnonymousClass00B.A06(r0)
            X.1YG r0 = (X.AnonymousClass1YG) r0
            boolean r0 = r0.AJI(r14)
            r5 = 0
            android.view.View r8 = r2.A0H
            if (r0 == 0) goto L_0x00dc
            r9 = r8
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            android.content.Context r1 = r4.A0u()
            r0 = 2131101046(0x7f060576, float:1.781449E38)
            int r1 = X.AnonymousClass00T.A00(r1, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r9.setForeground(r0)
            r0 = 1
            r8.setSelected(r0)
        L_0x0066:
            java.util.Set r1 = r2.A03
            r0 = 0
            if (r1 != 0) goto L_0x006d
            r0 = 8
        L_0x006d:
            r3.setVisibility(r0)
            X.10B r0 = r4.A02
            X.0pd r0 = r0.A09
            boolean r0 = X.C34321k4.A05(r0, r14)
            if (r0 == 0) goto L_0x0082
            int r1 = r14.A06()
            r0 = 1
            r3 = 1
            if (r0 == r1) goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            boolean r1 = r14.A0x
            r0 = 8
            if (r3 == 0) goto L_0x00d8
            r6.setVisibility(r5)
        L_0x008c:
            if (r1 == 0) goto L_0x00d4
            r7.setVisibility(r5)
        L_0x0091:
            if (r3 == 0) goto L_0x00a9
            if (r1 == 0) goto L_0x00a9
            android.content.res.Resources r1 = r4.A03()
            r0 = 2131166405(0x7f0704c5, float:1.7947054E38)
            int r3 = r1.getDimensionPixelSize(r0)
            android.widget.LinearLayout r1 = r2.A06
            int r0 = r1.getPaddingTop()
            r1.setPadding(r3, r0, r5, r5)
        L_0x00a9:
            X.4Qo r1 = r4.A01
            android.content.Context r9 = r4.A02()
            X.0um r13 = r4.A05
            X.013 r11 = r4.A05
            X.1Mg r12 = r4.A04
            X.00l r0 = r4.A0C()
            X.AnonymousClass00B.A06(r0)
            X.1YG r0 = (X.AnonymousClass1YG) r0
            java.util.ArrayList r15 = r0.AFm()
            X.3pP r8 = new X.3pP
            r16 = r19
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r2.A00 = r8
            X.3FQ r0 = new X.3FQ
            r0.<init>(r2)
            r1.A00(r0, r8)
            return
        L_0x00d4:
            r7.setVisibility(r0)
            goto L_0x0091
        L_0x00d8:
            r6.setVisibility(r0)
            goto L_0x008c
        L_0x00dc:
            r1 = r8
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0 = 0
            r1.setForeground(r0)
            r8.setSelected(r5)
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57722re.A07(X.0tZ, int):void");
    }
}
