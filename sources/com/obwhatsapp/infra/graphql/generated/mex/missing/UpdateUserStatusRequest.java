package com.obwhatsapp.infra.graphql.generated.mex.missing;

import X.C04700No;
import X.C08890eX;
import X.C12220k2;
import X.C12230k3;
import X.C13680ns;
import X.C13690nt;
import java.util.List;
import java.util.Map;

public final class UpdateUserStatusRequest implements C12230k3 {
    public final C08890eX A00;
    public final C12220k2 A01;

    public UpdateUserStatusRequest(C04700No r4, Class cls) {
        this.A00 = new C08890eX(r4, cls);
        this.A01 = new UpdateUserStatusRequestString("UpdateUserStatusQuery", getUserId(r4));
    }

    public C12230k3 enableFullConsistency() {
        throw C13680ns.A0m();
    }

    public Map getAdaptiveFetchClientParams() {
        throw C13680ns.A0m();
    }

    public Map getAdditionalHttpHeaders() {
        throw C13680ns.A0m();
    }

    public List getAnalyticTags() {
        throw C13680ns.A0m();
    }

    public String getCallName() {
        return "UpdateUserStatusQuery";
    }

    public String getClientTraceId() {
        throw C13680ns.A0m();
    }

    public boolean getEnableOfflineCaching() {
        throw C13680ns.A0m();
    }

    public boolean getEnsureCacheWrite() {
        throw C13680ns.A0m();
    }

    public long getFreshCacheAgeMs() {
        throw C13680ns.A0m();
    }

    public String getFriendlyName() {
        throw C13680ns.A0m();
    }

    public boolean getMarkHttpRequestAsReplaySafe() {
        throw C13680ns.A0m();
    }

    public long getMaxToleratedCacheAgeMs() {
        throw C13680ns.A0m();
    }

    public int getNetworkTimeoutSeconds() {
        throw C13680ns.A0m();
    }

    public boolean getOnlyCacheInitialNetworkResponse() {
        throw C13680ns.A0m();
    }

    public String getOverrideRequestURL() {
        throw C13680ns.A0m();
    }

    public boolean getParseOnClientExecutor() {
        throw C13680ns.A0m();
    }

    public C12220k2 getQuery() {
        return this.A01;
    }

    public C04700No getQueryParams() {
        return this.A00.A00;
    }

    public int getSubscriptionTargetId() {
        throw C13680ns.A0m();
    }

    public boolean getTerminateAfterFreshResponse() {
        throw C13680ns.A0m();
    }

    public Class getTreeModelType() {
        return this.A00.A01;
    }

    public final String getUserId(C04700No r3) {
        Object obj = r3.A00.getValuesCopy().get("users");
        if (!(obj instanceof List)) {
            return "";
        }
        List list = (List) obj;
        if (list.size() <= 0) {
            return "";
        }
        Object A0Z = C13690nt.A0Z(list);
        if (!(A0Z instanceof Map)) {
            return "";
        }
        Object obj2 = ((Map) A0Z).get("id");
        return obj2 instanceof String ? (String) obj2 : "";
    }

    public boolean isMutation() {
        throw C13680ns.A0m();
    }

    public C12230k3 setFreshCacheAgeMs(long j2) {
        throw C13680ns.A0m();
    }

    public C12230k3 setMaxToleratedCacheAgeMs(long j2) {
        throw C13680ns.A0m();
    }

    public boolean shouldSendCacheAgeForAdaptiveFetch() {
        throw C13680ns.A0m();
    }
}
