package io.openshift.booster.IstioCustomResources;


import io.fabric8.kubernetes.api.model.v4_0.KubernetesResource;

public class DestinationRuleSpec implements KubernetesResource {
    private String foo;
    private String bar;

    @Override
    public String toString() {
        return "DummySpec{" +
                "foo='" + foo + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
}
