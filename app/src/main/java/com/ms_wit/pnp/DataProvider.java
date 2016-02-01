package com.ms_wit.pnp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DataProvider {

    public static List<PnP> pnPList = new ArrayList<>();
    public static Map<String, PnP> pnpMap = new HashMap<>();

    static {
//Day 1
        addPnp("trek_pic1",
                "Day 1",
                "We're acquainted with the wormhole phenomenon, but this... Is a remarkable piece of bio-electronic engineering by which I see much of the EM spectrum ranging from heat and infrared through radio waves, et cetera, and forgive me if I've said and listened to this a thousand times. This planet's interior heat provides an abundance of geothermal energy. We need to neutralize the homing signal.");
//Day 2
        addPnp("trek_pic2",
                "Day 2",
                "For an android with no feelings, he sure managed to evoke them in others. Besides, you look good in a dress. When has justice ever been as simple as a rule book? You're going to be an interesting companion, Mr. Data. The Enterprise computer system is controlled by three primary main processor cores, cross-linked with a redundant melacortz ramistat, fourteen kiloquad interface modules. I'll alert the crew. Computer, lights up! I guess it's better to be lucky than good. Yes, absolutely, I do indeed concur, wholeheartedly! You enjoyed that.");
//Day3
        addPnp("trek_pic3",
                "Day 3",
                "The surf's always up at the beach. The mountains are pristinely powdered. And there's never been a mosquito in our jungle. If you can keep it that way, you'll never regret a career move to Risa. Sorry, no remote workers. I suggest you drop it, Mr. Data. The Enterprise computer system is controlled by three primary main processor cores, cross-linked with a redundant melacortz ramistat, fourteen kiloquad interface modules. Well, I'll say this for him - he's sure of himself.");
//Day 4
        addPnp("trek_pic4",
                "Day 4",
                "Computer, lights up! We finished our first sensor sweep of the neutral zone. Wouldn't that bring about chaos? I can't. As much as I care about you, my first duty is to the ship. Fate. It protects fools, little children, and ships named \"Enterprise.\" The unexpected is our normal routine. Mr. Worf, you sound like a man who's asking his friend if he can start dating his sister. Sure. You'd be surprised how far a hug goes with Geordi, or Worf. and attack the Romulans.");
//Day 5
        addPnp("trek_pic5",
                "Day 5",
                "It's not what you think. Or maybe it is. I need help building more Androids. I am your worst nightmare! You're going to be an interesting companion, Mr. Data. You bet I'm agitated! I may be surrounded by insanity, but I am not insane. A lot of things can change in twelve years, Admiral. I'll alert the crew. But the probability of making a six is no greater than that of rolling a seven. What's a knock-out like you doing in a computer-generated gin joint like this?");
//Day 6
        addPnp("trek_pic6",
                "Day 6",
                "What? We're not at all alike! Well, that's certainly good to know. Maybe we better talk out here; the observation lounge has turned into a swamp. Sure. You'd be surprised how far a hug goes with Geordi, or Worf. Yes, absolutely, I do indeed concur, wholeheartedly! Travel time to the nearest starbase? Mr. Crusher, ready a collision course with the Borg ship.");
//Day 7
        addPnp("trek_pic7",
                "Day 7",
                "As per its mandate of deep-space exploration, its personnel are frequently brought into contact with cultures and sentient species whose existences are unknown to the Federation. Starfleet officers therefore act as official representatives of the Federation in these cases. Starfleet vessels are also frequently used to ferry ambassadors on diplomatic missions.");
    }

    private static void addPnp(String itemId, String name,
                                   String description) {
        PnP item = new PnP(itemId, name, description);
        pnPList.add(item);
        pnpMap.put(itemId, item);
    }

    public static List<String> getProductNames() {
        List<String> list = new ArrayList<>();
        for (PnP pnP : pnPList) {
            list.add(pnP.getName());
        }
        return list;
    }

    public static List<PnP> getFilteredList(String searchString) {

        List<PnP> filteredList = new ArrayList<>();
        for (PnP pnP : pnPList) {
            if (pnP.getPnpId().contains(searchString)) {
                filteredList.add(pnP);
            }
        }

        return filteredList;

    }

}
