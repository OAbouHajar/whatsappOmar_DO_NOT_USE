package X;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4dv  reason: invalid class name and case insensitive filesystem */
public class C90304dv {
    public static final AnonymousClass3BJ A00 = new C65243Tw();

    public static AnonymousClass3AI A00(Context context, AnonymousClass5TP r10, int i2, int i3) {
        C89644cb.A01("Reducer.reduceTree");
        ArrayList A0u = AnonymousClass000.A0u();
        RenderTreeNode A01 = A01(new Rect(0, 0, r10.getWidth(), r10.getHeight()), r10, (RenderTreeNode) null, A00);
        A0u.add(A01);
        A02(context, r10, A01, A0u, 0, 0);
        C89644cb.A00();
        return new AnonymousClass3AI(A01, (RenderTreeNode[]) A0u.toArray(new RenderTreeNode[A0u.size()]), i2, i3);
    }

    public static RenderTreeNode A01(Rect rect, AnonymousClass5TP r7, RenderTreeNode renderTreeNode, AnonymousClass3BJ r9) {
        List list;
        int AEC = r7.AEC();
        return new RenderTreeNode(rect, (AEC == 0 && r7.AEE() == 0 && r7.AED() == 0 && r7.AEB() == 0) ? null : new Rect(AEC, r7.AEE(), r7.AED(), r7.AEB()), renderTreeNode, r9, r7.AD4(), (renderTreeNode == null || (list = renderTreeNode.A00) == null) ? 0 : list.size());
    }

    public static void A02(Context context, AnonymousClass5TP r9, RenderTreeNode renderTreeNode, ArrayList arrayList, int i2, int i3) {
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (r9 != null) {
            int width = r9.getWidth();
            if (width != 0 || r9.getHeight() != 0) {
                Rect rect = new Rect(i2, i3, width + i2, r9.getHeight() + i3);
                ArrayList arrayList2 = arrayList;
                arrayList.size();
                AnonymousClass3BJ AFR = r9.AFR();
                if (AFR != null) {
                    int AAd = r9.AAd();
                    RenderTreeNode A01 = A01(rect, r9, renderTreeNode, AFR);
                    arrayList.add(A01);
                    List list = renderTreeNode.A00;
                    if (AAd > 0) {
                        if (list == null) {
                            list = C13690nt.A0i(4);
                            renderTreeNode.A00 = list;
                        }
                        list.add(A01);
                        renderTreeNode2 = A01;
                    } else {
                        if (list == null) {
                            list = C13690nt.A0i(4);
                            renderTreeNode.A00 = list;
                        }
                        list.add(A01);
                    }
                    i2 = 0;
                    i3 = 0;
                }
                for (int i4 = 0; i4 < r9.AAd(); i4++) {
                    A02(context, r9.AAY(i4), renderTreeNode2, arrayList2, r9.AHD(i4) + i2, r9.AHE(i4) + i3);
                }
            }
        }
    }
}
