package net.aza.azamod.item;

import net.aza.azamod.AzaMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
   public static final DeferredRegister<Item> Items =
           DeferredRegister.create(ForgeRegistries.ITEMS, AzaMod.MOD_ID);

public static final RegistryObject<Item> Void_Crystal = Items.register("void_crystal");

    public static void register(IEventBus eventBus) {
        Items.register(eventBus);

    }
}