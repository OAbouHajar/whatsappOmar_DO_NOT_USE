package org.whispersystems.jobqueue;

import java.io.Serializable;
import java.util.List;

public class JobParameters implements Serializable {
    public final String groupId;
    public final boolean isPersistent;
    public final List requirements;
    public final int retryCount = 100;
    public final boolean wakeLock = false;
    public final long wakeLockTimeout = 0;

    public JobParameters(String str, List list, boolean z2) {
        this.requirements = list;
        this.isPersistent = z2;
        this.groupId = str;
    }
}
