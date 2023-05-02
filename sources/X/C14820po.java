package X;

import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.CameraHomeFragment;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

/* renamed from: X.0po  reason: invalid class name and case insensitive filesystem */
public class C14820po extends AnonymousClass011 implements C14830pp {
    public final int A00;
    public final C14840pq[] A01;
    public final /* synthetic */ HomeActivity A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14820po(AnonymousClass02C r2, HomeActivity homeActivity) {
        super(r2, 0);
        this.A02 = homeActivity;
        int size = HomeActivity.A2E.size();
        this.A00 = size;
        this.A01 = new C14840pq[size];
    }

    public int A01() {
        return this.A00;
    }

    public CharSequence A04(int i2) {
        HomeActivity homeActivity = this.A02;
        int A36 = homeActivity.A36(i2);
        if (A36 == 100) {
            return "";
        }
        int i3 = R.string.str0447;
        if (A36 != 200) {
            i3 = yo.getFragmentTabTitle(R.string.str1691);
            if (A36 != 300) {
                i3 = yo.getFragmentTabTitle(R.string.str037e);
                if (A36 != 400) {
                    i3 = yo.getFragmentTabTitle(4);
                    if (4 == i3) {
                        return "";
                    }
                    if (4 != 4) {
                        if (4 == 600 || 4 == 700) {
                            return "";
                        }
                        if (4 == 800) {
                            i3 = R.string.str1977;
                        } else {
                            StringBuilder sb = new StringBuilder("The item position should be less or equal to:");
                            sb.append(this.A00);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
            }
        }
        return homeActivity.getString(i3);
    }

    public Object A05(ViewGroup viewGroup, int i2) {
        AnonymousClass01A r3 = (AnonymousClass01A) super.A05(viewGroup, i2);
        HomeActivity homeActivity = this.A02;
        if (homeActivity.A36(i2) == 100) {
            homeActivity.A0N = (CameraHomeFragment) r3;
        }
        return r3;
    }

    public long A0F(int i2) {
        return (long) this.A02.A36(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass01A A0G(int r4) {
        /*
            r3 = this;
            com.obwhatsapp.HomeActivity r1 = r3.A02
            int r2 = r1.A36(r4)
            r0 = 100
            if (r2 == r0) goto L_0x00ad
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 == r0) goto L_0x00a7
            r0 = 300(0x12c, float:4.2E-43)
            if (r2 == r0) goto L_0x0072
            r0 = 400(0x190, float:5.6E-43)
            if (r2 == r0) goto L_0x0066
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 == r0) goto L_0x0052
            r0 = 600(0x258, float:8.41E-43)
            if (r2 == r0) goto L_0x003c
            r0 = 700(0x2bc, float:9.81E-43)
            if (r2 == r0) goto L_0x007e
            r0 = 800(0x320, float:1.121E-42)
            if (r2 == r0) goto L_0x007e
            java.lang.String r0 = "The item position should be less or equal to:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r3.A00
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x003c:
            X.0ul r0 = r1.A1F
            boolean r0 = r0.A0c()
            if (r0 == 0) goto L_0x004a
            com.obwhatsapp.community.CommunityFragment r0 = new com.obwhatsapp.community.CommunityFragment
            r0.<init>()
            return r0
        L_0x004a:
            java.lang.String r1 = "Invalid tab id: 600"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0052:
            boolean r1 = com.obwhatsapp.yo.yo.isGrpSeparateEnabled()
            if (r1 == 0) goto L_0x005e
            com.obwhatsapp.calling.callhistory.CallsHistoryFragment r0 = new com.obwhatsapp.calling.callhistory.CallsHistoryFragment
            r0.<init>()
            return r0
        L_0x005e:
            java.lang.String r1 = "Invalid tab id: 500"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0066:
            boolean r0 = com.obwhatsapp.yo.yo.isGrpSeparateEnabled()
            if (r0 == 0) goto L_0x0072
            com.obwhatsapp.status.StatusesFragment r0 = new com.obwhatsapp.status.StatusesFragment
            r0.<init>()
            return r0
        L_0x0072:
            boolean r0 = com.obwhatsapp.yo.yo.isGrpSeparateEnabled()
            if (r0 == 0) goto L_0x007e
            com.obwhatsapp.conversationslist.GpConversationsFragment r0 = new com.obwhatsapp.conversationslist.GpConversationsFragment
            r0.<init>()
            return r0
        L_0x007e:
            java.util.Map r1 = r1.A1q
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            X.01J r0 = (X.AnonymousClass01J) r0
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r0.get()
            X.01A r0 = (X.AnonymousClass01A) r0
            return r0
        L_0x0093:
            java.lang.String r1 = "No HomeFragment mapping for tab id: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = new com.obwhatsapp.conversationslist.ConversationsFragment
            r0.<init>()
            return r0
        L_0x00ad:
            com.obwhatsapp.CameraHomeFragment r0 = new com.obwhatsapp.CameraHomeFragment
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14820po.A0G(int):X.01A");
    }

    public final C14840pq A0H(int i2) {
        ImageView imageView;
        int i3;
        C14840pq[] r7 = this.A01;
        if (r7[i2] == null) {
            C14840pq r6 = new C14840pq();
            HomeActivity homeActivity = this.A02;
            View inflate = homeActivity.getLayoutInflater().inflate(R.layout.layout02f4, (ViewGroup) null, false);
            r6.A01 = inflate;
            r6.A05 = (TextView) C004601z.A0E(inflate, R.id.tab);
            r6.A04 = (TextView) C004601z.A0E(r6.A01, R.id.badge);
            r6.A03 = (ImageView) C004601z.A0E(r6.A01, R.id.icon);
            r6.A02 = (ViewGroup) C004601z.A0E(r6.A01, R.id.tab_container);
            r6.A05.setText(A04(i2));
            r6.A05.setContentDescription(A04(i2));
            C14710pd r3 = homeActivity.A0C;
            if (r3 != null && r3.A0E(C16620tM.A02, 1963)) {
                r6.A05.setTextAppearance(homeActivity, R.style.style0277);
            }
            if (i2 != HomeActivity.A02(homeActivity.A01, 400)) {
                C018808t.A00(AnonymousClass00T.A03(homeActivity, R.color.color06e1), r6.A03);
            }
            if (i2 == HomeActivity.A02(homeActivity.A01, 100)) {
                r6.A03.setVisibility(0);
                r6.A03.setImageDrawable(others.statuscamera(AnonymousClass00T.A04(homeActivity, R.drawable.ic_home_camera)).mutate());
                imageView = r6.A03;
                i3 = R.string.str0386;
            } else {
                if (i2 == HomeActivity.A02(homeActivity.A01, 300)) {
                    r6.A03.setImageDrawable(others.statuscamera(AnonymousClass00T.A04(homeActivity, R.drawable.new_status_indicator)).mutate());
                    C45902Bo.A08(r6.A03, homeActivity.A01, homeActivity.getResources().getDimensionPixelSize(R.dimen.dimen07cc), 0);
                } else if (i2 == HomeActivity.A02(homeActivity.A01, 400)) {
                    C45902Bo.A08(r6.A03, homeActivity.A01, homeActivity.getResources().getDimensionPixelSize(R.dimen.dimen07ca), 0);
                    if (Build.VERSION.SDK_INT > 21) {
                        C016907z A04 = C016907z.A04(homeActivity, R.drawable.ic_calls_tab_joinable_badge_flash);
                        homeActivity.A0L = A04;
                        r6.A03.setImageDrawable(A04);
                    } else {
                        r6.A03.setImageResource(R.drawable.vec_ic_calls_tab_joinable_badge);
                    }
                } else if (homeActivity.A1F.A0c() && i2 == HomeActivity.A02(homeActivity.A01, 600)) {
                    AnonymousClass07V A012 = AnonymousClass07V.A01((Resources.Theme) null, homeActivity.getResources(), R.drawable.vec_ic_community_tab);
                    C45902Bo.A08(r6.A03, homeActivity.A01, 0, 0);
                    C55352jN.A02(r6.A02, homeActivity.getResources().getDimensionPixelSize(R.dimen.dimen07cd), homeActivity.getResources().getDimensionPixelSize(R.dimen.dimen07cb));
                    r6.A05.setVisibility(8);
                    r6.A03.setVisibility(0);
                    r6.A03.setImageDrawable(A012);
                    imageView = r6.A03;
                    i3 = R.string.str04e6;
                }
                r7[i2] = r6;
            }
            imageView.setContentDescription(homeActivity.getString(i3));
            r7[i2] = r6;
        }
        return r7[i2];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r2.A36(r5) == 700) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View AEF(int r5) {
        /*
            r4 = this;
            com.obwhatsapp.HomeActivity r2 = r4.A02
            com.obwhatsapp.PagerSlidingTabStrip r3 = r2.A0S
            int r1 = r2.A36(r5)
            r0 = 100
            if (r1 == r0) goto L_0x0025
            int r1 = r2.A36(r5)
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x0025
            int r1 = r2.A36(r5)
            r0 = 600(0x258, float:8.41E-43)
            if (r1 == r0) goto L_0x0025
            int r2 = r2.A36(r5)
            r1 = 700(0x2bc, float:9.81E-43)
            r0 = 1
            if (r2 != r1) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r3.setShouldExpand(r0)
            X.0pq r0 = r4.A0H(r5)
            android.view.View r0 = r0.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14820po.AEF(int):android.view.View");
    }
}
