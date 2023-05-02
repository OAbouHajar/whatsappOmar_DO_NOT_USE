package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.location.WaMapView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;

/* renamed from: X.2kL  reason: invalid class name and case insensitive filesystem */
public class C55772kL extends FrameLayout implements AnonymousClass006 {
    public View A00;
    public FrameLayout A01;
    public ThumbnailButton A02;
    public AnonymousClass2Ao A03;
    public C52662eE A04;
    public boolean A05;
    public final C16040sK A06;
    public final C17160ud A07;
    public final C16440t3 A08;
    public final C216114t A09;
    public final C19430yQ A0A;
    public final AnonymousClass1P7 A0B;
    public final WaMapView A0C;

    public C55772kL(Context context, C16040sK r3, C17160ud r4, AnonymousClass2Ao r5, C16440t3 r6, C216114t r7, C19430yQ r8, AnonymousClass1P7 r9) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A08 = r6;
        this.A06 = r3;
        this.A0B = r9;
        this.A07 = r4;
        this.A03 = r5;
        this.A0A = r8;
        this.A09 = r7;
        FrameLayout.inflate(context, R.layout.layout052f, this);
        this.A0C = (WaMapView) C004601z.A0E(this, R.id.search_map_preview_map);
        this.A00 = C004601z.A0E(this, R.id.search_map_preview_thumb_button);
        this.A01 = (FrameLayout) C004601z.A0E(this, R.id.search_map_preview_avatar_container);
        this.A02 = (ThumbnailButton) C004601z.A0E(this, R.id.search_map_preview_contact_thumbnail);
    }

    private void setMessage(C38751rM r6) {
        this.A01.setVisibility(8);
        this.A0C.A03(this.A0B, r6);
        if (r6.A01 != 0.0d || r6.A00 != 0.0d) {
            View view = this.A00;
            view.setOnClickListener(new ViewOnClickCListenerShape0S0200000_I0(r6, 24, this));
            view.setContentDescription(getContext().getString(R.string.str0c92));
        }
    }

    private void setMessage(C38841rV r8) {
        C16010sH A012;
        this.A01.setVisibility(0);
        C19430yQ r1 = this.A0A;
        boolean z2 = r8.A11.A02;
        boolean A022 = AnonymousClass3BR.A02(this.A08, r8, z2 ? r1.A05(r8) : r1.A04(r8));
        WaMapView waMapView = this.A0C;
        AnonymousClass1P7 r12 = this.A0B;
        waMapView.A02(r12, r8, A022);
        Context context = getContext();
        C16040sK r5 = this.A06;
        View.OnClickListener A002 = AnonymousClass3BR.A00(context, r5, r12, r8, A022);
        View view = this.A00;
        view.setOnClickListener(A002);
        view.setContentDescription(getContext().getString(R.string.str05d2));
        ThumbnailButton thumbnailButton = this.A02;
        C17160ud r3 = this.A07;
        AnonymousClass2Ao r2 = this.A03;
        C216114t r13 = this.A09;
        if (z2) {
            r5.A0B();
            A012 = r5.A01;
            AnonymousClass00B.A06(A012);
        } else {
            UserJid A0C2 = r8.A0C();
            if (A0C2 != null) {
                A012 = r13.A01(A0C2);
            } else {
                r3.A05(thumbnailButton, R.drawable.avatar_contact);
                return;
            }
        }
        r2.A06(thumbnailButton, A012);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A04;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void setMessage(C30901d9 r3) {
        this.A0C.setVisibility(0);
        if (r3 instanceof C38751rM) {
            setMessage((C38751rM) r3);
        } else {
            setMessage((C38841rV) r3);
        }
    }
}
