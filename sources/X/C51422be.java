package X;

import java.net.Socket;

/* renamed from: X.2be  reason: invalid class name and case insensitive filesystem */
public class C51422be {
    public final Socket A00;

    public C51422be(Socket socket) {
        this.A00 = socket;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|(1:3)|4|5|(1:7)|8|9|(2:11|12)(1:16)) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        com.whatsapp.util.Log.i("ConnectionSocketDefault/closeSocket ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e A[Catch:{ Exception -> 0x0022 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[Catch:{ Exception -> 0x0016 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r2 = this;
            java.net.Socket r1 = r2.A00     // Catch:{ Exception -> 0x000b }
            boolean r0 = r1.isOutputShutdown()     // Catch:{ Exception -> 0x000b }
            if (r0 != 0) goto L_0x000b
            r1.shutdownOutput()     // Catch:{ Exception -> 0x000b }
        L_0x000b:
            java.net.Socket r1 = r2.A00     // Catch:{ Exception -> 0x0016 }
            boolean r0 = r1.isInputShutdown()     // Catch:{ Exception -> 0x0016 }
            if (r0 != 0) goto L_0x0016
            r1.shutdownInput()     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            java.net.Socket r1 = r2.A00     // Catch:{ Exception -> 0x0022 }
            boolean r0 = r1.isClosed()     // Catch:{ Exception -> 0x0022 }
            if (r0 != 0) goto L_0x0028
            r1.close()     // Catch:{ Exception -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            java.lang.String r0 = "ConnectionSocketDefault/closeSocket "
            com.whatsapp.util.Log.i(r0, r1)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51422be.A00():void");
    }
}
