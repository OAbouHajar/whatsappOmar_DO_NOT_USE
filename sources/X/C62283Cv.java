package X;

import android.text.TextUtils;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.obwhatsapp.R;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3Cv  reason: invalid class name and case insensitive filesystem */
public class C62283Cv implements View.OnLayoutChangeListener {
    public final /* synthetic */ C606734v A00;
    public final /* synthetic */ C62643Ej[] A01;

    public C62283Cv(C606734v r1, C62643Ej[] r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C606734v r6 = this.A00;
        int i10 = 0;
        C62643Ej r2 = this.A01[0];
        String str = r2.A05;
        boolean z2 = r2.A07;
        C26081Mg r3 = r6.A0Y;
        C30581cc r4 = r6.A0c;
        if (r3.A00(r4.A0B(), r4, str) == null) {
            CardView cardView = r6.A0e.A00;
            r6.A05 = cardView;
            if (cardView == null) {
                Log.e("StatusPlaybackText/showInlineLinkPreview wrong layout used for rendering text status");
            } else {
                int i11 = 3;
                if (z2) {
                    i11 = 2;
                }
                r6.A0F = Integer.valueOf(i11);
                cardView.setVisibility(0);
                View findViewById = r6.A05.findViewById(R.id.web_page_preview);
                WebPagePreviewView webPagePreviewView = (WebPagePreviewView) C004601z.A0E(findViewById, R.id.link_preview_frame);
                View A0E = C004601z.A0E(webPagePreviewView, R.id.link_preview_content);
                String A012 = C30931dC.A01(r4.A13());
                if (str.equals(A012)) {
                    r6.A0H = str;
                    (C61863As.A02(A012) ? webPagePreviewView.A0J : webPagePreviewView.A0L).addOnLayoutChangeListener(new AnonymousClass3Cx(A0E, findViewById, r6, webPagePreviewView, z2));
                    boolean A0A = r6.A0W.A0A();
                    webPagePreviewView.A04();
                    String A013 = C30931dC.A01(r4.A13());
                    String str2 = r4.A07;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = A013;
                    }
                    webPagePreviewView.A0A(Integer.valueOf(r4.A00), r4.A06, r4.A04, str2, A013, (List) null, -1, AnonymousClass000.A1V(webPagePreviewView.A0Q.A00(r4.A0C(), r4, str)), false, A0A);
                } else {
                    r6.A0F();
                    i10 = 8;
                }
                webPagePreviewView.setVisibility(i10);
                view.removeOnLayoutChangeListener(this);
            }
        }
        r6.A0F();
        view.removeOnLayoutChangeListener(this);
    }
}
