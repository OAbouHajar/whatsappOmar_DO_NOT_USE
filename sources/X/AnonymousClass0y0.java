package X;

import android.content.Context;
import android.text.format.Formatter;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0y0  reason: invalid class name */
public class AnonymousClass0y0 {
    public CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public void A00(int i2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C33581io r6 = (C33581io) it.next();
            if (i2 == 0) {
                Context context = r6.A00;
                String formatFileSize = Formatter.formatFileSize(context, r6.A02.A02());
                C33881jL.A00(context, r6.A01, context.getString(R.string.str0861, new Object[]{formatFileSize}));
            } else if (i2 == 1) {
                long A02 = r6.A02.A02();
                if (A02 < 10485760) {
                    Context context2 = r6.A00;
                    String formatFileSize2 = Formatter.formatFileSize(context2, A02);
                    StringBuilder sb = new StringBuilder();
                    sb.append("errorreporter/diskio/diskspace ");
                    sb.append(formatFileSize2);
                    Log.i(sb.toString());
                    if (formatFileSize2 != null) {
                        C19380yL r3 = r6.A01;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(context2.getString(R.string.str0851));
                        sb2.append(" ");
                        sb2.append(context2.getString(R.string.str0858, new Object[]{formatFileSize2}));
                        C33881jL.A00(context2, r3, sb2.toString());
                    }
                }
                Context context3 = r6.A00;
                C33881jL.A00(context3, r6.A01, context3.getString(R.string.str0851));
            } else if (i2 == 2) {
                Context context4 = r6.A00;
                C33881jL.A00(context4, r6.A01, context4.getString(R.string.str0d94));
            } else if (i2 != 3) {
                Context context5 = r6.A00;
                C33881jL.A00(context5, r6.A01, context5.getString(R.string.str0864));
            } else {
                Context context6 = r6.A00;
                C33881jL.A00(context6, r6.A01, context6.getString(R.string.str0863));
            }
        }
    }
}
