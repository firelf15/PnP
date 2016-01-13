package com.ms_wit.pnp;

/**
 * Created by monika on 1/13/16.
 */
public class PnP {
    public Integer pnp_id;
    public String pnp_pic_filename;
    public String pnp_text_filename;

    public PnP(Integer pnp_id, String pnp_pic_filename, String pnp_text_filename) {
        this.pnp_id = pnp_id;
        this.pnp_pic_filename = pnp_pic_filename;
        this.pnp_text_filename = pnp_text_filename;
    }
}
