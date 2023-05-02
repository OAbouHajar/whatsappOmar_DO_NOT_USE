package X;

import android.app.job.JobParameters;
import android.net.Uri;

/* renamed from: X.0Sx  reason: invalid class name and case insensitive filesystem */
public class C05760Sx {
    public static Uri[] A00(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    public static String[] A01(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }
}
