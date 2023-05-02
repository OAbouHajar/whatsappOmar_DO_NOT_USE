package X;

import com.obwhatsapp.biz.catalog.view.CatalogHeader;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape1S0300000_I1;

/* renamed from: X.3ke  reason: invalid class name and case insensitive filesystem */
public class C71573ke extends C65123Sy {
    public final CatalogHeader A00;

    public C71573ke(C19980zJ r3, C16040sK r4, CatalogHeader catalogHeader, UserJid userJid) {
        super(catalogHeader);
        this.A00 = catalogHeader;
        catalogHeader.setUp(userJid);
        if (!r4.A0I(userJid)) {
            catalogHeader.setOnTextClickListener(new ViewOnClickCListenerShape1S0300000_I1(this, r3, userJid, 2));
        }
    }
}
