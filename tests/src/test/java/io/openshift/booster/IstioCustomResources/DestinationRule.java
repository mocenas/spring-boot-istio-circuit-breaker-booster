package io.openshift.booster.IstioCustomResources;

import io.fabric8.kubernetes.clnt.v4_0.CustomResource;

public class DestinationRule extends CustomResource {
    private DestinationRuleSpec spec;


    @Override
    public String toString() {
        return "DestinationRule{" +
                "apiVersion='" + getApiVersion() + '\'' +
                ", metadata=" + getMetadata() +
                ", spec=" + spec +
                '}';
    }

    public DestinationRuleSpec getSpec() {
        return spec;
    }

    public void setSpec(DestinationRuleSpec spec) {
        this.spec = spec;
    }
}
