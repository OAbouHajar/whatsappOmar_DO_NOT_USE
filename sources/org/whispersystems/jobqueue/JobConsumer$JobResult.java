package org.whispersystems.jobqueue;

public enum JobConsumer$JobResult {
    SUCCESS,
    FAILURE,
    DEFERRED;

    /* access modifiers changed from: public */
    static {
        SUCCESS = new JobConsumer$JobResult("SUCCESS", 0);
        FAILURE = new JobConsumer$JobResult("FAILURE", 1);
        DEFERRED = new JobConsumer$JobResult("DEFERRED", 2);
    }
}
