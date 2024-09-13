package net.Arcomp.MekaFacades.item;

import net.Arcomp.MekaFacades.MekaFacades;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Moditems {

    public static final DeferredRegister.Items ITEMS =DeferredRegister.createItems(MekaFacades.MOD_ID);

    public static final DeferredItem<Item> BOTAODUPLO = ITEMS.register("botaoduplo",() -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BOTAOSIMPLES = ITEMS.register("botaosimples",() -> new Item(new Item.Properties()));



    public static void  register (IEventBus eventBus) {

        ITEMS.register(eventBus);
    }





}
