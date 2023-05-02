package X;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Ew  reason: invalid class name and case insensitive filesystem */
public class C02770Ew extends AnonymousClass0WS {
    public Object A02(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object A03(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public Object A04(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj3;
        if (transition == null) {
            transition = null;
        }
        if (transition2 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    public Object A05(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    public void A06(Rect rect, Object obj) {
        ((Transition) obj).setEpicenterCallback(new AnonymousClass0BX(rect, this));
    }

    public void A07(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    public void A08(View view, Object obj) {
        if (view != null) {
            Rect A0J = AnonymousClass000.A0J();
            AnonymousClass0WS.A00(view, A0J);
            ((Transition) obj).setEpicenterCallback(new AnonymousClass0BW(A0J, this));
        }
    }

    public void A09(View view, Object obj, ArrayList arrayList) {
        ((Transition) obj).addListener(new AnonymousClass0YR(view, this, arrayList));
    }

    public void A0A(View view, Object obj, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass0WS.A01(AnonymousClass000.A0N(arrayList, i2), targets);
        }
        targets.add(view);
        arrayList.add(view);
        A0E(transitionSet, arrayList);
    }

    public void A0B(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public void A0C(AnonymousClass024 r2, AnonymousClass01A r3, Object obj, Runnable runnable) {
        ((Transition) obj).addListener(new AnonymousClass0YQ(this, runnable));
    }

    public void A0D(Object obj, Object obj2, Object obj3, Object obj4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ((Transition) obj).addListener(new AnonymousClass0YS(this, obj2, obj4, arrayList, arrayList3));
    }

    public void A0E(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i2 = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i2 < transitionCount) {
                    A0E(transitionSet.getTransitionAt(i2), arrayList);
                    i2++;
                }
                return;
            }
            List<Integer> targetIds = transition.getTargetIds();
            if (targetIds == null || targetIds.isEmpty()) {
                List<String> targetNames = transition.getTargetNames();
                if (targetNames == null || targetNames.isEmpty()) {
                    List<Class> targetTypes = transition.getTargetTypes();
                    if (targetTypes == null || targetTypes.isEmpty()) {
                        List<View> targets = transition.getTargets();
                        if (targets == null || targets.isEmpty()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                transition.addTarget(AnonymousClass000.A0N(arrayList, i2));
                                i2++;
                            }
                        }
                    }
                }
            }
        }
    }

    public void A0F(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            A0H(transitionSet, arrayList, arrayList2);
        }
    }

    public boolean A0G(Object obj) {
        return obj instanceof Transition;
    }

    public void A0H(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                A0H(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        List<Integer> targetIds = transition.getTargetIds();
        if (targetIds == null || targetIds.isEmpty()) {
            List<String> targetNames = transition.getTargetNames();
            if (targetNames == null || targetNames.isEmpty()) {
                List<Class> targetTypes = transition.getTargetTypes();
                if ((targetTypes == null || targetTypes.isEmpty()) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        while (i2 < size) {
                            transition.addTarget(AnonymousClass000.A0N(arrayList2, i2));
                            i2++;
                        }
                    }
                    int size2 = arrayList.size();
                    while (true) {
                        size2--;
                        if (size2 >= 0) {
                            transition.removeTarget(AnonymousClass000.A0N(arrayList, size2));
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
