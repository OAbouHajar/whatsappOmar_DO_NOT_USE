package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.obwhatsapp.mentions.MentionableEntry;
import com.whatsapp.jid.Jid;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.384  reason: invalid class name */
public class AnonymousClass384 {
    public static Intent A00(Activity activity, MentionableEntry mentionableEntry, C16740tZ r7, File file, List list) {
        Uri fromFile = Uri.fromFile(C13700nu.A0D(file.getAbsolutePath()));
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(fromFile);
        String A05 = C40651uT.A05(mentionableEntry.getStringText());
        AnonymousClass20I r1 = new AnonymousClass20I(fromFile);
        r1.A0D(A05);
        r1.A0E(C39501sa.A00(mentionableEntry.getMentions()));
        AnonymousClass29Q r3 = new AnonymousClass29Q(r1);
        AnonymousClass2KC r2 = new AnonymousClass2KC(activity);
        r2.A0E = A0u;
        r2.A02 = 9;
        r2.A0I = true;
        Bundle A0D = C13690nt.A0D();
        r3.A02(A0D);
        r2.A08 = A0D;
        if (list.size() == 1) {
            r2.A0A = C16030sJ.A03((Jid) C13690nt.A0Z(list));
        } else {
            r2.A0D = C16030sJ.A06(list);
        }
        if (r7 != null) {
            r2.A06 = r7.A13;
            r2.A0B = C16030sJ.A03(C38621r6.A0A(r7));
        }
        return r2.A00();
    }
}
