package X;

import com.obwhatsapp.webpagepreview.WebPagePreviewView;
import java.util.List;

/* renamed from: X.3I5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3I5 implements Runnable {
    public final /* synthetic */ C70653hS A00;
    public final /* synthetic */ AnonymousClass4NE A01;
    public final /* synthetic */ AnonymousClass4OT A02;
    public final /* synthetic */ C16740tZ A03;
    public final /* synthetic */ WebPagePreviewView A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ AnonymousClass3I5(C70653hS r1, AnonymousClass4NE r2, AnonymousClass4OT r3, C16740tZ r4, WebPagePreviewView webPagePreviewView, List list, boolean z2, boolean z3) {
        this.A01 = r2;
        this.A04 = webPagePreviewView;
        this.A00 = r1;
        this.A03 = r4;
        this.A06 = z2;
        this.A05 = list;
        this.A07 = z3;
        this.A02 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0090 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0090=Splitter:B:28:0x0090, B:23:0x0088=Splitter:B:23:0x0088} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            X.4NE r3 = r12.A01
            com.obwhatsapp.webpagepreview.WebPagePreviewView r8 = r12.A04
            X.3hS r6 = r12.A00
            X.0tZ r5 = r12.A03
            boolean r10 = r12.A06
            java.util.List r9 = r12.A05
            boolean r11 = r12.A07
            X.4OT r7 = r12.A02
            java.lang.Object r2 = r8.getTag()
            X.4TU r2 = (X.AnonymousClass4TU) r2
            X.3hS r4 = r2.A00     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            java.util.LinkedHashSet r0 = r4.A0P     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            if (r0 != 0) goto L_0x002e
            java.util.LinkedHashSet r0 = r4.A0P     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            java.lang.Object[] r1 = r0.toArray()     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            r0 = 0
            r0 = r1[r0]     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            r4.A0C(r0)     // Catch:{ IOException | URISyntaxException -> 0x0091 }
        L_0x002e:
            X.0tZ r4 = r2.A01     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            X.1uH r1 = r4.A0N     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            if (r1 == 0) goto L_0x003c
            byte[] r0 = r6.A0U     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            if (r0 != 0) goto L_0x003a
            byte[] r0 = r6.A0T     // Catch:{ IOException | URISyntaxException -> 0x0091 }
        L_0x003a:
            r1.A00 = r0     // Catch:{ IOException | URISyntaxException -> 0x0091 }
        L_0x003c:
            X.1Vw r0 = r4.A11     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            java.lang.String r1 = r0.A01     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            X.1Vw r0 = r5.A11     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            java.lang.String r0 = r0.A01     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            if (r0 == 0) goto L_0x0054
            X.0pt r0 = r3.A00     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            X.56F r5 = new X.56F     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            r0.A0K(r5)     // Catch:{ IOException | URISyntaxException -> 0x0091 }
        L_0x0054:
            byte[] r1 = r6.A0U     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            if (r1 != 0) goto L_0x005c
            byte[] r1 = r6.A0T     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            if (r1 == 0) goto L_0x0097
        L_0x005c:
            X.188 r0 = r3.A02     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            long r4 = r4.A13     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            X.0tq r0 = r0.A00     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            X.0tf r9 = r0.A02()     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x008c }
            r10.<init>()     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "full_thumbnail"
            r10.put(r0, r1)     // Catch:{ all -> 0x008c }
            X.0tg r8 = r9.A02     // Catch:{ all -> 0x008c }
            java.lang.String r7 = "message_external_ad_content"
            java.lang.String r6 = "message_row_id=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x008c }
            r0 = 0
            X.C13700nu.A0e(r1, r0, r4)     // Catch:{ all -> 0x008c }
            int r0 = r8.A00(r7, r10, r6, r1)     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = "ExternalAdContentInfoStore/updateFullThumbnail/full thumbnail wasn't updated"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x008c }
        L_0x0088:
            r9.close()     // Catch:{ IOException | URISyntaxException -> 0x0091 }
            goto L_0x0097
        L_0x008c:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0090 }
        L_0x0090:
            throw r0     // Catch:{ IOException | URISyntaxException -> 0x0091 }
        L_0x0091:
            r1 = move-exception
            java.lang.String r0 = "ConversationPageInfoLoader/load/failed to load thumb"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0097:
            java.util.Set r1 = r3.A04
            X.0tZ r0 = r2.A01
            X.1Vw r0 = r0.A11
            java.lang.String r0 = r0.A01
            r1.remove(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3I5.run():void");
    }
}
