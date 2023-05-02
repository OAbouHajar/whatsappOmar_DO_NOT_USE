package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxICallbackShape4S0000000_2_I1;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape1S0301000_I1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;
import java.util.List;

/* renamed from: X.2sk  reason: invalid class name and case insensitive filesystem */
public class C58102sk extends C57012pj {
    public View A00;
    public C70653hS A01;
    public final AnonymousClass027 A02 = C13690nt.A0O();
    public final C17130ua A03;
    public final C17230uk A04;
    public final AnonymousClass2ZO A05;
    public final AnonymousClass3BB A06;
    public final AnonymousClass1MU A07;
    public final AnonymousClass4EE A08;
    public final AnonymousClass4OW A09;
    public final C57372r0 A0A = new C57372r0(new IDxICallbackShape4S0000000_2_I1(3));
    public final C15830rv A0B;

    public C58102sk(Context context, C17130ua r4, C17230uk r5, AnonymousClass2ZO r6, AnonymousClass3BB r7, AnonymousClass1MU r8, AnonymousClass4EE r9, AnonymousClass4OW r10, C15830rv r11) {
        super(context, R.style.style0232);
        this.A0B = r11;
        this.A03 = r4;
        this.A07 = r8;
        this.A09 = r10;
        this.A08 = r9;
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layout0165);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0LL.A00(this, R.id.questions_view);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        C57372r0 r6 = this.A0A;
        recyclerView.setAdapter(r6);
        C67763cL r5 = new C67763cL();
        AnonymousClass4OW r2 = this.A09;
        for (AnonymousClass4TW r3 : r2.A07) {
            r5.add((Object) new C84334Kd(this.A02, r3));
        }
        C34641kb build = r5.build();
        AnonymousClass4NF r52 = r6.A00;
        int i2 = r52.A00 + 1;
        r52.A00 = i2;
        C34641kb r62 = r52.A01;
        if (build != r62) {
            if (build == null) {
                if (r62 != null) {
                    int size = r62.size();
                    r52.A01 = null;
                    r52.A03.AW0(0, size);
                }
            } else if (r62 == null) {
                r52.A01 = build;
                r52.A03.ASG(0, build.size());
            }
            r52.A02.A01.execute(new RunnableRunnableShape1S0301000_I1(r52, r62, build, i2, 0));
        }
        View A002 = AnonymousClass0LL.A00(this, R.id.send_button);
        this.A00 = A002;
        C13680ns.A17(A002, this, 43);
        C13680ns.A17(AnonymousClass0LL.A00(this, R.id.close), this, 44);
        this.A01 = new C70653hS(this.A03, this.A05.A01(this.A06, r2));
        WebPagePreviewView webPagePreviewView = (WebPagePreviewView) AnonymousClass0LL.A00(this, R.id.web_page_preview);
        webPagePreviewView.A08(this.A01, (List) null, false, this.A04.A0A());
        View findViewById = webPagePreviewView.findViewById(R.id.link_preview_content);
        if (findViewById != null) {
            findViewById.setBackgroundResource(R.drawable.round_corner_icebreaker_link_preview_background);
        }
        Drawable A032 = C018208n.A03(C13690nt.A0C(getContext(), R.drawable.balloon_incoming_frame).mutate());
        C018208n.A0A(A032, AnonymousClass00T.A00(getContext(), R.color.color003d));
        webPagePreviewView.setForeground(A032);
        this.A02.A07(new IDxObserverShape116S0100000_2_I1(this, 87));
        View A003 = AnonymousClass0LL.A00(this, R.id.design_bottom_sheet);
        BottomSheetBehavior A004 = BottomSheetBehavior.A00(A003);
        A004.A0M(3);
        A004.A0N = true;
        A004.A0L(A003.getHeight());
        this.A07.A00(3, this.A0B.getRawString(), true);
    }
}
