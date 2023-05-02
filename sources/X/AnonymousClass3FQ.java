package X;

import android.widget.ImageView;
import com.facebook.redex.IDxTRendererShape197S0100000_1_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.3FQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FQ implements AnonymousClass5PR {
    public final /* synthetic */ C57722re A00;

    public /* synthetic */ AnonymousClass3FQ(C57722re r1) {
        this.A00 = r1;
    }

    public final void AOt(Object obj) {
        C57722re r7 = this.A00;
        AnonymousClass4MG r9 = (AnonymousClass4MG) obj;
        AnonymousClass3AC r5 = r9.A00;
        C84374Kh r4 = r5.A00;
        r7.A02 = r4.A01;
        r7.A03 = r4.A02;
        WebPagePreviewView webPagePreviewView = r7.A09;
        int i2 = 0;
        if (r7.A01 instanceof C38831rU) {
            i2 = 2;
        }
        webPagePreviewView.setLinkTitleTypeface(i2);
        webPagePreviewView.setLinkTitle(r9.A02);
        webPagePreviewView.setLinkSnippet(r9.A01);
        r7.A07.setText(r9.A03);
        if (r5.A01.booleanValue()) {
            r7.A0A.A06.A08(webPagePreviewView.A0N, r7.A01, new IDxTRendererShape197S0100000_1_I1(r7, 5));
        } else {
            webPagePreviewView.A0N.setVisibility(0);
            ThumbnailButton thumbnailButton = webPagePreviewView.A0N;
            thumbnailButton.setImageDrawable(AnonymousClass2SR.A02(thumbnailButton.getContext(), R.drawable.ic_group_invite_link, R.color.color0930));
            webPagePreviewView.A0N.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            webPagePreviewView.A0N.setScaleX(1.5f);
            webPagePreviewView.A0N.setScaleY(1.5f);
            ThumbnailButton thumbnailButton2 = webPagePreviewView.A0N;
            C13680ns.A0u(thumbnailButton2.getContext(), thumbnailButton2, R.color.color0540);
        }
        webPagePreviewView.setLinkHostname(r4.A00);
    }
}
