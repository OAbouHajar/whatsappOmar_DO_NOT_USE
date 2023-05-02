package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass02C;
import X.AnonymousClass1WE;
import X.AnonymousClass1XZ;
import X.AnonymousClass2B7;
import X.AnonymousClass2JC;
import X.AnonymousClass52T;
import X.AnonymousClass52U;
import X.C13680ns;
import X.C13700nu;
import X.C15830rv;
import X.C25721Kw;
import X.C30621cg;
import X.C79103zC;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;

public class IDxNConsumerShape151S0100000_1_I0 implements AnonymousClass1WE {
    public Object A00;
    public final int A01;

    public IDxNConsumerShape151S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void accept(Object obj) {
        List<ResolveInfo> queryIntentActivities;
        if (this.A01 != 0) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
            mediaViewFragment.A0I.A05();
            Intent A02 = C13700nu.A02("android.intent.action.VIEW");
            A02.setDataAndType((Uri) obj, "video/*");
            A02.setFlags(1);
            if (Build.MANUFACTURER.startsWith("Sony") && (queryIntentActivities = mediaViewFragment.A0D().getPackageManager().queryIntentActivities(A02, 0)) != null) {
                for (ResolveInfo next : queryIntentActivities) {
                    StringBuilder A0r = AnonymousClass000.A0r("mediaview/share");
                    ActivityInfo activityInfo = next.activityInfo;
                    A0r.append(activityInfo.packageName);
                    A0r.append(" | ");
                    Log.i(AnonymousClass000.A0h(activityInfo.name, A0r));
                    if (next.activityInfo.name.equals("com.sonyericsson.gallery.MovieView")) {
                        A02.setClassName("com.sonyericsson.gallery", "com.sonyericsson.gallery.MovieView");
                    }
                }
            }
            Context A022 = mediaViewFragment.A02();
            AnonymousClass2B7 r0 = mediaViewFragment.A1C;
            if (r0 != null) {
                r0.ATs();
            }
            mediaViewFragment.A0E.A06(A022, A02);
            return;
        }
        AnonymousClass2JC r2 = (AnonymousClass2JC) this.A00;
        ConversationsFragment conversationsFragment = r2.A0L;
        C15830rv A012 = ConversationsFragment.A01(conversationsFragment);
        conversationsFragment.A1p = A012;
        if (A012 != null) {
            C30621cg r22 = conversationsFragment.A17;
            r22.A0A.A08(A012, new AnonymousClass52U(conversationsFragment.A0H, r22, A012));
            return;
        }
        AnonymousClass02C r1 = conversationsFragment.A0H;
        if (r1 != null && conversationsFragment.A2Q.size() != 0) {
            AnonymousClass52T r5 = new AnonymousClass52T(r1, r2);
            C25721Kw r4 = conversationsFragment.A2K;
            C79103zC r12 = new C79103zC(r4.A03, (AnonymousClass1XZ) r5, (Set) conversationsFragment.A2Q);
            C13680ns.A1U(r12, r4.A08);
            r4.A00.A0L(new RunnableRunnableShape11S0200000_I0_9(r12, 18, r5), 500);
        }
    }
}
