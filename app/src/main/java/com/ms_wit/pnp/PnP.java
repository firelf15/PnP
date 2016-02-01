package com.ms_wit.pnp;

public class PnP {

    private String pnpId;
    private String name;
    private String description;

    public String getPnpId() {
        return pnpId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description + "\n";
    }

    public PnP(String pnpId, String name, String description) {
        this.pnpId = pnpId;
        this.name = name;
        this.description = description;
    }

}
