package X;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.obwhatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity;
import com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.3ES  reason: invalid class name */
public final class AnonymousClass3ES implements AnonymousClass2Fa {
    public final /* synthetic */ TabLayout A00;
    public final /* synthetic */ CatalogCategoryTabsActivity A01;
    public final /* synthetic */ List A02;

    public AnonymousClass3ES(TabLayout tabLayout, CatalogCategoryTabsActivity catalogCategoryTabsActivity, List list) {
        this.A02 = list;
        this.A00 = tabLayout;
        this.A01 = catalogCategoryTabsActivity;
    }

    public void AYi(C47812Kr r1) {
    }

    public void AYj(C47812Kr r8) {
        List list = this.A02;
        TabLayout tabLayout = this.A00;
        CatalogCategoryTabsActivity catalogCategoryTabsActivity = this.A01;
        AnonymousClass4WJ r3 = (AnonymousClass4WJ) list.get(tabLayout.getSelectedTabPosition());
        ViewPager viewPager = catalogCategoryTabsActivity.A00;
        if (viewPager == null) {
            throw C18450wi.A03("viewPager");
        }
        viewPager.A0F(tabLayout.getSelectedTabPosition(), false);
        String str = r3.A01;
        UserJid userJid = r3.A00;
        boolean z2 = r3.A03;
        ((CatalogCategoryTabsViewModel) catalogCategoryTabsActivity.A04.getValue()).A01.A01(userJid, str, 1, 3, tabLayout.getSelectedTabPosition(), z2);
    }
}
