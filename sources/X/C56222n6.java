package X;

import android.app.SharedElementCallback;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2n6  reason: invalid class name and case insensitive filesystem */
public class C56222n6 extends SharedElementCallback {
    public final List A00 = AnonymousClass000.A0u();
    public final /* synthetic */ C000900k A01;

    public C56222n6(C000900k r2) {
        this.A01 = r2;
    }

    public void onMapSharedElements(List list, Map map) {
        super.onMapSharedElements(list, map);
        C000900k r7 = this.A01;
        ArrayList A0u = AnonymousClass000.A0u();
        View A0J = C13690nt.A0J(r7);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            View view = (View) map.get(A0m);
            if (view == null) {
                view = C455529g.A06(A0J, A0m);
                if (view != null) {
                    map.put(A0m, view);
                }
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (parent != null) {
                    if (parent == A0J) {
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    C004601z.A0n(view, (String) null);
                    map.remove(A0m);
                    if (A0m.startsWith("thumb-transition-")) {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        ViewGroup viewGroup = (ViewGroup) r7.findViewById(R.id.conversation_layout);
                        if (viewGroup != null) {
                            View view2 = new View(r7);
                            viewGroup.addView(view2);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                            layoutParams.addRule(14);
                            layoutParams.topMargin = -height;
                            view2.setLayoutParams(layoutParams);
                            A0u.add(view2);
                            C004601z.A0n(view2, A0m);
                            map.put(A0m, view2);
                        }
                    }
                }
            }
        }
        this.A00.addAll(A0u);
    }

    public void onSharedElementEnd(List list, List list2, List list3) {
        super.onSharedElementEnd(list, list2, list3);
        this.A01.setExitSharedElementCallback((SharedElementCallback) null);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C004601z.A0n((View) it.next(), (String) null);
        }
    }

    public void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        super.onSharedElementsArrived(list, list2, onSharedElementsReadyListener);
        for (View view : this.A00) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }
}
