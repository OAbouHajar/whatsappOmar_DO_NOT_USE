package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.app.NotificationCompat$MessagingStyle;
import androidx.core.graphics.drawable.IconCompat;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.1HH  reason: invalid class name */
public class AnonymousClass1HH {
    public final C16040sK A00;
    public final C17230uk A01;
    public final C16000sG A02;
    public final C16440t3 A03;
    public final C16980tz A04;
    public final C19380yL A05;
    public final C18910xS A06;
    public final C15810rt A07;
    public final C218415q A08;
    public final C16220sf A09;

    public AnonymousClass1HH(C16040sK r1, C17230uk r2, C16000sG r3, C16440t3 r4, C16980tz r5, C19380yL r6, C18910xS r7, C15810rt r8, C218415q r9, C16220sf r10) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = r8;
        this.A06 = r7;
        this.A02 = r3;
        this.A09 = r10;
        this.A08 = r9;
        this.A01 = r2;
        this.A05 = r6;
    }

    public void A00(C39291sE r18) {
        C39291sE r8 = r18;
        C30641ci r0 = r8.A04;
        if (r0 != null) {
            C15840rx A062 = this.A07.A06(C16030sJ.A00(r0.A01));
            if (A062 != null) {
                if (A062.A0e) {
                    this.A06.A04(A062.A05(), 3, false);
                }
                C16220sf r6 = this.A09;
                if (!r6.A07(A062.A05().getRawString()).A09()) {
                    Context context = this.A04.A00;
                    String A063 = A062.A06();
                    C218415q r2 = this.A08;
                    context.getApplicationContext();
                    CharSequence A0G = r2.A0G(r8);
                    C16050sL A022 = this.A01.A02((C16050sL) ((GroupJid) A062.A05()));
                    if (A022 != null) {
                        List list = r8.A01;
                        if (list.size() == 1) {
                            C16040sK r1 = this.A00;
                            if (r1.A0I((C15830rv) list.get(0)) && r1.A0I(r8.A0B())) {
                                return;
                            }
                        }
                        Intent A0M = C14750ph.A0M(context, A022);
                        C19380yL r16 = this.A05;
                        String A002 = C19380yL.A00(A022);
                        if (A002 != null) {
                            PendingIntent A003 = C42341xd.A00(context, 6, A0M, 134217728);
                            Bitmap A0C = r2.A0C(this.A02.A0A(A022));
                            AnonymousClass04L r12 = new AnonymousClass04L();
                            r12.A01 = A063;
                            IconCompat iconCompat = new IconCompat(1);
                            iconCompat.A06 = A0C;
                            r12.A00 = iconCompat;
                            AnonymousClass04K r15 = new AnonymousClass04K(r12);
                            NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(r15);
                            notificationCompat$MessagingStyle.A0A(new C009204j(r15, A0G, System.currentTimeMillis()));
                            notificationCompat$MessagingStyle.A01 = false;
                            AnonymousClass00B.A06(A022);
                            String rawString = A022.getRawString();
                            C007503l A004 = C218415q.A00(context);
                            A004.A0B(A063);
                            A004.A05(System.currentTimeMillis());
                            A004.A02(3);
                            A004.A0D(true);
                            A004.A08(notificationCompat$MessagingStyle);
                            A004.A0L = rawString;
                            A004.A09 = A003;
                            A004.A07.icon = yo.getNIcon(R.drawable.notifybar);
                            A004.A06(A0C);
                            if (Build.VERSION.SDK_INT >= 26) {
                                String A0C2 = ((C41001v2) r6.A07(A022.getRawString())).A0C();
                                if (A0C2 != null) {
                                    A004.A0J = A0C2;
                                } else {
                                    return;
                                }
                            }
                            r16.A04(A004.A01(), A002, 49, true);
                        }
                    }
                }
            }
        }
    }
}
