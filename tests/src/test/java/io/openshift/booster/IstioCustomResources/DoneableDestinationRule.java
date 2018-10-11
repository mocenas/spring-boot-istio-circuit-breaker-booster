package io.openshift.booster.IstioCustomResources;

import io.fabric8.kubernetes.api.builder.v4_0.Function;
import io.fabric8.kubernetes.clnt.v4_0.CustomResourceDoneable;

public class DoneableDestinationRule extends CustomResourceDoneable<DestinationRule> {
    public DoneableDestinationRule(DestinationRule resource, Function<DestinationRule, DestinationRule> function) {
        super(resource, function);
    }
}
