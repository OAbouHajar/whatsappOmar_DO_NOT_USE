package X;

import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.07o  reason: invalid class name and case insensitive filesystem */
public class C015807o {
    public static C015707n A00 = new AnonymousClass0GN();
    public static ThreadLocal A01 = new ThreadLocal();
    public static ArrayList A02 = new ArrayList();

    public static AnonymousClass00N A00() {
        AnonymousClass00N r1;
        ThreadLocal threadLocal = A01;
        Reference reference = (Reference) threadLocal.get();
        if (reference != null && (r1 = (AnonymousClass00N) reference.get()) != null) {
            return r1;
        }
        AnonymousClass00N r12 = new AnonymousClass00N();
        threadLocal.set(new WeakReference(r12));
        return r12;
    }

    public static void A01(ViewGroup viewGroup) {
        A02.remove(viewGroup);
        AbstractCollection abstractCollection = (AbstractCollection) A00().get(viewGroup);
        if (abstractCollection != null && !abstractCollection.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractCollection);
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C015707n) arrayList.get(size)).A0K(viewGroup);
                } else {
                    return;
                }
            }
        }
    }

    public static void A02(ViewGroup viewGroup, C015707n r4) {
        ArrayList arrayList = A02;
        if (!arrayList.contains(viewGroup) && C004601z.A0u(viewGroup)) {
            arrayList.add(viewGroup);
            if (r4 == null) {
                r4 = A00;
            }
            C015707n A03 = r4.clone();
            AbstractCollection abstractCollection = (AbstractCollection) A00().get(viewGroup);
            if (abstractCollection != null && abstractCollection.size() > 0) {
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    ((C015707n) it.next()).A0H(viewGroup);
                }
            }
            if (A03 != null) {
                A03.A0M(viewGroup, true);
            }
            viewGroup.getTag(R.id.transition_current_scene);
            viewGroup.setTag(R.id.transition_current_scene, (Object) null);
            if (A03 != null) {
                C06860Ye r1 = new C06860Ye(viewGroup, A03);
                viewGroup.addOnAttachStateChangeListener(r1);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(r1);
            }
        }
    }
}
