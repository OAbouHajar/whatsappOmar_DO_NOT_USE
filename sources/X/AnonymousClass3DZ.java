package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3DZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DZ implements AnonymousClass023 {
    public final /* synthetic */ CatalogCategoryTabsActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass3DZ(CatalogCategoryTabsActivity catalogCategoryTabsActivity, String str) {
        this.A00 = catalogCategoryTabsActivity;
        this.A01 = str;
    }

    public final void AOH(Object obj) {
        String str;
        CatalogCategoryTabsActivity catalogCategoryTabsActivity = this.A00;
        String str2 = this.A01;
        List list = (List) obj;
        C57172qO r4 = new C57172qO(catalogCategoryTabsActivity.AGM());
        C18450wi.A0C(list);
        r4.A00 = list;
        View A05 = AnonymousClass00T.A05(catalogCategoryTabsActivity, R.id.view_pager);
        C18450wi.A0B(A05);
        ViewPager viewPager = (ViewPager) A05;
        catalogCategoryTabsActivity.A04.getValue();
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (C18450wi.A0R(((AnonymousClass4WJ) it.next()).A01, str2)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        viewPager.setAdapter(r4);
        viewPager.setCurrentItem(i2);
        catalogCategoryTabsActivity.A00 = viewPager;
        TabLayout tabLayout = (TabLayout) AnonymousClass00T.A05(catalogCategoryTabsActivity, R.id.tabs);
        ViewPager viewPager2 = catalogCategoryTabsActivity.A00;
        if (viewPager2 == null) {
            throw C18450wi.A03("viewPager");
        }
        tabLayout.setupWithViewPager(viewPager2);
        tabLayout.A0D(new AnonymousClass3ES(tabLayout, catalogCategoryTabsActivity, list));
        Iterator it2 = C008203t.A03(0, tabLayout.A0c.size()).iterator();
        while (it2.hasNext()) {
            int A002 = ((C52222dL) it2).A00();
            View childAt = tabLayout.getChildAt(0);
            if (childAt != null) {
                View childAt2 = ((ViewGroup) childAt).getChildAt(A002);
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int dimensionPixelSize = C13680ns.A0D(tabLayout).getDimensionPixelSize(R.dimen.dimen0196);
                    int dimensionPixelSize2 = C13680ns.A0D(tabLayout).getDimensionPixelSize(R.dimen.dimen0197);
                    if (A002 == 0) {
                        int dimensionPixelSize3 = C13680ns.A0D(tabLayout).getDimensionPixelSize(R.dimen.dimen0198);
                        if (catalogCategoryTabsActivity.A01.A0T()) {
                            marginLayoutParams.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2);
                        } else {
                            marginLayoutParams.setMargins(dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                        }
                    } else {
                        marginLayoutParams.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                    }
                    childAt2.requestLayout();
                } else {
                    str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
                }
            } else {
                str = "null cannot be cast to non-null type android.view.ViewGroup";
            }
            throw AnonymousClass000.A0W(str);
        }
    }
}
