package X;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.05e  reason: invalid class name and case insensitive filesystem */
public class C010905e extends Fragment {
    public static void A00(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C06650Xc.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C010905e(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static void A01(Activity activity, C011405n r2) {
        if (activity instanceof C001300o) {
            C009704q lifecycle = ((C001300o) activity).getLifecycle();
            if (lifecycle instanceof C009604p) {
                ((C009604p) lifecycle).A04(r2);
            }
        }
    }

    public final void A02(C011405n r3) {
        if (Build.VERSION.SDK_INT < 29) {
            A01(getActivity(), r3);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        A02(C011405n.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        A02(C011405n.ON_DESTROY);
    }

    public void onPause() {
        super.onPause();
        A02(C011405n.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        A02(C011405n.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        A02(C011405n.ON_START);
    }

    public void onStop() {
        super.onStop();
        A02(C011405n.ON_STOP);
    }
}
