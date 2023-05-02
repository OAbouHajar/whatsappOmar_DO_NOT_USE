package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: X.0XM  reason: invalid class name */
public final class AnonymousClass0XM {
    public static final AnonymousClass0RD A00(SplitInfo splitInfo) {
        boolean z2;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        C18450wi.A0B(primaryActivityStack);
        boolean z3 = false;
        try {
            z2 = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z2 = false;
        }
        List activities = primaryActivityStack.getActivities();
        C18450wi.A0B(activities);
        AnonymousClass0R3 r3 = new AnonymousClass0R3(activities, z2);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        C18450wi.A0B(secondaryActivityStack);
        try {
            z3 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        C18450wi.A0B(activities2);
        return new AnonymousClass0RD(r3, new AnonymousClass0R3(activities2, z3), splitInfo.getSplitRatio());
    }

    public static final Predicate A01(AnonymousClass038 r1) {
        C18450wi.A0H(r1, 0);
        return new C10960hy(r1);
    }

    public static final Predicate A02(Set set) {
        C18450wi.A0H(set, 0);
        return new C10970hz(set);
    }

    public static final Predicate A03(Set set) {
        C18450wi.A0H(set, 0);
        return new C10980i0(set);
    }

    public static final boolean A04(Activity activity, Set set) {
        ComponentName component;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C18450wi.A0C(activity);
                AnonymousClass0W3 r2 = AnonymousClass0W3.A00;
                ComponentName componentName = ((AnonymousClass03D) it.next()).A00;
                if (r2.A01(activity.getComponentName(), componentName)) {
                    return true;
                }
                Intent intent = activity.getIntent();
                if (intent != null && (component = intent.getComponent()) != null && r2.A01(component, componentName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A05(Intent intent, Set set) {
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C18450wi.A0C(intent);
                if (AnonymousClass0W3.A00.A01(intent.getComponent(), ((AnonymousClass03D) it.next()).A00)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A06(Pair pair, Set set) {
        C18450wi.A0C(pair);
        Activity activity = (Activity) pair.first;
        Intent intent = (Intent) pair.second;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((AnonymousClass036) it.next()).A01(activity, intent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A07(Pair pair, Set set) {
        C18450wi.A0C(pair);
        Activity activity = (Activity) pair.first;
        Activity activity2 = (Activity) pair.second;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((AnonymousClass036) it.next()).A00(activity, activity2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A08(WindowMetrics windowMetrics, AnonymousClass038 r1) {
        C18450wi.A0C(windowMetrics);
        return r1.A00(windowMetrics);
    }

    public final List A0A(List list) {
        ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A00((SplitInfo) it.next()));
        }
        return arrayList;
    }

    public final Set A0B(Set set) {
        SplitPairRule build;
        ArrayList arrayList = new ArrayList(AnonymousClass1J9.A0M(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass039 r1 = (AnonymousClass039) it.next();
            if (r1 instanceof AnonymousClass037) {
                Set set2 = ((AnonymousClass037) r1).A00;
                build = new SplitPairRule.Builder(A0D(set2), A0C(set2), A01((AnonymousClass038) r1)).setSplitRatio(0.4f).setLayoutDirection(3).setShouldFinishPrimaryWithSecondary(false).setShouldFinishSecondaryWithPrimary(true).setShouldClearTop(true).build();
                C18450wi.A0B(build);
            } else if (r1 instanceof AnonymousClass03E) {
                AnonymousClass03E r0 = (AnonymousClass03E) r1;
                Intent intent = r0.A00;
                Set set3 = r0.A01;
                build = new SplitPlaceholderRule.Builder(intent, A02(set3), A03(set3), A01((AnonymousClass038) r1)).setSplitRatio(0.4f).setLayoutDirection(3).build();
                C18450wi.A0B(build);
            } else if (r1 instanceof AnonymousClass03F) {
                Set set4 = ((AnonymousClass03F) r1).A00;
                build = new ActivityRule.Builder(A02(set4), A03(set4)).setShouldAlwaysExpand(true).build();
                C18450wi.A0B(build);
            } else {
                throw AnonymousClass000.A0T("Unsupported rule type");
            }
            arrayList.add(build);
        }
        return C003101j.A0F(arrayList);
    }

    public final Predicate A0C(Set set) {
        C18450wi.A0H(set, 0);
        return new C10990i1(this, set);
    }

    public final Predicate A0D(Set set) {
        C18450wi.A0H(set, 0);
        return new C11000i2(this, set);
    }
}
