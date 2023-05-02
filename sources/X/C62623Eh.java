package X;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape1S0110000_I1;
import java.util.Map;

/* renamed from: X.3Eh  reason: invalid class name and case insensitive filesystem */
public class C62623Eh implements AnonymousClass5SS {
    public View A00;
    public final AnonymousClass1VI A01;
    public final C14710pd A02;
    public final AnonymousClass1PN A03;
    public final AnonymousClass13G A04;
    public final C19220xx A05;
    public final AnonymousClass01J A06;

    public C62623Eh(AnonymousClass1VI r1, C14710pd r2, AnonymousClass1PN r3, AnonymousClass13G r4, C19220xx r5, AnonymousClass01J r6) {
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = r5;
        this.A01 = r1;
        this.A03 = r3;
        this.A06 = r6;
    }

    public void AHm() {
        C13680ns.A13(this.A00);
    }

    public boolean AfA() {
        return AnonymousClass000.A1V(this.A05.A01());
    }

    public void AhG() {
        String queryParameter;
        if (this.A00 == null) {
            AnonymousClass1VI r2 = this.A01;
            View A0H = C13680ns.A0H(C13680ns.A0G(r2), r2, R.layout.layout01f5);
            this.A00 = A0H;
            r2.addView(A0H);
            this.A04.A01(C13680ns.A0Y());
        }
        C19220xx r3 = this.A05;
        AnonymousClass2Dp A012 = r3.A01();
        AnonymousClass00B.A06(A012);
        View view = this.A00;
        AnonymousClass00B.A04(view);
        TextView A0L = C13680ns.A0L(view, R.id.user_notice_banner_text);
        AnonymousClass1VI r6 = this.A01;
        A0L.setText(C61903Aw.A00(r6.getContext(), (C82914Eq) null, A012.A04));
        ((C77773wZ) C004601z.A0E(this.A00, R.id.user_notice_banner_icon)).A04(A012);
        String str = A012.A01;
        if (!str.startsWith("whatsapp:user-notice")) {
            queryParameter = "open-link";
        } else {
            queryParameter = Uri.parse(C13680ns.A0h("h://", str)).getQueryParameter("action");
            if (queryParameter == null) {
                queryParameter = "";
            }
        }
        C14710pd r1 = this.A02;
        C46352Dw A013 = r3.A05.A01();
        AnonymousClass00B.A06(A013);
        boolean A014 = AnonymousClass2E5.A01(r1, A013);
        Map A015 = C61903Aw.A01(str);
        if (A014 && r6.getContext() != null) {
            C13680ns.A0t(r6.getContext(), A0L, R.string.str0a06);
        }
        this.A00.setOnClickListener(new AnonymousClass35g(this, queryParameter, A015, A014));
        C004601z.A0E(this.A00, R.id.cancel).setOnClickListener(new ViewOnClickCListenerShape1S0110000_I1(this, 0, A014));
        Log.i("UserNoticeBanner/update/banner shown");
        this.A00.setVisibility(0);
    }
}
