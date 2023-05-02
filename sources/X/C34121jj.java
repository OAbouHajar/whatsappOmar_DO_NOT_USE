package X;

import com.whatsapp.util.Log;

/* renamed from: X.1jj  reason: invalid class name and case insensitive filesystem */
public class C34121jj {
    public final int A00;

    public C34121jj(int i2) {
        this.A00 = i2;
    }

    public String toString() {
        int i2 = this.A00;
        switch (i2) {
            case 0:
                return "failed";
            case 1:
                return "success-restored";
            case 2:
                return "success-created";
            case 3:
                return "failed-jid-mismatch";
            case 4:
                return "failed-on-file-integrity-check";
            case 5:
                return "failed-out-of-space";
            case 6:
                return "failed-msgstore-already-exists";
            case 7:
                return "canceled";
            case 8:
                return "provider-server-prop-not-enabled";
            case 9:
                return "app-signature-mismatch";
            case 10:
                return "incorrect-caller-package-name";
            case 11:
                return "requester-app-version-incorrect";
            case 12:
                return "incorrect-file-mode";
            case 13:
                return "phone-number-mismatch";
            case 14:
                return "msgstore-db-does-not-exist";
            case 15:
                return "failed-to-get-backup-file";
            case 16:
                return "backup-failed-with-generic-error";
            case 17:
                return "backup-failed-out-of-space";
            case 18:
                return "backup-failed-invalid-backup";
            case 19:
                return "success-transfer-db-file";
            case 20:
                return "failed-decryption-key-missing";
            default:
                StringBuilder sb = new StringBuilder("unspecified initialization status: ");
                sb.append(i2);
                Log.w(sb.toString());
                return String.valueOf(i2);
        }
    }
}
