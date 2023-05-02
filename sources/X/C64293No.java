package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.catalogcategory.view.CategoryThumbnailLoader;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDxLambdaShape58S0000000_2_I1;

/* renamed from: X.3No  reason: invalid class name and case insensitive filesystem */
public final class C64293No extends BaseExpandableListAdapter {
    public List A00 = C440222l.A00;
    public Map A01 = AnonymousClass1Z8.A00;
    public final CategoryThumbnailLoader A02;

    public C64293No(CategoryThumbnailLoader categoryThumbnailLoader) {
        C18450wi.A0H(categoryThumbnailLoader, 1);
        this.A02 = categoryThumbnailLoader;
    }

    public static final View A00(View view, ViewGroup viewGroup, AnonymousClass22J r3, int i2) {
        if (view != null) {
            return view;
        }
        View A0H = C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, i2);
        C18450wi.A0B(A0H);
        A0H.setTag(r3.AIU(A0H));
        return A0H;
    }

    /* renamed from: A01 */
    public C82584Dj getChild(int i2, int i3) {
        C82584Dj r2 = (C82584Dj) this.A00.get(i2);
        if (r2 instanceof C73123nL) {
            Map map = this.A01;
            String str = ((C73123nL) r2).A00.A01;
            C18450wi.A0A(str);
            return (C82584Dj) ((List) C25411Jr.A00(map, str)).get(i3);
        }
        throw AnonymousClass000.A0V("Unhandled category parent type in getChild()");
    }

    public long getChildId(int i2, int i3) {
        return (long) ((i2 * 1000) + i3);
    }

    public int getChildType(int i2, int i3) {
        return getChild(i2, i3).A00;
    }

    public int getChildTypeCount() {
        return 5;
    }

    public View getChildView(int i2, int i3, boolean z2, View view, ViewGroup viewGroup) {
        View view2;
        Object obj;
        C18450wi.A0H(viewGroup, 4);
        C82584Dj A012 = getChild(i2, i3);
        if (A012 instanceof C73113nK) {
            view2 = A00(view, viewGroup, new AnonymousClass5FD(this), R.layout.layout0391);
            obj = view2.getTag();
            if (obj == null) {
                throw AnonymousClass000.A0W("null cannot be cast to non-null type com.obwhatsapp.catalogcategory.view.adapter.viewholder.CatalogCategoryViewHolder");
            }
        } else if (A012 instanceof C73083nH) {
            view2 = A00(view, viewGroup, new IDxLambdaShape58S0000000_2_I1(3), R.layout.layout0390);
            obj = view2.getTag();
            if (obj == null) {
                throw AnonymousClass000.A0W("null cannot be cast to non-null type com.obwhatsapp.catalogcategory.view.adapter.viewholder.CatalogCategoryViewHolder");
            }
        } else {
            throw AnonymousClass000.A0V("Unhandled group-child type in getChildView()");
        }
        ((C65043Sq) obj).A07(A012);
        return view2;
    }

    public int getChildrenCount(int i2) {
        C82584Dj r2 = (C82584Dj) this.A00.get(i2);
        if (!(r2 instanceof C73123nL)) {
            return 0;
        }
        Map map = this.A01;
        String str = ((C73123nL) r2).A00.A01;
        C18450wi.A0A(str);
        return ((List) C25411Jr.A00(map, str)).size();
    }

    public /* bridge */ /* synthetic */ Object getGroup(int i2) {
        return this.A00.get(i2);
    }

    public int getGroupCount() {
        return this.A00.size();
    }

    public long getGroupId(int i2) {
        return (long) i2;
    }

    public int getGroupType(int i2) {
        return ((C82584Dj) this.A00.get(i2)).A00;
    }

    public int getGroupTypeCount() {
        return 5;
    }

    public View getGroupView(int i2, boolean z2, View view, ViewGroup viewGroup) {
        View view2;
        Object obj;
        C18450wi.A0H(viewGroup, 3);
        C82584Dj r4 = (C82584Dj) this.A00.get(i2);
        if (r4 instanceof C73123nL) {
            View A002 = A00(view, viewGroup, new AnonymousClass5FE(this), R.layout.layout038f);
            Object tag = A002.getTag();
            if (tag != null) {
                C73193nS r0 = (C73193nS) tag;
                r0.A07(r4);
                ((ImageView) r0.A02.getValue()).setImageResource(z2 ? R.drawable.vec_ic_catalog_expand_less : R.drawable.vec_ic_catalog_expand_more);
                return A002;
            }
            throw AnonymousClass000.A0W("null cannot be cast to non-null type com.obwhatsapp.catalogcategory.view.adapter.viewholder.CategoryGroupExpandableItemViewHolder");
        }
        if (r4 instanceof C73113nK) {
            view2 = A00(view, viewGroup, new AnonymousClass5FF(this), R.layout.layout038e);
            obj = view2.getTag();
            if (obj == null) {
                throw AnonymousClass000.A0W("null cannot be cast to non-null type com.obwhatsapp.catalogcategory.view.adapter.viewholder.CatalogCategoryViewHolder");
            }
        } else if (r4 instanceof C73093nI) {
            view2 = A00(view, viewGroup, new IDxLambdaShape58S0000000_2_I1(4), R.layout.layout0395);
            obj = view2.getTag();
            if (obj == null) {
                throw AnonymousClass000.A0W("null cannot be cast to non-null type com.obwhatsapp.catalogcategory.view.adapter.viewholder.CatalogCategoryViewHolder");
            }
        } else {
            throw AnonymousClass000.A0V("Unhandled group type in getGroupView()");
        }
        ((C65043Sq) obj).A07(r4);
        return view2;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isChildSelectable(int i2, int i3) {
        return true;
    }
}
