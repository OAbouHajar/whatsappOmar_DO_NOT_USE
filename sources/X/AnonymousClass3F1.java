package X;

import android.content.res.Resources;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.3F1  reason: invalid class name */
public class AnonymousClass3F1 implements AnonymousClass5TL {
    public C35611mD A00;
    public boolean A01;
    public final C17090uW A02;
    public final C25751Kz A03;
    public final AnonymousClass1K9 A04;
    public final AnonymousClass1KE A05;
    public final CatalogMediaCard A06;
    public final C25821Lg A07;
    public final C16490t9 A08;
    public final C228419m A09;

    public AnonymousClass3F1(C17090uW r1, C25751Kz r2, AnonymousClass1K9 r3, AnonymousClass1KE r4, CatalogMediaCard catalogMediaCard, C25821Lg r6, C16490t9 r7, C228419m r8) {
        this.A08 = r7;
        this.A02 = r1;
        this.A05 = r4;
        this.A04 = r3;
        this.A07 = r6;
        this.A06 = catalogMediaCard;
        this.A09 = r8;
        this.A03 = r2;
        r3.A02(this);
    }

    public void A4g() {
        if (!this.A01) {
            this.A06.A0I.A07((View.OnClickListener) null, 6);
            this.A01 = true;
        }
    }

    public void A69() {
        this.A04.A03(this);
    }

    public void A8x(UserJid userJid, int i2) {
        AnonymousClass1KE r3 = this.A05;
        if (r3.A05.A0J(userJid)) {
            r3.A04.A04(userJid);
        } else if (!r3.A00) {
            r3.A00 = true;
            r3.A06.A03(new C62783Ex(r3, userJid), new AnonymousClass26O(userJid, Boolean.TRUE, i2, i2));
        }
    }

    public int AFF(UserJid userJid) {
        return this.A05.A05.A00(userJid);
    }

    public C54312hC AGY(C35701mM r2, UserJid userJid, boolean z2) {
        return new AnonymousClass52O(r2, this);
    }

    public boolean AHU(UserJid userJid) {
        return this.A05.A05.A0H(userJid);
    }

    public void AIC(UserJid userJid) {
        CatalogMediaCard catalogMediaCard = this.A06;
        C448425v r3 = catalogMediaCard.A0I;
        r3.setSeeMoreClickListener(new AnonymousClass3H9(this));
        r3.setCatalogBrandingDrawable(AnonymousClass00X.A04((Resources.Theme) null, catalogMediaCard.getResources(), R.drawable.ic_shops_logo));
    }

    public void ARC(UserJid userJid) {
        List A082 = this.A05.A05.A08(userJid);
        if (A082 != null && !A082.isEmpty()) {
            this.A06.setupThumbnails(userJid, R.string.str030d, A082);
        }
    }

    public boolean AfH() {
        return !this.A03.A01(this.A00);
    }
}
