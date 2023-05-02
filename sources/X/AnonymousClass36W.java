package X;

import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.IDxIResponseShape359S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S1100000_I0;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.36W  reason: invalid class name */
public class AnonymousClass36W extends C16690tT {
    public int A00;
    public C85534Ov A01;
    public final C16440t3 A02;
    public final C17240ul A03;
    public final C17780vd A04;
    public final C17190ug A05;
    public final String A06;
    public final WeakReference A07;

    public AnonymousClass36W(AcceptInviteLinkActivity acceptInviteLinkActivity, C16440t3 r3, C17240ul r4, C17780vd r5, C17190ug r6, String str) {
        super(acceptInviteLinkActivity, true);
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A07 = C13690nt.A0h(acceptInviteLinkActivity);
        this.A06 = str;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            this.A05.A07(32000);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                this.A04.A01(new IDxIResponseShape359S0100000_2_I1(this, 0), this.A06).get(32000, TimeUnit.MILLISECONDS);
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (elapsedRealtime2 < 500) {
                    SystemClock.sleep(500 - elapsedRealtime2);
                    return null;
                }
            } catch (Exception e2) {
                Log.w("acceptlink/failed/timeout", e2);
            }
        } catch (C34541kR unused) {
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        boolean z2;
        int i2;
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A07.get();
        if (acceptInviteLinkActivity != null) {
            String str = this.A06;
            C85534Ov r1 = this.A01;
            int i3 = this.A00;
            if (r1 != null) {
                C17240ul r0 = acceptInviteLinkActivity.A0F;
                int i4 = r1.A02;
                if (r0.A0d(i4)) {
                    View A052 = AnonymousClass00T.A05(acceptInviteLinkActivity, R.id.group_photo_container);
                    ThumbnailButton thumbnailButton = (ThumbnailButton) AnonymousClass00T.A05(acceptInviteLinkActivity, R.id.group_photo);
                    C218115n r10 = acceptInviteLinkActivity.A0D;
                    ColorDrawable colorDrawable = new ColorDrawable(AnonymousClass00X.A00(acceptInviteLinkActivity.getTheme(), acceptInviteLinkActivity.getResources(), R.color.color065f));
                    C49752Vp r6 = C49752Vp.A00;
                    A052.setBackground(r10.A00.A0E(C16620tM.A02, 1257) ? new C49772Vr(colorDrawable, r6) : new C49782Vs(colorDrawable, r6));
                    thumbnailButton.A06 = r6;
                }
                C15810rt r02 = acceptInviteLinkActivity.A08;
                C16050sL r3 = r1.A05;
                if (r02.A0F(r3) && acceptInviteLinkActivity.A0A.A09(r3)) {
                    Log.i(AnonymousClass000.A0g("acceptlink/processcode/exists/", r3));
                    boolean A0d = acceptInviteLinkActivity.A0F.A0d(i4);
                    C14870pt r4 = acceptInviteLinkActivity.A05;
                    int i5 = R.string.str000b;
                    if (A0d) {
                        i5 = R.string.str000c;
                    }
                    z2 = true;
                    r4.A09(i5, 1);
                } else if (!acceptInviteLinkActivity.AIm()) {
                    Log.i(AnonymousClass000.A0g("acceptlink/processcode/showconfirmation/", r3));
                    z2 = false;
                } else {
                    Log.i(AnonymousClass000.A0g("acceptlink/processcode/activityended/", r3));
                    return;
                }
                acceptInviteLinkActivity.A0H.A01(r1, 0);
                C17190ug r03 = acceptInviteLinkActivity.A0J;
                C102534z6 r13 = new C102534z6(acceptInviteLinkActivity);
                String A022 = r03.A02();
                r03.A0A(new AnonymousClass3GX(r13, (GroupJid) null, (GroupJid) null, "image", (String) null), C810746s.A00((GroupJid) null, (GroupJid) null, A022, "blob", "image", (String) null, str), A022, 300, 32000);
                TextView A09 = C13700nu.A09(acceptInviteLinkActivity, R.id.invite_accept);
                if (z2) {
                    i2 = R.string.str0aa7;
                } else {
                    boolean A0d2 = acceptInviteLinkActivity.A0F.A0d(r1.A02);
                    i2 = R.string.str0bd6;
                    if (A0d2) {
                        i2 = R.string.str0bda;
                    }
                }
                A09.setText(i2);
                A09.setOnClickListener(new C62213Cj(acceptInviteLinkActivity, r1, str, z2));
                acceptInviteLinkActivity.A35();
                return;
            }
            Log.e(C13680ns.A0c(i3, "acceptlink/processcode/failed/"));
            int i6 = R.string.str0dc2;
            if (i3 != 0) {
                i6 = R.string.str08b8;
                if (i3 != 401) {
                    i6 = R.string.str08bc;
                    if (i3 != 404) {
                        i6 = R.string.str08ba;
                        if (i3 != 406) {
                            i6 = R.string.str08be;
                            if (i3 != 410) {
                                i6 = R.string.str08b5;
                                if (i3 != 419) {
                                    i6 = R.string.str13ad;
                                    if (i3 == 436) {
                                        acceptInviteLinkActivity.A36(R.string.str0bbe);
                                        acceptInviteLinkActivity.findViewById(R.id.learn_more).setVisibility(0);
                                        acceptInviteLinkActivity.findViewById(R.id.learn_more).setOnClickListener(new ViewOnClickCListenerShape0S1100000_I0(acceptInviteLinkActivity));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            acceptInviteLinkActivity.A36(i6);
        }
    }
}
